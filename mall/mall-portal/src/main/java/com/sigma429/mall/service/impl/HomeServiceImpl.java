package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.HomeContentResult;
import com.sigma429.mall.model.CmsSubject;
import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.model.PmsProductCategory;
import com.sigma429.mall.service.HomeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:HomeServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:25
 * @Version:v1.0
 */
@Service
public class HomeServiceImpl implements HomeService {
    @Override
    public HomeContentResult content() {
        return null;
    }

    @Override
    public List<PmsProduct> recommendProductList(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProductCategory> getProductCateList(Long parentId) {
        return null;
    }

    @Override
    public List<CmsSubject> getSubjectList(Long cateId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProduct> hotProductList(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public List<PmsProduct> newProductList(Integer pageNum, Integer pageSize) {
        return null;
    }
}
