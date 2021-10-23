package com.wilson.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/5   18:52
 * Description:
 */
@Component
@EnableBinding(value = {Sink.class})
public class ReceiveMessageController {
    @Value("${server.port}")
    private String port;

    @StreamListener(Sink.INPUT)
    public void input(Message<String> message){
        System.out.println("消费者1号" + message.getPayload() + "port" + port);
    }
}
