package com.xiaoshuai66.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoshuai66.shortlink.admin.common.convention.exception.ClientException;
import com.xiaoshuai66.shortlink.admin.dao.entity.UserDO;
import com.xiaoshuai66.shortlink.admin.dao.mapper.UserMapper;
import com.xiaoshuai66.shortlink.admin.dto.resp.UserRespDTO;
import com.xiaoshuai66.shortlink.admin.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

/**
 * 用户接口实现层
 *
 * @Author 赵帅
 * @Create 8/10/25 AM12:04
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {


    @Override
    public UserRespDTO getUserByUsername(String username) {
        LambdaQueryWrapper<UserDO> queryWrapper = Wrappers.lambdaQuery(UserDO.class)
                .eq(UserDO::getUsername, username);
        UserDO userDO = baseMapper.selectOne(queryWrapper);
        if (userDO == null) {
            throw new ClientException("用户为空");
        }
        UserRespDTO result = new UserRespDTO();
        BeanUtils.copyProperties(userDO, result);
        return result;
    }
}
