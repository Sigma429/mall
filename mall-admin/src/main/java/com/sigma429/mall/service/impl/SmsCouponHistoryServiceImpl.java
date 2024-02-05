package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.SmsCouponHistory;
import com.sigma429.mall.service.SmsCouponHistoryService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsCouponHistoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:优惠券领取记录管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:46
 * @Version:v1.0
 */
@Service
public class SmsCouponHistoryServiceImpl implements SmsCouponHistoryService {
    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize, Integer pageNum) {
        return null;
    }
}
