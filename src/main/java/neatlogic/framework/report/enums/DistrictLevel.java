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

package neatlogic.framework.report.enums;

import neatlogic.framework.util.$;

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
        return $.t(text);
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
