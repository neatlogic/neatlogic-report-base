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

package neatlogic.framework.report.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;
import neatlogic.framework.report.dto.ReportBlackWhiteListVo;

public class ReportBlackWhiteListIsExistsException extends ApiRuntimeException {


    public ReportBlackWhiteListIsExistsException(ReportBlackWhiteListVo reportBlackWhiteListVo) {
        super("报表可用对象“{0}({1})”已存在", reportBlackWhiteListVo.getItemName(), reportBlackWhiteListVo.getItemType());
    }
}
