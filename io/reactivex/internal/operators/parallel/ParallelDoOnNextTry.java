package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelDoOnNextTry<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
    final io.reactivex.functions.Consumer<? super T> onNext;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$1 */
    static /* synthetic */ class C09571 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$parallel$ParallelFailureHandling = null;

        static {
                io.reactivex.parallel.ParallelFailureHandling[] r0 = io.reactivex.parallel.ParallelFailureHandling.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C09571.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling = r0
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.RETRY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C09571.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.SKIP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C09571.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling     // Catch: java.lang.NoSuchFieldError -> L28
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.STOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static final class ParallelDoOnNextConditionalSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;
        boolean done;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Consumer<? super T> onNext;

        /* renamed from: s */
        org.reactivestreams.Subscription f481s;

        ParallelDoOnNextConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onNext = r2
                r0.errorHandler = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f481s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto L11
                boolean r3 = r2.done
                if (r3 != 0) goto L11
                org.reactivestreams.Subscription r3 = r2.f481s
                r0 = 1
                r3.request(r0)
            L11:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f481s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f481s = r2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f481s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r10) {
                r9 = this;
                boolean r0 = r9.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                r2 = 0
            L8:
                io.reactivex.functions.Consumer<? super T> r0 = r9.onNext     // Catch: java.lang.Throwable -> L14
                r0.accept(r10)     // Catch: java.lang.Throwable -> L14
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r9.actual
                boolean r10 = r0.tryOnNext(r10)
                return r10
            L14:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                r4 = 1
                r5 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L4c
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r6 = r6.apply(r7, r0)     // Catch: java.lang.Throwable -> L4c
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4c
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4c
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C09571.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r4) goto L8
                if (r6 == r5) goto L4b
                r10 = 3
                if (r6 == r10) goto L45
                r9.cancel()
                r9.onError(r0)
                return r1
            L45:
                r9.cancel()
                r9.onComplete()
            L4b:
                return r1
            L4c:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r0
                r3[r4] = r10
                r2.<init>(r3)
                r9.onError(r2)
                return r1
        }
    }

    static final class ParallelDoOnNextSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        final org.reactivestreams.Subscriber<? super T> actual;
        boolean done;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Consumer<? super T> onNext;

        /* renamed from: s */
        org.reactivestreams.Subscription f482s;

        ParallelDoOnNextSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.onNext = r2
                r0.errorHandler = r3
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f482s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                return
            L8:
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto Ld
                org.reactivestreams.Subscription r3 = r2.f482s
                r0 = 1
                r3.request(r0)
            Ld:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f482s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f482s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f482s
                r0.request(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r10) {
                r9 = this;
                boolean r0 = r9.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                r2 = 0
            L8:
                r0 = 1
                io.reactivex.functions.Consumer<? super T> r4 = r9.onNext     // Catch: java.lang.Throwable -> L14
                r4.accept(r10)     // Catch: java.lang.Throwable -> L14
                org.reactivestreams.Subscriber<? super T> r1 = r9.actual
                r1.onNext(r10)
                return r0
            L14:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r5 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L4b
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4b
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L4b
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4b
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4b
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelDoOnNextTry.C09571.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L8
                if (r6 == r5) goto L4a
                r10 = 3
                if (r6 == r10) goto L44
                r9.cancel()
                r9.onError(r4)
                return r1
            L44:
                r9.cancel()
                r9.onComplete()
            L4a:
                return r1
            L4b:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r10
                r2.<init>(r3)
                r9.onError(r2)
                return r1
        }
    }

    public ParallelDoOnNextTry(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.onNext = r2
            r0.errorHandler = r3
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
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r8) {
            r7 = this;
            boolean r0 = r7.validate(r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r8.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2f
            r3 = r8[r2]
            boolean r4 = r3 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r4 == 0) goto L21
            io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$ParallelDoOnNextConditionalSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$ParallelDoOnNextConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r3 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r3
            io.reactivex.functions.Consumer<? super T> r5 = r7.onNext
            io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r7.errorHandler
            r4.<init>(r3, r5, r6)
            r1[r2] = r4
            goto L2c
        L21:
            io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$ParallelDoOnNextSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelDoOnNextTry$ParallelDoOnNextSubscriber
            io.reactivex.functions.Consumer<? super T> r5 = r7.onNext
            io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r7.errorHandler
            r4.<init>(r3, r5, r6)
            r1[r2] = r4
        L2c:
            int r2 = r2 + 1
            goto Lb
        L2f:
            io.reactivex.parallel.ParallelFlowable<T> r8 = r7.source
            r8.subscribe(r1)
            return
    }
}
