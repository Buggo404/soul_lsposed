package io.reactivex.internal.operators.parallel;

/* loaded from: classes.dex */
public final class ParallelFilter<T> extends io.reactivex.parallel.ParallelFlowable<T> {
    final io.reactivex.functions.Predicate<? super T> predicate;
    final io.reactivex.parallel.ParallelFlowable<T> source;

    static abstract class BaseFilterSubscriber<T> implements io.reactivex.internal.fuseable.ConditionalSubscriber<T>, org.reactivestreams.Subscription {
        boolean done;
        final io.reactivex.functions.Predicate<? super T> predicate;

        /* renamed from: s */
        org.reactivestreams.Subscription f483s;

        BaseFilterSubscriber(io.reactivex.functions.Predicate<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.predicate = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void cancel() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f483s
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
                org.reactivestreams.Subscription r3 = r2.f483s
                r0 = 1
                r3.request(r0)
            L11:
                return
        }

        @Override // org.reactivestreams.Subscription
        public final void request(long r2) {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f483s
                r0.request(r2)
                return
        }
    }

    static final class ParallelFilterConditionalSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber<T> {
        final io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> actual;

        ParallelFilterConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r2)
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
                org.reactivestreams.Subscription r0 = r1.f483s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f483s = r2
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                r1 = 0
                if (r0 != 0) goto L1e
                io.reactivex.functions.Predicate<? super T> r0 = r2.predicate     // Catch: java.lang.Throwable -> L14
                boolean r0 = r0.test(r3)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L1e
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r0 = r2.actual
                boolean r3 = r0.tryOnNext(r3)
                return r3
            L14:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                r2.onError(r3)
            L1e:
                return r1
        }
    }

    static final class ParallelFilterSubscriber<T> extends io.reactivex.internal.operators.parallel.ParallelFilter.BaseFilterSubscriber<T> {
        final org.reactivestreams.Subscriber<? super T> actual;

        ParallelFilterSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Predicate<? super T> r2) {
                r0 = this;
                r0.<init>(r2)
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
                org.reactivestreams.Subscription r0 = r1.f483s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
                if (r0 == 0) goto Lf
                r1.f483s = r2
                org.reactivestreams.Subscriber<? super T> r2 = r1.actual
                r2.onSubscribe(r1)
            Lf:
                return
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                r1 = 0
                if (r0 != 0) goto L1e
                io.reactivex.functions.Predicate<? super T> r0 = r2.predicate     // Catch: java.lang.Throwable -> L14
                boolean r0 = r0.test(r3)     // Catch: java.lang.Throwable -> L14
                if (r0 == 0) goto L1e
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                r0.onNext(r3)
                r3 = 1
                return r3
            L14:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                r2.cancel()
                r2.onError(r3)
            L1e:
                return r1
        }
    }

    public ParallelFilter(io.reactivex.parallel.ParallelFlowable<T> r1, io.reactivex.functions.Predicate<? super T> r2) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.predicate = r2
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
    public void subscribe(org.reactivestreams.Subscriber<? super T>[] r7) {
            r6 = this;
            boolean r0 = r6.validate(r7)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r7.length
            org.reactivestreams.Subscriber[] r1 = new org.reactivestreams.Subscriber[r0]
            r2 = 0
        Lb:
            if (r2 >= r0) goto L2b
            r3 = r7[r2]
            boolean r4 = r3 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r4 == 0) goto L1f
            io.reactivex.internal.operators.parallel.ParallelFilter$ParallelFilterConditionalSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelFilter$ParallelFilterConditionalSubscriber
            io.reactivex.internal.fuseable.ConditionalSubscriber r3 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r3
            io.reactivex.functions.Predicate<? super T> r5 = r6.predicate
            r4.<init>(r3, r5)
            r1[r2] = r4
            goto L28
        L1f:
            io.reactivex.internal.operators.parallel.ParallelFilter$ParallelFilterSubscriber r4 = new io.reactivex.internal.operators.parallel.ParallelFilter$ParallelFilterSubscriber
            io.reactivex.functions.Predicate<? super T> r5 = r6.predicate
            r4.<init>(r3, r5)
            r1[r2] = r4
        L28:
            int r2 = r2 + 1
            goto Lb
        L2b:
            io.reactivex.parallel.ParallelFlowable<T> r7 = r6.source
            r7.subscribe(r1)
            return
    }
}
