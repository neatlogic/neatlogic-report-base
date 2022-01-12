/*
 * Copyright(c) 2022 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.report.exception;

import codedriver.framework.exception.core.ApiRuntimeException;

public class ReportSendJobNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = -867701399844094885L;

    public ReportSendJobNotFoundException(Long id) {
        super("报表发送计划：" + id + "不存在");
    }
}
