package com.smart.cloud.common.dao.base.wrapper;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.ArrayUtils;
import com.baomidou.mybatisplus.core.toolkit.CollectionUtils;
import com.smart.cloud.common.dao.Wrapper;
import org.springframework.util.StringUtils;

import java.util.Collection;

/**
 * @className: com.smart.cloud.common.dao.base.wrapper.BaseWrapper
 * @title: 封装SmartCloud项目-BaseWrapper类
 * @description: <p>
 *         SmartCloud项目-BaseWrapper
 *         </p>
 * @content: BaseWrapper
 * @author: Powered by marklin
 * @datetime: 2023-05-01 00:13
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
public class BaseWrapper<T> extends QueryWrapper<T> implements Wrapper {
    public BaseWrapper<T> likeIfPresent(String column, String val) {
        if (StringUtils.hasText(val)) {
            return (BaseWrapper<T>) super.like(column, val);
        }
        return this;
    }

    public BaseWrapper<T> inIfPresent(String column, Collection<?> values) {
        if (!CollectionUtils.isEmpty(values)) {
            return (BaseWrapper<T>) super.in(column, values);
        }
        return this;
    }

    public BaseWrapper<T> inIfPresent(String column, Object... values) {
        if (!ArrayUtils.isEmpty(values)) {
            return (BaseWrapper<T>) super.in(column, values);
        }
        return this;
    }

    public BaseWrapper<T> eqIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.eq(column, val);
        }
        return this;
    }

    public BaseWrapper<T> neIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.ne(column, val);
        }
        return this;
    }

    public BaseWrapper<T> gtIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.gt(column, val);
        }
        return this;
    }

    public BaseWrapper<T> geIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.ge(column, val);
        }
        return this;
    }

    public BaseWrapper<T> ltIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.lt(column, val);
        }
        return this;
    }

    public BaseWrapper<T> leIfPresent(String column, Object val) {
        if (val != null) {
            return (BaseWrapper<T>) super.le(column, val);
        }
        return this;
    }

    public BaseWrapper<T> betweenIfPresent(String column, Object val1, Object val2) {
        if (val1 != null && val2 != null) {
            return (BaseWrapper<T>) super.between(column, val1, val2);
        }
        if (val1 != null) {
            return (BaseWrapper<T>) ge(column, val1);
        }
        if (val2 != null) {
            return (BaseWrapper<T>) le(column, val2);
        }
        return this;
    }


    @Override
    public BaseWrapper<T> eq(boolean condition, String column, Object val) {
        super.eq(condition, column, val);
        return this;
    }

    @Override
    public BaseWrapper<T> eq(String column, Object val) {
        super.eq(column, val);
        return this;
    }

    @Override
    public BaseWrapper<T> orderByDesc(String column) {
        super.orderByDesc(true, column);
        return this;
    }

    @Override
    public BaseWrapper<T> last(String lastSql) {
        super.last(lastSql);
        return this;
    }

    @Override
    public BaseWrapper<T> in(String column, Collection<?> coll) {
        super.in(column, coll);
        return this;
    }
}
