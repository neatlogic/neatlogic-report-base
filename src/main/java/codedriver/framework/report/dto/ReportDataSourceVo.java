/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto;

import codedriver.framework.asynchronization.threadlocal.TenantContext;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BasePageVo;
import codedriver.framework.report.enums.Mode;
import codedriver.framework.report.enums.Status;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ReportDataSourceVo extends BasePageVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "唯一标识", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String label;
    @EntityField(name = "说明", type = ApiParamType.STRING)
    private String description;
    @EntityField(name = "xml配置", type = ApiParamType.STRING)
    private String xml;
    @EntityField(name = "定时策略", type = ApiParamType.STRING)
    private String cronExpression;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @EntityField(name = "查询超时时间，单位：秒", type = ApiParamType.LONG)
    private Integer queryTimeout;
    @EntityField(name = "配置文件id", type = ApiParamType.LONG)
    private Long fileId;
    @EntityField(name = "状态", type = ApiParamType.ENUM, member = Status.class)
    private String status;
    @EntityField(name = "同步模式", type = ApiParamType.ENUM, member = Mode.class)
    private String mode;
    @EntityField(name = "数据量", type = ApiParamType.INTEGER)
    private Integer dataCount;
    @EntityField(name = "过期天数", type = ApiParamType.INTEGER)
    private Integer expireDay;
    @EntityField(name = "字段列表", type = ApiParamType.JSONARRAY)
    private List<ReportDataSourceFieldVo> fieldList;
    @EntityField(name = "条件列表", type = ApiParamType.JSONARRAY)
    private List<ReportDataSourceConditionVo> conditionList;
    @EntityField(name = "数据连接id", type = ApiParamType.LONG)
    private Long connectionId;
    @JSONField(serialize = false)//数据列表
    private List<ReportDataSourceDataVo> dataList;


    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    @JSONField(serialize = false)
    public String getTableName() {
        return TenantContext.get().getDataDbName() + ".`datasource_" + this.getId() + "`";
    }

    public Integer getQueryTimeout() {
        return queryTimeout;
    }

    public List<Long> getKeyList() {
        if (CollectionUtils.isNotEmpty(fieldList)) {
            List<Long> keyList = new ArrayList<>();
            for (ReportDataSourceFieldVo fieldVo : fieldList) {
                if (fieldVo.getIsKey().equals(1)) {
                    keyList.add(fieldVo.getId());
                }
            }
            return keyList;
        }
        return null;
    }

    public ReportDataSourceFieldVo getFieldById(Long fieldId) {
        Optional<ReportDataSourceFieldVo> op = fieldList.stream().filter(d -> d.getId().equals(fieldId)).findFirst();
        return op.orElse(null);
    }

    public Integer getDataCount() {
        return dataCount;
    }

    public void setDataCount(Integer dataCount) {
        this.dataCount = dataCount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatusText() {
        if (StringUtils.isNotBlank(status)) {
            return Status.getText(status);
        }
        return null;
    }

    public Long getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(Long connectionId) {
        this.connectionId = connectionId;
    }

    public void setQueryTimeout(Integer queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFileId() {
        return fileId;
    }

    public void setFileId(Long fileId) {
        this.fileId = fileId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Integer getExpireDay() {
        return expireDay;
    }

    public void setExpireDay(Integer expireDay) {
        this.expireDay = expireDay;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getXml() {
        return xml;
    }

    public void setXml(String xml) {
        this.xml = xml;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public List<ReportDataSourceFieldVo> getFieldList() {
        if (CollectionUtils.isEmpty(fieldList) && StringUtils.isNotBlank(xml)) {
        }
        return fieldList;
    }

    public void setFieldList(List<ReportDataSourceFieldVo> fieldList) {
        this.fieldList = fieldList;
    }

    public List<ReportDataSourceConditionVo> getConditionList() {
        return conditionList;
    }

    public void setConditionList(List<ReportDataSourceConditionVo> conditionList) {
        this.conditionList = conditionList;
    }
}
