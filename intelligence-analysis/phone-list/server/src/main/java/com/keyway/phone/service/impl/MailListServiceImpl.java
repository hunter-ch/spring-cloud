package com.keyway.phone.service.impl;

import com.keyway.phone.domain.MailList;
import com.keyway.phone.repository.MailListRepository;
import com.keyway.phone.service.MailListService;
import com.keyway.phone.vo.MailListVO;
import com.keyway.user.client.UserClient;
import com.keyway.user.common.UserInfoOutput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 通讯录信息服务接口实现
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:33
 */
@Service("mailListService")
public class MailListServiceImpl implements MailListService {
    @Autowired
    private MailListRepository repository;
    @Autowired
    private UserClient userClient;

    @Override
    public MailList save(MailList mailList) {
        return repository.save(mailList);
    }

    @Override
    public MailList findOne(String mailId) {
        return repository.findById(mailId).orElse(new MailList());
    }

    @Override
    public List<MailList> findAll() {
        return repository.findAll();
    }

    @Override
    public Page<MailList> findPage(int page, int size) {
        return repository.findAll(PageRequest.of(page, size));
    }

    @Override
    public MailListVO findByUserId(String userId) {
        MailListVO result = new MailListVO();
        MailList item = repository.findByUserId(userId);

        // 通讯录不为空并且用户编号不为空，则获取用户信息
        if (item != null && !StringUtils.isEmpty(item.getUserId())) {
            UserInfoOutput output = userClient.findOne(item.getUserId());
            result.setPhone(item.getPhone());
            result.setRemark(item.getRemark());
            result.setUserName(output.getUserName());
        }
        return result;
    }

}
