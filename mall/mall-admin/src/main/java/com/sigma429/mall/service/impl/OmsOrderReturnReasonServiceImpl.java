package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.OmsOrderReturnReason;
import com.sigma429.mall.service.OmsOrderReturnReasonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OmsOrderReturnReasonServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:订单原因管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:40
 * @Version:v1.0
 */
@Service
public class OmsOrderReturnReasonServiceImpl implements OmsOrderReturnReasonService {
    @Override
    public int create(OmsOrderReturnReason returnReason) {
        return 0;
    }

    @Override
    public int update(Long id, OmsOrderReturnReason returnReason) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<OmsOrderReturnReason> list(Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int updateStatus(List<Long> ids, Integer status) {
        return 0;
    }

    @Override
    public OmsOrderReturnReason getItem(Long id) {
        return null;
    }
}
