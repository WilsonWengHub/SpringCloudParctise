package com.wilson.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   17:39
 * Description:客户端通过restTemplate访问服务端
 */
@Configuration
public class RestTemplateConfig {

    @Bean
    //@LoadBalanced //开启Ribbon负载均衡模式，就算更改模式也不用注释 自己写的则需要注释
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
