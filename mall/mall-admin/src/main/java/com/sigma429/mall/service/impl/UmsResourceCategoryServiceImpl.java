package com.sigma429.mall.service.impl;

import com.sigma429.mall.mapper.UmsResourceCategoryMapper;
import com.sigma429.mall.model.UmsResourceCategory;
import com.sigma429.mall.model.UmsResourceCategoryExample;
import com.sigma429.mall.service.UmsResourceCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
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
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Long id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int delete(Long id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }
}
