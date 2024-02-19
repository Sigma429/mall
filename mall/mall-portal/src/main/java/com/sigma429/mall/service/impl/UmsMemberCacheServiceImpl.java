package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.UmsMember;
import com.sigma429.mall.service.UmsMemberCacheService;
import org.springframework.stereotype.Service;

/**
 * ClassName:UmsMemberCacheServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:28
 * @Version:v1.0
 */
@Service
public class UmsMemberCacheServiceImpl implements UmsMemberCacheService {
    @Override
    public void delMember(Long memberId) {

    }

    @Override
    public UmsMember getMember(Long memberId) {
        return null;
    }

    @Override
    public void setMember(UmsMember member) {

    }

    @Override
    public void setAuthCode(String telephone, String authCode) {

    }

    @Override
    public String getAuthCode(String telephone) {
        return null;
    }
}
