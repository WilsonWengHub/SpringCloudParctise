package com.wilson.springcloud.Dao;

import com.wilson.springcloud.enties.Payment;
import org.apache.ibatis.annotations.Mapper;


/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   14:08
 * Description:
 */

@Mapper
public interface PaymentDao {
    //@Insert("insert into payment values ()")
    public int create(Payment payment);

    //@Select("select * from payment where id = #{id}")
    public Payment getPaymentById(Long id);
}
