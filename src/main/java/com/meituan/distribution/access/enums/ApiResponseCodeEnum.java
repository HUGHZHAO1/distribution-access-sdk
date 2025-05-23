package com.meituan.distribution.access.enums;

public enum ApiResponseCodeEnum {

    OK(0, "成功"),
    PARAM_INVALID(1000, "参数非法"),
    AUTHENTICATION_FAIL(1100, "鉴权失败"),
    QUOTA_EXCEED(1200, "超过配额"),
    BLACK_LIST(1300, "黑名单"),
    OTHER(2000, "系统错误");

    private Integer code;

    private String message;

    ApiResponseCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
