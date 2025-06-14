package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableFromUnsafeSource extends io.reactivex.Completable {
    final io.reactivex.CompletableSource source;

    public CompletableFromUnsafeSource(io.reactivex.CompletableSource r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r2) {
            r1 = this;
            io.reactivex.CompletableSource r0 = r1.source
            r0.subscribe(r2)
            return
    }
}
