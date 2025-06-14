package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDoAfterNext<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Consumer<? super T> onAfterNext;

    static final class DoAfterObserver<T> extends io.reactivex.internal.observers.BasicFuseableObserver<T, T> {
        final io.reactivex.functions.Consumer<? super T> onAfterNext;

        DoAfterObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Consumer<? super T> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.onAfterNext = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onNext(r2)
                int r0 = r1.sourceMode
                if (r0 != 0) goto L13
                io.reactivex.functions.Consumer<? super T> r0 = r1.onAfterNext     // Catch: java.lang.Throwable -> Lf
                r0.accept(r2)     // Catch: java.lang.Throwable -> Lf
                goto L13
            Lf:
                r2 = move-exception
                r1.fail(r2)
            L13:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f175qs
                java.lang.Object r0 = r0.poll()
                if (r0 == 0) goto Ld
                io.reactivex.functions.Consumer<? super T> r1 = r2.onAfterNext
                r1.accept(r0)
            Ld:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public ObservableDoAfterNext(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Consumer<? super T> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onAfterNext = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableDoAfterNext$DoAfterObserver r1 = new io.reactivex.internal.operators.observable.ObservableDoAfterNext$DoAfterObserver
            io.reactivex.functions.Consumer<? super T> r2 = r3.onAfterNext
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
