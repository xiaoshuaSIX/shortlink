package com.xiaoshuai66.shortlink.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiaoshuai66.shortlink.admin.dao.entity.GroupDO;
import com.xiaoshuai66.shortlink.admin.dao.mapper.GroupMapper;
import com.xiaoshuai66.shortlink.admin.service.GroupService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * 短链接分组接口实现层
 *
 * @Author 赵帅
 * @Create 2025/10/19 11:34
 */
@Slf4j
@Service
public class GroupServiceImpl extends ServiceImpl<GroupMapper, GroupDO> implements GroupService{
}
