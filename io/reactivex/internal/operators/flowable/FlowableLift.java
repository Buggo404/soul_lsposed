package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableLift<R, T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, R> {
    final io.reactivex.FlowableOperator<? extends R, ? super T> operator;

    public FlowableLift(io.reactivex.Flowable<T> r1, io.reactivex.FlowableOperator<? extends R, ? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.operator = r2
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super R> r3) {
            r2 = this;
            java.lang.String r0 = "Operator "
            io.reactivex.FlowableOperator<? extends R, ? super T> r1 = r2.operator     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            org.reactivestreams.Subscriber r3 = r1.apply(r3)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            if (r3 == 0) goto L10
            io.reactivex.Flowable<T> r0 = r2.source     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            r0.subscribe(r3)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            return
        L10:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            io.reactivex.FlowableOperator<? extends R, ? super T> r0 = r2.operator     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            java.lang.String r1 = " returned a null Subscriber"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
            throw r3     // Catch: java.lang.Throwable -> L2b java.lang.NullPointerException -> L3d
        L2b:
            r3 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
            io.reactivex.plugins.RxJavaPlugins.onError(r3)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Actually not, but can't throw other exceptions due to RS"
            r0.<init>(r1)
            r0.initCause(r3)
            throw r0
        L3d:
            r3 = move-exception
            throw r3
    }
}
