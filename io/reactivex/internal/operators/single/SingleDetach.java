package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDetach<T> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<T> source;

    static final class DetachSingleObserver<T> implements io.reactivex.SingleObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.SingleObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f500d;

        DetachSingleObserver(io.reactivex.SingleObserver<? super T> r1) {
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
                io.reactivex.disposables.Disposable r0 = r1.f500d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f500d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f500d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f500d = r0
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onError(r3)
            Le:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f500d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f500d = r2
                io.reactivex.SingleObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f500d = r0
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onSuccess(r3)
            Le:
                return
        }
    }

    public SingleDetach(io.reactivex.SingleSource<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            io.reactivex.SingleSource<T> r0 = r2.source
            io.reactivex.internal.operators.single.SingleDetach$DetachSingleObserver r1 = new io.reactivex.internal.operators.single.SingleDetach$DetachSingleObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
