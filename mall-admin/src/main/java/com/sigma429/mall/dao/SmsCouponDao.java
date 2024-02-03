package com.sigma429.mall.dao;

import com.sigma429.mall.dto.SmsCouponParam;
import org.apache.ibatis.annotations.Param;

/**
 * 自定义优惠券管理Dao
 */
public interface SmsCouponDao {
    /**
     * 获取优惠券详情包括绑定关系
     */
    SmsCouponParam getItem(@Param("id") Long id);
}
