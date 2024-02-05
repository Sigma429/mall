package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.model.SmsHomeRecommendProduct;
import com.sigma429.mall.service.SmsHomeRecommendProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首页人气推荐管理Controller
 */
@RestController
@Api(tags = "SmsHomeRecommendProductController", description = "首页人气推荐管理")
@RequestMapping("/home/recommendProduct")
public class SmsHomeRecommendProductController {
    @Autowired
    private SmsHomeRecommendProductService recommendProductService;

    @ApiOperation("添加首页推荐")
    @PostMapping("/create")
    public CommonResult create(@RequestBody List<SmsHomeRecommendProduct> homeBrandList) {
        int count = recommendProductService.create(homeBrandList);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改推荐排序")
    @PostMapping("/update/sort/{id}")
    public CommonResult updateSort(@PathVariable Long id, Integer sort) {
        int count = recommendProductService.updateSort(id, sort);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量删除推荐")
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = recommendProductService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量修改推荐状态")
    @PostMapping("/update/recommendStatus")
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids,
                                              @RequestParam Integer recommendStatus) {
        int count = recommendProductService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分页查询推荐")
    @GetMapping("/list")
    public CommonResult<CommonPage<SmsHomeRecommendProduct>> list(@RequestParam(value = "productName", required =
            false) String productName,
                                                                  @RequestParam(value = "recommendStatus", required =
                                                                          false) Integer recommendStatus,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5"
                                                                  ) Integer pageSize,
                                                                  @RequestParam(value = "pageNum",
                                                                          defaultValue = "1") Integer pageNum) {
        List<SmsHomeRecommendProduct> homeBrandList = recommendProductService.list(productName, recommendStatus,
                pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(homeBrandList));
    }
}
