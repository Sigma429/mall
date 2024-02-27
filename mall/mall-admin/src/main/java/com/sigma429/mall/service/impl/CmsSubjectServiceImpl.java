package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.mapper.CmsSubjectMapper;
import com.sigma429.mall.model.CmsSubject;
import com.sigma429.mall.model.CmsSubjectExample;
import com.sigma429.mall.service.CmsSubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * ClassName:CmsSubjectServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:商品专题管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:39
 * @Version:v1.0
 */
@Service
public class CmsSubjectServiceImpl implements CmsSubjectService {
    @Autowired
    private CmsSubjectMapper subjectMapper;

    @Override
    public List<CmsSubject> listAll() {
        return subjectMapper.selectByExample(new CmsSubjectExample());
    }

    @Override
    public List<CmsSubject> list(String keyword, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        CmsSubjectExample example = new CmsSubjectExample();
        CmsSubjectExample.Criteria criteria = example.createCriteria();
        if (!StringUtils.isEmpty(keyword)) {
            criteria.andTitleLike("%" + keyword + "%");
        }
        return subjectMapper.selectByExample(example);
    }
}
