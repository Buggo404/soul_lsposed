package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableWindow<T> extends io.reactivex.internal.operators.observable.AbstractObservableWithUpstream<T, io.reactivex.Observable<T>> {
    final int capacityHint;
    final long count;
    final long skip;

    static final class WindowExactObserver<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = -7481782523886138128L;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> actual;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f466s;
        long size;
        io.reactivex.subjects.UnicastSubject<T> window;

        WindowExactObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r1, long r2, int r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.count = r2
                r0.capacityHint = r4
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                io.reactivex.subjects.UnicastSubject<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onComplete()
            La:
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                io.reactivex.subjects.UnicastSubject<T> r0 = r2.window
                if (r0 == 0) goto La
                r1 = 0
                r2.window = r1
                r0.onError(r3)
            La:
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r6) {
                r5 = this;
                io.reactivex.subjects.UnicastSubject<T> r0 = r5.window
                if (r0 != 0) goto L15
                boolean r1 = r5.cancelled
                if (r1 != 0) goto L15
                int r0 = r5.capacityHint
                io.reactivex.subjects.UnicastSubject r0 = io.reactivex.subjects.UnicastSubject.create(r0, r5)
                r5.window = r0
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r1 = r5.actual
                r1.onNext(r0)
            L15:
                if (r0 == 0) goto L3a
                r0.onNext(r6)
                long r1 = r5.size
                r3 = 1
                long r1 = r1 + r3
                r5.size = r1
                long r3 = r5.count
                int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r6 < 0) goto L3a
                r1 = 0
                r5.size = r1
                r6 = 0
                r5.window = r6
                r0.onComplete()
                boolean r6 = r5.cancelled
                if (r6 == 0) goto L3a
                io.reactivex.disposables.Disposable r6 = r5.f466s
                r6.dispose()
            L3a:
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f466s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f466s = r2
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L9
                io.reactivex.disposables.Disposable r0 = r1.f466s
                r0.dispose()
            L9:
                return
        }
    }

    static final class WindowSkipObserver<T> extends java.util.concurrent.atomic.AtomicBoolean implements io.reactivex.Observer<T>, io.reactivex.disposables.Disposable, java.lang.Runnable {
        private static final long serialVersionUID = 3366976432059579510L;
        final io.reactivex.Observer<? super io.reactivex.Observable<T>> actual;
        volatile boolean cancelled;
        final int capacityHint;
        final long count;
        long firstEmission;
        long index;

        /* renamed from: s */
        io.reactivex.disposables.Disposable f467s;
        final long skip;
        final java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> windows;
        final java.util.concurrent.atomic.AtomicInteger wip;

        WindowSkipObserver(io.reactivex.Observer<? super io.reactivex.Observable<T>> r2, long r3, long r5, int r7) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
                r0.<init>()
                r1.wip = r0
                r1.actual = r2
                r1.count = r3
                r1.skip = r5
                r1.capacityHint = r7
                java.util.ArrayDeque r2 = new java.util.ArrayDeque
                r2.<init>()
                r1.windows = r2
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.cancelled = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.cancelled
                return r0
        }

        @Override // io.reactivex.Observer
        public void onComplete() {
                r2 = this;
                java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> r0 = r2.windows
            L2:
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L12
                java.lang.Object r1 = r0.poll()
                io.reactivex.subjects.UnicastSubject r1 = (io.reactivex.subjects.UnicastSubject) r1
                r1.onComplete()
                goto L2
            L12:
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r0 = r2.actual
                r0.onComplete()
                return
        }

        @Override // io.reactivex.Observer
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> r0 = r2.windows
            L2:
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L12
                java.lang.Object r1 = r0.poll()
                io.reactivex.subjects.UnicastSubject r1 = (io.reactivex.subjects.UnicastSubject) r1
                r1.onError(r3)
                goto L2
            L12:
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r0 = r2.actual
                r0.onError(r3)
                return
        }

        @Override // io.reactivex.Observer
        public void onNext(T r12) {
                r11 = this;
                java.util.ArrayDeque<io.reactivex.subjects.UnicastSubject<T>> r0 = r11.windows
                long r1 = r11.index
                long r3 = r11.skip
                long r5 = r1 % r3
                r7 = 0
                int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r5 != 0) goto L25
                boolean r5 = r11.cancelled
                if (r5 != 0) goto L25
                java.util.concurrent.atomic.AtomicInteger r5 = r11.wip
                r5.getAndIncrement()
                int r5 = r11.capacityHint
                io.reactivex.subjects.UnicastSubject r5 = io.reactivex.subjects.UnicastSubject.create(r5, r11)
                r0.offer(r5)
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r6 = r11.actual
                r6.onNext(r5)
            L25:
                long r5 = r11.firstEmission
                r7 = 1
                long r5 = r5 + r7
                java.util.Iterator r9 = r0.iterator()
            L2e:
                boolean r10 = r9.hasNext()
                if (r10 == 0) goto L3e
                java.lang.Object r10 = r9.next()
                io.reactivex.subjects.UnicastSubject r10 = (io.reactivex.subjects.UnicastSubject) r10
                r10.onNext(r12)
                goto L2e
            L3e:
                long r9 = r11.count
                int r12 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r12 < 0) goto L61
                java.lang.Object r12 = r0.poll()
                io.reactivex.subjects.UnicastSubject r12 = (io.reactivex.subjects.UnicastSubject) r12
                r12.onComplete()
                boolean r12 = r0.isEmpty()
                if (r12 == 0) goto L5d
                boolean r12 = r11.cancelled
                if (r12 == 0) goto L5d
                io.reactivex.disposables.Disposable r12 = r11.f467s
                r12.dispose()
                return
            L5d:
                long r5 = r5 - r3
                r11.firstEmission = r5
                goto L63
            L61:
                r11.firstEmission = r5
            L63:
                long r1 = r1 + r7
                r11.index = r1
                return
        }

        @Override // io.reactivex.Observer
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.Disposable r0 = r1.f467s
                boolean r0 = io.reactivex.internal.disposables.DisposableHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f467s = r2
                io.reactivex.Observer<? super io.reactivex.Observable<T>> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r1.wip
                int r0 = r0.decrementAndGet()
                if (r0 != 0) goto L11
                boolean r0 = r1.cancelled
                if (r0 == 0) goto L11
                io.reactivex.disposables.Disposable r0 = r1.f467s
                r0.dispose()
            L11:
                return
        }
    }

    public ObservableWindow(io.reactivex.ObservableSource<T> r1, long r2, long r4, int r6) {
            r0 = this;
            r0.<init>(r1)
            r0.count = r2
            r0.skip = r4
            r0.capacityHint = r6
            return
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(io.reactivex.Observer<? super io.reactivex.Observable<T>> r10) {
            r9 = this;
            long r0 = r9.count
            long r2 = r9.skip
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L17
            io.reactivex.ObservableSource<T> r0 = r9.source
            io.reactivex.internal.operators.observable.ObservableWindow$WindowExactObserver r1 = new io.reactivex.internal.operators.observable.ObservableWindow$WindowExactObserver
            long r2 = r9.count
            int r4 = r9.capacityHint
            r1.<init>(r10, r2, r4)
            r0.subscribe(r1)
            goto L29
        L17:
            io.reactivex.ObservableSource<T> r0 = r9.source
            io.reactivex.internal.operators.observable.ObservableWindow$WindowSkipObserver r8 = new io.reactivex.internal.operators.observable.ObservableWindow$WindowSkipObserver
            long r3 = r9.count
            long r5 = r9.skip
            int r7 = r9.capacityHint
            r1 = r8
            r2 = r10
            r1.<init>(r2, r3, r5, r7)
            r0.subscribe(r8)
        L29:
            return
    }
}
