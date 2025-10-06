package com.xiaoshuai66.shortlink.admin.dto.resp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户登录返回实体类
 *
 * @Author 赵帅
 * @Create 2025/10/6 22:27
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLoginRespDTO {
    private String token;
}
