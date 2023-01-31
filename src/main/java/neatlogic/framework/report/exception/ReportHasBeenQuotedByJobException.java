/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.report.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class ReportHasBeenQuotedByJobException extends ApiRuntimeException {

    private static final long serialVersionUID = 3652383679845478468L;

    public ReportHasBeenQuotedByJobException(String reportName) {
        super("报表：" + reportName + "已被报表发送计划引用");
    }
}
