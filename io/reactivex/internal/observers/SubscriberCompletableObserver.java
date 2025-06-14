package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class SubscriberCompletableObserver<T> implements io.reactivex.CompletableObserver, org.reactivestreams.Subscription {

    /* renamed from: d */
    io.reactivex.disposables.Disposable f192d;
    final org.reactivestreams.Subscriber<? super T> subscriber;

    public SubscriberCompletableObserver(org.reactivestreams.Subscriber<? super T> r1) {
            r0 = this;
            r0.<init>()
            r0.subscriber = r1
            return
    }

    @Override // org.reactivestreams.Subscription
    public void cancel() {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f192d
            r0.dispose()
            return
    }

    @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
    public void onComplete() {
            r1 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
            r0.onComplete()
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            org.reactivestreams.Subscriber<? super T> r0 = r1.subscriber
            r0.onError(r2)
            return
    }

    @Override // io.reactivex.CompletableObserver
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = r1.f192d
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.f192d = r2
            org.reactivestreams.Subscriber<? super T> r2 = r1.subscriber
            r2.onSubscribe(r1)
        Lf:
            return
    }

    @Override // org.reactivestreams.Subscription
    public void request(long r1) {
            r0 = this;
            return
    }
}
