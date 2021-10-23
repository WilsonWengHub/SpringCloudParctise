package com.wilson.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   14:30
 * Description:
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ZkOrderMain91 {
    public static void main(String[] args) {
        SpringApplication.run(ZkOrderMain91.class,args);
    }
}
