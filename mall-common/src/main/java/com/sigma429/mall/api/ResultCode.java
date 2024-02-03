package com.sigma429.mall.api;

/**
 * ClassName:ResultCode
 * Package:com.sigma429.mall.api
 * Description:枚举了一些常用API操作码
 * @Author:14亿少女的梦-Sigma429
 * @Create:2024/02/03 - 19:15
 * @Version:v1.0
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已经过期"),
    FORBIDDEN(403, "没有相关权限");
    private long code;
    private String message;

    private ResultCode(long code, String message) {
        this.code = code;
        this.message = message;
    }

    public long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}

