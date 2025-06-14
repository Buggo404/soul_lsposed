package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeObserveOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    static final class ObserveOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.MaybeObserver<? super T> actual;
        java.lang.Throwable error;
        final io.reactivex.Scheduler scheduler;
        T value;

        ObserveOnMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.Scheduler r2) {
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

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.Scheduler r0 = r1.scheduler
                io.reactivex.disposables.Disposable r0 = r0.scheduleDirect(r1)
                io.reactivex.internal.disposables.DisposableHelper.replace(r1, r0)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                io.reactivex.Scheduler r1 = r0.scheduler
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0)
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.MaybeObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.value = r1
                io.reactivex.Scheduler r1 = r0.scheduler
                io.reactivex.disposables.Disposable r1 = r1.scheduleDirect(r0)
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.Throwable r0 = r2.error
                r1 = 0
                if (r0 == 0) goto Ld
                r2.error = r1
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onError(r0)
                goto L1e
            Ld:
                T r0 = r2.value
                if (r0 == 0) goto L19
                r2.value = r1
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L1e
            L19:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L1e:
                return
        }
    }

    public MaybeObserveOn(io.reactivex.MaybeSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeObserveOn$ObserveOnMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeObserveOn$ObserveOnMaybeObserver
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
