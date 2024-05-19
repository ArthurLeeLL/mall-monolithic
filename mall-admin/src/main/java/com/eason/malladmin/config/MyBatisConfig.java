package com.eason.malladmin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MyBatisConfig
 * @Description Class created by Eason Lee
 * @Author Eason Lee
 * @Date 2024-05-15 7:41 PM
 */

@Configuration
@MapperScan("com.eason.malladmin.dao")
public class MyBatisConfig {
}
