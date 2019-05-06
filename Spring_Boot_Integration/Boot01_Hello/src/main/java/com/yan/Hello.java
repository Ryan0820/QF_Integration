package com.yan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Hello {

    @RequestMapping("/")
    public String hello(){
        return "Hello Word!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Hello.class,args);
    }
}
