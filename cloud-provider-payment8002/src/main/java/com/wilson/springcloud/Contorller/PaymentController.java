package com.wilson.springcloud.Contorller;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import com.wilson.springcloud.service.PaymentService;
import com.wilson.springcloud.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   10:06
 * Description:
 */
@RestController
@Slf4j
public class PaymentController {
    @Value("${server.port}")
    String port;
    @Resource
    private PaymentServiceImpl paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int res = paymentService.create(payment);
        log.info("插入结果" + res);

        if (res > 0){

            return new CommonResult(200,"插入数据库成功" + port, res);
        }else{
            return new CommonResult(444,"插入数据库失败" + port, null);
        }
    }


    @GetMapping("/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.selectById(id);
        log.info("查询结果" + payment);

        if (payment != null){
            System.out.println("hellp");
            return new CommonResult(200,"查询成功" + port, payment);
        }else{
            return new CommonResult(444,"查询失败" + id + port, null);
        }
    }

    @GetMapping("/payment/lb")//测试自写轮询机制
    public String getPaymentById(){
        return this.port;
    }



    //熔断测试
    @GetMapping("/payment/hystrix/ok/{id}")
    public String payment_ok(@PathVariable("id") Long id){
        return paymentService.paymentInfo_ok(id);
    }

    @GetMapping("/payment/hystrix/timeout/{id}")
    public String payment_timeout(@PathVariable("id") Long id) throws InterruptedException {
        return paymentService.paymentInfo_timeout(id);
    }
}
