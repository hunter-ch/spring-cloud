package com.keyway.user.service.impl;

import com.keyway.user.domain.User;
import com.keyway.user.repository.UserRepository;
import com.keyway.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息接口实现
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:57
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findOne(String userId) {
        return userRepository.findById(userId).orElse(new User());
    }
}
