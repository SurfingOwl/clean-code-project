package com.esgi.cleancode.bootstrap.config;

import com.esgi.cleancode.bootstrap.config.domain.DomainConfiguration;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.vavr.jackson.datatype.VavrModule;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@Import({DomainConfiguration.class})
@EnableJpaRepositories("com.esgi.cleancode.server.mongo.repository")
@EntityScan("com.esgi.cleancode.server.mongo.entity")
public class ApplicationConfiguration {

  @Bean
  public ObjectMapper objectMapper() {
    return new ObjectMapper().registerModule(new VavrModule());
  }
  
}
