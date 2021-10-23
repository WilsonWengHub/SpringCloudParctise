package com.wilson.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/9   22:11
 * Description:更换轮询机制，不能和启动类在同一个包下，启动类添加注解 @RibbonClient(configuration= {RibbonRules.class},name = "CLOUD-PAYMENT-SERVICE")
 */
@Configuration
public class RibbonRules  {
    @Bean
    public IRule randomRule(){
        return new RandomRule();
    }
}
