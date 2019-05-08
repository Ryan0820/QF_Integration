package com.yan.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.Charset;

@RestController
public class IController {
    //消息转换器
    @Bean
    public StringHttpMessageConverter stringHttpMessageConverter(){
        StringHttpMessageConverter stringHttpMessageConverter = new StringHttpMessageConverter(Charset.forName("utf-8"));
        return stringHttpMessageConverter;
    }



    @RequestMapping("/")
    public String hello() {
        return "Hello Word!你好";
    }

    @RequestMapping("/hello")
    public String hello1() {
        return "Hello Word!";
    }

}
