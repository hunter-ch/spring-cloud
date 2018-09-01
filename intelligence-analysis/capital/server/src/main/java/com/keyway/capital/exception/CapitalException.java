package com.keyway.capital.exception;

import com.keyway.capital.enums.ResultEnum;
import lombok.Getter;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 18:53
 */
@Getter
public class CapitalException extends RuntimeException{
    private Integer code;

    public CapitalException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public CapitalException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public CapitalException() {
        super();
    }
}
