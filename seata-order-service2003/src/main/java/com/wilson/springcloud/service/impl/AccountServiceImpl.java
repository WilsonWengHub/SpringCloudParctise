package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.dao.AccountDao;
import com.wilson.springcloud.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:56
 * Description:
 */
@Service
@Slf4j
public class AccountServiceImpl implements AccountService {
    @Resource
    AccountDao accountDao;
    @Override
    public void decrease(Long userId, BigDecimal money) {
        log.info("---------->storage-account中扣减库存start");
        accountDao.decrease(userId,money);
        log.info("---------->storage-account中扣减库存end");
    }
}
