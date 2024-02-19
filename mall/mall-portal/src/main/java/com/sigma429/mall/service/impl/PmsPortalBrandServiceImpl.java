package com.sigma429.mall.service.impl;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.model.PmsBrand;
import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.service.PmsPortalBrandService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsPortalBrandServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:28
 * @Version:v1.0
 */
@Service
public class PmsPortalBrandServiceImpl implements PmsPortalBrandService {
    @Override
    public List<PmsBrand> recommendList(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public PmsBrand detail(Long brandId) {
        return null;
    }

    @Override
    public CommonPage<PmsProduct> productList(Long brandId, Integer pageNum, Integer pageSize) {
        return null;
    }
}
