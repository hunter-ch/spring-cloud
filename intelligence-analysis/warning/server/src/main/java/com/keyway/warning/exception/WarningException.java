package com.keyway.warning.exception;

import com.keyway.warning.enums.ResultEnum;
import lombok.Getter;

/**
 * 定义统一服务端异常类
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:53
 */
@Getter
public class WarningException extends RuntimeException{
    /** 错误状态码 */
    private Integer code;

    public WarningException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public WarningException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public WarningException() {
        super();
    }
}
