/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class ReportHasInstanceException extends ApiRuntimeException {

    private static final long serialVersionUID = -2372416746502767188L;

    public ReportHasInstanceException(String reportName) {
        super("报表：" + reportName + "已存在实例，不可删除");
    }
}