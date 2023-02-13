package com.esgi.cleancode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Import({ApplicationConfiguration.class})
@SpringBootApplication(scanBasePackages = "com.esgi.cleancode")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}