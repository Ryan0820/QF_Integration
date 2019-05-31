package com.yan.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @JmsListener(destination = "duilie")
    public void receiveMsg(String text){
        System.out.println(text);
    }

}
