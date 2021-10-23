package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   13:55
 * Description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class zookeeperMain7003 {
    public static void main(String[] args) {
        SpringApplication.run(zookeeperMain7003.class,args);
    }
}
