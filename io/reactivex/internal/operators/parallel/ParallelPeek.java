package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelPeek<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.Consumer<? super T> onAfterNext;
    final io.reactivex.functions.Action onAfterTerminated;
    final io.reactivex.functions.Action onCancel;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.functions.LongConsumer onRequest;
    final io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> onSubscribe;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    static final class ParallelPeekSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final io.reactivex.internal.operators.parallel.ParallelPeek<T> parent;

        /* renamed from: s */
        org.reactivestreams.Subscription f492s;

        ParallelPeekSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.internal.operators.parallel.ParallelPeek<T> r2) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.parent = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.Action r0 = r0.onCancel     // Catch: java.lang.Throwable -> L8
                r0.run()     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Lf:
                org.reactivestreams.Subscription r0 = r1.f492s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                boolean r0 = r2.done
                if (r0 != 0) goto L2c
                r0 = 1
                r2.done = r0
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r2.parent     // Catch: java.lang.Throwable -> L23
                io.reactivex.functions.Action r0 = r0.onComplete     // Catch: java.lang.Throwable -> L23
                r0.run()     // Catch: java.lang.Throwable -> L23
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onComplete()
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r2.parent     // Catch: java.lang.Throwable -> L1b
                io.reactivex.functions.Action r0 = r0.onAfterTerminated     // Catch: java.lang.Throwable -> L1b
                r0.run()     // Catch: java.lang.Throwable -> L1b
                goto L2c
            L1b:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
                goto L2c
            L23:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                org.reactivestreams.Subscriber<? super T> r1 = r2.actual
                r1.onError(r0)
            L2c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r6) {
                r5 = this;
                boolean r0 = r5.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
                return
            L8:
                r0 = 1
                r5.done = r0
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r1 = r5.parent     // Catch: java.lang.Throwable -> L13
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r1.onError     // Catch: java.lang.Throwable -> L13
                r1.accept(r6)     // Catch: java.lang.Throwable -> L13
                goto L25
            L13:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                r3 = 2
                java.lang.Throwable[] r3 = new java.lang.Throwable[r3]
                r4 = 0
                r3[r4] = r6
                r3[r0] = r1
                r2.<init>(r3)
                r6 = r2
            L25:
                org.reactivestreams.Subscriber<? super T> r0 = r5.actual
                r0.onError(r6)
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r6 = r5.parent     // Catch: java.lang.Throwable -> L32
                io.reactivex.functions.Action r6 = r6.onAfterTerminated     // Catch: java.lang.Throwable -> L32
                r6.run()     // Catch: java.lang.Throwable -> L32
                goto L39
            L32:
                r6 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r6)
                io.reactivex.plugins.RxJavaPlugins.onError(r6)
            L39:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto L27
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L20
                io.reactivex.functions.Consumer<? super T> r0 = r0.onNext     // Catch: java.lang.Throwable -> L20
                r0.accept(r2)     // Catch: java.lang.Throwable -> L20
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onNext(r2)
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L18
                io.reactivex.functions.Consumer<? super T> r0 = r0.onAfterNext     // Catch: java.lang.Throwable -> L18
                r0.accept(r2)     // Catch: java.lang.Throwable -> L18
                goto L27
            L18:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.onError(r2)
                goto L27
            L20:
                r2 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r2)
                r1.onError(r2)
            L27:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f492s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L28
                r2.f492s = r3
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r2.parent     // Catch: java.lang.Throwable -> L17
                io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r0 = r0.onSubscribe     // Catch: java.lang.Throwable -> L17
                r0.accept(r3)     // Catch: java.lang.Throwable -> L17
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                r3.onSubscribe(r2)
                goto L28
            L17:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r3.cancel()
                org.reactivestreams.Subscriber<? super T> r3 = r2.actual
                io.reactivex.internal.subscriptions.EmptySubscription r1 = io.reactivex.internal.subscriptions.EmptySubscription.INSTANCE
                r3.onSubscribe(r1)
                r2.onError(r0)
            L28:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                io.reactivex.internal.operators.parallel.ParallelPeek<T> r0 = r1.parent     // Catch: java.lang.Throwable -> L8
                io.reactivex.functions.LongConsumer r0 = r0.onRequest     // Catch: java.lang.Throwable -> L8
                r0.accept(r2)     // Catch: java.lang.Throwable -> L8
                goto Lf
            L8:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            Lf:
                org.reactivestreams.Subscription r0 = r1.f492s
                r0.request(r2)
                return
        }
    }

    public ParallelPeek(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super T> r3, io.reactivex.functions.Consumer<? super java.lang.Throwable> r4, io.reactivex.functions.Action r5, io.reactivex.functions.Action r6, io.reactivex.functions.Consumer<? super org.reactivestreams.Subscription> r7, io.reactivex.functions.LongConsumer r8, io.reactivex.functions.Action r9) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            java.lang.String r1 = "onNext is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r2, r1)
            io.reactivex.functions.Consumer r1 = (io.reactivex.functions.Consumer) r1
            r0.onNext = r1
            java.lang.String r1 = "onAfterNext is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r3, r1)
            io.reactivex.functions.Consumer r1 = (io.reactivex.functions.Consumer) r1
            r0.onAfterNext = r1
            java.lang.String r1 = "onError is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r4, r1)
            io.reactivex.functions.Consumer r1 = (io.reactivex.functions.Consumer) r1
            r0.onError = r1
            java.lang.String r1 = "onComplete is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r1)
            io.reactivex.functions.Action r1 = (io.reactivex.functions.Action) r1
            r0.onComplete = r1
            java.lang.String r1 = "onAfterTerminated is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r1)
            io.reactivex.functions.Action r1 = (io.reactivex.functions.Action) r1
            r0.onAfterTerminated = r1
            java.lang.String r1 = "onSubscribe is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r7, r1)
            io.reactivex.functions.Consumer r1 = (io.reactivex.functions.Consumer) r1
            r0.onSubscribe = r1
            java.lang.String r1 = "onRequest is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r8, r1)
            io.reactivex.functions.LongConsumer r1 = (io.reactivex.functions.LongConsumer) r1
            r0.onRequest = r1
            java.lang.String r1 = "onCancel is null"
            java.lang.Object r1 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r9, r1)
            io.reactivex.functions.Action r1 = (io.reactivex.functions.Action) r1
            r0.onCancel = r1
            return
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
            r1 = this;
            io.reactivex.parallel.ParallelFlowable<T> r0 = r1.source
            int r0 = r0.parallelism()
            return r0
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r6) {
            r5 = this;
            boolean r0 = r5.validate(r6)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r6.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L19
            io.reactivex.internal.operators.parallel.ParallelPeek$ParallelPeekSubscriber r3 = new io.reactivex.internal.operators.parallel.ParallelPeek$ParallelPeekSubscriber
            r4 = r6[r2]
            r3.<init>(r4, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lb
        L19:
            io.reactivex.parallel.ParallelFlowable<T> r6 = r5.source
            r6.subscribe(r1)
            return
    }
}
