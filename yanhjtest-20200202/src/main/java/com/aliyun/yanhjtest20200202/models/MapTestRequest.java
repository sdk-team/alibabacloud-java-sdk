// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200202.models;

import com.aliyun.tea.*;

public class MapTestRequest extends TeaModel {
    @NameInMap("WorkSpaceId")
    public String workSpaceId;

    @NameInMap("WorkSpaceName")
    public String workSpaceName;

    @NameInMap("PreferToBeReleased")
    public Boolean preferToBeReleased;

    @NameInMap("DateVersion")
    public java.util.List<String> dateVersion;

    @NameInMap("SdkTypes")
    public java.util.Map<String, String> sdkTypes;

    public static MapTestRequest build(java.util.Map<String, ?> map) throws Exception {
        MapTestRequest self = new MapTestRequest();
        return TeaModel.build(map, self);
    }

    public MapTestRequest setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }
    public String getWorkSpaceId() {
        return this.workSpaceId;
    }

    public MapTestRequest setWorkSpaceName(String workSpaceName) {
        this.workSpaceName = workSpaceName;
        return this;
    }
    public String getWorkSpaceName() {
        return this.workSpaceName;
    }

    public MapTestRequest setPreferToBeReleased(Boolean preferToBeReleased) {
        this.preferToBeReleased = preferToBeReleased;
        return this;
    }
    public Boolean getPreferToBeReleased() {
        return this.preferToBeReleased;
    }

    public MapTestRequest setDateVersion(java.util.List<String> dateVersion) {
        this.dateVersion = dateVersion;
        return this;
    }
    public java.util.List<String> getDateVersion() {
        return this.dateVersion;
    }

    public MapTestRequest setSdkTypes(java.util.Map<String, String> sdkTypes) {
        this.sdkTypes = sdkTypes;
        return this;
    }
    public java.util.Map<String, String> getSdkTypes() {
        return this.sdkTypes;
    }

}
