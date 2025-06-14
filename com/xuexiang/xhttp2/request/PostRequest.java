package com.xuexiang.xhttp2.request;

/* loaded from: classes.dex */
public class PostRequest extends com.xuexiang.xhttp2.request.BaseBodyRequest<com.xuexiang.xhttp2.request.PostRequest> {
    public PostRequest(com.xuexiang.xhttp2.model.XHttpRequest r2) {
            r1 = this;
            java.lang.String r0 = r2.getUrl()
            r1.<init>(r0)
            r1.initRequest(r2)
            return
    }

    public PostRequest(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void initRequest(com.xuexiang.xhttp2.model.XHttpRequest r8) {
            r7 = this;
            java.lang.String r0 = r8.getBaseUrl()
            java.lang.String r1 = r8.getUrl()
            long r2 = r8.getTimeout()
            boolean r4 = r8.isAccessToken()
            com.xuexiang.xhttp2.cache.model.CacheMode r5 = r8.getCacheMode()
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L1d
            r7.baseUrl(r0)
        L1d:
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L2e
            com.xuexiang.xhttp2.request.BaseRequest r0 = r7.cacheMode(r5)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            r0.cacheKey(r1)
        L2e:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 > 0) goto L36
            r2 = 15000(0x3a98, double:7.411E-320)
        L36:
            com.xuexiang.xhttp2.request.BaseRequest r0 = r7.accessToken(r4)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            com.xuexiang.xhttp2.request.BaseRequest r0 = r0.timeOut(r2)
            com.xuexiang.xhttp2.request.PostRequest r0 = (com.xuexiang.xhttp2.request.PostRequest) r0
            java.lang.String r8 = r8.toString()
            r0.upJson(r8)
            return
    }
}
