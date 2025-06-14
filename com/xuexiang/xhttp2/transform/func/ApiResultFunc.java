package com.xuexiang.xhttp2.transform.func;

/* loaded from: classes.dex */
public class ApiResultFunc<T> implements io.reactivex.functions.Function<okhttp3.ResponseBody, com.xuexiang.xhttp2.model.ApiResult<T>> {
    private com.google.gson.Gson mGson;
    private boolean mKeepJson;
    private java.lang.reflect.Type mType;

    public ApiResultFunc(java.lang.reflect.Type r3, boolean r4) {
            r2 = this;
            r2.<init>()
            com.google.gson.GsonBuilder r0 = new com.google.gson.GsonBuilder
            r0.<init>()
            r1 = 3
            int[] r1 = new int[r1]
            r1 = {x0022: FILL_ARRAY_DATA , data: [16, 128, 8} // fill-array
            com.google.gson.GsonBuilder r0 = r0.excludeFieldsWithModifiers(r1)
            com.google.gson.GsonBuilder r0 = r0.serializeNulls()
            com.google.gson.Gson r0 = r0.create()
            r2.mGson = r0
            r2.mType = r3
            r2.mKeepJson = r4
            return
    }

    private void handleApiResult(java.lang.Class r2, java.lang.Class r3, com.xuexiang.xhttp2.model.ApiResult r4) throws java.lang.Exception {
            r1 = this;
            com.xuexiang.xhttp2.XHttp r0 = com.xuexiang.xhttp2.XHttp.getInstance()
            boolean r0 = r0.isInStrictMode()
            if (r0 != 0) goto L8b
            java.lang.Object r0 = r4.getData()
            if (r0 != 0) goto L8b
            java.lang.Class<java.util.List> r0 = java.util.List.class
            boolean r0 = r0.isAssignableFrom(r3)
            if (r0 == 0) goto L21
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.setData(r2)
            goto L8b
        L21:
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r3 = r0.isAssignableFrom(r3)
            if (r3 == 0) goto L32
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.setData(r2)
            goto L8b
        L32:
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L40
            java.lang.String r2 = ""
            r4.setData(r2)
            goto L8b
        L40:
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            boolean r3 = r3.equals(r2)
            r0 = 0
            if (r3 == 0) goto L51
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r4.setData(r2)
            goto L8b
        L51:
            java.lang.Class<java.lang.Integer> r3 = java.lang.Integer.class
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L84
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L84
            java.lang.Class<java.lang.Long> r3 = java.lang.Long.class
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L84
            java.lang.Class<java.lang.Double> r3 = java.lang.Double.class
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L84
            java.lang.Class<java.lang.Float> r3 = java.lang.Float.class
            boolean r3 = r3.equals(r2)
            if (r3 == 0) goto L7a
            goto L84
        L7a:
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.Object r2 = com.xuexiang.xhttp2.utils.TypeUtils.newInstance(r2, r3)
            r4.setData(r2)
            goto L8b
        L84:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r4.setData(r2)
        L8b:
            return
    }

    private com.xuexiang.xhttp2.model.ApiResult parseApiResult(java.lang.String r3, com.xuexiang.xhttp2.model.ApiResult r4) throws org.json.JSONException {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r3)
            java.lang.String r3 = "Code"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L1c
            int r3 = r0.getInt(r3)
            r4.setCode(r3)
        L1c:
            java.lang.String r3 = "Data"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L2b
            java.lang.String r3 = r0.getString(r3)
            r4.setData(r3)
        L2b:
            java.lang.String r3 = "Msg"
            boolean r1 = r0.has(r3)
            if (r1 == 0) goto L3a
            java.lang.String r3 = r0.getString(r3)
            r4.setMsg(r3)
        L3a:
            return r4
    }

    private com.xuexiang.xhttp2.model.ApiResult<T> parseApiResult(okhttp3.ResponseBody r6, com.xuexiang.xhttp2.model.ApiResult<T> r7) {
            r5 = this;
            java.lang.String r0 = r6.string()     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            java.lang.reflect.Type r1 = r5.mType     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            r2 = 0
            java.lang.Class r1 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r1, r2)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            boolean r3 = r5.mKeepJson     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            if (r3 == 0) goto L22
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            if (r3 == 0) goto L22
            if (r0 != 0) goto L1b
            java.lang.String r0 = ""
        L1b:
            r7.setData(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            r7.setCode(r2)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            goto L6a
        L22:
            com.xuexiang.xhttp2.model.ApiResult r0 = r5.parseApiResult(r0, r7)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            if (r0 == 0) goto L51
            java.lang.Object r7 = r0.getData()     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            if (r7 == 0) goto L40
            com.google.gson.Gson r7 = r5.mGson     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            java.lang.Object r2 = r0.getData()     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            java.lang.Object r7 = r7.fromJson(r2, r1)     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            r0.setData(r7)     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
            goto L45
        L40:
            java.lang.String r7 = "ApiResult's data is null"
            r0.setMsg(r7)     // Catch: java.io.IOException -> L47 org.json.JSONException -> L4c java.lang.Throwable -> L57
        L45:
            r7 = r0
            goto L6a
        L47:
            r7 = move-exception
            r4 = r0
            r0 = r7
            r7 = r4
            goto L5a
        L4c:
            r7 = move-exception
            r4 = r0
            r0 = r7
            r7 = r4
            goto L63
        L51:
            java.lang.String r0 = "json is null"
            r7.setMsg(r0)     // Catch: java.lang.Throwable -> L57 java.io.IOException -> L59 org.json.JSONException -> L62
            goto L6a
        L57:
            r7 = move-exception
            goto L6e
        L59:
            r0 = move-exception
        L5a:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L57
            r7.setMsg(r0)     // Catch: java.lang.Throwable -> L57
            goto L6a
        L62:
            r0 = move-exception
        L63:
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L57
            r7.setMsg(r0)     // Catch: java.lang.Throwable -> L57
        L6a:
            r6.close()
            return r7
        L6e:
            r6.close()
            throw r7
    }

    private com.xuexiang.xhttp2.model.ApiResult<T> parseCustomApiResult(okhttp3.ResponseBody r6, com.xuexiang.xhttp2.model.ApiResult<T> r7) {
            r5 = this;
            java.lang.reflect.Type r0 = r5.mType
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            java.lang.Class<com.xuexiang.xhttp2.model.ApiResult> r1 = com.xuexiang.xhttp2.model.ApiResult.class
            boolean r0 = r1.isAssignableFrom(r0)
            if (r0 == 0) goto L75
            java.lang.reflect.Type r0 = r5.mType
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            java.lang.Class r0 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r0, r1)
            java.lang.reflect.Type r2 = r5.mType
            java.lang.Class r2 = com.xuexiang.xhttp2.utils.TypeUtils.getClass(r2, r1)
            java.lang.String r3 = r6.string()     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            boolean r4 = r5.mKeepJson     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r4 == 0) goto L4a
            java.lang.Class<java.util.List> r4 = java.util.List.class
            boolean r4 = r4.isAssignableFrom(r2)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r4 != 0) goto L4a
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            boolean r4 = r4.equals(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r4 == 0) goto L4a
            if (r3 != 0) goto L43
            java.lang.String r3 = ""
        L43:
            r7.setData(r3)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r7.setCode(r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            goto L6d
        L4a:
            com.google.gson.Gson r1 = r5.mGson     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.reflect.Type r4 = r5.mType     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            java.lang.Object r1 = r1.fromJson(r3, r4)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            com.xuexiang.xhttp2.model.ApiResult r1 = (com.xuexiang.xhttp2.model.ApiResult) r1     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            if (r1 == 0) goto L5d
            r5.handleApiResult(r0, r2, r1)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            r6.close()
            return r1
        L5d:
            java.lang.String r0 = "json is null"
            r7.setMsg(r0)     // Catch: java.lang.Throwable -> L63 java.lang.Exception -> L65
            goto L6d
        L63:
            r7 = move-exception
            goto L71
        L65:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L63
            r7.setMsg(r0)     // Catch: java.lang.Throwable -> L63
        L6d:
            r6.close()
            goto L7a
        L71:
            r6.close()
            throw r7
        L75:
            java.lang.String r6 = "ApiResult.class.isAssignableFrom(cls) err!!"
            r7.setMsg(r6)
        L7a:
            return r7
    }

    /* renamed from: apply, reason: avoid collision after fix types in other method */
    public com.xuexiang.xhttp2.model.ApiResult<T> apply2(okhttp3.ResponseBody r3) throws java.lang.Exception {
            r2 = this;
            com.xuexiang.xhttp2.model.ApiResult r0 = new com.xuexiang.xhttp2.model.ApiResult
            r0.<init>()
            r1 = -1
            r0.setCode(r1)
            java.lang.reflect.Type r1 = r2.mType
            boolean r1 = r1 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto L14
            com.xuexiang.xhttp2.model.ApiResult r3 = r2.parseCustomApiResult(r3, r0)
            goto L18
        L14:
            com.xuexiang.xhttp2.model.ApiResult r3 = r2.parseApiResult(r3, r0)
        L18:
            return r3
    }

    @Override // io.reactivex.functions.Function
    public /* bridge */ /* synthetic */ java.lang.Object apply(okhttp3.ResponseBody r1) throws java.lang.Exception {
            r0 = this;
            okhttp3.ResponseBody r1 = (okhttp3.ResponseBody) r1
            com.xuexiang.xhttp2.model.ApiResult r1 = r0.apply2(r1)
            return r1
    }
}
