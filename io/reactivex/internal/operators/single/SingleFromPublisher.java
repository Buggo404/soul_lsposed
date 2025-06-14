package io.reactivex.internal.operators.single;

/* loaded from: classes.dex */
public final class SingleFromPublisher<T> extends io.reactivex.Single<T> {
    final org.reactivestreams.Publisher<? extends T> publisher;

    static final class ToSingleObserver<T> implements io.reactivex.FlowableSubscriber<T>, io.reactivex.disposables.Disposable {
        final io.reactivex.SingleObserver<? super T> actual;
        volatile boolean disposed;
        boolean done;

        /* renamed from: s */
        org.reactivestreams.Subscription f513s;
        T value;

        ToSingleObserver(io.reactivex.SingleObserver<? super T> r1) {
                r0 = this;
                r0.<init>()
                r0.actual = r1
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
                r1 = this;
                r0 = 1
                r1.disposed = r0
                org.reactivestreams.Subscription r0 = r1.f513s
                r0.cancel()
                return
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
                r1 = this;
                boolean r0 = r1.disposed
                return r0
        }

        @Override // org.reactivestreams.Subscriber
        public void onComplete() {
                r3 = this;
                boolean r0 = r3.done
                if (r0 == 0) goto L5
                return
            L5:
                r0 = 1
                r3.done = r0
                T r0 = r3.value
                r1 = 0
                r3.value = r1
                if (r0 != 0) goto L1c
                io.reactivex.SingleObserver<? super T> r0 = r3.actual
                java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
                java.lang.String r2 = "The source Publisher is empty"
                r1.<init>(r2)
                r0.onError(r1)
                goto L21
            L1c:
                io.reactivex.SingleObserver<? super T> r1 = r3.actual
                r1.onSuccess(r0)
            L21:
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
                r0 = 0
                r1.value = r0
                io.reactivex.SingleObserver<? super T> r0 = r1.actual
                r0.onError(r2)
                return
        }

        @Override // org.reactivestreams.Subscriber
        public void onNext(T r3) {
                r2 = this;
                boolean r0 = r2.done
                if (r0 == 0) goto L5
                return
            L5:
                T r0 = r2.value
                if (r0 == 0) goto L21
                org.reactivestreams.Subscription r3 = r2.f513s
                r3.cancel()
                r3 = 1
                r2.done = r3
                r3 = 0
                r2.value = r3
                io.reactivex.SingleObserver<? super T> r3 = r2.actual
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Too many elements in the Publisher"
                r0.<init>(r1)
                r3.onError(r0)
                goto L23
            L21:
                r2.value = r3
            L23:
                return
        }

        @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
        public void onSubscribe(org.reactivestreams.Subscription r3) {
                r2 = this;
                org.reactivestreams.Subscription r0 = r2.f513s
                boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r3)
                if (r0 == 0) goto L17
                r2.f513s = r3
                io.reactivex.SingleObserver<? super T> r0 = r2.actual
                r0.onSubscribe(r2)
                r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r3.request(r0)
            L17:
                return
        }
    }

    public SingleFromPublisher(org.reactivestreams.Publisher<? extends T> r1) {
            r0 = this;
            r0.<init>()
            r0.publisher = r1
            return
    }

    @Override // io.reactivex.Single
    protected void subscribeActual(io.reactivex.SingleObserver<? super T> r3) {
            r2 = this;
            org.reactivestreams.Publisher<? extends T> r0 = r2.publisher
            io.reactivex.internal.operators.single.SingleFromPublisher$ToSingleObserver r1 = new io.reactivex.internal.operators.single.SingleFromPublisher$ToSingleObserver
            r1.<init>(r3)
            r0.subscribe(r1)
            return
    }
}
