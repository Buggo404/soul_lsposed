package io.reactivex.internal.util;

/* loaded from: classes.dex */
public enum EmptyComponent extends java.lang.Enum<io.reactivex.internal.util.EmptyComponent> implements io.reactivex.FlowableSubscriber<java.lang.Object>, io.reactivex.Observer<java.lang.Object>, io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.SingleObserver<java.lang.Object>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription, io.reactivex.disposables.Disposable {
    private static final /* synthetic */ io.reactivex.internal.util.EmptyComponent[] $VALUES = null;
    public static final io.reactivex.internal.util.EmptyComponent INSTANCE = null;

    static {
            io.reactivex.internal.util.EmptyComponent r0 = new io.reactivex.internal.util.EmptyComponent
            java.lang.String r1 = "INSTANCE"
            r2 = 0
            r0.<init>(r1, r2)
            io.reactivex.internal.util.EmptyComponent.INSTANCE = r0
            r1 = 1
            io.reactivex.internal.util.EmptyComponent[] r1 = new io.reactivex.internal.util.EmptyComponent[r1]
            r1[r2] = r0
            io.reactivex.internal.util.EmptyComponent.$VALUES = r1
            return
    }

    EmptyComponent(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static <T> io.reactivex.Observer<T> asObserver() {
            io.reactivex.internal.util.EmptyComponent r0 = io.reactivex.internal.util.EmptyComponent.INSTANCE
            return r0
    }

    public static <T> org.reactivestreams.Subscriber<T> asSubscriber() {
            io.reactivex.internal.util.EmptyComponent r0 = io.reactivex.internal.util.EmptyComponent.INSTANCE
            return r0
    }

    public static io.reactivex.internal.util.EmptyComponent valueOf(java.lang.String r1) {
            java.lang.Class<io.reactivex.internal.util.EmptyComponent> r0 = io.reactivex.internal.util.EmptyComponent.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.reactivex.internal.util.EmptyComponent r1 = (io.reactivex.internal.util.EmptyComponent) r1
            return r1
    }

    public static io.reactivex.internal.util.EmptyComponent[] values() {
            io.reactivex.internal.util.EmptyComponent[] r0 = io.reactivex.internal.util.EmptyComponent.$VALUES
            java.lang.Object r0 = r0.clone()
            io.reactivex.internal.util.EmptyComponent[] r0 = (io.reactivex.internal.util.EmptyComponent[]) r0
            return r0
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r0 = this;
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
            r0 = this;
            return
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // org.reactivestreams.Subscriber
    public void onComplete() {
            r0 = this;
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onError(java.lang.Throwable r1) {
            r0 = this;
            io.reactivex.plugins.RxJavaPlugins.onError(r1)
            return
    }

    @Override // org.reactivestreams.Subscriber
    public void onNext(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r1) {
            r0 = this;
            r1.dispose()
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r1) {
            r0 = this;
            r1.cancel()
            return
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(java.lang.Object r1) {
            r0 = this;
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r1) {
            r0 = this;
            return
    }
}
