package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableEmpty extends io.reactivex.Observable<java.lang.Object> implements io.reactivex.internal.fuseable.ScalarCallable<java.lang.Object> {
    public static final io.reactivex.Observable<java.lang.Object> INSTANCE = null;

    static {
            io.reactivex.internal.operators.observable.ObservableEmpty r0 = new io.reactivex.internal.operators.observable.ObservableEmpty
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservableEmpty.INSTANCE = r0
            return
    }

    private ObservableEmpty() {
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

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Object> r1) {
            r0 = this;
            io.reactivex.internal.disposables.EmptyDisposable.complete(r1)
            return
    }
}
