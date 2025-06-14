package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSkipLastTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final long time;
    final java.util.concurrent.TimeUnit unit;

    static final class SkipLastTimedObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5677354903406201275L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> queue;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f449s;
        final io.reactivex.Scheduler scheduler;
        final long time;
        final java.util.concurrent.TimeUnit unit;

        SkipLastTimedObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, int r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.time = r2
                r0.unit = r4
                r0.scheduler = r5
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r6)
                r0.queue = r1
                r0.delayError = r7
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L17
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f449s
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L17
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r1.queue
                r0.clear()
            L17:
                return
        }

        void drain() {
                r17 = this;
                r0 = r17
                int r1 = r17.getAndIncrement()
                if (r1 == 0) goto L9
                return
            L9:
                io.reactivex.Observer<? super T> r1 = r0.actual
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r0.queue
                boolean r3 = r0.delayError
                java.util.concurrent.TimeUnit r4 = r0.unit
                io.reactivex.Scheduler r5 = r0.scheduler
                long r6 = r0.time
                r8 = 1
                r9 = r8
            L17:
                boolean r10 = r0.cancelled
                if (r10 == 0) goto L21
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r1 = r0.queue
                r1.clear()
                return
            L21:
                boolean r10 = r0.done
                java.lang.Object r11 = r2.peek()
                java.lang.Long r11 = (java.lang.Long) r11
                if (r11 != 0) goto L2d
                r12 = r8
                goto L2e
            L2d:
                r12 = 0
            L2e:
                long r13 = r5.now(r4)
                if (r12 != 0) goto L3e
                long r15 = r11.longValue()
                long r13 = r13 - r6
                int r11 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
                if (r11 <= 0) goto L3e
                r12 = r8
            L3e:
                if (r10 == 0) goto L63
                if (r3 == 0) goto L50
                if (r12 == 0) goto L63
                java.lang.Throwable r2 = r0.error
                if (r2 == 0) goto L4c
                r1.onError(r2)
                goto L4f
            L4c:
                r1.onComplete()
            L4f:
                return
            L50:
                java.lang.Throwable r10 = r0.error
                if (r10 == 0) goto L5d
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r2 = r0.queue
                r2.clear()
                r1.onError(r10)
                return
            L5d:
                if (r12 == 0) goto L63
                r1.onComplete()
                return
            L63:
                if (r12 == 0) goto L6d
                int r9 = -r9
                int r9 = r0.addAndGet(r9)
                if (r9 != 0) goto L17
                return
            L6d:
                r2.poll()
                java.lang.Object r10 = r2.poll()
                r1.onNext(r10)
                goto L17
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<java.lang.Object> r0 = r3.queue
                io.reactivex.Scheduler r1 = r3.scheduler
                java.util.concurrent.TimeUnit r2 = r3.unit
                long r1 = r1.now(r2)
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.offer(r1, r4)
                r3.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f449s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f449s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSkipLastTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, int r6, boolean r7) {
            r0 = this;
            r0.<init>(r1)
            r0.time = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.bufferSize = r6
            r0.delayError = r7
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r11) {
            r10 = this;
            io.reactivex.ObservableSource<T> r0 = r10.source
            io.reactivex.internal.operators.observable.ObservableSkipLastTimed$SkipLastTimedObserver r9 = new io.reactivex.internal.operators.observable.ObservableSkipLastTimed$SkipLastTimedObserver
            long r3 = r10.time
            java.util.concurrent.TimeUnit r5 = r10.unit
            io.reactivex.Scheduler r6 = r10.scheduler
            int r7 = r10.bufferSize
            boolean r8 = r10.delayError
            r1 = r9
            r2 = r11
            r1.<init>(r2, r3, r5, r6, r7, r8)
            r0.subscribe(r9)
            return
    }
}
