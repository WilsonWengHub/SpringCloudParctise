package com.wilson.springcloud.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   8:10
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private Long id;
    private Long userId;
    private Long productId;
    private Integer count;
    private BigDecimal money;
    private Integer status;//订单状态 0：创建中 1：已完成
}
