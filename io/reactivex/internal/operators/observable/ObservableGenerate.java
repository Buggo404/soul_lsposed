package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableGenerate<T, S> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super S> disposeState;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> generator;
    final java.util.concurrent.Callable<S> stateSupplier;

    static final class GeneratorDisposable<T, S> implements io.reactivex.Emitter<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Consumer<? super S> disposeState;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        GeneratorDisposable(io.reactivex.Observer<? super T> r1, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3, S r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.generator = r2
                r0.disposeState = r3
                r0.state = r4
                return
        }

        private void dispose(S r2) {
                r1 = this;
                io.reactivex.functions.Consumer<? super S> r0 = r1.disposeState     // Catch: java.lang.Throwable -> L6
                r0.accept(r2)     // Catch: java.lang.Throwable -> L6
                goto Ld
            L6:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Ld:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 != 0) goto Lc
                r0 = 1
                r1.terminate = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                goto L19
            L8:
                if (r2 != 0) goto L11
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L11:
                r0 = 1
                r1.terminate = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
            L19:
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 != 0) goto L28
                boolean r0 = r1.hasNext
                if (r0 == 0) goto L13
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "onNext already called in this generate turn"
                r2.<init>(r0)
                r1.onError(r2)
                goto L28
            L13:
                if (r2 != 0) goto L20
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                goto L28
            L20:
                r0 = 1
                r1.hasNext = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
            L28:
                return
        }

        public void run() {
                r5 = this;
                S r0 = r5.state
                boolean r1 = r5.cancelled
                r2 = 0
                if (r1 == 0) goto Ld
                r5.state = r2
                r5.dispose(r0)
                return
            Ld:
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r1 = r5.generator
            Lf:
                boolean r3 = r5.cancelled
                if (r3 == 0) goto L19
                r5.state = r2
                r5.dispose(r0)
                return
            L19:
                r3 = 0
                r5.hasNext = r3
                r3 = 1
                java.lang.Object r0 = r1.apply(r0, r5)     // Catch: java.lang.Throwable -> L2d
                boolean r4 = r5.terminate
                if (r4 == 0) goto Lf
                r5.cancelled = r3
                r5.state = r2
                r5.dispose(r0)
                return
            L2d:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                r5.state = r2
                r5.cancelled = r3
                r5.onError(r1)
                r5.dispose(r0)
                return
        }
    }

    public ObservableGenerate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3) {
            r0 = this;
            r0.<init>()
            r0.stateSupplier = r1
            r0.generator = r2
            r0.disposeState = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r5) {
            r4 = this;
            java.util.concurrent.Callable<S> r0 = r4.stateSupplier     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L16
            io.reactivex.internal.operators.observable.ObservableGenerate$GeneratorDisposable r1 = new io.reactivex.internal.operators.observable.ObservableGenerate$GeneratorDisposable
            io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2 = r4.generator
            io.reactivex.functions.Consumer<? super S> r3 = r4.disposeState
            r1.<init>(r5, r2, r3, r0)
            r5.onSubscribe(r1)
            r1.run()
            return
        L16:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
