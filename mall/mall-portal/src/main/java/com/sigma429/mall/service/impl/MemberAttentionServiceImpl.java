package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.MemberBrandAttention;
import com.sigma429.mall.service.MemberAttentionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * ClassName:MemberAttentionServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:26
 * @Version:v1.0
 */
@Service
public class MemberAttentionServiceImpl implements MemberAttentionService {
    @Override
    public int add(MemberBrandAttention memberBrandAttention) {
        return 0;
    }

    @Override
    public int delete(Long brandId) {
        return 0;
    }

    @Override
    public Page<MemberBrandAttention> list(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public MemberBrandAttention detail(Long brandId) {
        return null;
    }

    @Override
    public void clear() {

    }
}
