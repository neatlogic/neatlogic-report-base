/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto;

import codedriver.framework.asynchronization.threadlocal.TenantContext;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ReportDataSourceDataVo extends BasePageVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "数据源id", type = ApiParamType.LONG)
    private Long dataSourceId;
    @EntityField(name = "字段列表", type = ApiParamType.JSONARRAY)
    private List<ReportDataSourceFieldVo> fieldList;
    @EntityField(name = "有效天数", type = ApiParamType.INTEGER)
    private Integer expireDay;
    @EntityField(name = "添加日期", type = ApiParamType.LONG)
    private Date insertTime;
    @EntityField(name = "过期日期", type = ApiParamType.LONG)
    private Date expireTime;
    @EntityField(name = "条件列表", type = ApiParamType.JSONARRAY)
    private List<ReportDataSourceFieldVo> conditionList;

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

    public boolean containField(Long fieldId) {
        if (CollectionUtils.isNotEmpty(fieldList)) {
            return fieldList.stream().anyMatch(d -> d.getId().equals(fieldId));
        }
        return false;
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

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public List<ReportDataSourceFieldVo> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<ReportDataSourceFieldVo> conditionList) {
        this.conditionList = conditionList;
    }
}