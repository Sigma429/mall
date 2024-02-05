package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.SmsHomeNewProduct;
import com.sigma429.mall.service.SmsHomeNewProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsHomeNewProductServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:首页新品推荐管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:50
 * @Version:v1.0
 */
@Service
public class SmsHomeNewProductServiceImpl implements SmsHomeNewProductService {
    @Override
    public int create(List<SmsHomeNewProduct> homeNewProductList) {
        return 0;
    }

    @Override
    public int updateSort(Long id, Integer sort) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        return 0;
    }

    @Override
    public List<SmsHomeNewProduct> list(String productName, Integer recommendStatus, Integer pageSize, Integer pageNum) {
        return null;
    }
}
