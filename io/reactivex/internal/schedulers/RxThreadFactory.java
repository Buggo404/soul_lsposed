package io.reactivex.internal.schedulers;

/* loaded from: classes.dex */
public final class RxThreadFactory extends java.util.concurrent.atomic.AtomicLong implements java.util.concurrent.ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final boolean nonBlocking;
    final java.lang.String prefix;
    final int priority;

    static final class RxCustomThread extends java.lang.Thread implements io.reactivex.internal.schedulers.NonBlockingThread {
        RxCustomThread(java.lang.Runnable r1, java.lang.String r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public RxThreadFactory(java.lang.String r3) {
            r2 = this;
            r0 = 5
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public RxThreadFactory(java.lang.String r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public RxThreadFactory(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.prefix = r1
            r0.priority = r2
            r0.nonBlocking = r3
            return
    }

    @Override // java.util.concurrent.ThreadFactory
    public java.lang.Thread newThread(java.lang.Runnable r4) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = r3.prefix
            r0.<init>(r1)
            r1 = 45
            java.lang.StringBuilder r0 = r0.append(r1)
            long r1 = r3.incrementAndGet()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            boolean r1 = r3.nonBlocking
            if (r1 == 0) goto L23
            io.reactivex.internal.schedulers.RxThreadFactory$RxCustomThread r1 = new io.reactivex.internal.schedulers.RxThreadFactory$RxCustomThread
            r1.<init>(r4, r0)
            goto L28
        L23:
            java.lang.Thread r1 = new java.lang.Thread
            r1.<init>(r4, r0)
        L28:
            int r4 = r3.priority
            r1.setPriority(r4)
            r4 = 1
            r1.setDaemon(r4)
            return r1
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "RxThreadFactory["
            r0.<init>(r1)
            java.lang.String r1 = r2.prefix
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
