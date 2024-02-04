package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.model.UmsResource;
import com.sigma429.mall.service.UmsResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UmsResourceController
 * Package:com.sigma429.mall.controller
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 14:02
 * @Version:v1.0
 */
@RestController
@Api(tags = "UmsResourceController", description = "后台资源管理")
@RequestMapping("/resource")
public class UmsResourceController {
    @Autowired
    private UmsResourceService resourceService;

    @ApiOperation("添加后台资源")
    @PostMapping("/create")
    public CommonResult create(@RequestBody UmsResource umsResource) {
        return null;
    }

    @ApiOperation("修改后台资源")
    @PostMapping("/update/{id}")
    public CommonResult update(@PathVariable Long id,
                               @RequestBody UmsResource umsResource) {
        return null;
    }

    @ApiOperation("根据ID获取资源详情")
    @GetMapping("/{id}")
    public CommonResult<UmsResource> getItem(@PathVariable Long id) {
        return null;
    }

    @ApiOperation("根据ID删除后台资源")
    @PostMapping("/delete/{id}")
    public CommonResult delete(@PathVariable Long id) {
        return null;
    }

    @ApiOperation("分页模糊查询后台资源")
    @GetMapping("/list")
    public CommonResult<CommonPage<UmsResource>> list(@RequestParam(required = false) Long categoryId,
                                                      @RequestParam(required = false) String nameKeyword,
                                                      @RequestParam(required = false) String urlKeyword,
                                                      @RequestParam(value = "pageSize", defaultValue = "5") Integer pageSize,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum) {
        return null;
    }

    @ApiOperation("查询所有后台资源")
    @GetMapping("/listAll")
    public CommonResult<List<UmsResource>> listAll() {
        return null;
    }

    @ApiOperation("初始化资源角色关联数据")
    @GetMapping("/initResourceRolesMap")
    public CommonResult initResourceRolesMap() {
        return null;
    }
}
