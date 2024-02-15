package com.sigma429.mall.dto;

import com.sigma429.mall.model.PmsProduct;
import com.sigma429.mall.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购及商品信息封装
 */
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @Getter
    @Setter
    @ApiModelProperty("关联商品")
    private PmsProduct product;
}
