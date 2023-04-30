package com.smart.cloud.boot.pojo;

import com.smart.cloud.boot.Serializer;
import com.smart.cloud.boot.exception.ErrorMessage;
import com.smart.cloud.boot.timestamp.Timestamp;
import com.smart.cloud.boot.utils.ApiResultUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * @className: com.smart.cloud.boot.pojo.Payload
 * @title: Payload
 * @description: 封装Pivotal项目Payload类
 *         <p>
 *         SmartCloud项目-统一数据实体返回类
 *         </p>
 * @content: //TODO
 * @author: marklin
 * @datetime: Powered by marklin 2023-04-26 02:57
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 Pivotal Cloud Systems Incorporated. All rights reserved.
 */
@Builder
@ToString
@AllArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "统一返回数据实体")
public class Payload<T> implements Serializer {

    /**
     * 编码-code
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "编码-code：成功标记=200，失败标记=500")
    private Integer code = 200;

    /**
     * 状态-success
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "状态-success：成功标记=true，失败标记=false")
    private Boolean success = true;

    /**
     * 消息-message
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "消息-message")
    private String message = "成功";

    /**
     * 数据-data
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "数据-data")
    private T data;

    /**
     * 接口调用时间-timestamp
     */
    @Getter
    @Setter
    @ApiModelProperty(value = "接口调用时间-timestamp")
    private long timestamp;

    public Payload (){
        this.timestamp = Timestamp.currentTime();
    }

    /**
     * 将传入的 result 对象，转换成另外一个泛型结果的对象
     * <p>
     * 因为 A 方法返回的 Payload 对象，不满足调用其的 B 方法的返回，所以需要进行转换。
     *
     * @param payload 传入的 result 对象
     * @param <T>     返回的泛型
     * @return Payload 对象
     */
    public static <T> Payload<T> error(Payload<?> payload) {
        return ApiResultUtil.restResult(payload.getCode(), false, payload.getMessage(), null);
    }


    /**
     * @param code
     * @param message
     * @param <T>     返回的泛型
     * @return Payload 对象
     */
    public static <T> Payload<T> error(Integer code, String message) {
        return ApiResultUtil.restResult(code, false, message, null);
    }

    /**
     * @param error 错误对象
     * @param <T>   返回的泛型
     * @return Payload 对象
     */
    public static <T> Payload<T> error(ErrorMessage error) {
        return ApiResultUtil.restResult(error.getCode(), false, error.getDesc());
    }

    /**
     * @param payload 错误对象
     * @param <T>     返回的泛型
     * @return Payload 对象
     */
    public static <T> Payload<T> success(Payload<T> payload) {
        return ApiResultUtil.restResult(payload.getCode(), true, payload.getMessage(), payload.getData());
    }

    /**
     * @param <T> 返回的泛型
     * @return Payload 对象
     */
    public static <T> Payload<T> success() {
        return ApiResultUtil.restResult(200, true, "请求成功！", null);
    }


}
