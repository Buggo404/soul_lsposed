package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableReduceSeedSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final R seed;
    final org.reactivestreams.Publisher<T> source;

    static final class ReduceSeedObserver<T, R> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super R> actual;
        final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;

        /* renamed from: s */
        org.reactivestreams.Subscription f281s;
        R value;

        ReduceSeedObserver(io.reactivex.SingleObserver<? super R> r1, io.reactivex.functions.BiFunction<R, ? super T, R> r2, R r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.value = r3
                r0.reducer = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f281s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f281s = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f281s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                R r0 = r2.value
                if (r0 == 0) goto L10
                r1 = 0
                r2.value = r1
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f281s = r1
                io.reactivex.SingleObserver<? super R> r1 = r2.actual
                r1.onSuccess(r0)
            L10:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                R r0 = r1.value
                if (r0 == 0) goto L11
                r0 = 0
                r1.value = r0
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f281s = r0
                io.reactivex.SingleObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                goto L14
            L11:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L14:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                R r0 = r2.value
                if (r0 == 0) goto L1f
                io.reactivex.functions.BiFunction<R, ? super T, R> r1 = r2.reducer     // Catch: java.lang.Throwable -> L13
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L13
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L13
                r2.value = r3     // Catch: java.lang.Throwable -> L13
                goto L1f
            L13:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f281s
                r0.cancel()
                r2.onError(r3)
            L1f:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f281s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f281s = r3
                io.reactivex.SingleObserver<? super R> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableReduceSeedSingle(org.reactivestreams.Publisher<T> r1, R r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.seed = r2
            r0.reducer = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r5) {
            r4 = this;
            org.reactivestreams.Publisher<T> r0 = r4.source
            io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$ReduceSeedObserver r1 = new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$ReduceSeedObserver
            io.reactivex.functions.BiFunction<R, ? super T, R> r2 = r4.reducer
            R r3 = r4.seed
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
