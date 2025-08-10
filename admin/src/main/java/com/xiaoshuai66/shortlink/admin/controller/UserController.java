package com.xiaoshuai66.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.xiaoshuai66.shortlink.admin.common.convention.result.Result;
import com.xiaoshuai66.shortlink.admin.common.convention.result.Results;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserActualRespDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoshuai66.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理控制层
 *
 * @Author 赵帅
 * @Create 7/27/25 PM2:28
 */
@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    /**
     * 根据用户名查询用户信息
     */
    @GetMapping("/api/shortlink/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询非脱敏用户信息
     */
    @GetMapping("/api/shortlink/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

}
