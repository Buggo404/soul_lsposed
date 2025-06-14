package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableMergeWithCompletable<T> extends io.reactivex.internal.operators.flowable.AbstractFlowableWithUpstream<T, T> {
    final io.reactivex.CompletableSource other;

    static final class MergeWithSubscriber<T> extends java.util.concurrent.atomic.AtomicInteger implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
        private static final long serialVersionUID = -4592979584110982903L;
        final org.reactivestreams.Subscriber<? super T> actual;
        final io.reactivex.internal.util.AtomicThrowable error;
        volatile boolean mainDone;
        final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> mainSubscription;
        volatile boolean otherDone;
        final io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber.OtherObserver otherObserver;
        final java.util.concurrent.atomic.AtomicLong requested;

        static final class OtherObserver extends java.util.concurrent.atomic.AtomicReference<io.reactivex.disposables.Disposable> implements io.reactivex.CompletableObserver {
            private static final long serialVersionUID = -2935427570954647017L;
            final io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> parent;

            OtherObserver(io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable.MergeWithSubscriber<?> r1) {
                    r0 = this;
                    r0.<init>()
                    r0.parent = r1
                    return
            }

            @Override // io.reactivex.CompletableObserver, io.reactivex.MaybeObserver
            public void onComplete() {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber<?> r0 = r1.parent
                    r0.otherComplete()
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onError(java.lang.Throwable r2) {
                    r1 = this;
                    io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber<?> r0 = r1.parent
                    r0.otherError(r2)
                    return
            }

            @Override // io.reactivex.CompletableObserver
            public void onSubscribe(io.reactivex.disposables.Disposable r1) {
                    r0 = this;
                    io.reactivex.internal.disposables.DisposableHelper.setOnce(r0, r1)
                    return
            }
        }

        MergeWithSubscriber(org.reactivestreams.Subscriber<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                java.util.concurrent.atomic.AtomicReference r1 = new java.util.concurrent.atomic.AtomicReference
                r1.<init>()
                r0.mainSubscription = r1
                io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver r1 = new io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver
                r1.<init>(r0)
                r0.otherObserver = r1
                io.reactivex.internal.util.AtomicThrowable r1 = new io.reactivex.internal.util.AtomicThrowable
                r1.<init>()
                r0.error = r1
                java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
                r1.<init>()
                r0.requested = r1
                return
        }

        @Override // org.reactivestreams.Subscription
        public void cancel() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r1.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver r0 = r1.otherObserver
                io.reactivex.internal.disposables.DisposableHelper.dispose(r0)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r2 = this;
                r0 = 1
                r2.mainDone = r0
                boolean r0 = r2.otherDone
                if (r0 == 0) goto Le
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            Le:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onNext(r0, r3, r2, r1)
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.mainSubscription
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredSetOnce(r0, r1, r3)
                return
        }

        void otherComplete() {
                r2 = this;
                r0 = 1
                r2.otherDone = r0
                boolean r0 = r2.mainDone
                if (r0 == 0) goto Le
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onComplete(r0, r2, r1)
            Le:
                return
        }

        void otherError(java.lang.Throwable r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.mainSubscription
                io.reactivex.internal.subscriptions.SubscriptionHelper.cancel(r0)
                org.reactivestreams.Subscriber<? super T> r0 = r2.actual
                io.reactivex.internal.util.AtomicThrowable r1 = r2.error
                io.reactivex.internal.util.HalfSerializer.onError(r0, r3, r2, r1)
                return
        }

        @Override // org.reactivestreams.Subscription
        public void request(long r3) {
                r2 = this;
                java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r2.mainSubscription
                java.util.concurrent.atomic.AtomicLong r1 = r2.requested
                io.reactivex.internal.subscriptions.SubscriptionHelper.deferredRequest(r0, r1, r3)
                return
        }
    }

    public FlowableMergeWithCompletable(io.reactivex.Flowable<T> r1, io.reactivex.CompletableSource r2) {
            r0 = this;
            r0.<init>(r1)
            r0.other = r2
            return
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(org.reactivestreams.Subscriber<? super T> r2) {
            r1 = this;
            io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber r0 = new io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber
            r0.<init>(r2)
            r2.onSubscribe(r0)
            io.reactivex.Flowable<T> r2 = r1.source
            r2.subscribe(r0)
            io.reactivex.CompletableSource r2 = r1.other
            io.reactivex.internal.operators.flowable.FlowableMergeWithCompletable$MergeWithSubscriber$OtherObserver r0 = r0.otherObserver
            r2.subscribe(r0)
            return
    }
}
