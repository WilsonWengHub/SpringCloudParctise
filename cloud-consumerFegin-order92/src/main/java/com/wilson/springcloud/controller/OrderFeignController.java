package com.wilson.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import com.wilson.springcloud.service.FeignService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/10   22:50
 * Description:
 */
@RestController
//@DefaultProperties(defaultFallback = "error")
public class OrderFeignController {
    @Resource
    private FeignService feignService;
    @GetMapping("/consumer/payment/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        return feignService.getPaymentById(id);
    }
    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    String payment_ok(@PathVariable("id") Long id){
        return feignService.payment_ok(id);
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    //@HystrixCommand
    //@HystrixCommand(fallbackMethod = "error",
    //        commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "500")})
    String payment_timeout(@PathVariable("id") Long id){
        return feignService.payment_timeout(id);
    }
    String error(){
        return "消费者80error";
    }
}
