package io.reactivex.internal.observers;

/* loaded from: classes.dex */
public final class BlockingLastObserver<T> extends io.reactivex.internal.observers.BlockingBaseObserver<T> {
    public BlockingLastObserver() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            r0 = 0
            r1.value = r0
            r1.error = r2
            r1.countDown()
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r1) {
            r0 = this;
            r0.value = r1
            return
    }
}
