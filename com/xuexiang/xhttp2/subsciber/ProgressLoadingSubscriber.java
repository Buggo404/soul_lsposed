package com.xuexiang.xhttp2.subsciber;

/* loaded from: classes.dex */
public abstract class ProgressLoadingSubscriber<T> extends com.xuexiang.xhttp2.subsciber.BaseSubscriber<T> implements com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener {
    private com.xuexiang.xhttp2.subsciber.impl.IProgressLoader mIProgressLoader;
    private boolean mIsShowProgress;

    public ProgressLoadingSubscriber() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsShowProgress = r0
            r0 = 0
            r1.init(r0)
            return
    }

    public ProgressLoadingSubscriber(com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsShowProgress = r0
            r1.mIProgressLoader = r2
            r2 = 0
            r1.init(r2)
            return
    }

    public ProgressLoadingSubscriber(com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r1, boolean r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.mIProgressLoader = r1
            r0.mIsShowProgress = r2
            r0.init(r3)
            return
    }

    private void dismissProgress() {
            r1 = this;
            boolean r0 = r1.mIsShowProgress
            if (r0 != 0) goto L5
            return
        L5:
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r0 = r1.mIProgressLoader
            if (r0 == 0) goto L14
            boolean r0 = r0.isLoading()
            if (r0 == 0) goto L14
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r0 = r1.mIProgressLoader
            r0.dismissLoading()
        L14:
            return
    }

    private void init(boolean r2) {
            r1 = this;
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r0 = r1.mIProgressLoader
            if (r0 != 0) goto L5
            return
        L5:
            r0.setCancelable(r2)
            if (r2 == 0) goto Lf
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r2 = r1.mIProgressLoader
            r2.setOnProgressCancelListener(r1)
        Lf:
            return
    }

    private void showProgress() {
            r1 = this;
            boolean r0 = r1.mIsShowProgress
            if (r0 != 0) goto L5
            return
        L5:
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r0 = r1.mIProgressLoader
            if (r0 == 0) goto L14
            boolean r0 = r0.isLoading()
            if (r0 != 0) goto L14
            com.xuexiang.xhttp2.subsciber.impl.IProgressLoader r0 = r1.mIProgressLoader
            r0.showLoading()
        L14:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.impl.OnProgressCancelListener
    public void onCancelProgress() {
            r1 = this;
            boolean r0 = r1.isDisposed()
            if (r0 != 0) goto L9
            r1.dispose()
        L9:
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.Observer
    public void onComplete() {
            r0 = this;
            r0.dismissProgress()
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber
    public void onError(com.xuexiang.xhttp2.exception.ApiException r1) {
            r0 = this;
            com.xuexiang.xhttp2.logs.HttpLog.m36e(r1)
            r0.dismissProgress()
            return
    }

    @Override // com.xuexiang.xhttp2.subsciber.BaseSubscriber, io.reactivex.observers.DisposableObserver
    public void onStart() {
            r0 = this;
            r0.showProgress()
            return
    }
}
