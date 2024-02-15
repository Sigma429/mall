package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.model.PmsSkuStock;
import com.sigma429.mall.service.PmsSkuStockService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * sku库存Controller
 */
@RestController
@Api(tags = "PmsSkuStockController", description = "sku商品库存管理")
@RequestMapping("/sku")
public class PmsSkuStockController {
    @Autowired
    private PmsSkuStockService skuStockService;

    @ApiOperation("根据商品编号及编号模糊搜索sku库存")
    @GetMapping("/{pid}")
    public CommonResult<List<PmsSkuStock>> getList(@PathVariable Long pid, @RequestParam(value = "keyword", required
            = false) String keyword) {
        List<PmsSkuStock> skuStockList = skuStockService.getList(pid, keyword);
        return CommonResult.success(skuStockList);
    }

    @ApiOperation("批量更新库存信息")
    @PostMapping("/update/{pid}")
    public CommonResult update(@PathVariable Long pid, @RequestBody List<PmsSkuStock> skuStockList) {
        int count = skuStockService.update(pid, skuStockList);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }
}
