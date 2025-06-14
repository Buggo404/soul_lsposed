package okio;

/* loaded from: classes.dex */
final class SegmentPool {
    static final long MAX_SIZE = 65536;
    static long byteCount;

    @javax.annotation.Nullable
    static okio.Segment next;

    private SegmentPool() {
            r0 = this;
            r0.<init>()
            return
    }

    static void recycle(okio.Segment r9) {
            okio.Segment r0 = r9.next
            if (r0 != 0) goto L32
            okio.Segment r0 = r9.prev
            if (r0 != 0) goto L32
            boolean r0 = r9.shared
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.Class<okio.SegmentPool> r0 = okio.SegmentPool.class
            monitor-enter(r0)
            long r1 = okio.SegmentPool.byteCount     // Catch: java.lang.Throwable -> L2f
            r3 = 8192(0x2000, double:4.0474E-320)
            long r5 = r1 + r3
            r7 = 65536(0x10000, double:3.2379E-319)
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 <= 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L1f:
            long r1 = r1 + r3
            okio.SegmentPool.byteCount = r1     // Catch: java.lang.Throwable -> L2f
            okio.Segment r1 = okio.SegmentPool.next     // Catch: java.lang.Throwable -> L2f
            r9.next = r1     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            r9.limit = r1     // Catch: java.lang.Throwable -> L2f
            r9.pos = r1     // Catch: java.lang.Throwable -> L2f
            okio.SegmentPool.next = r9     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            return
        L2f:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2f
            throw r9
        L32:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>()
            throw r9
    }

    static okio.Segment take() {
            java.lang.Class<okio.SegmentPool> r0 = okio.SegmentPool.class
            monitor-enter(r0)
            okio.Segment r1 = okio.SegmentPool.next     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L17
            okio.Segment r2 = r1.next     // Catch: java.lang.Throwable -> L1e
            okio.SegmentPool.next = r2     // Catch: java.lang.Throwable -> L1e
            r2 = 0
            r1.next = r2     // Catch: java.lang.Throwable -> L1e
            long r2 = okio.SegmentPool.byteCount     // Catch: java.lang.Throwable -> L1e
            r4 = 8192(0x2000, double:4.0474E-320)
            long r2 = r2 - r4
            okio.SegmentPool.byteCount = r2     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return r1
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            okio.Segment r0 = new okio.Segment
            r0.<init>()
            return r0
        L1e:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }
}
