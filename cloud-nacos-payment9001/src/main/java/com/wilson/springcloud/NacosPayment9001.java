package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/9   22:33
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosPayment9001 {
    public static void main(String[] args) {
        SpringApplication.run(NacosPayment9001.class,args);
    }
}
