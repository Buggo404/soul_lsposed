package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeIsEmpty<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, java.lang.Boolean> {

    static final class IsEmptyMaybeObserver<T> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super java.lang.Boolean> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f356d;

        IsEmptyMaybeObserver(io.reactivex.MaybeObserver<? super java.lang.Boolean> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f356d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f356d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r2 = this;
                io.reactivex.MaybeObserver<? super java.lang.Boolean> r0 = r2.actual
                r1 = 1
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.onSuccess(r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super java.lang.Boolean> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f356d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f356d = r2
                io.reactivex.MaybeObserver<? super java.lang.Boolean> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super java.lang.Boolean> r2 = r1.actual
                r0 = 0
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.onSuccess(r0)
                return
        }
    }

    public MaybeIsEmpty(io.reactivex.MaybeSource<T> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super java.lang.Boolean> r3) {
            r2 = this;
            io.reactivex.MaybeSource<T> r0 = r2.source
            io.reactivex.internal.operators.maybe.MaybeIsEmpty$IsEmptyMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeIsEmpty$IsEmptyMaybeObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
