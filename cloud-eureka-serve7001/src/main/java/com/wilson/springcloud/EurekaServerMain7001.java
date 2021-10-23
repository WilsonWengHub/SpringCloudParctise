package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/3   21:58
 * Description:
 */

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaServer
public class EurekaServerMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerMain7001.class,args);
    }
}
