package com.sigma429.mall.service.impl;

import com.sigma429.mall.api.CommonPage;
import com.sigma429.mall.domain.ConfirmOrderResult;
import com.sigma429.mall.domain.OmsOrderDetail;
import com.sigma429.mall.domain.OrderParam;
import com.sigma429.mall.service.OmsPortalOrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * ClassName:OmsPortalOrderServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:27
 * @Version:v1.0
 */
@Service
public class OmsPortalOrderServiceImpl implements OmsPortalOrderService {
    @Override
    public ConfirmOrderResult generateConfirmOrder(List<Long> cartIds) {
        return null;
    }

    @Override
    public Map<String, Object> generateOrder(OrderParam orderParam) {
        return null;
    }

    @Override
    public Integer paySuccess(Long orderId, Integer payType) {
        return null;
    }

    @Override
    public Integer cancelTimeOutOrder() {
        return null;
    }

    @Override
    public void cancelOrder(Long orderId) {

    }

    @Override
    public void sendDelayMessageCancelOrder(Long orderId) {

    }

    @Override
    public void confirmReceiveOrder(Long orderId) {

    }

    @Override
    public CommonPage<OmsOrderDetail> list(Integer status, Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public OmsOrderDetail detail(Long orderId) {
        return null;
    }

    @Override
    public void deleteOrder(Long orderId) {

    }

    @Override
    public void paySuccessByOrderSn(String orderSn, Integer payType) {

    }
}
