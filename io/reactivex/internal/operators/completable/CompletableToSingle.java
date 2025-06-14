package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableToSingle<T> extends io.reactivex.Single<T> {
    final T completionValue;
    final java.util.concurrent.Callable<? extends T> completionValueSupplier;
    final io.reactivex.CompletableSource source;

    final class ToSingle implements io.reactivex.CompletableObserver {
        private final io.reactivex.SingleObserver<? super T> observer;
        final /* synthetic */ io.reactivex.internal.operators.completable.CompletableToSingle this$0;

        ToSingle(io.reactivex.internal.operators.completable.CompletableToSingle r1, io.reactivex.SingleObserver<? super T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.observer = r2
                return
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                io.reactivex.internal.operators.completable.CompletableToSingle r0 = r3.this$0
                java.util.concurrent.Callable<? extends T> r0 = r0.completionValueSupplier
                if (r0 == 0) goto L19
                io.reactivex.internal.operators.completable.CompletableToSingle r0 = r3.this$0     // Catch: java.lang.Throwable -> Lf
                java.util.concurrent.Callable<? extends T> r0 = r0.completionValueSupplier     // Catch: java.lang.Throwable -> Lf
                java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> Lf
                goto L1d
            Lf:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.SingleObserver<? super T> r1 = r3.observer
                r1.onError(r0)
                return
            L19:
                io.reactivex.internal.operators.completable.CompletableToSingle r0 = r3.this$0
                T r0 = r0.completionValue
            L1d:
                if (r0 != 0) goto L2c
                io.reactivex.SingleObserver<? super T> r0 = r3.observer
                java.lang.NullPointerException r1 = new java.lang.NullPointerException
                java.lang.String r2 = "The value supplied is null"
                r1.<init>(r2)
                r0.onError(r1)
                goto L31
            L2c:
                io.reactivex.SingleObserver<? super T> r1 = r3.observer
                r1.onSuccess(r0)
            L31:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.observer
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.observer
                r0.onSubscribe(r2)
                return
        }
    }

    public CompletableToSingle(io.reactivex.CompletableSource r1, java.util.concurrent.Callable<? extends T> r2, T r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.completionValue = r3
            r0.completionValueSupplier = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableToSingle$ToSingle r1 = new io.reactivex.internal.operators.completable.CompletableToSingle$ToSingle
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            return
    }
}
