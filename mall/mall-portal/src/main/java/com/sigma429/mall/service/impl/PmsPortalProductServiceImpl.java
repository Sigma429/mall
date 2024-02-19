package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.PmsPortalProductDetail;
import com.sigma429.mall.domain.PmsProductCategoryNode;
import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.service.PmsPortalProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsPortalProductServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:27
 * @Version:v1.0
 */
@Service
public class PmsPortalProductServiceImpl implements PmsPortalProductService {
    @Override
    public List<PmsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum, Integer pageSize, Integer sort) {
        return null;
    }

    @Override
    public List<PmsProductCategoryNode> categoryTreeList() {
        return null;
    }

    @Override
    public PmsPortalProductDetail detail(Long id) {
        return null;
    }
}
