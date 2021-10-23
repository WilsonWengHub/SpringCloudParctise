package com.wilson.springcloud.controller;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Order;
import com.wilson.springcloud.service.OrderService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   10:44
 * Description:
 */
@RestController
public class OrderController {

    @Resource
    OrderService orderService;
    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.createOrder(order);
        return new CommonResult(200,"创建订单成功");
    }
}
