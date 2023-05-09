package com.smart.cloud.security.jsonwebtoken.converter;

import com.smart.cloud.security.jsonwebtoken.provider.JsonWebTokenKeyProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @className: com.smart.cloud.security.jsonwebtoken.converter.JsonWebTokenValueConverter
 * @title: 封装SmartCloud项目-JsonWebTokenValueConverter类
 * @description: <p>
 *         SmartCloud项目-JsonWebTokenValueConverter
 *         </p>
 * @content: JsonWebTokenValueConverter
 * @author: Powered by marklin
 * @datetime: 2023-05-07 17:34
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@Component
@Primary
public class JsonWebTokenValueConverter {

    private final JsonWebTokenKeyProvider tokenKeyProvider;

    @Autowired
    public JsonWebTokenValueConverter(JsonWebTokenKeyProvider tokenKeyProvider) {
        this.tokenKeyProvider = tokenKeyProvider;
    }
}
