package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleTakeUntil<T, U> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<U> other;
    final io.reactivex.SingleSource<T> source;

    static final class TakeUntilMainObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -622603812305745221L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilOtherSubscriber other;

        TakeUntilMainObserver(io.reactivex.SingleObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r1 = new io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber
                r1.<init>(r0)
                r0.other = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r0 = r1.other
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r0 = r2.other
                r0.dispose()
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L21
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L21
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
            L21:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r0 = r2.other
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L16
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L16:
                return
        }

        void otherError(java.lang.Throwable r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L21
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L21
                if (r0 == 0) goto L1b
                r0.dispose()
            L1b:
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                return
            L21:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
                return
        }
    }

    static final class TakeUntilOtherSubscriber extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<java.lang.Object> {
        private static final long serialVersionUID = 5170026210238877381L;
        final io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> parent;

        TakeUntilOtherSubscriber(io.reactivex.internal.operators.single.SingleTakeUntil.TakeUntilMainObserver<?> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 == r1) goto L17
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.lazySet(r0)
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver<?> r0 = r2.parent
                java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException
                r1.<init>()
                r0.otherError(r1)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver<?> r0 = r1.parent
                r0.otherError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(java.lang.Object r2) {
                r1 = this;
                boolean r2 = io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r1)
                if (r2 == 0) goto L10
                io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver<?> r2 = r1.parent
                java.util.concurrent.CancellationException r0 = new java.util.concurrent.CancellationException
                r0.<init>()
                r2.otherError(r0)
            L10:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                io.reactivex.internal.subscriptions.SubscriptionHelper.setOnce(r2, r3, r0)
                return
        }
    }

    public SingleTakeUntil(io.reactivex.SingleSource<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver r0 = new io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilMainObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r3 = r2.other
            io.reactivex.internal.operators.single.SingleTakeUntil$TakeUntilOtherSubscriber r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.SingleSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
