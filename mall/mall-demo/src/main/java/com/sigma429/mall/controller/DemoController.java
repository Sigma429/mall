package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.dto.PmsBrandDTO;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.service.DemoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品管理示例Controller
 */
@Api(tags = "DemoController", description = "商品管理示例接口")
@RestController
public class DemoController {
    @Autowired
    private DemoService demoService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DemoController.class);

    @ApiOperation(value = "获取全部品牌列表")
    @RequestMapping(value = "/brand/listAll", method = RequestMethod.GET)
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(demoService.listAllBrand());
    }

    @ApiOperation(value = "添加品牌")
    @RequestMapping(value = "/brand/create", method = RequestMethod.POST)
    public CommonResult createBrand(@Validated @RequestBody PmsBrandDTO pmsBrand) {
        CommonResult commonResult;
        int count = demoService.createBrand(pmsBrand);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrand);
            LOGGER.debug("createBrand success:{}", pmsBrand);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("createBrand failed:{}", pmsBrand);
        }
        return commonResult;
    }

    @ApiOperation(value = "更新品牌")
    @RequestMapping(value = "/brand/update/{id}", method = RequestMethod.POST)
    public CommonResult updateBrand(@PathVariable("id") Long id, @Validated @RequestBody PmsBrandDTO pmsBrandDto) {
        CommonResult commonResult;
        int count = demoService.updateBrand(id, pmsBrandDto);
        if (count == 1) {
            commonResult = CommonResult.success(pmsBrandDto);
            LOGGER.debug("updateBrand success:{}", pmsBrandDto);
        } else {
            commonResult = CommonResult.failed("操作失败");
            LOGGER.debug("updateBrand failed:{}", pmsBrandDto);
        }
        return commonResult;
    }

    @ApiOperation(value = "删除品牌")
    @RequestMapping(value = "/brand/delete/{id}", method = RequestMethod.GET)
    public CommonResult deleteBrand(@PathVariable("id") Long id) {
        int count = demoService.deleteBrand(id);
        if (count == 1) {
            LOGGER.debug("deleteBrand success :id={}", id);
            return CommonResult.success(null);
        } else {
            LOGGER.debug("deleteBrand failed :id={}", id);
            return CommonResult.failed("操作失败");
        }
    }

    @ApiOperation(value = "分页获取品牌列表")
    @RequestMapping(value = "/brand/list", method = RequestMethod.GET)
    public CommonResult<CommonPage<PmsBrand>> listBrand(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                        @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<PmsBrand> brandList = demoService.listBrand(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(brandList));
    }

    @ApiOperation(value = "根据编号查询品牌信息")
    @RequestMapping(value = "/brand/{id}", method = RequestMethod.GET)
    public CommonResult<PmsBrand> brand(@PathVariable("id") Long id) {
        return CommonResult.success(demoService.getBrand(id));
    }
}
