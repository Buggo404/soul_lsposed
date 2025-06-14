package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleResumeNext<T> extends io.reactivex.Single<T> {
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> nextFunction;
    final io.reactivex.SingleSource<? extends T> source;

    static final class ResumeMainSingleObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -5314538511045349925L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> nextFunction;

        ResumeMainSingleObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.nextFunction = r2
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
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> r0 = r5.nextFunction     // Catch: java.lang.Throwable -> L19
                java.lang.Object r0 = r0.apply(r6)     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = "The nextFunction returned a null SingleSource."
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
                io.reactivex.SingleSource r0 = (io.reactivex.SingleSource) r0     // Catch: java.lang.Throwable -> L19
                io.reactivex.internal.observers.ResumeSingleObserver r6 = new io.reactivex.internal.observers.ResumeSingleObserver
                io.reactivex.SingleObserver<? super T> r1 = r5.actual
                r6.<init>(r5, r1)
                r0.subscribe(r6)
                return
            L19:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.SingleObserver<? super T> r1 = r5.actual
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

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.SingleObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
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

    public SingleResumeNext(io.reactivex.SingleSource<? extends T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.nextFunction = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<? extends T> r0 = r3.source
            io.reactivex.internal.operators.single.SingleResumeNext$ResumeMainSingleObserver r1 = new io.reactivex.internal.operators.single.SingleResumeNext$ResumeMainSingleObserver
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.SingleSource<? extends T>> r2 = r3.nextFunction
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
