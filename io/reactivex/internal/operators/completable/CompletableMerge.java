package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableMerge extends io.reactivex.Completable {
    final boolean delayErrors;
    final int maxConcurrency;
    final org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> source;

    static final class CompletableMergeSubscriber extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<io.reactivex.CompletableSource>, io.reactivex.disposables.Disposable {
        private static final long serialVersionUID = -2108443387387077490L;
        final io.reactivex.CompletableObserver actual;
        final boolean delayErrors;
        final io.reactivex.internal.util.AtomicThrowable error;
        final int maxConcurrency;

        /* renamed from: s */
        org.reactivestreams.Subscription f206s;
        final io.reactivex.disposables.CompositeDisposable set;

        final class MergeInnerObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver, io.reactivex.disposables.Disposable {
            private static final long serialVersionUID = 251330541679988317L;
            final /* synthetic */ io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber this$0;

            MergeInnerObserver(io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber r1) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>()
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                    return
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                    r1 = this;
                    java.lang.Object r0 = r1.get()
                    io.reactivex.disposables.Disposable r0 = (io.reactivex.disposables.Disposable) r0
                    boolean r0 = io.reactivex.internal.disposables.DisposableHelper.isDisposed(r0)
                    return r0
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber r0 = r1.this$0
                    r0.innerComplete(r1)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber r0 = r1.this$0
                    r0.innerError(r1, r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        CompletableMergeSubscriber(io.reactivex.CompletableObserver r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                r0.maxConcurrency = r2
                r0.delayErrors = r3
                io.reactivex.disposables.CompositeDisposable r1 = new io.reactivex.disposables.CompositeDisposable
                r1.<init>()
                r0.set = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                r1 = 1
                r0.lazySet(r1)
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f206s
                r0.cancel()
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                return
        }

        void innerComplete(io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver r3) {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.delete(r3)
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L21
                io.reactivex.internal.util.AtomicThrowable r3 = r2.error
                java.lang.Object r3 = r3.get()
                java.lang.Throwable r3 = (java.lang.Throwable) r3
                if (r3 == 0) goto L1b
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onError(r3)
                goto L2f
            L1b:
                io.reactivex.CompletableObserver r3 = r2.actual
                r3.onComplete()
                goto L2f
            L21:
                int r3 = r2.maxConcurrency
                r0 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r0) goto L2f
                org.reactivestreams.Subscription r3 = r2.f206s
                r0 = 1
                r3.request(r0)
            L2f:
                return
        }

        void innerError(io.reactivex.internal.operators.completable.CompletableMerge.CompletableMergeSubscriber.MergeInnerObserver r3, java.lang.Throwable r4) {
                r2 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r2.set
                r0.delete(r3)
                boolean r3 = r2.delayErrors
                if (r3 != 0) goto L32
                org.reactivestreams.Subscription r3 = r2.f206s
                r3.cancel()
                io.reactivex.disposables.CompositeDisposable r3 = r2.set
                r3.dispose()
                io.reactivex.internal.util.AtomicThrowable r3 = r2.error
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L2e
                r3 = 0
                int r3 = r2.getAndSet(r3)
                if (r3 <= 0) goto L5e
                io.reactivex.CompletableObserver r3 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r4 = r2.error
                java.lang.Throwable r4 = r4.terminate()
                r3.onError(r4)
                goto L5e
            L2e:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
                goto L5e
            L32:
                io.reactivex.internal.util.AtomicThrowable r3 = r2.error
                boolean r3 = r3.addThrowable(r4)
                if (r3 == 0) goto L5b
                int r3 = r2.decrementAndGet()
                if (r3 != 0) goto L4c
                io.reactivex.CompletableObserver r3 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r4 = r2.error
                java.lang.Throwable r4 = r4.terminate()
                r3.onError(r4)
                goto L5e
            L4c:
                int r3 = r2.maxConcurrency
                r4 = 2147483647(0x7fffffff, float:NaN)
                if (r3 == r4) goto L5e
                org.reactivestreams.Subscription r3 = r2.f206s
                r0 = 1
                r3.request(r0)
                goto L5e
            L5b:
                io.reactivex.plugins.RxJavaPlugins.onError(r4)
            L5e:
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                boolean r0 = r0.isDisposed()
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                int r0 = r2.decrementAndGet()
                if (r0 != 0) goto L21
                io.reactivex.internal.util.AtomicThrowable r0 = r2.error
                java.lang.Object r0 = r0.get()
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                if (r0 == 0) goto L1c
                io.reactivex.CompletableObserver r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                java.lang.Throwable r1 = r1.terminate()
                r0.onError(r1)
                goto L21
            L1c:
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onComplete()
            L21:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                boolean r0 = r1.delayErrors
                if (r0 != 0) goto L28
                io.reactivex.disposables.CompositeDisposable r0 = r1.set
                r0.dispose()
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L24
                r2 = 0
                int r2 = r1.getAndSet(r2)
                if (r2 <= 0) goto L45
                io.reactivex.CompletableObserver r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                goto L45
            L24:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
                goto L45
            L28:
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                boolean r0 = r0.addThrowable(r2)
                if (r0 == 0) goto L42
                int r2 = r1.decrementAndGet()
                if (r2 != 0) goto L45
                io.reactivex.CompletableObserver r2 = r1.actual
                io.reactivex.internal.util.AtomicThrowable r0 = r1.error
                java.lang.Throwable r0 = r0.terminate()
                r2.onError(r0)
                goto L45
            L42:
                io.reactivex.plugins.RxJavaPlugins.onError(r2)
            L45:
                return
        }

        public void onNext(io.reactivex.CompletableSource r3) {
                r2 = this;
                r2.getAndIncrement()
                io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber$MergeInnerObserver r0 = new io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber$MergeInnerObserver
                r0.<init>(r2)
                io.reactivex.disposables.CompositeDisposable r1 = r2.set
                r1.add(r0)
                r3.subscribe(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public /* bridge */ /* synthetic */ void onNext(java.lang.Object r1) {
                r0 = this;
                io.reactivex.CompletableSource r1 = (io.reactivex.CompletableSource) r1
                r0.onNext(r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f206s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L23
                r2.f206s = r3
                io.reactivex.CompletableObserver r0 = r2.actual
                r0.onSubscribe(r2)
                int r0 = r2.maxConcurrency
                r1 = 2147483647(0x7fffffff, float:NaN)
                if (r0 != r1) goto L1f
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
                goto L23
            L1f:
                long r0 = (long) r0
                r3.request(r0)
            L23:
                return
        }
    }

    public CompletableMerge(org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            r0.maxConcurrency = r2
            r0.delayErrors = r3
            return
    }

    @Override // io.reactivex.Completable
    public void subscribeActual(io.reactivex.CompletableObserver r4) {
            r3 = this;
            io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber r0 = new io.reactivex.internal.operators.completable.CompletableMerge$CompletableMergeSubscriber
            int r1 = r3.maxConcurrency
            boolean r2 = r3.delayErrors
            r0.<init>(r4, r1, r2)
            org.reactivestreams.Publisher<? extends io.reactivex.CompletableSource> r4 = r3.source
            r4.subscribe(r0)
            return
    }
}
