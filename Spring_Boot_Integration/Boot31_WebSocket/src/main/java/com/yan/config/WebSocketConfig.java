package com.yan.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
//开启websocket的支持
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer {

    //注册一个STOMP协议节点，并映射到指定的URL
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){
        //注册一个STOMP的endpoint，并指定使用SockJs协议
        registry.addEndpoint("/endpointSocket").withSockJS();
    }

    //配置消息代理
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        //配置一个广播 消息代理
        registry.enableSimpleBroker("/topic");
    }


}
