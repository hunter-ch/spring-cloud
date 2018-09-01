package com.keyway.phone.controller;

import com.keyway.phone.service.MailListService;
import com.keyway.phone.util.ResultUtil;
import com.keyway.phone.vo.MailListVO;
import com.keyway.phone.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通讯录信息控制器
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:35
 */
@RestController
public class MailListController {
    @Autowired
    private MailListService mailListService;

    @GetMapping("/getMailListInfo")
    public Result<MailListVO> getMailListInfo(@RequestParam String userId) {
        MailListVO mailListVO = mailListService.findByUserId(userId);
        return ResultUtil.success(mailListVO);
    }
}
