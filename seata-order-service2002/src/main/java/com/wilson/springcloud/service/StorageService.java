package com.wilson.springcloud.service;

import org.apache.ibatis.annotations.Param;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:24
 * Description:
 */
public interface StorageService {
    void decrease(@Param("productId")Long productId, @Param("count")Integer count);
}
