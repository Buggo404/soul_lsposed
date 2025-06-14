package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleToFlowable<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.SingleSource<? extends T> source;

    static final class SingleToFlowableObserver<T> extends io.reactivex.internal.subscriptions.DeferredScalarSubscription<T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = 187782011903685568L;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f516d;

        SingleToFlowableObserver(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                io.reactivex.disposables.Disposable r0 = r1.f516d
                r0.dispose()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f516d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f516d = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public SingleToFlowable(io.reactivex.SingleSource<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<? extends T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver r1 = new io.reactivex.internal.operators.single.SingleToFlowable$SingleToFlowableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
