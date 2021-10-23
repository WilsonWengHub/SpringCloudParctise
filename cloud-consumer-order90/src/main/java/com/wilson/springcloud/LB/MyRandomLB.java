package com.wilson.springcloud.LB;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/10   11:10
 * Description:随即策略
 */
@Component
public class MyRandomLB implements RandomRule {
    @Override
    public ServiceInstance applyInstance(List<ServiceInstance> allInstance) {
        int serviceSize = allInstance.size();
        System.out.println(serviceSize);
        int index = (int) (Math.random()*(serviceSize));
        System.out.println("index ----------------->" + index);
        //System.out.println(allInstance);
        return allInstance.get(index);
    }
}
