package io.reactivex.internal.subscriptions;

/* loaded from: classes.dex */
public class SubscriptionArbiter extends java.util.concurrent.atomic.AtomicInteger implements org.reactivestreams.Subscription {
    private static final long serialVersionUID = -2189523197179400958L;
    org.reactivestreams.Subscription actual;
    volatile boolean cancelled;
    final java.util.concurrent.atomic.AtomicLong missedProduced;
    final java.util.concurrent.atomic.AtomicLong missedRequested;
    final java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> missedSubscription;
    long requested;
    protected boolean unbounded;

    public SubscriptionArbiter() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            r1.missedSubscription = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.missedRequested = r0
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            r1.missedProduced = r0
            return
    }

    public void cancel() {
            r1 = this;
            boolean r0 = r1.cancelled
            if (r0 != 0) goto La
            r0 = 1
            r1.cancelled = r0
            r1.drain()
        La:
            return
    }

    final void drain() {
            r1 = this;
            int r0 = r1.getAndIncrement()
            if (r0 == 0) goto L7
            return
        L7:
            r1.drainLoop()
            return
    }

    final void drainLoop() {
            r19 = this;
            r0 = r19
            r1 = 1
            r2 = 0
            r4 = 0
            r5 = r2
            r7 = r4
        L8:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r8 = r0.missedSubscription
            java.lang.Object r8 = r8.get()
            org.reactivestreams.Subscription r8 = (org.reactivestreams.Subscription) r8
            if (r8 == 0) goto L1a
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r8 = r0.missedSubscription
            java.lang.Object r8 = r8.getAndSet(r4)
            org.reactivestreams.Subscription r8 = (org.reactivestreams.Subscription) r8
        L1a:
            java.util.concurrent.atomic.AtomicLong r9 = r0.missedRequested
            long r9 = r9.get()
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 == 0) goto L2a
            java.util.concurrent.atomic.AtomicLong r9 = r0.missedRequested
            long r9 = r9.getAndSet(r2)
        L2a:
            java.util.concurrent.atomic.AtomicLong r11 = r0.missedProduced
            long r11 = r11.get()
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 == 0) goto L3a
            java.util.concurrent.atomic.AtomicLong r11 = r0.missedProduced
            long r11 = r11.getAndSet(r2)
        L3a:
            org.reactivestreams.Subscription r13 = r0.actual
            boolean r14 = r0.cancelled
            if (r14 == 0) goto L4d
            if (r13 == 0) goto L47
            r13.cancel()
            r0.actual = r4
        L47:
            if (r8 == 0) goto L89
            r8.cancel()
            goto L89
        L4d:
            long r14 = r0.requested
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 == 0) goto L6b
            long r14 = io.reactivex.internal.util.BackpressureHelper.addCap(r14, r9)
            int r16 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r16 == 0) goto L69
            long r14 = r14 - r11
            int r11 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r11 >= 0) goto L69
            io.reactivex.internal.subscriptions.SubscriptionHelper.reportMoreProduced(r14)
            r14 = r2
        L69:
            r0.requested = r14
        L6b:
            if (r8 == 0) goto L7e
            if (r13 == 0) goto L72
            r13.cancel()
        L72:
            r0.actual = r8
            int r9 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r9 == 0) goto L89
            long r5 = io.reactivex.internal.util.BackpressureHelper.addCap(r5, r14)
            r7 = r8
            goto L89
        L7e:
            if (r13 == 0) goto L89
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 == 0) goto L89
            long r5 = io.reactivex.internal.util.BackpressureHelper.addCap(r5, r9)
            r7 = r13
        L89:
            int r1 = -r1
            int r1 = r0.addAndGet(r1)
            if (r1 != 0) goto L8
            int r1 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r1 == 0) goto L97
            r7.request(r5)
        L97:
            return
    }

    public final boolean isCancelled() {
            r1 = this;
            boolean r0 = r1.cancelled
            return r0
    }

    public final boolean isUnbounded() {
            r1 = this;
            boolean r0 = r1.unbounded
            return r0
    }

    public final void produced(long r5) {
            r4 = this;
            boolean r0 = r4.unbounded
            if (r0 == 0) goto L5
            return
        L5:
            int r0 = r4.get()
            if (r0 != 0) goto L36
            r0 = 0
            r1 = 1
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L36
            long r0 = r4.requested
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L2b
            long r0 = r0 - r5
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L29
            io.reactivex.internal.subscriptions.SubscriptionHelper.reportMoreProduced(r0)
            r0 = r5
        L29:
            r4.requested = r0
        L2b:
            int r5 = r4.decrementAndGet()
            if (r5 != 0) goto L32
            return
        L32:
            r4.drainLoop()
            return
        L36:
            java.util.concurrent.atomic.AtomicLong r0 = r4.missedProduced
            io.reactivex.internal.util.BackpressureHelper.add(r0, r5)
            r4.drain()
            return
    }

    @Override // org.reactivestreams.Subscription
    public final void request(long r7) {
            r6 = this;
            boolean r0 = io.reactivex.internal.subscriptions.SubscriptionHelper.validate(r7)
            if (r0 == 0) goto L49
            boolean r0 = r6.unbounded
            if (r0 == 0) goto Lb
            return
        Lb:
            int r0 = r6.get()
            if (r0 != 0) goto L41
            r0 = 0
            r1 = 1
            boolean r0 = r6.compareAndSet(r0, r1)
            if (r0 == 0) goto L41
            long r2 = r6.requested
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L30
            long r2 = io.reactivex.internal.util.BackpressureHelper.addCap(r2, r7)
            r6.requested = r2
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L30
            r6.unbounded = r1
        L30:
            org.reactivestreams.Subscription r0 = r6.actual
            int r1 = r6.decrementAndGet()
            if (r1 == 0) goto L3b
            r6.drainLoop()
        L3b:
            if (r0 == 0) goto L40
            r0.request(r7)
        L40:
            return
        L41:
            java.util.concurrent.atomic.AtomicLong r0 = r6.missedRequested
            io.reactivex.internal.util.BackpressureHelper.add(r0, r7)
            r6.drain()
        L49:
            return
    }

    public final void setSubscription(org.reactivestreams.Subscription r5) {
            r4 = this;
            boolean r0 = r4.cancelled
            if (r0 == 0) goto L8
            r5.cancel()
            return
        L8:
            java.lang.String r0 = "s is null"
            io.reactivex.internal.functions.ObjectHelper.requireNonNull(r5, r0)
            int r0 = r4.get()
            if (r0 != 0) goto L39
            r0 = 0
            r1 = 1
            boolean r0 = r4.compareAndSet(r0, r1)
            if (r0 == 0) goto L39
            org.reactivestreams.Subscription r0 = r4.actual
            if (r0 == 0) goto L22
            r0.cancel()
        L22:
            r4.actual = r5
            long r0 = r4.requested
            int r2 = r4.decrementAndGet()
            if (r2 == 0) goto L2f
            r4.drainLoop()
        L2f:
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L38
            r5.request(r0)
        L38:
            return
        L39:
            java.util.concurrent.atomic.AtomicReference<org.reactivestreams.Subscription> r0 = r4.missedSubscription
            java.lang.Object r5 = r0.getAndSet(r5)
            org.reactivestreams.Subscription r5 = (org.reactivestreams.Subscription) r5
            if (r5 == 0) goto L46
            r5.cancel()
        L46:
            r4.drain()
            return
    }
}
