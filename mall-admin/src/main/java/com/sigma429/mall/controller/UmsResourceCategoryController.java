package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.model.UmsResourceCategory;
import com.sigma429.mall.service.UmsResourceCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * ClassName:UmsResourceCategoryController
 * Package:com.sigma429.mall.controller
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 14:10
 * @Version:v1.0
 */
@RestController
@Api(tags = "UmsResourceCategoryController", description = "后台资源分类管理")
@RequestMapping("/resourceCategory")
public class UmsResourceCategoryController {
    @Autowired
    private UmsResourceCategoryService resourceCategoryService;

    @ApiOperation("查询所有后台资源分类")
    @GetMapping("/listAll")
    public CommonResult<List<UmsResourceCategory>> listAll() {
        return null;
    }

    @ApiOperation("添加后台资源分类")
    @PostMapping("/create")
    public CommonResult create(@RequestBody UmsResourceCategory umsResourceCategory) {
        return null;
    }

    @ApiOperation("修改后台资源分类")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id,
                               @RequestBody UmsResourceCategory umsResourceCategory) {
        return null;
    }

    @ApiOperation("根据ID删除后台资源")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        return null;
    }
}
