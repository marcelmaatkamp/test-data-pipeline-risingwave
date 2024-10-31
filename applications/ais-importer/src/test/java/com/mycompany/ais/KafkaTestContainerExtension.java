package com.mycompany.ais;

import java.util.concurrent.atomic.AtomicBoolean;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.testcontainers.kafka.KafkaContainer;
import org.testcontainers.utility.DockerImageName;

public class KafkaTestContainerExtension implements BeforeAllCallback {

  private static final AtomicBoolean kafkaContainerStarted = new AtomicBoolean(false);
  private static KafkaContainer kafkaContainer;

  @Override
  public void beforeAll(final ExtensionContext context) {
    if (!kafkaContainerStarted.get()) {
      kafkaContainer = new KafkaContainer(DockerImageName.parse("apache/kafka-native:3.8.0")).withNetwork(null);
      kafkaContainer.start();
      kafkaContainerStarted.set(true);
      System.setProperty("kafka.bootstrap.servers", kafkaContainer.getBootstrapServers());
    }
  }
}
