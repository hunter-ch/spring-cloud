package com.keyway.user.service;

import com.keyway.user.domain.User;

/**
 * 用户信息数据接口
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:57
 */
public interface UserService {
    User findOne(String userId);
}
