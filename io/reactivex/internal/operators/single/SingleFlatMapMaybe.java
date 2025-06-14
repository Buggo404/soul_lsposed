package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFlatMapMaybe<T, R> extends io.reactivex.Maybe<R> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;
    final io.reactivex.SingleSource<? extends T> source;

    static final class FlatMapMaybeObserver<R> implements io.reactivex.MaybeObserver<R> {
        final io.reactivex.MaybeObserver<? super R> actual;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

        FlatMapMaybeObserver(java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r1, io.reactivex.MaybeObserver<? super R> r2) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.actual = r2
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.parent
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(R r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    static final class FlatMapSingleObserver<T, R> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5843758257109742742L;
        final io.reactivex.MaybeObserver<? super R> actual;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> mapper;

        FlatMapSingleObserver(io.reactivex.MaybeObserver<? super R> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.mapper = r2
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

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.MaybeObserver<? super R> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r0 = r2.mapper     // Catch: java.lang.Throwable -> L1f
                java.lang.Object r3 = r0.apply(r3)     // Catch: java.lang.Throwable -> L1f
                java.lang.String r0 = "The mapper returned a null MaybeSource"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L1f
                io.reactivex.MaybeSource r3 = (io.reactivex.MaybeSource) r3     // Catch: java.lang.Throwable -> L1f
                boolean r0 = r2.isDisposed()
                if (r0 != 0) goto L1e
                io.reactivex.internal.operators.single.SingleFlatMapMaybe$FlatMapMaybeObserver r0 = new io.reactivex.internal.operators.single.SingleFlatMapMaybe$FlatMapMaybeObserver
                io.reactivex.MaybeObserver<? super R> r1 = r2.actual
                r0.<init>(r2, r1)
                r3.subscribe(r0)
            L1e:
                return
            L1f:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.onError(r3)
                return
        }
    }

    public SingleFlatMapMaybe(io.reactivex.SingleSource<? extends T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2) {
            r0 = this;
            r0.<init>()
            r0.mapper = r2
            r0.source = r1
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super R> r4) {
            r3 = this;
            io.reactivex.SingleSource<? extends T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleFlatMapMaybe$FlatMapSingleObserver r1 = new io.reactivex.internal.operators.single.SingleFlatMapMaybe$FlatMapSingleObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2 = r3.mapper
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
