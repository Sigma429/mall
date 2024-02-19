package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.MemberReadHistory;
import com.sigma429.mall.service.MemberReadHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:MemberReadHistoryServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:26
 * @Version:v1.0
 */
@Service
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
    @Override
    public int create(MemberReadHistory memberReadHistory) {
        return 0;
    }

    @Override
    public int delete(List<String> ids) {
        return 0;
    }

    @Override
    public Page<MemberReadHistory> list(Integer pageNum, Integer pageSize) {
        return null;
    }

    @Override
    public void clear() {

    }
}
