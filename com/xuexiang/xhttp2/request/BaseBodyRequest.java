package com.xuexiang.xhttp2.request;

import com.xuexiang.xhttp2.request.BaseBodyRequest;

/* loaded from: classes.dex */
public abstract class BaseBodyRequest<R extends com.xuexiang.xhttp2.request.BaseBodyRequest> extends com.xuexiang.xhttp2.request.BaseRequest<R> {
    protected byte[] mBytes;
    protected java.lang.String mJson;
    protected okhttp3.MediaType mMediaType;
    protected java.lang.Object mObject;
    protected okhttp3.RequestBody mRequestBody;
    protected java.lang.String mString;
    private com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType mUploadType;

    public enum UploadType extends java.lang.Enum<com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType> {
        private static final /* synthetic */ com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType[] $VALUES = null;
        public static final com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType BODY = null;
        public static final com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType PART = null;

        static {
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r0 = new com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType
                java.lang.String r1 = "PART"
                r2 = 0
                r0.<init>(r1, r2)
                com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.PART = r0
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r1 = new com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType
                java.lang.String r3 = "BODY"
                r4 = 1
                r1.<init>(r3, r4)
                com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.BODY = r1
                r3 = 2
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType[] r3 = new com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.$VALUES = r3
                return
        }

        UploadType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType valueOf(java.lang.String r1) {
                java.lang.Class<com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType> r0 = com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r1 = (com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType) r1
                return r1
        }

        public static com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType[] values() {
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType[] r0 = com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType[] r0 = (com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType[]) r0
                return r0
        }
    }

    public BaseBodyRequest(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r1 = com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.PART
            r0.mUploadType = r1
            return
    }

    private okhttp3.MultipartBody.Part addFile(java.lang.String r4, com.xuexiang.xhttp2.model.HttpParams.FileWrapper r5) {
            r3 = this;
            okhttp3.RequestBody r0 = r3.getRequestBody(r5)
            java.lang.String r1 = "requestBody==null fileWrapper.file must is File/InputStream/byte[]"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r0, r1)
            com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r1 = r5.responseCallBack
            if (r1 == 0) goto L1b
            com.xuexiang.xhttp2.request.body.UploadProgressRequestBody r1 = new com.xuexiang.xhttp2.request.body.UploadProgressRequestBody
            com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r2 = r5.responseCallBack
            r1.<init>(r0, r2)
            java.lang.String r5 = r5.fileName
            okhttp3.MultipartBody$Part r4 = okhttp3.MultipartBody.Part.createFormData(r4, r5, r1)
            return r4
        L1b:
            java.lang.String r5 = r5.fileName
            okhttp3.MultipartBody$Part r4 = okhttp3.MultipartBody.Part.createFormData(r4, r5, r0)
            return r4
    }

    private okhttp3.RequestBody getRequestBody(com.xuexiang.xhttp2.model.HttpParams.FileWrapper r2) {
            r1 = this;
            T r0 = r2.file
            boolean r0 = r0 instanceof java.io.File
            if (r0 == 0) goto L11
            okhttp3.MediaType r0 = r2.contentType
            T r2 = r2.file
            java.io.File r2 = (java.io.File) r2
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r0, r2)
            goto L36
        L11:
            T r0 = r2.file
            boolean r0 = r0 instanceof java.io.InputStream
            if (r0 == 0) goto L22
            okhttp3.MediaType r0 = r2.contentType
            T r2 = r2.file
            java.io.InputStream r2 = (java.io.InputStream) r2
            okhttp3.RequestBody r2 = com.xuexiang.xhttp2.utils.RequestBodyUtils.create(r0, r2)
            goto L36
        L22:
            T r0 = r2.file
            boolean r0 = r0 instanceof byte[]
            if (r0 == 0) goto L35
            okhttp3.MediaType r0 = r2.contentType
            T r2 = r2.file
            byte[] r2 = (byte[]) r2
            byte[] r2 = (byte[]) r2
            okhttp3.RequestBody r2 = okhttp3.RequestBody.create(r0, r2)
            goto L36
        L35:
            r2 = 0
        L36:
            return r2
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    protected io.reactivex.Observable<okhttp3.ResponseBody> generateRequest() {
            r3 = this;
            okhttp3.RequestBody r0 = r3.mRequestBody
            if (r0 == 0) goto L11
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            okhttp3.RequestBody r2 = r3.mRequestBody
            io.reactivex.Observable r0 = r0.postBody(r1, r2)
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
            io.reactivex.Observable r0 = r1.postJson(r2, r0)
            return r0
        L2c:
            java.lang.Object r0 = r3.mObject
            if (r0 == 0) goto L3d
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            java.lang.Object r2 = r3.mObject
            io.reactivex.Observable r0 = r0.postBody(r1, r2)
            return r0
        L3d:
            java.lang.String r0 = r3.mString
            if (r0 == 0) goto L52
            okhttp3.MediaType r1 = r3.mMediaType
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r1, r0)
            com.xuexiang.xhttp2.api.ApiService r1 = r3.mApiManager
            java.lang.String r2 = r3.getUrl()
            io.reactivex.Observable r0 = r1.postBody(r2, r0)
            return r0
        L52:
            byte[] r0 = r3.mBytes
            if (r0 == 0) goto L6d
            java.lang.String r0 = "application/octet-stream"
            okhttp3.MediaType r0 = okhttp3.MediaType.parse(r0)
            byte[] r1 = r3.mBytes
            okhttp3.RequestBody r0 = okhttp3.RequestBody.create(r0, r1)
            com.xuexiang.xhttp2.api.ApiService r1 = r3.mApiManager
            java.lang.String r2 = r3.getUrl()
            io.reactivex.Observable r0 = r1.postBody(r2, r0)
            return r0
        L6d:
            com.xuexiang.xhttp2.model.HttpParams r0 = r3.mParams
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r0 = r0.fileParamsMap
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L86
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.getUrl()
            com.xuexiang.xhttp2.model.HttpParams r2 = r3.mParams
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r2 = r2.urlParamsMap
            io.reactivex.Observable r0 = r0.post(r1, r2)
            return r0
        L86:
            com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r0 = r3.mUploadType
            com.xuexiang.xhttp2.request.BaseBodyRequest$UploadType r1 = com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType.PART
            if (r0 != r1) goto L91
            io.reactivex.Observable r0 = r3.uploadFilesWithParts()
            return r0
        L91:
            io.reactivex.Observable r0 = r3.uploadFilesWithBodys()
            return r0
    }

    public R requestBody(okhttp3.RequestBody r1) {
            r0 = this;
            r0.mRequestBody = r1
            return r0
    }

    public R upBytes(byte[] r1) {
            r0 = this;
            r0.mBytes = r1
            return r0
    }

    public R upJson(java.lang.String r1) {
            r0 = this;
            r0.mJson = r1
            return r0
    }

    public R upObject(@retrofit2.http.Body java.lang.Object r1) {
            r0 = this;
            r0.mObject = r1
            return r0
    }

    public R upString(java.lang.String r1) {
            r0 = this;
            r0.mString = r1
            java.lang.String r1 = "text/plain"
            okhttp3.MediaType r1 = okhttp3.MediaType.parse(r1)
            r0.mMediaType = r1
            return r0
    }

    public R upString(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.mString = r1
            java.lang.String r1 = "MediaType == null"
            com.xuexiang.xhttp2.utils.Utils.checkNotNull(r2, r1)
            okhttp3.MediaType r1 = okhttp3.MediaType.parse(r2)
            r0.mMediaType = r1
            return r0
    }

    public R uploadFile(java.lang.String r2, java.io.File r3, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2, r3, r4)
            return r1
    }

    public R uploadFile(java.lang.String r2, java.io.File r3, java.lang.String r4, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r5) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2, r3, r4, r5)
            return r1
    }

    public R uploadFile(java.lang.String r2, java.io.InputStream r3, java.lang.String r4, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r5) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2, r3, r4, r5)
            return r1
    }

    public R uploadFile(java.lang.String r2, byte[] r3, java.lang.String r4, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r5) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.put(r2, r3, r4, r5)
            return r1
    }

    public R uploadFiles(java.lang.String r2, java.util.List<java.io.File> r3, com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4) {
            r1 = this;
            com.xuexiang.xhttp2.model.HttpParams r0 = r1.mParams
            r0.putFileParams(r2, r3, r4)
            return r1
    }

    protected io.reactivex.Observable<okhttp3.ResponseBody> uploadFilesWithBodys() {
            r7 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.xuexiang.xhttp2.model.HttpParams r1 = r7.mParams
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r1.urlParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.String r3 = "text/plain"
            okhttp3.MediaType r3 = okhttp3.MediaType.parse(r3)
            java.lang.Object r4 = r2.getValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            okhttp3.RequestBody r3 = okhttp3.RequestBody.create(r3, r4)
            java.lang.Object r2 = r2.getKey()
            r0.put(r2, r3)
            goto L11
        L37:
            com.xuexiang.xhttp2.model.HttpParams r1 = r7.mParams
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r1 = r1.fileParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L43:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L78
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L59:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L43
            java.lang.Object r4 = r3.next()
            com.xuexiang.xhttp2.model.HttpParams$FileWrapper r4 = (com.xuexiang.xhttp2.model.HttpParams.FileWrapper) r4
            okhttp3.RequestBody r5 = r7.getRequestBody(r4)
            com.xuexiang.xhttp2.request.body.UploadProgressRequestBody r6 = new com.xuexiang.xhttp2.request.body.UploadProgressRequestBody
            com.xuexiang.xhttp2.callback.impl.IProgressResponseCallBack r4 = r4.responseCallBack
            r6.<init>(r5, r4)
            java.lang.Object r4 = r2.getKey()
            r0.put(r4, r6)
            goto L59
        L78:
            com.xuexiang.xhttp2.api.ApiService r1 = r7.mApiManager
            java.lang.String r2 = r7.getUrl()
            io.reactivex.Observable r0 = r1.uploadFiles(r2, r0)
            return r0
    }

    protected io.reactivex.Observable<okhttp3.ResponseBody> uploadFilesWithParts() {
            r6 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.xuexiang.xhttp2.model.HttpParams r1 = r6.mParams
            java.util.LinkedHashMap<java.lang.String, java.lang.Object> r1 = r1.urlParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L11:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            okhttp3.MultipartBody$Part r2 = okhttp3.MultipartBody.Part.createFormData(r3, r2)
            r0.add(r2)
            goto L11
        L33:
            com.xuexiang.xhttp2.model.HttpParams r1 = r6.mParams
            java.util.LinkedHashMap<java.lang.String, java.util.List<com.xuexiang.xhttp2.model.HttpParams$FileWrapper>> r1 = r1.fileParamsMap
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L3f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            java.util.List r3 = (java.util.List) r3
            java.util.Iterator r3 = r3.iterator()
        L55:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r3.next()
            com.xuexiang.xhttp2.model.HttpParams$FileWrapper r4 = (com.xuexiang.xhttp2.model.HttpParams.FileWrapper) r4
            java.lang.Object r5 = r2.getKey()
            java.lang.String r5 = (java.lang.String) r5
            okhttp3.MultipartBody$Part r4 = r6.addFile(r5, r4)
            r0.add(r4)
            goto L55
        L6f:
            com.xuexiang.xhttp2.api.ApiService r1 = r6.mApiManager
            java.lang.String r2 = r6.getUrl()
            io.reactivex.Observable r0 = r1.uploadFiles(r2, r0)
            return r0
    }

    public <T> R uploadType(com.xuexiang.xhttp2.request.BaseBodyRequest.UploadType r1) {
            r0 = this;
            r0.mUploadType = r1
            return r0
    }
}
