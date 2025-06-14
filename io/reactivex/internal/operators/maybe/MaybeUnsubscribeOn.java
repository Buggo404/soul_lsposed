package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeUnsubscribeOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    static final class UnsubscribeOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3256698449646456986L;
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: ds */
        io.reactivex.disposables.Disposable f366ds;
        final io.reactivex.Scheduler scheduler;

        UnsubscribeOnMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.Scheduler r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.scheduler = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                java.lang.Object r0 = r2.getAndSet(r0)
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L13
                r2.f366ds = r0
                io.reactivex.Scheduler r0 = r2.scheduler
                r0.scheduleDirect(r2)
            L13:
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
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
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
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f366ds
                r0.dispose()
                return
        }
    }

    public MaybeUnsubscribeOn(io.reactivex.MaybeSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeUnsubscribeOn$UnsubscribeOnMaybeObserver
            io.reactivex.Scheduler r2 = r3.scheduler
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
