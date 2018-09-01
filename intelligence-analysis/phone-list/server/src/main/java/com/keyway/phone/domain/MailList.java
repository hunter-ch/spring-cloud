package com.keyway.phone.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 通讯录信息实体
 *
 * @author hunter
 * @version 1.0
 * @since 2018/8/31 19:17
 */
@Data
@Entity
@Table(name = "mail_list")
public class MailList {
    @Id
    /** 通讯录编号 */
    private String mailId;

    /** 所属用户编号 */
    private String userId;

    /** 电话号码 */
    private String phone;

    /** 备注 */
    private String remark;

    /** 创建时间 */
    private Date createTime;

    /** 更新时间 */
    private Date updateTime;
}
