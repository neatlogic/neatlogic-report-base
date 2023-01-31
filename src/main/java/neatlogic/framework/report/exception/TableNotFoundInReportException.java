/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.report.exception;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class TableNotFoundInReportException extends ApiRuntimeException {

    private static final long serialVersionUID = -6208469224750381783L;

    public TableNotFoundInReportException() {
        super("没有在报表中找到表格，请检查报表模版内容配置的格式是否正确");
    }
}
