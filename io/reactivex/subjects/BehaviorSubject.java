package io.reactivex.subjects;

/* loaded from: classes.dex */
public final class BehaviorSubject<T> extends io.reactivex.subjects.Subject<T> {
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] EMPTY = null;
    private static final java.lang.Object[] EMPTY_ARRAY = null;
    static final io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[] TERMINATED = null;
    long index;
    final java.util.concurrent.locks.ReadWriteLock lock;
    final java.util.concurrent.locks.Lock readLock;
    final java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[]> subscribers;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> terminalEvent;
    final java.util.concurrent.atomic.AtomicReference<java.lang.Object> value;
    final java.util.concurrent.locks.Lock writeLock;

    static final class BehaviorDisposable<T> implements io.reactivex.disposables.Disposable, io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate<java.lang.Object> {
        final io.reactivex.Observer<? super T> actual;
        volatile boolean cancelled;
        boolean emitting;
        boolean fastPath;
        long index;
        boolean next;
        io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> queue;
        final io.reactivex.subjects.BehaviorSubject<T> state;

        BehaviorDisposable(io.reactivex.Observer<? super T> r1, io.reactivex.subjects.BehaviorSubject<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.state = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lc
                r0 = 1
                r1.cancelled = r0
                io.reactivex.subjects.BehaviorSubject<T> r0 = r1.state
                r0.remove(r1)
            Lc:
                return
        }

        void emitFirst() {
                r4 = this;
                boolean r0 = r4.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                monitor-enter(r4)
                boolean r0 = r4.cancelled     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto Lc
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
                return
            Lc:
                boolean r0 = r4.next     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto L12
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
                return
            L12:
                io.reactivex.subjects.BehaviorSubject<T> r0 = r4.state     // Catch: java.lang.Throwable -> L3e
                java.util.concurrent.locks.Lock r1 = r0.readLock     // Catch: java.lang.Throwable -> L3e
                r1.lock()     // Catch: java.lang.Throwable -> L3e
                long r2 = r0.index     // Catch: java.lang.Throwable -> L3e
                r4.index = r2     // Catch: java.lang.Throwable -> L3e
                java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r0.value     // Catch: java.lang.Throwable -> L3e
                java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3e
                r1.unlock()     // Catch: java.lang.Throwable -> L3e
                r1 = 1
                if (r0 == 0) goto L2b
                r2 = r1
                goto L2c
            L2b:
                r2 = 0
            L2c:
                r4.emitting = r2     // Catch: java.lang.Throwable -> L3e
                r4.next = r1     // Catch: java.lang.Throwable -> L3e
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
                if (r0 == 0) goto L3d
                boolean r0 = r4.test(r0)
                if (r0 == 0) goto L3a
                return
            L3a:
                r4.emitLoop()
            L3d:
                return
            L3e:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L3e
                throw r0
        }

        void emitLoop() {
                r2 = this;
            L0:
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                monitor-enter(r2)
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r0 = r2.queue     // Catch: java.lang.Throwable -> L17
                if (r0 != 0) goto Lf
                r0 = 0
                r2.emitting = r0     // Catch: java.lang.Throwable -> L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                return
            Lf:
                r1 = 0
                r2.queue = r1     // Catch: java.lang.Throwable -> L17
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                r0.forEachWhile(r2)
                goto L0
            L17:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r0
        }

        void emitNext(java.lang.Object r3, long r4) {
                r2 = this;
                boolean r0 = r2.cancelled
                if (r0 == 0) goto L5
                return
            L5:
                boolean r0 = r2.fastPath
                if (r0 != 0) goto L37
                monitor-enter(r2)
                boolean r0 = r2.cancelled     // Catch: java.lang.Throwable -> L34
                if (r0 == 0) goto L10
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                return
            L10:
                long r0 = r2.index     // Catch: java.lang.Throwable -> L34
                int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r4 != 0) goto L18
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                return
            L18:
                boolean r4 = r2.emitting     // Catch: java.lang.Throwable -> L34
                if (r4 == 0) goto L2d
                io.reactivex.internal.util.AppendOnlyLinkedArrayList<java.lang.Object> r4 = r2.queue     // Catch: java.lang.Throwable -> L34
                if (r4 != 0) goto L28
                io.reactivex.internal.util.AppendOnlyLinkedArrayList r4 = new io.reactivex.internal.util.AppendOnlyLinkedArrayList     // Catch: java.lang.Throwable -> L34
                r5 = 4
                r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
                r2.queue = r4     // Catch: java.lang.Throwable -> L34
            L28:
                r4.add(r3)     // Catch: java.lang.Throwable -> L34
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                return
            L2d:
                r4 = 1
                r2.next = r4     // Catch: java.lang.Throwable -> L34
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                r2.fastPath = r4
                goto L37
            L34:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L34
                throw r3
            L37:
                r2.test(r3)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.internal.util.AppendOnlyLinkedArrayList.NonThrowingPredicate, io.reactivex.functions.Predicate
        public boolean test(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 != 0) goto Lf
                io.reactivex.Observer<? super T> r0 = r1.actual
                boolean r2 = io.reactivex.internal.util.NotificationLite.accept(r2, r0)
                if (r2 == 0) goto Ld
                goto Lf
            Ld:
                r2 = 0
                goto L10
            Lf:
                r2 = 1
            L10:
                return r2
        }
    }

    static {
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            io.reactivex.subjects.BehaviorSubject.EMPTY_ARRAY = r1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r0]
            io.reactivex.subjects.BehaviorSubject.EMPTY = r1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r0]
            io.reactivex.subjects.BehaviorSubject.TERMINATED = r0
            return
    }

    BehaviorSubject() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = new java.util.concurrent.locks.ReentrantReadWriteLock
            r0.<init>()
            r2.lock = r0
            java.util.concurrent.locks.Lock r1 = r0.readLock()
            r2.readLock = r1
            java.util.concurrent.locks.Lock r0 = r0.writeLock()
            r2.writeLock = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = io.reactivex.subjects.BehaviorSubject.EMPTY
            r0.<init>(r1)
            r2.subscribers = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.value = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r2.terminalEvent = r0
            return
    }

    BehaviorSubject(T r3) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.String r1 = "defaultValue is null"
            java.lang.Object r3 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)
            r0.lazySet(r3)
            return
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> create() {
            io.reactivex.subjects.BehaviorSubject r0 = new io.reactivex.subjects.BehaviorSubject
            r0.<init>()
            return r0
    }

    @io.reactivex.annotations.CheckReturnValue
    public static <T> io.reactivex.subjects.BehaviorSubject<T> createDefault(T r1) {
            io.reactivex.subjects.BehaviorSubject r0 = new io.reactivex.subjects.BehaviorSubject
            r0.<init>(r1)
            return r0
    }

    boolean add(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> r5) {
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r4.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = io.reactivex.subjects.BehaviorSubject.TERMINATED
            r2 = 0
            if (r0 != r1) goto Le
            return r2
        Le:
            int r1 = r0.length
            int r3 = r1 + 1
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r3 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r3]
            java.lang.System.arraycopy(r0, r2, r3, r2, r1)
            r3[r1] = r5
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r1 = r4.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r1, r0, r3)
            if (r0 == 0) goto L0
            r5 = 1
            return r5
    }

    @Override // io.reactivex.subjects.Subject
    public java.lang.Throwable getThrowable() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r1 == 0) goto L11
            java.lang.Throwable r0 = io.reactivex.internal.util.NotificationLite.getError(r0)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public T getValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r1 != 0) goto L18
            boolean r1 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r1 == 0) goto L13
            goto L18
        L13:
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r0)
            return r0
        L18:
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public java.lang.Object[] getValues() {
            r2 = this;
            java.lang.Object[] r0 = io.reactivex.subjects.BehaviorSubject.EMPTY_ARRAY
            r1 = r0
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            java.lang.Object[] r1 = r2.getValues(r1)
            if (r1 != r0) goto Lf
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            return r0
        Lf:
            return r1
    }

    @java.lang.Deprecated
    public T[] getValues(T[] r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.value
            java.lang.Object r0 = r0.get()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3a
            boolean r3 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r3 != 0) goto L3a
            boolean r3 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r3 == 0) goto L17
            goto L3a
        L17:
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.getValue(r0)
            int r3 = r6.length
            r4 = 1
            if (r3 == 0) goto L27
            r6[r2] = r0
            int r0 = r6.length
            if (r0 == r4) goto L39
            r6[r4] = r1
            goto L39
        L27:
            java.lang.Class r6 = r6.getClass()
            java.lang.Class r6 = r6.getComponentType()
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r6, r4)
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            r6[r2] = r0
        L39:
            return r6
        L3a:
            int r0 = r6.length
            if (r0 == 0) goto L3f
            r6[r2] = r1
        L3f:
            return r6
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasComplete() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.value
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasObservers() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            int r0 = r0.length
            if (r0 == 0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            return r0
    }

    @Override // io.reactivex.subjects.Subject
    public boolean hasThrowable() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r1.value
            java.lang.Object r0 = r0.get()
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            return r0
    }

    public boolean hasValue() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r2.value
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L16
            boolean r1 = io.reactivex.internal.util.NotificationLite.isComplete(r0)
            if (r1 != 0) goto L16
            boolean r0 = io.reactivex.internal.util.NotificationLite.isError(r0)
            if (r0 != 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    @Override // io.reactivex.Observer
    public void onComplete() {
            r7 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r7.terminalEvent
            r1 = 0
            java.lang.Throwable r2 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r2)
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r0 = io.reactivex.internal.util.NotificationLite.complete()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = r7.terminate(r0)
            int r2 = r1.length
            r3 = 0
        L16:
            if (r3 >= r2) goto L22
            r4 = r1[r3]
            long r5 = r7.index
            r4.emitNext(r0, r5)
            int r3 = r3 + 1
            goto L16
        L22:
            return
    }

    @Override // io.reactivex.Observer
    public void onError(java.lang.Throwable r7) {
            r6 = this;
            java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r6.terminalEvent
            r1 = 0
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r0, r1, r7)
            if (r0 != 0) goto L12
            io.reactivex.plugins.RxJavaPlugins.onError(r7)
            return
        L12:
            java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.error(r7)
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = r6.terminate(r7)
            int r1 = r0.length
            r2 = 0
        L1c:
            if (r2 >= r1) goto L28
            r3 = r0[r2]
            long r4 = r6.index
            r3.emitNext(r7, r4)
            int r2 = r2 + 1
            goto L1c
        L28:
            return
    }

    @Override // io.reactivex.Observer
    public void onNext(T r7) {
            r6 = this;
            java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r0)
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r6.terminalEvent
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Le
            return
        Le:
            java.lang.Object r7 = io.reactivex.internal.util.NotificationLite.next(r7)
            r6.setCurrent(r7)
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            int r1 = r0.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L2b
            r3 = r0[r2]
            long r4 = r6.index
            r3.emitNext(r7, r4)
            int r2 = r2 + 1
            goto L1f
        L2b:
            return
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(io.reactivex.disposables.Disposable r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r1.terminalEvent
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto Lb
            r2.dispose()
        Lb:
            return
    }

    void remove(io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T> r7) {
            r6 = this;
        L0:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r6.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            int r1 = r0.length
            if (r1 != 0) goto Lc
            return
        Lc:
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 != r7) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto Le
        L18:
            r3 = -1
        L19:
            if (r3 >= 0) goto L1c
            return
        L1c:
            r4 = 1
            if (r1 != r4) goto L22
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = io.reactivex.subjects.BehaviorSubject.EMPTY
            goto L31
        L22:
            int r5 = r1 + (-1)
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r5 = new io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[r5]
            java.lang.System.arraycopy(r0, r2, r5, r2, r3)
            int r2 = r3 + 1
            int r1 = r1 - r3
            int r1 = r1 - r4
            java.lang.System.arraycopy(r0, r2, r5, r3, r1)
            r1 = r5
        L31:
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r2 = r6.subscribers
            boolean r0 = io.reactivex.internal.disposables.DisposableHelper$$ExternalSyntheticBackportWithForwarding0.m51m(r2, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    void setCurrent(java.lang.Object r5) {
            r4 = this;
            java.util.concurrent.locks.Lock r0 = r4.writeLock
            r0.lock()
            long r0 = r4.index
            r2 = 1
            long r0 = r0 + r2
            r4.index = r0
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r4.value
            r0.lazySet(r5)
            java.util.concurrent.locks.Lock r5 = r4.writeLock
            r5.unlock()
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super T> r3) {
            r2 = this;
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable r0 = new io.reactivex.subjects.BehaviorSubject$BehaviorDisposable
            r0.<init>(r3, r2)
            r3.onSubscribe(r0)
            boolean r1 = r2.add(r0)
            if (r1 == 0) goto L1a
            boolean r3 = r0.cancelled
            if (r3 == 0) goto L16
            r2.remove(r0)
            goto L2d
        L16:
            r0.emitFirst()
            goto L2d
        L1a:
            java.util.concurrent.atomic.AtomicReference<java.lang.Throwable> r0 = r2.terminalEvent
            java.lang.Object r0 = r0.get()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            java.lang.Throwable r1 = io.reactivex.internal.util.ExceptionHelper.TERMINATED
            if (r0 != r1) goto L2a
            r3.onComplete()
            goto L2d
        L2a:
            r3.onError(r0)
        L2d:
            return
    }

    int subscriberCount() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r1.subscribers
            java.lang.Object r0 = r0.get()
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            int r0 = r0.length
            return r0
    }

    io.reactivex.subjects.BehaviorSubject.BehaviorDisposable<T>[] terminate(java.lang.Object r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReference<io.reactivex.subjects.BehaviorSubject$BehaviorDisposable<T>[]> r0 = r2.subscribers
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r1 = io.reactivex.subjects.BehaviorSubject.TERMINATED
            java.lang.Object r0 = r0.getAndSet(r1)
            io.reactivex.subjects.BehaviorSubject$BehaviorDisposable[] r0 = (io.reactivex.subjects.BehaviorSubject.BehaviorDisposable[]) r0
            if (r0 == r1) goto Lf
            r2.setCurrent(r3)
        Lf:
            return r0
    }
}
