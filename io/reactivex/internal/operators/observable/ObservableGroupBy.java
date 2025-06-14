package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableGroupBy<T, K, V> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.observables.GroupedObservable<K, V>> {
    final int bufferSize;
    final boolean delayError;
    final io.reactivex.functions.Function<? super T, ? extends K> keySelector;
    final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

    public static final class GroupByObserver<T, K, V> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable {
        static final java.lang.Object NULL_KEY = null;
        private static final long serialVersionUID = -3688291656102519502L;
        final io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> actual;
        final int bufferSize;
        final java.util.concurrent.atomic.AtomicBoolean cancelled;
        final boolean delayError;
        final java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, V>> groups;
        final io.reactivex.functions.Function<? super T, ? extends K> keySelector;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f413s;
        final io.reactivex.functions.Function<? super T, ? extends V> valueSelector;

        static {
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver.NULL_KEY = r0
                return
        }

        public GroupByObserver(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r2, io.reactivex.functions.Function<? super T, ? extends K> r3, io.reactivex.functions.Function<? super T, ? extends V> r4, int r5, boolean r6) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.cancelled = r0
                r1.actual = r2
                r1.keySelector = r3
                r1.valueSelector = r4
                r1.bufferSize = r5
                r1.delayError = r6
                java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
                r2.<init>()
                r1.groups = r2
                r2 = 1
                r1.lazySet(r2)
                return
        }

        public void cancel(K r2) {
                r1 = this;
                if (r2 == 0) goto L3
                goto L5
            L3:
                java.lang.Object r2 = io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver.NULL_KEY
            L5:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r0 = r1.groups
                r0.remove(r2)
                int r2 = r1.decrementAndGet()
                if (r2 != 0) goto L15
                io.reactivex.disposables.Disposable r2 = r1.f413s
                r2.dispose()
            L15:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L15
                int r0 = r3.decrementAndGet()
                if (r0 != 0) goto L15
                io.reactivex.disposables.Disposable r0 = r3.f413s
                r0.dispose()
            L15:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.cancelled
                boolean r0 = r0.get()
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r1 = r2.groups
                java.util.Collection r1 = r1.values()
                r0.<init>(r1)
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r1 = r2.groups
                r1.clear()
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast r1 = (io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) r1
                r1.onComplete()
                goto L14
            L24:
                io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r1 = r2.groups
                java.util.Collection r1 = r1.values()
                r0.<init>(r1)
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r1 = r2.groups
                r1.clear()
                java.util.Iterator r0 = r0.iterator()
            L14:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L24
                java.lang.Object r1 = r0.next()
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast r1 = (io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) r1
                r1.onError(r3)
                goto L14
            L24:
                io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r5) {
                r4 = this;
                io.reactivex.functions.Function<? super T, ? extends K> r0 = r4.keySelector     // Catch: java.lang.Throwable -> L51
                java.lang.Object r0 = r0.apply(r5)     // Catch: java.lang.Throwable -> L51
                if (r0 == 0) goto La
                r1 = r0
                goto Lc
            La:
                java.lang.Object r1 = io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver.NULL_KEY
            Lc:
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r2 = r4.groups
                java.lang.Object r2 = r2.get(r1)
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast r2 = (io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast) r2
                if (r2 != 0) goto L34
                java.util.concurrent.atomic.AtomicBoolean r2 = r4.cancelled
                boolean r2 = r2.get()
                if (r2 == 0) goto L1f
                return
            L1f:
                int r2 = r4.bufferSize
                boolean r3 = r4.delayError
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast r2 = io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast.createWith(r0, r2, r4, r3)
                java.util.Map<java.lang.Object, io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast<K, V>> r0 = r4.groups
                r0.put(r1, r2)
                r4.getAndIncrement()
                io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r0 = r4.actual
                r0.onNext(r2)
            L34:
                io.reactivex.functions.Function<? super T, ? extends V> r0 = r4.valueSelector     // Catch: java.lang.Throwable -> L44
                java.lang.Object r5 = r0.apply(r5)     // Catch: java.lang.Throwable -> L44
                java.lang.String r0 = "The value supplied is null"
                java.lang.Object r5 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)     // Catch: java.lang.Throwable -> L44
                r2.onNext(r5)
                return
            L44:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.disposables.Disposable r0 = r4.f413s
                r0.dispose()
                r4.onError(r5)
                return
            L51:
                r5 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r5)
                io.reactivex.disposables.Disposable r0 = r4.f413s
                r0.dispose()
                r4.onError(r5)
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f413s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f413s = r2
                io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }
    }

    static final class GroupedUnicast<K, T> extends io.reactivex.observables.GroupedObservable<K, T> {
        final io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> state;

        protected GroupedUnicast(K r1, io.reactivex.internal.operators.observable.ObservableGroupBy.State<T, K> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.state = r2
                return
        }

        public static <T, K> io.reactivex.internal.operators.observable.ObservableGroupBy.GroupedUnicast<K, T> createWith(K r1, int r2, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> r3, boolean r4) {
                io.reactivex.internal.operators.observable.ObservableGroupBy$State r0 = new io.reactivex.internal.operators.observable.ObservableGroupBy$State
                r0.<init>(r2, r3, r1, r4)
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast r2 = new io.reactivex.internal.operators.observable.ObservableGroupBy$GroupedUnicast
                r2.<init>(r1, r0)
                return r2
        }

        public void onComplete() {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupBy$State<T, K> r0 = r1.state
                r0.onComplete()
                return
        }

        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupBy$State<T, K> r0 = r1.state
                r0.onError(r2)
                return
        }

        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupBy$State<T, K> r0 = r1.state
                r0.onNext(r2)
                return
        }

        @Override // io.reactivex.Observable
        protected void subscribeActual(io.reactivex.Observer<? super T> r2) {
                r1 = this;
                io.reactivex.internal.operators.observable.ObservableGroupBy$State<T, K> r0 = r1.state
                r0.subscribe(r2)
                return
        }
    }

    static final class State<T, K> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.ObservableSource<T> {
        private static final long serialVersionUID = -3852313036005250360L;
        final java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> actual;
        final java.util.concurrent.atomic.AtomicBoolean cancelled;
        final boolean delayError;
        volatile boolean done;
        java.lang.Throwable error;
        final K key;
        final java.util.concurrent.atomic.AtomicBoolean once;
        final io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        State(int r2, io.reactivex.internal.operators.observable.ObservableGroupBy.GroupByObserver<?, K, T> r3, K r4, boolean r5) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.cancelled = r0
                java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
                r0.<init>()
                r1.once = r0
                java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
                r0.<init>()
                r1.actual = r0
                io.reactivex.internal.queue.SpscLinkedArrayQueue r0 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r0.<init>(r2)
                r1.queue = r0
                r1.parent = r3
                r1.key = r4
                r1.delayError = r5
                return
        }

        boolean checkTerminated(boolean r4, boolean r5, io.reactivex.Observer<? super T> r6, boolean r7) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.cancelled
                boolean r0 = r0.get()
                r1 = 1
                r2 = 0
                if (r0 == 0) goto L1c
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r4 = r3.queue
                r4.clear()
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver<?, K, T> r4 = r3.parent
                K r5 = r3.key
                r4.cancel(r5)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r4 = r3.actual
                r4.lazySet(r2)
                return r1
            L1c:
                if (r4 == 0) goto L50
                if (r7 == 0) goto L33
                if (r5 == 0) goto L50
                java.lang.Throwable r4 = r3.error
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r5 = r3.actual
                r5.lazySet(r2)
                if (r4 == 0) goto L2f
                r6.onError(r4)
                goto L32
            L2f:
                r6.onComplete()
            L32:
                return r1
            L33:
                java.lang.Throwable r4 = r3.error
                if (r4 == 0) goto L45
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r5 = r3.queue
                r5.clear()
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r5 = r3.actual
                r5.lazySet(r2)
                r6.onError(r4)
                return r1
            L45:
                if (r5 == 0) goto L50
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r4 = r3.actual
                r4.lazySet(r2)
                r6.onComplete()
                return r1
            L50:
                r4 = 0
                return r4
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.cancelled
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L1d
                int r0 = r3.getAndIncrement()
                if (r0 != 0) goto L1d
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r3.actual
                r1 = 0
                r0.lazySet(r1)
                io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver<?, K, T> r0 = r3.parent
                K r1 = r3.key
                r0.cancel(r1)
            L1d:
                return
        }

        void drain() {
                r8 = this;
                int r0 = r8.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r8.queue
                boolean r1 = r8.delayError
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r2 = r8.actual
                java.lang.Object r2 = r2.get()
                io.reactivex.Observer r2 = (io.reactivex.Observer) r2
                r3 = 1
                r4 = r3
            L15:
                if (r2 == 0) goto L30
            L17:
                boolean r5 = r8.done
                java.lang.Object r6 = r0.poll()
                if (r6 != 0) goto L21
                r7 = r3
                goto L22
            L21:
                r7 = 0
            L22:
                boolean r5 = r8.checkTerminated(r5, r7, r2, r1)
                if (r5 == 0) goto L29
                return
            L29:
                if (r7 == 0) goto L2c
                goto L30
            L2c:
                r2.onNext(r6)
                goto L17
            L30:
                int r4 = -r4
                int r4 = r8.addAndGet(r4)
                if (r4 != 0) goto L38
                return
            L38:
                if (r2 != 0) goto L15
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r2 = r8.actual
                java.lang.Object r2 = r2.get()
                io.reactivex.Observer r2 = (io.reactivex.Observer) r2
                goto L15
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r1.cancelled
                boolean r0 = r0.get()
                return r0
        }

        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                r1.drain()
                return
        }

        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                r0.drain()
                return
        }

        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                r1.drain()
                return
        }

        @Override // io.reactivex.ObservableSource
        public void subscribe(io.reactivex.Observer<? super T> r4) {
                r3 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r3.once
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L25
                r4.onSubscribe(r3)
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r0 = r3.actual
                r0.lazySet(r4)
                java.util.concurrent.atomic.AtomicBoolean r4 = r3.cancelled
                boolean r4 = r4.get()
                if (r4 == 0) goto L21
                java.util.concurrent.atomic.AtomicReference<io.reactivex.Observer<? super T>> r4 = r3.actual
                r0 = 0
                r4.lazySet(r0)
                goto L2f
            L21:
                r3.drain()
                goto L2f
            L25:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Only one Observer allowed!"
                r0.<init>(r1)
                io.reactivex.internal.disposables.EmptyDisposable.error(r0, r4)
            L2f:
                return
        }
    }

    public ObservableGroupBy(io.reactivex.ObservableSource<T> r1, io.reactivex.functions.Function<? super T, ? extends K> r2, io.reactivex.functions.Function<? super T, ? extends V> r3, int r4, boolean r5) {
            r0 = this;
            r0.<init>(r1)
            r0.keySelector = r2
            r0.valueSelector = r3
            r0.bufferSize = r4
            r0.delayError = r5
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.observables.GroupedObservable<K, V>> r9) {
            r8 = this;
            io.reactivex.ObservableSource<T> r0 = r8.source
            io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver r7 = new io.reactivex.internal.operators.observable.ObservableGroupBy$GroupByObserver
            io.reactivex.functions.Function<? super T, ? extends K> r3 = r8.keySelector
            io.reactivex.functions.Function<? super T, ? extends V> r4 = r8.valueSelector
            int r5 = r8.bufferSize
            boolean r6 = r8.delayError
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            return
    }
}
