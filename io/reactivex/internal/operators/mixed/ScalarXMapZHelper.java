package io.reactivex.internal.operators.mixed;

/* loaded from: classes.dex */
final class ScalarXMapZHelper {
    private ScalarXMapZHelper() {
            r2 = this;
            r2.<init>()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No instances!"
            r0.<init>(r1)
            throw r0
    }

    static <T> boolean tryAsCompletable(java.lang.Object r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.CompletableSource> r2, io.reactivex.CompletableObserver r3) {
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L2d
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            r0 = 1
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "The mapper returned a null CompletableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L25
            io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1     // Catch: java.lang.Throwable -> L25
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L21
            io.reactivex.internal.disposables.EmptyDisposable.complete(r3)
            goto L24
        L21:
            r1.subscribe(r3)
        L24:
            return r0
        L25:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r3)
            return r0
        L2d:
            r1 = 0
            return r1
    }

    static <T, R> boolean tryAsMaybe(java.lang.Object r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.MaybeSource<? extends R>> r2, io.reactivex.Observer<? super R> r3) {
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L31
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            r0 = 1
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "The mapper returned a null MaybeSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L29
            io.reactivex.MaybeSource r1 = (io.reactivex.MaybeSource) r1     // Catch: java.lang.Throwable -> L29
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L21
            io.reactivex.internal.disposables.EmptyDisposable.complete(r3)
            goto L28
        L21:
            io.reactivex.MaybeObserver r2 = io.reactivex.internal.operators.maybe.MaybeToObservable.create(r3)
            r1.subscribe(r2)
        L28:
            return r0
        L29:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r3)
            return r0
        L31:
            r1 = 0
            return r1
    }

    static <T, R> boolean tryAsSingle(java.lang.Object r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.SingleSource<? extends R>> r2, io.reactivex.Observer<? super R> r3) {
            boolean r0 = r1 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L31
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1
            r0 = 1
            java.lang.Object r1 = r1.call()     // Catch: java.lang.Throwable -> L29
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.apply(r1)     // Catch: java.lang.Throwable -> L29
            java.lang.String r2 = "The mapper returned a null SingleSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L29
            io.reactivex.SingleSource r1 = (io.reactivex.SingleSource) r1     // Catch: java.lang.Throwable -> L29
            goto L1b
        L1a:
            r1 = 0
        L1b:
            if (r1 != 0) goto L21
            io.reactivex.internal.disposables.EmptyDisposable.complete(r3)
            goto L28
        L21:
            io.reactivex.SingleObserver r2 = io.reactivex.internal.operators.single.SingleToObservable.create(r3)
            r1.subscribe(r2)
        L28:
            return r0
        L29:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r3)
            return r0
        L31:
            r1 = 0
            return r1
    }
}
