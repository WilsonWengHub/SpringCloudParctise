package com.wilson.springcloud.controller;

import com.netflix.loadbalancer.ILoadBalancer;
import com.wilson.springcloud.LB.MyLB;
import com.wilson.springcloud.LB.MyRandomLB;
import com.wilson.springcloud.enties.CommonResult;
import com.wilson.springcloud.enties.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   17:41
 * Description:
 */

@RestController
@Slf4j
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @Resource
    DiscoveryClient discoveryClient;
    @Resource
    MyLB myLB;

    @Resource
    MyRandomLB myRandomLB;

    //public final String PAYMENT_URL = "http://localhost:8001";
    //服务端集群，根据服务名称访问
    public final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        log.info("消费者");
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return restTemplate.getForObject(PAYMENT_URL + "/payment/" + id ,CommonResult.class);
    }

    @GetMapping("/consumer/payment/lb")
    public String getPaymentById(){
        //轮询机制
        List<ServiceInstance> allInstance = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        if (allInstance == null || allInstance.size() <= 0){
            return null;
        }
        ServiceInstance apply = myLB.applyServiceInstance(allInstance);
        URI uri = apply.getUri();
        return restTemplate.getForObject(uri + "/payment/lb" , String.class);

        //随即机制
        //List<ServiceInstance>allInstance = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
        //if (allInstance == null || allInstance.size() <= 0){
        //    return null;
        //}
        //System.out.println(allInstance.toString());
        //ServiceInstance apply = myRandomLB.applyInstance(allInstance);
        //URI uri = apply.getUri();
        //return restTemplate.getForObject(uri + "/payment/lb",String.class);
    }
}
