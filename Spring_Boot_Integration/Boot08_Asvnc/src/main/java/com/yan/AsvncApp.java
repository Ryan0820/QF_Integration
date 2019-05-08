package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync//开启异步执行
public class AsvncApp {
    public static void main(String[] args) {
        SpringApplication.run(AsvncApp.class);
    }
}
