package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.SmsHomeAdvertise;
import com.sigma429.mall.service.SmsHomeAdvertiseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsHomeAdvertiseServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:首页广告管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:49
 * @Version:v1.0
 */
@Service
public class SmsHomeAdvertiseServiceImpl implements SmsHomeAdvertiseService {
    @Override
    public int create(SmsHomeAdvertise advertise) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateStatus(Long id, Integer status) {
        return 0;
    }

    @Override
    public SmsHomeAdvertise getItem(Long id) {
        return null;
    }

    @Override
    public int update(Long id, SmsHomeAdvertise advertise) {
        return 0;
    }

    @Override
    public List<SmsHomeAdvertise> list(String name, Integer type, String endTime, Integer pageSize, Integer pageNum) {
        return null;
    }
}
