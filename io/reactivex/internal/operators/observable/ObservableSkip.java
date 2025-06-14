package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSkip<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {

    /* renamed from: n */
    final long f446n;

    static final class SkipObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f447d;
        long remaining;

        SkipObserver(io.reactivex.Observer<? super T> r1, long r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.remaining = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f447d
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f447d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                long r0 = r4.remaining
                r2 = 0
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto Le
                r2 = 1
                long r0 = r0 - r2
                r4.remaining = r0
                goto L13
            Le:
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onNext(r5)
            L13:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f447d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f447d = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSkip(io.reactivex.ObservableSource<T> r1, long r2) {
            r0 = this;
            r0.<init>(r1)
            r0.f446n = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableSkip$SkipObserver r1 = new io.reactivex.internal.operators.observable.ObservableSkip$SkipObserver
            long r2 = r4.f446n
            r1.<init>(r5, r2)
            r0.subscribe(r1)
            return
    }
}
