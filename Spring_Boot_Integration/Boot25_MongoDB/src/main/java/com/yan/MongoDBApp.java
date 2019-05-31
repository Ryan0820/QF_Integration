package com.yan;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class MongoDBApp {
    public static void main(String[] args) {
        SpringApplication.run(MongoDBApp.class);
    }

    @Autowired MongoTemplate mongo;

    @RequestMapping("/addUser")
    public String addUser(User user){

        mongo.save(user);
        return "success";
    }


}
