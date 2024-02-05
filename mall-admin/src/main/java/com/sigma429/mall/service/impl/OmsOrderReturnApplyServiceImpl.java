package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.OmsOrderReturnApplyResult;
import com.sigma429.mall.dto.OmsReturnApplyQueryParam;
import com.sigma429.mall.dto.OmsUpdateStatusParam;
import com.sigma429.mall.model.OmsOrderReturnApply;
import com.sigma429.mall.service.OmsOrderReturnApplyService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OmsOrderReturnApplyServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:订单退货管理Service
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/06 - 1:40
 * @Version:v1.0
 */
@Service
public class OmsOrderReturnApplyServiceImpl implements OmsOrderReturnApplyService {
    @Override
    public List<OmsOrderReturnApply> list(OmsReturnApplyQueryParam queryParam, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public int updateStatus(Long id, OmsUpdateStatusParam statusParam) {
        return 0;
    }

    @Override
    public OmsOrderReturnApplyResult getItem(Long id) {
        return null;
    }
}
