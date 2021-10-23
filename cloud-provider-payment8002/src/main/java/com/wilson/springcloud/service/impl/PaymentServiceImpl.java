package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.Dao.PaymentDao;
import com.wilson.springcloud.enties.Payment;
import com.wilson.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   10:02
 * Description:
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment selectById(Long id) {
        return paymentDao.selectById(id);
    }

    @Override
    public String paymentInfo_ok(Long id){
        return "线程池：" + Thread.currentThread().getName() + "payment_OK" + id;
    }
    @Override
    public String paymentInfo_timeout(Long id) throws InterruptedException {
        int timeNum = 1000;
        TimeUnit.MILLISECONDS.sleep(timeNum);
        return "线程池：" + Thread.currentThread().getName() + "payment_timeout" + id;
    }
}
