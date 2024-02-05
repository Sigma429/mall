package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.PmsProductAttributeCategoryItem;
import com.sigma429.mall.model.PmsProductAttributeCategory;
import com.sigma429.mall.service.PmsProductAttributeCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsProductAttributeCategoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:PmsProductAttributeCategoryService实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:43
 * @Version:v1.0
 */
@Service
public class PmsProductAttributeCategoryServiceImpl implements PmsProductAttributeCategoryService {
    @Override
    public int create(String name) {
        return 0;
    }

    @Override
    public int update(Long id, String name) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return null;
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return null;
    }
}
