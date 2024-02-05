package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.model.SmsHomeRecommendSubject;
import com.sigma429.mall.service.SmsHomeRecommendSubjectService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 首页专题推荐管理Controller
 */
@RestController
@Api(tags = "SmsHomeRecommendSubjectController", description = "首页专题推荐管理")
@RequestMapping("/home/recommendSubject")
public class SmsHomeRecommendSubjectController {
    @Autowired
    private SmsHomeRecommendSubjectService recommendSubjectService;

    @ApiOperation("添加首页推荐专题")
    @PostMapping("/create")
    public CommonResult create(@RequestBody List<SmsHomeRecommendSubject> homeBrandList) {
        int count = recommendSubjectService.create(homeBrandList);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("修改推荐排序")
    @PostMapping("/update/sort/{id}")
    public CommonResult updateSort(@PathVariable Long id, Integer sort) {
        int count = recommendSubjectService.updateSort(id, sort);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量删除推荐")
    @PostMapping("/delete")
    public CommonResult delete(@RequestParam("ids") List<Long> ids) {
        int count = recommendSubjectService.delete(ids);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("批量修改推荐状态")
    @PostMapping("/update/recommendStatus")
    public CommonResult updateRecommendStatus(@RequestParam("ids") List<Long> ids,
                                              @RequestParam Integer recommendStatus) {
        int count = recommendSubjectService.updateRecommendStatus(ids, recommendStatus);
        if (count > 0) {
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation("分页查询推荐")
    @GetMapping("/list")
    public CommonResult<CommonPage<SmsHomeRecommendSubject>> list(@RequestParam(value = "subjectName", required =
            false) String subjectName,
                                                                  @RequestParam(value = "recommendStatus", required =
                                                                          false) Integer recommendStatus,
                                                                  @RequestParam(value = "pageSize", defaultValue = "5"
                                                                  ) Integer pageSize,
                                                                  @RequestParam(value = "pageNum",
                                                                          defaultValue = "1") Integer pageNum) {
        List<SmsHomeRecommendSubject> homeBrandList = recommendSubjectService.list(subjectName, recommendStatus,
                pageSize, pageNum);
        return CommonResult.success(CommonPage.restPage(homeBrandList));
    }
}
