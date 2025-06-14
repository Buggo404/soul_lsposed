package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWithLatestFrom<T, U, R> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, R> {
    final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
    final io.reactivex.ObservableSource<? extends U> other;

    final class WithLastFrom implements io.reactivex.Observer<U> {
        final /* synthetic */ io.reactivex.internal.operators.observable.ObservableWithLatestFrom this$0;
        private final io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver<T, U, R> wlf;

        WithLastFrom(io.reactivex.internal.operators.observable.ObservableWithLatestFrom r1, io.reactivex.internal.operators.observable.ObservableWithLatestFrom.WithLatestFromObserver<T, U, R> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.wlf = r2
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r0 = this;
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> r0 = r1.wlf
                r0.otherError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(U r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> r0 = r1.wlf
                r0.lazySet(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver<T, U, R> r0 = r1.wlf
                r0.setOther(r2)
                return
        }
    }

    static final class WithLatestFromObserver<T, U, R> extends java.util.concurrent.atomic.AtomicReference<U> implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -312246233408980075L;
        final io.reactivex.Observer<? super R> actual;
        final io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> combiner;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> other;

        /* renamed from: s */
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> f477s;

        WithLatestFromObserver(io.reactivex.Observer<? super R> r2, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.f477s = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.other = r0
                r1.actual = r2
                r1.combiner = r3
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f477s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f477s
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                java.lang.Object r0 = r2.get()
                if (r0 == 0) goto L24
                io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.combiner     // Catch: java.lang.Throwable -> L18
                java.lang.Object r3 = r1.apply(r3, r0)     // Catch: java.lang.Throwable -> L18
                java.lang.String r0 = "The combiner returned a null value"
                java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r0)     // Catch: java.lang.Throwable -> L18
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onNext(r3)
                goto L24
            L18:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.dispose()
                io.reactivex.Observer<? super R> r0 = r2.actual
                r0.onError(r3)
            L24:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f477s
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        public void otherError(java.lang.Throwable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.f477s
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super R> r0 = r1.actual
                r0.onError(r2)
                return
        }

        public boolean setOther(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.other
                boolean r2 = io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return r2
        }
    }

    public ObservableWithLatestFrom(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r2, io.reactivex.ObservableSource<? extends U> r3) {
            r0 = this;
            r0.<init>(r1)
            r0.combiner = r2
            r0.other = r3
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super R> r3) {
            r2 = this;
            io.reactivex.observers.SerializedObserver r0 = new io.reactivex.observers.SerializedObserver
            r0.<init>(r3)
            io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver r3 = new io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLatestFromObserver
            io.reactivex.functions.BiFunction<? super T, ? super U, ? extends R> r1 = r2.combiner
            r3.<init>(r0, r1)
            r0.onSubscribe(r3)
            io.reactivex.ObservableSource<? extends U> r0 = r2.other
            io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLastFrom r1 = new io.reactivex.internal.operators.observable.ObservableWithLatestFrom$WithLastFrom
            r1.<init>(r2, r3)
            r0.subscribe(r1)
            io.reactivex.ObservableSource<T> r0 = r2.source
            r0.subscribe(r3)
            return
    }
}
