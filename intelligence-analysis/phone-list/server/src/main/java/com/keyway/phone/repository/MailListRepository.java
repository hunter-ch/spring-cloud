package com.keyway.phone.repository;

import com.keyway.phone.domain.MailList;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 通讯录信息数据仓库
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:32
 */
public interface MailListRepository extends JpaRepository<MailList, String> {
    MailList findByUserId(String userId);
}
