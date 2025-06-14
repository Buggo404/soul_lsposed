package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableLift<R, T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.ObservableOperator<? extends R, ? super T> operator;

    public ObservableLift(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.operator = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r3) {
            r2 = this;
            java.lang.String r0 = "Operator "
            io.reactivex.ObservableOperator<? extends R, ? super T> r1 = r2.operator     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            io.reactivex.Observer r3 = r1.apply(r3)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            io.reactivex.ObservableOperator<? extends R, ? super T> r0 = r2.operator     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            java.lang.String r1 = " returned a null Observer"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            io.reactivex.Observer r3 = (io.reactivex.Observer) r3     // Catch: java.lang.Throwable -> L29 java.lang.NullPointerException -> L3b
            io.reactivex.ObservableSource<T> r0 = r2.source
            r0.subscribe(r3)
            return
        L29:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't throw other exceptions due to RS"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L3b:
            r3 = move-exception
            throw r3
    }
}
