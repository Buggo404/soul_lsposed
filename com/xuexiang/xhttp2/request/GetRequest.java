package com.xuexiang.xhttp2.request;

/* loaded from: classes.dex */
public class GetRequest extends com.xuexiang.xhttp2.request.BaseRequest<com.xuexiang.xhttp2.request.GetRequest> {
    public GetRequest(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    protected io.reactivex.Observable<okhttp3.ResponseBody> generateRequest() {
            r3 = this;
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            com.xuexiang.xhttp2.model.HttpParams r2 = r3.mParams
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r2.urlParamsMap
            io.reactivex.Observable r0 = r0.get(r1, r2)
            return r0
    }
}
