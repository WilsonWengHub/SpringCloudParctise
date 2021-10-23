package com.wilson.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   14:37
 * Description:
 */
@RestController
public class ZkOrderController {
    @Resource
    RestTemplate restTemplate;
    final String URL = "http://cloud-zookeeper-payment";
    @GetMapping("/consumer/zookeeper/get")
    public String getInfo(){
        return restTemplate.getForObject(URL + "/zookeeper/get",String.class);
    }
}
