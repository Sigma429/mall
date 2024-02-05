package com.sigma429.mall.exception;

import com.sigma429.mall.api.IErrorCode;

/**
 * ClassName:Asserts
 * Package:com.sigma429.mall.exception
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 17:27
 * @Version:v1.0
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}