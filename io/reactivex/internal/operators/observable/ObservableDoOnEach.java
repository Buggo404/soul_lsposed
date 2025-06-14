package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDoOnEach<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;

    static final class DoOnEachObserver<T> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super T> actual;
        boolean done;
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f400s;

        DoOnEachObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onNext = r2
                r0.onError = r3
                r0.onComplete = r4
                r0.onAfterTerminate = r5
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f400s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f400s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L20
                r0.run()     // Catch: java.lang.Throwable -> L20
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L18
                r0.run()     // Catch: java.lang.Throwable -> L18
                goto L1f
            L18:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L1f:
                return
            L20:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r1.onError(r0)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
                return
            L8:
                r0 = 1
                r5.done = r0
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r5.onError     // Catch: java.lang.Throwable -> L11
                r1.accept(r6)     // Catch: java.lang.Throwable -> L11
                goto L23
            L11:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r3[r0] = r1
                r2.<init>(r3)
                r6 = r2
            L23:
                io.reactivex.Observer<? super T> r0 = r5.actual
                r0.onError(r6)
                io.reactivex.functions.Action r6 = r5.onAfterTerminate     // Catch: java.lang.Throwable -> L2e
                r6.run()     // Catch: java.lang.Throwable -> L2e
                goto L35
            L2e:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L35:
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L10
                r0.accept(r2)     // Catch: java.lang.Throwable -> L10
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onNext(r2)
                return
            L10:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.disposables.Disposable r0 = r1.f400s
                r0.dispose()
                r1.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f400s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f400s = r2
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableDoOnEach(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
            r0 = this;
            r0.<init>(r1)
            r0.onNext = r2
            r0.onError = r3
            r0.onComplete = r4
            r0.onAfterTerminate = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableDoOnEach$DoOnEachObserver r7 = new io.reactivex.internal.operators.observable.ObservableDoOnEach$DoOnEachObserver
            io.reactivex.functions.Consumer<? super T> r3 = r8.onNext
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r8.onError
            io.reactivex.functions.Action r5 = r8.onComplete
            io.reactivex.functions.Action r6 = r8.onAfterTerminate
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
