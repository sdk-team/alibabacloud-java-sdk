// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class ItemAddRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public ItemAddQuery query;

    public static ItemAddRequest build(java.util.Map<String, ?> map) throws Exception {
        ItemAddRequest self = new ItemAddRequest();
        return TeaModel.build(map, self);
    }

    public ItemAddRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ItemAddRequest setQuery(ItemAddQuery query) {
        this.query = query;
        return this;
    }
    public ItemAddQuery getQuery() {
        return this.query;
    }

}
