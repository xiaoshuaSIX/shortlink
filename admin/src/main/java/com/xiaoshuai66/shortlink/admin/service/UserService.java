package com.xiaoshuai66.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoshuai66.shortlink.admin.dao.entity.UserDO;
import com.xiaoshuai66.shortlink.admin.dto.req.UserLoginRepDTO;
import com.xiaoshuai66.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.xiaoshuai66.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 *
 * @Author 赵帅
 * @Create 8/10/25 AM12:04
 */
public interface UserService extends IService<UserDO> {

    /**
     * 根据用户名查询用户信息
     */
    UserRespDTO getUserByUsername(String username);

    /**
     * 查询用户名是否存在
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     */
    void register(UserRegisterReqDTO requestParam);

    /**
     * 修改用户信息
     */
    void update(UserUpdateReqDTO requestParam);

    /**
     * 用户登录
     *
     * @param requestParam 用户登录请求参数
     * @return 用户登录返回参数 Token
     */
    UserLoginRespDTO login(UserLoginRepDTO requestParam);

    /**
     * 检查用户是否登录
     *
     * @param username 用户名
     * @param token    用户登录 Token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);
}
