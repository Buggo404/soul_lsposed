package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSkipLast<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int skip;

    static final class SkipLastObserver<T> extends java.util.ArrayDeque<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3807491841935125653L;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f448s;
        final int skip;

        SkipLastObserver(io.reactivex.Observer<? super T> r1, int r2) {
                r0 = this;
                r0.<init>(r2)
                r0.actual = r1
                r0.skip = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f448s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f448s
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
        public void onNext(T r3) {
                r2 = this;
                int r0 = r2.skip
                int r1 = r2.size()
                if (r0 != r1) goto L11
                io.reactivex.Observer<? super T> r0 = r2.actual
                java.lang.Object r1 = r2.poll()
                r0.onNext(r1)
            L11:
                r2.offer(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f448s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f448s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableSkipLast(io.reactivex.ObservableSource<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.skip = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableSkipLast$SkipLastObserver r1 = new io.reactivex.internal.operators.observable.ObservableSkipLast$SkipLastObserver
            int r2 = r3.skip
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
