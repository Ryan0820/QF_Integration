package com.yan.controller;

import com.yan.mq.Sender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MQController {

    @Autowired
    private Sender sender;

    @RequestMapping("/")
    @ResponseBody
    public String test(){
        sender.send();
        return "ok";
    }
}
