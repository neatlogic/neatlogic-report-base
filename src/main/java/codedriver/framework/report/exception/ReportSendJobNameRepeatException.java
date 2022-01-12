/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class ReportSendJobNameRepeatException extends ApiRuntimeException {

    private static final long serialVersionUID = 3237715905744130211L;

    public ReportSendJobNameRepeatException(String name) {
        super("报表发送计划：'" + name + "'已存在");
    }
}
