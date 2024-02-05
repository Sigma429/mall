package com.sigma429.mall.service.impl;

import cn.hutool.core.util.StrUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.api.ResultCode;
import com.sigma429.mall.dao.UmsAdminRoleRelationDao;
import com.sigma429.mall.domain.UserDTO;
import com.sigma429.mall.dto.UmsAdminParam;
import com.sigma429.mall.dto.UpdateAdminPasswordParam;
import com.sigma429.mall.exception.Asserts;
import com.sigma429.mall.mapper.UmsAdminLoginLogMapper;
import com.sigma429.mall.mapper.UmsAdminMapper;
import com.sigma429.mall.mapper.UmsAdminRoleRelationMapper;
import com.sigma429.mall.model.UmsAdmin;
import com.sigma429.mall.model.UmsAdminExample;
import com.sigma429.mall.model.UmsResource;
import com.sigma429.mall.model.UmsRole;
import com.sigma429.mall.service.AuthService;
import com.sigma429.mall.service.UmsAdminCacheService;
import com.sigma429.mall.service.UmsAdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private static final Logger LOGGER = LoggerFactory.getLogger(UmsAdminServiceImpl.class);
    @Autowired
    private UmsAdminMapper adminMapper;
    @Autowired
    private UmsAdminRoleRelationMapper adminRoleRelationMapper;
    @Autowired
    private UmsAdminRoleRelationDao adminRoleRelationDao;
    @Autowired
    private UmsAdminLoginLogMapper loginLogMapper;
    @Autowired
    private AuthService authService;
    @Autowired
    private HttpServletRequest request;

    @Override
    public UmsAdmin getAdminByUsername(String username) {
        return null;
    }

    @Override
    public UmsAdmin register(UmsAdminParam umsAdminParam) {
        UmsAdmin umsAdmin = new UmsAdmin();
        BeanUtils.copyProperties(umsAdminParam, umsAdmin);
        umsAdmin.setCreateTime(new Date());
        umsAdmin.setStatus(1);
        // 查询是否有相同用户名的用户
        UmsAdminExample example = new UmsAdminExample();
        example.createCriteria().andUsernameEqualTo(umsAdminParam.getUsername());
        List<UmsAdmin> umsAdminList = adminMapper.selectByExample(example);
        if (umsAdminList.size() > 0) {
            return null;
        }
        // 将密码进行加密操作
        String encodePassword = BCrypt.hashpw(umsAdmin.getPassword());
        umsAdmin.setPassword(encodePassword);
        adminMapper.insert(umsAdmin);
        return umsAdmin;
    }

    @Override
    public CommonResult login(String username, String password) {
        if(StrUtil.isEmpty(username) || StrUtil.isEmpty(password)){
            Asserts.fail("用户名或密码不能为空！");
        }
        Map<String, String> params = new HashMap<>();
//         params.put("client_id", AuthConstant.ADMIN_CLIENT_ID);
//         params.put("client_secret", "123456");
//         params.put("grant_type", "password");
//         params.put("username", username);
//         params.put("password", password);
//         CommonResult restResult = authService.getAccessToken(params);
//         if (ResultCode.SUCCESS.getCode() == restResult.getCode() && restResult.getData() != null) {
// //            updateLoginTimeByUsername(username);
//             insertLoginLog(username);
//         }
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
