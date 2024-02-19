package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.CartPromotionItem;
import com.sigma429.mall.domain.SmsCouponHistoryDetail;
import com.sigma429.mall.model.SmsCoupon;
import com.sigma429.mall.model.SmsCouponHistory;
import com.sigma429.mall.service.UmsMemberCouponService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsMemberCouponServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:28
 * @Version:v1.0
 */
@Service
public class UmsMemberCouponServiceImpl implements UmsMemberCouponService {
    @Override
    public void add(Long couponId) {

    }

    @Override
    public List<SmsCouponHistory> listHistory(Integer useStatus) {
        return null;
    }

    @Override
    public List<SmsCouponHistoryDetail> listCart(List<CartPromotionItem> cartItemList, Integer type) {
        return null;
    }

    @Override
    public List<SmsCoupon> listByProduct(Long productId) {
        return null;
    }

    @Override
    public List<SmsCoupon> list(Integer useStatus) {
        return null;
    }
}
