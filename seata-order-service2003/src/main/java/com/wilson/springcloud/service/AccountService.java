package com.wilson.springcloud.service;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:55
 * Description:
 */
public interface AccountService {
    void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);
}
