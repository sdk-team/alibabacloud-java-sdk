// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200303.models;

import com.aliyun.tea.*;

public class ListApiRequest extends TeaModel {
    @NameInMap("Sas")
    public java.util.Map<String, ?> sas;

    public static ListApiRequest build(java.util.Map<String, ?> map) throws Exception {
        ListApiRequest self = new ListApiRequest();
        return TeaModel.build(map, self);
    }

    public ListApiRequest setSas(java.util.Map<String, ?> sas) {
        this.sas = sas;
        return this;
    }
    public java.util.Map<String, ?> getSas() {
        return this.sas;
    }

}
