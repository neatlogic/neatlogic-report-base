/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.integration.dto.table.ColumnVo;
import codedriver.framework.restful.annotation.EntityField;

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
