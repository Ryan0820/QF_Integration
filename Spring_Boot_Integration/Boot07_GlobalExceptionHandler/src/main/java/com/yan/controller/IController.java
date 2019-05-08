package com.yan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IController {

    @RequestMapping("/")
    public String index(){

        int i=9/0;

        return "ok";
    }
}
