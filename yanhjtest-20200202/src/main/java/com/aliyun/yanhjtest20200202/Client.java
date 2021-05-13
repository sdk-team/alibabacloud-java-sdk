// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yanhjtest20200202;

import com.aliyun.tea.*;
import com.aliyun.yanhjtest20200202.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("yanhjtest", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get(regionId))) {
            return endpointMap.get(regionId);
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }

    public MapTestResponse mapTestWithOptions(MapTestRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        MapTestShrinkRequest request = new MapTestShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sdkTypes)) {
            request.sdkTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sdkTypes, "SdkTypes", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("MapTest", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new MapTestResponse());
    }

    public MapTestResponse mapTest(MapTestRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.mapTestWithOptions(request, runtime);
    }

    public SendCommondResponse sendCommondWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("SendCommond", "2020-02-02", "HTTPS", "POST", "AK", "json", req, runtime), new SendCommondResponse());
    }

    public SendCommondResponse sendCommond() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCommondWithOptions(runtime);
    }

    public GetAllProductResponse getAllProductWithOptions(GetAllProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAllProduct", "2020-02-02", "HTTPS", "GET", "AK", "json", req, runtime), new GetAllProductResponse());
    }

    public GetAllProductResponse getAllProduct(GetAllProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAllProductWithOptions(request, runtime);
    }
}
