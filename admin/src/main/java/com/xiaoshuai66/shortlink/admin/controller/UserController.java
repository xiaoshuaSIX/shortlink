package com.xiaoshuai66.shortlink.admin.controller;

import cn.hutool.core.bean.BeanUtil;
import com.xiaoshuai66.shortlink.admin.common.convention.result.Result;
import com.xiaoshuai66.shortlink.admin.common.convention.result.Results;
import com.xiaoshuai66.shortlink.admin.dto.req.UserLoginRepDTO;
import com.xiaoshuai66.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xiaoshuai66.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserActualRespDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoshuai66.shortlink.admin.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/api/short-link/v1/user/{username}")
    public Result<UserRespDTO> getUserByUsername(@PathVariable("username") String username) {
        return Results.success(userService.getUserByUsername(username));
    }

    /**
     * 根据用户名查询非脱敏用户信息
     */
    @GetMapping("/api/short-link/v1/actual/user/{username}")
    public Result<UserActualRespDTO> getActualUserByUsername(@PathVariable("username") String username) {
        return Results.success(BeanUtil.toBean(userService.getUserByUsername(username), UserActualRespDTO.class));
    }

    /**
     * 查询用户名是否可用
     */
    @GetMapping("/api/short-link/v1/user/has-username")
    public Result<Boolean> hasUsername(@RequestParam("username") String username) {
        return Results.success(userService.hasUsername(username));
    }

    /**
     * 注册用户
     */
    @PostMapping("/api/short-link/admin/v1/user")
    public Result<Void> register(@RequestBody UserRegisterReqDTO requestParam) {
        userService.register(requestParam);
        return Results.success();
    }

    /**
     * 修改用户信息
     */
    @PutMapping("/api/short-link/admin/v1/user")
    public Result<Void> update(@RequestBody UserUpdateReqDTO requestParam) {
        userService.update(requestParam);
        return Results.success();
    }

    /**
     * 用户登录
     */
    @PostMapping("/api/short-link/admin/v1/user/login")
    public Result<UserLoginRespDTO> login(@RequestBody UserLoginRepDTO requestParam) {
        return Results.success(userService.login(requestParam));
    }

    /**
     * 检查用户是否登录
     */
    @GetMapping("/api/short-link/admin/v1/user/check-login")
    public Result<Boolean> checkLogin(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.checkLogin(username, token));
    }

    /**
     * 用户退出登录
     */
    @DeleteMapping("/api/short-link/admin/v1/user/logout")
    public Result<Boolean> logout(@RequestParam("username") String username, @RequestParam("token") String token) {
        return Results.success(userService.logout(username, token));
    }
}
