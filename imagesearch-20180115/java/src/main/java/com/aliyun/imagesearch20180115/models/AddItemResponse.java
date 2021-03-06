// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class AddItemResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddItemResponseBody body;

    public static AddItemResponse build(java.util.Map<String, ?> map) throws Exception {
        AddItemResponse self = new AddItemResponse();
        return TeaModel.build(map, self);
    }

    public AddItemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddItemResponse setBody(AddItemResponseBody body) {
        this.body = body;
        return this;
    }
    public AddItemResponseBody getBody() {
        return this.body;
    }

}
