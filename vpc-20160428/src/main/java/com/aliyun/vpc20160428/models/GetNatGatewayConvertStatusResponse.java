// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetNatGatewayConvertStatusResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NatGatewayId")
    @Validation(required = true)
    public String natGatewayId;

    @NameInMap("Bid")
    @Validation(required = true)
    public String bid;

    @NameInMap("AliUid")
    @Validation(required = true)
    public Long aliUid;

    @NameInMap("DstNatType")
    @Validation(required = true)
    public String dstNatType;

    @NameInMap("ConvertSteps")
    @Validation(required = true)
    public java.util.List<GetNatGatewayConvertStatusResponseConvertSteps> convertSteps;

    public static GetNatGatewayConvertStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetNatGatewayConvertStatusResponse self = new GetNatGatewayConvertStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetNatGatewayConvertStatusResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetNatGatewayConvertStatusResponse setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public GetNatGatewayConvertStatusResponse setBid(String bid) {
        this.bid = bid;
        return this;
    }
    public String getBid() {
        return this.bid;
    }

    public GetNatGatewayConvertStatusResponse setAliUid(Long aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public Long getAliUid() {
        return this.aliUid;
    }

    public GetNatGatewayConvertStatusResponse setDstNatType(String dstNatType) {
        this.dstNatType = dstNatType;
        return this;
    }
    public String getDstNatType() {
        return this.dstNatType;
    }

    public GetNatGatewayConvertStatusResponse setConvertSteps(java.util.List<GetNatGatewayConvertStatusResponseConvertSteps> convertSteps) {
        this.convertSteps = convertSteps;
        return this;
    }
    public java.util.List<GetNatGatewayConvertStatusResponseConvertSteps> getConvertSteps() {
        return this.convertSteps;
    }

    public static class GetNatGatewayConvertStatusResponseConvertSteps extends TeaModel {
        @NameInMap("StepName")
        @Validation(required = true)
        public String stepName;

        @NameInMap("StepStatus")
        @Validation(required = true)
        public String stepStatus;

        @NameInMap("StepStartTime")
        @Validation(required = true)
        public String stepStartTime;

        public static GetNatGatewayConvertStatusResponseConvertSteps build(java.util.Map<String, ?> map) throws Exception {
            GetNatGatewayConvertStatusResponseConvertSteps self = new GetNatGatewayConvertStatusResponseConvertSteps();
            return TeaModel.build(map, self);
        }

        public GetNatGatewayConvertStatusResponseConvertSteps setStepName(String stepName) {
            this.stepName = stepName;
            return this;
        }
        public String getStepName() {
            return this.stepName;
        }

        public GetNatGatewayConvertStatusResponseConvertSteps setStepStatus(String stepStatus) {
            this.stepStatus = stepStatus;
            return this;
        }
        public String getStepStatus() {
            return this.stepStatus;
        }

        public GetNatGatewayConvertStatusResponseConvertSteps setStepStartTime(String stepStartTime) {
            this.stepStartTime = stepStartTime;
            return this;
        }
        public String getStepStartTime() {
            return this.stepStartTime;
        }

    }

}
