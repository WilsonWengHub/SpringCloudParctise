package com.wilson.springcloud.LB;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/10   11:09
 * Description:轮询机制随即策略
 */
public interface RandomRule {
    ServiceInstance applyInstance(List<ServiceInstance> allInstance);
}
