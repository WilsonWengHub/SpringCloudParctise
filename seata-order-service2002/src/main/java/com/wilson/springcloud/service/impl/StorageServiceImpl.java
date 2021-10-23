package com.wilson.springcloud.service.impl;

import com.wilson.springcloud.dao.StorageDao;
import com.wilson.springcloud.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:25
 * Description:
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService {
    @Resource
    StorageDao storageDao;
    @Override
    public void decrease(Long productId, Integer count) {
        log.info("---------->storage-service中扣减库存start");
        storageDao.decrease(productId,count);
        log.info("---------->storage-service中扣减库存end");
    }
}
