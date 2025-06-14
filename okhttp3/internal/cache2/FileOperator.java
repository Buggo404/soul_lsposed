package okhttp3.internal.cache2;

/* loaded from: classes.dex */
final class FileOperator {
    private final java.nio.channels.FileChannel fileChannel;

    FileOperator(java.nio.channels.FileChannel r1) {
            r0 = this;
            r0.<init>()
            r0.fileChannel = r1
            return
    }

    public void read(long r10, okio.Buffer r12, long r13) throws java.io.IOException {
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L17
        L6:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L16
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r4 = r10
            r6 = r13
            r8 = r12
            long r2 = r3.transferTo(r4, r6, r8)
            long r10 = r10 + r2
            long r13 = r13 - r2
            goto L6
        L16:
            return
        L17:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }

    public void write(long r10, okio.Buffer r12, long r13) throws java.io.IOException {
            r9 = this;
            r0 = 0
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 < 0) goto L1f
            long r2 = r12.size()
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 > 0) goto L1f
        Le:
            int r2 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r2 <= 0) goto L1e
            java.nio.channels.FileChannel r3 = r9.fileChannel
            r4 = r12
            r5 = r10
            r7 = r13
            long r2 = r3.transferFrom(r4, r5, r7)
            long r10 = r10 + r2
            long r13 = r13 - r2
            goto Le
        L1e:
            return
        L1f:
            java.lang.IndexOutOfBoundsException r10 = new java.lang.IndexOutOfBoundsException
            r10.<init>()
            throw r10
    }
}
