package okio;

/* loaded from: classes.dex */
final class Segment {
    static final int SHARE_MINIMUM = 1024;
    static final int SIZE = 8192;
    final byte[] data;
    int limit;
    okio.Segment next;
    boolean owner;
    int pos;
    okio.Segment prev;
    boolean shared;

    Segment() {
            r1 = this;
            r1.<init>()
            r0 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r0]
            r1.data = r0
            r0 = 1
            r1.owner = r0
            r0 = 0
            r1.shared = r0
            return
    }

    Segment(byte[] r1, int r2, int r3, boolean r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            r0.pos = r2
            r0.limit = r3
            r0.shared = r4
            r0.owner = r5
            return
    }

    public final void compact() {
            r4 = this;
            okio.Segment r0 = r4.prev
            if (r0 == r4) goto L28
            boolean r1 = r0.owner
            if (r1 != 0) goto L9
            return
        L9:
            int r1 = r4.limit
            int r2 = r4.pos
            int r1 = r1 - r2
            int r2 = r0.limit
            int r2 = 8192 - r2
            boolean r3 = r0.shared
            if (r3 == 0) goto L18
            r3 = 0
            goto L1a
        L18:
            int r3 = r0.pos
        L1a:
            int r2 = r2 + r3
            if (r1 <= r2) goto L1e
            return
        L1e:
            r4.writeTo(r0, r1)
            r4.pop()
            okio.SegmentPool.recycle(r4)
            return
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    @javax.annotation.Nullable
    public final okio.Segment pop() {
            r4 = this;
            okio.Segment r0 = r4.next
            r1 = 0
            if (r0 == r4) goto L7
            r2 = r0
            goto L8
        L7:
            r2 = r1
        L8:
            okio.Segment r3 = r4.prev
            r3.next = r0
            okio.Segment r0 = r4.next
            r0.prev = r3
            r4.next = r1
            r4.prev = r1
            return r2
    }

    public final okio.Segment push(okio.Segment r2) {
            r1 = this;
            r2.prev = r1
            okio.Segment r0 = r1.next
            r2.next = r0
            okio.Segment r0 = r1.next
            r0.prev = r2
            r1.next = r2
            return r2
    }

    final okio.Segment sharedCopy() {
            r7 = this;
            r0 = 1
            r7.shared = r0
            okio.Segment r0 = new okio.Segment
            byte[] r2 = r7.data
            int r3 = r7.pos
            int r4 = r7.limit
            r5 = 1
            r6 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    public final okio.Segment split(int r6) {
            r5 = this;
            if (r6 <= 0) goto L30
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            if (r6 > r0) goto L30
            r0 = 1024(0x400, float:1.435E-42)
            if (r6 < r0) goto L12
            okio.Segment r0 = r5.sharedCopy()
            goto L20
        L12:
            okio.Segment r0 = okio.SegmentPool.take()
            byte[] r1 = r5.data
            int r2 = r5.pos
            byte[] r3 = r0.data
            r4 = 0
            java.lang.System.arraycopy(r1, r2, r3, r4, r6)
        L20:
            int r1 = r0.pos
            int r1 = r1 + r6
            r0.limit = r1
            int r1 = r5.pos
            int r1 = r1 + r6
            r5.pos = r1
            okio.Segment r6 = r5.prev
            r6.push(r0)
            return r0
        L30:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
    }

    final okio.Segment unsharedCopy() {
            r7 = this;
            okio.Segment r6 = new okio.Segment
            byte[] r0 = r7.data
            java.lang.Object r0 = r0.clone()
            r1 = r0
            byte[] r1 = (byte[]) r1
            int r2 = r7.pos
            int r3 = r7.limit
            r4 = 0
            r5 = 1
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public final void writeTo(okio.Segment r5, int r6) {
            r4 = this;
            boolean r0 = r5.owner
            if (r0 == 0) goto L4a
            int r0 = r5.limit
            int r1 = r0 + r6
            r2 = 8192(0x2000, float:1.14794E-41)
            if (r1 <= r2) goto L34
            boolean r1 = r5.shared
            if (r1 != 0) goto L2e
            int r1 = r0 + r6
            int r3 = r5.pos
            int r1 = r1 - r3
            if (r1 > r2) goto L28
            byte[] r1 = r5.data
            int r0 = r0 - r3
            r2 = 0
            java.lang.System.arraycopy(r1, r3, r1, r2, r0)
            int r0 = r5.limit
            int r1 = r5.pos
            int r0 = r0 - r1
            r5.limit = r0
            r5.pos = r2
            goto L34
        L28:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L2e:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
        L34:
            byte[] r0 = r4.data
            int r1 = r4.pos
            byte[] r2 = r5.data
            int r3 = r5.limit
            java.lang.System.arraycopy(r0, r1, r2, r3, r6)
            int r0 = r5.limit
            int r0 = r0 + r6
            r5.limit = r0
            int r5 = r4.pos
            int r5 = r5 + r6
            r4.pos = r5
            return
        L4a:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            r5.<init>()
            throw r5
    }
}
