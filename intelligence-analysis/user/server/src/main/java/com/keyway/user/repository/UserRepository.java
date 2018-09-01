package com.keyway.user.repository;

import com.keyway.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户信息数据仓库
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:56
 */
public interface UserRepository extends JpaRepository<User, String> {
}
