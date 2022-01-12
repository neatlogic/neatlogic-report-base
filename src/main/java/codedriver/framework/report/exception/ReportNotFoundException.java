/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class ReportNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 88898742732604752L;

    public ReportNotFoundException(Long reportId) {
        super("报表：" + reportId + "不存在");
    }
}
