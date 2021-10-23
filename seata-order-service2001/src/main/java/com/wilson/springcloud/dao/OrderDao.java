package com.wilson.springcloud.dao;

import com.wilson.springcloud.enties.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   8:15
 * Description:
 */
@Mapper
public interface OrderDao {
//    1.新建订单
    void createOrder(Order order);
//    2.修改订单状态
    void updateOrder(@Param("userId")Long userId, @Param("status")Integer status);
}
