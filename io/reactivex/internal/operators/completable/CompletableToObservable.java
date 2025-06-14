package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableToObservable<T> extends io.reactivex.Observable<T> {
    final io.reactivex.CompletableSource source;

    static final class ObserverCompletableObserver extends io.reactivex.internal.observers.BasicQueueDisposable<java.lang.Void> implements io.reactivex.CompletableObserver {
        final io.reactivex.Observer<?> observer;
        io.reactivex.disposables.Disposable upstream;

        ObserverCompletableObserver(io.reactivex.Observer<?> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r0 = this;
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<?> r0 = r1.observer
                r0.onComplete()
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<?> r0 = r1.observer
                r0.onError(r2)
                return
        }

        @Override // io.reactivex.CompletableObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.upstream
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.upstream = r2
                io.reactivex.Observer<?> r2 = r1.observer
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                java.lang.Void r0 = r1.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public java.lang.Void poll() throws java.lang.Exception {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                r1 = r1 & 2
                return r1
        }
    }

    public CompletableToObservable(io.reactivex.CompletableSource r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.CompletableSource r0 = r2.source
            io.reactivex.internal.operators.completable.CompletableToObservable$ObserverCompletableObserver r1 = new io.reactivex.internal.operators.completable.CompletableToObservable$ObserverCompletableObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
