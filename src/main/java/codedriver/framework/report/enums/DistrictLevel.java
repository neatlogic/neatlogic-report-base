/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.enums;

public enum DistrictLevel {
    COUNTRY("country", "国家"),
    PROVINCE("province", "省"),
    CITY("city", "城市"),
    DISTRICT("district", "区域");

    private final String name;
    private final String text;

    DistrictLevel(String _name, String _driver) {
        this.name = _name;
        this.text = _driver;
    }

    public String getName() {
        return name;
    }

    public String getText() {
        return text;
    }


    public static String getText(String name) {
        for (DistrictLevel s : DistrictLevel.values()) {
            if (s.getName().equals(name)) {
                return s.getText();
            }
        }
        return null;
    }
}
