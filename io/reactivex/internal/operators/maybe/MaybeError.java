package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeError<T> extends io.reactivex.Maybe<T> {
    final java.lang.Throwable error;

    public MaybeError(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.error = r1
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
            r2.onSubscribe(r0)
            java.lang.Throwable r0 = r1.error
            r2.onError(r0)
            return
    }
}
