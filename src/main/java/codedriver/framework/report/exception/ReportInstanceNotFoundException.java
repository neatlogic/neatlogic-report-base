/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class ReportInstanceNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 4761165006438771515L;

    public ReportInstanceNotFoundException(Long reportinstanceId) {
        super("报表实例：" + reportinstanceId + "不存在");
    }
}
