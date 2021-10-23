package com.wilson.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/20   6:40
 * Description:
 */
@RestController
public class CircleBreakerController {
    @Resource
    RestTemplate restTemplate;
    final String URI = "cloud-provide-Payment";
    @GetMapping("/consumer/payment/{id}")
    @SentinelResource(value = "fallback",blockHandler = "blockHandlerMethod",fallback = "handlerFallback")
    public CommonResult fallback(@PathVariable Long id){
        CommonResult res =  restTemplate.getForObject("http://" + URI + "/payment/" + id,CommonResult.class,id);
        if (id == 4){
            throw new IllegalArgumentException("非法参数异常");
        }else if (res.getData() == null){
            throw new NullPointerException("该id没有对应记录");
        }
        return res;
    }
    public CommonResult blockHandlerMethod(@PathVariable Long id, BlockException b){
        Payment payment = new Payment(id,null);
        CommonResult res =  new CommonResult(444,"blockHandler ----> new"+b.getMessage(),payment);
        return res;
    }
    public CommonResult<Payment> handlerFallback(@PathVariable  Long id, Throwable e){
        Payment payment = new Payment(id,null);
        return new CommonResult(445,"handlerFallback ----> new"+e.getMessage(),payment);
    }

}
