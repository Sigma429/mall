package com.sigma429.mall.service.impl;

import com.sigma429.mall.mapper.OmsOrderSettingMapper;
import com.sigma429.mall.model.OmsOrderSetting;
import com.sigma429.mall.service.OmsOrderSettingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ClassName:OmsOrderSettingServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:订单设置管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:41
 * @Version:v1.0
 */
@Service
public class OmsOrderSettingServiceImpl implements OmsOrderSettingService {
    @Autowired
    private OmsOrderSettingMapper orderSettingMapper;

    @Override
    public OmsOrderSetting getItem(Long id) {
        return orderSettingMapper.selectByPrimaryKey(id);
    }

    @Override
    public int update(Long id, OmsOrderSetting orderSetting) {
        orderSetting.setId(id);
        return orderSettingMapper.updateByPrimaryKey(orderSetting);
    }
}
