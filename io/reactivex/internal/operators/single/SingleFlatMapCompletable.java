package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFlatMapCompletable<T> extends io.reactivex.Completable {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;
    final io.reactivex.SingleSource<T> source;

    static final class FlatMapCompletableObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2177128922851101253L;
        final io.reactivex.CompletableObserver actual;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> mapper;

        FlatMapCompletableObserver(io.reactivex.CompletableObserver r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
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

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.replace(r0, r1)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r0 = r1.mapper     // Catch: java.lang.Throwable -> L18
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L18
                java.lang.String r0 = "The mapper returned a null CompletableSource"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L18
                io.reactivex.CompletableSource r2 = (io.reactivex.CompletableSource) r2     // Catch: java.lang.Throwable -> L18
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L17
                r2.subscribe(r1)
            L17:
                return
            L18:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.onError(r2)
                return
        }
    }

    public SingleFlatMapCompletable(io.reactivex.SingleSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.mapper = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.internal.operators.single.SingleFlatMapCompletable$FlatMapCompletableObserver r0 = new io.reactivex.internal.operators.single.SingleFlatMapCompletable$FlatMapCompletableObserver
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r1 = r2.mapper
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.SingleSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
