package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.OmsOrderReturnApplyParam;
import com.sigma429.mall.mapper.OmsOrderReturnApplyMapper;
import com.sigma429.mall.model.OmsOrderReturnApply;
import com.sigma429.mall.service.OmsPortalOrderReturnApplyService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * ClassName:OmsPortalOrderReturnApplyServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:订单退货管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:27
 * @Version:v1.0
 */
@Service
public class OmsPortalOrderReturnApplyServiceImpl implements OmsPortalOrderReturnApplyService {
    @Autowired
    private OmsOrderReturnApplyMapper returnApplyMapper;

    @Override
    public int create(OmsOrderReturnApplyParam returnApply) {
        OmsOrderReturnApply realApply = new OmsOrderReturnApply();
        BeanUtils.copyProperties(returnApply, realApply);
        realApply.setCreateTime(new Date());
        realApply.setStatus(0);
        return returnApplyMapper.insert(realApply);
    }
}
