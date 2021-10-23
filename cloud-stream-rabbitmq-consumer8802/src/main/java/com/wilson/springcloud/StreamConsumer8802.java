package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/5   18:22
 * Description:
 */


@SpringBootApplication
@EnableEurekaClient
public class StreamConsumer8802 {
    public static void main(String[] args) {
        SpringApplication.run(StreamConsumer8802.class,args);
    }
}
