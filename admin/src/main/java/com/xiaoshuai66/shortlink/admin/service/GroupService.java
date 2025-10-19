package com.xiaoshuai66.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoshuai66.shortlink.admin.dao.entity.GroupDO;
import com.xiaoshuai66.shortlink.admin.dto.resp.ShortLinkGroupRespDTO;

import java.util.List;

/**
 * 短链接分组接口层
 *
 * @Author 赵帅
 * @Create 2025/10/19 11:32
 */
public interface GroupService extends IService<GroupDO> {

    /**
     * 新增短链接分组
     *
     * @param groupName 短链接分组名
     */
    void saveGroup(String groupName);

    /**
     * 查询用户短链接分组集合
     *
     * @return 用户短链接分组集合
     */
    List<ShortLinkGroupRespDTO> listGroup();
}
