package com.mycompany.myapp.sample.infrastructure.primary.kafka.consumer;

import static org.assertj.core.api.Assertions.assertThat;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.mycompany.myapp.IntegrationTest;
import com.mycompany.myapp.sample.infrastructure.secondary.kafka.producer.SampleProducer;

@IntegrationTest
class SampleConsumerIT {

  @Autowired
  private SampleProducer sampleProducer;

  @Autowired
  private SampleConsumer sampleConsumer;

  @Test
  void shouldHandleMessage() {
    final String messageToSend = "sample";
    sampleProducer.send(messageToSend);

    ConsumerRecord<String, String> record = new ConsumerRecord<>("queue.kafkaapp.sample", 0, 0, null, messageToSend);
    boolean actualResult = sampleConsumer.handleMessage(record);

    assertThat(actualResult).isTrue();
  }
}
