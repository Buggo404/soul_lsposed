package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToObservable<java.lang.Boolean> {
    final int bufferSize;
    final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
    final io.reactivex.ObservableSource<? extends T> first;
    final io.reactivex.ObservableSource<? extends T> second;

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
        final io.reactivex.ObservableSource<? extends T> first;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver<T>[] observers;
        final io.reactivex.internal.disposables.ArrayCompositeDisposable resources;
        final io.reactivex.ObservableSource<? extends T> second;

        /* renamed from: v1 */
        T f442v1;

        /* renamed from: v2 */
        T f443v2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> r1, int r2, io.reactivex.ObservableSource<? extends T> r3, io.reactivex.ObservableSource<? extends T> r4, io.reactivex.functions.BiPredicate<? super T, ? super T> r5) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.first = r3
                r0.second = r4
                r0.comparer = r5
                r1 = 2
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver[] r3 = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualObserver[r1]
                r0.observers = r3
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver r4 = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver
                r5 = 0
                r4.<init>(r0, r5, r2)
                r3[r5] = r4
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver r4 = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver
                r5 = 1
                r4.<init>(r0, r5, r2)
                r3[r5] = r4
                io.reactivex.internal.disposables.ArrayCompositeDisposable r2 = new io.reactivex.internal.disposables.ArrayCompositeDisposable
                r2.<init>(r1)
                r0.resources = r2
                return
        }

        void cancel(io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r2, io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3) {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                r2.clear()
                r3.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r3 = this;
                boolean r0 = r3.cancelled
                if (r0 != 0) goto L23
                r0 = 1
                r3.cancelled = r0
                io.reactivex.internal.disposables.ArrayCompositeDisposable r1 = r3.resources
                r1.dispose()
                int r1 = r3.getAndIncrement()
                if (r1 != 0) goto L23
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver<T>[] r1 = r3.observers
                r2 = 0
                r2 = r1[r2]
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r2 = r2.queue
                r2.clear()
                r0 = r1[r0]
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r0.queue
                r0.clear()
            L23:
                return
        }

        void drain() {
                r12 = this;
                int r0 = r12.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver<T>[] r0 = r12.observers
                r1 = 0
                r2 = r0[r1]
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r3 = r2.queue
                r4 = 1
                r0 = r0[r4]
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r5 = r0.queue
                r6 = r4
            L14:
                boolean r7 = r12.cancelled
                if (r7 == 0) goto L1f
                r3.clear()
                r5.clear()
                return
            L1f:
                boolean r7 = r2.done
                if (r7 == 0) goto L30
                java.lang.Throwable r8 = r2.error
                if (r8 == 0) goto L30
                r12.cancel(r3, r5)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r12.actual
                r0.onError(r8)
                return
            L30:
                boolean r8 = r0.done
                if (r8 == 0) goto L41
                java.lang.Throwable r9 = r0.error
                if (r9 == 0) goto L41
                r12.cancel(r3, r5)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r12.actual
                r0.onError(r9)
                return
            L41:
                T r9 = r12.f442v1
                if (r9 != 0) goto L4b
                java.lang.Object r9 = r3.poll()
                r12.f442v1 = r9
            L4b:
                T r9 = r12.f442v1
                if (r9 != 0) goto L51
                r9 = r4
                goto L52
            L51:
                r9 = r1
            L52:
                T r10 = r12.f443v2
                if (r10 != 0) goto L5c
                java.lang.Object r10 = r5.poll()
                r12.f443v2 = r10
            L5c:
                T r10 = r12.f443v2
                if (r10 != 0) goto L62
                r11 = r4
                goto L63
            L62:
                r11 = r1
            L63:
                if (r7 == 0) goto L75
                if (r8 == 0) goto L75
                if (r9 == 0) goto L75
                if (r11 == 0) goto L75
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r12.actual
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
                r0.onSuccess(r1)
                return
            L75:
                if (r7 == 0) goto L88
                if (r8 == 0) goto L88
                if (r9 == r11) goto L88
                r12.cancel(r3, r5)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r12.actual
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.onSuccess(r1)
                return
            L88:
                if (r9 != 0) goto Lb6
                if (r11 != 0) goto Lb6
                io.reactivex.functions.BiPredicate<? super T, ? super T> r7 = r12.comparer     // Catch: java.lang.Throwable -> La9
                T r8 = r12.f442v1     // Catch: java.lang.Throwable -> La9
                boolean r7 = r7.test(r8, r10)     // Catch: java.lang.Throwable -> La9
                if (r7 != 0) goto La3
                r12.cancel(r3, r5)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r12.actual
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                r0.onSuccess(r1)
                return
            La3:
                r7 = 0
                r12.f442v1 = r7
                r12.f443v2 = r7
                goto Lb6
            La9:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r12.cancel(r3, r5)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r1 = r12.actual
                r1.onError(r0)
                return
            Lb6:
                if (r9 != 0) goto Lba
                if (r11 == 0) goto L14
            Lba:
                int r6 = -r6
                int r6 = r12.addAndGet(r6)
                if (r6 != 0) goto L14
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        boolean setDisposable(io.reactivex.disposables.Disposable r2, int r3) {
                r1 = this;
                io.reactivex.internal.disposables.ArrayCompositeDisposable r0 = r1.resources
                boolean r2 = r0.setResource(r3, r2)
                return r2
        }

        void subscribe() {
                r3 = this;
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualObserver<T>[] r0 = r3.observers
                io.reactivex.ObservableSource<? extends T> r1 = r3.first
                r2 = 0
                r2 = r0[r2]
                r1.subscribe(r2)
                io.reactivex.ObservableSource<? extends T> r1 = r3.second
                r2 = 1
                r0 = r0[r2]
                r1.subscribe(r0)
                return
        }
    }

    static final class EqualObserver<T> implements io.reactivex.Observer<T> {
        volatile boolean done;
        java.lang.Throwable error;
        final int index;
        final io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> parent;
        final io.reactivex.internal.queue.SpscLinkedArrayQueue<T> queue;

        EqualObserver(io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle.EqualCoordinator<T> r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.index = r2
                io.reactivex.internal.queue.SpscLinkedArrayQueue r1 = new io.reactivex.internal.queue.SpscLinkedArrayQueue
                r1.<init>(r3)
                r0.queue = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r1 = this;
                r0 = 1
                r1.done = r0
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator<T> r0 = r1.parent
                r0.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r1) {
                r0 = this;
                r0.error = r1
                r1 = 1
                r0.done = r1
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator<T> r1 = r0.parent
                r1.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r2) {
                r1 = this;
                io.reactivex.internal.queue.SpscLinkedArrayQueue<T> r0 = r1.queue
                r0.offer(r2)
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator<T> r2 = r1.parent
                r2.drain()
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r3) {
                r2 = this;
                io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator<T> r0 = r2.parent
                int r1 = r2.index
                r0.setDisposable(r3, r1)
                return
        }
    }

    public ObservableSequenceEqualSingle(io.reactivex.ObservableSource<? extends T> r1, io.reactivex.ObservableSource<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            r0.comparer = r3
            r0.bufferSize = r4
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToObservable
    public io.reactivex.Observable<java.lang.Boolean> fuseToObservable() {
            r5 = this;
            io.reactivex.internal.operators.observable.ObservableSequenceEqual r0 = new io.reactivex.internal.operators.observable.ObservableSequenceEqual
            io.reactivex.ObservableSource<? extends T> r1 = r5.first
            io.reactivex.ObservableSource<? extends T> r2 = r5.second
            io.reactivex.functions.BiPredicate<? super T, ? super T> r3 = r5.comparer
            int r4 = r5.bufferSize
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Observable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r8) {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator r6 = new io.reactivex.internal.operators.observable.ObservableSequenceEqualSingle$EqualCoordinator
            int r2 = r7.bufferSize
            io.reactivex.ObservableSource<? extends T> r3 = r7.first
            io.reactivex.ObservableSource<? extends T> r4 = r7.second
            io.reactivex.functions.BiPredicate<? super T, ? super T> r5 = r7.comparer
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r8.onSubscribe(r6)
            r6.subscribe()
            return
    }
}
