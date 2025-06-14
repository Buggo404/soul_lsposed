package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeCount<T> extends io.reactivex.Single<java.lang.Long> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;

    static final class CountMaybeObserver implements io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Long> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f336d;

        CountMaybeObserver(io.reactivex.SingleObserver<? super java.lang.Long> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f336d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f336d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f336d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.f336d = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r3.actual
                r1 = 0
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f336d = r0
                io.reactivex.SingleObserver<? super java.lang.Long> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f336d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f336d = r2
                io.reactivex.SingleObserver<? super java.lang.Long> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(java.lang.Object r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r3 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f336d = r3
                io.reactivex.SingleObserver<? super java.lang.Long> r3 = r2.actual
                r0 = 1
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                r3.onSuccess(r0)
                return
        }
    }

    public MaybeCount(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Long> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeCount$CountMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeCount$CountMaybeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
