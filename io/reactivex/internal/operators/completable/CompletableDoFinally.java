package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableDoFinally extends io.reactivex.Completable {
    final io.reactivex.functions.Action onFinally;
    final io.reactivex.CompletableSource source;

    static final class DoFinallyObserver extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f200d;
        final io.reactivex.functions.Action onFinally;

        DoFinallyObserver(io.reactivex.CompletableObserver r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onFinally = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f200d
                r0.dispose()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f200d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onComplete()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                r1.runFinally()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f200d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f200d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        void runFinally() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.functions.Action r0 = r2.onFinally     // Catch: java.lang.Throwable -> Le
                r0.run()     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L15:
                return
        }
    }

    public CompletableDoFinally(io.reactivex.CompletableSource r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onFinally = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.CompletableSource r0 = r3.source
            io.reactivex.internal.operators.completable.CompletableDoFinally$DoFinallyObserver r1 = new io.reactivex.internal.operators.completable.CompletableDoFinally$DoFinallyObserver
            io.reactivex.functions.Action r2 = r3.onFinally
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
