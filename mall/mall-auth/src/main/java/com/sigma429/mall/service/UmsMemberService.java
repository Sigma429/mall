package com.sigma429.mall.service;

import com.sigma429.mall.domain.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 前台会员服务远程调用Service
 */
@FeignClient("mall-portal")
public interface UmsMemberService {
    @GetMapping("/sso/loadByUsername")
    UserDTO loadUserByUsername(@RequestParam String username);
}
