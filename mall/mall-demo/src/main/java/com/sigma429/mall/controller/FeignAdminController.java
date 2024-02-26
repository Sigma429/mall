package com.sigma429.mall.controller;


import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.dto.UmsAdminLoginParam;
import com.sigma429.mall.service.FeignAdminService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Feign调用mall-admin接口示例
 */
@Api(tags = "FeignAdminController", description = "Feign调用mall-admin接口示例")
@RestController
@RequestMapping("/feign/admin")
public class FeignAdminController {
    @Autowired
    private FeignAdminService adminService;

    @PostMapping("/login")
    public CommonResult login(@RequestBody UmsAdminLoginParam loginParam) {
        return adminService.login(loginParam);
    }

    @GetMapping("/getBrandList")
    public CommonResult getBrandList() {
        return adminService.getList();
    }
}
