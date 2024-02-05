package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.PmsProductParam;
import com.sigma429.mall.dto.PmsProductQueryParam;
import com.sigma429.mall.dto.PmsProductResult;
import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.service.PmsProductService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:PmsProductServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:44
 * @Version:v1.0
 */
@Service
public class PmsProductServiceImpl implements PmsProductService {
    @Override
    public int create(PmsProductParam productParam) {
        return 0;
    }

    @Override
    public PmsProductResult getUpdateInfo(Long id) {
        return null;
    }

    @Override
    public int update(Long id, PmsProductParam productParam) {
        return 0;
    }

    @Override
    public List<PmsProduct> list(PmsProductQueryParam productQueryParam, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int updateVerifyStatus(List<Long> ids, Integer verifyStatus, String detail) {
        return 0;
    }

    @Override
    public int updatePublishStatus(List<Long> ids, Integer publishStatus) {
        return 0;
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        return 0;
    }

    @Override
    public int updateNewStatus(List<Long> ids, Integer newStatus) {
        return 0;
    }

    @Override
    public int updateDeleteStatus(List<Long> ids, Integer deleteStatus) {
        return 0;
    }

    @Override
    public List<PmsProduct> list(String keyword) {
        return null;
    }
}
