package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeTakeUntilPublisher<T, U> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final org.reactivestreams.Publisher<U> other;

    static final class TakeUntilMainMaybeObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2187421758664251153L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver.TakeUntilOtherMaybeObserver<U> other;

        static final class TakeUntilOtherMaybeObserver<U> extends java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> implements io.reactivex.FlowableSubscriber<U> {
            private static final long serialVersionUID = -1266041316834525931L;
            final io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> parent;

            TakeUntilOtherMaybeObserver(io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher.TakeUntilMainMaybeObserver<?, U> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<?, U> r0 = r1.parent
                    r0.otherComplete()
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<?, U> r0 = r1.parent
                    r0.otherError(r2)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(java.lang.Object r1) {
                    r0 = this;
                    io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                    io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver<?, U> r1 = r0.parent
                    r1.otherComplete()
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

        TakeUntilMainMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver
                r1.<init>(r0)
                r0.other = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver<U> r0 = r1.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
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

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver<U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver<U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L15
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L18:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver<U> r0 = r2.other
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L14
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSuccess(r3)
            L14:
                return
        }

        void otherComplete() {
                r1 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r0 == 0) goto Lb
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
            Lb:
                return
        }

        void otherError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                if (r0 == 0) goto Lc
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }
    }

    public MaybeTakeUntilPublisher(io.reactivex.MaybeSource<T> r1, org.reactivestreams.Publisher<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            org.reactivestreams.Publisher<U> r3 = r2.other
            io.reactivex.internal.operators.maybe.MaybeTakeUntilPublisher$TakeUntilMainMaybeObserver$TakeUntilOtherMaybeObserver<U> r1 = r0.other
            r3.subscribe(r1)
            io.reactivex.MaybeSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
