package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.PmsProductCategoryParam;
import com.sigma429.mall.dto.PmsProductCategoryWithChildrenItem;
import com.sigma429.mall.model.PmsProductCategory;
import com.sigma429.mall.service.PmsProductCategoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsProductCategoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:PmsProductCategoryService实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:44
 * @Version:v1.0
 */
@Service
public class PmsProductCategoryServiceImpl implements PmsProductCategoryService {
    @Override
    public int create(PmsProductCategoryParam pmsProductCategoryParam) {
        return 0;
    }

    @Override
    public int update(Long id, PmsProductCategoryParam pmsProductCategoryParam) {
        return 0;
    }

    @Override
    public List<PmsProductCategory> getList(Long parentId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public PmsProductCategory getItem(Long id) {
        return null;
    }

    @Override
    public int updateNavStatus(List<Long> ids, Integer navStatus) {
        return 0;
    }

    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        return 0;
    }

    @Override
    public List<PmsProductCategoryWithChildrenItem> listWithChildren() {
        return null;
    }
}
