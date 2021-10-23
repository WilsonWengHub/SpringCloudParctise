package com.wilson.springcloud.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   10:24
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
    private Long id;
    private String serial;
}
