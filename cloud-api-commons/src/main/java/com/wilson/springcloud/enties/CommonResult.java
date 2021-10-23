package com.wilson.springcloud.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/8/2   17:42
 * Description:
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Slf4j
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
