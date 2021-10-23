package com.wilson.springcloud.service;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import com.wilson.springcloud.service.impl.FeginFallbackService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/10   22:44
 * Description:
 */
@Service
@FeignClient(value = "CLOUD-PAYMENT-SERVICE",fallback = FeginFallbackService.class)
public interface FeignService {
    @GetMapping("/payment/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/ok/{id}")
    String payment_ok(@PathVariable("id") Long id);

    @GetMapping("/payment/hystrix/timeout/{id}")
    String payment_timeout(@PathVariable("id") Long id);
}
