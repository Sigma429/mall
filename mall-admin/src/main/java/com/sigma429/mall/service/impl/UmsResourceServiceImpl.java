package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.UmsResource;
import com.sigma429.mall.service.UmsResourceService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * ClassName:UmsResourceServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 14:06
 * @Version:v1.0
 */
@Service

public class UmsResourceServiceImpl implements UmsResourceService {
    @Override
    public int create(UmsResource umsResource) {
        return 0;
    }

    @Override
    public int update(Long id, UmsResource umsResource) {
        return 0;
    }

    @Override
    public UmsResource getItem(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<UmsResource> list(Long categoryId, String nameKeyword, String urlKeyword, Integer pageSize,
                                  Integer pageNum) {
        return null;
    }

    @Override
    public List<UmsResource> listAll() {
        return null;
    }

    @Override
    public Map<String, List<String>> initResourceRolesMap() {
        return null;
    }
}
