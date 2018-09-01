package com.keyway.user.vo;

import lombok.Data;

/**
 * 返回给前端的数据封装
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
