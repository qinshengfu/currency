package com.qsf.currency.enums;

import lombok.Getter;

/**
 * 统一枚举
 * @Author QSF
 * @Date 2020/8/3 11:13
 * @Version 1.0
 */
@Getter
public enum ResultEnum {
    SUCCESS(0, "成功"),

    PARAM_ERROR(1, "参数不正确"),
    ;

    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
