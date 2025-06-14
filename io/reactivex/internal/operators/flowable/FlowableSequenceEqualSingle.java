package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableSequenceEqualSingle<T> extends io.reactivex.Single<java.lang.Boolean> implements io.reactivex.internal.fuseable.FuseToFlowable<java.lang.Boolean> {
    final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
    final org.reactivestreams.Publisher<? extends T> first;
    final int prefetch;
    final org.reactivestreams.Publisher<? extends T> second;

    static final class EqualCoordinator<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.disposables.Disposable, io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper {
        private static final long serialVersionUID = -6178010334400373240L;
        final io.reactivex.SingleObserver<? super java.lang.Boolean> actual;
        final io.reactivex.functions.BiPredicate<? super T, ? super T> comparer;
        final io.reactivex.internal.util.AtomicThrowable error;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> first;
        final io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualSubscriber<T> second;

        /* renamed from: v1 */
        T f294v1;

        /* renamed from: v2 */
        T f295v2;

        EqualCoordinator(io.reactivex.SingleObserver<? super java.lang.Boolean> r1, int r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.comparer = r3
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber
                r1.<init>(r0, r2)
                r0.first = r1
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber
                r1.<init>(r0, r2)
                r0.second = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                return
        }

        void cancelAndClear() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.clear()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.cancel()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.cancel()
                int r0 = r1.getAndIncrement()
                if (r0 != 0) goto L1a
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.second
                r0.clear()
            L1a:
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void drain() {
                r11 = this;
                int r0 = r11.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 1
                r1 = r0
            L9:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r2 = r11.first
                io.reactivex.internal.fuseable.SimpleQueue<T> r2 = r2.queue
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r3 = r11.second
                io.reactivex.internal.fuseable.SimpleQueue<T> r3 = r3.queue
                if (r2 == 0) goto L100
                if (r3 == 0) goto L100
            L15:
                boolean r4 = r11.isDisposed()
                if (r4 == 0) goto L26
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.second
                r0.clear()
                return
            L26:
                io.reactivex.internal.util.AtomicThrowable r4 = r11.error
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L3f
                r11.cancelAndClear()
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L3f:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.first
                boolean r4 = r4.done
                T r5 = r11.f294v1
                if (r5 != 0) goto L66
                java.lang.Object r5 = r2.poll()     // Catch: java.lang.Throwable -> L4e
                r11.f294v1 = r5
                goto L66
            L4e:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L66:
                r6 = 0
                if (r5 != 0) goto L6b
                r7 = r0
                goto L6c
            L6b:
                r7 = r6
            L6c:
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r8 = r11.second
                boolean r8 = r8.done
                T r9 = r11.f295v2
                if (r9 != 0) goto L93
                java.lang.Object r9 = r3.poll()     // Catch: java.lang.Throwable -> L7b
                r11.f295v2 = r9
                goto L93
            L7b:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L93:
                if (r9 != 0) goto L97
                r10 = r0
                goto L98
            L97:
                r10 = r6
            L98:
                if (r4 == 0) goto Laa
                if (r8 == 0) goto Laa
                if (r7 == 0) goto Laa
                if (r10 == 0) goto Laa
                io.reactivex.SingleObserver<? super java.lang.Boolean> r1 = r11.actual
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                r1.onSuccess(r0)
                return
            Laa:
                if (r4 == 0) goto Lbd
                if (r8 == 0) goto Lbd
                if (r7 == r10) goto Lbd
                r11.cancelAndClear()
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
                r0.onSuccess(r1)
                return
            Lbd:
                if (r7 != 0) goto L12a
                if (r10 == 0) goto Lc2
                goto L12a
            Lc2:
                io.reactivex.functions.BiPredicate<? super T, ? super T> r4 = r11.comparer     // Catch: java.lang.Throwable -> Le8
                boolean r4 = r4.test(r5, r9)     // Catch: java.lang.Throwable -> Le8
                if (r4 != 0) goto Ld7
                r11.cancelAndClear()
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
                r0.onSuccess(r1)
                return
            Ld7:
                r4 = 0
                r11.f294v1 = r4
                r11.f295v2 = r4
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.first
                r4.request()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r4 = r11.second
                r4.request()
                goto L15
            Le8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r11.cancelAndClear()
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                r1.addThrowable(r0)
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L100:
                boolean r2 = r11.isDisposed()
                if (r2 == 0) goto L111
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.first
                r0.clear()
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r11.second
                r0.clear()
                return
            L111:
                io.reactivex.internal.util.AtomicThrowable r2 = r11.error
                java.lang.Object r2 = r2.get()
                java.lang.Throwable r2 = (java.lang.Throwable) r2
                if (r2 == 0) goto L12a
                r11.cancelAndClear()
                io.reactivex.SingleObserver<? super java.lang.Boolean> r0 = r11.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r11.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                return
            L12a:
                int r1 = -r1
                int r1 = r11.addAndGet(r1)
                if (r1 != 0) goto L9
                return
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableSequenceEqual.EqualCoordinatorHelper
        public void innerError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto Lc
                r1.drain()
                goto Lf
            Lc:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Lf:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                java.lang.Object r0 = r0.get()
                org.reactivestreams.Subscription r0 = (org.reactivestreams.Subscription) r0
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.isCancelled(r0)
                return r0
        }

        void subscribe(org.reactivestreams.Publisher<? extends T> r2, org.reactivestreams.Publisher<? extends T> r3) {
                r1 = this;
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r0 = r1.first
                r2.subscribe(r0)
                io.reactivex.internal.operators.flowable.FlowableSequenceEqual$EqualSubscriber<T> r2 = r1.second
                r3.subscribe(r2)
                return
        }
    }

    public FlowableSequenceEqualSingle(org.reactivestreams.Publisher<? extends T> r1, org.reactivestreams.Publisher<? extends T> r2, io.reactivex.functions.BiPredicate<? super T, ? super T> r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.first = r1
            r0.second = r2
            r0.comparer = r3
            r0.prefetch = r4
            return
    }

    @Override // io.reactivex.internal.fuseable.FuseToFlowable
    public io.reactivex.Flowable<java.lang.Boolean> fuseToFlowable() {
            r5 = this;
            io.reactivex.internal.operators.flowable.FlowableSequenceEqual r0 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqual
            org.reactivestreams.Publisher<? extends T> r1 = r5.first
            org.reactivestreams.Publisher<? extends T> r2 = r5.second
            io.reactivex.functions.BiPredicate<? super T, ? super T> r3 = r5.comparer
            int r4 = r5.prefetch
            r0.<init>(r1, r2, r3, r4)
            io.reactivex.Flowable r0 = io.reactivex.plugins.RxJavaPlugins.onAssembly(r0)
            return r0
    }

    @Override // io.reactivex.Single
    public void subscribeActual(io.reactivex.SingleObserver<? super java.lang.Boolean> r4) {
            r3 = this;
            io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle$EqualCoordinator r0 = new io.reactivex.internal.operators.flowable.FlowableSequenceEqualSingle$EqualCoordinator
            int r1 = r3.prefetch
            io.reactivex.functions.BiPredicate<? super T, ? super T> r2 = r3.comparer
            r0.<init>(r4, r1, r2)
            r4.onSubscribe(r0)
            org.reactivestreams.Publisher<? extends T> r4 = r3.first
            org.reactivestreams.Publisher<? extends T> r1 = r3.second
            r0.subscribe(r4, r1)
            return
    }
}
