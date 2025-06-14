package io.reactivex.internal.operators.completable;

/* loaded from: classes.dex */
public final class CompletableFromPublisher<T> extends io.reactivex.Completable {
    final org.reactivestreams.Publisher<T> flowable;

    static final class FromPublisherSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {

        /* renamed from: cs */
        final io.reactivex.CompletableObserver f202cs;

        /* renamed from: s */
        org.reactivestreams.Subscription f203s;

        FromPublisherSubscriber(io.reactivex.CompletableObserver r1) {
                r0 = this;
                r0.<init>()
                r0.f202cs = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f203s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f203s = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f203s
                io.reactivex.internal.subscriptions.SubscriptionHelper r1 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                if (r0 != r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f202cs
                r0.onComplete()
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.CompletableObserver r0 = r1.f202cs
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r1) {
                r0 = this;
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f203s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f203s = r3
                io.reactivex.CompletableObserver r0 = r2.f202cs
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public CompletableFromPublisher(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>()
            r0.flowable = r1
            return
    }

    @Override // io.reactivex.Completable
    protected void subscribeActual(io.reactivex.CompletableObserver r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.flowable
            io.reactivex.internal.operators.completable.CompletableFromPublisher$FromPublisherSubscriber r1 = new io.reactivex.internal.operators.completable.CompletableFromPublisher$FromPublisherSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
