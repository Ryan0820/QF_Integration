package com.yan.controller;

import com.yan.domin.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class IController {

    @RequestMapping("/")
    public Object index(){
        Person person = new Person();
        person.setDate(new Date());
        person.setName("小米");
        return person;
    }
}
