package com.smart.cloud.common.domain.base.response;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @className: com.smart.cloud.common.domain.base.response.QueryResponse
 * @title: 封装SmartCloud项目-QueryResponse类
 * @description: <p>
 *         SmartCloud项目-QueryResponse
 *         </p>
 * @content: QueryResponse
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:07
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class QueryResponse extends BaseResponse {
    private static final long serialVersionUID = 7717167563811564195L;

    /**
     * 删除状态
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "删除状态")
    private Boolean deleted;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "版本号")
    private Integer version;
}
