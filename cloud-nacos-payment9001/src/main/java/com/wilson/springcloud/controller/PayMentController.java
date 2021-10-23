package com.wilson.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/9   22:27
 * Description:
 */
@RestController
public class PayMentController {
    @Value("${server.port}")
    String port;
    @GetMapping("/payment/nacos/{id}")
    public String payment(@PathVariable("id") int id){
        return "nacos success" + port;
    }
}
