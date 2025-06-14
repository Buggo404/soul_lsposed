package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTakeLast<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int count;

    static final class TakeLastObserver<T> extends java.util.ArrayDeque<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 7240042530241604978L;
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        final int count;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f455s;

        TakeLastObserver(io.reactivex.Observer<? super T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f455s
                r0.dispose()
            Lc:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.actual
            L2:
                boolean r1 = r2.cancelled
                if (r1 == 0) goto L7
                return
            L7:
                java.lang.Object r1 = r2.poll()
                if (r1 != 0) goto L15
                boolean r1 = r2.cancelled
                if (r1 != 0) goto L14
                r0.onComplete()
            L14:
                return
            L15:
                r0.onNext(r1)
                goto L2
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
                int r0 = r2.count
                int r1 = r2.size()
                if (r0 != r1) goto Lb
                r2.poll()
            Lb:
                r2.offer(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f455s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f455s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableTakeLast(io.reactivex.ObservableSource<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableTakeLast$TakeLastObserver r1 = new io.reactivex.internal.operators.observable.ObservableTakeLast$TakeLastObserver
            int r2 = r3.count
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
