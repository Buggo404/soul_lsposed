package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
public final class FlowableSwitchMapSingle<T, R> extends io.reactivex.Flowable<R> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
    final io.reactivex.Flowable<T> source;

    static final class SwitchMapSingleSubscriber<T, R> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        static final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<java.lang.Object> INNER_DISPOSED = null;
        private static final long serialVersionUID = -5402190102429853762L;
        volatile boolean cancelled;
        final boolean delayErrors;
        volatile boolean done;
        final org.reactivestreams.Subscriber<? super R> downstream;
        long emitted;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R>> inner;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> mapper;
        final java.util.concurrent.atomic.AtomicLong requested;
        org.reactivestreams.Subscription upstream;

        static final class SwitchMapSingleObserver<R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<R> {
            private static final long serialVersionUID = 8042919737683345351L;
            volatile R item;
            final io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> parent;

            SwitchMapSingleObserver(io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber<?, R> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber<?, R> r0 = r1.parent
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }

            @Override // io.reactivex.SingleObserver
            public void onSuccess(R r1) {
                    r0 = this;
                    r0.item = r1
                    io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber<?, R> r1 = r0.parent
                    r1.drain()
                    return
            }
        }

        static {
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver
                r1 = 0
                r0.<init>(r1)
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.INNER_DISPOSED = r0
                return
        }

        SwitchMapSingleSubscriber(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.inner = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.upstream
                r0.cancel()
                r1.disposeInner()
                return
        }

        void disposeInner() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r0 = r2.inner
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<java.lang.Object> r1 = io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.INNER_DISPOSED
                java.lang.Object r0 = r0.getAndSet(r1)
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r0 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) r0
                if (r0 == 0) goto L11
                if (r0 == r1) goto L11
                r0.dispose()
            L11:
                return
        }

        void drain() {
                r12 = this;
                int r0 = r12.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super R> r0 = r12.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r12.errors
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r2 = r12.inner
                java.util.concurrent.atomic.AtomicLong r3 = r12.requested
                long r4 = r12.emitted
                r6 = 1
                r7 = r6
            L13:
                boolean r8 = r12.cancelled
                if (r8 == 0) goto L18
                return
            L18:
                java.lang.Object r8 = r1.get()
                if (r8 == 0) goto L2a
                boolean r8 = r12.delayErrors
                if (r8 != 0) goto L2a
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L2a:
                boolean r8 = r12.done
                java.lang.Object r9 = r2.get()
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r9 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) r9
                if (r9 != 0) goto L36
                r10 = r6
                goto L37
            L36:
                r10 = 0
            L37:
                if (r8 == 0) goto L49
                if (r10 == 0) goto L49
                java.lang.Throwable r1 = r1.terminate()
                if (r1 == 0) goto L45
                r0.onError(r1)
                goto L48
            L45:
                r0.onComplete()
            L48:
                return
            L49:
                if (r10 != 0) goto L65
                R r8 = r9.item
                if (r8 == 0) goto L65
                long r10 = r3.get()
                int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r8 != 0) goto L58
                goto L65
            L58:
                r8 = 0
                io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r9, r8)
                R r8 = r9.item
                r0.onNext(r8)
                r8 = 1
                long r4 = r4 + r8
                goto L13
            L65:
                r12.emitted = r4
                int r7 = -r7
                int r7 = r12.addAndGet(r7)
                if (r7 != 0) goto L13
                return
        }

        void innerError(io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver<R> r3, java.lang.Throwable r4) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r0 = r2.inner
                r1 = 0
                boolean r3 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r3, r1)
                if (r3 == 0) goto L21
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L21
                boolean r3 = r2.delayErrors
                if (r3 != 0) goto L1d
                org.reactivestreams.Subscription r3 = r2.upstream
                r3.cancel()
                r2.disposeInner()
            L1d:
                r2.drain()
                return
            L21:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.errors
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L16
                boolean r2 = r1.delayErrors
                if (r2 != 0) goto Lf
                r1.disposeInner()
            Lf:
                r2 = 1
                r1.done = r2
                r1.drain()
                goto L19
            L16:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L19:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r0 = r3.inner
                java.lang.Object r0 = r0.get()
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r0 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) r0
                if (r0 == 0) goto Ld
                r0.dispose()
            Ld:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r0 = r3.mapper     // Catch: java.lang.Throwable -> L39
                java.lang.Object r4 = r0.apply(r4)     // Catch: java.lang.Throwable -> L39
                java.lang.String r0 = "The mapper returned a null SingleSource"
                java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)     // Catch: java.lang.Throwable -> L39
                io.reactivex.SingleSource r4 = (io.reactivex.SingleSource) r4     // Catch: java.lang.Throwable -> L39
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r0 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver
                r0.<init>(r3)
            L20:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r1 = r3.inner
                java.lang.Object r1 = r1.get()
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver r1 = (io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.SwitchMapSingleObserver) r1
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<java.lang.Object> r2 = io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.INNER_DISPOSED
                if (r1 != r2) goto L2d
                goto L38
            L2d:
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r2 = r3.inner
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r1, r0)
                if (r1 == 0) goto L20
                r4.subscribe(r0)
            L38:
                return
            L39:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                org.reactivestreams.Subscription r0 = r3.upstream
                r0.cancel()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<R>> r0 = r3.inner
                io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber$SwitchMapSingleObserver<java.lang.Object> r1 = io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle.SwitchMapSingleSubscriber.INNER_DISPOSED
                r0.getAndSet(r1)
                r3.onError(r4)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.upstream
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.upstream = r3
                org.reactivestreams.Subscriber<? super R> r0 = r2.downstream
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
                return
        }
    }

    public FlowableSwitchMapSingle(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r5) {
            r4 = this;
            io.reactivex.Flowable<T> r0 = r4.source
            io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber r1 = new io.reactivex.internal.operators.mixed.FlowableSwitchMapSingle$SwitchMapSingleSubscriber
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2 = r4.mapper
            boolean r3 = r4.delayErrors
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
