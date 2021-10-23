package com.wilson.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:00
 * Description:
 */
@Mapper
public interface StorageDao {
    void decrease(@Param("productId")Long productId, @Param("count")Integer count);
}
