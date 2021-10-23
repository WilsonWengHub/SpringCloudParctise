package com.wilson.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wilson.config.MySentinel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/19   21:13
 * Description:
 */
@RestController
public class FlowlimitController {
    @GetMapping("/testA")
    @SentinelResource(value = "testA",blockHandler = "blockMethod")
    public String testA(){
        return "test------A";
    }
    public String blockMethod(BlockException b){
        return "blockMethod------A";
    }



    @GetMapping("/testB")
    @SentinelResource(value = "testB",blockHandlerClass = MySentinel.class,blockHandler = "blockMethodB")
    public String testB(){
        return "test------B";
    }
}
