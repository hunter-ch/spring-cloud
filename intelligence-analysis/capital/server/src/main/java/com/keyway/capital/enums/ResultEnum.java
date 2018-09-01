package com.keyway.capital.enums;

import lombok.Getter;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:54
 */
@Getter
public enum ResultEnum {
    SUCCESS(0, "请求成功"),
    FAIL(1, "请求失败");

    /** 状态码 */
    private Integer code;

    /** 状态码信息 */
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
