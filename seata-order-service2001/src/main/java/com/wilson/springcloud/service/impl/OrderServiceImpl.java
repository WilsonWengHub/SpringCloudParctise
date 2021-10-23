package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.dao.OrderDao;
import com.wilson.springcloud.enties.Order;
import com.wilson.springcloud.service.AccountService;
import com.wilson.springcloud.service.OrderService;
import com.wilson.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   8:35
 * Description:
 */
@Service
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderDao orderDao;
    @Resource
    StorageService storageService;
    @Resource
    AccountService accountService;
    @Override
    public void createOrder(Order order) {
        log.info("------->开始新建订单");
        orderDao.createOrder(order);
        log.info("------->订单微服务开始调用库存，做扣减");
        storageService.decrease(order.getProductId(),order.getCount());
        log.info("------->订单微服务开始调用库存，做扣减end");
        log.info("------->账户余额做扣减");
        accountService.decrease(order.getUserId(),order.getMoney());
        log.info("------->账户余额做扣减end");
        log.info("------->修改订单状态");
        orderDao.updateOrder(order.getUserId(),0);
        log.info("------->修改订单状态end");
        log.info("------->订单完成");



    }

    @Override
    public void updateOrder(Long userId, Integer status) {

    }
}
