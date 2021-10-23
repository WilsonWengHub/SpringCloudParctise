package com.wilson.springcloud.Controller;

import com.wilson.springcloud.Service.PaymentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/11   22:19
 * Description:
 */
@RestController
public class PaymentController {
    @Value("${server.port}")

    String port;
    @Resource
    PaymentService paymentService;
    @GetMapping("/payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable("id") Long id){
        return paymentService.paymentInfo_ok(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String payment_timeout(@PathVariable("id") Long id) throws InterruptedException {
        return paymentService.paymentInfo_timeout(id);
    }
}
