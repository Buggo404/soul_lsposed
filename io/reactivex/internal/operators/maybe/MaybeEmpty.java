package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeEmpty extends io.reactivex.Maybe<java.lang.Object> implements io.reactivex.internal.fuseable.ScalarCallable<java.lang.Object> {
    public static final io.reactivex.internal.operators.maybe.MaybeEmpty INSTANCE = null;

    static {
            io.reactivex.internal.operators.maybe.MaybeEmpty r0 = new io.reactivex.internal.operators.maybe.MaybeEmpty
            r0.<init>()
            io.reactivex.internal.operators.maybe.MaybeEmpty.INSTANCE = r0
            return
    }

    public MaybeEmpty() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public java.lang.Object call() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Object> r1) {
            r0 = this;
            io.reactivex.internal.disposables.EmptyDisposable.complete(r1)
            return
    }
}
