package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeDetach<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {

    static final class DetachMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        io.reactivex.MaybeObserver<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f339d;

        DetachMaybeObserver(io.reactivex.MaybeObserver<? super T> r1) {
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
                io.reactivex.disposables.Disposable r0 = r1.f339d
                r0.dispose()
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r1.f339d = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f339d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f339d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onComplete()
            Le:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f339d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onError(r3)
            Le:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f339d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f339d = r2
                io.reactivex.MaybeObserver<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r3) {
                r2 = this;
                io.reactivex.internal.disposables.DisposableHelper r0 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                r2.f339d = r0
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                if (r0 == 0) goto Le
                r1 = 0
                r2.actual = r1
                r0.onSuccess(r3)
            Le:
                return
        }
    }

    public MaybeDetach(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeDetach$DetachMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeDetach$DetachMaybeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
