package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDebounceTimed<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    static final class DebounceEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 6812032969491025141L;
        final long idx;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> parent;
        final T value;

        DebounceEmitter(T r2, long r3, io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceTimedObserver<T> r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                r1.value = r2
                r1.idx = r3
                r1.parent = r5
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
                r2 = this;
                java.lang.Object r0 = r2.get()
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 != r1) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L13
                io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceTimedObserver<T> r0 = r4.parent
                long r1 = r4.idx
                T r3 = r4.value
                r0.emit(r1, r3, r4)
            L13:
                return
        }

        public void setResource(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }
    }

    static final class DebounceTimedObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        boolean done;
        volatile long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f392s;
        final long timeout;
        io.reactivex.disposables.Disposable timer;
        final java.util.concurrent.TimeUnit unit;
        final io.reactivex.Scheduler.Worker worker;

        DebounceTimedObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.timeout = r2
                r0.unit = r4
                r0.worker = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f392s
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        void emit(long r3, T r5, io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter<T> r6) {
                r2 = this;
                long r0 = r2.index
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto Le
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onNext(r5)
                r6.dispose()
            Le:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.worker
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.disposables.Disposable r0 = r1.timer
                if (r0 == 0) goto Lf
                r0.dispose()
            Lf:
                io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter r0 = (io.reactivex.internal.operators.observable.ObservableDebounceTimed.DebounceEmitter) r0
                if (r0 == 0) goto L16
                r0.run()
            L16:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                io.reactivex.disposables.Disposable r0 = r1.timer
                if (r0 == 0) goto Lf
                r0.dispose()
            Lf:
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r2 = r1.worker
                r2.dispose()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                boolean r0 = r4.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r4.index
                r2 = 1
                long r0 = r0 + r2
                r4.index = r0
                io.reactivex.disposables.Disposable r2 = r4.timer
                if (r2 == 0) goto L13
                r2.dispose()
            L13:
                io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter r2 = new io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceEmitter
                r2.<init>(r5, r0, r4)
                r4.timer = r2
                io.reactivex.Scheduler$Worker r5 = r4.worker
                long r0 = r4.timeout
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r5 = r5.schedule(r2, r0, r3)
                r2.setResource(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f392s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f392s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDebounceTimed(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5) {
            r0 = this;
            r0.<init>(r1)
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceTimedObserver r7 = new io.reactivex.internal.operators.observable.ObservableDebounceTimed$DebounceTimedObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r9)
            long r3 = r8.timeout
            java.util.concurrent.TimeUnit r5 = r8.unit
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            r1 = r7
            r1.<init>(r2, r3, r5, r6)
            r0.subscribe(r7)
            return
    }
}
