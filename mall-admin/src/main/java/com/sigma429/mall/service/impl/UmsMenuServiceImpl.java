package com.sigma429.mall.service.impl;

import com.sigma429.mall.dto.UmsMenuNode;
import com.sigma429.mall.model.UmsMenu;
import com.sigma429.mall.service.UmsMenuService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsMenuServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 14:01
 * @Version:v1.0
 */
@Service
public class UmsMenuServiceImpl implements UmsMenuService {
    @Override
    public int create(UmsMenu umsMenu) {
        return 0;
    }

    @Override
    public int update(Long id, UmsMenu umsMenu) {
        return 0;
    }

    @Override
    public UmsMenu getItem(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public List<UmsMenu> list(Long parentId, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<UmsMenuNode> treeList() {
        return null;
    }

    @Override
    public int updateHidden(Long id, Integer hidden) {
        return 0;
    }
}
