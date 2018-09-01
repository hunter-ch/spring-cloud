package com.keyway.user.controller;

import com.keyway.user.common.UserInfoOutput;
import com.keyway.user.domain.User;
import com.keyway.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 简要描述本类的主要模块、函数及功能的说明
 *
 * @author hunter
 * @version 1.0
 * @since 2018/9/1 15:34
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUser")
    public UserInfoOutput findOne(@RequestParam String userId) {
        User user = userService.findOne(userId);

        UserInfoOutput output = new UserInfoOutput();
        output.setUserName(user.getUserName());
        output.setPhone(user.getPhone());
        return output;
    }
}
