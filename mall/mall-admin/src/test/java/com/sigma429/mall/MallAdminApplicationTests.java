package com.sigma429.mall;

import cn.hutool.crypto.digest.BCrypt;
import com.sigma429.mall.mapper.UmsAdminMapper;
import com.sigma429.mall.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MallAdminApplicationTests {
    @Autowired
    private UmsAdminMapper adminMapper;
    @Test
    void contextLoads() {
    }
    @Test
    public void register(){
        UmsAdmin umsAdmin = new UmsAdmin();

        // 将密码进行加密操作
        String encodePassword = BCrypt.hashpw("123");
        System.out.println(encodePassword);
    }
}
