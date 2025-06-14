package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableTimeout extends io.reactivex.Completable {
    final io.reactivex.CompletableSource other;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    final class DisposeTask implements java.lang.Runnable {
        private final java.util.concurrent.atomic.AtomicBoolean once;

        /* renamed from: s */
        final io.reactivex.CompletableObserver f211s;
        final io.reactivex.disposables.CompositeDisposable set;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableTimeout this$0;

        final class DisposeObserver implements io.reactivex.CompletableObserver {
            final /* synthetic */ io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask this$1;

            DisposeObserver(io.reactivex.internal.operators.completable.CompletableTimeout.DisposeTask r1) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r0 = r1.this$1
                    io.reactivex.disposables.CompositeDisposable r0 = r0.set
                    r0.dispose()
                    io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r0 = r1.this$1
                    io.reactivex.CompletableObserver r0 = r0.f211s
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r0 = r1.this$1
                    io.reactivex.disposables.CompositeDisposable r0 = r0.set
                    r0.dispose()
                    io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r0 = r1.this$1
                    io.reactivex.CompletableObserver r0 = r0.f211s
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r0 = r1.this$1
                    io.reactivex.disposables.CompositeDisposable r0 = r0.set
                    r0.add(r2)
                    return
            }
        }

        DisposeTask(io.reactivex.internal.operators.completable.CompletableTimeout r1, java.util.concurrent.atomic.AtomicBoolean r2, io.reactivex.disposables.CompositeDisposable r3, io.reactivex.CompletableObserver r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.once = r2
                r0.set = r3
                r0.f211s = r4
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L2c
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.clear()
                io.reactivex.internal.operators.completable.CompletableTimeout r0 = r3.this$0
                io.reactivex.CompletableSource r0 = r0.other
                if (r0 != 0) goto L20
                io.reactivex.CompletableObserver r0 = r3.f211s
                java.util.concurrent.TimeoutException r1 = new java.util.concurrent.TimeoutException
                r1.<init>()
                r0.onError(r1)
                goto L2c
            L20:
                io.reactivex.internal.operators.completable.CompletableTimeout r0 = r3.this$0
                io.reactivex.CompletableSource r0 = r0.other
                io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask$DisposeObserver r1 = new io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask$DisposeObserver
                r1.<init>(r3)
                r0.subscribe(r1)
            L2c:
                return
        }
    }

    static final class TimeOutObserver implements io.reactivex.CompletableObserver {
        private final java.util.concurrent.atomic.AtomicBoolean once;

        /* renamed from: s */
        private final io.reactivex.CompletableObserver f212s;
        private final io.reactivex.disposables.CompositeDisposable set;

        TimeOutObserver(io.reactivex.disposables.CompositeDisposable r1, java.util.concurrent.atomic.AtomicBoolean r2, io.reactivex.CompletableObserver r3) {
                r0 = this;
                r0.<init>()
                r0.set = r1
                r0.once = r2
                r0.f212s = r3
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L14
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                io.reactivex.CompletableObserver r0 = r3.f212s
                r0.onComplete()
            L14:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                io.reactivex.CompletableObserver r0 = r3.f212s
                r0.onError(r4)
                goto L18
            L15:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L18:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }
    }

    public CompletableTimeout(io.reactivex.CompletableSource r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, io.reactivex.CompletableSource r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.timeout = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.other = r6
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r8) {
            r7 = this;
            io.reactivex.disposables.CompositeDisposable r0 = new io.reactivex.disposables.CompositeDisposable
            r0.<init>()
            r8.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = new java.util.concurrent.atomic.AtomicBoolean
            r1.<init>()
            io.reactivex.Scheduler r2 = r7.scheduler
            io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask r3 = new io.reactivex.internal.operators.completable.CompletableTimeout$DisposeTask
            r3.<init>(r7, r1, r0, r8)
            long r4 = r7.timeout
            java.util.concurrent.TimeUnit r6 = r7.unit
            io.reactivex.disposables.Disposable r2 = r2.scheduleDirect(r3, r4, r6)
            r0.add(r2)
            io.reactivex.CompletableSource r2 = r7.source
            io.reactivex.internal.operators.completable.CompletableTimeout$TimeOutObserver r3 = new io.reactivex.internal.operators.completable.CompletableTimeout$TimeOutObserver
            r3.<init>(r0, r1, r8)
            r2.subscribe(r3)
            return
    }
}
