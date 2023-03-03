/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.report.enums;

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
