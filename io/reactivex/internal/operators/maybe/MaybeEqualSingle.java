package io.reactivex.internal.operators.maybe;

/* loaded from: classes.dex */
public final class MaybeEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<? super T, ? super T> isEqual;
    final io.reactivex.MaybeSource<? extends T> source1;
    final io.reactivex.MaybeSource<? extends T> source2;

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super java.lang.Boolean> actual;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> isEqual;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> observer1;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> observer2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                r1.actual = r2
                r1.isEqual = r3
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver r2 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver
                r2.<init>(r1)
                r1.observer1 = r2
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver r2 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver
                r2.<init>(r1)
                r1.observer2 = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r1.observer1
                r0.dispose()
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r1.observer2
                r0.dispose()
                return
        }

        void done() {
                r3 = this;
                int r0 = r3.decrementAndGet()
                if (r0 != 0) goto L3c
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r3.observer1
                java.lang.Object r0 = r0.value
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r1 = r3.observer2
                java.lang.Object r1 = r1.value
                if (r0 == 0) goto L2c
                if (r1 == 0) goto L2c
                io.reactivex.functions.BiPredicate<? super T, ? super T> r2 = r3.isEqual     // Catch: java.lang.Throwable -> L22
                boolean r0 = r2.test(r0, r1)     // Catch: java.lang.Throwable -> L22
                io.reactivex.SingleObserver<? super java.lang.Boolean> r1 = r3.actual
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.onSuccess(r0)
                goto L3c
            L22:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r1 = r3.actual
                r1.onError(r0)
                return
            L2c:
                io.reactivex.SingleObserver<? super java.lang.Boolean> r2 = r3.actual
                if (r0 != 0) goto L34
                if (r1 != 0) goto L34
                r0 = 1
                goto L35
            L34:
                r0 = 0
            L35:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r2.onSuccess(r0)
            L3c:
                return
        }

        void error(io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualObserver<T> r2, java.lang.Throwable r3) {
                r1 = this;
                r0 = 0
                int r0 = r1.getAndSet(r0)
                if (r0 <= 0) goto L1a
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r1.observer1
                if (r2 != r0) goto L11
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r2 = r1.observer2
                r2.dispose()
                goto L14
            L11:
                r0.dispose()
            L14:
                io.reactivex.SingleObserver<? super java.lang.Boolean> r2 = r1.actual
                r2.onError(r3)
                goto L1d
            L1a:
                io.reactivex.plugins.RxJavaPlugins.onError(r3)
            L1d:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r1.observer1
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        void subscribe(io.reactivex.MaybeSource<? extends T> r2, io.reactivex.MaybeSource<? extends T> r3) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r0 = r1.observer1
                r2.subscribe(r0)
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualObserver<T> r2 = r1.observer2
                r3.subscribe(r2)
                return
        }
    }

    static final class EqualObserver<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.MaybeObserver<T> {
        private static final long serialVersionUID = -3031974433025990931L;
        final io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> parent;
        java.lang.Object value;

        EqualObserver(io.reactivex.internal.operators.maybe.MaybeEqualSingle.EqualCoordinator<T> r1) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                return
        }

        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator<T> r0 = r1.parent
                r0.done()
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator<T> r0 = r1.parent
                r0.error(r1, r2)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                return
        }

        @Override // io.reactivex.MaybeObserver
        public void onSuccess(T r1) {
                r0 = this;
                r0.value = r1
                io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator<T> r1 = r0.parent
                r1.done()
                return
        }
    }

    public MaybeEqualSingle(io.reactivex.MaybeSource<? extends T> r1, io.reactivex.MaybeSource<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
            r0 = this;
            r0.<init>()
            r0.source1 = r1
            r0.source2 = r2
            r0.isEqual = r3
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r3) {
            r2 = this;
            io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator r0 = new io.reactivex.internal.operators.maybe.MaybeEqualSingle$EqualCoordinator
            io.reactivex.functions.BiPredicate<? super T, ? super T> r1 = r2.isEqual
            r0.<init>(r3, r1)
            r3.onSubscribe(r0)
            io.reactivex.MaybeSource<? extends T> r3 = r2.source1
            io.reactivex.MaybeSource<? extends T> r1 = r2.source2
            r0.subscribe(r3, r1)
            return
    }
}
