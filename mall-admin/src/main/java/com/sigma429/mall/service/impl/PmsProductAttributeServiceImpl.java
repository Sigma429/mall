package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.PmsProductAttributeParam;
import com.sigma429.mall.dto.ProductAttrInfo;
import com.sigma429.mall.model.PmsProductAttribute;
import com.sigma429.mall.service.PmsProductAttributeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsProductAttributeServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品属性Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:43
 * @Version:v1.0
 */
@Service
public class PmsProductAttributeServiceImpl implements PmsProductAttributeService {
    @Override
    public List<PmsProductAttribute> getList(Long cid, Integer type, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int create(PmsProductAttributeParam pmsProductAttributeParam) {
        return 0;
    }

    @Override
    public int update(Long id, PmsProductAttributeParam productAttributeParam) {
        return 0;
    }

    @Override
    public PmsProductAttribute getItem(Long id) {
        return null;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<ProductAttrInfo> getProductAttrInfo(Long productCategoryId) {
        return null;
    }
}
