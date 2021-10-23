package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import com.wilson.springcloud.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/18   8:52
 * Description:
 */
@Component
public class FeginFallbackService implements FeignService
{
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return null;
    }

    @Override
    public String payment_ok(Long id) {
        return "feginfallback service  ok";
    }

    @Override
    public String payment_timeout(Long id) {
        return "feginfallback service  timeout";
    }
}
