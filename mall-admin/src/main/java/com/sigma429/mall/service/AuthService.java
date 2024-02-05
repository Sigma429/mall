package com.sigma429.mall.service;

import com.sigma429.mall.api.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * 认证服务远程调用Service
 */
@FeignClient("mall-auth")
public interface AuthService {

    @PostMapping( "/oauth/token")
    CommonResult getAccessToken(@RequestParam Map<String, String> parameters);

}
