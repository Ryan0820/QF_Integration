package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.yan.controller"})
public class Boot03_Child1 {
    public static void main(String[] args) {
        SpringApplication.run(Boot03_Child1.class);
    }
}
