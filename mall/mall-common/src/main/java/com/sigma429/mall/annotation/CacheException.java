package com.sigma429.mall.annotation;

import java.lang.annotation.*;

/**
 * ClassName:CacheException
 * Package:com.sigma429.mall.annotation
 * Description:自定义注解，有该注解的缓存方法会抛出异常
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/18 - 20:51
 * @Version:v1.0
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface CacheException {
}
