package okio;

/* loaded from: classes.dex */
final class SegmentedByteString extends okio.ByteString {
    final transient int[] directory;
    final transient byte[][] segments;

    SegmentedByteString(okio.Buffer r8, int r9) {
            r7 = this;
            r0 = 0
            r7.<init>(r0)
            long r1 = r8.size
            r3 = 0
            long r5 = (long) r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            okio.Segment r0 = r8.head
            r1 = 0
            r2 = r1
            r3 = r2
        L11:
            if (r2 >= r9) goto L2c
            int r4 = r0.limit
            int r5 = r0.pos
            if (r4 == r5) goto L24
            int r4 = r0.limit
            int r5 = r0.pos
            int r4 = r4 - r5
            int r2 = r2 + r4
            int r3 = r3 + 1
            okio.Segment r0 = r0.next
            goto L11
        L24:
            java.lang.AssertionError r8 = new java.lang.AssertionError
            java.lang.String r9 = "s.limit == s.pos"
            r8.<init>(r9)
            throw r8
        L2c:
            byte[][] r0 = new byte[r3][]
            r7.segments = r0
            int r3 = r3 * 2
            int[] r0 = new int[r3]
            r7.directory = r0
            okio.Segment r8 = r8.head
            r0 = r1
        L39:
            if (r1 >= r9) goto L5e
            byte[][] r2 = r7.segments
            byte[] r3 = r8.data
            r2[r0] = r3
            int r2 = r8.limit
            int r3 = r8.pos
            int r2 = r2 - r3
            int r1 = r1 + r2
            if (r1 <= r9) goto L4a
            r1 = r9
        L4a:
            int[] r2 = r7.directory
            r2[r0] = r1
            byte[][] r3 = r7.segments
            int r3 = r3.length
            int r3 = r3 + r0
            int r4 = r8.pos
            r2[r3] = r4
            r2 = 1
            r8.shared = r2
            int r0 = r0 + 1
            okio.Segment r8 = r8.next
            goto L39
        L5e:
            return
    }

    private int segment(int r4) {
            r3 = this;
            int[] r0 = r3.directory
            byte[][] r1 = r3.segments
            int r1 = r1.length
            int r4 = r4 + 1
            r2 = 0
            int r4 = java.util.Arrays.binarySearch(r0, r2, r1, r4)
            if (r4 < 0) goto Lf
            goto L10
        Lf:
            int r4 = ~r4
        L10:
            return r4
    }

    private okio.ByteString toByteString() {
            r2 = this;
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r2.toByteArray()
            r0.<init>(r1)
            return r0
    }

    private java.lang.Object writeReplace() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            return r0
    }

    @Override // okio.ByteString
    public java.nio.ByteBuffer asByteBuffer() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String base64() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64()
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String base64Url() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.base64Url()
            return r0
    }

    @Override // okio.ByteString
    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L20
            okio.ByteString r5 = (okio.ByteString) r5
            int r1 = r5.size()
            int r3 = r4.size()
            if (r1 != r3) goto L20
            int r1 = r4.size()
            boolean r5 = r4.rangeEquals(r2, r5, r2, r1)
            if (r5 == 0) goto L20
            goto L21
        L20:
            r0 = r2
        L21:
            return r0
    }

    @Override // okio.ByteString
    public byte getByte(int r8) {
            r7 = this;
            int[] r0 = r7.directory
            byte[][] r1 = r7.segments
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            long r1 = (long) r0
            long r3 = (long) r8
            r5 = 1
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            int r0 = r7.segment(r8)
            if (r0 != 0) goto L18
            r1 = 0
            goto L1e
        L18:
            int[] r1 = r7.directory
            int r2 = r0 + (-1)
            r1 = r1[r2]
        L1e:
            int[] r2 = r7.directory
            byte[][] r3 = r7.segments
            int r4 = r3.length
            int r4 = r4 + r0
            r2 = r2[r4]
            r0 = r3[r0]
            int r8 = r8 - r1
            int r8 = r8 + r2
            r8 = r0[r8]
            return r8
    }

    @Override // okio.ByteString
    public int hashCode() {
            r8 = this;
            int r0 = r8.hashCode
            if (r0 == 0) goto L5
            return r0
        L5:
            byte[][] r0 = r8.segments
            int r0 = r0.length
            r1 = 0
            r2 = 1
            r3 = r2
            r2 = r1
        Lc:
            if (r1 >= r0) goto L2b
            byte[][] r4 = r8.segments
            r4 = r4[r1]
            int[] r5 = r8.directory
            int r6 = r0 + r1
            r6 = r5[r6]
            r5 = r5[r1]
            int r2 = r5 - r2
            int r2 = r2 + r6
        L1d:
            if (r6 >= r2) goto L27
            int r3 = r3 * 31
            r7 = r4[r6]
            int r3 = r3 + r7
            int r6 = r6 + 1
            goto L1d
        L27:
            int r1 = r1 + 1
            r2 = r5
            goto Lc
        L2b:
            r8.hashCode = r3
            return r3
    }

    @Override // okio.ByteString
    public java.lang.String hex() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.hex()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r2 = r0.hmacSha1(r2)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r2 = r0.hmacSha256(r2)
            return r2
    }

    @Override // okio.ByteString
    public int indexOf(byte[] r2, int r3) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.indexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    byte[] internalArray() {
            r1 = this;
            byte[] r0 = r1.toByteArray()
            return r0
    }

    @Override // okio.ByteString
    public int lastIndexOf(byte[] r2, int r3) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            int r2 = r0.lastIndexOf(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString md5() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.md5()
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r8, okio.ByteString r9, int r10, int r11) {
            r7 = this;
            r0 = 0
            if (r8 < 0) goto L42
            int r1 = r7.size()
            int r1 = r1 - r11
            if (r8 <= r1) goto Lb
            goto L42
        Lb:
            int r1 = r7.segment(r8)
        Lf:
            if (r11 <= 0) goto L40
            if (r1 != 0) goto L15
            r2 = r0
            goto L1b
        L15:
            int[] r2 = r7.directory
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L1b:
            int[] r3 = r7.directory
            r3 = r3[r1]
            int r3 = r3 - r2
            int r3 = r3 + r2
            int r3 = r3 - r8
            int r3 = java.lang.Math.min(r11, r3)
            int[] r4 = r7.directory
            byte[][] r5 = r7.segments
            int r6 = r5.length
            int r6 = r6 + r1
            r4 = r4[r6]
            int r2 = r8 - r2
            int r2 = r2 + r4
            r4 = r5[r1]
            boolean r2 = r9.rangeEquals(r10, r4, r2, r3)
            if (r2 != 0) goto L3a
            return r0
        L3a:
            int r8 = r8 + r3
            int r10 = r10 + r3
            int r11 = r11 - r3
            int r1 = r1 + 1
            goto Lf
        L40:
            r8 = 1
            return r8
        L42:
            return r0
    }

    @Override // okio.ByteString
    public boolean rangeEquals(int r8, byte[] r9, int r10, int r11) {
            r7 = this;
            r0 = 0
            if (r8 < 0) goto L48
            int r1 = r7.size()
            int r1 = r1 - r11
            if (r8 > r1) goto L48
            if (r10 < 0) goto L48
            int r1 = r9.length
            int r1 = r1 - r11
            if (r10 <= r1) goto L11
            goto L48
        L11:
            int r1 = r7.segment(r8)
        L15:
            if (r11 <= 0) goto L46
            if (r1 != 0) goto L1b
            r2 = r0
            goto L21
        L1b:
            int[] r2 = r7.directory
            int r3 = r1 + (-1)
            r2 = r2[r3]
        L21:
            int[] r3 = r7.directory
            r3 = r3[r1]
            int r3 = r3 - r2
            int r3 = r3 + r2
            int r3 = r3 - r8
            int r3 = java.lang.Math.min(r11, r3)
            int[] r4 = r7.directory
            byte[][] r5 = r7.segments
            int r6 = r5.length
            int r6 = r6 + r1
            r4 = r4[r6]
            int r2 = r8 - r2
            int r2 = r2 + r4
            r4 = r5[r1]
            boolean r2 = okio.Util.arrayRangeEquals(r4, r2, r9, r10, r3)
            if (r2 != 0) goto L40
            return r0
        L40:
            int r8 = r8 + r3
            int r10 = r10 + r3
            int r11 = r11 - r3
            int r1 = r1 + 1
            goto L15
        L46:
            r8 = 1
            return r8
        L48:
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString sha1() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.sha1()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString sha256() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.sha256()
            return r0
    }

    @Override // okio.ByteString
    public int size() {
            r2 = this;
            int[] r0 = r2.directory
            byte[][] r1 = r2.segments
            int r1 = r1.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String string(java.nio.charset.Charset r2) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r2 = r0.string(r2)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString substring(int r2) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r2 = r0.substring(r2)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString substring(int r2, int r3) {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r2 = r0.substring(r2, r3)
            return r2
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiLowercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiLowercase()
            return r0
    }

    @Override // okio.ByteString
    public okio.ByteString toAsciiUppercase() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            okio.ByteString r0 = r0.toAsciiUppercase()
            return r0
    }

    @Override // okio.ByteString
    public byte[] toByteArray() {
            r8 = this;
            int[] r0 = r8.directory
            byte[][] r1 = r8.segments
            int r2 = r1.length
            int r2 = r2 + (-1)
            r0 = r0[r2]
            byte[] r0 = new byte[r0]
            int r1 = r1.length
            r2 = 0
            r3 = r2
        Le:
            if (r2 >= r1) goto L25
            int[] r4 = r8.directory
            int r5 = r1 + r2
            r5 = r4[r5]
            r4 = r4[r2]
            byte[][] r6 = r8.segments
            r6 = r6[r2]
            int r7 = r4 - r3
            java.lang.System.arraycopy(r6, r5, r0, r3, r7)
            int r2 = r2 + 1
            r3 = r4
            goto Le
        L25:
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String toString() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // okio.ByteString
    public java.lang.String utf8() {
            r1 = this;
            okio.ByteString r0 = r1.toByteString()
            java.lang.String r0 = r0.utf8()
            return r0
    }

    @Override // okio.ByteString
    public void write(java.io.OutputStream r7) throws java.io.IOException {
            r6 = this;
            if (r7 == 0) goto L1f
            byte[][] r0 = r6.segments
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L7:
            if (r1 >= r0) goto L1e
            int[] r3 = r6.directory
            int r4 = r0 + r1
            r4 = r3[r4]
            r3 = r3[r1]
            byte[][] r5 = r6.segments
            r5 = r5[r1]
            int r2 = r3 - r2
            r7.write(r5, r4, r2)
            int r1 = r1 + 1
            r2 = r3
            goto L7
        L1e:
            return
        L1f:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "out == null"
            r7.<init>(r0)
            throw r7
    }

    @Override // okio.ByteString
    void write(okio.Buffer r12) {
            r11 = this;
            byte[][] r0 = r11.segments
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r1 >= r0) goto L35
            int[] r3 = r11.directory
            int r4 = r0 + r1
            r7 = r3[r4]
            r3 = r3[r1]
            okio.Segment r4 = new okio.Segment
            byte[][] r5 = r11.segments
            r6 = r5[r1]
            int r5 = r7 + r3
            int r8 = r5 - r2
            r9 = 1
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            okio.Segment r2 = r12.head
            if (r2 != 0) goto L2a
            r4.prev = r4
            r4.next = r4
            r12.head = r4
            goto L31
        L2a:
            okio.Segment r2 = r12.head
            okio.Segment r2 = r2.prev
            r2.push(r4)
        L31:
            int r1 = r1 + 1
            r2 = r3
            goto L5
        L35:
            long r0 = r12.size
            long r2 = (long) r2
            long r0 = r0 + r2
            r12.size = r0
            return
    }
}
