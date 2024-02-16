package com.sigma429.mall;

import cn.hutool.crypto.digest.BCrypt;
import com.sigma429.mall.mapper.UmsAdminMapper;
import com.sigma429.mall.model.UmsAdmin;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootTest
@RestController
class MallAdminApplicationTests {
    @Test
    void contextLoads() {
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
