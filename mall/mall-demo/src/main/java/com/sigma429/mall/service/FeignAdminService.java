package com.sigma429.mall.service;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.dto.UmsAdminLoginParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("mall-admin")
public interface FeignAdminService {

    @PostMapping("/admin/login")
    CommonResult login(@RequestBody UmsAdminLoginParam loginParam);

    @GetMapping("/brand/listAll")
    CommonResult getList();
}
