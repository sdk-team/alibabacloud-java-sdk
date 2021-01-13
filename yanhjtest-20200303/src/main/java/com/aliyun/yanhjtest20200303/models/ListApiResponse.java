// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200303.models;

import com.aliyun.tea.*;

public class ListApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListApiResponseBody body;

    public static ListApiResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApiResponse self = new ListApiResponse();
        return TeaModel.build(map, self);
    }

    public ListApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApiResponse setBody(ListApiResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApiResponseBody getBody() {
        return this.body;
    }

}
