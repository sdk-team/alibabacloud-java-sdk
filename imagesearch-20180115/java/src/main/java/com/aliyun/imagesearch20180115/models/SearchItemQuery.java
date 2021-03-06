// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class SearchItemQuery extends TeaModel {
    @NameInMap("instanceName")
    @Validation(required = true)
    public String instanceName;

    public static SearchItemQuery build(java.util.Map<String, ?> map) throws Exception {
        SearchItemQuery self = new SearchItemQuery();
        return TeaModel.build(map, self);
    }

    public SearchItemQuery setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
