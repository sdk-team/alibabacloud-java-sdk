// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class UpdateNatGatewayNatTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UpdateNatGatewayNatTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNatGatewayNatTypeResponse self = new UpdateNatGatewayNatTypeResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNatGatewayNatTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
