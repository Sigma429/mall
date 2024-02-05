package com.sigma429.mall.config;

import com.sigma429.mall.domain.SwaggerProperties;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * ClassName:SwaggerConfig
 * Package:com.sigma429.mall.config
 * Description:Swagger API文档相关配置
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/03 - 18:50
 * @Version:v1.0
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

    @Override
    public SwaggerProperties swaggerProperties() {
        return SwaggerProperties.builder()
                .apiBasePackage("com.sigma429.mall.controller")
                .title("mall后台系统")
                .description("mall后台相关接口文档")
                .contactName("Sigma429")
                .version("1.0")
                .enableSecurity(true)
                .build();
    }

    @Bean
    public BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return generateBeanPostProcessor();
    }
}

