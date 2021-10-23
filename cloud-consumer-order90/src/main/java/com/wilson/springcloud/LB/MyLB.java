package com.wilson.springcloud.LB;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/9   22:32
 * Description:
 */
@Component
public class MyLB implements RobinRule {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    public int getAndIncrement(){
        int cur;
        int next;
        do {
             cur = atomicInteger.get();
             next = cur >= Integer.MAX_VALUE ? 0 : (cur+1);
        }while (!this.atomicInteger.compareAndSet(cur,next));
        System.out.println("进行了" + next + "次访问");
        return next;
    }
    @Override
    //List<ServiceInstance> allInstance 所有的服务列表
    public ServiceInstance applyServiceInstance(List<ServiceInstance> allInstance) {
        int index = getAndIncrement() % allInstance.size();//获取那个服务提供
        return allInstance.get(index);
    }

}
