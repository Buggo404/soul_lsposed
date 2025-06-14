package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableConcat extends io.reactivex.Completable {
    final int prefetch;
    final org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> sources;

    static final class CompletableConcatSubscriber extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<io.reactivex.CompletableSource>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 9032184911934499404L;
        volatile boolean active;
        final io.reactivex.CompletableObserver actual;
        int consumed;
        volatile boolean done;
        final io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber.ConcatInnerObserver inner;
        final int limit;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final int prefetch;
        io.reactivex.internal.fuseable.SimpleQueue<io.reactivex.CompletableSource> queue;

        /* renamed from: s */
        org.reactivestreams.Subscription f194s;
        int sourceFused;

        static final class ConcatInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -5454794857847146511L;
            final io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber parent;

            ConcatInnerObserver(io.reactivex.internal.operators.completable.CompletableConcat.CompletableConcatSubscriber r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber r0 = r1.parent
                    r0.innerComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber r0 = r1.parent
                    r0.innerError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                    return
            }
        }

        CompletableConcatSubscriber(io.reactivex.CompletableObserver r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.prefetch = r2
                io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver r1 = new io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver
                r1.<init>(r0)
                r0.inner = r1
                java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
                r1.<init>()
                r0.once = r1
                int r1 = r2 >> 2
                int r2 = r2 - r1
                r0.limit = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f194s
                r0.cancel()
                io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver r0 = r1.inner
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void drain() {
                r5 = this;
                int r0 = r5.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                boolean r0 = r5.isDisposed()
                if (r0 == 0) goto Le
                return
            Le:
                boolean r0 = r5.active
                if (r0 != 0) goto L4a
                boolean r0 = r5.done
                io.reactivex.internal.fuseable.SimpleQueue<io.reactivex.CompletableSource> r1 = r5.queue     // Catch: java.lang.Throwable -> L42
                java.lang.Object r1 = r1.poll()     // Catch: java.lang.Throwable -> L42
                io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1     // Catch: java.lang.Throwable -> L42
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L22
                r4 = r3
                goto L23
            L22:
                r4 = r2
            L23:
                if (r0 == 0) goto L35
                if (r4 == 0) goto L35
                java.util.concurrent.atomic.AtomicBoolean r0 = r5.once
                boolean r0 = r0.compareAndSet(r2, r3)
                if (r0 == 0) goto L34
                io.reactivex.CompletableObserver r0 = r5.actual
                r0.onComplete()
            L34:
                return
            L35:
                if (r4 != 0) goto L4a
                r5.active = r3
                io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver r0 = r5.inner
                r1.subscribe(r0)
                r5.request()
                goto L4a
            L42:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r5.innerError(r0)
                return
            L4a:
                int r0 = r5.decrementAndGet()
                if (r0 != 0) goto L7
                return
        }

        void innerComplete() {
                r1 = this;
                r0 = 0
                r1.active = r0
                r1.drain()
                return
        }

        void innerError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                org.reactivestreams.Subscription r0 = r3.f194s
                r0.cancel()
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onError(r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver r0 = r1.inner
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
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
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber$ConcatInnerObserver r0 = r3.inner
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.CompletableObserver r0 = r3.actual
                r0.onError(r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        public void onNext(io.reactivex.CompletableSource r2) {
                r1 = this;
                int r0 = r1.sourceFused
                if (r0 != 0) goto L15
                io.reactivex.internal.fuseable.SimpleQueue<io.reactivex.CompletableSource> r0 = r1.queue
                boolean r2 = r0.offer(r2)
                if (r2 != 0) goto L15
                io.reactivex.exceptions.MissingBackpressureException r2 = new io.reactivex.exceptions.MissingBackpressureException
                r2.<init>()
                r1.onError(r2)
                return
            L15:
                r1.drain()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1
                r0.onNext(r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r7) {
                r6 = this;
                org.reactivestreams.Subscription r0 = r6.f194s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r7)
                if (r0 == 0) goto L67
                r6.f194s = r7
                int r0 = r6.prefetch
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L17
                r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                goto L18
            L17:
                long r2 = (long) r0
            L18:
                boolean r0 = r7 instanceof io.reactivex.internal.fuseable.QueueSubscription
                if (r0 == 0) goto L46
                r0 = r7
                io.reactivex.internal.fuseable.QueueSubscription r0 = (io.reactivex.internal.fuseable.QueueSubscription) r0
                r4 = 3
                int r4 = r0.requestFusion(r4)
                r5 = 1
                if (r4 != r5) goto L36
                r6.sourceFused = r4
                r6.queue = r0
                r6.done = r5
                io.reactivex.CompletableObserver r7 = r6.actual
                r7.onSubscribe(r6)
                r6.drain()
                return
            L36:
                r5 = 2
                if (r4 != r5) goto L46
                r6.sourceFused = r4
                r6.queue = r0
                io.reactivex.CompletableObserver r0 = r6.actual
                r0.onSubscribe(r6)
                r7.request(r2)
                return
            L46:
                int r0 = r6.prefetch
                if (r0 != r1) goto L56
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r1 = io.reactivex.Flowable.bufferSize()
                r0.<init>(r1)
                r6.queue = r0
                goto L5f
            L56:
                io.reactivex.internal.queue.SpscArrayQueue r0 = new io.reactivex.internal.queue.SpscArrayQueue
                int r1 = r6.prefetch
                r0.<init>(r1)
                r6.queue = r0
            L5f:
                io.reactivex.CompletableObserver r0 = r6.actual
                r0.onSubscribe(r6)
                r7.request(r2)
            L67:
                return
        }

        void request() {
                r4 = this;
                int r0 = r4.sourceFused
                r1 = 1
                if (r0 == r1) goto L18
                int r0 = r4.consumed
                int r0 = r0 + r1
                int r1 = r4.limit
                if (r0 != r1) goto L16
                r1 = 0
                r4.consumed = r1
                org.reactivestreams.Subscription r1 = r4.f194s
                long r2 = (long) r0
                r1.request(r2)
                goto L18
            L16:
                r4.consumed = r0
            L18:
                return
        }
    }

    public CompletableConcat(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            r0.prefetch = r2
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r0 = r3.sources
            io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber r1 = new io.reactivex.internal.operators.completable.CompletableConcat$CompletableConcatSubscriber
            int r2 = r3.prefetch
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
