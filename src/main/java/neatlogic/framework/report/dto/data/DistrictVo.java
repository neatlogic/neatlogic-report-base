/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.report.dto.data;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.report.enums.DistrictLevel;
import neatlogic.framework.restful.annotation.EntityField;
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
