package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeSubscribeOn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.Scheduler scheduler;

    static final class SubscribeOnMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 8571289934935992137L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.internal.disposables.SequentialDisposable task;

        SubscribeOnMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.task = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r1)
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.task
                r0.dispose()
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
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    static final class SubscribeTask<T> implements java.lang.Runnable {
        final io.reactivex.MaybeObserver<? super T> observer;
        final io.reactivex.MaybeSource<T> source;

        SubscribeTask(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.MaybeSource<T> r2) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                r0.source = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                io.reactivex.MaybeSource<T> r0 = r2.source
                io.reactivex.MaybeObserver<? super T> r1 = r2.observer
                r0.subscribe(r1)
                return
        }
    }

    public MaybeSubscribeOn(io.reactivex.MaybeSource<T> r1, io.reactivex.Scheduler r2) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r5) {
            r4 = this;
            io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeOnMaybeObserver r0 = new io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeOnMaybeObserver
            r0.<init>(r5)
            r5.onSubscribe(r0)
            io.reactivex.internal.disposables.SequentialDisposable r5 = r0.task
            io.reactivex.Scheduler r1 = r4.scheduler
            io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeTask r2 = new io.reactivex.internal.operators.maybe.MaybeSubscribeOn$SubscribeTask
            io.reactivex.MaybeSource<T> r3 = r4.source
            r2.<init>(r0, r3)
            io.reactivex.disposables.Disposable r0 = r1.scheduleDirect(r2)
            r5.replace(r0)
            return
    }
}
