package com.wilosn.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/10   7:41
 * Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaOrder93 {
    public static void main(String[] args) {
        SpringApplication.run(AlibabaOrder93.class,args);
    }
}
