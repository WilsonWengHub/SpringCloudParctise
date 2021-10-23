package com.wilson.springcloud.Dao;

import com.wilson.springcloud.enties.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/4   9:51
 * Description:
 */
@Mapper
public interface PaymentDao {
    int create(Payment payment);
    Payment selectById(Long id);
}
