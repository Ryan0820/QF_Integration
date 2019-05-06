package com.yan;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableAutoConfiguration(exclude = {AopAutoConfiguration.class} )
@SpringBootApplication
public class Boot02_Hello_Auto {
    public static void main(String[] args) {
        SpringApplication.run(Boot02_Hello_Auto.class);
    }
}
