package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableGenerate<T, S> extends io.reactivex.Flowable<T> {
    final io.reactivex.functions.Consumer<? super S> disposeState;
    final io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> generator;
    final java.util.concurrent.Callable<S> stateSupplier;

    static final class GeneratorSubscription<T, S> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.Emitter<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = 7565982551505011832L;
        final org.reactivestreams.Subscriber<? super T> actual;
        volatile boolean cancelled;
        final io.reactivex.functions.Consumer<? super S> disposeState;
        final io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> generator;
        boolean hasNext;
        S state;
        boolean terminate;

        GeneratorSubscription(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3, S r4) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.generator = r2
                r0.disposeState = r3
                r0.state = r4
                return
        }

        private void dispose(S r2) {
                r1 = this;
                io.reactivex.functions.Consumer<? super S> r0 = r1.disposeState     // Catch: java.lang.Throwable -> L6
                r0.accept(r2)     // Catch: java.lang.Throwable -> L6
                goto Ld
            L6:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            Ld:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r4 = this;
                boolean r0 = r4.cancelled
                if (r0 != 0) goto L1b
                r0 = 1
                r4.cancelled = r0
                r0 = 1
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r4, r0)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 != 0) goto L1b
                S r0 = r4.state
                r1 = 0
                r4.state = r1
                r4.dispose(r0)
            L1b:
                return
        }

        @Override // io.reactivex.Emitter
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 != 0) goto Lc
                r0 = 1
                r1.terminate = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
                return
        }

        @Override // io.reactivex.Emitter
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                goto L19
            L8:
                if (r2 != 0) goto L11
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onError called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
            L11:
                r0 = 1
                r1.terminate = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
            L19:
                return
        }

        @Override // io.reactivex.Emitter
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.terminate
                if (r0 != 0) goto L28
                boolean r0 = r1.hasNext
                if (r0 == 0) goto L13
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "onNext already called in this generate turn"
                r2.<init>(r0)
                r1.onError(r2)
                goto L28
            L13:
                if (r2 != 0) goto L20
                java.lang.NullPointerException r2 = new java.lang.NullPointerException
                java.lang.String r0 = "onNext called with null. Null values are generally not allowed in 2.x operators and sources."
                r2.<init>(r0)
                r1.onError(r2)
                goto L28
            L20:
                r0 = 1
                r1.hasNext = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
            L28:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r10) {
                r9 = this;
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r10)
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = io.reactivex.internal.util.BackpressureHelper.add(r9, r10)
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L12
                return
            L12:
                S r0 = r9.state
                io.reactivex.functions.BiFunction<S, ? super io.reactivex.Emitter<T>, S> r1 = r9.generator
            L16:
                r4 = r2
            L17:
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 == 0) goto L4d
                boolean r6 = r9.cancelled
                r7 = 0
                if (r6 == 0) goto L26
                r9.state = r7
                r9.dispose(r0)
                return
            L26:
                r6 = 0
                r9.hasNext = r6
                r6 = 1
                java.lang.Object r0 = r1.apply(r0, r9)     // Catch: java.lang.Throwable -> L3e
                boolean r8 = r9.terminate
                if (r8 == 0) goto L3a
                r9.cancelled = r6
                r9.state = r7
                r9.dispose(r0)
                return
            L3a:
                r6 = 1
                long r4 = r4 + r6
                goto L17
            L3e:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancelled = r6
                r9.state = r7
                r9.onError(r10)
                r9.dispose(r0)
                return
            L4d:
                long r10 = r9.get()
                int r6 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r6 != 0) goto L17
                r9.state = r0
                long r10 = -r4
                long r10 = r9.addAndGet(r10)
                int r4 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
                if (r4 != 0) goto L16
                return
        }
    }

    public FlowableGenerate(java.util.concurrent.Callable<S> r1, io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2, io.reactivex.functions.Consumer<? super S> r3) {
            r0 = this;
            r0.<init>()
            r0.stateSupplier = r1
            r0.generator = r2
            r0.disposeState = r3
            return
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(org.reactivestreams.Subscriber<? super T> r5) {
            r4 = this;
            java.util.concurrent.Callable<S> r0 = r4.stateSupplier     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Throwable -> L13
            io.reactivex.internal.operators.flowable.FlowableGenerate$GeneratorSubscription r1 = new io.reactivex.internal.operators.flowable.FlowableGenerate$GeneratorSubscription
            io.reactivex.functions.BiFunction<S, io.reactivex.Emitter<T>, S> r2 = r4.generator
            io.reactivex.functions.Consumer<? super S> r3 = r4.disposeState
            r1.<init>(r5, r2, r3, r0)
            r5.onSubscribe(r1)
            return
        L13:
            r0 = move-exception
            io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
            io.reactivex.internal.subscriptions.EmptySubscription.error(r0, r5)
            return
    }
}
