package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.UmsResourceCategory;
import com.sigma429.mall.service.UmsResourceCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsResourceCategoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:后台资源分类管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 14:12
 * @Version:v1.0
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Override
    public List<UmsResourceCategory> listAll() {
        return null;
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
