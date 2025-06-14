package io.reactivex.internal.subscribers;

/* loaded from: classes.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends java.util.concurrent.atomic.AtomicLong implements io.reactivex.FlowableSubscriber<T>, org.reactivestreams.Subscription {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final org.reactivestreams.Subscriber<? super R> actual;
    protected long produced;

    /* renamed from: s */
    protected org.reactivestreams.Subscription f548s;
    protected R value;

    public SinglePostCompleteSubscriber(org.reactivestreams.Subscriber<? super R> r1) {
            r0 = this;
            r0.<init>()
            r0.actual = r1
            return
    }

    public void cancel() {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f548s
            r0.cancel()
            return
    }

    protected final void complete(R r9) {
            r8 = this;
            long r0 = r8.produced
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Lb
            io.reactivex.internal.util.BackpressureHelper.produced(r8, r0)
        Lb:
            long r0 = r8.get()
            r4 = -9223372036854775808
            long r6 = r0 & r4
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 == 0) goto L1b
            r8.onDrop(r9)
            return
        L1b:
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r0 = r0 & r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L38
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8.lazySet(r0)
            org.reactivestreams.Subscriber<? super R> r0 = r8.actual
            r0.onNext(r9)
            org.reactivestreams.Subscriber<? super R> r9 = r8.actual
            r9.onComplete()
            return
        L38:
            r8.value = r9
            boolean r0 = r8.compareAndSet(r2, r4)
            if (r0 == 0) goto L41
            return
        L41:
            r0 = 0
            r8.value = r0
            goto Lb
    }

    protected void onDrop(R r1) {
            r0 = this;
            return
    }

    @Override // io.reactivex.FlowableSubscriber, org.reactivestreams.Subscriber
    public void onSubscribe(org.reactivestreams.Subscription r2) {
            r1 = this;
            org.reactivestreams.Subscription r0 = r1.f548s
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r0, r2)
            if (r0 == 0) goto Lf
            r1.f548s = r2
            org.reactivestreams.Subscriber<? super R> r2 = r1.actual
            r2.onSubscribe(r1)
        Lf:
            return
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long r9) {
            r8 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r9)
            if (r0 == 0) goto L3b
        L6:
            long r0 = r8.get()
            r2 = -9223372036854775808
            long r4 = r0 & r2
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2c
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r9 = r8.compareAndSet(r2, r9)
            if (r9 == 0) goto L3b
            org.reactivestreams.Subscriber<? super R> r9 = r8.actual
            R r10 = r8.value
            r9.onNext(r10)
            org.reactivestreams.Subscriber<? super R> r9 = r8.actual
            r9.onComplete()
            goto L3b
        L2c:
            long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r0, r9)
            boolean r0 = r8.compareAndSet(r0, r2)
            if (r0 == 0) goto L6
            org.reactivestreams.Subscription r0 = r8.f548s
            r0.request(r9)
        L3b:
            return
    }
}
