package com.wilson.springcloud;

import com.wilson.myrule.RibbonRules;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   17:35
 * Description:
 */


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
//@RibbonClient(configuration= {RibbonRules.class},name = "CLOUD-PAYMENT-SERVICE")//跟换轮询机制
public class OrderMain90 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain90.class,args);
    }
}
