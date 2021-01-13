// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200303.models;

import com.aliyun.tea.*;

public class ListApiResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApiResponseBody self = new ListApiResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
