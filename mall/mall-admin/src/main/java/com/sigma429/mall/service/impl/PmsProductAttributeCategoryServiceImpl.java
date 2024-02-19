package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.dao.PmsProductAttributeCategoryDao;
import com.sigma429.mall.dao.PmsProductCategoryAttributeRelationDao;
import com.sigma429.mall.dao.PmsProductCategoryDao;
import com.sigma429.mall.dto.PmsProductAttributeCategoryItem;
import com.sigma429.mall.mapper.PmsProductAttributeCategoryMapper;
import com.sigma429.mall.mapper.PmsProductCategoryAttributeRelationMapper;
import com.sigma429.mall.mapper.PmsProductCategoryMapper;
import com.sigma429.mall.mapper.PmsProductMapper;
import com.sigma429.mall.model.PmsProductAttributeCategory;
import com.sigma429.mall.model.PmsProductAttributeCategoryExample;
import com.sigma429.mall.model.PmsProductCategory;
import com.sigma429.mall.service.PmsProductAttributeCategoryService;
import org.apache.commons.collections.BagUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private PmsProductAttributeCategoryMapper productAttributeCategoryMapper;
    @Autowired
    private PmsProductAttributeCategoryDao productAttributeCategoryDao;

    @Override
    public int create(String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        return productAttributeCategoryMapper.insertSelective(productAttributeCategory);
    }

    @Override
    public int update(Long id, String name) {
        PmsProductAttributeCategory productAttributeCategory = new PmsProductAttributeCategory();
        productAttributeCategory.setName(name);
        productAttributeCategory.setId(id);
        return productAttributeCategoryMapper.updateByPrimaryKeySelective(productAttributeCategory);
    }

    @Override
    public int delete(Long id) {
        return productAttributeCategoryMapper.deleteByPrimaryKey(id);
    }

    @Override
    public PmsProductAttributeCategory getItem(Long id) {
        return productAttributeCategoryMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<PmsProductAttributeCategory> getList(Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        return productAttributeCategoryMapper.selectByExample(new PmsProductAttributeCategoryExample());
    }

    @Override
    public List<PmsProductAttributeCategoryItem> getListWithAttr() {
        return productAttributeCategoryDao.getListWithAttr();
    }
}
