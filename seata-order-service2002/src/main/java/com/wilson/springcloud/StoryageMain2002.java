package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   10:58
 * Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableDiscoveryClient
@EnableFeignClients
public class StoryageMain2002 {
    public static void main(String[] args) {
        SpringApplication.run(StoryageMain2002.class,args);
    }
}
