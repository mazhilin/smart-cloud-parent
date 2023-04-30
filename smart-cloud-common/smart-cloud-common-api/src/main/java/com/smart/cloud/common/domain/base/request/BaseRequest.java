package com.smart.cloud.common.domain.base.request;

import com.smart.cloud.boot.pojo.BaseObject;
import com.smart.cloud.common.domain.Request;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * @className: com.smart.cloud.common.domain.base.request.BaseRequest
 * @title: 封装SmartCloud项目-BaseRequest类
 * @description: <p>
 *         SmartCloud项目-BaseRequest
 *         </p>
 * @content: BaseRequest
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:00
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BaseRequest extends BaseObject implements Request {
    private static final long serialVersionUID = 1687334092703056863L;

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
    @ApiModelProperty(value = "请求Id")
    private Long requestId;

    /**
     * 删除状态
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "删除状态")
    private Integer deleted;

    /**
     * 版本号
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "版本号")
    private Integer version;
}
