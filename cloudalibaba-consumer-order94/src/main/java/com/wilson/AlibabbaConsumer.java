package com.wilson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/20   6:33
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabbaConsumer {
    public static void main(String[] args) {
        SpringApplication.run(AlibabbaConsumer.class,args);
    }
}
