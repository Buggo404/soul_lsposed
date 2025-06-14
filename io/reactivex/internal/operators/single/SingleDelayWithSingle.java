package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleDelayWithSingle<T, U> extends io.reactivex.Single<T> {
    final io.reactivex.SingleSource<U> other;
    final io.reactivex.SingleSource<T> source;

    static final class OtherObserver<T, U> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.SingleObserver<U>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -8565274649390031272L;
        final io.reactivex.SingleObserver<? super T> actual;
        final io.reactivex.SingleSource<T> source;

        OtherObserver(io.reactivex.SingleObserver<? super T> r1, io.reactivex.SingleSource<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.source = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.SingleObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(U r3) {
                r2 = this;
                io.reactivex.SingleSource<T> r3 = r2.source
                io.reactivex.internal.observers.ResumeSingleObserver r0 = new io.reactivex.internal.observers.ResumeSingleObserver
                io.reactivex.SingleObserver<? super T> r1 = r2.actual
                r0.<init>(r2, r1)
                r3.subscribe(r0)
                return
        }
    }

    public SingleDelayWithSingle(io.reactivex.SingleSource<T> r1, io.reactivex.SingleSource<U> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r4) {
            r3 = this;
            io.reactivex.SingleSource<U> r0 = r3.other
            io.reactivex.internal.operators.single.SingleDelayWithSingle$OtherObserver r1 = new io.reactivex.internal.operators.single.SingleDelayWithSingle$OtherObserver
            io.reactivex.SingleSource<T> r2 = r3.source
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
