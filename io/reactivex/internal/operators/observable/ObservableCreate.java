package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableCreate<T> extends io.reactivex.Observable<T> {
    final io.reactivex.ObservableOnSubscribe<T> source;

    static final class CreateEmitter<T> extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.ObservableEmitter<T>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -3434801548987643227L;
        final io.reactivex.Observer<? super T> observer;

        CreateEmitter(io.reactivex.Observer<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.observer = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.lang.Object r0 = r1.get()
                io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L14
                io.reactivex.Observer<? super T> r0 = r1.observer     // Catch: java.lang.Throwable -> Lf
                r0.onComplete()     // Catch: java.lang.Throwable -> Lf
                r1.dispose()
                goto L14
            Lf:
                r0 = move-exception
                r1.dispose()
                throw r0
            L14:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.tryOnError(r2)
                if (r0 != 0) goto L9
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L9:
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                if (r2 != 0) goto Ld
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                return
            Ld:
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L18
                io.reactivex.Observer<? super T> r0 = r1.observer
                r0.onNext(r2)
            L18:
                return
        }

        @Override // io.reactivex.ObservableEmitter
        public io.reactivex.ObservableEmitter<T> serialize() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableCreate$SerializedEmitter r0 = new io.reactivex.internal.operators.observable.ObservableCreate$SerializedEmitter
                r0.<init>(r1)
                return r0
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.internal.disposables.CancellableDisposable r0 = new io.reactivex.internal.disposables.CancellableDisposable
                r0.<init>(r2)
                r1.setDisposable(r0)
                return
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r1) {
                r0 = this;
                io.reactivex.internal.disposables.DisposableHelper.set(r0, r1)
                return
        }

        @Override // java.util.concurrent.atomic.AtomicReference
        public java.lang.String toString() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Class r1 = r3.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r2 = 0
                r0[r2] = r1
                r1 = 1
                java.lang.String r2 = super.toString()
                r0[r1] = r2
                java.lang.String r1 = "%s{%s}"
                java.lang.String r0 = java.lang.String.format(r1, r0)
                return r0
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(java.lang.Throwable r2) {
                r1 = this;
                if (r2 != 0) goto L9
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L9:
                boolean r0 = r1.isDisposed()
                if (r0 != 0) goto L1e
                io.reactivex.Observer<? super T> r0 = r1.observer     // Catch: java.lang.Throwable -> L19
                r0.onError(r2)     // Catch: java.lang.Throwable -> L19
                r1.dispose()
                r2 = 1
                return r2
            L19:
                r2 = move-exception
                r1.dispose()
                throw r2
            L1e:
                r2 = 0
                return r2
        }
    }

    static final class SerializedEmitter<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.ObservableEmitter<T> {
        private static final long serialVersionUID = 4883307006032401862L;
        volatile boolean done;
        final io.reactivex.ObservableEmitter<T> emitter;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        SerializedEmitter(io.reactivex.ObservableEmitter<T> r2) {
                r1 = this;
                r1.<init>()
                r1.emitter = r2
                io.reactivex.internal.util.AtomicThrowable r2 = new io.reactivex.internal.util.AtomicThrowable
                r2.<init>()
                r1.error = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r2 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0 = 16
                r2.<init>(r0)
                r1.queue = r2
                return
        }

        void drain() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L9
                r1.drainLoop()
            L9:
                return
        }

        void drainLoop() {
                r8 = this;
                io.reactivex.ObservableEmitter<T> r0 = r8.emitter
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r1 = r8.queue
                io.reactivex.internal.util.AtomicThrowable r2 = r8.error
                r3 = 1
                r4 = r3
            L8:
                boolean r5 = r0.isDisposed()
                if (r5 == 0) goto L12
                r1.clear()
                return
            L12:
                java.lang.Object r5 = r2.get()
                if (r5 == 0) goto L23
                r1.clear()
                java.lang.Throwable r1 = r2.terminate()
                r0.onError(r1)
                return
            L23:
                boolean r5 = r8.done
                java.lang.Object r6 = r1.poll()
                if (r6 != 0) goto L2d
                r7 = r3
                goto L2e
            L2d:
                r7 = 0
            L2e:
                if (r5 == 0) goto L36
                if (r7 == 0) goto L36
                r0.onComplete()
                return
            L36:
                if (r7 == 0) goto L40
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto L8
                return
            L40:
                r0.onNext(r6)
                goto L8
        }

        @Override // io.reactivex.ObservableEmitter, io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.ObservableEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                io.reactivex.ObservableEmitter<T> r0 = r1.emitter
                boolean r0 = r0.isDisposed()
                if (r0 != 0) goto L13
                boolean r0 = r1.done
                if (r0 == 0) goto Ld
                goto L13
            Ld:
                r0 = 1
                r1.done = r0
                r1.drain()
            L13:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.tryOnError(r2)
                if (r0 != 0) goto L9
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L9:
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r3) {
                r2 = this;
                io.reactivex.ObservableEmitter<T> r0 = r2.emitter
                boolean r0 = r0.isDisposed()
                if (r0 != 0) goto L49
                boolean r0 = r2.done
                if (r0 == 0) goto Ld
                goto L49
            Ld:
                if (r3 != 0) goto L1a
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
                r2.onError(r3)
                return
            L1a:
                int r0 = r2.get()
                if (r0 != 0) goto L34
                r0 = 0
                r1 = 1
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L34
                io.reactivex.ObservableEmitter<T> r0 = r2.emitter
                r0.onNext(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L42
                return
            L34:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r2.queue
                monitor-enter(r0)
                r0.offer(r3)     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                int r3 = r2.getAndIncrement()
                if (r3 == 0) goto L42
                return
            L42:
                r2.drainLoop()
                return
            L46:
                r3 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                throw r3
            L49:
                return
        }

        @Override // io.reactivex.ObservableEmitter
        public io.reactivex.ObservableEmitter<T> serialize() {
                r0 = this;
                return r0
        }

        @Override // io.reactivex.ObservableEmitter
        public void setCancellable(io.reactivex.functions.Cancellable r2) {
                r1 = this;
                io.reactivex.ObservableEmitter<T> r0 = r1.emitter
                r0.setCancellable(r2)
                return
        }

        @Override // io.reactivex.ObservableEmitter
        public void setDisposable(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.ObservableEmitter<T> r0 = r1.emitter
                r0.setDisposable(r2)
                return
        }

        @Override // java.util.concurrent.atomic.AtomicInteger
        public java.lang.String toString() {
                r1 = this;
                io.reactivex.ObservableEmitter<T> r0 = r1.emitter
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // io.reactivex.ObservableEmitter
        public boolean tryOnError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.ObservableEmitter<T> r0 = r2.emitter
                boolean r0 = r0.isDisposed()
                r1 = 0
                if (r0 != 0) goto L26
                boolean r0 = r2.done
                if (r0 == 0) goto Le
                goto L26
            Le:
                if (r3 != 0) goto L17
                java.lang.NullPointerException r3 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r3.<init>(r0)
            L17:
                io.reactivex.internal.util.AtomicThrowable r0 = r2.error
                boolean r3 = r0.addThrowable(r3)
                if (r3 == 0) goto L26
                r3 = 1
                r2.done = r3
                r2.drain()
                return r3
            L26:
                return r1
        }
    }

    public ObservableCreate(io.reactivex.ObservableOnSubscribe<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.observable.ObservableCreate$CreateEmitter r0 = new io.reactivex.internal.operators.observable.ObservableCreate$CreateEmitter
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.ObservableOnSubscribe<T> r2 = r1.source     // Catch: java.lang.Throwable -> Le
            r2.subscribe(r0)     // Catch: java.lang.Throwable -> Le
            goto L15
        Le:
            r2 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
            r0.onError(r2)
        L15:
            return
    }
}
