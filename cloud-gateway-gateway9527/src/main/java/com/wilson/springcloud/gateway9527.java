package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/24   8:13
 * Description:
 */
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@EnableEurekaClient
public class gateway9527 {
    public static void main(String[] args) {
        SpringApplication.run(gateway9527.class,args);
    }
}
