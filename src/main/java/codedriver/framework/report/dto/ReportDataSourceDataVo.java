/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto;

import codedriver.framework.asynchronization.threadlocal.TenantContext;
import codedriver.framework.util.SnowflakeUtil;

import java.util.ArrayList;
import java.util.List;

public class ReportDataSourceDataVo {
    private Long id;
    private Long dataSourceId;
    private List<ReportDataSourceFieldVo> fieldList;
    private Integer expireDay;

    public void addField(ReportDataSourceFieldVo fieldVo) {
        if (fieldList == null) {
            fieldList = new ArrayList<>();
        }
        fieldList.add(fieldVo);
    }

    public ReportDataSourceDataVo(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public String getTableName() {
        return TenantContext.get().getDataDbName() + ".`datasource_" + this.dataSourceId + "`";
    }

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(Long dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    public List<ReportDataSourceFieldVo> getFieldList() {
        return fieldList;
    }

    public void setFieldList(List<ReportDataSourceFieldVo> fieldList) {
        this.fieldList = fieldList;
    }

    public Integer getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(Integer expireDay) {
        this.expireDay = expireDay;
    }
}
