package com.wilson.springcloud;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/30   10:12
 * Description:
 */
@Component
public class MyGateWayConfig implements GlobalFilter, Ordered {
    @Override
    //定义全局过滤器，拦截请求
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String name = exchange.getRequest().getQueryParams().getFirst("uname");
        if (name == null){
            System.out.println("用户为空");
            exchange.getResponse().setStatusCode(HttpStatus.BAD_REQUEST);
            return exchange.getResponse().setComplete();
        }
        return chain.filter(exchange);
    }

    @Override
    //过滤器优先等级
    public int getOrder() {
        return 0;
    }
}
