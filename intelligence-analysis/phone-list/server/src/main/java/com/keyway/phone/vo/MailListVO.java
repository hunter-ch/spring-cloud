package com.keyway.phone.vo;

import lombok.Data;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/9/1 15:21
 */
@Data
public class MailListVO {
    /** 所属用户姓名 */
    private String userName;

    /** 电话号码 */
    private String phone;

    /** 备注 */
    private String remark;
}
