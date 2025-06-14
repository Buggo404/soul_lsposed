package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableZipIterable<T, U, V> extends io.reactivex.Observable<V> {
    final java.lang.Iterable<U> other;
    final io.reactivex.Observable<? extends T> source;
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

    static final class ZipIterableObserver<T, U, V> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super V> actual;
        boolean done;
        final java.util.Iterator<U> iterator;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f480s;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> zipper;

        ZipIterableObserver(io.reactivex.Observer<? super V> r1, java.util.Iterator<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.iterator = r2
                r0.zipper = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f480s
                r0.dispose()
                return
        }

        void error(java.lang.Throwable r2) {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.disposables.Disposable r0 = r1.f480s
                r0.dispose()
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f480s
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
                r0 = 1
                r1.done = r0
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onComplete()
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
                io.reactivex.Observer<? super V> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                java.util.Iterator<U> r0 = r2.iterator     // Catch: java.lang.Throwable -> L48
                java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L48
                java.lang.String r1 = "The iterator returned a null value"
                java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L48
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r1 = r2.zipper     // Catch: java.lang.Throwable -> L40
                java.lang.Object r3 = r1.apply(r3, r0)     // Catch: java.lang.Throwable -> L40
                java.lang.String r0 = "The zipper function returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L40
                io.reactivex.Observer<? super V> r0 = r2.actual
                r0.onNext(r3)
                java.util.Iterator<U> r3 = r2.iterator     // Catch: java.lang.Throwable -> L38
                boolean r3 = r3.hasNext()     // Catch: java.lang.Throwable -> L38
                if (r3 != 0) goto L37
                r3 = 1
                r2.done = r3
                io.reactivex.disposables.Disposable r3 = r2.f480s
                r3.dispose()
                io.reactivex.Observer<? super V> r3 = r2.actual
                r3.onComplete()
            L37:
                return
            L38:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.error(r3)
                return
            L40:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.error(r3)
                return
            L48:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.error(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f480s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f480s = r2
                io.reactivex.Observer<? super V> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableZipIterable(io.reactivex.Observable<? extends T> r1, java.lang.Iterable<U> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.other = r2
            r0.zipper = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super V> r5) {
            r4 = this;
            java.lang.Iterable<U> r0 = r4.other     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r1 = "The iterator returned by other is null"
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r0 = (java.util.Iterator) r0     // Catch: java.lang.Throwable -> L2d
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r1 != 0) goto L18
            io.reactivex.internal.disposables.EmptyDisposable.complete(r5)
            return
        L18:
            io.reactivex.Observable<? extends T> r1 = r4.source
            io.reactivex.internal.operators.observable.ObservableZipIterable$ZipIterableObserver r2 = new io.reactivex.internal.operators.observable.ObservableZipIterable$ZipIterableObserver
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends V> r3 = r4.zipper
            r2.<init>(r5, r0, r3)
            r1.subscribe(r2)
            return
        L25:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
        L2d:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r5)
            return
    }
}
