package com.keyway.phone.service;

import com.keyway.phone.domain.MailList;
import com.keyway.phone.vo.MailListVO;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * 通讯录信息服务接口
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:33
 */
public interface MailListService {
    MailList save(MailList mailList);

    MailList findOne(String mailId);

    List<MailList> findAll();

    Page<MailList> findPage(int page, int size);

    /**
     * 通过用户编号获取通讯录信息
    *
     * @param userId 用户编号
     * @author hunter
     * @since 2018/9/1 15:23
     **/
    MailListVO findByUserId(String userId);
}
