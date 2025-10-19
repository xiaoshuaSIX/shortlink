package com.xiaoshuai66.shortlink.admin.dto.req;

import lombok.Data;

/**
 * 短链接分组排序参数
 *
 * @Author 赵帅
 * @Create 2025/10/19 17:00
 */
@Data
public class ShortLinkGroupSortReqDTO {

    /**
     * 分组ID
     */
    private String gid;

    /**
     * 排序
     */
    private Integer sortOrder;
}
