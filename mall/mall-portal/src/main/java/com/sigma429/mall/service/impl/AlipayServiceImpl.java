package com.sigma429.mall.service.impl;

import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConfig;
import com.sigma429.mall.domain.AliPayParam;
import com.sigma429.mall.mapper.OmsOrderMapper;
import com.sigma429.mall.service.AlipayService;
import com.sigma429.mall.service.OmsPortalOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * ClassName:AlipayServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:25
 * @Version:v1.0
 */
@Slf4j
@Service
public class AlipayServiceImpl implements AlipayService {
    @Override
    public String pay(AliPayParam aliPayParam) {
        return null;
    }

    @Override
    public String notify(Map<String, String> params) {
        return null;
    }

    @Override
    public String query(String outTradeNo, String tradeNo) {
        return null;
    }

    @Override
    public String webPay(AliPayParam aliPayParam) {
        return null;
    }
}
