package com.wilson;


import com.wilson.springcloud.Dao.PaymentDao;
import com.wilson.springcloud.Service.PaymentService;
import com.wilson.springcloud.Service.impl.PaymentServiceImpl;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   14:50
 * Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMybatis {
    @Resource
    PaymentService paymentService;
    @Test
    public void creatPayment(){
        //t.create(new Payment((long) 100,"10000"));
        System.out.println("111");
        paymentService.getPaymentById(Long.valueOf("10000"));
        System.out.println(paymentService.getPaymentById(Long.valueOf("10000")));
    }
}
