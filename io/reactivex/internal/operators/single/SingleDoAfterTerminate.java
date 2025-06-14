package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoAfterTerminate<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.SingleSource<T> source;

    static final class DoAfterTerminateObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f502d;
        final io.reactivex.functions.Action onAfterTerminate;

        DoAfterTerminateObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onAfterTerminate = r2
                return
        }

        private void onAfterTerminate() {
                r1 = this;
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L6
                r0.run()     // Catch: java.lang.Throwable -> L6
                goto Ld
            L6:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f502d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f502d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                r1.onAfterTerminate()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f502d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f502d = r2
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
                r1.onAfterTerminate()
                return
        }
    }

    public SingleDoAfterTerminate(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onAfterTerminate = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleDoAfterTerminate$DoAfterTerminateObserver r1 = new io.reactivex.internal.operators.single.SingleDoAfterTerminate$DoAfterTerminateObserver
            io.reactivex.functions.Action r2 = r3.onAfterTerminate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
