package com.sigma429.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * MyBatis相关配置
 */
@Configuration
@MapperScan({"com.sigma429.mall.mapper", "com.sigma429.mall.dao"})
public class MyBatisConfig {
}
