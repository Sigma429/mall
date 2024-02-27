package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.mapper.SmsCouponHistoryMapper;
import com.sigma429.mall.model.SmsCouponHistory;
import com.sigma429.mall.model.SmsCouponHistoryExample;
import com.sigma429.mall.service.SmsCouponHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

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
    @Autowired
    private SmsCouponHistoryMapper historyMapper;

    @Override
    public List<SmsCouponHistory> list(Long couponId, Integer useStatus, String orderSn, Integer pageSize,
                                       Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsCouponHistoryExample example = new SmsCouponHistoryExample();
        SmsCouponHistoryExample.Criteria criteria = example.createCriteria();
        if (couponId != null) {
            criteria.andCouponIdEqualTo(couponId);
        }
        if (useStatus != null) {
            criteria.andUseStatusEqualTo(useStatus);
        }
        if (!StringUtils.isEmpty(orderSn)) {
            criteria.andOrderSnEqualTo(orderSn);
        }
        return historyMapper.selectByExample(example);
    }
}
