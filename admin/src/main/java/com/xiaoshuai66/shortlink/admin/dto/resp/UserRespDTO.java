package com.xiaoshuai66.shortlink.admin.dto.resp;

import lombok.Data;

/**
 * 用户返回参数实体
 *
 * @Author 赵帅
 * @Create 8/10/25 AM12:08
 */
@Data
public class UserRespDTO {

    /**
     * ID
     */
    private Long id;

    /**
     * 用户名
     */
    private String username;

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
}
