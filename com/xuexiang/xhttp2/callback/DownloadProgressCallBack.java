package com.xuexiang.xhttp2.callback;

/* loaded from: classes.dex */
public abstract class DownloadProgressCallBack<T> extends com.xuexiang.xhttp2.callback.CallBack<T> {
    public DownloadProgressCallBack() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void onComplete(java.lang.String r1);

    @Override // com.xuexiang.xhttp2.callback.CallBack
    public void onCompleted() {
            r0 = this;
            return
    }

    @Override // com.xuexiang.xhttp2.callback.CallBack
    public void onSuccess(T r1) {
            r0 = this;
            return
    }

    public abstract void update(long r1, long r3, boolean r5);
}
