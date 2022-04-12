/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.dto.data;

import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.report.enums.DistrictLevel;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;

public class DistrictVo {
    private String name;
    @EntityField(name = "级别", type = ApiParamType.ENUM, member = DistrictLevel.class)
    private String level;
    @EntityField(name = "地区编码", type = ApiParamType.INTEGER)
    private Integer adcode;
    @EntityField(name = "经度", type = ApiParamType.DOUBLE)
    private Float lng;
    @EntityField(name = "纬度", type = ApiParamType.DOUBLE)
    private Float lat;
    @EntityField(name = "下属区域数量", type = ApiParamType.INTEGER)
    private int childrenNum;
    @EntityField(name = "上级地区编码", type = ApiParamType.INTEGER)
    private Integer parent;
    @JSONField(serialize = false)
    private Integer lft;
    @JSONField(serialize = false)
    private Integer rht;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public Integer getAdcode() {
        return adcode;
    }

    public Integer getLft() {
        return lft;
    }

    public void setLft(Integer lft) {
        this.lft = lft;
    }

    public Integer getRht() {
        return rht;
    }

    public void setRht(Integer rht) {
        this.rht = rht;
    }

    public void setAdcode(Integer adcode) {
        this.adcode = adcode;
    }

    public Float getLng() {
        return lng;
    }

    public void setLng(Float lng) {
        this.lng = lng;
    }

    public Float getLat() {
        return lat;
    }

    public void setLat(Float lat) {
        this.lat = lat;
    }

    public int getChildrenNum() {
        return childrenNum;
    }

    public void setChildrenNum(int childrenNum) {
        this.childrenNum = childrenNum;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }
}
