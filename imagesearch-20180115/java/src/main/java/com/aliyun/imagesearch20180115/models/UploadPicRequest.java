// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class UploadPicRequest extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("query")
    @Validation(required = true)
    public UploadPicQuery query;

    public static UploadPicRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadPicRequest self = new UploadPicRequest();
        return TeaModel.build(map, self);
    }

    public UploadPicRequest setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadPicRequest setQuery(UploadPicQuery query) {
        this.query = query;
        return this;
    }
    public UploadPicQuery getQuery() {
        return this.query;
    }

}
