package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeOnErrorNext<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final boolean allowFatal;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> resumeFunction;

    static final class OnErrorNextMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 2026620218879969836L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final boolean allowFatal;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> resumeFunction;

        static final class NextMaybeObserver<T> implements io.reactivex.MaybeObserver<T> {
            final io.reactivex.MaybeObserver<? super T> actual;

            /* renamed from: d */
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f360d;

            NextMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.f360d = r2
                    return
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
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f360d
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
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

        OnErrorNextMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.resumeFunction = r2
                r0.allowFatal = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
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
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.allowFatal
                if (r0 != 0) goto Le
                boolean r0 = r6 instanceof java.lang.Exception
                if (r0 != 0) goto Le
                io.reactivex.MaybeObserver<? super T> r0 = r5.actual
                r0.onError(r6)
                return
            Le:
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> r0 = r5.resumeFunction     // Catch: java.lang.Throwable -> L2b
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L2b
                java.lang.String r1 = "The resumeFunction returned a null MaybeSource"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2b
                io.reactivex.MaybeSource r0 = (io.reactivex.MaybeSource) r0     // Catch: java.lang.Throwable -> L2b
                r6 = 0
                io.reactivex.internal.disposables.DisposableHelper.replace(r5, r6)
                io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver$NextMaybeObserver r6 = new io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver$NextMaybeObserver
                io.reactivex.MaybeObserver<? super T> r1 = r5.actual
                r6.<init>(r1, r5)
                r0.subscribe(r6)
                return
            L2b:
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
    }

    public MaybeOnErrorNext(io.reactivex.MaybeSource<T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.resumeFunction = r2
            r0.allowFatal = r3
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r5) {
            r4 = this;
            io.reactivex.MaybeSource<T> r0 = r4.source
            io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeOnErrorNext$OnErrorNextMaybeObserver
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.MaybeSource<? extends T>> r2 = r4.resumeFunction
            boolean r3 = r4.allowFatal
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
