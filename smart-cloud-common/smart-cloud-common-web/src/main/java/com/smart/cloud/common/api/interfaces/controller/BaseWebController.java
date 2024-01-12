package com.smart.cloud.common.api.interfaces.controller;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @className: com.smart.cloud.common.module.base.controller.BaseWebController
 * @projectName: 封装SmartCloud项目-BaseWebController类
 * @module: SmartCloud项目-BaseWebController类，主要位于BaseWebController模块的业务场景
 * @content: BaseWebController类，主要用于完成BaseWebController的封装和定义.
 * @author: Powered by Marklin
 * @datetime: 2023-07-12 21:05
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@RestControllerAdvice
public class BaseWebController implements WebController {

    @InitBinder
    public void initBinder(WebDataBinder binder) {
        // 字符串编辑器
        StringTrimmerEditor stringTrimmer = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, stringTrimmer);
    }
}
