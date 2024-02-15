package com.sigma429.mall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.util.pattern.PathPatternParser;

/**
 * 全局跨域配置
 * 注意：前端从网关进行调用时需要配置
 */
@Configuration
public class GlobalCorsConfig {

    @Bean
    public CorsWebFilter corsFilter() {
        CorsConfiguration config = new CorsConfiguration();
        //允许所有请求方法跨域调用
        config.addAllowedMethod("*");
        //允许所有域名进行跨域调用
        config.addAllowedOriginPattern("*");
        //放行全部原始头信息
        config.addAllowedHeader("*");
        //允许跨域发送cookie
        config.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource(new PathPatternParser());
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }

}
