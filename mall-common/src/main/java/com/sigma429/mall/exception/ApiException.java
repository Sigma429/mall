package com.sigma429.mall.exception;

import com.sigma429.mall.api.IErrorCode;

/**
 * ClassName:ApiException
 * Package:com.sigma429.mall.exception
 * Description:
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/04 - 17:28
 * @Version:v1.0
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
