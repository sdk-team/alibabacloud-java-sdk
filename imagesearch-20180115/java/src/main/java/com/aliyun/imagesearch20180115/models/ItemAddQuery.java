// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagesearch20180115.models;

import com.aliyun.tea.*;

public class ItemAddQuery extends TeaModel {
    @NameInMap("instanceName")
    @Validation(required = true)
    public String instanceName;

    public static ItemAddQuery build(java.util.Map<String, ?> map) throws Exception {
        ItemAddQuery self = new ItemAddQuery();
        return TeaModel.build(map, self);
    }

    public ItemAddQuery setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

}
