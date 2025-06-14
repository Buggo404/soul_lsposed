package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableUsing<T, D> extends io.reactivex.Observable<T> {
    final io.reactivex.functions.Consumer<? super D> disposer;
    final boolean eager;
    final java.util.concurrent.Callable<? extends D> resourceSupplier;
    final io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> sourceSupplier;

    static final class UsingObserver<T, D> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 5904473792286235046L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.functions.Consumer<? super D> disposer;
        final boolean eager;
        final D resource;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f465s;

        UsingObserver(io.reactivex.Observer<? super T> r1, D r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.resource = r2
                r0.disposer = r3
                r0.eager = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r1.disposeAfter()
                io.reactivex.disposables.Disposable r0 = r1.f465s
                r0.dispose()
                return
        }

        void disposeAfter() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L17
                io.reactivex.functions.Consumer<? super D> r0 = r2.disposer     // Catch: java.lang.Throwable -> L10
                D r1 = r2.resource     // Catch: java.lang.Throwable -> L10
                r0.accept(r1)     // Catch: java.lang.Throwable -> L10
                goto L17
            L10:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L17:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.get()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.eager
                if (r0 == 0) goto L29
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L1e
                io.reactivex.functions.Consumer<? super D> r0 = r2.disposer     // Catch: java.lang.Throwable -> L14
                D r1 = r2.resource     // Catch: java.lang.Throwable -> L14
                r0.accept(r1)     // Catch: java.lang.Throwable -> L14
                goto L1e
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.Observer<? super T> r1 = r2.actual
                r1.onError(r0)
                return
            L1e:
                io.reactivex.disposables.Disposable r0 = r2.f465s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
                goto L36
            L29:
                io.reactivex.Observer<? super T> r0 = r2.actual
                r0.onComplete()
                io.reactivex.disposables.Disposable r0 = r2.f465s
                r0.dispose()
                r2.disposeAfter()
            L36:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.eager
                if (r0 == 0) goto L30
                r0 = 0
                r1 = 1
                boolean r2 = r5.compareAndSet(r0, r1)
                if (r2 == 0) goto L25
                io.reactivex.functions.Consumer<? super D> r2 = r5.disposer     // Catch: java.lang.Throwable -> L14
                D r3 = r5.resource     // Catch: java.lang.Throwable -> L14
                r2.accept(r3)     // Catch: java.lang.Throwable -> L14
                goto L25
            L14:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r4[r0] = r6
                r4[r1] = r2
                r3.<init>(r4)
                r6 = r3
            L25:
                io.reactivex.disposables.Disposable r0 = r5.f465s
                r0.dispose()
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                goto L3d
            L30:
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                io.reactivex.disposables.Disposable r6 = r5.f465s
                r6.dispose()
                r5.disposeAfter()
            L3d:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f465s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f465s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableUsing(java.util.concurrent.Callable<? extends D> r1, io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> r2, io.reactivex.functions.Consumer<? super D> r3, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.resourceSupplier = r1
            r0.sourceSupplier = r2
            r0.disposer = r3
            r0.eager = r4
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            java.util.concurrent.Callable<? extends D> r0 = r5.resourceSupplier     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L44
            io.reactivex.functions.Function<? super D, ? extends io.reactivex.ObservableSource<? extends T>> r1 = r5.sourceSupplier     // Catch: java.lang.Throwable -> L21
            java.lang.Object r1 = r1.apply(r0)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "The sourceSupplier returned a null ObservableSource"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r1, r2)     // Catch: java.lang.Throwable -> L21
            io.reactivex.ObservableSource r1 = (io.reactivex.ObservableSource) r1     // Catch: java.lang.Throwable -> L21
            io.reactivex.internal.operators.observable.ObservableUsing$UsingObserver r2 = new io.reactivex.internal.operators.observable.ObservableUsing$UsingObserver
            io.reactivex.functions.Consumer<? super D> r3 = r5.disposer
            boolean r4 = r5.eager
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
            return
        L21:
            r1 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
            io.reactivex.functions.Consumer<? super D> r2 = r5.disposer     // Catch: java.lang.Throwable -> L2e
            r2.accept(r0)     // Catch: java.lang.Throwable -> L2e
            io.reactivex.internal.disposables.EmptyDisposable.error(r1, r6)
            return
        L2e:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
            r3 = 2
            java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
            r4 = 0
            r3[r4] = r1
            r1 = 1
            r3[r1] = r0
            r2.<init>(r3)
            io.reactivex.internal.disposables.EmptyDisposable.error(r2, r6)
            return
        L44:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r6)
            return
    }
}
