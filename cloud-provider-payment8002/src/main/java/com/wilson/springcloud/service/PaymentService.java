package com.wilson.springcloud.service;

import com.wilson.springcloud.enties.Payment;

import java.util.concurrent.TimeUnit;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   10:01
 * Description:
 */
public interface PaymentService {
    int create(Payment payment);
    Payment selectById(Long id);
    public String paymentInfo_ok(Long id);
    public String paymentInfo_timeout(Long id) throws InterruptedException;
}
