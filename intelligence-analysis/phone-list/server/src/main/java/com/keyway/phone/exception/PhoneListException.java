package com.keyway.phone.exception;

import com.keyway.phone.enums.ResultEnum;
import lombok.Getter;

/**
 * 定义统一服务端异常类
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:53
 */
@Getter
public class PhoneListException extends RuntimeException{
    /** 错误状态码 */
    private Integer code;

    public PhoneListException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public PhoneListException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public PhoneListException() {
        super();
    }
}
