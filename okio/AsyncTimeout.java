package okio;

/* loaded from: classes.dex */
public class AsyncTimeout extends okio.Timeout {
    private static final long IDLE_TIMEOUT_MILLIS = 0;
    private static final long IDLE_TIMEOUT_NANOS = 0;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @javax.annotation.Nullable
    static okio.AsyncTimeout head;
    private boolean inQueue;

    @javax.annotation.Nullable
    private okio.AsyncTimeout next;
    private long timeoutAt;



    private static final class Watchdog extends java.lang.Thread {
        Watchdog() {
                r1 = this;
                java.lang.String r0 = "Okio Watchdog"
                r1.<init>(r0)
                r0 = 1
                r1.setDaemon(r0)
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r3 = this;
            L0:
                java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                okio.AsyncTimeout r1 = okio.AsyncTimeout.awaitTimeout()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                okio.AsyncTimeout r2 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                okio.AsyncTimeout.head = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.timedOut()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
        }
    }

    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            r1 = 60
            long r0 = r0.toMillis(r1)
            okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r2.toNanos(r0)
            okio.AsyncTimeout.IDLE_TIMEOUT_NANOS = r0
            return
    }

    public AsyncTimeout() {
            r0 = this;
            r0.<init>()
            return
    }

    @javax.annotation.Nullable
    static okio.AsyncTimeout awaitTimeout() throws java.lang.InterruptedException {
            okio.AsyncTimeout r0 = okio.AsyncTimeout.head
            okio.AsyncTimeout r0 = r0.next
            java.lang.Class<okio.AsyncTimeout> r1 = okio.AsyncTimeout.class
            r2 = 0
            if (r0 != 0) goto L26
            long r3 = java.lang.System.nanoTime()
            long r5 = okio.AsyncTimeout.IDLE_TIMEOUT_MILLIS
            r1.wait(r5)
            okio.AsyncTimeout r0 = okio.AsyncTimeout.head
            okio.AsyncTimeout r0 = r0.next
            if (r0 != 0) goto L25
            long r0 = java.lang.System.nanoTime()
            long r0 = r0 - r3
            long r3 = okio.AsyncTimeout.IDLE_TIMEOUT_NANOS
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L25
            okio.AsyncTimeout r2 = okio.AsyncTimeout.head
        L25:
            return r2
        L26:
            long r3 = java.lang.System.nanoTime()
            long r3 = r0.remainingNanos(r3)
            r5 = 0
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 <= 0) goto L40
            r5 = 1000000(0xf4240, double:4.940656E-318)
            long r7 = r3 / r5
            long r5 = r5 * r7
            long r3 = r3 - r5
            int r0 = (int) r3
            r1.wait(r7, r0)
            return r2
        L40:
            okio.AsyncTimeout r1 = okio.AsyncTimeout.head
            okio.AsyncTimeout r3 = r0.next
            r1.next = r3
            r0.next = r2
            return r0
    }

    private static synchronized boolean cancelScheduledTimeout(okio.AsyncTimeout r3) {
            java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
            monitor-enter(r0)
            okio.AsyncTimeout r1 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L1a
        L5:
            if (r1 == 0) goto L17
            okio.AsyncTimeout r2 = r1.next     // Catch: java.lang.Throwable -> L1a
            if (r2 != r3) goto L15
            okio.AsyncTimeout r2 = r3.next     // Catch: java.lang.Throwable -> L1a
            r1.next = r2     // Catch: java.lang.Throwable -> L1a
            r1 = 0
            r3.next = r1     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r3 = 0
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            monitor-exit(r0)
            r3 = 1
            return r3
        L1a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    private long remainingNanos(long r3) {
            r2 = this;
            long r0 = r2.timeoutAt
            long r0 = r0 - r3
            return r0
    }

    private static synchronized void scheduleTimeout(okio.AsyncTimeout r5, long r6, boolean r8) {
            java.lang.Class<okio.AsyncTimeout> r0 = okio.AsyncTimeout.class
            monitor-enter(r0)
            okio.AsyncTimeout r1 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L6a
            if (r1 != 0) goto L16
            okio.AsyncTimeout r1 = new okio.AsyncTimeout     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            okio.AsyncTimeout.head = r1     // Catch: java.lang.Throwable -> L6a
            okio.AsyncTimeout$Watchdog r1 = new okio.AsyncTimeout$Watchdog     // Catch: java.lang.Throwable -> L6a
            r1.<init>()     // Catch: java.lang.Throwable -> L6a
            r1.start()     // Catch: java.lang.Throwable -> L6a
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L6a
            r3 = 0
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 == 0) goto L2f
            if (r8 == 0) goto L2f
            long r3 = r5.deadlineNanoTime()     // Catch: java.lang.Throwable -> L6a
            long r3 = r3 - r1
            long r6 = java.lang.Math.min(r6, r3)     // Catch: java.lang.Throwable -> L6a
            long r6 = r6 + r1
            r5.timeoutAt = r6     // Catch: java.lang.Throwable -> L6a
            goto L3d
        L2f:
            if (r3 == 0) goto L35
            long r6 = r6 + r1
            r5.timeoutAt = r6     // Catch: java.lang.Throwable -> L6a
            goto L3d
        L35:
            if (r8 == 0) goto L64
            long r6 = r5.deadlineNanoTime()     // Catch: java.lang.Throwable -> L6a
            r5.timeoutAt = r6     // Catch: java.lang.Throwable -> L6a
        L3d:
            long r6 = r5.remainingNanos(r1)     // Catch: java.lang.Throwable -> L6a
            okio.AsyncTimeout r8 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L6a
        L43:
            okio.AsyncTimeout r3 = r8.next     // Catch: java.lang.Throwable -> L6a
            if (r3 == 0) goto L53
            long r3 = r3.remainingNanos(r1)     // Catch: java.lang.Throwable -> L6a
            int r3 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r3 >= 0) goto L50
            goto L53
        L50:
            okio.AsyncTimeout r8 = r8.next     // Catch: java.lang.Throwable -> L6a
            goto L43
        L53:
            okio.AsyncTimeout r6 = r8.next     // Catch: java.lang.Throwable -> L6a
            r5.next = r6     // Catch: java.lang.Throwable -> L6a
            r8.next = r5     // Catch: java.lang.Throwable -> L6a
            okio.AsyncTimeout r5 = okio.AsyncTimeout.head     // Catch: java.lang.Throwable -> L6a
            if (r8 != r5) goto L62
            java.lang.Class<okio.AsyncTimeout> r5 = okio.AsyncTimeout.class
            r5.notify()     // Catch: java.lang.Throwable -> L6a
        L62:
            monitor-exit(r0)
            return
        L64:
            java.lang.AssertionError r5 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            throw r5     // Catch: java.lang.Throwable -> L6a
        L6a:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
    }

    public final void enter() {
            r5 = this;
            boolean r0 = r5.inQueue
            if (r0 != 0) goto L1c
            long r0 = r5.timeoutNanos()
            boolean r2 = r5.hasDeadline()
            r3 = 0
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L15
            if (r2 != 0) goto L15
            return
        L15:
            r3 = 1
            r5.inQueue = r3
            scheduleTimeout(r5, r0, r2)
            return
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unbalanced enter/exit"
            r0.<init>(r1)
            throw r0
    }

    final java.io.IOException exit(java.io.IOException r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.exit()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.io.IOException r2 = r1.newTimeoutException(r2)
            return r2
    }

    final void exit(boolean r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.exit()
            if (r0 == 0) goto Lf
            if (r2 != 0) goto L9
            goto Lf
        L9:
            r2 = 0
            java.io.IOException r2 = r1.newTimeoutException(r2)
            throw r2
        Lf:
            return
    }

    public final boolean exit() {
            r2 = this;
            boolean r0 = r2.inQueue
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2.inQueue = r1
            boolean r0 = cancelScheduledTimeout(r2)
            return r0
    }

    protected java.io.IOException newTimeoutException(@javax.annotation.Nullable java.io.IOException r3) {
            r2 = this;
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException
            java.lang.String r1 = "timeout"
            r0.<init>(r1)
            if (r3 == 0) goto Lc
            r0.initCause(r3)
        Lc:
            return r0
    }

    public final okio.Sink sink(okio.Sink r2) {
            r1 = this;
            okio.AsyncTimeout$1 r0 = new okio.AsyncTimeout$1
            r0.<init>(r1, r2)
            return r0
    }

    public final okio.Source source(okio.Source r2) {
            r1 = this;
            okio.AsyncTimeout$2 r0 = new okio.AsyncTimeout$2
            r0.<init>(r1, r2)
            return r0
    }

    protected void timedOut() {
            r0 = this;
            return
    }
}
