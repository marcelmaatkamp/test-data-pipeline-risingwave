package com.mycompany.ais;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;
import com.mycompany.ais.shared.generation.domain.ExcludeFromGeneratedCodeCoverage;

@SpringBootApplication
@ExcludeFromGeneratedCodeCoverage(reason = "Not testing logs")
public class JhipsterAiskafkaApplicationApp {

  private static final Logger log = LoggerFactory.getLogger(JhipsterAiskafkaApplicationApp.class);

  public static void main(String[] args) {
    Environment env = SpringApplication.run(JhipsterAiskafkaApplicationApp.class, args).getEnvironment();

    if (log.isInfoEnabled()) {
      log.info(ApplicationStartupTraces.of(env));
    }
  }
}
