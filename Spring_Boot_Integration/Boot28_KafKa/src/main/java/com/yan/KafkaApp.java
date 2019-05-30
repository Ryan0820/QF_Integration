package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class KafkaApp {
    public static void main(String[] args) {

        SpringApplication.run(KafkaApp.class);
    }
}
