package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableReduceMaybe<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.HasUpstreamPublisher<T>, io.reactivex.internal.fuseable.FuseToFlowable<T> {
    final io.reactivex.functions.BiFunction<T, T, T> reducer;
    final io.reactivex.Flowable<T> source;

    static final class ReduceSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        boolean done;
        final io.reactivex.functions.BiFunction<T, T, T> reducer;

        /* renamed from: s */
        org.reactivestreams.Subscription f280s;
        T value;

        ReduceSubscriber(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.reducer = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f280s
                r0.cancel()
                r0 = 1
                r1.done = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.done
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                T r0 = r2.value
                if (r0 == 0) goto L12
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L17
            L12:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L17:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                T r0 = r2.value
                if (r0 != 0) goto Lc
                r2.value = r3
                goto L27
            Lc:
                io.reactivex.functions.BiFunction<T, T, T> r1 = r2.reducer     // Catch: java.lang.Throwable -> L1b
                java.lang.Object r3 = r1.apply(r0, r3)     // Catch: java.lang.Throwable -> L1b
                java.lang.String r0 = "The reducer returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1b
                r2.value = r3     // Catch: java.lang.Throwable -> L1b
                goto L27
            L1b:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f280s
                r0.cancel()
                r2.onError(r3)
            L27:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f280s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f280s = r3
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableReduceMaybe(io.reactivex.Flowable<T> r1, io.reactivex.functions.BiFunction<T, T, T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.reducer = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<T> fuseToFlowable() {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowableReduce r0 = new io.reactivex.internal.operators.flowable.FlowableReduce
            io.reactivex.Flowable<T> r1 = r3.source
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.reducer
            r0.<init>(r1, r2)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamPublisher
    public org.reactivestreams.Publisher<T> source() {
            r1 = this;
            io.reactivex.Flowable<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableReduceMaybe$ReduceSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableReduceMaybe$ReduceSubscriber
            io.reactivex.functions.BiFunction<T, T, T> r2 = r3.reducer
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
