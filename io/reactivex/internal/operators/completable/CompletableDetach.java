package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableDetach extends io.reactivex.Completable {
    final io.reactivex.CompletableSource source;

    static final class DetachCompletableObserver implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
        io.reactivex.CompletableObserver actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f197d;

        DetachCompletableObserver(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 0
                r1.actual = r0
                io.reactivex.disposables.Disposable r0 = r1.f197d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f197d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f197d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f197d = r0
                io.reactivex.CompletableObserver r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onComplete()
            Le:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f197d = r0
                io.reactivex.CompletableObserver r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onError(r3)
            Le:
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f197d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f197d = r2
                io.reactivex.CompletableObserver r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public CompletableDetach(io.reactivex.CompletableSource r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableDetach$DetachCompletableObserver r1 = new io.reactivex.internal.operators.completable.CompletableDetach$DetachCompletableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
