package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableFilter<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Predicate<? super T> predicate;

    static final class FilterObserver<T> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.Predicate<? super T> filter;

        FilterObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.filter = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                int r0 = r1.sourceMode
                if (r0 != 0) goto L17
                io.reactivex.functions.Predicate<? super T> r0 = r1.filter     // Catch: java.lang.Throwable -> L12
                boolean r0 = r0.test(r2)     // Catch: java.lang.Throwable -> L12
                if (r0 == 0) goto L1d
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onNext(r2)
                goto L1d
            L12:
                r2 = move-exception
                r1.fail(r2)
                return
            L17:
                io.reactivex.Observer<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
            L1d:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
            L0:
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f175qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L10
                io.reactivex.functions.Predicate<? super T> r1 = r2.filter
                boolean r1 = r1.test(r0)
                if (r1 == 0) goto L0
            L10:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public ObservableFilter(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.predicate = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableFilter$FilterObserver r1 = new io.reactivex.internal.operators.observable.ObservableFilter$FilterObserver
            io.reactivex.functions.Predicate<? super T> r2 = r3.predicate
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
