package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.SmsFlashPromotion;
import com.sigma429.mall.service.SmsFlashPromotionService;
import org.springframework.stereotype.Service;

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
    @Override
    public int create(SmsFlashPromotion flashPromotion) {
        return 0;
    }

    @Override
    public int update(Long id, SmsFlashPromotion flashPromotion) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int updateStatus(Long id, Integer status) {
        return 0;
    }

    @Override
    public SmsFlashPromotion getItem(Long id) {
        return null;
    }

    @Override
    public List<SmsFlashPromotion> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }
}
