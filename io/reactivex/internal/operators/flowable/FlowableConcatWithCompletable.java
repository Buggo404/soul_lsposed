package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableConcatWithCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.CompletableSource other;

    static final class ConcatWithSubscriber<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.CompletableObserver, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -7346385463600070225L;
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean inCompletable;
        io.reactivex.CompletableSource other;
        org.reactivestreams.Subscription upstream;

        ConcatWithSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.CompletableSource r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.other = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.inCompletable
                if (r0 == 0) goto La
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                goto L19
            La:
                r0 = 1
                r2.inCompletable = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.upstream = r0
                io.reactivex.CompletableSource r0 = r2.other
                r1 = 0
                r2.other = r1
                r0.subscribe(r2)
            L19:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.request(r2)
                return
        }
    }

    public FlowableConcatWithCompletable(io.reactivex.Flowable<T> r1, io.reactivex.CompletableSource r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable$ConcatWithSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableConcatWithCompletable$ConcatWithSubscriber
            io.reactivex.CompletableSource r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
