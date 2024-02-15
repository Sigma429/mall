package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.SmsFlashPromotionProduct;
import com.sigma429.mall.model.SmsFlashPromotionProductRelation;
import com.sigma429.mall.service.SmsFlashPromotionProductRelationService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsFlashPromotionProductRelationServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:限时购商品关联管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:47
 * @Version:v1.0
 */
@Service
public class SmsFlashPromotionProductRelationServiceImpl implements SmsFlashPromotionProductRelationService {
    @Override
    public int create(List<SmsFlashPromotionProductRelation> relationList) {
        return 0;
    }

    @Override
    public int update(Long id, SmsFlashPromotionProductRelation relation) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public SmsFlashPromotionProductRelation getItem(Long id) {
        return null;
    }

    @Override
    public List<SmsFlashPromotionProduct> list(Long flashPromotionId, Long flashPromotionSessionId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public long getCount(Long flashPromotionId, Long flashPromotionSessionId) {
        return 0;
    }
}
