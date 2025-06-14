package com.xuexiang.xhttp2.request;

/* loaded from: classes.dex */
public class DownloadRequest extends com.xuexiang.xhttp2.request.BaseRequest<com.xuexiang.xhttp2.request.DownloadRequest> {
    private boolean mIsUseBaseUrl;
    private java.lang.String mSaveName;
    private java.lang.String mSavePath;


    public DownloadRequest(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    public <T> io.reactivex.disposables.Disposable execute(com.xuexiang.xhttp2.callback.CallBack<T> r9) {
            r8 = this;
            com.xuexiang.xhttp2.request.BaseRequest r0 = r8.build()
            com.xuexiang.xhttp2.request.DownloadRequest r0 = (com.xuexiang.xhttp2.request.DownloadRequest) r0
            io.reactivex.Observable r0 = r0.generateRequest()
            com.xuexiang.xhttp2.request.DownloadRequest$1 r1 = new com.xuexiang.xhttp2.request.DownloadRequest$1
            r1.<init>(r8)
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.transform.HandleErrTransformer r1 = new com.xuexiang.xhttp2.transform.HandleErrTransformer
            r1.<init>()
            io.reactivex.Observable r0 = r0.compose(r1)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r7 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r2 = r8.mRetryCount
            int r1 = r8.mRetryDelay
            long r3 = (long) r1
            int r1 = r8.mRetryIncreaseDelay
            long r5 = (long) r1
            r1 = r7
            r1.<init>(r2, r3, r5)
            io.reactivex.Observable r0 = r0.retryWhen(r7)
            com.xuexiang.xhttp2.subsciber.DownloadSubscriber r1 = new com.xuexiang.xhttp2.subsciber.DownloadSubscriber
            java.lang.String r2 = r8.mSavePath
            java.lang.String r3 = r8.mSaveName
            r1.<init>(r2, r3, r9)
            io.reactivex.Observer r9 = r0.subscribeWith(r1)
            io.reactivex.disposables.Disposable r9 = (io.reactivex.disposables.Disposable) r9
            return r9
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    protected io.reactivex.Observable<okhttp3.ResponseBody> generateRequest() {
            r3 = this;
            boolean r0 = r3.mIsUseBaseUrl
            if (r0 == 0) goto L24
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.getBaseUrl()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r3.getUrl()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            io.reactivex.Observable r0 = r0.downloadFile(r1)
            return r0
        L24:
            com.xuexiang.xhttp2.api.ApiService r0 = r3.mApiManager
            java.lang.String r1 = r3.mUrl
            io.reactivex.Observable r0 = r0.downloadFile(r1)
            return r0
    }

    public com.xuexiang.xhttp2.request.DownloadRequest isUseBaseUrl(boolean r1) {
            r0 = this;
            r0.mIsUseBaseUrl = r1
            return r0
    }

    public com.xuexiang.xhttp2.request.DownloadRequest saveName(java.lang.String r1) {
            r0 = this;
            r0.mSaveName = r1
            return r0
    }

    public com.xuexiang.xhttp2.request.DownloadRequest savePath(java.lang.String r1) {
            r0 = this;
            r0.mSavePath = r1
            return r0
    }
}
