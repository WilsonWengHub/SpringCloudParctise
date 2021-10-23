package com.wilosn.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/10   7:40
 * Description:
 */
@RestController
public class ConsumeController {
    @Resource
    RestTemplate restTemplate;
    String URI = "cloud-nacos-payment-9001";
    @GetMapping("/consumer/payment/nacos/{id}")
    public String payment(@PathVariable("id") int id){
       return restTemplate.getForObject("http://"+URI + "/payment/nacos/"+id,String.class);
    }
}
