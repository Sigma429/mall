package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.OssCallbackResult;
import com.sigma429.mall.dto.OssPolicyResult;
import com.sigma429.mall.service.OssService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * ClassName:OssServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:oss上传管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:42
 * @Version:v1.0
 */
@Service
public class OssServiceImpl implements OssService {
    @Override
    public OssPolicyResult policy() {
        return null;
    }

    @Override
    public OssCallbackResult callback(HttpServletRequest request) {
        return null;
    }
}
