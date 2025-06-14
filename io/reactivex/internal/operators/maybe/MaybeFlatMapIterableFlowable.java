package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFlatMapIterableFlowable<T, R> extends io.reactivex.Flowable<R> {
    final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
    final io.reactivex.MaybeSource<T> source;

    static final class FlatMapIterableObserver<T, R> extends io.reactivex.internal.subscriptions.BasicIntQueueSubscription<R> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -8938804753851907758L;
        final org.reactivestreams.Subscriber<? super R> actual;
        volatile boolean cancelled;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f345d;

        /* renamed from: it */
        volatile java.util.Iterator<? extends R> f346it;
        final io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> mapper;
        boolean outputFused;
        final java.util.concurrent.atomic.AtomicLong requested;

        FlatMapIterableObserver(org.reactivestreams.Subscriber<? super R> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f345d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f345d = r0
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                r0 = 0
                r1.f346it = r0
                return
        }

        void drain() {
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                org.reactivestreams.Subscriber<? super R> r0 = r11.actual
                java.util.Iterator<? extends R> r1 = r11.f346it
                boolean r2 = r11.outputFused
                if (r2 == 0) goto L19
                if (r1 == 0) goto L19
                r1 = 0
                r0.onNext(r1)
                r0.onComplete()
                return
            L19:
                r2 = 1
            L1a:
                if (r1 == 0) goto L73
                java.util.concurrent.atomic.AtomicLong r3 = r11.requested
                long r3 = r3.get()
                r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r5 != 0) goto L2f
                r11.fastPath(r0, r1)
                return
            L2f:
                r5 = 0
                r7 = r5
            L32:
                int r9 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r9 == 0) goto L6a
                boolean r9 = r11.cancelled
                if (r9 == 0) goto L3b
                return
            L3b:
                java.lang.Object r9 = r1.next()     // Catch: java.lang.Throwable -> L62
                java.lang.String r10 = "The iterator returned a null value"
                java.lang.Object r9 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r10)     // Catch: java.lang.Throwable -> L62
                r0.onNext(r9)
                boolean r9 = r11.cancelled
                if (r9 == 0) goto L4d
                return
            L4d:
                r9 = 1
                long r7 = r7 + r9
                boolean r9 = r1.hasNext()     // Catch: java.lang.Throwable -> L5a
                if (r9 != 0) goto L32
                r0.onComplete()
                return
            L5a:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r0.onError(r1)
                return
            L62:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r0.onError(r1)
                return
            L6a:
                int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
                if (r3 == 0) goto L73
                java.util.concurrent.atomic.AtomicLong r3 = r11.requested
                io.reactivex.internal.util.BackpressureHelper.produced(r3, r7)
            L73:
                int r2 = -r2
                int r2 = r11.addAndGet(r2)
                if (r2 != 0) goto L7b
                return
            L7b:
                if (r1 != 0) goto L1a
                java.util.Iterator<? extends R> r1 = r11.f346it
                goto L1a
        }

        void fastPath(org.reactivestreams.Subscriber<? super R> r2, java.util.Iterator<? extends R> r3) {
                r1 = this;
            L0:
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L23
                r2.onNext(r0)
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L11
                return
            L11:
                boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L1b
                if (r0 != 0) goto L0
                r2.onComplete()
                return
            L1b:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
            L23:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                java.util.Iterator<? extends R> r0 = r1.f346it
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f345d = r0
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f345d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f345d = r2
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r0 = r1.mapper     // Catch: java.lang.Throwable -> L1e
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L1e
                java.lang.Iterable r2 = (java.lang.Iterable) r2     // Catch: java.lang.Throwable -> L1e
                java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L1e
                boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L1e
                if (r0 != 0) goto L18
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r2.onComplete()
                return
            L18:
                r1.f346it = r2
                r1.drain()
                return
            L1e:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public R poll() throws java.lang.Exception {
                r4 = this;
                java.util.Iterator<? extends R> r0 = r4.f346it
                r1 = 0
                if (r0 == 0) goto L18
                java.lang.Object r2 = r0.next()
                java.lang.String r3 = "The iterator returned a null value"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L17
                r4.f346it = r1
            L17:
                return r2
            L18:
                return r1
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r2)
                if (r0 == 0) goto Le
                java.util.concurrent.atomic.AtomicLong r0 = r1.requested
                io.reactivex.internal.util.BackpressureHelper.add(r0, r2)
                r1.drain()
            Le:
                return
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }
    }

    public MaybeFlatMapIterableFlowable(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super R> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable$FlatMapIterableObserver r1 = new io.reactivex.internal.operators.maybe.MaybeFlatMapIterableFlowable$FlatMapIterableObserver
            io.reactivex.functions.Function<? super T, ? extends java.lang.Iterable<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
