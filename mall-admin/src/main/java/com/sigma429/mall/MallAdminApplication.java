package com.sigma429.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MallAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallAdminApplication.class, args);
    }

}
