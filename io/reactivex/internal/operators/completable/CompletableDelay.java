package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableDelay extends io.reactivex.Completable {
    final long delay;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;
    final java.util.concurrent.TimeUnit unit;

    static final class Delay extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, java.lang.Runnable, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 465972761105851022L;
        final long delay;
        final boolean delayError;
        final io.reactivex.CompletableObserver downstream;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        final java.util.concurrent.TimeUnit unit;

        Delay(io.reactivex.CompletableObserver r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                r0.delay = r2
                r0.unit = r4
                r0.scheduler = r5
                r0.delayError = r6
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
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r4 = this;
                io.reactivex.Scheduler r0 = r4.scheduler
                long r1 = r4.delay
                java.util.concurrent.TimeUnit r3 = r4.unit
                io.reactivex.disposables.Disposable r0 = r0.scheduleDirect(r4, r1, r3)
                io.reactivex.internal.disposables.DisposableHelper.replace(r4, r0)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
                r3.error = r4
                io.reactivex.Scheduler r4 = r3.scheduler
                boolean r0 = r3.delayError
                if (r0 == 0) goto Lb
                long r0 = r3.delay
                goto Ld
            Lb:
                r0 = 0
            Ld:
                java.util.concurrent.TimeUnit r2 = r3.unit
                io.reactivex.disposables.Disposable r4 = r4.scheduleDirect(r3, r0, r2)
                io.reactivex.internal.disposables.DisposableHelper.replace(r3, r4)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.CompletableObserver r1 = r0.downstream
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                r1 = 0
                r2.error = r1
                if (r0 == 0) goto Ld
                io.reactivex.CompletableObserver r1 = r2.downstream
                r1.onError(r0)
                goto L12
            Ld:
                io.reactivex.CompletableObserver r0 = r2.downstream
                r0.onComplete()
            L12:
                return
        }
    }

    public CompletableDelay(io.reactivex.CompletableSource r1, long r2, java.util.concurrent.TimeUnit r4, io.reactivex.Scheduler r5, boolean r6) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.delay = r2
            r0.unit = r4
            r0.scheduler = r5
            r0.delayError = r6
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r10) {
            r9 = this;
            io.reactivex.CompletableSource r0 = r9.source
            io.reactivex.internal.operators.completable.CompletableDelay$Delay r8 = new io.reactivex.internal.operators.completable.CompletableDelay$Delay
            long r3 = r9.delay
            java.util.concurrent.TimeUnit r5 = r9.unit
            io.reactivex.Scheduler r6 = r9.scheduler
            boolean r7 = r9.delayError
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r6, r7)
            r0.subscribe(r8)
            return
    }
}
