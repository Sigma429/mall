package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.SmsHomeRecommendSubject;
import com.sigma429.mall.service.SmsHomeRecommendSubjectService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsHomeRecommendSubjectServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:首页专题推荐管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:52
 * @Version:v1.0
 */
@Service
public class SmsHomeRecommendSubjectServiceImpl implements SmsHomeRecommendSubjectService {
    @Override
    public int create(List<SmsHomeRecommendSubject> recommendSubjectList) {
        return 0;
    }

    @Override
    public int updateSort(Long id, Integer sort) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateRecommendStatus(List<Long> ids, Integer recommendStatus) {
        return 0;
    }

    @Override
    public List<SmsHomeRecommendSubject> list(String subjectName, Integer recommendStatus, Integer pageSize, Integer pageNum) {
        return null;
    }
}
