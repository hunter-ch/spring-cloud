package com.keyway.user.client.impl;

import com.keyway.user.client.UserClient;
import com.keyway.user.common.UserInfoOutput;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/9/1 16:10
 */
@Component
@Slf4j
public class UserClientHystrix implements UserClient {
    @Override
    public UserInfoOutput findOne(@RequestParam(value = "userId") String userId) {
        log.info("网络太忙，稍后访问!!");
        return null;
    }
}
