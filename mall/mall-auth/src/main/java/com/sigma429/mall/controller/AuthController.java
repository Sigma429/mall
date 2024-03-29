package com.sigma429.mall.controller;

import com.sigma429.mall.api.CommonResult;
import com.sigma429.mall.constant.AuthConstant;
import com.sigma429.mall.domain.Oauth2TokenDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.TokenEndpoint;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * ClassName:AuthController
 * Package:com.sigma429.mall.controller
 * Description:自定义Oauth2获取令牌接口
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 17:54
 * @Version:v1.0
 */
@RestController
@Api(tags = "AuthController", description = "认证中心登录认证")
@RequestMapping("/oauth")
public class AuthController {
    @Autowired
    private TokenEndpoint tokenEndpoint;

    @ApiOperation("Oauth2获取token")
    @PostMapping("/token")
    public CommonResult<Oauth2TokenDTO> postAccessToken(HttpServletRequest request,
                                                        @ApiParam("授权模式") @RequestParam String grant_type,
                                                        @ApiParam("Oauth2客户端ID") @RequestParam String client_id,
                                                        @ApiParam("Oauth2客户端秘钥") @RequestParam String client_secret,
                                                        @ApiParam("刷新token") @RequestParam(required = false) String refresh_token,
                                                        @ApiParam("登录用户名") @RequestParam(required = false) String username,
                                                        @ApiParam("登录密码") @RequestParam(required = false) String password) throws HttpRequestMethodNotSupportedException {
        Map<String, String> parameters = new HashMap<>();
        parameters.put("grant_type", grant_type);
        parameters.put("client_id", client_id);
        parameters.put("client_secret", client_secret);
        parameters.putIfAbsent("refresh_token", refresh_token);
        parameters.putIfAbsent("username", username);
        parameters.putIfAbsent("password", password);
        OAuth2AccessToken oAuth2AccessToken =
                tokenEndpoint.postAccessToken(request.getUserPrincipal(), parameters).getBody();
        Oauth2TokenDTO oauth2TokenDTO =
                Oauth2TokenDTO.builder().token(oAuth2AccessToken.getValue()).refreshToken(oAuth2AccessToken.getRefreshToken().getValue()).expiresIn(oAuth2AccessToken.getExpiresIn()).tokenHead(AuthConstant.JWT_TOKEN_PREFIX).build();

        return CommonResult.success(oauth2TokenDTO);
    }
}
