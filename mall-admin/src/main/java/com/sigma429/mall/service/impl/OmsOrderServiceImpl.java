package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.*;
import com.sigma429.mall.model.OmsOrder;
import com.sigma429.mall.service.OmsOrderService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OmsOrderServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:订单管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:41
 * @Version:v1.0
 */
@Service
public class OmsOrderServiceImpl implements OmsOrderService {
    @Override
    public List<OmsOrder> list(OmsOrderQueryParam queryParam, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int delivery(List<OmsOrderDeliveryParam> deliveryParamList) {
        return 0;
    }

    @Override
    public int close(List<Long> ids, String note) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public OmsOrderDetail detail(Long id) {
        return null;
    }

    @Override
    public int updateReceiverInfo(OmsReceiverInfoParam receiverInfoParam) {
        return 0;
    }

    @Override
    public int updateMoneyInfo(OmsMoneyInfoParam moneyInfoParam) {
        return 0;
    }

    @Override
    public int updateNote(Long id, String note, Integer status) {
        return 0;
    }
}
