// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyBandwidthPackageSpecResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyBandwidthPackageSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyBandwidthPackageSpecResponse self = new ModifyBandwidthPackageSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyBandwidthPackageSpecResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
