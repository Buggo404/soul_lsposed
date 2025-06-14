package okio;

/* loaded from: classes.dex */
final class PushableTimeout extends okio.Timeout {
    private long originalDeadlineNanoTime;
    private boolean originalHasDeadline;
    private long originalTimeoutNanos;
    private okio.Timeout pushed;

    PushableTimeout() {
            r0 = this;
            r0.<init>()
            return
    }

    void pop() {
            r4 = this;
            okio.Timeout r0 = r4.pushed
            long r1 = r4.originalTimeoutNanos
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.NANOSECONDS
            r0.timeout(r1, r3)
            boolean r0 = r4.originalHasDeadline
            if (r0 == 0) goto L15
            okio.Timeout r0 = r4.pushed
            long r1 = r4.originalDeadlineNanoTime
            r0.deadlineNanoTime(r1)
            goto L1a
        L15:
            okio.Timeout r0 = r4.pushed
            r0.clearDeadline()
        L1a:
            return
    }

    void push(okio.Timeout r5) {
            r4 = this;
            r4.pushed = r5
            boolean r0 = r5.hasDeadline()
            r4.originalHasDeadline = r0
            if (r0 == 0) goto Lf
            long r0 = r5.deadlineNanoTime()
            goto L11
        Lf:
            r0 = -1
        L11:
            r4.originalDeadlineNanoTime = r0
            long r0 = r5.timeoutNanos()
            r4.originalTimeoutNanos = r0
            long r2 = r4.timeoutNanos()
            long r0 = minTimeout(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.NANOSECONDS
            r5.timeout(r0, r2)
            boolean r0 = r4.originalHasDeadline
            if (r0 == 0) goto L3e
            boolean r0 = r4.hasDeadline()
            if (r0 == 0) goto L3e
            long r0 = r4.deadlineNanoTime()
            long r2 = r4.originalDeadlineNanoTime
            long r0 = java.lang.Math.min(r0, r2)
            r5.deadlineNanoTime(r0)
            goto L4b
        L3e:
            boolean r0 = r4.hasDeadline()
            if (r0 == 0) goto L4b
            long r0 = r4.deadlineNanoTime()
            r5.deadlineNanoTime(r0)
        L4b:
            return
    }
}
