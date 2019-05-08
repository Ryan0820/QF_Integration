package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//允许任务调度
public class QuartZApp {
    public static void main(String[] args) {
        SpringApplication.run(QuartZApp.class);
    }
}
