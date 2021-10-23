package com.wilson.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * FileName:   cloud2021
 * Author:     Ir-verng
 * Date:       2021/9/21   8:06
 * Description:
 */
@Configuration
@MapperScan({"com.wilson.springcloud.dao"})
public class MybatisConfig {
}
