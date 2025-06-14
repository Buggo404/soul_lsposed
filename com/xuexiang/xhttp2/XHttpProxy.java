package com.xuexiang.xhttp2;

/* loaded from: classes.dex */
public class XHttpProxy implements java.lang.reflect.InvocationHandler {
    public static final int JSON_OBJECT_METHOD_PARAM_NUMBER = 1;
    private java.lang.String mThreadType;

    public XHttpProxy() {
            r1 = this;
            java.lang.String r0 = "executeToMain"
            r1.<init>(r0)
            return
    }

    public XHttpProxy(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.mThreadType = r1
            return
    }

    private java.lang.String getCacheKey(java.lang.reflect.Method r2, java.lang.Object[] r3, com.xuexiang.xhttp2.annotation.NetMethod r4) {
            r1 = this;
            com.xuexiang.xhttp2.cache.key.ICacheKeyCreator r0 = com.xuexiang.xhttp2.cache.RxCache.getICacheKeyCreator()
            java.lang.String r2 = r0.getCacheKey(r2, r3, r4)
            return r2
    }

    private com.xuexiang.xhttp2.request.BaseRequest getHttpRequest(java.lang.reflect.Method r9, java.lang.Object[] r10, com.xuexiang.xhttp2.annotation.NetMethod r11) {
            r8 = this;
            java.lang.String r0 = r11.baseUrl()
            java.lang.String r1 = r11.url()
            long r2 = r11.timeout()
            com.xuexiang.xhttp2.cache.model.CacheMode r4 = r11.cacheMode()
            java.lang.String r5 = r11.action()
            r5.hashCode()
            int r6 = r5.hashCode()
            r7 = -1
            switch(r6) {
                case 102230: goto L36;
                case 111375: goto L2b;
                case 3446944: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L40
        L20:
            java.lang.String r6 = "post"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L29
            goto L40
        L29:
            r7 = 2
            goto L40
        L2b:
            java.lang.String r6 = "put"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L34
            goto L40
        L34:
            r7 = 1
            goto L40
        L36:
            java.lang.String r6 = "get"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L3f
            goto L40
        L3f:
            r7 = 0
        L40:
            switch(r7) {
                case 0: goto L52;
                case 1: goto L4d;
                case 2: goto L48;
                default: goto L43;
            }
        L43:
            com.xuexiang.xhttp2.request.DeleteRequest r1 = com.xuexiang.xhttp2.XHttp.delete(r1)
            goto L56
        L48:
            com.xuexiang.xhttp2.request.PostRequest r1 = com.xuexiang.xhttp2.XHttp.post(r1)
            goto L56
        L4d:
            com.xuexiang.xhttp2.request.PutRequest r1 = com.xuexiang.xhttp2.XHttp.put(r1)
            goto L56
        L52:
            com.xuexiang.xhttp2.request.GetRequest r1 = com.xuexiang.xhttp2.XHttp.get(r1)
        L56:
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L5f
            r1.baseUrl(r0)
        L5f:
            com.xuexiang.xhttp2.cache.model.CacheMode r0 = com.xuexiang.xhttp2.cache.model.CacheMode.NO_CACHE
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L7f
            com.xuexiang.xhttp2.request.BaseRequest r0 = r1.cacheMode(r4)
            java.lang.String r9 = r8.getCacheKey(r9, r10, r11)
            r0.cacheKey(r9)
            long r9 = r11.cacheTime()
            r4 = -2
            int r0 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r0 == 0) goto L7f
            r1.cacheTime(r9)
        L7f:
            r9 = 0
            int r9 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r9 > 0) goto L87
            r2 = 15000(0x3a98, double:7.411E-320)
        L87:
            java.lang.String r9 = r8.mThreadType
            com.xuexiang.xhttp2.request.BaseRequest r9 = r1.threadType(r9)
            boolean r10 = r11.keepJson()
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.keepJson(r10)
            boolean r10 = r11.accessToken()
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.accessToken(r10)
            com.xuexiang.xhttp2.request.BaseRequest r9 = r9.timeOut(r2)
            return r9
    }

    private java.util.Map<java.lang.String, java.lang.Object> getParamsMap(java.lang.reflect.Method r2, java.lang.Object[] r3, com.xuexiang.xhttp2.annotation.NetMethod r4) {
            r1 = this;
            r0 = 0
            java.util.Map r2 = r1.getParamsMap(r2, r3, r4, r0)
            return r2
    }

    private java.util.Map<java.lang.String, java.lang.Object> getParamsMap(java.lang.reflect.Method r4, java.lang.Object[] r5, com.xuexiang.xhttp2.annotation.NetMethod r6, int r7) {
            r3 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            java.lang.reflect.Type[] r4 = r4.getGenericParameterTypes()
        L9:
            int r1 = r4.length
            if (r7 >= r1) goto L1a
            java.lang.String[] r1 = r6.parameterNames()
            r1 = r1[r7]
            r2 = r5[r7]
            r0.put(r1, r2)
            int r7 = r7 + 1
            goto L9
        L1a:
            return r0
    }

    private java.lang.reflect.Type getReturnType(java.lang.reflect.Method r4) throws com.xuexiang.xhttp2.exception.ApiException {
            r3 = this;
            java.lang.reflect.Type r0 = r4.getGenericReturnType()
            boolean r1 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L12
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r4 = r0.getActualTypeArguments()
            r0 = 0
            r4 = r4[r0]
            return r4
        L12:
            com.xuexiang.xhttp2.exception.ApiException r0 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "接口方法:"
            r1.<init>(r2)
            java.lang.String r4 = r4.getName()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "的返回值类型不是泛型, 必须返回Observable<T>类型"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r1 = 5012(0x1394, float:7.023E-42)
            r0.<init>(r4, r1)
            throw r0
    }

    public static <T> T proxy(java.lang.Class<T> r1) {
            com.xuexiang.xhttp2.XHttpProxy r0 = new com.xuexiang.xhttp2.XHttpProxy
            r0.<init>()
            java.lang.Object r1 = r0.create(r1)
            return r1
    }

    public static <T> T proxy(java.lang.Class<T> r1, java.lang.String r2) {
            com.xuexiang.xhttp2.XHttpProxy r0 = new com.xuexiang.xhttp2.XHttpProxy
            r0.<init>(r2)
            java.lang.Object r1 = r0.create(r1)
            return r1
    }

    public <T> T create(java.lang.Class<T> r4) {
            r3 = this;
            java.lang.ClassLoader r0 = r4.getClassLoader()
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            r2 = 0
            r1[r2] = r4
            java.lang.Object r4 = java.lang.reflect.Proxy.newProxyInstance(r0, r1, r3)
            return r4
    }

    @Override // java.lang.reflect.InvocationHandler
    public java.lang.Object invoke(java.lang.Object r6, java.lang.reflect.Method r7, java.lang.Object[] r8) throws java.lang.Throwable {
            r5 = this;
            java.lang.Class<com.xuexiang.xhttp2.annotation.NetMethod> r6 = com.xuexiang.xhttp2.annotation.NetMethod.class
            java.lang.annotation.Annotation r6 = r7.getAnnotation(r6)
            com.xuexiang.xhttp2.annotation.NetMethod r6 = (com.xuexiang.xhttp2.annotation.NetMethod) r6
            r0 = 5012(0x1394, float:7.023E-42)
            if (r6 == 0) goto Ldd
            int r1 = r6.paramType()
            r2 = 4
            r3 = 1
            if (r1 != r2) goto L39
            java.lang.reflect.Type[] r1 = r7.getGenericParameterTypes()
            int r1 = r1.length
            if (r1 != r3) goto L1c
            goto L45
        L1c:
            com.xuexiang.xhttp2.exception.ApiException r6 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = "方法NetMethod的paramType为JSON_OBJECT时，接口的方法参数必须是一个"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r0)
            throw r6
        L39:
            java.lang.String[] r1 = r6.parameterNames()
            int r1 = r1.length
            java.lang.reflect.Type[] r4 = r7.getGenericParameterTypes()
            int r4 = r4.length
            if (r1 != r4) goto Lc0
        L45:
            com.xuexiang.xhttp2.request.BaseRequest r0 = r5.getHttpRequest(r7, r8, r6)
            boolean r1 = r0 instanceof com.xuexiang.xhttp2.request.BaseBodyRequest
            r4 = 0
            if (r1 == 0) goto L7e
            int r1 = r6.paramType()
            if (r1 != r3) goto L63
            r1 = r0
            com.xuexiang.xhttp2.request.BaseBodyRequest r1 = (com.xuexiang.xhttp2.request.BaseBodyRequest) r1
            java.util.Map r6 = r5.getParamsMap(r7, r8, r6)
            java.lang.String r6 = com.xuexiang.xhttp2.utils.HttpUtils.toJson(r6)
            r1.upJson(r6)
            goto Lb7
        L63:
            int r1 = r6.paramType()
            if (r1 != r2) goto L76
            r6 = r0
            com.xuexiang.xhttp2.request.BaseBodyRequest r6 = (com.xuexiang.xhttp2.request.BaseBodyRequest) r6
            r8 = r8[r4]
            java.lang.String r8 = com.xuexiang.xhttp2.utils.HttpUtils.toJson(r8)
            r6.upJson(r8)
            goto Lb7
        L76:
            java.util.Map r6 = r5.getParamsMap(r7, r8, r6)
            r0.params(r6)
            goto Lb7
        L7e:
            int r1 = r6.paramType()
            r2 = 3
            if (r1 != r2) goto Lb0
            int r1 = r8.length
            if (r1 <= 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r6.url()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = "/"
            java.lang.StringBuilder r1 = r1.append(r2)
            r2 = r8[r4]
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.url(r1)
            java.util.Map r6 = r5.getParamsMap(r7, r8, r6, r3)
            r0.params(r6)
            goto Lb7
        Lb0:
            java.util.Map r6 = r5.getParamsMap(r7, r8, r6)
            r0.params(r6)
        Lb7:
            java.lang.reflect.Type r6 = r5.getReturnType(r7)
            io.reactivex.Observable r6 = r0.execute(r6)
            return r6
        Lc0:
            com.xuexiang.xhttp2.exception.ApiException r6 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = "方法NetMethod注释与实际参数个数不对应"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r0)
            throw r6
        Ldd:
            com.xuexiang.xhttp2.exception.ApiException r6 = new com.xuexiang.xhttp2.exception.ApiException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r7 = r7.getName()
            java.lang.StringBuilder r7 = r8.append(r7)
            java.lang.String r8 = "方法无NetMethod注释"
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.<init>(r7, r0)
            throw r6
    }
}
