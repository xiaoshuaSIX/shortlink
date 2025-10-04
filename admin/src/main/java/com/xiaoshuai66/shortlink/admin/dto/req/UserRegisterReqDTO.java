package com.xiaoshuai66.shortlink.admin.dto.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户注册请求对象
 *
 * @Author 赵帅
 * @Create 2025/10/4 16:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRegisterReqDTO {

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
}
