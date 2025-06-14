package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleEquals<T> extends io.reactivex.Single<java.lang.Boolean> {
    final io.reactivex.SingleSource<? extends T> first;
    final io.reactivex.SingleSource<? extends T> second;

    static class InnerObserver<T> implements io.reactivex.SingleObserver<T> {
        final java.util.concurrent.atomic.AtomicInteger count;
        final int index;

        /* renamed from: s */
        final io.reactivex.SingleObserver<? super java.lang.Boolean> f508s;
        final io.reactivex.disposables.CompositeDisposable set;
        final java.lang.Object[] values;

        InnerObserver(int r1, io.reactivex.disposables.CompositeDisposable r2, java.lang.Object[] r3, io.reactivex.SingleObserver<? super java.lang.Boolean> r4, java.util.concurrent.atomic.AtomicInteger r5) {
                r0 = this;
                r0.<init>()
                r0.index = r1
                r0.set = r2
                r0.values = r3
                r0.f508s = r4
                r0.count = r5
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onError(java.lang.Throwable r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicInteger r0 = r3.count
                int r0 = r0.get()
                r1 = 2
                if (r0 < r1) goto Ld
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                return
            Ld:
                java.util.concurrent.atomic.AtomicInteger r2 = r3.count
                boolean r0 = r2.compareAndSet(r0, r1)
                if (r0 == 0) goto L0
                io.reactivex.disposables.CompositeDisposable r0 = r3.set
                r0.dispose()
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r3.f508s
                r0.onError(r4)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSubscribe(io.reactivex.disposables.Disposable r2) {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.add(r2)
                return
        }

        @Override // io.reactivex.SingleObserver
        public void onSuccess(T r4) {
                r3 = this;
                java.lang.Object[] r0 = r3.values
                int r1 = r3.index
                r0[r1] = r4
                java.util.concurrent.atomic.AtomicInteger r4 = r3.count
                int r4 = r4.incrementAndGet()
                r0 = 2
                if (r4 != r0) goto L24
                io.reactivex.SingleObserver<? super java.lang.Boolean> r4 = r3.f508s
                java.lang.Object[] r0 = r3.values
                r1 = 0
                r1 = r0[r1]
                r2 = 1
                r0 = r0[r2]
                boolean r0 = io.reactivex.internal.functions.ObjectHelper.equals(r1, r0)
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r4.onSuccess(r0)
            L24:
                return
        }
    }

    public SingleEquals(io.reactivex.SingleSource<? extends T> r1, io.reactivex.SingleSource<? extends T> r2) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r12) {
            r11 = this;
            java.util.concurrent.atomic.AtomicInteger r6 = new java.util.concurrent.atomic.AtomicInteger
            r6.<init>()
            r0 = 2
            java.lang.Object[] r7 = new java.lang.Object[r0]
            r0 = 0
            r1 = 0
            r7[r0] = r1
            r0 = 1
            r7[r0] = r1
            io.reactivex.disposables.CompositeDisposable r8 = new io.reactivex.disposables.CompositeDisposable
            r8.<init>()
            r12.onSubscribe(r8)
            io.reactivex.SingleSource<? extends T> r9 = r11.first
            io.reactivex.internal.operators.single.SingleEquals$InnerObserver r10 = new io.reactivex.internal.operators.single.SingleEquals$InnerObserver
            r1 = 0
            r0 = r10
            r2 = r8
            r3 = r7
            r4 = r12
            r5 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            r9.subscribe(r10)
            io.reactivex.SingleSource<? extends T> r9 = r11.second
            io.reactivex.internal.operators.single.SingleEquals$InnerObserver r10 = new io.reactivex.internal.operators.single.SingleEquals$InnerObserver
            r1 = 1
            r0 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            r9.subscribe(r10)
            return
    }
}
