package com.sigma429.mall.service.impl;

import com.sigma429.mall.mapper.UmsMemberLevelMapper;
import com.sigma429.mall.model.UmsMemberLevel;
import com.sigma429.mall.model.UmsMemberLevelExample;
import com.sigma429.mall.service.UmsMemberLevelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsMemberLevelServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:会员等级管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:53
 * @Version:v1.0
 */
@Service
public class UmsMemberLevelServiceImpl implements UmsMemberLevelService {
    @Autowired
    private UmsMemberLevelMapper memberLevelMapper;

    @Override
    public List<UmsMemberLevel> list(Integer defaultStatus) {
        UmsMemberLevelExample example = new UmsMemberLevelExample();
        example.createCriteria().andDefaultStatusEqualTo(defaultStatus);
        return memberLevelMapper.selectByExample(example);
    }
}
