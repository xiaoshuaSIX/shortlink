package com.xiaoshuai66.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoshuai66.shortlink.admin.dao.entity.UserDO;
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
}
