package com.sigma429.mall.service;


import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.model.PmsProduct;

import java.util.List;

/**
 * 前台品牌管理Service
 */
public interface PmsPortalBrandService {
    /**
     * 分页获取推荐品牌
     */
    List<PmsBrand> recommendList(Integer pageNum, Integer pageSize);

    /**
     * 获取品牌详情
     */
    PmsBrand detail(Long brandId);

    /**
     * 分页获取品牌关联商品
     */
    CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize);
}
