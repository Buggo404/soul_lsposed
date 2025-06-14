package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTakeLastTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final long count;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    static final class TakeLastTimedObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        final long count;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f457d;
        final boolean delayError;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;
        final io.reactivex.Scheduler scheduler;
        final long time;
        final java.util.concurrent.TimeUnit unit;

        TakeLastTimedObserver(io.reactivex.Observer<? super T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, int r8, boolean r9) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.time = r4
                r0.unit = r6
                r0.scheduler = r7
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r8)
                r0.queue = r1
                r0.delayError = r9
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 != 0) goto L18
                r0 = 1
                r2.cancelled = r0
                io.reactivex.disposables.Disposable r1 = r2.f457d
                r1.dispose()
                r1 = 0
                boolean r0 = r2.compareAndSet(r1, r0)
                if (r0 == 0) goto L18
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r2.queue
                r0.clear()
            L18:
                return
        }

        void drain() {
                r13 = this;
                r0 = 0
                r1 = 1
                boolean r2 = r13.compareAndSet(r0, r1)
                if (r2 != 0) goto L9
                return
            L9:
                io.reactivex.Observer<? super T> r2 = r13.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r3 = r13.queue
                boolean r4 = r13.delayError
            Lf:
                boolean r5 = r13.cancelled
                if (r5 == 0) goto L17
                r3.clear()
                return
            L17:
                if (r4 != 0) goto L24
                java.lang.Throwable r5 = r13.error
                if (r5 == 0) goto L24
                r3.clear()
                r2.onError(r5)
                return
            L24:
                java.lang.Object r5 = r3.poll()
                if (r5 != 0) goto L2c
                r6 = r1
                goto L2d
            L2c:
                r6 = r0
            L2d:
                if (r6 == 0) goto L3b
                java.lang.Throwable r0 = r13.error
                if (r0 == 0) goto L37
                r2.onError(r0)
                goto L3a
            L37:
                r2.onComplete()
            L3a:
                return
            L3b:
                java.lang.Object r6 = r3.poll()
                java.lang.Long r5 = (java.lang.Long) r5
                long r7 = r5.longValue()
                io.reactivex.Scheduler r5 = r13.scheduler
                java.util.concurrent.TimeUnit r9 = r13.unit
                long r9 = r5.now(r9)
                long r11 = r13.time
                long r9 = r9 - r11
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 >= 0) goto L55
                goto Lf
            L55:
                r2.onNext(r6)
                goto Lf
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r14) {
                r13 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r13.queue
                io.reactivex.Scheduler r1 = r13.scheduler
                java.util.concurrent.TimeUnit r2 = r13.unit
                long r1 = r1.now(r2)
                long r3 = r13.time
                long r5 = r13.count
                r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                r8 = 1
                if (r7 != 0) goto L1a
                r7 = r8
                goto L1b
            L1a:
                r7 = 0
            L1b:
                java.lang.Long r9 = java.lang.Long.valueOf(r1)
                r0.offer(r9, r14)
            L22:
                boolean r14 = r0.isEmpty()
                if (r14 != 0) goto L4b
                java.lang.Object r14 = r0.peek()
                java.lang.Long r14 = (java.lang.Long) r14
                long r9 = r14.longValue()
                long r11 = r1 - r3
                int r14 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r14 <= 0) goto L44
                if (r7 != 0) goto L4b
                int r14 = r0.size()
                int r14 = r14 >> r8
                long r9 = (long) r14
                int r14 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
                if (r14 <= 0) goto L4b
            L44:
                r0.poll()
                r0.poll()
                goto L22
            L4b:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f457d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f457d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableTakeLastTimed(io.reactivex.ObservableSource<T> r1, long r2, long r4, java.util.concurrent.TimeUnit r6, io.reactivex.Scheduler r7, int r8, boolean r9) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.time = r4
            r0.unit = r6
            r0.scheduler = r7
            r0.bufferSize = r8
            r0.delayError = r9
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r13) {
            r12 = this;
            io.reactivex.ObservableSource<T> r0 = r12.source
            io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver r11 = new io.reactivex.internal.operators.observable.ObservableTakeLastTimed$TakeLastTimedObserver
            long r3 = r12.count
            long r5 = r12.time
            java.util.concurrent.TimeUnit r7 = r12.unit
            io.reactivex.Scheduler r8 = r12.scheduler
            int r9 = r12.bufferSize
            boolean r10 = r12.delayError
            r1 = r11
            r2 = r13
            r1.<init>(r2, r3, r5, r7, r8, r9, r10)
            r0.subscribe(r11)
            return
    }
}
