/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.BaseEditorVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class ReportStatementVo extends BaseEditorVo {
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "是否激活", type = ApiParamType.INTEGER)
    private Integer isActive;
    @JSONField(serialize = false)
    private String widgetListStr;
    @EntityField(name = "组件列表", type = ApiParamType.JSONARRAY)
    private JSONArray widgetList;
    @EntityField(name = "画布宽度", type = ApiParamType.INTEGER)
    private Integer width;
    @EntityField(name = "画布高度", type = ApiParamType.INTEGER)
    private Integer height;
    @EntityField(name = "备注", type = ApiParamType.STRING)
    private String description;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public String getWidgetListStr() {
        if (StringUtils.isBlank(widgetListStr) && CollectionUtils.isNotEmpty(widgetList)) {
            widgetListStr = widgetList.toJSONString();
        }
        return widgetListStr;
    }

    public void setWidgetListStr(String widgetListStr) {
        this.widgetListStr = widgetListStr;
    }

    public JSONArray getWidgetList() {
        if (CollectionUtils.isEmpty(widgetList) && StringUtils.isNotBlank(widgetListStr)) {
            try {
                widgetList = JSONArray.parseArray(widgetListStr);
            } catch (Exception ignored) {

            }
        }
        return widgetList;
    }

    public void setWidgetList(JSONArray widgetList) {
        this.widgetList = widgetList;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
