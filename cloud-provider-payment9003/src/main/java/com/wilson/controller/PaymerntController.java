package com.wilson.controller;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/19   22:27
 * Description:
 */
@RestController
public class PaymerntController {
    @Value("${server.port}")
    private String port;

    static Map<Long,Payment> tmp = new HashMap<Long,Payment>();
    static {
        tmp.put(1L,new Payment(1L,"12314324234x64765"));
        tmp.put(2L,new Payment(2L,"54634564243asd234234"));
        tmp.put(3L,new Payment(3L,"277657862ewfweefw"));
    }

    @GetMapping("/payment/{id}")
    public CommonResult<Payment> paymentSql(@PathVariable("id") Long id){
        Payment payment =  tmp.get(id);
        CommonResult<Payment> res = new CommonResult<>(200,"from mysql"+port, payment);
        return res;
    }

}
