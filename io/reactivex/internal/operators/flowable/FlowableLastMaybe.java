package io.reactivex.internal.operators.flowable;

/* loaded from: classes.dex */
public final class FlowableLastMaybe<T> extends io.reactivex.Maybe<T> {
    final org.reactivestreams.Publisher<T> source;

    static final class LastSubscriber<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.MaybeObserver<? super T> actual;
        T item;

        /* renamed from: s */
        org.reactivestreams.Subscription f267s;

        LastSubscriber(io.reactivex.MaybeObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                org.reactivestreams.Subscription r0 = r1.f267s
                r0.cancel()
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f267s = r0
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f267s
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
                r2 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r2.f267s = r0
                T r0 = r2.item
                if (r0 == 0) goto L11
                r1 = 0
                r2.item = r1
                io.reactivex.MaybeObserver<? super T> r1 = r2.actual
                r1.onSuccess(r0)
                goto L16
            L11:
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onComplete()
            L16:
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onError(java.lang.Throwable r2) {
                r1 = this;
                io.reactivex.internal.subscriptions.SubscriptionHelper r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.CANCELLED
                r1.f267s = r0
                r0 = 0
                r1.item = r0
                io.reactivex.MaybeObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r1) {
                r0 = this;
                r0.item = r1
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f267s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f267s = r3
                io.reactivex.MaybeObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public FlowableLastMaybe(org.reactivestreams.Publisher<T> r1) {
            r0 = this;
            r0.<init>()
            r0.source = r1
            return
    }

    @Override // io.reactivex.Maybe
    protected void subscribeActual(io.reactivex.MaybeObserver<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<T> r0 = r2.source
            io.reactivex.internal.operators.flowable.FlowableLastMaybe$LastSubscriber r1 = new io.reactivex.internal.operators.flowable.FlowableLastMaybe$LastSubscriber
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
