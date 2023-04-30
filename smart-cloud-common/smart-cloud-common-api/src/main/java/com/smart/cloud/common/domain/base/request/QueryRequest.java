package com.smart.cloud.common.domain.base.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.smart.cloud.boot.constant.Formats;
import com.smart.cloud.common.domain.Request;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @className: com.smart.cloud.common.domain.base.request.QueryRequest
 * @title: 封装SamrtCloud项目-QueryRequest类
 * @description: <p>
 *         SamrtCloud项目-QueryRequest
 *         </p>
 * @content: QueryRequest
 * @author: Powered by marklin
 * @datetime: 2023-04-30 23:03
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SamrtCloud Systems Incorporated. All rights reserved.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class QueryRequest extends BaseRequest implements Request {
    private static final long serialVersionUID = -5823963629834991904L;

    /**
     * 开始时间
     */
    @Getter
    @Setter
    @NotNull(message = "开始时间不能为空!")
    @DateTimeFormat(pattern = Formats.DATETIME)
    @JsonFormat(pattern = Formats.DATETIME, timezone = "GMT+8")
    @ApiModelProperty(value = "开始时间", required = true)
    private Date beginTime;

    /**
     * 结束时间
     */
    @Getter
    @Setter
    @NotNull(message = "结束时间不能为空!")
    @DateTimeFormat(pattern = Formats.DATETIME)
    @JsonFormat(pattern = Formats.DATETIME, timezone = "GMT+8")
    @ApiModelProperty(value = "结束时间", required = true)
    private Date endTime;

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
