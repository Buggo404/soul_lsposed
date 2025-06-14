package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableDoFinally<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final io.reactivex.functions.Action onFinally;

    static final class DoFinallyObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T> {
        private static final long serialVersionUID = 4109457741734051389L;
        final io.reactivex.Observer<? super T> actual;

        /* renamed from: d */
        io.reactivex.disposables.Disposable f398d;
        final io.reactivex.functions.Action onFinally;

        /* renamed from: qd */
        io.reactivex.internal.fuseable.QueueDisposable<T> f399qd;
        boolean syncFused;

        DoFinallyObserver(io.reactivex.Observer<? super T> r1, io.reactivex.functions.Action r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onFinally = r2
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r1.f399qd
                r0.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f398d
                r0.dispose()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f398d
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r1.f399qd
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onComplete()
                r1.runFinally()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.Observer<? super T> r0 = r1.actual
                r0.onError(r2)
                r1.runFinally()
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
                io.reactivex.disposables.Disposable r0 = r1.f398d
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto L17
                r1.f398d = r2
                boolean r0 = r2 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L12
                io.reactivex.internal.fuseable.QueueDisposable r2 = (io.reactivex.internal.fuseable.QueueDisposable) r2
                r1.f399qd = r2
            L12:
                io.reactivex.Observer<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            L17:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r2 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r2.f399qd
                java.lang.Object r0 = r0.poll()
                if (r0 != 0) goto Lf
                boolean r1 = r2.syncFused
                if (r1 == 0) goto Lf
                r2.runFinally()
            Lf:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r4) {
                r3 = this;
                io.reactivex.internal.fuseable.QueueDisposable<T> r0 = r3.f399qd
                r1 = 0
                if (r0 == 0) goto L16
                r2 = r4 & 4
                if (r2 != 0) goto L16
                int r4 = r0.requestFusion(r4)
                if (r4 == 0) goto L15
                r0 = 1
                if (r4 != r0) goto L13
                r1 = r0
            L13:
                r3.syncFused = r1
            L15:
                return r4
            L16:
                return r1
        }

        void runFinally() {
                r2 = this;
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L15
                io.reactivex.functions.Action r0 = r2.onFinally     // Catch: java.lang.Throwable -> Le
                r0.run()     // Catch: java.lang.Throwable -> Le
                goto L15
            Le:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L15:
                return
        }
    }

    public ObservableDoFinally(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Action r2) {
            r0 = this;
            r0.<init>(r1)
            r0.onFinally = r2
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            io.reactivex.ObservableSource<T> r0 = r3.source
            io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver r1 = new io.reactivex.internal.operators.observable.ObservableDoFinally$DoFinallyObserver
            io.reactivex.functions.Action r2 = r3.onFinally
            r1.<init>(r4, r2)
            r0.subscribe(r1)
            return
    }
}
