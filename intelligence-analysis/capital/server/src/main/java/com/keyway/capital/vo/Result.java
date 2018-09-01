package com.keyway.capital.vo;

import lombok.Data;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:57
 */
@Data
public class Result<T> {
    /** 错误码 */
    private Integer code;

    /**  提示信息 */
    private String msg;

    /** 具体内容 */
    private T data;
}
