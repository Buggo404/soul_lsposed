package com.xuexiang.xhttp2.request;

/* loaded from: classes.dex */
public class PutRequest extends com.xuexiang.xhttp2.request.BaseBodyRequest<com.xuexiang.xhttp2.request.PutRequest> {
    public PutRequest(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.xuexiang.xhttp2.request.BaseBodyRequest, com.xuexiang.xhttp2.request.BaseRequest
    protected io.reactivex.Observable<okhttp3.ResponseBody> generateRequest() {
            r3 = this;
            okhttp3.RequestBody r0 = r3.mRequestBody
            if (r0 == 0) goto L11
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            okhttp3.RequestBody r2 = r3.mRequestBody
            io.reactivex.Observable r0 = r0.putBody(r1, r2)
            return r0
        L11:
            java.lang.String r0 = r3.mJson
            if (r0 == 0) goto L2c
            java.lang.String r0 = "application/json; charset=utf-8"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            java.lang.String r1 = r3.mJson
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r0, r1)
            com.xuexiang.xhttp2.api.ApiService r1 = r3.mApiManager
            java.lang.String r2 = r3.getUrl()
            io.reactivex.Observable r0 = r1.putJson(r2, r0)
            return r0
        L2c:
            java.lang.Object r0 = r3.mObject
            if (r0 == 0) goto L3d
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            java.lang.Object r2 = r3.mObject
            io.reactivex.Observable r0 = r0.putBody(r1, r2)
            return r0
        L3d:
            java.lang.String r0 = r3.mString
            if (r0 == 0) goto L54
            okhttp3.MediaType r0 = r3.mMediaType
            java.lang.String r1 = r3.mString
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r0, r1)
            com.xuexiang.xhttp2.api.ApiService r1 = r3.mApiManager
            java.lang.String r2 = r3.getUrl()
            io.reactivex.Observable r0 = r1.putBody(r2, r0)
            return r0
        L54:
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            com.xuexiang.xhttp2.model.HttpParams r2 = r3.mParams
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r2.urlParamsMap
            io.reactivex.Observable r0 = r0.put(r1, r2)
            return r0
    }
}
