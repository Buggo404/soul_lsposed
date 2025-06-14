package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatWithSingle<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.SingleSource<? extends T> other;

    static final class ConcatWithSubscriber<T> extends io.reactivex.internal.subscribers.SinglePostCompleteSubscriber<T, T> implements io.reactivex.SingleObserver<T> {
        private static final long serialVersionUID = -7346385463600070225L;
        io.reactivex.SingleSource<? extends T> other;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> otherDisposable;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.SingleSource<? extends T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.other = r2
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.otherDisposable = r1
                return
        }

        @Override // io.reactivex.internal.subscribers.SinglePostCompleteSubscriber, org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                super.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.otherDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f548s = r0
                io.reactivex.SingleSource<? extends T> r0 = r2.other
                r1 = 0
                r2.other = r1
                r0.subscribe(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.produced
                r2 = 1
                long r0 = r0 + r2
                r4.produced = r0
                org.reactivestreams.Subscriber<? super R> r0 = r4.actual
                r0.onNext(r5)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.otherDisposable
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.complete(r1)
                return
        }
    }

    public FlowableConcatWithSingle(io.reactivex.Flowable<T> r1, io.reactivex.SingleSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableConcatWithSingle$ConcatWithSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableConcatWithSingle$ConcatWithSubscriber
            io.reactivex.SingleSource<? extends T> r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
