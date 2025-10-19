package com.xiaoshuai66.shortlink.admin.dao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.xiaoshuai66.shortlink.admin.common.database.BaseDO;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @description t_user
 * @author zhaoshuai
 * @date 2025-08-09
 */
@Data
@TableName("t_user")
public class UserDO extends BaseDO {

    /**
    * ID
    */
    private Long id;

    /**
    * 用户名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 真实姓名
    */
    private String realName;

    /**
    * 手机号
    */
    private String phone;

    /**
    * 邮箱
    */
    private String mail;

    /**
    * 注销时间戳
    */
    private Long deletionTime;

}