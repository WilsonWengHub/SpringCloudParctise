package com.wilson.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/30   22:07
 * Description:
 */
@RestController
@RefreshScope
public class ConfigClientController {
    @Value("${config.info}")
    private String info;
    @GetMapping("/configInfo")
    public String getInfo(){
        return info;
    }
}
