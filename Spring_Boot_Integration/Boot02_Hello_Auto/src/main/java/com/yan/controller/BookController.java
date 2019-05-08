package com.yan.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@EnableAutoConfiguration
@RestController
@ConfigurationProperties(prefix = "book")
public class BookController {

    //@Value("${book.author}")
    private  String author;
    //@Value("${book.name}")
    private  String name;

    @RequestMapping("/book")
    public String bookInfo(){
        return "作者："+author+",  书名："+name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
