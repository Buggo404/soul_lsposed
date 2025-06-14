package com.xuexiang.xhttp2.subsciber;

/* loaded from: classes.dex */
public abstract class BaseSubscriber<T> extends io.reactivex.observers.DisposableObserver<T> {
    public BaseSubscriber() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            java.lang.String r0 = "--> Subscriber is Complete"
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            return
    }

    protected abstract void onError(com.xuexiang.xhttp2.exception.ApiException r1);

    @Override // io.reactivex.Observer
    public final void onError(java.lang.Throwable r4) {
            r3 = this;
            java.lang.String r0 = "--> e instanceof ApiException, message:"
            java.lang.String r1 = "--> e !instanceof ApiException, message:"
            java.lang.String r2 = "--> Subscriber is onError"
            com.xuexiang.xhttp2.logs.HttpLog.m34e(r2)
            boolean r2 = r4 instanceof com.xuexiang.xhttp2.exception.ApiException     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r4.getMessage()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L44
            com.xuexiang.xhttp2.logs.HttpLog.m34e(r0)     // Catch: java.lang.Throwable -> L44
            r0 = r4
            com.xuexiang.xhttp2.exception.ApiException r0 = (com.xuexiang.xhttp2.exception.ApiException) r0     // Catch: java.lang.Throwable -> L44
            r3.onError(r0)     // Catch: java.lang.Throwable -> L44
            goto L47
        L28:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r1 = r4.getMessage()     // Catch: java.lang.Throwable -> L44
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L44
            com.xuexiang.xhttp2.logs.HttpLog.m34e(r0)     // Catch: java.lang.Throwable -> L44
            com.xuexiang.xhttp2.exception.ApiException r0 = com.xuexiang.xhttp2.exception.ApiExceptionHandler.handleException(r4)     // Catch: java.lang.Throwable -> L44
            r3.onError(r0)     // Catch: java.lang.Throwable -> L44
            goto L47
        L44:
            r4.printStackTrace()
        L47:
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r1) {
            r0 = this;
            r0.onSuccess(r1)     // Catch: java.lang.Throwable -> L4
            goto Lb
        L4:
            r1 = move-exception
            r1.printStackTrace()
            r0.onError(r1)
        Lb:
            return
    }

    @Override // io.reactivex.observers.DisposableObserver
    protected void onStart() {
            r1 = this;
            java.lang.String r0 = "--> Subscriber is onStart"
            com.xuexiang.xhttp2.logs.HttpLog.m33d(r0)
            return
    }

    protected abstract void onSuccess(T r1);
}
