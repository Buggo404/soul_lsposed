package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableTakeUntil<T, U> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.ObservableSource<? extends U> other;

    static final class TakeUntilMainObserver<T, U> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = 1418547743690811973L;
        final io.reactivex.Observer<? super T> downstream;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilMainObserver<T, U>.OtherObserver otherObserver;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> upstream;

        final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.Observer<U> {
            private static final long serialVersionUID = -8693423678067375039L;
            final /* synthetic */ io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilMainObserver this$0;

            OtherObserver(io.reactivex.internal.operators.observable.ObservableTakeUntil.TakeUntilMainObserver r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver r0 = r1.this$0
                    r0.otherComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver r0 = r1.this$0
                    r0.otherError(r2)
                    return
            }

            @Override // io.reactivex.Observer
            public void onNext(U r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver r1 = r0.this$0
                    r1.otherComplete()
                    return
            }

            @Override // io.reactivex.Observer
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        TakeUntilMainObserver(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.downstream = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.upstream = r1
                io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver$OtherObserver r1 = new io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver$OtherObserver
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
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver<T, U>$OtherObserver r0 = r1.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                java.lang.Object r0 = r0.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver<T, U>$OtherObserver r0 = r2.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver<T, U>$OtherObserver r0 = r2.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.Observer<? super T> r0 = r2.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r1.upstream
                io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r2)
                return
        }

        void otherComplete() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
                return
        }

        void otherError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> r0 = r2.upstream
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                io.reactivex.Observer<? super T> r0 = r2.downstream
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }
    }

    public ObservableTakeUntil(io.reactivex.ObservableSource<T> r1, io.reactivex.ObservableSource<? extends U> r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver r0 = new io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver
            r0.<init>(r3)
            r3.onSubscribe(r0)
            io.reactivex.ObservableSource<? extends U> r3 = r2.other
            io.reactivex.internal.operators.observable.ObservableTakeUntil$TakeUntilMainObserver<T, U>$OtherObserver r1 = r0.otherObserver
            r3.subscribe(r1)
            io.reactivex.ObservableSource<T> r3 = r2.source
            r3.subscribe(r0)
            return
    }
}
