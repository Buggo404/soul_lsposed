package com.xuexiang.xhttp2.subsciber;

/* loaded from: classes.dex */
public class CallBackSubscriber<T> extends com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> {
    private com.xuexiang.xhttp2.callback.CallBack<T> mCallBack;

    public CallBackSubscriber(com.xuexiang.xhttp2.callback.CallBack<T> r2) {
            r1 = this;
            r1.<init>()
            r1.mCallBack = r2
            boolean r0 = r2 instanceof com.xuexiang.xhttp2.callback.ProgressLoadingCallBack
            if (r0 == 0) goto Le
            com.xuexiang.xhttp2.callback.ProgressLoadingCallBack r2 = (com.xuexiang.xhttp2.callback.ProgressLoadingCallBack) r2
            r2.subscription(r1)
        Le:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            super.onComplete()
            com.xuexiang.xhttp2.callback.CallBack<T> r0 = r1.mCallBack
            if (r0 == 0) goto La
            r0.onCompleted()
        La:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber
    public void onError(com.xuexiang.xhttp2.exception.ApiException r2) {
            r1 = this;
            com.xuexiang.xhttp2.callback.CallBack<T> r0 = r1.mCallBack
            if (r0 == 0) goto L7
            r0.onError(r2)
        L7:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.observers.DisposableObserver
    public void onStart() {
            r1 = this;
            super.onStart()
            com.xuexiang.xhttp2.callback.CallBack<T> r0 = r1.mCallBack
            if (r0 == 0) goto La
            r0.onStart()
        La:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber
    public void onSuccess(T r2) {
            r1 = this;
            com.xuexiang.xhttp2.callback.CallBack<T> r0 = r1.mCallBack     // Catch: java.lang.Throwable -> L8
            if (r0 == 0) goto Lf
            r0.onSuccess(r2)     // Catch: java.lang.Throwable -> L8
            goto Lf
        L8:
            r2 = move-exception
            r2.printStackTrace()
            r1.onError(r2)
        Lf:
            return
    }
}
