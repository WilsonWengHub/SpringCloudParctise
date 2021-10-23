package com.wilson.springcloud.Service;

import com.wilson.springcloud.enties.Payment;

import org.apache.ibatis.annotations.Param;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   14:59
 * Description:
 */

public interface PaymentService {

    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);


    public String paymentInfo_ok(Long id);

    public String paymentInfo_timeout(Long id) throws InterruptedException;
    String paymentCircuitBreaker(Long id);
}
