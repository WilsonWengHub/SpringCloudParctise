package com.wilson.springcloud.controller;

import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   11:10
 * Description:
 */
@RestController
public class StorageController {
    @Resource
    StorageService storageService;
    @RequestMapping("/storage/decrease")
    public CommonResult decrease(Long productId, Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200,"扣除库存成功");
    }
}
