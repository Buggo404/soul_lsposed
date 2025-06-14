package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeToFlowable<T> extends io.reactivex.Flowable<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;

    static final class MaybeToFlowableSubscriber<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f363d;

        MaybeToFlowableSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.disposables.Disposable r0 = r1.f363d
                r0.dispose()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f363d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f363d = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public MaybeToFlowable(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeToFlowable$MaybeToFlowableSubscriber r1 = new io.reactivex.internal.operators.maybe.MaybeToFlowable$MaybeToFlowableSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
