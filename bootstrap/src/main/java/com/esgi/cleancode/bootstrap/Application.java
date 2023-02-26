package com.esgi.cleancode.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.esgi.cleancode.bootstrap.config.ApplicationConfiguration;

@Import({ApplicationConfiguration.class})
@EnableMongoRepositories(basePackages = "com.esgi.cleancode")
@SpringBootApplication(scanBasePackages = "com.esgi.cleancode")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}