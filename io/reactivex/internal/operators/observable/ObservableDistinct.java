package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDistinct<T, K> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final java.util.concurrent.Callable<? extends java.util.Collection<? super K>> collectionSupplier;
    final io.reactivex.functions.Function<? super T, K> keySelector;

    static final class DistinctObserver<T, K> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final java.util.Collection<? super K> collection;
        final io.reactivex.functions.Function<? super T, K> keySelector;

        DistinctObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super T, K> r2, java.util.Collection<? super K> r3) {
                r0 = this;
                r0.<init>(r1)
                r0.keySelector = r2
                r0.collection = r3
                return
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                java.util.Collection<? super K> r0 = r1.collection
                r0.clear()
                super.clear()
                return
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L11
                r0 = 1
                r1.done = r0
                java.util.Collection<? super K> r0 = r1.collection
                r0.clear()
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onComplete()
            L11:
                return
        }

        @Override // io.reactivex.internal.observers.BasicFuseableObserver, io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                goto L15
            L8:
                r0 = 1
                r1.done = r0
                java.util.Collection<? super K> r0 = r1.collection
                r0.clear()
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onError(r2)
            L15:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r2.sourceMode
                if (r0 != 0) goto L28
                io.reactivex.functions.Function<? super T, K> r0 = r2.keySelector     // Catch: java.lang.Throwable -> L23
                java.lang.Object r0 = r0.apply(r3)     // Catch: java.lang.Throwable -> L23
                java.lang.String r1 = "The keySelector returned a null key"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L23
                java.util.Collection<? super K> r1 = r2.collection     // Catch: java.lang.Throwable -> L23
                boolean r0 = r1.add(r0)     // Catch: java.lang.Throwable -> L23
                if (r0 == 0) goto L2e
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onNext(r3)
                goto L2e
            L23:
                r3 = move-exception
                r2.fail(r3)
                return
            L28:
                io.reactivex.Observer<? super R> r3 = r2.actual
                r0 = 0
                r3.onNext(r0)
            L2e:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r4 = this;
            L0:
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r4.f175qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L1c
                java.util.Collection<? super K> r1 = r4.collection
                io.reactivex.functions.Function<? super T, K> r2 = r4.keySelector
                java.lang.Object r2 = r2.apply(r0)
                java.lang.String r3 = "The keySelector returned a null key"
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r3)
                boolean r1 = r1.add(r2)
                if (r1 == 0) goto L0
            L1c:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public ObservableDistinct(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, K> r2, java.util.concurrent.Callable<? extends java.util.Collection<? super K>> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.keySelector = r2
            r0.collectionSupplier = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            java.util.concurrent.Callable<? extends java.util.Collection<? super K>> r0 = r4.collectionSupplier     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L1b
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L1b
            io.reactivex.ObservableSource<T> r1 = r4.source
            io.reactivex.internal.operators.observable.ObservableDistinct$DistinctObserver r2 = new io.reactivex.internal.operators.observable.ObservableDistinct$DistinctObserver
            io.reactivex.functions.Function<? super T, K> r3 = r4.keySelector
            r2.<init>(r5, r3, r0)
            r1.subscribe(r2)
            return
        L1b:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
