package com.wilson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/19   22:26
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class Payment9003 {
    public static void main(String[] args) {
        SpringApplication.run(Payment9003.class,args);
    }
}
