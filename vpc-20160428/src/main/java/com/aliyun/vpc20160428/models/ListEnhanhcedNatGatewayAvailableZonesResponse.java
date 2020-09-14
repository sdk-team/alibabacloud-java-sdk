// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListEnhanhcedNatGatewayAvailableZonesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Zones")
    @Validation(required = true)
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseZones> zones;

    public static ListEnhanhcedNatGatewayAvailableZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnhanhcedNatGatewayAvailableZonesResponse self = new ListEnhanhcedNatGatewayAvailableZonesResponse();
        return TeaModel.build(map, self);
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListEnhanhcedNatGatewayAvailableZonesResponse setZones(java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<ListEnhanhcedNatGatewayAvailableZonesResponseZones> getZones() {
        return this.zones;
    }

    public static class ListEnhanhcedNatGatewayAvailableZonesResponseZones extends TeaModel {
        @NameInMap("ZoneId")
        @Validation(required = true)
        public String zoneId;

        @NameInMap("LocalName")
        @Validation(required = true)
        public String localName;

        public static ListEnhanhcedNatGatewayAvailableZonesResponseZones build(java.util.Map<String, ?> map) throws Exception {
            ListEnhanhcedNatGatewayAvailableZonesResponseZones self = new ListEnhanhcedNatGatewayAvailableZonesResponseZones();
            return TeaModel.build(map, self);
        }

        public ListEnhanhcedNatGatewayAvailableZonesResponseZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

        public ListEnhanhcedNatGatewayAvailableZonesResponseZones setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

    }

}
