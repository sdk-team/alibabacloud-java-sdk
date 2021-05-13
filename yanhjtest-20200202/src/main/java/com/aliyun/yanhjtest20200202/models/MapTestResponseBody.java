// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200202.models;

import com.aliyun.tea.*;

public class MapTestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static MapTestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MapTestResponseBody self = new MapTestResponseBody();
        return TeaModel.build(map, self);
    }

    public MapTestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
