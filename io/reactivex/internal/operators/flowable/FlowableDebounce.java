package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDebounce<T, U> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> debounceSelector;

    static final class DebounceSubscriber<T, U> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 6725975399620862591L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> debounceSelector;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> debouncer;
        boolean done;
        volatile long index;

        /* renamed from: s */
        org.reactivestreams.Subscription f236s;

        static final class DebounceInnerSubscriber<T, U> extends io.reactivex.subscribers.DisposableSubscriber<U> {
            boolean done;
            final long index;
            final java.util.concurrent.atomic.AtomicBoolean once;
            final io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber<T, U> parent;
            final T value;

            DebounceInnerSubscriber(io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber<T, U> r2, long r3, T r5) {
                    r1 = this;
                    r1.<init>()
                    java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                    r0.<init>()
                    r1.once = r0
                    r1.parent = r2
                    r1.index = r3
                    r1.value = r5
                    return
            }

            void emit() {
                    r4 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L13
                    io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber<T, U> r0 = r4.parent
                    long r1 = r4.index
                    T r3 = r4.value
                    r0.emit(r1, r3)
                L13:
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onComplete() {
                    r1 = this;
                    boolean r0 = r1.done
                    if (r0 == 0) goto L5
                    return
                L5:
                    r0 = 1
                    r1.done = r0
                    r1.emit()
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
                    io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber<T, U> r0 = r1.parent
                    r0.onError(r2)
                    return
            }

            @Override // org.reactivestreams.Subscriber
            public void onNext(U r1) {
                    r0 = this;
                    boolean r1 = r0.done
                    if (r1 == 0) goto L5
                    return
                L5:
                    r1 = 1
                    r0.done = r1
                    r0.cancel()
                    r0.emit()
                    return
            }
        }

        DebounceSubscriber(org.reactivestreams.Subscriber<? super T> r2, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.debouncer = r0
                r1.actual = r2
                r1.debounceSelector = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f236s
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void emit(long r3, T r5) {
                r2 = this;
                long r0 = r2.index
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto L2a
                long r3 = r2.get()
                r0 = 0
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 == 0) goto L1b
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onNext(r5)
                r3 = 1
                io.reactivex.internal.util.BackpressureHelper.produced(r2, r3)
                goto L2a
            L1b:
                r2.cancel()
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                io.reactivex.exceptions.MissingBackpressureException r4 = new io.reactivex.exceptions.MissingBackpressureException
                java.lang.String r5 = "Could not deliver value due to lack of requests"
                r4.<init>(r5)
                r3.onError(r4)
            L2a:
                return
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
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.debouncer
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                if (r1 != 0) goto L25
                io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber$DebounceInnerSubscriber r0 = (io.reactivex.internal.operators.flowable.FlowableDebounce.DebounceSubscriber.DebounceInnerSubscriber) r0
                r0.emit()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
            L25:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r5.index
                r2 = 1
                long r0 = r0 + r2
                r5.index = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r5.debouncer
                java.lang.Object r2 = r2.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L19
                r2.dispose()
            L19:
                io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r3 = r5.debounceSelector     // Catch: java.lang.Throwable -> L38
                java.lang.Object r3 = r3.apply(r6)     // Catch: java.lang.Throwable -> L38
                java.lang.String r4 = "The publisher supplied is null"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L38
                org.reactivestreams.Publisher r3 = (org.reactivestreams.Publisher) r3     // Catch: java.lang.Throwable -> L38
                io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber$DebounceInnerSubscriber r4 = new io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber$DebounceInnerSubscriber
                r4.<init>(r5, r0, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r6 = r5.debouncer
                boolean r6 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r6, r2, r4)
                if (r6 == 0) goto L37
                r3.subscribe(r4)
            L37:
                return
            L38:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                r5.cancel()
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onError(r6)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f236s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f236s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto L9
                io.reactivex.internal.util.BackpressureHelper.add(r1, r2)
            L9:
                return
        }
    }

    public FlowableDebounce(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.debounceSelector = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r4) {
            r3 = this;
            io.reactivex.Flowable<T> r0 = r3.source
            io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableDebounce$DebounceSubscriber
            io.reactivex.subscribers.SerializedSubscriber r2 = new io.reactivex.subscribers.SerializedSubscriber
            r2.<init>(r4)
            io.reactivex.functions.Function<? super T, ? extends org.reactivestreams.Publisher<U>> r4 = r3.debounceSelector
            r1.<init>(r2, r4)
            r0.subscribe(r1)
            return
    }
}
