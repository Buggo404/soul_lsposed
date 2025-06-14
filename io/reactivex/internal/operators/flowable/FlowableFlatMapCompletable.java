package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableFlatMapCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final boolean delayErrors;
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final int maxConcurrency;

    static final class FlatMapCompletableMainSubscriber<T> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<T> implements io.reactivex.FlowableSubscriber<T> {
        private static final long serialVersionUID = 8443155186132538303L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final boolean delayErrors;
        final io.reactivex.internal.util.AtomicThrowable errors;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
        final int maxConcurrency;

        /* renamed from: s */
        org.reactivestreams.Subscription f254s;
        final io.reactivex.disposables.CompositeDisposable set;

        final class InnerConsumer extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 8606673141535671828L;
            final /* synthetic */ io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber this$0;

            InnerConsumer(io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
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

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber r0 = r1.this$0
                    r0.innerComplete(r1)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber r0 = r1.this$0
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        FlatMapCompletableMainSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                r0.delayErrors = r3
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.errors = r1
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                r0.maxConcurrency = r4
                r1 = 1
                r0.lazySet(r1)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                org.reactivestreams.Subscription r0 = r1.f254s
                r0.cancel()
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r0 = this;
                return
        }

        void innerComplete(io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber<T>.InnerConsumer r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.delete(r2)
                r1.onComplete()
                return
        }

        void innerError(io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable.FlatMapCompletableMainSubscriber<T>.InnerConsumer r2, java.lang.Throwable r3) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.delete(r2)
                r1.onError(r3)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                int r0 = r3.decrementAndGet()
                if (r0 != 0) goto L1a
                io.reactivex.internal.util.AtomicThrowable r0 = r3.errors
                java.lang.Throwable r0 = r0.terminate()
                if (r0 == 0) goto L14
                org.reactivestreams.Subscriber<? super T> r1 = r3.actual
                r1.onError(r0)
                goto L28
            L14:
                org.reactivestreams.Subscriber<? super T> r0 = r3.actual
                r0.onComplete()
                goto L28
            L1a:
                int r0 = r3.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 == r1) goto L28
                org.reactivestreams.Subscription r0 = r3.f254s
                r1 = 1
                r0.request(r1)
            L28:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r2.errors
                boolean r0 = r0.addThrowable(r3)
                if (r0 == 0) goto L43
                boolean r3 = r2.delayErrors
                if (r3 == 0) goto L2d
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L1e
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L46
            L1e:
                int r3 = r2.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r0) goto L46
                org.reactivestreams.Subscription r3 = r2.f254s
                r0 = 1
                r3.request(r0)
                goto L46
            L2d:
                r2.cancel()
                r3 = 0
                int r3 = r2.getAndSet(r3)
                if (r3 <= 0) goto L46
                io.reactivex.internal.util.AtomicThrowable r3 = r2.errors
                java.lang.Throwable r3 = r3.terminate()
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onError(r3)
                goto L46
            L43:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L46:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r0 = r2.mapper     // Catch: java.lang.Throwable -> L26
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L26
                java.lang.String r0 = "The mapper returned a null CompletableSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L26
                io.reactivex.CompletableSource r3 = (io.reactivex.CompletableSource) r3     // Catch: java.lang.Throwable -> L26
                r2.getAndIncrement()
                io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber$InnerConsumer r0 = new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber$InnerConsumer
                r0.<init>(r2)
                boolean r1 = r2.cancelled
                if (r1 != 0) goto L25
                io.reactivex.disposables.CompositeDisposable r1 = r2.set
                boolean r1 = r1.add(r0)
                if (r1 == 0) goto L25
                r3.subscribe(r0)
            L25:
                return
            L26:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                org.reactivestreams.Subscription r0 = r2.f254s
                r0.cancel()
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f254s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L23
                r2.f254s = r3
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L1f
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                goto L23
            L1f:
                long r0 = (long) r0
                r3.request(r0)
            L23:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                r1 = r1 & 2
                return r1
        }
    }

    public FlowableFlatMapCompletable(io.reactivex.Flowable<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.mapper = r2
            r0.delayErrors = r3
            r0.maxConcurrency = r4
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r6) {
            r5 = this;
            io.reactivex.Flowable<T> r0 = r5.source
            io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableFlatMapCompletable$FlatMapCompletableMainSubscriber
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2 = r5.mapper
            boolean r3 = r5.delayErrors
            int r4 = r5.maxConcurrency
            r1.<init>(r6, r2, r3, r4)
            r0.subscribe(r1)
            return
    }
}
