package com.mycompany.ais.sample.infrastructure.secondary.kafka.producer;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.concurrent.Future;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import com.mycompany.ais.IntegrationTest;

@IntegrationTest
class SampleProducerIT {

  @Autowired
  private SampleProducer sampleProducer;

  @Test
  void shouldSend() {
    final Future<RecordMetadata> sample = sampleProducer.send("sample");

    assertNotNull(sample);
  }
}
