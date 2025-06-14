package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDoOnLifecycle<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    private final io.reactivex.functions.Action onDispose;
    private final io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> onSubscribe;

    public ObservableDoOnLifecycle(io.reactivex.Observable<T> r1, io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2, io.reactivex.functions.Action r3) {
            r0 = this;
            r0.<init>(r1)
            r0.onSubscribe = r2
            r0.onDispose = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.observers.DisposableLambdaObserver r1 = new io.reactivex.internal.observers.DisposableLambdaObserver
            io.reactivex.functions.Consumer<? super io.reactivex.disposables.Disposable> r2 = r4.onSubscribe
            io.reactivex.functions.Action r3 = r4.onDispose
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
