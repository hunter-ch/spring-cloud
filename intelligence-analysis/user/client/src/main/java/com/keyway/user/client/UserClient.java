package com.keyway.user.client;

import com.keyway.user.client.impl.UserClientHystrix;
import com.keyway.user.common.UserInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/9/1 15:41
 */
@FeignClient(name = "user", fallback = UserClientHystrix.class)
public interface UserClient {
    @GetMapping("/user/findUser")
    UserInfoOutput findOne(@RequestParam(value = "userId") String userId);
}
