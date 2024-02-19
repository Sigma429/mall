package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.MemberProductCollection;
import com.sigma429.mall.service.MemberCollectionService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

/**
 * ClassName:MemberCollectionServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:26
 * @Version:v1.0
 */
@Service
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Override
    public int add(MemberProductCollection productCollection) {
        return 0;
    }

    @Override
    public int delete(Long productId) {
        return 0;
    }

    @Override
    public Page<MemberProductCollection> list(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public MemberProductCollection detail(Long productId) {
        return null;
    }

    @Override
    public void clear() {

    }
}
