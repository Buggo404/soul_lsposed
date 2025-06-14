package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableMergeWithCompletable<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.CompletableSource other;

    static final class MergeWithObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -4592979584110982903L;
        final io.reactivex.Observer<? super T> actual;
        final io.reactivex.internal.util.AtomicThrowable error;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> mainDisposable;
        volatile boolean mainDone;
        volatile boolean otherDone;
        final io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver.OtherObserver otherObserver;

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> parent;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableMergeWithCompletable.MergeWithObserver<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver<?> r0 = r1.parent
                    r0.otherComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver<?> r0 = r1.parent
                    r0.otherError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        MergeWithObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.mainDisposable = r1
                io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver r1 = new io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver
                r1.<init>(r0)
                r0.otherObserver = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver r0 = r1.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                r0 = 1
                r2.mainDone = r0
                boolean r0 = r2.otherDone
                if (r0 == 0) goto Le
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            Le:
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void otherComplete() {
                r2 = this;
                r0 = 1
                r2.otherDone = r0
                boolean r0 = r2.mainDone
                if (r0 == 0) goto Le
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            Le:
                return
        }

        void otherError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.mainDisposable
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }
    }

    public ObservableMergeWithCompletable(io.reactivex.Observable<T> r1, io.reactivex.CompletableSource r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver r0 = new io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.ObservableSource<T> r2 = r1.source
            r2.subscribe(r0)
            io.reactivex.CompletableSource r2 = r1.other
            io.reactivex.internal.operators.observable.ObservableMergeWithCompletable$MergeWithObserver$OtherObserver r0 = r0.otherObserver
            r2.subscribe(r0)
            return
    }
}
