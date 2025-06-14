package okhttp3.internal.http2;

/* loaded from: classes.dex */
final class Hpack {
    static final java.util.Map<okio.ByteString, java.lang.Integer> NAME_TO_FIRST_INDEX = null;
    private static final int PREFIX_4_BITS = 15;
    private static final int PREFIX_5_BITS = 31;
    private static final int PREFIX_6_BITS = 63;
    private static final int PREFIX_7_BITS = 127;
    static final okhttp3.internal.http2.Header[] STATIC_HEADER_TABLE = null;

    static final class Reader {
        okhttp3.internal.http2.Header[] dynamicTable;
        int dynamicTableByteCount;
        int headerCount;
        private final java.util.List<okhttp3.internal.http2.Header> headerList;
        private final int headerTableSizeSetting;
        private int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final okio.BufferedSource source;

        Reader(int r2, int r3, okio.Source r4) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.headerList = r0
                r0 = 8
                okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
                r1.dynamicTable = r0
                int r0 = r0.length
                int r0 = r0 + (-1)
                r1.nextHeaderIndex = r0
                r0 = 0
                r1.headerCount = r0
                r1.dynamicTableByteCount = r0
                r1.headerTableSizeSetting = r2
                r1.maxDynamicTableByteCount = r3
                okio.BufferedSource r2 = okio.Okio.buffer(r4)
                r1.source = r2
                return
        }

        Reader(int r1, okio.Source r2) {
                r0 = this;
                r0.<init>(r1, r1, r2)
                return
        }

        private void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                goto L10
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private int dynamicTableIndex(int r2) {
                r1 = this;
                int r0 = r1.nextHeaderIndex
                int r0 = r0 + 1
                int r0 = r0 + r2
                return r0
        }

        private int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L3c
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L2b
                if (r5 <= 0) goto L2b
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r2 = r4.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r3 = r4.dynamicTable
                r3 = r3[r1]
                int r3 = r3.hpackSize
                int r2 = r2 - r3
                r4.dynamicTableByteCount = r2
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L2b:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L3c:
                return r0
        }

        private okio.ByteString getName(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto Ld
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                r4 = r0[r4]
                okio.ByteString r4 = r4.name
                return r4
            Ld:
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L22
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L22
                r4 = r1[r0]
                okio.ByteString r4 = r4.name
                return r4
            L22:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Header index too large "
                r1.<init>(r2)
                int r4 = r4 + 1
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        private void insertIntoDynamicTable(int r6, okhttp3.internal.http2.Header r7) {
                r5 = this;
                java.util.List<okhttp3.internal.http2.Header> r0 = r5.headerList
                r0.add(r7)
                int r0 = r7.hpackSize
                r1 = -1
                if (r6 == r1) goto L15
                okhttp3.internal.http2.Header[] r2 = r5.dynamicTable
                int r3 = r5.dynamicTableIndex(r6)
                r2 = r2[r3]
                int r2 = r2.hpackSize
                int r0 = r0 - r2
            L15:
                int r2 = r5.maxDynamicTableByteCount
                if (r0 <= r2) goto L1d
                r5.clearDynamicTable()
                return
            L1d:
                int r3 = r5.dynamicTableByteCount
                int r3 = r3 + r0
                int r3 = r3 - r2
                int r2 = r5.evictToRecoverBytes(r3)
                if (r6 != r1) goto L55
                int r6 = r5.headerCount
                int r6 = r6 + 1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r2 = r1.length
                if (r6 <= r2) goto L44
                int r6 = r1.length
                int r6 = r6 * 2
                okhttp3.internal.http2.Header[] r6 = new okhttp3.internal.http2.Header[r6]
                int r2 = r1.length
                int r3 = r1.length
                r4 = 0
                java.lang.System.arraycopy(r1, r4, r6, r2, r3)
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
                r5.nextHeaderIndex = r1
                r5.dynamicTable = r6
            L44:
                int r6 = r5.nextHeaderIndex
                int r1 = r6 + (-1)
                r5.nextHeaderIndex = r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
                int r6 = r5.headerCount
                int r6 = r6 + 1
                r5.headerCount = r6
                goto L5f
            L55:
                int r1 = r5.dynamicTableIndex(r6)
                int r1 = r1 + r2
                int r6 = r6 + r1
                okhttp3.internal.http2.Header[] r1 = r5.dynamicTable
                r1[r6] = r7
            L5f:
                int r6 = r5.dynamicTableByteCount
                int r6 = r6 + r0
                r5.dynamicTableByteCount = r6
                return
        }

        private boolean isStaticHeader(int r3) {
                r2 = this;
                if (r3 < 0) goto La
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r0 = r0.length
                r1 = 1
                int r0 = r0 - r1
                if (r3 > r0) goto La
                goto Lb
            La:
                r1 = 0
            Lb:
                return r1
        }

        private int readByte() throws java.io.IOException {
                r1 = this;
                okio.BufferedSource r0 = r1.source
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                return r0
        }

        private void readIndexedHeader(int r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.isStaticHeader(r4)
                if (r0 == 0) goto L10
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                r4 = r0[r4]
                java.util.List<okhttp3.internal.http2.Header> r0 = r3.headerList
                r0.add(r4)
                goto L27
            L10:
                okhttp3.internal.http2.Header[] r0 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r0 = r0.length
                int r0 = r4 - r0
                int r0 = r3.dynamicTableIndex(r0)
                if (r0 < 0) goto L28
                okhttp3.internal.http2.Header[] r1 = r3.dynamicTable
                int r2 = r1.length
                if (r0 >= r2) goto L28
                java.util.List<okhttp3.internal.http2.Header> r4 = r3.headerList
                r0 = r1[r0]
                r4.add(r0)
            L27:
                return
            L28:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Header index too large "
                r1.<init>(r2)
                int r4 = r4 + 1
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        private void readLiteralHeaderWithIncrementalIndexingIndexedName(int r3) throws java.io.IOException {
                r2 = this;
                okio.ByteString r3 = r2.getName(r3)
                okio.ByteString r0 = r2.readByteString()
                okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
                r1.<init>(r3, r0)
                r3 = -1
                r2.insertIntoDynamicTable(r3, r1)
                return
        }

        private void readLiteralHeaderWithIncrementalIndexingNewName() throws java.io.IOException {
                r3 = this;
                okio.ByteString r0 = r3.readByteString()
                okio.ByteString r0 = okhttp3.internal.http2.Hpack.checkLowercase(r0)
                okio.ByteString r1 = r3.readByteString()
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r0, r1)
                r0 = -1
                r3.insertIntoDynamicTable(r0, r2)
                return
        }

        private void readLiteralHeaderWithoutIndexingIndexedName(int r4) throws java.io.IOException {
                r3 = this;
                okio.ByteString r4 = r3.getName(r4)
                okio.ByteString r0 = r3.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r1 = r3.headerList
                okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
                r2.<init>(r4, r0)
                r1.add(r2)
                return
        }

        private void readLiteralHeaderWithoutIndexingNewName() throws java.io.IOException {
                r4 = this;
                okio.ByteString r0 = r4.readByteString()
                okio.ByteString r0 = okhttp3.internal.http2.Hpack.checkLowercase(r0)
                okio.ByteString r1 = r4.readByteString()
                java.util.List<okhttp3.internal.http2.Header> r2 = r4.headerList
                okhttp3.internal.http2.Header r3 = new okhttp3.internal.http2.Header
                r3.<init>(r0, r1)
                r2.add(r3)
                return
        }

        public java.util.List<okhttp3.internal.http2.Header> getAndResetHeaderList() {
                r2 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r0.<init>(r1)
                java.util.List<okhttp3.internal.http2.Header> r1 = r2.headerList
                r1.clear()
                return r0
        }

        int maxDynamicTableByteCount() {
                r1 = this;
                int r0 = r1.maxDynamicTableByteCount
                return r0
        }

        okio.ByteString readByteString() throws java.io.IOException {
                r5 = this;
                int r0 = r5.readByte()
                r1 = r0 & 128(0x80, float:1.794E-43)
                r2 = 128(0x80, float:1.794E-43)
                if (r1 != r2) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                r2 = 127(0x7f, float:1.78E-43)
                int r0 = r5.readInt(r0, r2)
                if (r1 == 0) goto L29
                okhttp3.internal.http2.Huffman r1 = okhttp3.internal.http2.Huffman.get()
                okio.BufferedSource r2 = r5.source
                long r3 = (long) r0
                byte[] r0 = r2.readByteArray(r3)
                byte[] r0 = r1.decode(r0)
                okio.ByteString r0 = okio.ByteString.m96of(r0)
                return r0
            L29:
                okio.BufferedSource r1 = r5.source
                long r2 = (long) r0
                okio.ByteString r0 = r1.readByteString(r2)
                return r0
        }

        void readHeaders() throws java.io.IOException {
                r3 = this;
            L0:
                okio.BufferedSource r0 = r3.source
                boolean r0 = r0.exhausted()
                if (r0 != 0) goto L8b
                okio.BufferedSource r0 = r3.source
                byte r0 = r0.readByte()
                r0 = r0 & 255(0xff, float:3.57E-43)
                r1 = 128(0x80, float:1.794E-43)
                if (r0 == r1) goto L83
                r2 = r0 & 128(0x80, float:1.794E-43)
                if (r2 != r1) goto L24
                r1 = 127(0x7f, float:1.78E-43)
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readIndexedHeader(r0)
                goto L0
            L24:
                r1 = 64
                if (r0 != r1) goto L2c
                r3.readLiteralHeaderWithIncrementalIndexingNewName()
                goto L0
            L2c:
                r2 = r0 & 64
                if (r2 != r1) goto L3c
                r1 = 63
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithIncrementalIndexingIndexedName(r0)
                goto L0
            L3c:
                r1 = r0 & 32
                r2 = 32
                if (r1 != r2) goto L6b
                r1 = 31
                int r0 = r3.readInt(r0, r1)
                r3.maxDynamicTableByteCount = r0
                if (r0 < 0) goto L54
                int r1 = r3.headerTableSizeSetting
                if (r0 > r1) goto L54
                r3.adjustDynamicTableByteCount()
                goto L0
            L54:
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid dynamic table size update "
                r1.<init>(r2)
                int r2 = r3.maxDynamicTableByteCount
                java.lang.StringBuilder r1 = r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L6b:
                r1 = 16
                if (r0 == r1) goto L7e
                if (r0 != 0) goto L72
                goto L7e
            L72:
                r1 = 15
                int r0 = r3.readInt(r0, r1)
                int r0 = r0 + (-1)
                r3.readLiteralHeaderWithoutIndexingIndexedName(r0)
                goto L0
            L7e:
                r3.readLiteralHeaderWithoutIndexingNewName()
                goto L0
            L83:
                java.io.IOException r0 = new java.io.IOException
                java.lang.String r1 = "index == 0"
                r0.<init>(r1)
                throw r0
            L8b:
                return
        }

        int readInt(int r3, int r4) throws java.io.IOException {
                r2 = this;
                r3 = r3 & r4
                if (r3 >= r4) goto L4
                return r3
            L4:
                r3 = 0
            L5:
                int r0 = r2.readByte()
                r1 = r0 & 128(0x80, float:1.794E-43)
                if (r1 == 0) goto L14
                r0 = r0 & 127(0x7f, float:1.78E-43)
                int r0 = r0 << r3
                int r4 = r4 + r0
                int r3 = r3 + 7
                goto L5
            L14:
                int r3 = r0 << r3
                int r4 = r4 + r3
                return r4
        }
    }

    static final class Writer {
        private static final int SETTINGS_HEADER_TABLE_SIZE = 4096;
        private static final int SETTINGS_HEADER_TABLE_SIZE_LIMIT = 16384;
        okhttp3.internal.http2.Header[] dynamicTable;
        int dynamicTableByteCount;
        private boolean emitDynamicTableSizeUpdate;
        int headerCount;
        int headerTableSizeSetting;
        int maxDynamicTableByteCount;
        int nextHeaderIndex;
        private final okio.Buffer out;
        private int smallestHeaderTableSizeSetting;
        private final boolean useCompression;

        Writer(int r2, boolean r3, okio.Buffer r4) {
                r1 = this;
                r1.<init>()
                r0 = 2147483647(0x7fffffff, float:NaN)
                r1.smallestHeaderTableSizeSetting = r0
                r0 = 8
                okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
                r1.dynamicTable = r0
                int r0 = r0.length
                int r0 = r0 + (-1)
                r1.nextHeaderIndex = r0
                r0 = 0
                r1.headerCount = r0
                r1.dynamicTableByteCount = r0
                r1.headerTableSizeSetting = r2
                r1.maxDynamicTableByteCount = r2
                r1.useCompression = r3
                r1.out = r4
                return
        }

        Writer(okio.Buffer r3) {
                r2 = this;
                r0 = 4096(0x1000, float:5.74E-42)
                r1 = 1
                r2.<init>(r0, r1, r3)
                return
        }

        private void adjustDynamicTableByteCount() {
                r2 = this;
                int r0 = r2.maxDynamicTableByteCount
                int r1 = r2.dynamicTableByteCount
                if (r0 >= r1) goto L10
                if (r0 != 0) goto Lc
                r2.clearDynamicTable()
                goto L10
            Lc:
                int r1 = r1 - r0
                r2.evictToRecoverBytes(r1)
            L10:
                return
        }

        private void clearDynamicTable() {
                r2 = this;
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                okhttp3.internal.http2.Header[] r0 = r2.dynamicTable
                int r0 = r0.length
                int r0 = r0 + (-1)
                r2.nextHeaderIndex = r0
                r0 = 0
                r2.headerCount = r0
                r2.dynamicTableByteCount = r0
                return
        }

        private int evictToRecoverBytes(int r5) {
                r4 = this;
                r0 = 0
                if (r5 <= 0) goto L49
                okhttp3.internal.http2.Header[] r1 = r4.dynamicTable
                int r1 = r1.length
                int r1 = r1 + (-1)
            L8:
                int r2 = r4.nextHeaderIndex
                if (r1 < r2) goto L2b
                if (r5 <= 0) goto L2b
                okhttp3.internal.http2.Header[] r2 = r4.dynamicTable
                r2 = r2[r1]
                int r2 = r2.hpackSize
                int r5 = r5 - r2
                int r2 = r4.dynamicTableByteCount
                okhttp3.internal.http2.Header[] r3 = r4.dynamicTable
                r3 = r3[r1]
                int r3 = r3.hpackSize
                int r2 = r2 - r3
                r4.dynamicTableByteCount = r2
                int r2 = r4.headerCount
                int r2 = r2 + (-1)
                r4.headerCount = r2
                int r0 = r0 + 1
                int r1 = r1 + (-1)
                goto L8
            L2b:
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r2 + 1
                int r2 = r2 + 1
                int r2 = r2 + r0
                int r3 = r4.headerCount
                java.lang.System.arraycopy(r5, r1, r5, r2, r3)
                okhttp3.internal.http2.Header[] r5 = r4.dynamicTable
                int r1 = r4.nextHeaderIndex
                int r2 = r1 + 1
                int r1 = r1 + 1
                int r1 = r1 + r0
                r3 = 0
                java.util.Arrays.fill(r5, r2, r1, r3)
                int r5 = r4.nextHeaderIndex
                int r5 = r5 + r0
                r4.nextHeaderIndex = r5
            L49:
                return r0
        }

        private void insertIntoDynamicTable(okhttp3.internal.http2.Header r7) {
                r6 = this;
                int r0 = r7.hpackSize
                int r1 = r6.maxDynamicTableByteCount
                if (r0 <= r1) goto La
                r6.clearDynamicTable()
                return
            La:
                int r2 = r6.dynamicTableByteCount
                int r2 = r2 + r0
                int r2 = r2 - r1
                r6.evictToRecoverBytes(r2)
                int r1 = r6.headerCount
                int r1 = r1 + 1
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r3 = r2.length
                if (r1 <= r3) goto L2e
                int r1 = r2.length
                int r1 = r1 * 2
                okhttp3.internal.http2.Header[] r1 = new okhttp3.internal.http2.Header[r1]
                int r3 = r2.length
                int r4 = r2.length
                r5 = 0
                java.lang.System.arraycopy(r2, r5, r1, r3, r4)
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                int r2 = r2.length
                int r2 = r2 + (-1)
                r6.nextHeaderIndex = r2
                r6.dynamicTable = r1
            L2e:
                int r1 = r6.nextHeaderIndex
                int r2 = r1 + (-1)
                r6.nextHeaderIndex = r2
                okhttp3.internal.http2.Header[] r2 = r6.dynamicTable
                r2[r1] = r7
                int r7 = r6.headerCount
                int r7 = r7 + 1
                r6.headerCount = r7
                int r7 = r6.dynamicTableByteCount
                int r7 = r7 + r0
                r6.dynamicTableByteCount = r7
                return
        }

        void setHeaderTableSizeSetting(int r2) {
                r1 = this;
                r1.headerTableSizeSetting = r2
                r0 = 16384(0x4000, float:2.2959E-41)
                int r2 = java.lang.Math.min(r2, r0)
                int r0 = r1.maxDynamicTableByteCount
                if (r0 != r2) goto Ld
                return
            Ld:
                if (r2 >= r0) goto L17
                int r0 = r1.smallestHeaderTableSizeSetting
                int r0 = java.lang.Math.min(r0, r2)
                r1.smallestHeaderTableSizeSetting = r0
            L17:
                r0 = 1
                r1.emitDynamicTableSizeUpdate = r0
                r1.maxDynamicTableByteCount = r2
                r1.adjustDynamicTableByteCount()
                return
        }

        void writeByteString(okio.ByteString r4) throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.useCompression
                r1 = 127(0x7f, float:1.78E-43)
                if (r0 == 0) goto L33
                okhttp3.internal.http2.Huffman r0 = okhttp3.internal.http2.Huffman.get()
                int r0 = r0.encodedLength(r4)
                int r2 = r4.size()
                if (r0 >= r2) goto L33
                okio.Buffer r0 = new okio.Buffer
                r0.<init>()
                okhttp3.internal.http2.Huffman r2 = okhttp3.internal.http2.Huffman.get()
                r2.encode(r4, r0)
                okio.ByteString r4 = r0.readByteString()
                int r0 = r4.size()
                r2 = 128(0x80, float:1.794E-43)
                r3.writeInt(r0, r1, r2)
                okio.Buffer r0 = r3.out
                r0.write(r4)
                goto L40
            L33:
                int r0 = r4.size()
                r2 = 0
                r3.writeInt(r0, r1, r2)
                okio.Buffer r0 = r3.out
                r0.write(r4)
            L40:
                return
        }

        void writeHeaders(java.util.List<okhttp3.internal.http2.Header> r14) throws java.io.IOException {
                r13 = this;
                boolean r0 = r13.emitDynamicTableSizeUpdate
                r1 = 0
                if (r0 == 0) goto L1e
                int r0 = r13.smallestHeaderTableSizeSetting
                int r2 = r13.maxDynamicTableByteCount
                r3 = 32
                r4 = 31
                if (r0 >= r2) goto L12
                r13.writeInt(r0, r4, r3)
            L12:
                r13.emitDynamicTableSizeUpdate = r1
                r0 = 2147483647(0x7fffffff, float:NaN)
                r13.smallestHeaderTableSizeSetting = r0
                int r0 = r13.maxDynamicTableByteCount
                r13.writeInt(r0, r4, r3)
            L1e:
                int r0 = r14.size()
                r2 = r1
            L23:
                if (r2 >= r0) goto Lec
                java.lang.Object r3 = r14.get(r2)
                okhttp3.internal.http2.Header r3 = (okhttp3.internal.http2.Header) r3
                okio.ByteString r4 = r3.name
                okio.ByteString r4 = r4.toAsciiLowercase()
                okio.ByteString r5 = r3.value
                java.util.Map<okio.ByteString, java.lang.Integer> r6 = okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX
                java.lang.Object r6 = r6.get(r4)
                java.lang.Integer r6 = (java.lang.Integer) r6
                r7 = -1
                r8 = 1
                if (r6 == 0) goto L6e
                int r6 = r6.intValue()
                int r6 = r6 + r8
                if (r6 <= r8) goto L6b
                r9 = 8
                if (r6 >= r9) goto L6b
                okhttp3.internal.http2.Header[] r9 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r10 = r6 + (-1)
                r9 = r9[r10]
                okio.ByteString r9 = r9.value
                boolean r9 = java.util.Objects.equals(r9, r5)
                if (r9 == 0) goto L59
                goto L6f
            L59:
                okhttp3.internal.http2.Header[] r9 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                r9 = r9[r6]
                okio.ByteString r9 = r9.value
                boolean r9 = java.util.Objects.equals(r9, r5)
                if (r9 == 0) goto L6b
                int r9 = r6 + 1
                r12 = r9
                r9 = r6
                r6 = r12
                goto L70
            L6b:
                r9 = r6
                r6 = r7
                goto L70
            L6e:
                r6 = r7
            L6f:
                r9 = r6
            L70:
                if (r6 != r7) goto La7
                int r10 = r13.nextHeaderIndex
                int r10 = r10 + r8
                okhttp3.internal.http2.Header[] r8 = r13.dynamicTable
                int r8 = r8.length
            L78:
                if (r10 >= r8) goto La7
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r10]
                okio.ByteString r11 = r11.name
                boolean r11 = java.util.Objects.equals(r11, r4)
                if (r11 == 0) goto La4
                okhttp3.internal.http2.Header[] r11 = r13.dynamicTable
                r11 = r11[r10]
                okio.ByteString r11 = r11.value
                boolean r11 = java.util.Objects.equals(r11, r5)
                if (r11 == 0) goto L9a
                int r6 = r13.nextHeaderIndex
                int r10 = r10 - r6
                okhttp3.internal.http2.Header[] r6 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r6 = r6.length
                int r6 = r6 + r10
                goto La7
            L9a:
                if (r9 != r7) goto La4
                int r9 = r13.nextHeaderIndex
                int r9 = r10 - r9
                okhttp3.internal.http2.Header[] r11 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
                int r11 = r11.length
                int r9 = r9 + r11
            La4:
                int r10 = r10 + 1
                goto L78
            La7:
                if (r6 == r7) goto Lb1
                r3 = 127(0x7f, float:1.78E-43)
                r4 = 128(0x80, float:1.794E-43)
                r13.writeInt(r6, r3, r4)
                goto Le8
            Lb1:
                r6 = 64
                if (r9 != r7) goto Lc4
                okio.Buffer r7 = r13.out
                r7.writeByte(r6)
                r13.writeByteString(r4)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
                goto Le8
            Lc4:
                okio.ByteString r7 = okhttp3.internal.http2.Header.PSEUDO_PREFIX
                boolean r7 = r4.startsWith(r7)
                if (r7 == 0) goto Ldd
                okio.ByteString r7 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
                boolean r4 = r7.equals(r4)
                if (r4 != 0) goto Ldd
                r3 = 15
                r13.writeInt(r9, r3, r1)
                r13.writeByteString(r5)
                goto Le8
            Ldd:
                r4 = 63
                r13.writeInt(r9, r4, r6)
                r13.writeByteString(r5)
                r13.insertIntoDynamicTable(r3)
            Le8:
                int r2 = r2 + 1
                goto L23
            Lec:
                return
        }

        void writeInt(int r2, int r3, int r4) {
                r1 = this;
                if (r2 >= r3) goto L9
                okio.Buffer r3 = r1.out
                r2 = r2 | r4
                r3.writeByte(r2)
                return
            L9:
                okio.Buffer r0 = r1.out
                r4 = r4 | r3
                r0.writeByte(r4)
                int r2 = r2 - r3
            L10:
                r3 = 128(0x80, float:1.794E-43)
                if (r2 < r3) goto L1f
                r4 = r2 & 127(0x7f, float:1.78E-43)
                okio.Buffer r0 = r1.out
                r3 = r3 | r4
                r0.writeByte(r3)
                int r2 = r2 >>> 7
                goto L10
            L1f:
                okio.Buffer r3 = r1.out
                r3.writeByte(r2)
                return
        }
    }

    static {
            r0 = 61
            okhttp3.internal.http2.Header[] r0 = new okhttp3.internal.http2.Header[r0]
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_AUTHORITY
            java.lang.String r3 = ""
            r1.<init>(r2, r3)
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r4 = "GET"
            r1.<init>(r2, r4)
            r2 = 1
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_METHOD
            java.lang.String r4 = "POST"
            r1.<init>(r2, r4)
            r2 = 2
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r4 = "/"
            r1.<init>(r2, r4)
            r2 = 3
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_PATH
            java.lang.String r4 = "/index.html"
            r1.<init>(r2, r4)
            r2 = 4
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r4 = "http"
            r1.<init>(r2, r4)
            r2 = 5
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.TARGET_SCHEME
            java.lang.String r4 = "https"
            r1.<init>(r2, r4)
            r2 = 6
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "200"
            r1.<init>(r2, r4)
            r2 = 7
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "204"
            r1.<init>(r2, r4)
            r2 = 8
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "206"
            r1.<init>(r2, r4)
            r2 = 9
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "304"
            r1.<init>(r2, r4)
            r2 = 10
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "400"
            r1.<init>(r2, r4)
            r2 = 11
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "404"
            r1.<init>(r2, r4)
            r2 = 12
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            okio.ByteString r2 = okhttp3.internal.http2.Header.RESPONSE_STATUS
            java.lang.String r4 = "500"
            r1.<init>(r2, r4)
            r2 = 13
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-charset"
            r1.<init>(r2, r3)
            r2 = 14
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-encoding"
            java.lang.String r4 = "gzip, deflate"
            r1.<init>(r2, r4)
            r2 = 15
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-language"
            r1.<init>(r2, r3)
            r2 = 16
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept-ranges"
            r1.<init>(r2, r3)
            r2 = 17
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "accept"
            r1.<init>(r2, r3)
            r2 = 18
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "access-control-allow-origin"
            r1.<init>(r2, r3)
            r2 = 19
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "age"
            r1.<init>(r2, r3)
            r2 = 20
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "allow"
            r1.<init>(r2, r3)
            r2 = 21
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "authorization"
            r1.<init>(r2, r3)
            r2 = 22
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "cache-control"
            r1.<init>(r2, r3)
            r2 = 23
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-disposition"
            r1.<init>(r2, r3)
            r2 = 24
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-encoding"
            r1.<init>(r2, r3)
            r2 = 25
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-language"
            r1.<init>(r2, r3)
            r2 = 26
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-length"
            r1.<init>(r2, r3)
            r2 = 27
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-location"
            r1.<init>(r2, r3)
            r2 = 28
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-range"
            r1.<init>(r2, r3)
            r2 = 29
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "content-type"
            r1.<init>(r2, r3)
            r2 = 30
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "cookie"
            r1.<init>(r2, r3)
            r2 = 31
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "date"
            r1.<init>(r2, r3)
            r2 = 32
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "etag"
            r1.<init>(r2, r3)
            r2 = 33
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "expect"
            r1.<init>(r2, r3)
            r2 = 34
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "expires"
            r1.<init>(r2, r3)
            r2 = 35
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "from"
            r1.<init>(r2, r3)
            r2 = 36
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "host"
            r1.<init>(r2, r3)
            r2 = 37
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-match"
            r1.<init>(r2, r3)
            r2 = 38
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-modified-since"
            r1.<init>(r2, r3)
            r2 = 39
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-none-match"
            r1.<init>(r2, r3)
            r2 = 40
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-range"
            r1.<init>(r2, r3)
            r2 = 41
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "if-unmodified-since"
            r1.<init>(r2, r3)
            r2 = 42
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "last-modified"
            r1.<init>(r2, r3)
            r2 = 43
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "link"
            r1.<init>(r2, r3)
            r2 = 44
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "location"
            r1.<init>(r2, r3)
            r2 = 45
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "max-forwards"
            r1.<init>(r2, r3)
            r2 = 46
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "proxy-authenticate"
            r1.<init>(r2, r3)
            r2 = 47
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "proxy-authorization"
            r1.<init>(r2, r3)
            r2 = 48
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "range"
            r1.<init>(r2, r3)
            r2 = 49
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "referer"
            r1.<init>(r2, r3)
            r2 = 50
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "refresh"
            r1.<init>(r2, r3)
            r2 = 51
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "retry-after"
            r1.<init>(r2, r3)
            r2 = 52
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "server"
            r1.<init>(r2, r3)
            r2 = 53
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "set-cookie"
            r1.<init>(r2, r3)
            r2 = 54
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "strict-transport-security"
            r1.<init>(r2, r3)
            r2 = 55
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "transfer-encoding"
            r1.<init>(r2, r3)
            r2 = 56
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "user-agent"
            r1.<init>(r2, r3)
            r2 = 57
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "vary"
            r1.<init>(r2, r3)
            r2 = 58
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "via"
            r1.<init>(r2, r3)
            r2 = 59
            r0[r2] = r1
            okhttp3.internal.http2.Header r1 = new okhttp3.internal.http2.Header
            java.lang.String r2 = "www-authenticate"
            r1.<init>(r2, r3)
            r2 = 60
            r0[r2] = r1
            okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE = r0
            java.util.Map r0 = nameToFirstIndex()
            okhttp3.internal.http2.Hpack.NAME_TO_FIRST_INDEX = r0
            return
    }

    private Hpack() {
            r0 = this;
            r0.<init>()
            return
    }

    static okio.ByteString checkLowercase(okio.ByteString r4) throws java.io.IOException {
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L30
            byte r2 = r4.getByte(r1)
            r3 = 65
            if (r2 < r3) goto L2d
            r3 = 90
            if (r2 <= r3) goto L14
            goto L2d
        L14:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PROTOCOL_ERROR response malformed: mixed case name: "
            r1.<init>(r2)
            java.lang.String r4 = r4.utf8()
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2d:
            int r1 = r1 + 1
            goto L5
        L30:
            return r4
    }

    private static java.util.Map<okio.ByteString, java.lang.Integer> nameToFirstIndex() {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            okhttp3.internal.http2.Header[] r1 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r1 = r1.length
            r0.<init>(r1)
            r1 = 0
        L9:
            okhttp3.internal.http2.Header[] r2 = okhttp3.internal.http2.Hpack.STATIC_HEADER_TABLE
            int r3 = r2.length
            if (r1 >= r3) goto L26
            r3 = r2[r1]
            okio.ByteString r3 = r3.name
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L23
            r2 = r2[r1]
            okio.ByteString r2 = r2.name
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r3)
        L23:
            int r1 = r1 + 1
            goto L9
        L26:
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
            return r0
    }
}
