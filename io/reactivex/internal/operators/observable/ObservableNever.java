package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableNever extends io.reactivex.Observable<java.lang.Object> {
    public static final io.reactivex.Observable<java.lang.Object> INSTANCE = null;

    static {
            io.reactivex.internal.operators.observable.ObservableNever r0 = new io.reactivex.internal.operators.observable.ObservableNever
            r0.<init>()
            io.reactivex.internal.operators.observable.ObservableNever.INSTANCE = r0
            return
    }

    private ObservableNever() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Object> r2) {
            r1 = this;
            io.reactivex.internal.disposables.EmptyDisposable r0 = io.reactivex.internal.disposables.EmptyDisposable.NEVER
            r2.onSubscribe(r0)
            return
    }
}
