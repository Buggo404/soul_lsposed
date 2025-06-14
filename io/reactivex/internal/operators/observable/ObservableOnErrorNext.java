package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableOnErrorNext<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final boolean allowFatal;
    final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> nextSupplier;

    static final class OnErrorNextObserver<T> implements io.reactivex.Observer<T> {
        final io.reactivex.Observer<? super T> actual;
        final boolean allowFatal;
        final io.reactivex.internal.disposables.SequentialDisposable arbiter;
        boolean done;
        final io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> nextSupplier;
        boolean once;

        OnErrorNextObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.nextSupplier = r2
                r0.allowFatal = r3
                io.reactivex.internal.disposables.SequentialDisposable r1 = new io.reactivex.internal.disposables.SequentialDisposable
                r1.<init>()
                r0.arbiter = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                r1.once = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.once
                if (r0 == 0) goto L12
                boolean r0 = r6.done
                if (r0 == 0) goto Lc
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                return
            Lc:
                io.reactivex.Observer<? super T> r0 = r6.actual
                r0.onError(r7)
                return
            L12:
                r0 = 1
                r6.once = r0
                boolean r1 = r6.allowFatal
                if (r1 == 0) goto L23
                boolean r1 = r7 instanceof java.lang.Exception
                if (r1 != 0) goto L23
                io.reactivex.Observer<? super T> r0 = r6.actual
                r0.onError(r7)
                return
            L23:
                io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> r1 = r6.nextSupplier     // Catch: java.lang.Throwable -> L41
                java.lang.Object r1 = r1.apply(r7)     // Catch: java.lang.Throwable -> L41
                io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L41
                if (r1 != 0) goto L3d
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "Observable is null"
                r0.<init>(r1)
                r0.initCause(r7)
                io.reactivex.Observer<? super T> r7 = r6.actual
                r7.onError(r0)
                return
            L3d:
                r1.subscribe(r6)
                return
            L41:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.Observer<? super T> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.disposables.SequentialDisposable r0 = r1.arbiter
                r0.replace(r2)
                return
        }
    }

    public ObservableOnErrorNext(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> r2, boolean r3) {
            r0 = this;
            r0.<init>(r1)
            r0.nextSupplier = r2
            r0.allowFatal = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.internal.operators.observable.ObservableOnErrorNext$OnErrorNextObserver r0 = new io.reactivex.internal.operators.observable.ObservableOnErrorNext$OnErrorNextObserver
            io.reactivex.functions.Function<? super java.lang.Throwable, ? extends io.reactivex.ObservableSource<? extends T>> r1 = r3.nextSupplier
            boolean r2 = r3.allowFatal
            r0.<init>(r4, r1, r2)
            io.reactivex.internal.disposables.SequentialDisposable r1 = r0.arbiter
            r4.onSubscribe(r1)
            io.reactivex.ObservableSource<T> r4 = r3.source
            r4.subscribe(r0)
            return
    }
}
