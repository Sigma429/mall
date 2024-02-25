package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.EsProduct;
import com.sigma429.mall.domain.EsProductRelatedInfo;
import com.sigma429.mall.service.EsProductService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:EsProductServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品搜索管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/24 - 23:47
 * @Version:v1.0
 */
@Service
public class EsProductServiceImpl implements EsProductService {
    @Override
    public int importAll() {
        return 0;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EsProduct create(Long id) {
        return null;
    }

    @Override
    public void delete(List<Long> ids) {

    }

    @Override
    public Page<EsProduct> search(String keyword, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public Page<EsProduct> search(String keyword, Long brandId, Long productCategoryId, Integer pageNum,
                                  Integer pageSize, Integer sort) {
        return null;
    }

    @Override
    public Page<EsProduct> recommend(Long id, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public EsProductRelatedInfo searchRelatedInfo(String keyword) {
        return null;
    }
}
