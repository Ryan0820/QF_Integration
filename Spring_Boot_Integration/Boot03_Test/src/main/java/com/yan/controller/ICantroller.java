package com.yan.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ICantroller {

    //private Logger logger = LoggerFactory.getLogger(this.getClass());
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(){
        logger.debug("debug");
        logger.info("info");
        logger.warn("warn");
        return "index12";
    }

    @RequestMapping("/{msg}")
    public String index(@PathVariable String msg){
        return "index"+"msg:  "+msg;
    }
}
