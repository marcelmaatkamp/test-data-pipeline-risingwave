package com.mycompany.myapp.sample.infrastructure.primary.kafka.consumer;

import java.time.Duration;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.errors.WakeupException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractConsumer<T> implements Runnable {

  private static final Logger log = LoggerFactory.getLogger(AbstractConsumer.class);

  private final AtomicBoolean closed = new AtomicBoolean(false);

  private final KafkaConsumer<String, T> consumer;
  private final String topicName;
  private final int pollingTimeout;

  protected AbstractConsumer(final String topicName, final int pollingTimeout, final KafkaConsumer<String, T> consumer) {
    this.topicName = topicName;
    this.pollingTimeout = pollingTimeout;
    this.consumer = consumer;
  }

  @Override
  public void run() {
    try {
      consumer.subscribe(Collections.singleton(topicName));
      while (!closed.get()) {
        final ConsumerRecords<String, T> records = consumer.poll(Duration.ofMillis(pollingTimeout));
        records.forEach(this::handleMessage);
        consumer.commitSync();
      }
    } catch (final WakeupException e) {
      // Ignore exception if closing
      if (!closed.get()) {
        throw e;
      }
    } catch (final Exception e) {
      log.error("An error occurred while trying to poll records from topic!", e);
    } finally {
      consumer.close();
    }
  }

  // Shutdown hook which can be called from a separate thread
  public void shutdown() {
    closed.set(true);
    consumer.wakeup();
  }

  public boolean isClosed() {
    return closed.get();
  }

  public void setClosed(boolean closed) {
    this.closed.set(closed);
  }

  protected abstract boolean handleMessage(ConsumerRecord<String, T> consumerRecord);
}
