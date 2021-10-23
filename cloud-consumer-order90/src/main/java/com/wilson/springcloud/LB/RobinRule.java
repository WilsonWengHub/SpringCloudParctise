package com.wilson.springcloud.LB;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/9   22:27
 * Description:Ribbon 轮询机制
 */
public interface RobinRule {
    ServiceInstance applyServiceInstance(List<ServiceInstance> allInstance);
}
