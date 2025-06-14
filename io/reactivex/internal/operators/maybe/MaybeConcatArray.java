package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeConcatArray<T> extends io.reactivex.Flowable<T> {
    final io.reactivex.MaybeSource<? extends T>[] sources;

    static final class ConcatMaybeObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.MaybeObserver<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 3520831347801429610L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final java.util.concurrent.atomic.AtomicReference<java.lang.Object> current;
        final io.reactivex.internal.disposables.SequentialDisposable disposables;
        int index;
        long produced;
        final java.util.concurrent.atomic.AtomicLong requested;
        final io.reactivex.MaybeSource<? extends T>[] sources;

        ConcatMaybeObserver(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.MaybeSource<? extends T>[] r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.sources = r2
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.disposables = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                io.reactivex.internal.util.NotificationLite r2 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r1.<init>(r2)
                r0.current = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.disposables
                r0.dispose()
                return
        }

        void drain() {
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r11.current
                org.reactivestreams.Subscriber<? super T> r1 = r11.actual
                io.reactivex.internal.disposables.SequentialDisposable r2 = r11.disposables
            Ld:
                boolean r3 = r2.isDisposed()
                r4 = 0
                if (r3 == 0) goto L18
                r0.lazySet(r4)
                return
            L18:
                java.lang.Object r3 = r0.get()
                if (r3 == 0) goto L5d
                io.reactivex.internal.util.NotificationLite r5 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r6 = 1
                if (r3 == r5) goto L3e
                long r7 = r11.produced
                java.util.concurrent.atomic.AtomicLong r5 = r11.requested
                long r9 = r5.get()
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 == 0) goto L3b
                r9 = 1
                long r7 = r7 + r9
                r11.produced = r7
                r0.lazySet(r4)
                r1.onNext(r3)
                goto L41
            L3b:
                r3 = 0
                r6 = r3
                goto L41
            L3e:
                r0.lazySet(r4)
            L41:
                if (r6 == 0) goto L5d
                boolean r3 = r2.isDisposed()
                if (r3 != 0) goto L5d
                int r3 = r11.index
                io.reactivex.MaybeSource<? extends T>[] r4 = r11.sources
                int r5 = r4.length
                if (r3 != r5) goto L54
                r1.onComplete()
                return
            L54:
                int r5 = r3 + 1
                r11.index = r5
                r3 = r4[r3]
                r3.subscribe(r11)
            L5d:
                int r3 = r11.decrementAndGet()
                if (r3 != 0) goto Ld
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.current
                io.reactivex.internal.util.NotificationLite r1 = io.reactivex.internal.util.NotificationLite.COMPLETE
                r0.lazySet(r1)
                r2.drain()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.disposables
                r0.replace(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.current
                r0.lazySet(r2)
                r1.drain()
                return
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
    }

    public MaybeConcatArray(io.reactivex.MaybeSource<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.sources = r1
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeConcatArray$ConcatMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeConcatArray$ConcatMaybeObserver
            io.reactivex.MaybeSource<? extends T>[] r1 = r2.sources
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            r0.drain()
            return
    }
}
