package com.smart.cloud.coverage.audit.support;

import lombok.experimental.UtilityClass;
import org.javers.core.Changes;
import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;

import static org.javers.core.diff.ListCompareAlgorithm.LEVENSHTEIN_DISTANCE;

/**
 * @className: com.smart.cloud.coverage.audit.support.AuditObjectTools
 * @title: 封装SmartCloud项目-AuditObjectTools类
 * @description: <p>
 *         SmartCloud项目-AuditObjectTools
 *         </p>
 * @content: AuditObjectTools
 * @author: Powered by marklin
 * @datetime: 2023-05-31 02:20
 * @version: 1.0.0
 * @copyright: Copyright © 2018-2023 SmartCloud Systems Incorporated. All rights reserved.
 */
@UtilityClass
public class AuditObjectTools {
    private final Javers javers = JaversBuilder.javers().withListCompareAlgorithm(LEVENSHTEIN_DISTANCE).build();

    public Changes compare(Object source, Object target) {
        Diff compare = javers.compare(source, target);
        return compare.getChanges();
    }
}
