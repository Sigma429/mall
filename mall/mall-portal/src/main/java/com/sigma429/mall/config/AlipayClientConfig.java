package com.sigma429.mall.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 支付宝请求客户端配置
 */
@Configuration
public class AlipayClientConfig {

    @Bean
    public AlipayClient alipayClient(AlipayConfig config) {
        return new DefaultAlipayClient(config.getGatewayUrl(), config.getAppId(), config.getAppPrivateKey(),
                config.getFormat(), config.getCharset(), config.getAlipayPublicKey(), config.getSignType());
    }
}
