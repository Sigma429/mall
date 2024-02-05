package com.sigma429.mall.service.impl;

import com.sigma429.mall.model.UmsMenu;
import com.sigma429.mall.model.UmsResource;
import com.sigma429.mall.model.UmsRole;
import com.sigma429.mall.service.UmsRoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsRoleServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:后台角色管理Service实现类
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/03 - 23:02
 * @Version:v1.0
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Override
    public int create(UmsRole role) {
        return 0;
    }

    @Override
    public int update(Long id, UmsRole role) {
        return 0;
    }

    @Override
    public int delete(List<Long> ids) {
        return 0;
    }

    @Override
    public List<UmsRole> list() {
        return null;
    }

    @Override
    public List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public List<UmsMenu> getMenuList(Long adminId) {
        return null;
    }

    @Override
    public List<UmsMenu> listMenu(Long roleId) {
        return null;
    }

    @Override
    public List<UmsResource> listResource(Long roleId) {
        return null;
    }

    @Override
    public int allocMenu(Long roleId, List<Long> menuIds) {
        return 0;
    }

    @Override
    public int allocResource(Long roleId, List<Long> resourceIds) {
        return 0;
    }
}
