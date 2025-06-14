package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDebounce<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> debounceSelector;

    static final class DebounceObserver<T, U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> debounceSelector;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> debouncer;
        boolean done;
        volatile long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f391s;

        static final class DebounceInnerObserver<T, U> extends io.reactivex.observers.DisposableObserver<U> {
            boolean done;
            final long index;
            final java.util.concurrent.atomic.AtomicBoolean once;
            final io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> parent;
            final T value;

            DebounceInnerObserver(io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver<T, U> r2, long r3, T r5) {
                    r1 = this;
                    r1.<init>()
                    java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                    r0.<init>()
                    r1.once = r0
                    r1.parent = r2
                    r1.index = r3
                    r1.value = r5
                    return
            }

            void emit() {
                    r4 = this;
                    java.util.concurrent.atomic.AtomicBoolean r0 = r4.once
                    r1 = 0
                    r2 = 1
                    boolean r0 = r0.compareAndSet(r1, r2)
                    if (r0 == 0) goto L13
                    io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver<T, U> r0 = r4.parent
                    long r1 = r4.index
                    T r3 = r4.value
                    r0.emit(r1, r3)
                L13:
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
                    r1.emit()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    boolean r0 = r1.done
                    if (r0 == 0) goto L8
                    io.reactivex.plugins.RxJavaPlugins.onError(r2)
                    return
                L8:
                    r0 = 1
                    r1.done = r0
                    io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver<T, U> r0 = r1.parent
                    r0.onError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(U r1) {
                    r0 = this;
                    boolean r1 = r0.done
                    if (r1 == 0) goto L5
                    return
                L5:
                    r1 = 1
                    r0.done = r1
                    r0.dispose()
                    r0.emit()
                    return
            }
        }

        DebounceObserver(io.reactivex.Observer<? super T> r2, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.debouncer = r0
                r1.actual = r2
                r1.debounceSelector = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f391s
                r0.dispose()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        void emit(long r3, T r5) {
                r2 = this;
                long r0 = r2.index
                int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r3 != 0) goto Lb
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onNext(r5)
            Lb:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f391s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r2.done = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.debouncer
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                io.reactivex.internal.disposables.DisposableHelper r1 = io.reactivex.internal.disposables.DisposableHelper.DISPOSED
                if (r0 == r1) goto L23
                io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver$DebounceInnerObserver r0 = (io.reactivex.internal.operators.observable.ObservableDebounce.DebounceObserver.DebounceInnerObserver) r0
                r0.emit()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
            L23:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.debouncer
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L5
                return
            L5:
                long r0 = r5.index
                r2 = 1
                long r0 = r0 + r2
                r5.index = r0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r2 = r5.debouncer
                java.lang.Object r2 = r2.get()
                io.reactivex.disposables.Disposable r2 = (io.reactivex.disposables.Disposable) r2
                if (r2 == 0) goto L19
                r2.dispose()
            L19:
                io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r3 = r5.debounceSelector     // Catch: java.lang.Throwable -> L38
                java.lang.Object r3 = r3.apply(r6)     // Catch: java.lang.Throwable -> L38
                java.lang.String r4 = "The ObservableSource supplied is null"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r4)     // Catch: java.lang.Throwable -> L38
                io.reactivex.ObservableSource r3 = (io.reactivex.ObservableSource) r3     // Catch: java.lang.Throwable -> L38
                io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver$DebounceInnerObserver r4 = new io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver$DebounceInnerObserver
                r4.<init>(r5, r0, r6)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r6 = r5.debouncer
                boolean r6 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r6, r2, r4)
                if (r6 == 0) goto L37
                r3.subscribe(r4)
            L37:
                return
            L38:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                r5.dispose()
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f391s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f391s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDebounce(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.debounceSelector = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver r1 = new io.reactivex.internal.operators.observable.ObservableDebounce$DebounceObserver
            io.reactivex.observers.SerializedObserver r2 = new io.reactivex.observers.SerializedObserver
            r2.<init>(r4)
            io.reactivex.functions.Function<? super T, ? extends io.reactivex.ObservableSource<U>> r4 = r3.debounceSelector
            r1.<init>(r2, r4)
            r0.subscribe(r1)
            return
    }
}
