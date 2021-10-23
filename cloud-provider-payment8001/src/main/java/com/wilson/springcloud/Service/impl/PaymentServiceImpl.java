package com.wilson.springcloud.Service.impl;

import cn.hutool.core.util.IdUtil;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.netflix.ribbon.proxy.annotation.Hystrix;
import com.wilson.springcloud.Dao.PaymentDao;
import com.wilson.springcloud.Service.PaymentService;
import com.wilson.springcloud.enties.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.PAData;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   15:03
 * Description:
 */

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        int res = paymentDao.create(payment);
        return res;
    }

    @Override
    public Payment getPaymentById(Long id) {
        Payment payment = (Payment) paymentDao.getPaymentById(id);
        return payment;
    }
    @Override
    public String paymentInfo_ok(Long id){
        return "线程池：" + Thread.currentThread().getName() + "payment_OK" + id;
    }
    @Override
    @HystrixCommand(defaultFallback = "error",commandProperties = {
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds",value = "5000")
    })
    public String paymentInfo_timeout(Long id) throws InterruptedException {
        int timeNum = 500;
        TimeUnit.MILLISECONDS.sleep(timeNum);
        return "线程池：" + Thread.currentThread().getName() + "payment_timeout" + id;
    }
    public String error() {
        return "error";
    }



    @HystrixCommand(fallbackMethod = "paymentCircuitBreaker_fallback",
    commandProperties = {
            //属性都在HystrixCommandProperties.java里面
            @HystrixProperty(name = "circuitBreaker.enabled" ,value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold" ,value = "10"),
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds" ,value = "10000"),
            @HystrixProperty(name = "circuitBreaker.errorThresholdPercentage" ,value = "60"),
    })
    public String paymentCircuitBreaker(Long id){
        if (id < 0){
            throw new RuntimeException("id不能为负数=====");
        }
        String serialNum = IdUtil.simpleUUID();
        return Thread.currentThread().getName() + "调用成功，流水号" + serialNum;
    }
    public String paymentCircuitBreaker_fallback(Long id){

        return "ID 不能为负数 ====》" + id;
    }

}
