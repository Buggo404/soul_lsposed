package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableLift extends io.reactivex.Completable {
    final io.reactivex.CompletableOperator onLift;
    final io.reactivex.CompletableSource source;

    public CompletableLift(io.reactivex.CompletableSource r1, io.reactivex.CompletableOperator r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onLift = r2
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.CompletableOperator r0 = r1.onLift     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> L14
            io.reactivex.CompletableObserver r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> L14
            io.reactivex.CompletableSource r0 = r1.source     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> L14
            r0.subscribe(r2)     // Catch: java.lang.Throwable -> Lc java.lang.NullPointerException -> L14
            goto L13
        Lc:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
        L13:
            return
        L14:
            r2 = move-exception
            throw r2
    }
}
