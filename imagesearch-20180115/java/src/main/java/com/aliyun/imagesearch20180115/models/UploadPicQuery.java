// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class UploadPicQuery extends TeaModel {
    @NameInMap("name")
    @Validation(required = true)
    public String name;

    public static UploadPicQuery build(java.util.Map<String, ?> map) throws Exception {
        UploadPicQuery self = new UploadPicQuery();
        return TeaModel.build(map, self);
    }

    public UploadPicQuery setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
