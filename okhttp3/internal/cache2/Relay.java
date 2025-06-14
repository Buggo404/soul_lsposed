package okhttp3.internal.cache2;

/* loaded from: classes.dex */
final class Relay {
    private static final long FILE_HEADER_SIZE = 32;
    static final okio.ByteString PREFIX_CLEAN = null;
    static final okio.ByteString PREFIX_DIRTY = null;
    private static final int SOURCE_FILE = 2;
    private static final int SOURCE_UPSTREAM = 1;
    final okio.Buffer buffer;
    final long bufferMaxSize;
    boolean complete;
    java.io.RandomAccessFile file;
    private final okio.ByteString metadata;
    int sourceCount;
    okio.Source upstream;
    final okio.Buffer upstreamBuffer;
    long upstreamPos;
    java.lang.Thread upstreamReader;

    class RelaySource implements okio.Source {
        private okhttp3.internal.cache2.FileOperator fileOperator;
        private long sourcePos;
        final /* synthetic */ okhttp3.internal.cache2.Relay this$0;
        private final okio.Timeout timeout;

        RelaySource(okhttp3.internal.cache2.Relay r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                okio.Timeout r0 = new okio.Timeout
                r0.<init>()
                r1.timeout = r0
                okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
                java.io.RandomAccessFile r2 = r2.file
                java.nio.channels.FileChannel r2 = r2.getChannel()
                r0.<init>(r2)
                r1.fileOperator = r0
                return
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
                r4 = this;
                okhttp3.internal.cache2.FileOperator r0 = r4.fileOperator
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r4.fileOperator = r0
                okhttp3.internal.cache2.Relay r1 = r4.this$0
                monitor-enter(r1)
                okhttp3.internal.cache2.Relay r2 = r4.this$0     // Catch: java.lang.Throwable -> L29
                int r3 = r2.sourceCount     // Catch: java.lang.Throwable -> L29
                int r3 = r3 + (-1)
                r2.sourceCount = r3     // Catch: java.lang.Throwable -> L29
                okhttp3.internal.cache2.Relay r2 = r4.this$0     // Catch: java.lang.Throwable -> L29
                int r2 = r2.sourceCount     // Catch: java.lang.Throwable -> L29
                if (r2 != 0) goto L22
                okhttp3.internal.cache2.Relay r2 = r4.this$0     // Catch: java.lang.Throwable -> L29
                java.io.RandomAccessFile r2 = r2.file     // Catch: java.lang.Throwable -> L29
                okhttp3.internal.cache2.Relay r3 = r4.this$0     // Catch: java.lang.Throwable -> L29
                r3.file = r0     // Catch: java.lang.Throwable -> L29
                r0 = r2
            L22:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
                if (r0 == 0) goto L28
                okhttp3.internal.Util.closeQuietly(r0)
            L28:
                return
            L29:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
                throw r0
        }

        @Override // okio.Source
        public long read(okio.Buffer r22, long r23) throws java.io.IOException {
                r21 = this;
                r1 = r21
                r2 = r23
                okhttp3.internal.cache2.FileOperator r0 = r1.fileOperator
                if (r0 == 0) goto L139
                okhttp3.internal.cache2.Relay r4 = r1.this$0
                monitor-enter(r4)
            Lb:
                long r5 = r1.sourcePos     // Catch: java.lang.Throwable -> L136
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                long r7 = r0.upstreamPos     // Catch: java.lang.Throwable -> L136
                int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                r5 = 2
                r9 = -1
                if (r0 != 0) goto L39
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                boolean r0 = r0.complete     // Catch: java.lang.Throwable -> L136
                if (r0 == 0) goto L20
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L136
                return r9
            L20:
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                java.lang.Thread r0 = r0.upstreamReader     // Catch: java.lang.Throwable -> L136
                if (r0 == 0) goto L2e
                okio.Timeout r0 = r1.timeout     // Catch: java.lang.Throwable -> L136
                okhttp3.internal.cache2.Relay r5 = r1.this$0     // Catch: java.lang.Throwable -> L136
                r0.waitUntilNotified(r5)     // Catch: java.lang.Throwable -> L136
                goto Lb
            L2e:
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                java.lang.Thread r6 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L136
                r0.upstreamReader = r6     // Catch: java.lang.Throwable -> L136
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L136
                r0 = 1
                goto L4b
            L39:
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                okio.Buffer r0 = r0.buffer     // Catch: java.lang.Throwable -> L136
                long r11 = r0.size()     // Catch: java.lang.Throwable -> L136
                long r11 = r7 - r11
                long r13 = r1.sourcePos     // Catch: java.lang.Throwable -> L136
                int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r0 >= 0) goto L11b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L136
                r0 = r5
            L4b:
                r11 = 32
                if (r0 != r5) goto L69
                long r4 = r1.sourcePos
                long r7 = r7 - r4
                long r2 = java.lang.Math.min(r2, r7)
                okhttp3.internal.cache2.FileOperator r13 = r1.fileOperator
                long r4 = r1.sourcePos
                long r14 = r4 + r11
                r16 = r22
                r17 = r2
                r13.read(r14, r16, r17)
                long r4 = r1.sourcePos
                long r4 = r4 + r2
                r1.sourcePos = r4
                return r2
            L69:
                r4 = 0
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L109
                okio.Source r0 = r0.upstream     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r5 = r1.this$0     // Catch: java.lang.Throwable -> L109
                okio.Buffer r5 = r5.upstreamBuffer     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r6 = r1.this$0     // Catch: java.lang.Throwable -> L109
                long r13 = r6.bufferMaxSize     // Catch: java.lang.Throwable -> L109
                long r5 = r0.read(r5, r13)     // Catch: java.lang.Throwable -> L109
                int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r0 != 0) goto L94
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L109
                r0.commit(r7)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L91
                r0.upstreamReader = r4     // Catch: java.lang.Throwable -> L91
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L91
                r0.notifyAll()     // Catch: java.lang.Throwable -> L91
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L91
                return r9
            L91:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L91
                throw r0
            L94:
                long r2 = java.lang.Math.min(r5, r2)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L109
                okio.Buffer r13 = r0.upstreamBuffer     // Catch: java.lang.Throwable -> L109
                r15 = 0
                r14 = r22
                r17 = r2
                r13.copyTo(r14, r15, r17)     // Catch: java.lang.Throwable -> L109
                long r9 = r1.sourcePos     // Catch: java.lang.Throwable -> L109
                long r9 = r9 + r2
                r1.sourcePos = r9     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.FileOperator r15 = r1.fileOperator     // Catch: java.lang.Throwable -> L109
                long r16 = r7 + r11
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L109
                okio.Buffer r0 = r0.upstreamBuffer     // Catch: java.lang.Throwable -> L109
                okio.Buffer r18 = r0.m357clone()     // Catch: java.lang.Throwable -> L109
                r19 = r5
                r15.write(r16, r18, r19)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r7 = r1.this$0     // Catch: java.lang.Throwable -> L109
                monitor-enter(r7)     // Catch: java.lang.Throwable -> L109
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L106
                okio.Buffer r0 = r0.buffer     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r8 = r1.this$0     // Catch: java.lang.Throwable -> L106
                okio.Buffer r8 = r8.upstreamBuffer     // Catch: java.lang.Throwable -> L106
                r0.write(r8, r5)     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L106
                okio.Buffer r0 = r0.buffer     // Catch: java.lang.Throwable -> L106
                long r8 = r0.size()     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L106
                long r10 = r0.bufferMaxSize     // Catch: java.lang.Throwable -> L106
                int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
                if (r0 <= 0) goto Led
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L106
                okio.Buffer r0 = r0.buffer     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r8 = r1.this$0     // Catch: java.lang.Throwable -> L106
                okio.Buffer r8 = r8.buffer     // Catch: java.lang.Throwable -> L106
                long r8 = r8.size()     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r10 = r1.this$0     // Catch: java.lang.Throwable -> L106
                long r10 = r10.bufferMaxSize     // Catch: java.lang.Throwable -> L106
                long r8 = r8 - r10
                r0.skip(r8)     // Catch: java.lang.Throwable -> L106
            Led:
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L106
                long r8 = r0.upstreamPos     // Catch: java.lang.Throwable -> L106
                long r8 = r8 + r5
                r0.upstreamPos = r8     // Catch: java.lang.Throwable -> L106
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L106
                okhttp3.internal.cache2.Relay r5 = r1.this$0
                monitor-enter(r5)
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L103
                r0.upstreamReader = r4     // Catch: java.lang.Throwable -> L103
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L103
                r0.notifyAll()     // Catch: java.lang.Throwable -> L103
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L103
                return r2
            L103:
                r0 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L103
                throw r0
            L106:
                r0 = move-exception
                monitor-exit(r7)     // Catch: java.lang.Throwable -> L106
                throw r0     // Catch: java.lang.Throwable -> L109
            L109:
                r0 = move-exception
                okhttp3.internal.cache2.Relay r2 = r1.this$0
                monitor-enter(r2)
                okhttp3.internal.cache2.Relay r3 = r1.this$0     // Catch: java.lang.Throwable -> L118
                r3.upstreamReader = r4     // Catch: java.lang.Throwable -> L118
                okhttp3.internal.cache2.Relay r3 = r1.this$0     // Catch: java.lang.Throwable -> L118
                r3.notifyAll()     // Catch: java.lang.Throwable -> L118
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L118
                throw r0
            L118:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L118
                throw r0
            L11b:
                long r7 = r7 - r13
                long r2 = java.lang.Math.min(r2, r7)     // Catch: java.lang.Throwable -> L136
                okhttp3.internal.cache2.Relay r0 = r1.this$0     // Catch: java.lang.Throwable -> L136
                okio.Buffer r13 = r0.buffer     // Catch: java.lang.Throwable -> L136
                long r5 = r1.sourcePos     // Catch: java.lang.Throwable -> L136
                long r15 = r5 - r11
                r14 = r22
                r17 = r2
                r13.copyTo(r14, r15, r17)     // Catch: java.lang.Throwable -> L136
                long r5 = r1.sourcePos     // Catch: java.lang.Throwable -> L136
                long r5 = r5 + r2
                r1.sourcePos = r5     // Catch: java.lang.Throwable -> L136
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L136
                return r2
            L136:
                r0 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L136
                throw r0
            L139:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r2 = "closed"
                r0.<init>(r2)
                throw r0
        }

        @Override // okio.Source
        public okio.Timeout timeout() {
                r1 = this;
                okio.Timeout r0 = r1.timeout
                return r0
        }
    }

    static {
            java.lang.String r0 = "OkHttp cache v1\n"
            okio.ByteString r0 = okio.ByteString.encodeUtf8(r0)
            okhttp3.internal.cache2.Relay.PREFIX_CLEAN = r0
            java.lang.String r0 = "OkHttp DIRTY :(\n"
            okio.ByteString r0 = okio.ByteString.encodeUtf8(r0)
            okhttp3.internal.cache2.Relay.PREFIX_DIRTY = r0
            return
    }

    private Relay(java.io.RandomAccessFile r2, okio.Source r3, long r4, okio.ByteString r6, long r7) {
            r1 = this;
            r1.<init>()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.upstreamBuffer = r0
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1.buffer = r0
            r1.file = r2
            r1.upstream = r3
            if (r3 != 0) goto L19
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            r1.complete = r2
            r1.upstreamPos = r4
            r1.metadata = r6
            r1.bufferMaxSize = r7
            return
    }

    public static okhttp3.internal.cache2.Relay edit(java.io.File r9, okio.Source r10, okio.ByteString r11, long r12) throws java.io.IOException {
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r8.<init>(r9, r0)
            okhttp3.internal.cache2.Relay r9 = new okhttp3.internal.cache2.Relay
            r3 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r5 = r11
            r6 = r12
            r0.<init>(r1, r2, r3, r5, r6)
            r10 = 0
            r8.setLength(r10)
            okio.ByteString r2 = okhttp3.internal.cache2.Relay.PREFIX_DIRTY
            r3 = -1
            r5 = -1
            r1 = r9
            r1.writeHeader(r2, r3, r5)
            return r9
    }

    public static okhttp3.internal.cache2.Relay read(java.io.File r10) throws java.io.IOException {
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile
            java.lang.String r0 = "rw"
            r1.<init>(r10, r0)
            okhttp3.internal.cache2.FileOperator r10 = new okhttp3.internal.cache2.FileOperator
            java.nio.channels.FileChannel r0 = r1.getChannel()
            r10.<init>(r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r3 = 0
            r6 = 32
            r2 = r10
            r5 = r0
            r2.read(r3, r5, r6)
            okio.ByteString r2 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
            int r3 = r2.size()
            long r3 = (long) r3
            okio.ByteString r3 = r0.readByteString(r3)
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L54
            long r8 = r0.readLong()
            long r6 = r0.readLong()
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r2 = 32
            long r3 = r8 + r2
            r2 = r10
            r5 = r0
            r2.read(r3, r5, r6)
            okio.ByteString r5 = r0.readByteString()
            okhttp3.internal.cache2.Relay r10 = new okhttp3.internal.cache2.Relay
            r2 = 0
            r6 = 0
            r0 = r10
            r3 = r8
            r0.<init>(r1, r2, r3, r5, r6)
            return r10
        L54:
            java.io.IOException r10 = new java.io.IOException
            java.lang.String r0 = "unreadable cache file"
            r10.<init>(r0)
            throw r10
    }

    private void writeHeader(okio.ByteString r7, long r8, long r10) throws java.io.IOException {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            r3.write(r7)
            r3.writeLong(r8)
            r3.writeLong(r10)
            long r7 = r3.size()
            r9 = 32
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 != 0) goto L2b
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r7 = r6.file
            java.nio.channels.FileChannel r7 = r7.getChannel()
            r0.<init>(r7)
            r1 = 0
            r4 = 32
            r0.write(r1, r3, r4)
            return
        L2b:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            r7.<init>()
            throw r7
    }

    private void writeMetadata(long r7) throws java.io.IOException {
            r6 = this;
            okio.Buffer r3 = new okio.Buffer
            r3.<init>()
            okio.ByteString r0 = r6.metadata
            r3.write(r0)
            okhttp3.internal.cache2.FileOperator r0 = new okhttp3.internal.cache2.FileOperator
            java.io.RandomAccessFile r1 = r6.file
            java.nio.channels.FileChannel r1 = r1.getChannel()
            r0.<init>(r1)
            r1 = 32
            long r1 = r1 + r7
            okio.ByteString r7 = r6.metadata
            int r7 = r7.size()
            long r4 = (long) r7
            r0.write(r1, r3, r4)
            return
    }

    void commit(long r9) throws java.io.IOException {
            r8 = this;
            r8.writeMetadata(r9)
            java.io.RandomAccessFile r0 = r8.file
            java.nio.channels.FileChannel r0 = r0.getChannel()
            r1 = 0
            r0.force(r1)
            okio.ByteString r3 = okhttp3.internal.cache2.Relay.PREFIX_CLEAN
            okio.ByteString r0 = r8.metadata
            int r0 = r0.size()
            long r6 = (long) r0
            r2 = r8
            r4 = r9
            r2.writeHeader(r3, r4, r6)
            java.io.RandomAccessFile r9 = r8.file
            java.nio.channels.FileChannel r9 = r9.getChannel()
            r9.force(r1)
            monitor-enter(r8)
            r9 = 1
            r8.complete = r9     // Catch: java.lang.Throwable -> L32
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            okio.Source r9 = r8.upstream
            okhttp3.internal.Util.closeQuietly(r9)
            r9 = 0
            r8.upstream = r9
            return
        L32:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L32
            throw r9
    }

    boolean isClosed() {
            r1 = this;
            java.io.RandomAccessFile r0 = r1.file
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public okio.ByteString metadata() {
            r1 = this;
            okio.ByteString r0 = r1.metadata
            return r0
    }

    public okio.Source newSource() {
            r1 = this;
            monitor-enter(r1)
            java.io.RandomAccessFile r0 = r1.file     // Catch: java.lang.Throwable -> L15
            if (r0 != 0) goto L8
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            r0 = 0
            return r0
        L8:
            int r0 = r1.sourceCount     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r1.sourceCount = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            okhttp3.internal.cache2.Relay$RelaySource r0 = new okhttp3.internal.cache2.Relay$RelaySource
            r0.<init>(r1)
            return r0
        L15:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L15
            throw r0
    }
}
