// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBandwidthPackageAttributeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyBandwidthPackageAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBandwidthPackageAttributeResponse self = new ModifyBandwidthPackageAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBandwidthPackageAttributeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
