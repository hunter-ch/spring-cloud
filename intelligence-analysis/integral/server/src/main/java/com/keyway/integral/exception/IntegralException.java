package com.keyway.integral.exception;

import com.keyway.integral.enums.ResultEnum;
import lombok.Getter;

/**
 * 定义统一服务端异常类
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:53
 */
@Getter
public class IntegralException extends RuntimeException{
    /** 错误状态码 */
    private Integer code;

    public IntegralException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public IntegralException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public IntegralException() {
        super();
    }
}
