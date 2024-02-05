package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.PmsSkuStock;
import com.sigma429.mall.service.PmsSkuStockService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsSkuStockServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品sku库存管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:45
 * @Version:v1.0
 */
@Service
public class PmsSkuStockServiceImpl implements PmsSkuStockService {
    @Override
    public List<PmsSkuStock> getList(Long pid, String keyword) {
        return null;
    }

    @Override
    public int update(Long pid, List<PmsSkuStock> skuStockList) {
        return 0;
    }
}
