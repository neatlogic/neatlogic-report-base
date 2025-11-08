/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

package neatlogic.framework.report.dto;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BasePageVo;
import neatlogic.framework.integration.dto.table.ColumnVo;
import neatlogic.framework.restful.annotation.EntityField;

import java.util.List;

public class ReportTableVo extends BasePageVo {
    @EntityField(name = "表名", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "说明", type = ApiParamType.STRING)
    private String comment;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "字段列表", type = ApiParamType.JSONARRAY)
    private List<ColumnVo> columnList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public List<ColumnVo> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<ColumnVo> columnList) {
        this.columnList = columnList;
    }
}
