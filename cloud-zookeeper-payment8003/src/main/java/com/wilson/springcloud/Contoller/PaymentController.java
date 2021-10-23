package com.wilson.springcloud.Contoller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   13:55
 * Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    String port;
    @GetMapping("/zookeeper/get")
    public String getInfo(){
        return "zookeeper" + UUID.randomUUID().toString();
    }
}
