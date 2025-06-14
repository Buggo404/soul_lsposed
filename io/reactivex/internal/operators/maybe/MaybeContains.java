package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeContains<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final io.reactivex.MaybeSource<T> source;
    final java.lang.Object value;

    static final class ContainsMaybeObserver implements io.reactivex.MaybeObserver<java.lang.Object>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Boolean> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f335d;
        final java.lang.Object value;

        ContainsMaybeObserver(io.reactivex.SingleObserver<? super java.lang.Boolean> r1, java.lang.Object r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.value = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f335d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f335d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f335d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f335d = r0
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r2.actual
                r1 = 0
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f335d = r0
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f335d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f335d = r2
                io.reactivex.SingleObserver<? super java.lang.Boolean> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(java.lang.Object r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f335d = r0
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r2.actual
                java.lang.Object r1 = r2.value
                boolean r3 = io.reactivex.internal.functions.ObjectHelper.equals(r3, r1)
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                r0.onSuccess(r3)
                return
        }
    }

    public MaybeContains(io.reactivex.MaybeSource<T> r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.value = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeContains$ContainsMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeContains$ContainsMaybeObserver
            java.lang.Object r2 = r3.value
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
