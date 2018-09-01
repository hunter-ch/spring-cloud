package com.keyway.user.util;

import com.keyway.user.enums.ResultEnum;
import com.keyway.user.vo.Result;

/**
 * 返回前端封装实体的工具类
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:00
 */
public class ResultUtil {
    /**
    * 响应成功返回实体
    *
    * @param data 数据
    * @author hunter
    * @since 2018/8/31 19:02
    **/
    public static <T> Result<T> success(T data) {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        result.setData(data);
        return result;
    }

    /**
    * 响应成功返回实体
    *
    * @author hunter
    * @since 2018/8/31 19:04
    **/
    public static <T> Result<T> success() {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.SUCCESS.getCode());
        result.setMsg(ResultEnum.SUCCESS.getMessage());
        return result;
    }

    /**
     * 响应失败统一返回实体
     *
     * @author hunter
     * @since 2018/8/31 19:04
     **/
    public static <T> Result<T> fail() {
        Result<T> result = new Result<>();
        result.setCode(ResultEnum.FAIL.getCode());
        result.setMsg(ResultEnum.FAIL.getMessage());
        return result;
    }

    /**
     * 响应失败统一返回实体
     *
     * @param resultEnum 错误枚举类
     * @author hunter
     * @since 2018/8/31 19:04
     **/
    public static <T> Result<T> fail(ResultEnum resultEnum) {
        Result<T> result = new Result<>();
        result.setCode(resultEnum.getCode());
        result.setMsg(resultEnum.getMessage());
        return result;
    }

    /**
     * 响应失败统一返回实体
     *
     * @param code 错误状态码
     * @param message 错误信息
     * @author hunter
     * @since 2018/8/31 19:04
     **/
    public static <T> Result<T> fail(Integer code , String message){
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }
}
