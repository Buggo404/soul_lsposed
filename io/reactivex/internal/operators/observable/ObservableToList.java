package io.reactivex.internal.operators.observable;

import java.util.Collection;

/* loaded from: classes.dex */
public final class ObservableToList<T, U extends java.util.Collection<? super T>> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, U> {
    final java.util.concurrent.Callable<U> collectionSupplier;

    static final class ToListObserver<T, U extends java.util.Collection<? super T>> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.Observer<? super U> actual;
        U collection;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f462s;

        ToListObserver(io.reactivex.Observer<? super U> r1, U r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.collection = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f462s
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f462s
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                U extends java.util.Collection<? super T> r0 = r2.collection
                r1 = 0
                r2.collection = r1
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r1 = r2.actual
                r1.onNext(r0)
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                r0 = 0
                r1.collection = r0
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                U extends java.util.Collection<? super T> r0 = r1.collection
                r0.add(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f462s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f462s = r2
                io.reactivex.Observer<? super U extends java.util.Collection<? super T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    public ObservableToList(io.reactivex.ObservableSource<T> r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.concurrent.Callable r1 = io.reactivex.internal.functions.Functions.createArrayList(r2)
            r0.collectionSupplier = r1
            return
    }

    public ObservableToList(io.reactivex.ObservableSource<T> r1, java.util.concurrent.Callable<U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.collectionSupplier = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super U> r4) {
            r3 = this;
            java.util.concurrent.Callable<U extends java.util.Collection<? super T>> r0 = r3.collectionSupplier     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L19
            java.lang.String r1 = "The collectionSupplier returned a null collection. Null values are generally not allowed in 2.x operators and sources."
            java.lang.Object r0 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r0, r1)     // Catch: java.lang.Throwable -> L19
            java.util.Collection r0 = (java.util.Collection) r0     // Catch: java.lang.Throwable -> L19
            io.reactivex.ObservableSource<T> r1 = r3.source
            io.reactivex.internal.operators.observable.ObservableToList$ToListObserver r2 = new io.reactivex.internal.operators.observable.ObservableToList$ToListObserver
            r2.<init>(r4, r0)
            r1.subscribe(r2)
            return
        L19:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
            return
    }
}
