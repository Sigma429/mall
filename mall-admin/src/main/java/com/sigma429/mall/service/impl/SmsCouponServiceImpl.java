package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.SmsCouponParam;
import com.sigma429.mall.model.SmsCoupon;
import com.sigma429.mall.service.SmsCouponService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsCouponServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:优惠券管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:46
 * @Version:v1.0
 */
@Service
public class SmsCouponServiceImpl implements SmsCouponService {
    @Override
    public int create(SmsCouponParam couponParam) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(Long id, SmsCouponParam couponParam) {
        return 0;
    }

    @Override
    public List<SmsCoupon> list(String name, Integer type, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public SmsCouponParam getItem(Long id) {
        return null;
    }
}
