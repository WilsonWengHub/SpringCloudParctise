package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.service.IMessageProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/4   17:46
 * Description:
 */
@EnableBinding(Source.class)
public class MessageProviderImpl implements IMessageProvider {
    @Resource
    private MessageChannel output;

    @Override
    public String send() {
        String serial = UUID.randomUUID().toString();

        output.send(MessageBuilder.withPayload(serial).build());
        System.out.println("*****" + serial);
        return null;
    }
}
