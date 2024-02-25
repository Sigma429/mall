package com.sigma429.mall.service.impl;

import cn.hutool.core.collection.CollUtil;
import com.sigma429.mall.dao.PortalProductDao;
import com.sigma429.mall.domain.CartProduct;
import com.sigma429.mall.domain.CartPromotionItem;
import com.sigma429.mall.mapper.OmsCartItemMapper;
import com.sigma429.mall.model.OmsCartItem;
import com.sigma429.mall.model.OmsCartItemExample;
import com.sigma429.mall.model.UmsMember;
import com.sigma429.mall.service.OmsCartItemService;
import com.sigma429.mall.service.OmsPromotionService;
import com.sigma429.mall.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

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
    @Autowired
    private OmsCartItemMapper cartItemMapper;
    @Autowired
    private PortalProductDao productDao;
    @Autowired
    private OmsPromotionService promotionService;
    @Autowired
    private UmsMemberService memberService;

    @Override
    public int add(OmsCartItem cartItem) {
        int count;
        UmsMember currentMember = memberService.getCurrentMember();
        cartItem.setMemberId(currentMember.getId());
        cartItem.setMemberNickname(currentMember.getNickname());
        cartItem.setDeleteStatus(0);
        OmsCartItem existCartItem = getCartItem(cartItem);
        if (existCartItem == null) {
            cartItem.setCreateDate(new Date());
            count = cartItemMapper.insert(cartItem);
        } else {
            cartItem.setModifyDate(new Date());
            existCartItem.setQuantity(existCartItem.getQuantity() + cartItem.getQuantity());
            count = cartItemMapper.updateByPrimaryKey(existCartItem);
        }
        return count;
    }

    /**
     * 根据会员id,商品id和规格获取购物车中商品
     */
    private OmsCartItem getCartItem(OmsCartItem cartItem) {
        OmsCartItemExample example = new OmsCartItemExample();
        OmsCartItemExample.Criteria criteria = example.createCriteria().andMemberIdEqualTo(cartItem.getMemberId())
                .andProductIdEqualTo(cartItem.getProductId()).andDeleteStatusEqualTo(0);
        if (cartItem.getProductSkuId() != null) {
            criteria.andProductSkuIdEqualTo(cartItem.getProductSkuId());
        }
        List<OmsCartItem> cartItemList = cartItemMapper.selectByExample(example);
        if (!CollectionUtils.isEmpty(cartItemList)) {
            return cartItemList.get(0);
        }
        return null;
    }

    @Override
    public List<OmsCartItem> list(Long memberId) {
        OmsCartItemExample example = new OmsCartItemExample();
        example.createCriteria().andDeleteStatusEqualTo(0).andMemberIdEqualTo(memberId);
        return cartItemMapper.selectByExample(example);
    }

    @Override
    public List<CartPromotionItem> listPromotion(Long memberId, List<Long> cartIds) {
        List<OmsCartItem> cartItemList = list(memberId);
        if (CollUtil.isNotEmpty(cartIds)) {
            cartItemList = cartItemList.stream()
                    .filter(item -> cartIds.contains(item.getId()))
                    .collect(Collectors.toList());
        }
        List<CartPromotionItem> cartPromotionItemList = new ArrayList<>();
        if (!CollectionUtils.isEmpty(cartItemList)) {
            cartPromotionItemList = promotionService.calcCartPromotion(cartItemList);
        }
        return cartPromotionItemList;
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
