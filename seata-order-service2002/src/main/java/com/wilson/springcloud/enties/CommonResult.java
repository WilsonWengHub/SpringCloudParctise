package com.wilson.springcloud.enties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   8:07
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    private Integer code;
    private String message;
    private T data;
    public  CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
