package com.sigma429.mall.service.impl;

import com.sigma429.mall.mapper.CmsPrefrenceAreaMapper;
import com.sigma429.mall.model.CmsPrefrenceArea;
import com.sigma429.mall.model.CmsPrefrenceAreaExample;
import com.sigma429.mall.service.CmsPrefrenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:CmsPrefrenceAreaServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品优选管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:38
 * @Version:v1.0
 */
@Service
public class CmsPrefrenceAreaServiceImpl implements CmsPrefrenceAreaService {
    @Autowired
    private CmsPrefrenceAreaMapper prefrenceAreaMapper;

    @Override
    public List<CmsPrefrenceArea> listAll() {
        return prefrenceAreaMapper.selectByExample(new CmsPrefrenceAreaExample());
    }
}
