package com.yan.controller;

import com.yan.activemq.Producer;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Destination;

@RestController
public class TestController {

    @Autowired
    Producer producer;

    @RequestMapping("/activemq")
    public String test(){
        //点对点消息
        Destination des =new ActiveMQQueue("duilie");
        for (int i = 0; i < 6; i++) {
            producer.sendMessage(des,"hello ");
        }
        return "发送成功";
    }

}
