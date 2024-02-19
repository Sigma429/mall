package com.sigma429.mall.service.impl;

import com.sigma429.mall.domain.CartProduct;
import com.sigma429.mall.domain.CartPromotionItem;
import com.sigma429.mall.model.OmsCartItem;
import com.sigma429.mall.service.OmsCartItemService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:OmsCartItemServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/20 - 2:26
 * @Version:v1.0
 */
@Service
public class OmsCartItemServiceImpl implements OmsCartItemService {
    @Override
    public int add(OmsCartItem cartItem) {
        return 0;
    }

    @Override
    public List<OmsCartItem> list(Long memberId) {
        return null;
    }

    @Override
    public List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds) {
        return null;
    }

    @Override
    public int updateQuantity(Long id, Long memberId, Integer quantity) {
        return 0;
    }

    @Override
    public int delete(Long memberId, List<Long> ids) {
        return 0;
    }

    @Override
    public CartProduct getCartProduct(Long productId) {
        return null;
    }

    @Override
    public int updateAttr(OmsCartItem cartItem) {
        return 0;
    }

    @Override
    public int clear(Long memberId) {
        return 0;
    }
}
