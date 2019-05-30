package com.yan.mq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Receiver {

    @RabbitHandler
    @RabbitListener(queues = "duilie")
    public void receive(String text) {
        System.out.println("收到消息：  " + text);
    }


}
