// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200202.models;

import com.aliyun.tea.*;

public class MapTestShrinkRequest extends TeaModel {
    @NameInMap("WorkSpaceId")
    public String workSpaceId;

    @NameInMap("WorkSpaceName")
    public String workSpaceName;

    @NameInMap("PreferToBeReleased")
    public Boolean preferToBeReleased;

    @NameInMap("DateVersion")
    public java.util.List<String> dateVersion;

    @NameInMap("SdkTypes")
    public String sdkTypesShrink;

    public static MapTestShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        MapTestShrinkRequest self = new MapTestShrinkRequest();
        return TeaModel.build(map, self);
    }

    public MapTestShrinkRequest setWorkSpaceId(String workSpaceId) {
        this.workSpaceId = workSpaceId;
        return this;
    }
    public String getWorkSpaceId() {
        return this.workSpaceId;
    }

    public MapTestShrinkRequest setWorkSpaceName(String workSpaceName) {
        this.workSpaceName = workSpaceName;
        return this;
    }
    public String getWorkSpaceName() {
        return this.workSpaceName;
    }

    public MapTestShrinkRequest setPreferToBeReleased(Boolean preferToBeReleased) {
        this.preferToBeReleased = preferToBeReleased;
        return this;
    }
    public Boolean getPreferToBeReleased() {
        return this.preferToBeReleased;
    }

    public MapTestShrinkRequest setDateVersion(java.util.List<String> dateVersion) {
        this.dateVersion = dateVersion;
        return this;
    }
    public java.util.List<String> getDateVersion() {
        return this.dateVersion;
    }

    public MapTestShrinkRequest setSdkTypesShrink(String sdkTypesShrink) {
        this.sdkTypesShrink = sdkTypesShrink;
        return this;
    }
    public String getSdkTypesShrink() {
        return this.sdkTypesShrink;
    }

}
