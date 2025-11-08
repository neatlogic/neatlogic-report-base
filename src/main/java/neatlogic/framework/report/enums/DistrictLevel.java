/*
 *
 * Copyright (C) 2025  TechSure Co., Ltd.  All Rights Reserved.
 * This file is part of the NeatLogic software.
 * Licensed under the NeatLogic Sustainable Use License (NSUL), Version 4.x – 2025.
 * You may use this file only in compliance with the License.
 * See the LICENSE file distributed with this work for the full license text.
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 */

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
