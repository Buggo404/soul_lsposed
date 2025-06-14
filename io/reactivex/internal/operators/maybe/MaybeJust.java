package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeJust<T> extends io.reactivex.Maybe<T> implements io.reactivex.internal.fuseable.ScalarCallable<T> {
    final T value;

    public MaybeJust(T r1) {
            r0 = this;
            r0.<init>()
            r0.value = r1
            return
    }

    @Override // io.reactivex.internal.fuseable.ScalarCallable, java.util.concurrent.Callable
    public T call() {
            r1 = this;
            T r0 = r1.value
            return r0
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r2) {
            r1 = this;
            io.reactivex.disposables.Disposable r0 = io.reactivex.disposables.Disposables.disposed()
            r2.onSubscribe(r0)
            T r0 = r1.value
            r2.onSuccess(r0)
            return
    }
}
