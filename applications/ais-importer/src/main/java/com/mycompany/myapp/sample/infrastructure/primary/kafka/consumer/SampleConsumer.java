package com.mycompany.myapp.sample.infrastructure.primary.kafka.consumer;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.core.task.SimpleAsyncTaskExecutor;
import org.springframework.stereotype.Service;

@Service
public class SampleConsumer extends AbstractConsumer<String> {

  private static final Logger log = LoggerFactory.getLogger(SampleConsumer.class);

  public SampleConsumer(
    @Value("${kafka.topic.sample}") final String topicName,
    @Value("${kafka.polling.timeout}") final int pollingTimeout,
    final KafkaConsumer<String, String> kafkaConsumer
  ) {
    super(topicName, pollingTimeout, kafkaConsumer);
  }

  @PostConstruct
  public void init() {
    Runtime.getRuntime().addShutdownHook(new Thread(this::shutdown));
  }

  @PreDestroy
  public void destroy() {
    shutdown();
  }

  @Override
  protected boolean handleMessage(final ConsumerRecord<String, String> consumerRecord) {
    // /!\ Maybe you could delete the next log calls to avoid disclosing personal user information

    final String value = consumerRecord.value();

    if (value == null) {
      log.error("Null value in record {}", consumerRecord);
      return false;
    }

    log.info("Handling record: {}", value);
    // Here is where you can handle your records
    return true;
  }

  @Bean
  public void executeKafkaRunner() {
    new SimpleAsyncTaskExecutor().execute(this);
  }
}
