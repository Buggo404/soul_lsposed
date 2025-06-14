package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeToSingle<T> extends io.reactivex.Single<T> implements io.reactivex.internal.fuseable.HasUpstreamMaybeSource<T> {
    final T defaultValue;
    final io.reactivex.MaybeSource<T> source;

    static final class ToSingleMaybeSubscriber<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f365d;
        final T defaultValue;

        ToSingleMaybeSubscriber(io.reactivex.SingleObserver<? super T> r1, T r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.defaultValue = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f365d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f365d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f365d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r3.f365d = r0
                T r0 = r3.defaultValue
                if (r0 == 0) goto Le
                io.reactivex.SingleObserver<? super T> r1 = r3.actual
                r1.onSuccess(r0)
                goto L1a
            Le:
                io.reactivex.SingleObserver<? super T> r0 = r3.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "The MaybeSource is empty"
                r1.<init>(r2)
                r0.onError(r1)
            L1a:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f365d = r0
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f365d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f365d = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f365d = r0
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public MaybeToSingle(io.reactivex.MaybeSource<T> r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.defaultValue = r2
            return
    }

    @Override // io.reactivex.internal.fuseable.HasUpstreamMaybeSource
    public io.reactivex.MaybeSource<T> source() {
            r1 = this;
            io.reactivex.MaybeSource<T> r0 = r1.source
            return r0
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeToSingle$ToSingleMaybeSubscriber r1 = new io.reactivex.internal.operators.maybe.MaybeToSingle$ToSingleMaybeSubscriber
            T r2 = r3.defaultValue
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
