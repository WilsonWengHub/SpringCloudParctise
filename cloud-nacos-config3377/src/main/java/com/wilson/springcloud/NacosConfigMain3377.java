package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/11   7:18
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigMain3377 {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigMain3377.class,args);
    }
}
