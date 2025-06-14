package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDoAfterSuccess<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Consumer<? super T> onAfterSuccess;
    final io.reactivex.SingleSource<T> source;

    static final class DoAfterObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f501d;
        final io.reactivex.functions.Consumer<? super T> onAfterSuccess;

        DoAfterObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onAfterSuccess = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f501d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f501d
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
                io.reactivex.disposables.Disposable r0 = r1.f501d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f501d = r2
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
                io.reactivex.functions.Consumer<? super T> r0 = r1.onAfterSuccess     // Catch: java.lang.Throwable -> Lb
                r0.accept(r2)     // Catch: java.lang.Throwable -> Lb
                goto L12
            Lb:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L12:
                return
        }
    }

    public SingleDoAfterSuccess(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onAfterSuccess = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleDoAfterSuccess$DoAfterObserver r1 = new io.reactivex.internal.operators.single.SingleDoAfterSuccess$DoAfterObserver
            io.reactivex.functions.Consumer<? super T> r2 = r3.onAfterSuccess
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
