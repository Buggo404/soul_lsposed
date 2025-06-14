package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDistinctUntilChanged<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    static final class DistinctUntilChangedObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.BiPredicate<? super K, ? super K> comparer;
        boolean hasValue;
        final io.reactivex.functions.Function<? super T, K> keySelector;
        K last;

        DistinctUntilChangedObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super T, K> r2, io.reactivex.functions.BiPredicate<? super K, ? super K> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.keySelector = r2
                r0.comparer = r3
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r4) {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r3.sourceMode
                if (r0 == 0) goto Lf
                io.reactivex.Observer<? super R> r0 = r3.actual
                r0.onNext(r4)
                return
            Lf:
                io.reactivex.functions.Function<? super T, K> r0 = r3.keySelector     // Catch: java.lang.Throwable -> L31
                java.lang.Object r0 = r0.apply(r4)     // Catch: java.lang.Throwable -> L31
                boolean r1 = r3.hasValue     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L26
                io.reactivex.functions.BiPredicate<? super K, ? super K> r1 = r3.comparer     // Catch: java.lang.Throwable -> L31
                K r2 = r3.last     // Catch: java.lang.Throwable -> L31
                boolean r1 = r1.test(r2, r0)     // Catch: java.lang.Throwable -> L31
                r3.last = r0     // Catch: java.lang.Throwable -> L31
                if (r1 == 0) goto L2b
                return
            L26:
                r1 = 1
                r3.hasValue = r1     // Catch: java.lang.Throwable -> L31
                r3.last = r0     // Catch: java.lang.Throwable -> L31
            L2b:
                io.reactivex.Observer<? super R> r0 = r3.actual
                r0.onNext(r4)
                return
            L31:
                r4 = move-exception
                r3.fail(r4)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r4 = this;
            L0:
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r4.f175qs
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto La
                r0 = 0
                return r0
            La:
                io.reactivex.functions.Function<? super T, K> r1 = r4.keySelector
                java.lang.Object r1 = r1.apply(r0)
                boolean r2 = r4.hasValue
                if (r2 != 0) goto L1a
                r2 = 1
                r4.hasValue = r2
                r4.last = r1
                return r0
            L1a:
                io.reactivex.functions.BiPredicate<? super K, ? super K> r2 = r4.comparer
                K r3 = r4.last
                boolean r2 = r2.test(r3, r1)
                if (r2 != 0) goto L27
                r4.last = r1
                return r0
            L27:
                r4.last = r1
                goto L0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public ObservableDistinctUntilChanged(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, K> r2, io.reactivex.functions.BiPredicate<? super K, ? super K> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.keySelector = r2
            r0.comparer = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            io.reactivex.ObservableSource<T> r0 = r4.source
            io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged$DistinctUntilChangedObserver r1 = new io.reactivex.internal.operators.observable.ObservableDistinctUntilChanged$DistinctUntilChangedObserver
            io.reactivex.functions.Function<? super T, K> r2 = r4.keySelector
            io.reactivex.functions.BiPredicate<? super K, ? super K> r3 = r4.comparer
            r1.<init>(r5, r2, r3)
            r0.subscribe(r1)
            return
    }
}
