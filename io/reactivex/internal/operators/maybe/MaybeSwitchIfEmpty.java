package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeSwitchIfEmpty<T> extends io.reactivex.internal.operators.maybe.AbstractMaybeWithUpstream<T, T> {
    final io.reactivex.MaybeSource<? extends T> other;

    static final class SwitchIfEmptyMaybeObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2223459372976438024L;
        final io.reactivex.MaybeObserver<? super T> actual;
        final io.reactivex.MaybeSource<? extends T> other;

        static final class OtherMaybeObserver<T> implements io.reactivex.MaybeObserver<T> {
            final io.reactivex.MaybeObserver<? super T> actual;
            final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> parent;

            OtherMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2) {
                    r0 = this;
                    r0.<init>()
                    r0.actual = r1
                    r0.parent = r2
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                    r0.onComplete()
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                    r1 = this;
                    java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.parent
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                    return
            }

            @Override // io.reactivex.MaybeObserver
            public void onSuccess(T r2) {
                    r1 = this;
                    io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                    r0.onSuccess(r2)
                    return
            }
        }

        SwitchIfEmptyMaybeObserver(io.reactivex.MaybeObserver<? super T> r1, io.reactivex.MaybeSource<? extends T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.other = r2
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

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r3 = this;
                java.lang.Object r0 = r3.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L1d
                r1 = 0
                boolean r0 = r3.compareAndSet(r0, r1)
                if (r0 == 0) goto L1d
                io.reactivex.MaybeSource<? extends T> r0 = r3.other
                io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver$OtherMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver$OtherMaybeObserver
                io.reactivex.MaybeObserver<? super T> r2 = r3.actual
                r1.<init>(r2, r3)
                r0.subscribe(r1)
            L1d:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                boolean r1 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                if (r1 == 0) goto Lb
                io.reactivex.MaybeObserver<? super T> r1 = r0.actual
                r1.onSubscribe(r0)
            Lb:
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r2) {
                r1 = this;
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onSuccess(r2)
                return
        }
    }

    public MaybeSwitchIfEmpty(io.reactivex.MaybeSource<T> r1, io.reactivex.MaybeSource<? extends T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r4) {
            r3 = this;
            io.reactivex.MaybeSource<T> r0 = r3.source
            io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver r1 = new io.reactivex.internal.operators.maybe.MaybeSwitchIfEmpty$SwitchIfEmptyMaybeObserver
            io.reactivex.MaybeSource<? extends T> r2 = r3.other
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
