package com.xuexiang.xhttp2.request;

/* loaded from: classes.dex */
public class CustomRequest extends com.xuexiang.xhttp2.request.BaseRequest<com.xuexiang.xhttp2.request.CustomRequest> {



    public CustomRequest() {
            r1 = this;
            java.lang.String r0 = ""
            r1.<init>(r0)
            return
    }

    private <T> io.reactivex.disposables.Disposable call(io.reactivex.Observable<T> r3, com.xuexiang.xhttp2.callback.CallBackProxy<? extends com.xuexiang.xhttp2.model.ApiResult<T>, T> r4) {
            r2 = this;
            com.xuexiang.xhttp2.request.CustomRequest r0 = r2.build()
            io.reactivex.Observable r3 = r0.toObservable(r3, r4)
            java.lang.Class<com.xuexiang.xhttp2.cache.model.CacheResult> r0 = com.xuexiang.xhttp2.cache.model.CacheResult.class
            java.lang.reflect.Type r1 = r4.getRawType()
            if (r0 == r1) goto L29
            com.xuexiang.xhttp2.request.CustomRequest$2 r0 = new com.xuexiang.xhttp2.request.CustomRequest$2
            r0.<init>(r2)
            io.reactivex.Observable r3 = r3.compose(r0)
            com.xuexiang.xhttp2.subsciber.CallBackSubscriber r0 = new com.xuexiang.xhttp2.subsciber.CallBackSubscriber
            com.xuexiang.xhttp2.callback.CallBack r4 = r4.getCallBack()
            r0.<init>(r4)
            io.reactivex.Observer r3 = r3.subscribeWith(r0)
            io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
            return r3
        L29:
            com.xuexiang.xhttp2.subsciber.CallBackSubscriber r0 = new com.xuexiang.xhttp2.subsciber.CallBackSubscriber
            com.xuexiang.xhttp2.callback.CallBack r4 = r4.getCallBack()
            r0.<init>(r4)
            io.reactivex.Observer r3 = r3.subscribeWith(r0)
            io.reactivex.disposables.Disposable r3 = (io.reactivex.disposables.Disposable) r3
            return r3
    }

    private void checkValidate() {
            r1 = this;
            retrofit2.Retrofit r0 = r1.mRetrofit
            if (r0 != 0) goto L7
            r1.build()
        L7:
            return
    }

    public <T> io.reactivex.Observable<T> apiCall(io.reactivex.Observable<? extends com.xuexiang.xhttp2.model.ApiResult<T>> r8) {
            r7 = this;
            r7.checkValidate()
            com.xuexiang.xhttp2.transform.HttpResultTransformer r0 = new com.xuexiang.xhttp2.transform.HttpResultTransformer
            r0.<init>()
            io.reactivex.Observable r8 = r8.compose(r0)
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            boolean r1 = r7.mIsSyncRequest
            boolean r2 = r7.mIsOnMainThread
            r0.<init>(r1, r2)
            io.reactivex.Observable r8 = r8.compose(r0)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r6 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r1 = r7.mRetryCount
            int r0 = r7.mRetryDelay
            long r2 = (long) r0
            int r0 = r7.mRetryIncreaseDelay
            long r4 = (long) r0
            r0 = r6
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r8 = r8.retryWhen(r6)
            return r8
    }

    public <T> io.reactivex.disposables.Disposable apiCall(io.reactivex.Observable r2, com.xuexiang.xhttp2.callback.CallBack<T> r3) {
            r1 = this;
            com.xuexiang.xhttp2.request.CustomRequest$1 r0 = new com.xuexiang.xhttp2.request.CustomRequest$1
            r0.<init>(r1, r3)
            io.reactivex.disposables.Disposable r2 = r1.call(r2, r0)
            return r2
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    public /* bridge */ /* synthetic */ com.xuexiang.xhttp2.request.BaseRequest build() {
            r1 = this;
            com.xuexiang.xhttp2.request.CustomRequest r0 = r1.build()
            return r0
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    public com.xuexiang.xhttp2.request.CustomRequest build() {
            r1 = this;
            com.xuexiang.xhttp2.request.BaseRequest r0 = super.build()
            com.xuexiang.xhttp2.request.CustomRequest r0 = (com.xuexiang.xhttp2.request.CustomRequest) r0
            return r0
    }

    public <T> io.reactivex.Observable<T> call(io.reactivex.Observable<T> r8) {
            r7 = this;
            r7.checkValidate()
            com.xuexiang.xhttp2.transform.HandleErrTransformer r0 = new com.xuexiang.xhttp2.transform.HandleErrTransformer
            r0.<init>()
            io.reactivex.Observable r8 = r8.compose(r0)
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            boolean r1 = r7.mIsSyncRequest
            boolean r2 = r7.mIsOnMainThread
            r0.<init>(r1, r2)
            io.reactivex.Observable r8 = r8.compose(r0)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r6 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r1 = r7.mRetryCount
            int r0 = r7.mRetryDelay
            long r2 = (long) r0
            int r0 = r7.mRetryIncreaseDelay
            long r4 = (long) r0
            r0 = r6
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r8 = r8.retryWhen(r6)
            return r8
    }

    public <T> void call(io.reactivex.Observable<T> r2, com.xuexiang.xhttp2.callback.CallBack<T> r3) {
            r1 = this;
            com.xuexiang.xhttp2.subsciber.CallBackSubscriber r0 = new com.xuexiang.xhttp2.subsciber.CallBackSubscriber
            r0.<init>(r3)
            r1.call(r2, r0)
            return
    }

    public <R> void call(io.reactivex.Observable<R> r1, io.reactivex.Observer<R> r2) {
            r0 = this;
            io.reactivex.Observable r1 = r0.call(r1)
            r1.subscribe(r2)
            return
    }

    public <T> T create(java.lang.Class<T> r2) {
            r1 = this;
            r1.checkValidate()
            retrofit2.Retrofit r0 = r1.mRetrofit
            java.lang.Object r2 = r0.create(r2)
            return r2
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    protected io.reactivex.Observable<okhttp3.ResponseBody> generateRequest() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.xuexiang.xhttp2.request.BaseRequest
    protected <T> io.reactivex.Observable<com.xuexiang.xhttp2.cache.model.CacheResult<T>> toObservable(io.reactivex.Observable r7, com.xuexiang.xhttp2.callback.CallBackProxy<? extends com.xuexiang.xhttp2.model.ApiResult<T>, T> r8) {
            r6 = this;
            r6.checkValidate()
            com.xuexiang.xhttp2.transform.HttpResultTransformer r0 = new com.xuexiang.xhttp2.transform.HttpResultTransformer
            r0.<init>()
            io.reactivex.Observable r7 = r7.compose(r0)
            com.xuexiang.xhttp2.transform.HttpSchedulersTransformer r0 = new com.xuexiang.xhttp2.transform.HttpSchedulersTransformer
            boolean r1 = r6.mIsSyncRequest
            boolean r2 = r6.mIsOnMainThread
            r0.<init>(r1, r2)
            io.reactivex.Observable r7 = r7.compose(r0)
            com.xuexiang.xhttp2.cache.RxCache r0 = r6.mRxCache
            com.xuexiang.xhttp2.cache.model.CacheMode r1 = r6.mCacheMode
            com.xuexiang.xhttp2.callback.CallBack r8 = r8.getCallBack()
            java.lang.reflect.Type r8 = r8.getType()
            io.reactivex.ObservableTransformer r8 = r0.transformer(r1, r8)
            io.reactivex.Observable r7 = r7.compose(r8)
            com.xuexiang.xhttp2.transform.func.RetryExceptionFunc r8 = new com.xuexiang.xhttp2.transform.func.RetryExceptionFunc
            int r1 = r6.mRetryCount
            int r0 = r6.mRetryDelay
            long r2 = (long) r0
            int r0 = r6.mRetryIncreaseDelay
            long r4 = (long) r0
            r0 = r8
            r0.<init>(r1, r2, r4)
            io.reactivex.Observable r7 = r7.retryWhen(r8)
            return r7
    }
}
