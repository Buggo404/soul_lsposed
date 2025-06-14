package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTimeInterval<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.schedulers.Timed<T>> {
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class TimeIntervalObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> actual;
        long lastTime;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f461s;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        TimeIntervalObserver(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r1, java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r3
                r0.unit = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f461s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f461s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r6) {
                r5 = this;
                io.reactivex.Scheduler r0 = r5.scheduler
                java.util.concurrent.TimeUnit r1 = r5.unit
                long r0 = r0.now(r1)
                long r2 = r5.lastTime
                r5.lastTime = r0
                long r0 = r0 - r2
                io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r2 = r5.actual
                io.reactivex.schedulers.Timed r3 = new io.reactivex.schedulers.Timed
                java.util.concurrent.TimeUnit r4 = r5.unit
                r3.<init>(r6, r0, r4)
                r2.onNext(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f461s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L19
                r2.f461s = r3
                io.reactivex.Scheduler r3 = r2.scheduler
                java.util.concurrent.TimeUnit r0 = r2.unit
                long r0 = r3.now(r0)
                r2.lastTime = r0
                io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r3 = r2.actual
                r3.onSubscribe(r2)
            L19:
                return
        }
    }

    public ObservableTimeInterval(io.reactivex.ObservableSource<T> r1, java.util.concurrent.TimeUnit r2, io.reactivex.Scheduler r3) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r3
            r0.unit = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.schedulers.Timed<T>> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableTimeInterval$TimeIntervalObserver r1 = new io.reactivex.internal.operators.observable.ObservableTimeInterval$TimeIntervalObserver
            java.util.concurrent.TimeUnit r2 = r4.unit
            io.reactivex.Scheduler r3 = r4.scheduler
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
