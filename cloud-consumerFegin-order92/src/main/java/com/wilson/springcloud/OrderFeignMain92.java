package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/10   22:46
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableFeignClients
@EnableHystrix//开启熔断
public class OrderFeignMain92 {
    public static void main(String[] args) {
        SpringApplication.run(OrderFeignMain92.class,args);
    }
}
