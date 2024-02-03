package com.sigma429.mall.service.impl;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.domain.UserDTO;
import com.sigma429.mall.dto.UmsAdminParam;
import com.sigma429.mall.dto.UpdateAdminPasswordParam;
import com.sigma429.mall.model.UmsAdmin;
import com.sigma429.mall.model.UmsResource;
import com.sigma429.mall.model.UmsRole;
import com.sigma429.mall.service.UmsAdminCacheService;
import com.sigma429.mall.service.UmsAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName:UmsAdminServiceImpl
 * Package:com.sigma429.mall.service.impl
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/03 - 23:02
 * @Version:v1.0
 */
@Service
public class UmsAdminServiceImpl implements UmsAdminService {
    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        return null;
    }

    @Override
    public CommonResult login(String username, String password) {
        return null;
    }

    @Override
    public UmsAdmin getItem(Long id) {
        return null;
    }

    @Override
    public List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int update(Long id, UmsAdmin admin) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int updateRole(Long adminId, List<Long> roleIds) {
        return 0;
    }

    @Override
    public List<UmsRole> getRoleList(Long adminId) {
        return null;
    }

    @Override
    public List<UmsResource> getResourceList(Long adminId) {
        return null;
    }

    @Override
    public int updatePassword(UpdateAdminPasswordParam updatePasswordParam) {
        return 0;
    }

    @Override
    public UserDTO loadUserByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin getCurrentAdmin() {
        return null;
    }

    @Override
    public UmsAdminCacheService getCacheService() {
        return null;
    }
}
