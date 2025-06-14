package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeFromFuture<T> extends io.reactivex.Maybe<T> {
    final java.util.concurrent.Future<? extends T> future;
    final long timeout;
    final java.util.concurrent.TimeUnit unit;

    public MaybeFromFuture(java.util.concurrent.Future<? extends T> r1, long r2, java.util.concurrent.TimeUnit r4) {
            r0 = this;
            r0.<init>()
            r0.future = r1
            r0.timeout = r2
            r0.unit = r4
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r6) {
            r5 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r6.onSubscribe(r0)
            boolean r1 = r0.isDisposed()
            if (r1 != 0) goto L49
            long r1 = r5.timeout     // Catch: java.lang.Throwable -> L34
            r3 = 0
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 > 0) goto L1c
            java.util.concurrent.Future<? extends T> r1 = r5.future     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L34
            goto L24
        L1c:
            java.util.concurrent.Future<? extends T> r3 = r5.future     // Catch: java.lang.Throwable -> L34
            java.util.concurrent.TimeUnit r4 = r5.unit     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r3.get(r1, r4)     // Catch: java.lang.Throwable -> L34
        L24:
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L49
            if (r1 != 0) goto L30
            r6.onComplete()
            goto L49
        L30:
            r6.onSuccess(r1)
            goto L49
        L34:
            r1 = move-exception
            boolean r2 = r1 instanceof java.util.concurrent.ExecutionException
            if (r2 == 0) goto L3d
            java.lang.Throwable r1 = r1.getCause()
        L3d:
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L49
            r6.onError(r1)
        L49:
            return
    }
}
