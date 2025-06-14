package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSampleTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean emitLast;
    final long period;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class SampleTimedEmitLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;
        final java.util.concurrent.atomic.AtomicInteger wip;

        SampleTimedEmitLast(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
                r2 = 1
                r1.<init>(r2)
                r0.wip = r1
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
                r1 = this;
                r1.emit()
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L10
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            L10:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.incrementAndGet()
                r1 = 2
                if (r0 != r1) goto L19
                r2.emit()
                java.util.concurrent.atomic.AtomicInteger r0 = r2.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L19
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L19:
                return
        }
    }

    static final class SampleTimedNoLast<T> extends io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver<T> {
        private static final long serialVersionUID = -7139995637533111443L;

        SampleTimedNoLast(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
                r0 = this;
                r0.<init>(r1, r2, r4, r5)
                return
        }

        @Override // io.reactivex.internal.operators.observable.ObservableSampleTimed.SampleTimedObserver
        void complete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r0 = this;
                r0.emit()
                return
        }
    }

    static abstract class SampleTimedObserver<T> extends java.util.concurrent.atomic.AtomicReference<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -3517602651313910099L;
        final io.reactivex.Observer<? super T> actual;
        final long period;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f436s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> timer;
        final java.util.concurrent.TimeUnit unit;

        SampleTimedObserver(io.reactivex.Observer<? super T> r2, long r3, java.util.concurrent.TimeUnit r5, io.reactivex.Scheduler r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.timer = r0
                r1.actual = r2
                r1.period = r3
                r1.unit = r5
                r1.scheduler = r6
                return
        }

        void cancelTimer() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.timer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        abstract void complete();

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r1.cancelTimer()
                io.reactivex.disposables.Disposable r0 = r1.f436s
                r0.dispose()
                return
        }

        void emit() {
                r2 = this;
                r0 = 0
                java.lang.Object r0 = r2.getAndSet(r0)
                if (r0 == 0) goto Lc
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onNext(r0)
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f436s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                r0.cancelTimer()
                r0.complete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r1.cancelTimer()
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r1) {
                r0 = this;
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r8) {
                r7 = this;
                io.reactivex.disposables.Disposable r0 = r7.f436s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r8)
                if (r0 == 0) goto L20
                r7.f436s = r8
                io.reactivex.Observer<? super T> r8 = r7.actual
                r8.onSubscribe(r7)
                io.reactivex.Scheduler r0 = r7.scheduler
                long r4 = r7.period
                java.util.concurrent.TimeUnit r6 = r7.unit
                r1 = r7
                r2 = r4
                io.reactivex.disposables.Disposable r8 = r0.schedulePeriodicallyDirect(r1, r2, r4, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r7.timer
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r8)
            L20:
                return
        }
    }

    public ObservableSampleTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.period = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.emitLast = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r8) {
            r7 = this;
            io.reactivex.observers.SerializedObserver r1 = new io.reactivex.observers.SerializedObserver
            r1.<init>(r8)
            boolean r8 = r7.emitLast
            if (r8 == 0) goto L1b
            io.reactivex.ObservableSource<T> r8 = r7.source
            io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedEmitLast r6 = new io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedEmitLast
            long r2 = r7.period
            java.util.concurrent.TimeUnit r4 = r7.unit
            io.reactivex.Scheduler r5 = r7.scheduler
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            r8.subscribe(r6)
            goto L2c
        L1b:
            io.reactivex.ObservableSource<T> r8 = r7.source
            io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedNoLast r6 = new io.reactivex.internal.operators.observable.ObservableSampleTimed$SampleTimedNoLast
            long r2 = r7.period
            java.util.concurrent.TimeUnit r4 = r7.unit
            io.reactivex.Scheduler r5 = r7.scheduler
            r0 = r6
            r0.<init>(r1, r2, r4, r5)
            r8.subscribe(r6)
        L2c:
            return
    }
}
