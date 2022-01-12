/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;
import codedriver.framework.report.dto.ReportBlackWhiteListVo;

public class ReportBlackWhiteListIsExistsException extends ApiRuntimeException {


    public ReportBlackWhiteListIsExistsException(ReportBlackWhiteListVo reportBlackWhiteListVo) {
        super("报表可用对象“" + reportBlackWhiteListVo.getItemName() + "(" + reportBlackWhiteListVo.getItemType() + ")”已存在");
    }
}
