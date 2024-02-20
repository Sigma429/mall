package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.domain.MemberProductCollection;
import com.sigma429.mall.service.MemberCollectionService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * 会员收藏管理Controller
 */
@RestController
@Api(tags = "MemberCollectionController", description = "会员收藏管理")
@RequestMapping("/member/productCollection")
public class MemberProductCollectionController {
    @Autowired
    private MemberCollectionService memberCollectionService;

    @ApiOperation("添加商品收藏")
    @PostMapping("/add")
    public CommonResult add(@RequestBody MemberProductCollection productCollection) {
        int count = memberCollectionService.add(productCollection);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("删除收藏商品")
    @PostMapping("/delete")
    public CommonResult delete(Long productId) {
        int count = memberCollectionService.delete(productId);
        if (count > 0) {
            return CommonResult.success(count);
        } else {
            return CommonResult.failed();
        }
    }

    @ApiOperation("显示收藏列表")
    @GetMapping("/list")
    public CommonResult<CommonPage<MemberProductCollection>> list(@RequestParam(value = "pageNum",
            defaultValue = "1") Integer pageNum,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5"
                                                                  ) Integer pageSize) {
        Page<MemberProductCollection> page = memberCollectionService.list(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(page));
    }

    @ApiOperation("显示收藏商品详情")
    @GetMapping("/detail")
    public CommonResult<MemberProductCollection> detail(@RequestParam Long productId) {
        MemberProductCollection memberProductCollection = memberCollectionService.detail(productId);
        return CommonResult.success(memberProductCollection);
    }

    @ApiOperation("清空收藏列表")
    @PostMapping("/clear")
    public CommonResult clear() {
        memberCollectionService.clear();
        return CommonResult.success(null);
    }
}
