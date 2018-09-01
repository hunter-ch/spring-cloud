package com.keyway.user.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:56
 */
@Entity
@Data
public class User {
    @Id
    private String userId;

    private String userName;

    private String password;

    private String phone;
}
