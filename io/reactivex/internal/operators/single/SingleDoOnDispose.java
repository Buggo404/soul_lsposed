package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoOnDispose<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action onDispose;
    final io.reactivex.SingleSource<T> source;

    static final class DoOnDisposeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.functions.Action> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8583764624474935784L;
        final io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f504d;

        DoOnDisposeObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.lazySet(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                java.lang.Object r0 = r1.getAndSet(r0)
                io.reactivex.functions.Action r0 = (io.reactivex.functions.Action) r0
                if (r0 == 0) goto L19
                r0.run()     // Catch: java.lang.Throwable -> Ld
                goto L14
            Ld:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L14:
                io.reactivex.disposables.Disposable r0 = r1.f504d
                r0.dispose()
            L19:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f504d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f504d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f504d = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public SingleDoOnDispose(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onDispose = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleDoOnDispose$DoOnDisposeObserver r1 = new io.reactivex.internal.operators.single.SingleDoOnDispose$DoOnDisposeObserver
            io.reactivex.functions.Action r2 = r3.onDispose
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
