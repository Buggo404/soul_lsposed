package okio;

/* loaded from: classes.dex */
public class Timeout {
    public static final okio.Timeout NONE = null;
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;


    static {
            okio.Timeout$1 r0 = new okio.Timeout$1
            r0.<init>()
            okio.Timeout.NONE = r0
            return
    }

    public Timeout() {
            r0 = this;
            r0.<init>()
            return
    }

    static long minTimeout(long r3, long r5) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L7
            return r5
        L7:
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto Lc
            return r3
        Lc:
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            return r3
        L11:
            return r5
    }

    public okio.Timeout clearDeadline() {
            r1 = this;
            r0 = 0
            r1.hasDeadline = r0
            return r1
    }

    public okio.Timeout clearTimeout() {
            r2 = this;
            r0 = 0
            r2.timeoutNanos = r0
            return r2
    }

    public final okio.Timeout deadline(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L1e
            if (r5 == 0) goto L16
            long r0 = java.lang.System.nanoTime()
            long r3 = r5.toNanos(r3)
            long r0 = r0 + r3
            okio.Timeout r3 = r2.deadlineNanoTime(r0)
            return r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "unit == null"
            r3.<init>(r4)
            throw r3
        L1e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "duration <= 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public long deadlineNanoTime() {
            r2 = this;
            boolean r0 = r2.hasDeadline
            if (r0 == 0) goto L7
            long r0 = r2.deadlineNanoTime
            return r0
        L7:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No deadline"
            r0.<init>(r1)
            throw r0
    }

    public okio.Timeout deadlineNanoTime(long r2) {
            r1 = this;
            r0 = 1
            r1.hasDeadline = r0
            r1.deadlineNanoTime = r2
            return r1
    }

    public boolean hasDeadline() {
            r1 = this;
            boolean r0 = r1.hasDeadline
            return r0
    }

    public void throwIfReached() throws java.io.IOException {
            r4 = this;
            boolean r0 = java.lang.Thread.interrupted()
            if (r0 != 0) goto L21
            boolean r0 = r4.hasDeadline
            if (r0 == 0) goto L20
            long r0 = r4.deadlineNanoTime
            long r2 = java.lang.System.nanoTime()
            long r0 = r0 - r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L18
            goto L20
        L18:
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "deadline reached"
            r0.<init>(r1)
            throw r0
        L20:
            return
        L21:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "interrupted"
            r0.<init>(r1)
            throw r0
    }

    public okio.Timeout timeout(long r3, java.util.concurrent.TimeUnit r5) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto L17
            if (r5 == 0) goto Lf
            long r3 = r5.toNanos(r3)
            r2.timeoutNanos = r3
            return r2
        Lf:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "unit == null"
            r3.<init>(r4)
            throw r3
        L17:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "timeout < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r5.<init>(r3)
            throw r5
    }

    public long timeoutNanos() {
            r2 = this;
            long r0 = r2.timeoutNanos
            return r0
    }

    public final void waitUntilNotified(java.lang.Object r10) throws java.io.InterruptedIOException {
            r9 = this;
            boolean r0 = r9.hasDeadline()     // Catch: java.lang.InterruptedException -> L52
            long r1 = r9.timeoutNanos()     // Catch: java.lang.InterruptedException -> L52
            r3 = 0
            if (r0 != 0) goto L14
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L14
            r10.wait()     // Catch: java.lang.InterruptedException -> L52
            return
        L14:
            long r5 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L52
            if (r0 == 0) goto L28
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 == 0) goto L28
            long r7 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L52
            long r7 = r7 - r5
            long r1 = java.lang.Math.min(r1, r7)     // Catch: java.lang.InterruptedException -> L52
            goto L30
        L28:
            if (r0 == 0) goto L30
            long r0 = r9.deadlineNanoTime()     // Catch: java.lang.InterruptedException -> L52
            long r1 = r0 - r5
        L30:
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L45
            r3 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r1 / r3
            long r3 = r3 * r7
            long r3 = r1 - r3
            int r0 = (int) r3     // Catch: java.lang.InterruptedException -> L52
            r10.wait(r7, r0)     // Catch: java.lang.InterruptedException -> L52
            long r3 = java.lang.System.nanoTime()     // Catch: java.lang.InterruptedException -> L52
            long r3 = r3 - r5
        L45:
            int r10 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r10 >= 0) goto L4a
            return
        L4a:
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException     // Catch: java.lang.InterruptedException -> L52
            java.lang.String r0 = "timeout"
            r10.<init>(r0)     // Catch: java.lang.InterruptedException -> L52
            throw r10     // Catch: java.lang.InterruptedException -> L52
        L52:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            java.io.InterruptedIOException r10 = new java.io.InterruptedIOException
            java.lang.String r0 = "interrupted"
            r10.<init>(r0)
            throw r10
    }
}
