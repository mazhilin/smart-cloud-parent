package com.smart.cloud.common.domain.object.response;

import com.smart.cloud.boot.pojo.BaseObject;
import com.smart.cloud.common.domain.Response;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @className: com.smart.cloud.common.domain.base.response.BaseResponse
 * @title: 封装SmartCloud项目-BaseResponse类
 * @description: <p>
 *         SmartCloud项目-BaseResponse
 *         </p>
 * @content: BaseResponse
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:01
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BaseResponse extends BaseObject implements Response {
    private static final long serialVersionUID = -7958468087362426611L;
    /**
     * 版本号
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "实例Id")
    private String instanceId;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "响应Id")
    private Long responseId;

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
