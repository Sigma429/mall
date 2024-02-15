package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.SmsFlashPromotionSessionDetail;
import com.sigma429.mall.model.SmsFlashPromotionSession;
import com.sigma429.mall.service.SmsFlashPromotionSessionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:SmsFlashPromotionSessionServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:限时购场次管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:49
 * @Version:v1.0
 */
@Service
public class SmsFlashPromotionSessionServiceImpl implements SmsFlashPromotionSessionService {
    @Override
    public int create(SmsFlashPromotionSession promotionSession) {
        return 0;
    }

    @Override
    public int update(Long id, SmsFlashPromotionSession promotionSession) {
        return 0;
    }

    @Override
    public int updateStatus(Long id, Integer status) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public SmsFlashPromotionSession getItem(Long id) {
        return null;
    }

    @Override
    public List<SmsFlashPromotionSession> list() {
        return null;
    }

    @Override
    public List<SmsFlashPromotionSessionDetail> selectList(Long flashPromotionId) {
        return null;
    }
}
