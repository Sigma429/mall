package com.sigma429.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * ClassName:MyBatisConfig
 * Package:com.sigma429.mall.config
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/03 - 18:11
 * @Version:v1.0
 */
@Configuration
// @EnableTransactionManagement
@MapperScan({"com.sigma429.mall.mapper","com.sigma429.mall.dao"})
public class MyBatisConfig {
}
