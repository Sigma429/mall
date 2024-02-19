package com.sigma429.mall.service.impl;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.domain.UserDTO;
import com.sigma429.mall.model.UmsMember;
import com.sigma429.mall.service.UmsMemberService;
import org.springframework.stereotype.Service;

/**
 * ClassName:UmsMemberServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:28
 * @Version:v1.0
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Override
    public UmsMember getByUsername(String username) {
        return null;
    }

    @Override
    public UmsMember getById(Long id) {
        return null;
    }

    @Override
    public void register(String username, String password, String telephone, String authCode) {

    }

    @Override
    public String generateAuthCode(String telephone) {
        return null;
    }

    @Override
    public void updatePassword(String telephone, String password, String authCode) {

    }

    @Override
    public UmsMember getCurrentMember() {
        return null;
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {

    }

    @Override
    public UserDTO loadUserByUsername(String username) {
        return null;
    }

    @Override
    public CommonResult login(String username, String password) {
        return null;
    }
}
