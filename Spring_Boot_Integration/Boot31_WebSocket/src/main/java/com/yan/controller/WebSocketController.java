package com.yan.controller;

import com.yan.pojo.SocketMessage;
import com.yan.pojo.SocketResponse;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class WebSocketController {

    private SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    //当里篮球向服务器发送StoMP请求时 通过@MessageMapping注解来映射get地址
    @MessageMapping(value = "/getServerTime")
    //当服务器有消息是，回对订阅了 SendTo中的路径的客户端发送消息
    @SendTo(value = "/topic/getResponse")
    public SocketResponse serverTime(SocketMessage message){
        return new SocketResponse(message.getMessage() + sf.format(new Date()));
    }

    @RequestMapping("/index")
    public String toPage(){
        return "webSocket";
    }

}
