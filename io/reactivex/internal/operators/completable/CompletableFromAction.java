package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableFromAction extends io.reactivex.Completable {
    final io.reactivex.functions.Action run;

    public CompletableFromAction(io.reactivex.functions.Action r1) {
            r0 = this;
            r0.<init>()
            r0.run = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.empty()
            r3.onSubscribe(r0)
            io.reactivex.functions.Action r1 = r2.run     // Catch: java.lang.Throwable -> L16
            r1.run()     // Catch: java.lang.Throwable -> L16
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L15
            r3.onComplete()
        L15:
            return
        L16:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            boolean r0 = r0.isDisposed()
            if (r0 != 0) goto L23
            r3.onError(r1)
        L23:
            return
    }
}
