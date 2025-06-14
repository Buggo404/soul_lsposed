package io.reactivex.subjects;

/* loaded from: classes.dex */
public final class UnicastSubject<T> extends io.reactivex.subjects.Subject<T> {
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> actual;
    final boolean delayError;
    volatile boolean disposed;
    volatile boolean done;
    boolean enableOperatorFusion;
    java.lang.Throwable error;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> onTerminate;
    final java.util.concurrent.atomic.AtomicBoolean once;
    final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;
    final io.reactivex.internal.observers.BasicIntQueueDisposable<T> wip;

    final class UnicastQueueDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<T> {
        private static final long serialVersionUID = 7926949470189395511L;
        final /* synthetic */ io.reactivex.subjects.UnicastSubject this$0;

        UnicastQueueDisposable(io.reactivex.subjects.UnicastSubject r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r2 = this;
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                boolean r0 = r0.disposed
                if (r0 != 0) goto L30
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                r1 = 1
                r0.disposed = r1
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                r0.doTerminate()
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r0.actual
                r1 = 0
                r0.lazySet(r1)
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r0.wip
                int r0 = r0.getAndIncrement()
                if (r0 != 0) goto L30
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r0.actual
                r0.lazySet(r1)
                io.reactivex.subjects.UnicastSubject r0 = r2.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
            L30:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                boolean r0 = r0.disposed
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r1 = this;
                io.reactivex.subjects.UnicastSubject r0 = r1.this$0
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                java.lang.Object r0 = r0.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r3) {
                r2 = this;
                r0 = 2
                r3 = r3 & r0
                if (r3 == 0) goto La
                io.reactivex.subjects.UnicastSubject r3 = r2.this$0
                r1 = 1
                r3.enableOperatorFusion = r1
                return r0
            La:
                r3 = 0
                return r3
        }
    }

    UnicastSubject(int r2, java.lang.Runnable r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    UnicastSubject(int r3, java.lang.Runnable r4, boolean r5) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            java.lang.String r0 = "onTerminate"
            java.lang.Object r4 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r0)
            r3.<init>(r4)
            r2.onTerminate = r3
            r2.delayError = r5
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable r3 = new io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable
            r3.<init>(r2)
            r2.wip = r3
            return
    }

    UnicastSubject(int r3, boolean r4) {
            r2 = this;
            r2.<init>()
            io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
            java.lang.String r1 = "capacityHint"
            int r3 = io.reactivex.internal.functions.ObjectHelper.verifyPositive(r3, r1)
            r0.<init>(r3)
            r2.queue = r0
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.onTerminate = r3
            r2.delayError = r4
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference
            r3.<init>()
            r2.actual = r3
            java.util.concurrent.atomic.AtomicBoolean r3 = new java.util.concurrent.atomic.AtomicBoolean
            r3.<init>()
            r2.once = r3
            io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable r3 = new io.reactivex.subjects.UnicastSubject$UnicastQueueDisposable
            r3.<init>(r2)
            r2.wip = r3
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create() {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            int r1 = bufferSize()
            r2 = 1
            r0.<init>(r1, r2)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int r2) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            r1 = 1
            r0.<init>(r2, r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int r2, java.lang.Runnable r3) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            r1 = 1
            r0.<init>(r2, r3, r1)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(int r1, java.lang.Runnable r2, boolean r3) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            r0.<init>(r1, r2, r3)
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.UnicastSubject<T> create(boolean r2) {
            io.reactivex.subjects.UnicastSubject r0 = new io.reactivex.subjects.UnicastSubject
            int r1 = bufferSize()
            r0.<init>(r1, r2)
            return r0
    }

    void doTerminate() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r0 = r3.onTerminate
            java.lang.Object r0 = r0.get()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference<java.lang.Runnable> r1 = r3.onTerminate
            r2 = 0
            boolean r1 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r2)
            if (r1 == 0) goto L16
            r0.run()
        L16:
            return
    }

    void drain() {
            r2 = this;
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r2.wip
            int r0 = r0.getAndIncrement()
            if (r0 == 0) goto L9
            return
        L9:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            io.reactivex.Observer r0 = (io.reactivex.Observer) r0
            r1 = 1
        L12:
            if (r0 == 0) goto L20
            boolean r1 = r2.enableOperatorFusion
            if (r1 == 0) goto L1c
            r2.drainFused(r0)
            goto L1f
        L1c:
            r2.drainNormal(r0)
        L1f:
            return
        L20:
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r2.wip
            int r1 = -r1
            int r1 = r0.addAndGet(r1)
            if (r1 != 0) goto L2a
            return
        L2a:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r2.actual
            java.lang.Object r0 = r0.get()
            io.reactivex.Observer r0 = (io.reactivex.Observer) r0
            goto L12
    }

    void drainFused(io.reactivex.Observer<? super T> r7) {
            r6 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r6.queue
            boolean r1 = r6.delayError
            r2 = 1
            r1 = r1 ^ r2
        L6:
            boolean r3 = r6.disposed
            r4 = 0
            if (r3 == 0) goto L14
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r7 = r6.actual
            r7.lazySet(r4)
            r0.clear()
            return
        L14:
            boolean r3 = r6.done
            if (r1 == 0) goto L21
            if (r3 == 0) goto L21
            boolean r5 = r6.failedFast(r0, r7)
            if (r5 == 0) goto L21
            return
        L21:
            r7.onNext(r4)
            if (r3 == 0) goto L2a
            r6.errorOrComplete(r7)
            return
        L2a:
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r3 = r6.wip
            int r2 = -r2
            int r2 = r3.addAndGet(r2)
            if (r2 != 0) goto L6
            return
    }

    void drainNormal(io.reactivex.Observer<? super T> r10) {
            r9 = this;
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r9.queue
            boolean r1 = r9.delayError
            r2 = 1
            r1 = r1 ^ r2
            r3 = r2
            r4 = r3
        L8:
            boolean r5 = r9.disposed
            if (r5 == 0) goto L16
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r10 = r9.actual
            r1 = 0
            r10.lazySet(r1)
            r0.clear()
            return
        L16:
            boolean r5 = r9.done
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r6 = r9.queue
            java.lang.Object r6 = r6.poll()
            r7 = 0
            if (r6 != 0) goto L23
            r8 = r2
            goto L24
        L23:
            r8 = r7
        L24:
            if (r5 == 0) goto L38
            if (r1 == 0) goto L32
            if (r3 == 0) goto L32
            boolean r3 = r9.failedFast(r0, r10)
            if (r3 == 0) goto L31
            return
        L31:
            r3 = r7
        L32:
            if (r8 == 0) goto L38
            r9.errorOrComplete(r10)
            return
        L38:
            if (r8 == 0) goto L44
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r5 = r9.wip
            int r4 = -r4
            int r4 = r5.addAndGet(r4)
            if (r4 != 0) goto L8
            return
        L44:
            r10.onNext(r6)
            goto L8
    }

    void errorOrComplete(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r2.actual
            r1 = 0
            r0.lazySet(r1)
            java.lang.Throwable r0 = r2.error
            if (r0 == 0) goto Le
            r3.onError(r0)
            goto L11
        Le:
            r3.onComplete()
        L11:
            return
    }

    boolean failedFast(io.reactivex.internal.fuseable.SimpleQueue<T> r4, io.reactivex.Observer<? super T> r5) {
            r3 = this;
            java.lang.Throwable r0 = r3.error
            if (r0 == 0) goto L12
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r1 = r3.actual
            r2 = 0
            r1.lazySet(r2)
            r4.clear()
            r5.onError(r0)
            r4 = 1
            return r4
        L12:
            r4 = 0
            return r4
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto L7
            java.lang.Throwable r0 = r1.error
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 != 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r1.actual
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 == 0) goto La
            java.lang.Throwable r0 = r1.error
            if (r0 == 0) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L12
            boolean r0 = r1.disposed
            if (r0 == 0) goto L9
            goto L12
        L9:
            r0 = 1
            r1.done = r0
            r1.doTerminate()
            r1.drain()
        L12:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.done
            if (r0 != 0) goto L1a
            boolean r0 = r1.disposed
            if (r0 == 0) goto Le
            goto L1a
        Le:
            r1.error = r2
            r2 = 1
            r1.done = r2
            r1.doTerminate()
            r1.drain()
            return
        L1a:
            io.reactivex.plugins.RxJavaPlugins.onError(r2)
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r2) {
            r1 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r0)
            boolean r0 = r1.done
            if (r0 != 0) goto L16
            boolean r0 = r1.disposed
            if (r0 == 0) goto Le
            goto L16
        Le:
            io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
            r0.offer(r2)
            r1.drain()
        L16:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            boolean r0 = r1.done
            if (r0 != 0) goto L8
            boolean r0 = r1.disposed
            if (r0 == 0) goto Lb
        L8:
            r2.dispose()
        Lb:
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            boolean r0 = r0.get()
            if (r0 != 0) goto L2b
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L2b
            io.reactivex.internal.observers.BasicIntQueueDisposable<T> r0 = r3.wip
            r4.onSubscribe(r0)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r3.actual
            r0.lazySet(r4)
            boolean r4 = r3.disposed
            if (r4 == 0) goto L27
            java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r4 = r3.actual
            r0 = 0
            r4.lazySet(r0)
            return
        L27:
            r3.drain()
            goto L35
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Only a single observer allowed."
            r0.<init>(r1)
            io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
        L35:
            return
    }
}
