package com.sigma429.mall.service.impl;

import com.github.pagehelper.PageHelper;
import com.sigma429.mall.mapper.SmsFlashPromotionMapper;
import com.sigma429.mall.model.SmsFlashPromotion;
import com.sigma429.mall.model.SmsFlashPromotionExample;
import com.sigma429.mall.service.SmsFlashPromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * ClassName:SmsFlashPromotionServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:限时购活动管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:48
 * @Version:v1.0
 */
@Service
public class SmsFlashPromotionServiceImpl implements SmsFlashPromotionService {
    @Autowired
    private SmsFlashPromotionMapper flashPromotionMapper;

    @Override
    public int create(SmsFlashPromotion flashPromotion) {
        flashPromotion.setCreateTime(new Date());
        return flashPromotionMapper.insert(flashPromotion);
    }

    @Override
    public int update(Long id, SmsFlashPromotion flashPromotion) {
        flashPromotion.setId(id);
        return flashPromotionMapper.updateByPrimaryKey(flashPromotion);
    }

    @Override
    public int delete(Long id) {
        return flashPromotionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int updateStatus(Long id, Integer status) {
        SmsFlashPromotion flashPromotion = new SmsFlashPromotion();
        flashPromotion.setId(id);
        flashPromotion.setStatus(status);
        return flashPromotionMapper.updateByPrimaryKeySelective(flashPromotion);
    }

    @Override
    public SmsFlashPromotion getItem(Long id) {
        return flashPromotionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SmsFlashPromotionExample example = new SmsFlashPromotionExample();
        if (!StringUtils.isEmpty(keyword)) {
            example.createCriteria().andTitleLike("%" + keyword + "%");
        }
        return flashPromotionMapper.selectByExample(example);
    }
}
