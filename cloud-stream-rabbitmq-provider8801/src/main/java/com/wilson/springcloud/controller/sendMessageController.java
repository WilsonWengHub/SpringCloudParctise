package com.wilson.springcloud.controller;

import com.wilson.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.plugin2.message.Message;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/5   15:37
 * Description:
 */
@RestController
public class sendMessageController {
    @Resource
    IMessageProvider messageProvider;
    @GetMapping("/sendMessage")
    public String sendMessage(){
        return messageProvider.send();
    }
}
