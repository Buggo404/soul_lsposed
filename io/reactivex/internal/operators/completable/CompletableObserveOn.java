package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableObserveOn extends io.reactivex.Completable {
    final io.reactivex.Scheduler scheduler;
    final io.reactivex.CompletableSource source;

    static final class ObserveOnCompletableObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.CompletableObserver actual;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;

        ObserveOnCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r2
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
                r1 = this;
                io.reactivex.Scheduler r0 = r1.scheduler
                io.reactivex.disposables.Disposable r0 = r0.scheduleDirect(r1)
                io.reactivex.internal.disposables.DisposableHelper.replace(r1, r0)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                io.reactivex.Scheduler r1 = r0.scheduler
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0)
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.CompletableObserver r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                if (r0 == 0) goto Ld
                r1 = 0
                r2.error = r1
                io.reactivex.CompletableObserver r1 = r2.actual
                r1.onError(r0)
                goto L12
            Ld:
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
            L12:
                return
        }
    }

    public CompletableObserveOn(io.reactivex.CompletableSource r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.CompletableSource r0 = r3.source
            io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver r1 = new io.reactivex.internal.operators.completable.CompletableObserveOn$ObserveOnCompletableObserver
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
