package com.wilson.springcloud.Service;

import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/11   22:15
 * Description:
 */
@Service
public class PaymentService {
    public String paymentInfo_ok(Long id){
        return "线程池：" + Thread.currentThread().getName() + "payment_OK" + id;
    }

    public String paymentInfo_timeout(Long id) throws InterruptedException {
        int timeNum = 3;
        TimeUnit.SECONDS.sleep(timeNum);
        return "线程池：" + Thread.currentThread().getName() + "payment_timeout" + id;
    }
}
