package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableMap<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final io.reactivex.functions.Function<? super T, ? extends U> function;

    static final class MapObserver<T, U> extends io.reactivex.internal.observers.BasicFuseableObserver<T, U> {
        final io.reactivex.functions.Function<? super T, ? extends U> mapper;

        MapObserver(io.reactivex.Observer<? super U> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.mapper = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 == 0) goto L10
                io.reactivex.Observer<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Function<? super T, ? extends U> r0 = r1.mapper     // Catch: java.lang.Throwable -> L22
                java.lang.Object r2 = r0.apply(r2)     // Catch: java.lang.Throwable -> L22
                java.lang.String r0 = "The mapper function returned a null value."
                java.lang.Object r2 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)     // Catch: java.lang.Throwable -> L22
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L22:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public U poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f175qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto L15
                io.reactivex.functions.Function<? super T, ? extends U> r1 = r2.mapper
                java.lang.Object r0 = r1.apply(r0)
                java.lang.String r1 = "The mapper function returned a null value."
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)
                goto L16
            L15:
                r0 = 0
            L16:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public ObservableMap(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.function = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableMap$MapObserver r1 = new io.reactivex.internal.operators.observable.ObservableMap$MapObserver
            io.reactivex.functions.Function<? super T, ? extends U> r2 = r3.function
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
