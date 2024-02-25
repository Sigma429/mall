package com.sigma429.mall.service.impl;

import com.sigma429.mall.mapper.OmsCompanyAddressMapper;
import com.sigma429.mall.model.OmsCompanyAddress;
import com.sigma429.mall.model.OmsCompanyAddressExample;
import com.sigma429.mall.service.OmsCompanyAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OmsCompanyAddressServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:收货地址管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:39
 * @Version:v1.0
 */
@Service
public class OmsCompanyAddressServiceImpl implements OmsCompanyAddressService {
    @Autowired
    private OmsCompanyAddressMapper companyAddressMapper;

    @Override
    public List<OmsCompanyAddress> list() {
        return companyAddressMapper.selectByExample(new OmsCompanyAddressExample());
    }
}
