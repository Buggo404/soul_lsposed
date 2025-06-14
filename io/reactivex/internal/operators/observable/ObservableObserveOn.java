package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableObserveOn<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.Scheduler scheduler;

    static final class ObserveOnObserver<T> extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> implements io.reactivex.Observer<T>, java.lang.Runnable {
        private static final long serialVersionUID = 6576896619930983584L;
        final io.reactivex.Observer<? super T> actual;
        final int bufferSize;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        boolean outputFused;
        io.reactivex.internal.fuseable.SimpleQueue<T> queue;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f422s;
        int sourceMode;
        final io.reactivex.Scheduler.Worker worker;

        ObserveOnObserver(io.reactivex.Observer<? super T> r1, io.reactivex.Scheduler.Worker r2, boolean r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.worker = r2
                r0.delayError = r3
                r0.bufferSize = r4
                return
        }

        boolean checkTerminated(boolean r3, boolean r4, io.reactivex.Observer<? super T> r5) {
                r2 = this;
                boolean r0 = r2.cancelled
                r1 = 1
                if (r0 == 0) goto Lb
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r2.queue
                r3.clear()
                return r1
            Lb:
                if (r3 == 0) goto L3f
                java.lang.Throwable r3 = r2.error
                boolean r0 = r2.delayError
                if (r0 == 0) goto L24
                if (r4 == 0) goto L3f
                if (r3 == 0) goto L1b
                r5.onError(r3)
                goto L1e
            L1b:
                r5.onComplete()
            L1e:
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L24:
                if (r3 == 0) goto L34
                io.reactivex.internal.fuseable.SimpleQueue<T> r4 = r2.queue
                r4.clear()
                r5.onError(r3)
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L34:
                if (r4 == 0) goto L3f
                r5.onComplete()
                io.reactivex.Scheduler$Worker r3 = r2.worker
                r3.dispose()
                return r1
            L3f:
                r3 = 0
                return r3
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto L1c
                r0 = 1
                r1.cancelled = r0
                io.reactivex.disposables.Disposable r0 = r1.f422s
                r0.dispose()
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.dispose()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1c
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                r0.clear()
            L1c:
                return
        }

        void drainFused() {
                r4 = this;
                r0 = 1
            L1:
                boolean r1 = r4.cancelled
                if (r1 == 0) goto L6
                return
            L6:
                boolean r1 = r4.done
                java.lang.Throwable r2 = r4.error
                boolean r3 = r4.delayError
                if (r3 != 0) goto L1d
                if (r1 == 0) goto L1d
                if (r2 == 0) goto L1d
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onError(r2)
                io.reactivex.Scheduler$Worker r0 = r4.worker
                r0.dispose()
                return
            L1d:
                io.reactivex.Observer<? super T> r2 = r4.actual
                r3 = 0
                r2.onNext(r3)
                if (r1 == 0) goto L3a
                java.lang.Throwable r0 = r4.error
                if (r0 == 0) goto L2f
                io.reactivex.Observer<? super T> r1 = r4.actual
                r1.onError(r0)
                goto L34
            L2f:
                io.reactivex.Observer<? super T> r0 = r4.actual
                r0.onComplete()
            L34:
                io.reactivex.Scheduler$Worker r0 = r4.worker
                r0.dispose()
                return
            L3a:
                int r0 = -r0
                int r0 = r4.addAndGet(r0)
                if (r0 != 0) goto L1
                return
        }

        void drainNormal() {
                r7 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r7.queue
                io.reactivex.Observer<? super T> r1 = r7.actual
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.done
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.checkTerminated(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.done
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.checkTerminated(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.disposables.Disposable r3 = r7.f422s
                r3.dispose()
                r0.clear()
                r1.onError(r2)
                io.reactivex.Scheduler$Worker r0 = r7.worker
                r0.dispose()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
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
                r1.schedule()
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
                r1.error = r2
                r2 = 1
                r1.done = r2
                r1.schedule()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r2.sourceMode
                r1 = 2
                if (r0 == r1) goto Lf
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r2.queue
                r0.offer(r3)
            Lf:
                r2.schedule()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.disposables.Disposable r0 = r2.f422s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r3)
                if (r0 == 0) goto L42
                r2.f422s = r3
                boolean r0 = r3 instanceof io.reactivex.internal.fuseable.QueueDisposable
                if (r0 == 0) goto L34
                io.reactivex.internal.fuseable.QueueDisposable r3 = (io.reactivex.internal.fuseable.QueueDisposable) r3
                r0 = 7
                int r0 = r3.requestFusion(r0)
                r1 = 1
                if (r0 != r1) goto L27
                r2.sourceMode = r0
                r2.queue = r3
                r2.done = r1
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
                r2.schedule()
                return
            L27:
                r1 = 2
                if (r0 != r1) goto L34
                r2.sourceMode = r0
                r2.queue = r3
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
                return
            L34:
                io.reactivex.internal.queue.SpscLinkedArrayQueue r3 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                int r0 = r2.bufferSize
                r3.<init>(r0)
                r2.queue = r3
                io.reactivex.Observer<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
            L42:
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r1 = this;
                io.reactivex.internal.fuseable.SimpleQueue<T> r0 = r1.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 2
                r2 = r2 & r0
                if (r2 == 0) goto L8
                r2 = 1
                r1.outputFused = r2
                return r0
            L8:
                r2 = 0
                return r2
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                boolean r0 = r1.outputFused
                if (r0 == 0) goto L8
                r1.drainFused()
                goto Lb
            L8:
                r1.drainNormal()
            Lb:
                return
        }

        void schedule() {
                r1 = this;
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto Lb
                io.reactivex.Scheduler$Worker r0 = r1.worker
                r0.schedule(r1)
            Lb:
                return
        }
    }

    public ObservableObserveOn(io.reactivex.ObservableSource<T> r1, io.reactivex.Scheduler r2, boolean r3, int r4) {
            r0 = this;
            r0.<init>(r1)
            r0.scheduler = r2
            r0.delayError = r3
            r0.bufferSize = r4
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r6) {
            r5 = this;
            io.reactivex.Scheduler r0 = r5.scheduler
            boolean r1 = r0 instanceof io.reactivex.internal.schedulers.TrampolineScheduler
            if (r1 == 0) goto Lc
            io.reactivex.ObservableSource<T> r0 = r5.source
            r0.subscribe(r6)
            goto L1e
        Lc:
            io.reactivex.Scheduler$Worker r0 = r0.createWorker()
            io.reactivex.ObservableSource<T> r1 = r5.source
            io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver r2 = new io.reactivex.internal.operators.observable.ObservableObserveOn$ObserveOnObserver
            boolean r3 = r5.delayError
            int r4 = r5.bufferSize
            r2.<init>(r6, r0, r3, r4)
            r1.subscribe(r2)
        L1e:
            return
    }
}
