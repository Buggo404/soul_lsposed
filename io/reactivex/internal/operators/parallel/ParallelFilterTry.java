package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelFilterTry<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
    final io.reactivex.functions.Predicate<? super T> predicate;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    /* renamed from: io.reactivex.internal.operators.parallel.ParallelFilterTry$1 */
    static /* synthetic */ class C09581 {
        static final /* synthetic */ int[] $SwitchMap$io$reactivex$parallel$ParallelFailureHandling = null;

        static {
                io.reactivex.parallel.ParallelFailureHandling[] r0 = io.reactivex.parallel.ParallelFailureHandling.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.reactivex.internal.operators.parallel.ParallelFilterTry.C09581.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling = r0
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.RETRY     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C09581.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling     // Catch: java.lang.NoSuchFieldError -> L1d
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.SKIP     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C09581.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling     // Catch: java.lang.NoSuchFieldError -> L28
                io.reactivex.parallel.ParallelFailureHandling r1 = io.reactivex.parallel.ParallelFailureHandling.STOP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }
    }

    static abstract class BaseFilterSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> errorHandler;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        org.reactivestreams.Subscription f484s;

        BaseFilterSubscriber(io.reactivex.functions.Predicate<? super T> r1, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r2) {
                r0 = this;
                r0.<init>()
                r0.predicate = r1
                r0.errorHandler = r2
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f484s
                r0.cancel()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public final void onNext(T r3) {
                r2 = this;
                boolean r3 = r2.tryOnNext(r3)
                if (r3 != 0) goto L11
                boolean r3 = r2.done
                if (r3 != 0) goto L11
                org.reactivestreams.Subscription r3 = r2.f484s
                r0 = 1
                r3.request(r0)
            L11:
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f484s
                r0.request(r2)
                return
        }
    }

    static final class ParallelFilterConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;

        ParallelFilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f484s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f484s = r2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r10) {
                r9 = this;
                boolean r0 = r9.done
                r1 = 0
                if (r0 != 0) goto L66
                r2 = 0
            L7:
                r0 = 1
                io.reactivex.functions.Predicate<? super T> r4 = r9.predicate     // Catch: java.lang.Throwable -> L1a
                boolean r2 = r4.test(r10)     // Catch: java.lang.Throwable -> L1a
                if (r2 == 0) goto L19
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r9.actual
                boolean r10 = r2.tryOnNext(r10)
                if (r10 == 0) goto L19
                r1 = r0
            L19:
                return r1
            L1a:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r5 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L51
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L51
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L51
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L51
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L51
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C09581.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L7
                if (r6 == r5) goto L50
                r10 = 3
                if (r6 == r10) goto L4a
                r9.cancel()
                r9.onError(r4)
                return r1
            L4a:
                r9.cancel()
                r9.onComplete()
            L50:
                return r1
            L51:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r10
                r2.<init>(r3)
                r9.onError(r2)
            L66:
                return r1
        }
    }

    static final class ParallelFilterSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilterTry.BaseFilterSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> actual;

        ParallelFilterSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.actual = r1
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 != 0) goto Lc
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super T> r0 = r1.actual
                r0.onComplete()
            Lc:
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

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f484s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f484s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r10) {
                r9 = this;
                boolean r0 = r9.done
                r1 = 0
                if (r0 != 0) goto L63
                r2 = 0
            L7:
                r0 = 1
                io.reactivex.functions.Predicate<? super T> r4 = r9.predicate     // Catch: java.lang.Throwable -> L17
                boolean r2 = r4.test(r10)     // Catch: java.lang.Throwable -> L17
                if (r2 == 0) goto L16
                org.reactivestreams.Subscriber<? super T> r1 = r9.actual
                r1.onNext(r10)
                return r0
            L16:
                return r1
            L17:
                r4 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r4)
                r5 = 2
                io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r9.errorHandler     // Catch: java.lang.Throwable -> L4e
                r7 = 1
                long r2 = r2 + r7
                java.lang.Long r7 = java.lang.Long.valueOf(r2)     // Catch: java.lang.Throwable -> L4e
                java.lang.Object r6 = r6.apply(r7, r4)     // Catch: java.lang.Throwable -> L4e
                java.lang.String r7 = "The errorHandler returned a null item"
                java.lang.Object r6 = io.reactivex.internal.functions.ObjectHelper.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L4e
                io.reactivex.parallel.ParallelFailureHandling r6 = (io.reactivex.parallel.ParallelFailureHandling) r6     // Catch: java.lang.Throwable -> L4e
                int[] r7 = io.reactivex.internal.operators.parallel.ParallelFilterTry.C09581.$SwitchMap$io$reactivex$parallel$ParallelFailureHandling
                int r6 = r6.ordinal()
                r6 = r7[r6]
                if (r6 == r0) goto L7
                if (r6 == r5) goto L4d
                r10 = 3
                if (r6 == r10) goto L47
                r9.cancel()
                r9.onError(r4)
                return r1
            L47:
                r9.cancel()
                r9.onComplete()
            L4d:
                return r1
            L4e:
                r10 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r10)
                r9.cancel()
                io.reactivex.exceptions.CompositeException r2 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r3 = new java.lang.Throwable[r5]
                r3[r1] = r4
                r3[r0] = r10
                r2.<init>(r3)
                r9.onError(r2)
            L63:
                return r1
        }
    }

    public ParallelFilterTry(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Predicate<? super T> r2, io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.predicate = r2
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
            io.reactivex.internal.operators.parallel.ParallelFilterTry$ParallelFilterConditionalSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelFilterTry$ParallelFilterConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r3 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r3
            io.reactivex.functions.Predicate<? super T> r5 = r7.predicate
            io.reactivex.functions.BiFunction<? super java.lang.Long, ? super java.lang.Throwable, io.reactivex.parallel.ParallelFailureHandling> r6 = r7.errorHandler
            r4.<init>(r3, r5, r6)
            r1[r2] = r4
            goto L2c
        L21:
            io.reactivex.internal.operators.parallel.ParallelFilterTry$ParallelFilterSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelFilterTry$ParallelFilterSubscriber
            io.reactivex.functions.Predicate<? super T> r5 = r7.predicate
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
