package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableDoOnEach<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.functions.Action onAfterTerminate;
    final io.reactivex.functions.Action onComplete;
    final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
    final io.reactivex.functions.Consumer<? super T> onNext;

    static final class DoOnEachConditionalSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachConditionalSubscriber(io.reactivex.internal.fuseable.ConditionalSubscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
                r0 = this;
                r0.<init>(r1)
                r0.onNext = r2
                r0.onError = r3
                r0.onComplete = r4
                r0.onAfterTerminate = r5
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L20
                r0.run()     // Catch: java.lang.Throwable -> L20
                r0 = 1
                r1.done = r0
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L18
                r0.run()     // Catch: java.lang.Throwable -> L18
                goto L1f
            L18:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L1f:
                return
            L20:
                r0 = move-exception
                r1.fail(r0)
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableConditionalSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                return
            L8:
                r0 = 1
                r6.done = r0
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r6.onError     // Catch: java.lang.Throwable -> L11
                r1.accept(r7)     // Catch: java.lang.Throwable -> L11
                goto L28
            L11:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
                r0 = r5
            L28:
                if (r0 == 0) goto L2f
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r6.actual
                r0.onError(r7)
            L2f:
                io.reactivex.functions.Action r7 = r6.onAfterTerminate     // Catch: java.lang.Throwable -> L35
                r7.run()     // Catch: java.lang.Throwable -> L35
                goto L3c
            L35:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
            L3c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 == 0) goto L10
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L1b
                r0.accept(r2)     // Catch: java.lang.Throwable -> L1b
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L1b:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r6 = this;
                r0 = 0
                r1 = 2
                r2 = 1
                io.reactivex.internal.fuseable.QueueSubscription<T> r3 = r6.f523qs     // Catch: java.lang.Throwable -> L47
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L47
                if (r3 == 0) goto L38
                io.reactivex.functions.Consumer<? super T> r4 = r6.onNext     // Catch: java.lang.Throwable -> L16
                r4.accept(r3)     // Catch: java.lang.Throwable -> L16
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
                goto L46
            L16:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)     // Catch: java.lang.Throwable -> L31
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L24
                r4.accept(r3)     // Catch: java.lang.Throwable -> L24
                java.lang.Exception r0 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)     // Catch: java.lang.Throwable -> L31
                throw r0     // Catch: java.lang.Throwable -> L31
            L24:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L31
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L31
                r1[r0] = r3     // Catch: java.lang.Throwable -> L31
                r1[r2] = r4     // Catch: java.lang.Throwable -> L31
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L31
                throw r5     // Catch: java.lang.Throwable -> L31
            L31:
                r0 = move-exception
                io.reactivex.functions.Action r1 = r6.onAfterTerminate
                r1.run()
                throw r0
            L38:
                int r0 = r6.sourceMode
                if (r0 != r2) goto L46
                io.reactivex.functions.Action r0 = r6.onComplete
                r0.run()
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
            L46:
                return r3
            L47:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L55
                r4.accept(r3)     // Catch: java.lang.Throwable -> L55
                java.lang.Exception r0 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)
                throw r0
            L55:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r1[r0] = r3
                r1[r2] = r4
                r5.<init>(r1)
                throw r5
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }

        @Override // io.reactivex.internal.fuseable.ConditionalSubscriber
        public boolean tryOnNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                r1 = 0
                if (r0 == 0) goto L6
                return r1
            L6:
                io.reactivex.functions.Consumer<? super T> r0 = r2.onNext     // Catch: java.lang.Throwable -> L12
                r0.accept(r3)     // Catch: java.lang.Throwable -> L12
                io.reactivex.internal.fuseable.ConditionalSubscriber<? super R> r0 = r2.actual
                boolean r3 = r0.tryOnNext(r3)
                return r3
            L12:
                r3 = move-exception
                r2.fail(r3)
                return r1
        }
    }

    static final class DoOnEachSubscriber<T> extends io.reactivex.internal.subscribers.BasicFuseableSubscriber<T, T> {
        final io.reactivex.functions.Action onAfterTerminate;
        final io.reactivex.functions.Action onComplete;
        final io.reactivex.functions.Consumer<? super java.lang.Throwable> onError;
        final io.reactivex.functions.Consumer<? super T> onNext;

        DoOnEachSubscriber(org.reactivestreams.Subscriber<? super T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
                r0 = this;
                r0.<init>(r1)
                r0.onNext = r2
                r0.onError = r3
                r0.onComplete = r4
                r0.onAfterTerminate = r5
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                io.reactivex.functions.Action r0 = r1.onComplete     // Catch: java.lang.Throwable -> L20
                r0.run()     // Catch: java.lang.Throwable -> L20
                r0 = 1
                r1.done = r0
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onComplete()
                io.reactivex.functions.Action r0 = r1.onAfterTerminate     // Catch: java.lang.Throwable -> L18
                r0.run()     // Catch: java.lang.Throwable -> L18
                goto L1f
            L18:
                r0 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r0)
                io.reactivex.plugins.RxJavaPlugins.onError(r0)
            L1f:
                return
            L20:
                r0 = move-exception
                r1.fail(r0)
                return
        }

        @Override // io.reactivex.internal.subscribers.BasicFuseableSubscriber, org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r7) {
                r6 = this;
                boolean r0 = r6.done
                if (r0 == 0) goto L8
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
                return
            L8:
                r0 = 1
                r6.done = r0
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r1 = r6.onError     // Catch: java.lang.Throwable -> L11
                r1.accept(r7)     // Catch: java.lang.Throwable -> L11
                goto L28
            L11:
                r1 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r1)
                org.reactivestreams.Subscriber<? super R> r2 = r6.actual
                io.reactivex.exceptions.CompositeException r3 = new io.reactivex.exceptions.CompositeException
                r4 = 2
                java.lang.Throwable[] r4 = new java.lang.Throwable[r4]
                r5 = 0
                r4[r5] = r7
                r4[r0] = r1
                r3.<init>(r4)
                r2.onError(r3)
                r0 = r5
            L28:
                if (r0 == 0) goto L2f
                org.reactivestreams.Subscriber<? super R> r0 = r6.actual
                r0.onError(r7)
            L2f:
                io.reactivex.functions.Action r7 = r6.onAfterTerminate     // Catch: java.lang.Throwable -> L35
                r7.run()     // Catch: java.lang.Throwable -> L35
                goto L3c
            L35:
                r7 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r7)
                io.reactivex.plugins.RxJavaPlugins.onError(r7)
            L3c:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r2) {
                r1 = this;
                boolean r0 = r1.done
                if (r0 == 0) goto L5
                return
            L5:
                int r0 = r1.sourceMode
                if (r0 == 0) goto L10
                org.reactivestreams.Subscriber<? super R> r2 = r1.actual
                r0 = 0
                r2.onNext(r0)
                return
            L10:
                io.reactivex.functions.Consumer<? super T> r0 = r1.onNext     // Catch: java.lang.Throwable -> L1b
                r0.accept(r2)     // Catch: java.lang.Throwable -> L1b
                org.reactivestreams.Subscriber<? super R> r0 = r1.actual
                r0.onNext(r2)
                return
            L1b:
                r2 = move-exception
                r1.fail(r2)
                return
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public T poll() throws java.lang.Exception {
                r6 = this;
                r0 = 0
                r1 = 2
                r2 = 1
                io.reactivex.internal.fuseable.QueueSubscription<T> r3 = r6.f525qs     // Catch: java.lang.Throwable -> L47
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L47
                if (r3 == 0) goto L38
                io.reactivex.functions.Consumer<? super T> r4 = r6.onNext     // Catch: java.lang.Throwable -> L16
                r4.accept(r3)     // Catch: java.lang.Throwable -> L16
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
                goto L46
            L16:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)     // Catch: java.lang.Throwable -> L31
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L24
                r4.accept(r3)     // Catch: java.lang.Throwable -> L24
                java.lang.Exception r0 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)     // Catch: java.lang.Throwable -> L31
                throw r0     // Catch: java.lang.Throwable -> L31
            L24:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException     // Catch: java.lang.Throwable -> L31
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]     // Catch: java.lang.Throwable -> L31
                r1[r0] = r3     // Catch: java.lang.Throwable -> L31
                r1[r2] = r4     // Catch: java.lang.Throwable -> L31
                r5.<init>(r1)     // Catch: java.lang.Throwable -> L31
                throw r5     // Catch: java.lang.Throwable -> L31
            L31:
                r0 = move-exception
                io.reactivex.functions.Action r1 = r6.onAfterTerminate
                r1.run()
                throw r0
            L38:
                int r0 = r6.sourceMode
                if (r0 != r2) goto L46
                io.reactivex.functions.Action r0 = r6.onComplete
                r0.run()
                io.reactivex.functions.Action r0 = r6.onAfterTerminate
                r0.run()
            L46:
                return r3
            L47:
                r3 = move-exception
                io.reactivex.exceptions.Exceptions.throwIfFatal(r3)
                io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r6.onError     // Catch: java.lang.Throwable -> L55
                r4.accept(r3)     // Catch: java.lang.Throwable -> L55
                java.lang.Exception r0 = io.reactivex.internal.util.ExceptionHelper.throwIfThrowable(r3)
                throw r0
            L55:
                r4 = move-exception
                io.reactivex.exceptions.CompositeException r5 = new io.reactivex.exceptions.CompositeException
                java.lang.Throwable[] r1 = new java.lang.Throwable[r1]
                r1[r0] = r3
                r1[r2] = r4
                r5.<init>(r1)
                throw r5
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int r1) {
                r0 = this;
                int r1 = r0.transitiveBoundaryFusion(r1)
                return r1
        }
    }

    public FlowableDoOnEach(io.reactivex.Flowable<T> r1, io.reactivex.functions.Consumer<? super T> r2, io.reactivex.functions.Consumer<? super java.lang.Throwable> r3, io.reactivex.functions.Action r4, io.reactivex.functions.Action r5) {
            r0 = this;
            r0.<init>(r1)
            r0.onNext = r2
            r0.onError = r3
            r0.onComplete = r4
            r0.onAfterTerminate = r5
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r9) {
            r8 = this;
            boolean r0 = r9 instanceof io.reactivex.internal.fuseable.ConditionalSubscriber
            if (r0 == 0) goto L1b
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachConditionalSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachConditionalSubscriber
            r2 = r9
            io.reactivex.internal.fuseable.ConditionalSubscriber r2 = (io.reactivex.internal.fuseable.ConditionalSubscriber) r2
            io.reactivex.functions.Consumer<? super T> r3 = r8.onNext
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r8.onError
            io.reactivex.functions.Action r5 = r8.onComplete
            io.reactivex.functions.Action r6 = r8.onAfterTerminate
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
            goto L2f
        L1b:
            io.reactivex.Flowable<T> r0 = r8.source
            io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachSubscriber r7 = new io.reactivex.internal.operators.flowable.FlowableDoOnEach$DoOnEachSubscriber
            io.reactivex.functions.Consumer<? super T> r3 = r8.onNext
            io.reactivex.functions.Consumer<? super java.lang.Throwable> r4 = r8.onError
            io.reactivex.functions.Action r5 = r8.onComplete
            io.reactivex.functions.Action r6 = r8.onAfterTerminate
            r1 = r7
            r2 = r9
            r1.<init>(r2, r3, r4, r5, r6)
            r0.subscribe(r7)
        L2f:
            return
    }
}
