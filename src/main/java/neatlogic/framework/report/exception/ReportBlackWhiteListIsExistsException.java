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

package neatlogic.framework.report.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;
import neatlogic.framework.report.dto.ReportBlackWhiteListVo;

public class ReportBlackWhiteListIsExistsException extends ApiRuntimeException {


    public ReportBlackWhiteListIsExistsException(ReportBlackWhiteListVo reportBlackWhiteListVo) {
        super("报表可用对象“{0}({1})”已存在", reportBlackWhiteListVo.getItemName(), reportBlackWhiteListVo.getItemType());
    }
}
