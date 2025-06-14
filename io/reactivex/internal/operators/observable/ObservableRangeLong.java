package io.reactivex.internal.operators.observable;

/* loaded from: classes.dex */
public final class ObservableRangeLong extends io.reactivex.Observable<java.lang.Long> {
    private final long count;
    private final long start;

    static final class RangeDisposable extends io.reactivex.internal.observers.BasicIntQueueDisposable<java.lang.Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final io.reactivex.Observer<? super java.lang.Long> actual;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(io.reactivex.Observer<? super java.lang.Long> r1, long r2, long r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.index = r2
                r0.end = r4
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
                r2 = this;
                long r0 = r2.end
                r2.index = r0
                r0 = 1
                r2.lazySet(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.set(r0)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                int r0 = r1.get()
                if (r0 == 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
                r4 = this;
                long r0 = r4.index
                long r2 = r4.end
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto La
                r0 = 1
                goto Lb
            La:
                r0 = 0
            Lb:
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public java.lang.Long poll() throws java.lang.Exception {
                r4 = this;
                long r0 = r4.index
                long r2 = r4.end
                int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r2 == 0) goto L12
                r2 = 1
                long r2 = r2 + r0
                r4.index = r2
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                return r0
            L12:
                r0 = 1
                r4.lazySet(r0)
                r0 = 0
                return r0
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public /* bridge */ /* synthetic */ java.lang.Object poll() throws java.lang.Exception {
                r1 = this;
                java.lang.Long r0 = r1.poll()
                return r0
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r2) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r1.fused = r0
                return r0
            L7:
                r2 = 0
                return r2
        }

        void run() {
                r7 = this;
                boolean r0 = r7.fused
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.Observer<? super java.lang.Long> r0 = r7.actual
                long r1 = r7.end
                long r3 = r7.index
            Lb:
                int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
                if (r5 == 0) goto L20
                int r5 = r7.get()
                if (r5 != 0) goto L20
                java.lang.Long r5 = java.lang.Long.valueOf(r3)
                r0.onNext(r5)
                r5 = 1
                long r3 = r3 + r5
                goto Lb
            L20:
                int r1 = r7.get()
                if (r1 != 0) goto L2d
                r1 = 1
                r7.lazySet(r1)
                r0.onComplete()
            L2d:
                return
        }
    }

    public ObservableRangeLong(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.start = r1
            r0.count = r3
            return
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(io.reactivex.Observer<? super java.lang.Long> r8) {
            r7 = this;
            io.reactivex.internal.operators.observable.ObservableRangeLong$RangeDisposable r6 = new io.reactivex.internal.operators.observable.ObservableRangeLong$RangeDisposable
            long r2 = r7.start
            long r0 = r7.count
            long r4 = r2 + r0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r4)
            r8.onSubscribe(r6)
            r6.run()
            return
    }
}
