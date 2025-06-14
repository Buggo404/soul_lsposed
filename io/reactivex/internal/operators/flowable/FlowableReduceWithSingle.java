package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableReduceWithSingle<T, R> extends io.reactivex.Single<R> {
    final io.reactivex.functions.BiFunction<R, ? super T, R> reducer;
    final java.util.concurrent.Callable<R> seedSupplier;
    final org.reactivestreams.Publisher<T> source;

    public FlowableReduceWithSingle(org.reactivestreams.Publisher<T> r1, java.util.concurrent.Callable<R> r2, io.reactivex.functions.BiFunction<R, ? super T, R> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.seedSupplier = r2
            r0.reducer = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super R> r5) {
            r4 = this;
            java.util.concurrent.Callable<R> r0 = r4.seedSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The seedSupplier returned a null value"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            org.reactivestreams.Publisher<T> r1 = r4.source
            io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$ReduceSeedObserver r2 = new io.reactivex.internal.operators.flowable.FlowableReduceSeedSingle$ReduceSeedObserver
            io.reactivex.functions.BiFunction<R, ? super T, R> r3 = r4.reducer
            r2.<init>(r5, r3, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
