package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDelay<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final java.util.concurrent.TimeUnit unit;

    static final class DelayObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        final long delay;
        final boolean delayError;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f393s;
        final java.util.concurrent.TimeUnit unit;

        /* renamed from: w */
        final io.reactivex.Scheduler.Worker f394w;

        final class OnComplete implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver this$0;

            OnComplete(io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = r2.this$0     // Catch: java.lang.Throwable -> Lf
                    io.reactivex.Observer<? super T> r0 = r0.actual     // Catch: java.lang.Throwable -> Lf
                    r0.onComplete()     // Catch: java.lang.Throwable -> Lf
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = r2.this$0
                    io.reactivex.Scheduler$Worker r0 = r0.f394w
                    r0.dispose()
                    return
                Lf:
                    r0 = move-exception
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r1 = r2.this$0
                    io.reactivex.Scheduler$Worker r1 = r1.f394w
                    r1.dispose()
                    throw r0
            }
        }

        final class OnError implements java.lang.Runnable {
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver this$0;
            private final java.lang.Throwable throwable;

            OnError(io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver r1, java.lang.Throwable r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.throwable = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = r2.this$0     // Catch: java.lang.Throwable -> L11
                    io.reactivex.Observer<? super T> r0 = r0.actual     // Catch: java.lang.Throwable -> L11
                    java.lang.Throwable r1 = r2.throwable     // Catch: java.lang.Throwable -> L11
                    r0.onError(r1)     // Catch: java.lang.Throwable -> L11
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = r2.this$0
                    io.reactivex.Scheduler$Worker r0 = r0.f394w
                    r0.dispose()
                    return
                L11:
                    r0 = move-exception
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r1 = r2.this$0
                    io.reactivex.Scheduler$Worker r1 = r1.f394w
                    r1.dispose()
                    throw r0
            }
        }

        final class OnNext implements java.lang.Runnable {

            /* renamed from: t */
            private final T f395t;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver this$0;

            OnNext(io.reactivex.internal.operators.observable.ObservableDelay.DelayObserver r1, T r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    r0.f395t = r2
                    return
            }

            @Override // java.lang.Runnable
            public void run() {
                    r2 = this;
                    io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = r2.this$0
                    io.reactivex.Observer<? super T> r0 = r0.actual
                    T r1 = r2.f395t
                    r0.onNext(r1)
                    return
            }
        }

        DelayObserver(io.reactivex.Observer<? super T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler.Worker r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.delay = r2
                r0.unit = r4
                r0.f394w = r5
                r0.delayError = r6
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f393s
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r1.f394w
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.Scheduler$Worker r0 = r1.f394w
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r5 = this;
                io.reactivex.Scheduler$Worker r0 = r5.f394w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnComplete r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnComplete
                r1.<init>(r5)
                long r2 = r5.delay
                java.util.concurrent.TimeUnit r4 = r5.unit
                r0.schedule(r1, r2, r4)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.f394w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnError r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnError
                r1.<init>(r4, r5)
                boolean r5 = r4.delayError
                if (r5 == 0) goto Le
                long r2 = r4.delay
                goto L10
            Le:
                r2 = 0
            L10:
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                io.reactivex.Scheduler$Worker r0 = r4.f394w
                io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnNext r1 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver$OnNext
                r1.<init>(r4, r5)
                long r2 = r4.delay
                java.util.concurrent.TimeUnit r5 = r4.unit
                r0.schedule(r1, r2, r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f393s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f393s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDelay(io.reactivex.ObservableSource<T> r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>(r1)
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            boolean r0 = r8.delayError
            if (r0 == 0) goto L6
            r2 = r9
            goto Lc
        L6:
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r9)
            r2 = r0
        Lc:
            io.reactivex.Scheduler r9 = r8.scheduler
            io.reactivex.Scheduler$Worker r6 = r9.createWorker()
            io.reactivex.ObservableSource<T> r9 = r8.source
            io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver r0 = new io.reactivex.internal.operators.observable.ObservableDelay$DelayObserver
            long r3 = r8.delay
            java.util.concurrent.TimeUnit r5 = r8.unit
            boolean r7 = r8.delayError
            r1 = r0
            r1.<init>(r2, r3, r5, r6, r7)
            r9.subscribe(r0)
            return
    }
}
