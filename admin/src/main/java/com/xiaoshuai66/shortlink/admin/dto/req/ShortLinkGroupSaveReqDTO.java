package com.xiaoshuai66.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组创建参数
 *
 * @Author 赵帅
 * @Create 2025/10/19 11:43
 */
@Data
public class ShortLinkGroupSaveReqDTO {

    /**
     * 分组名
     */
    private String name;
}
