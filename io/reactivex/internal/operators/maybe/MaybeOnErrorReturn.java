package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeOnErrorReturn<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

    static final class OnErrorReturnMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f361d;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> valueSupplier;

        OnErrorReturnMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.valueSupplier = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f361d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f361d
                boolean r0 = r0.isDisposed()
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
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r0 = r5.valueSupplier     // Catch: java.lang.Throwable -> L12
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L12
                java.lang.String r1 = "The valueSupplier returned a null value"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L12
                io.reactivex.MaybeObserver<? super T> r0 = r5.actual
                r0.onSuccess(r6)
                return
            L12:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.MaybeObserver<? super T> r1 = r5.actual
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r6 = 1
                r3[r6] = r0
                r2.<init>(r3)
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f361d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f361d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
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

    public MaybeOnErrorReturn(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.valueSupplier = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeOnErrorReturn$OnErrorReturnMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeOnErrorReturn$OnErrorReturnMaybeObserver
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends T> r2 = r3.valueSupplier
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
