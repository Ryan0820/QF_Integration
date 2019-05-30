package com.yan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.util.concurrent.ListenableFuture;

import java.util.UUID;

@Controller

public class KafkaProducer {

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Scheduled(cron = "00/1 * * * * ?")//每隔一秒发送
    public void send() {

        String msg = UUID.randomUUID().toString();

        //发送消息
        ListenableFuture future = kafkaTemplate.send("test", msg);

        future.addCallback(o -> System.out.println("send-消息发送成功" + msg), throwable -> System.out.println("消息发送失败" + msg));


    }

}
