package com.xiaoshuai66.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 用户登录请求实体类
 *
 * @Author 赵帅
 * @Create 2025/10/6 22:39
 */
@Data
public class UserLoginRepDTO {

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

}
