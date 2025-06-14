package io.reactivex.observers;

/* loaded from: classes.dex */
public abstract class DefaultObserver<T> implements io.reactivex.Observer<T> {

    /* renamed from: s */
    private io.reactivex.disposables.Disposable f553s;

    public DefaultObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    protected final void cancel() {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.f553s
            io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
            r2.f553s = r1
            r0.dispose()
            return
    }

    protected void onStart() {
            r0 = this;
            return
    }

    @Override // io.reactivex.Observer
    public final void onSubscribe(io.reactivex.disposables.Disposable r3) {
            r2 = this;
            io.reactivex.disposables.Disposable r0 = r2.f553s
            java.lang.Class r1 = r2.getClass()
            boolean r0 = io.reactivex.internal.util.EndConsumerHelper.validate(r0, r3, r1)
            if (r0 == 0) goto L11
            r2.f553s = r3
            r2.onStart()
        L11:
            return
    }
}
