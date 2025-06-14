package com.jakewharton.disklrucache;

/* loaded from: classes.dex */
public final class DiskLruCache implements java.io.Closeable {
    static final long ANY_SEQUENCE_NUMBER = -1;
    private static final java.lang.String CLEAN = "CLEAN";
    private static final java.lang.String DIRTY = "DIRTY";
    static final java.lang.String JOURNAL_FILE = "journal";
    static final java.lang.String JOURNAL_FILE_BACKUP = "journal.bkp";
    static final java.lang.String JOURNAL_FILE_TEMP = "journal.tmp";
    static final java.util.regex.Pattern LEGAL_KEY_PATTERN = null;
    static final java.lang.String MAGIC = "libcore.io.DiskLruCache";
    private static final java.io.OutputStream NULL_OUTPUT_STREAM = null;
    private static final java.lang.String READ = "READ";
    private static final java.lang.String REMOVE = "REMOVE";
    static final java.lang.String VERSION_1 = "1";
    private final int appVersion;
    private final java.util.concurrent.Callable<java.lang.Void> cleanupCallable;
    private final java.io.File directory;
    final java.util.concurrent.ThreadPoolExecutor executorService;
    private final java.io.File journalFile;
    private final java.io.File journalFileBackup;
    private final java.io.File journalFileTmp;
    private java.io.Writer journalWriter;
    private final java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache.Entry> lruEntries;
    private long maxSize;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;



    public final class Editor {
        private boolean committed;
        private final com.jakewharton.disklrucache.DiskLruCache.Entry entry;
        private boolean hasErrors;
        final /* synthetic */ com.jakewharton.disklrucache.DiskLruCache this$0;
        private final boolean[] written;

        private class FaultHidingOutputStream extends java.io.FilterOutputStream {
            final /* synthetic */ com.jakewharton.disklrucache.DiskLruCache.Editor this$1;

            private FaultHidingOutputStream(com.jakewharton.disklrucache.DiskLruCache.Editor r1, java.io.OutputStream r2) {
                    r0 = this;
                    r0.this$1 = r1
                    r0.<init>(r2)
                    return
            }

            /* synthetic */ FaultHidingOutputStream(com.jakewharton.disklrucache.DiskLruCache.Editor r1, java.io.OutputStream r2, com.jakewharton.disklrucache.DiskLruCache.CallableC08661 r3) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                    r2 = this;
                    java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L6
                    r0.close()     // Catch: java.io.IOException -> L6
                    goto Lc
                L6:
                    com.jakewharton.disklrucache.DiskLruCache$Editor r0 = r2.this$1
                    r1 = 1
                    com.jakewharton.disklrucache.DiskLruCache.Editor.access$2302(r0, r1)
                Lc:
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                    r2 = this;
                    java.io.OutputStream r0 = r2.out     // Catch: java.io.IOException -> L6
                    r0.flush()     // Catch: java.io.IOException -> L6
                    goto Lc
                L6:
                    com.jakewharton.disklrucache.DiskLruCache$Editor r0 = r2.this$1
                    r1 = 1
                    com.jakewharton.disklrucache.DiskLruCache.Editor.access$2302(r0, r1)
                Lc:
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int r2) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2)     // Catch: java.io.IOException -> L6
                    goto Lc
                L6:
                    com.jakewharton.disklrucache.DiskLruCache$Editor r2 = r1.this$1
                    r0 = 1
                    com.jakewharton.disklrucache.DiskLruCache.Editor.access$2302(r2, r0)
                Lc:
                    return
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] r2, int r3, int r4) {
                    r1 = this;
                    java.io.OutputStream r0 = r1.out     // Catch: java.io.IOException -> L6
                    r0.write(r2, r3, r4)     // Catch: java.io.IOException -> L6
                    goto Lc
                L6:
                    com.jakewharton.disklrucache.DiskLruCache$Editor r2 = r1.this$1
                    r3 = 1
                    com.jakewharton.disklrucache.DiskLruCache.Editor.access$2302(r2, r3)
                Lc:
                    return
            }
        }

        private Editor(com.jakewharton.disklrucache.DiskLruCache r1, com.jakewharton.disklrucache.DiskLruCache.Entry r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.entry = r2
                boolean r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r2)
                if (r2 == 0) goto Lf
                r1 = 0
                goto L15
            Lf:
                int r1 = com.jakewharton.disklrucache.DiskLruCache.access$1800(r1)
                boolean[] r1 = new boolean[r1]
            L15:
                r0.written = r1
                return
        }

        /* synthetic */ Editor(com.jakewharton.disklrucache.DiskLruCache r1, com.jakewharton.disklrucache.DiskLruCache.Entry r2, com.jakewharton.disklrucache.DiskLruCache.CallableC08661 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ com.jakewharton.disklrucache.DiskLruCache.Entry access$1400(com.jakewharton.disklrucache.DiskLruCache.Editor r0) {
                com.jakewharton.disklrucache.DiskLruCache$Entry r0 = r0.entry
                return r0
        }

        static /* synthetic */ boolean[] access$1500(com.jakewharton.disklrucache.DiskLruCache.Editor r0) {
                boolean[] r0 = r0.written
                return r0
        }

        static /* synthetic */ boolean access$2302(com.jakewharton.disklrucache.DiskLruCache.Editor r0, boolean r1) {
                r0.hasErrors = r1
                return r1
        }

        public void abort() throws java.io.IOException {
                r2 = this;
                com.jakewharton.disklrucache.DiskLruCache r0 = r2.this$0
                r1 = 0
                com.jakewharton.disklrucache.DiskLruCache.access$2200(r0, r2, r1)
                return
        }

        public void abortUnlessCommitted() {
                r1 = this;
                boolean r0 = r1.committed
                if (r0 != 0) goto L7
                r1.abort()     // Catch: java.io.IOException -> L7
            L7:
                return
        }

        public void commit() throws java.io.IOException {
                r3 = this;
                boolean r0 = r3.hasErrors
                r1 = 1
                if (r0 == 0) goto L17
                com.jakewharton.disklrucache.DiskLruCache r0 = r3.this$0
                r2 = 0
                com.jakewharton.disklrucache.DiskLruCache.access$2200(r0, r3, r2)
                com.jakewharton.disklrucache.DiskLruCache r0 = r3.this$0
                com.jakewharton.disklrucache.DiskLruCache$Entry r2 = r3.entry
                java.lang.String r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r2)
                r0.remove(r2)
                goto L1c
            L17:
                com.jakewharton.disklrucache.DiskLruCache r0 = r3.this$0
                com.jakewharton.disklrucache.DiskLruCache.access$2200(r0, r3, r1)
            L1c:
                r3.committed = r1
                return
        }

        public java.lang.String getString(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.newInputStream(r1)
                if (r1 == 0) goto Lb
                java.lang.String r1 = com.jakewharton.disklrucache.DiskLruCache.access$1700(r1)
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        public java.io.InputStream newInputStream(int r5) throws java.io.IOException {
                r4 = this;
                com.jakewharton.disklrucache.DiskLruCache r0 = r4.this$0
                monitor-enter(r0)
                com.jakewharton.disklrucache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L2b
                com.jakewharton.disklrucache.DiskLruCache$Editor r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L2b
                if (r1 != r4) goto L25
                com.jakewharton.disklrucache.DiskLruCache$Entry r1 = r4.entry     // Catch: java.lang.Throwable -> L2b
                boolean r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r1)     // Catch: java.lang.Throwable -> L2b
                r2 = 0
                if (r1 != 0) goto L16
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r2
            L16:
                java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                com.jakewharton.disklrucache.DiskLruCache$Entry r3 = r4.entry     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                java.io.File r5 = r3.getCleanFile(r5)     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                r1.<init>(r5)     // Catch: java.io.FileNotFoundException -> L23 java.lang.Throwable -> L2b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r1
            L23:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return r2
            L25:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2b
                r5.<init>()     // Catch: java.lang.Throwable -> L2b
                throw r5     // Catch: java.lang.Throwable -> L2b
            L2b:
                r5 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r5
        }

        public java.io.OutputStream newOutputStream(int r4) throws java.io.IOException {
                r3 = this;
                com.jakewharton.disklrucache.DiskLruCache r0 = r3.this$0
                monitor-enter(r0)
                com.jakewharton.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L46
                com.jakewharton.disklrucache.DiskLruCache$Editor r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L46
                if (r1 != r3) goto L40
                com.jakewharton.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L46
                boolean r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r1)     // Catch: java.lang.Throwable -> L46
                if (r1 != 0) goto L18
                boolean[] r1 = r3.written     // Catch: java.lang.Throwable -> L46
                r2 = 1
                r1[r4] = r2     // Catch: java.lang.Throwable -> L46
            L18:
                com.jakewharton.disklrucache.DiskLruCache$Entry r1 = r3.entry     // Catch: java.lang.Throwable -> L46
                java.io.File r4 = r1.getDirtyFile(r4)     // Catch: java.lang.Throwable -> L46
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L24 java.lang.Throwable -> L46
                r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L24 java.lang.Throwable -> L46
                goto L32
            L24:
                com.jakewharton.disklrucache.DiskLruCache r1 = r3.this$0     // Catch: java.lang.Throwable -> L46
                java.io.File r1 = com.jakewharton.disklrucache.DiskLruCache.access$1900(r1)     // Catch: java.lang.Throwable -> L46
                r1.mkdirs()     // Catch: java.lang.Throwable -> L46
                java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L3a java.lang.Throwable -> L46
                r1.<init>(r4)     // Catch: java.io.FileNotFoundException -> L3a java.lang.Throwable -> L46
            L32:
                com.jakewharton.disklrucache.DiskLruCache$Editor$FaultHidingOutputStream r4 = new com.jakewharton.disklrucache.DiskLruCache$Editor$FaultHidingOutputStream     // Catch: java.lang.Throwable -> L46
                r2 = 0
                r4.<init>(r3, r1, r2)     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                return r4
            L3a:
                java.io.OutputStream r4 = com.jakewharton.disklrucache.DiskLruCache.access$2000()     // Catch: java.lang.Throwable -> L46
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                return r4
            L40:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L46
                r4.<init>()     // Catch: java.lang.Throwable -> L46
                throw r4     // Catch: java.lang.Throwable -> L46
            L46:
                r4 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
                throw r4
        }

        public void set(int r4, java.lang.String r5) throws java.io.IOException {
                r3 = this;
                r0 = 0
                java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L16
                java.io.OutputStream r4 = r3.newOutputStream(r4)     // Catch: java.lang.Throwable -> L16
                java.nio.charset.Charset r2 = com.jakewharton.disklrucache.Util.UTF_8     // Catch: java.lang.Throwable -> L16
                r1.<init>(r4, r2)     // Catch: java.lang.Throwable -> L16
                r1.write(r5)     // Catch: java.lang.Throwable -> L13
                com.jakewharton.disklrucache.Util.closeQuietly(r1)
                return
            L13:
                r4 = move-exception
                r0 = r1
                goto L17
            L16:
                r4 = move-exception
            L17:
                com.jakewharton.disklrucache.Util.closeQuietly(r0)
                throw r4
        }
    }

    private final class Entry {
        private com.jakewharton.disklrucache.DiskLruCache.Editor currentEditor;
        private final java.lang.String key;
        private final long[] lengths;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ com.jakewharton.disklrucache.DiskLruCache this$0;

        private Entry(com.jakewharton.disklrucache.DiskLruCache r1, java.lang.String r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                int r1 = com.jakewharton.disklrucache.DiskLruCache.access$1800(r1)
                long[] r1 = new long[r1]
                r0.lengths = r1
                return
        }

        /* synthetic */ Entry(com.jakewharton.disklrucache.DiskLruCache r1, java.lang.String r2, com.jakewharton.disklrucache.DiskLruCache.CallableC08661 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ long[] access$1000(com.jakewharton.disklrucache.DiskLruCache.Entry r0) {
                long[] r0 = r0.lengths
                return r0
        }

        static /* synthetic */ java.lang.String access$1100(com.jakewharton.disklrucache.DiskLruCache.Entry r0) {
                java.lang.String r0 = r0.key
                return r0
        }

        static /* synthetic */ long access$1200(com.jakewharton.disklrucache.DiskLruCache.Entry r2) {
                long r0 = r2.sequenceNumber
                return r0
        }

        static /* synthetic */ long access$1202(com.jakewharton.disklrucache.DiskLruCache.Entry r0, long r1) {
                r0.sequenceNumber = r1
                return r1
        }

        static /* synthetic */ boolean access$600(com.jakewharton.disklrucache.DiskLruCache.Entry r0) {
                boolean r0 = r0.readable
                return r0
        }

        static /* synthetic */ boolean access$602(com.jakewharton.disklrucache.DiskLruCache.Entry r0, boolean r1) {
                r0.readable = r1
                return r1
        }

        static /* synthetic */ com.jakewharton.disklrucache.DiskLruCache.Editor access$700(com.jakewharton.disklrucache.DiskLruCache.Entry r0) {
                com.jakewharton.disklrucache.DiskLruCache$Editor r0 = r0.currentEditor
                return r0
        }

        static /* synthetic */ com.jakewharton.disklrucache.DiskLruCache.Editor access$702(com.jakewharton.disklrucache.DiskLruCache.Entry r0, com.jakewharton.disklrucache.DiskLruCache.Editor r1) {
                r0.currentEditor = r1
                return r1
        }

        static /* synthetic */ void access$800(com.jakewharton.disklrucache.DiskLruCache.Entry r0, java.lang.String[] r1) throws java.io.IOException {
                r0.setLengths(r1)
                return
        }

        private java.io.IOException invalidLengths(java.lang.String[] r4) throws java.io.IOException {
                r3 = this;
                java.io.IOException r0 = new java.io.IOException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "unexpected journal line: "
                r1.<init>(r2)
                java.lang.String r4 = java.util.Arrays.toString(r4)
                java.lang.StringBuilder r4 = r1.append(r4)
                java.lang.String r4 = r4.toString()
                r0.<init>(r4)
                throw r0
        }

        private void setLengths(java.lang.String[] r5) throws java.io.IOException {
                r4 = this;
                int r0 = r5.length
                com.jakewharton.disklrucache.DiskLruCache r1 = r4.this$0
                int r1 = com.jakewharton.disklrucache.DiskLruCache.access$1800(r1)
                if (r0 != r1) goto L20
                r0 = 0
            La:
                int r1 = r5.length     // Catch: java.lang.NumberFormatException -> L1b
                if (r0 >= r1) goto L1a
                long[] r1 = r4.lengths     // Catch: java.lang.NumberFormatException -> L1b
                r2 = r5[r0]     // Catch: java.lang.NumberFormatException -> L1b
                long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L1b
                r1[r0] = r2     // Catch: java.lang.NumberFormatException -> L1b
                int r0 = r0 + 1
                goto La
            L1a:
                return
            L1b:
                java.io.IOException r5 = r4.invalidLengths(r5)
                throw r5
            L20:
                java.io.IOException r5 = r4.invalidLengths(r5)
                throw r5
        }

        public java.io.File getCleanFile(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.jakewharton.disklrucache.DiskLruCache r1 = r4.this$0
                java.io.File r1 = com.jakewharton.disklrucache.DiskLruCache.access$1900(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.key
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.String r5 = r5.toString()
                r0.<init>(r1, r5)
                return r0
        }

        public java.io.File getDirtyFile(int r5) {
                r4 = this;
                java.io.File r0 = new java.io.File
                com.jakewharton.disklrucache.DiskLruCache r1 = r4.this$0
                java.io.File r1 = com.jakewharton.disklrucache.DiskLruCache.access$1900(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = r4.key
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.String r3 = "."
                java.lang.StringBuilder r2 = r2.append(r3)
                java.lang.StringBuilder r5 = r2.append(r5)
                java.lang.String r2 = ".tmp"
                java.lang.StringBuilder r5 = r5.append(r2)
                java.lang.String r5 = r5.toString()
                r0.<init>(r1, r5)
                return r0
        }

        public java.lang.String getLengths() throws java.io.IOException {
                r7 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                long[] r1 = r7.lengths
                int r2 = r1.length
                r3 = 0
            L9:
                if (r3 >= r2) goto L19
                r4 = r1[r3]
                r6 = 32
                java.lang.StringBuilder r6 = r0.append(r6)
                r6.append(r4)
                int r3 = r3 + 1
                goto L9
            L19:
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    public final class Snapshot implements java.io.Closeable {
        private final java.io.InputStream[] ins;
        private final java.lang.String key;
        private final long[] lengths;
        private final long sequenceNumber;
        final /* synthetic */ com.jakewharton.disklrucache.DiskLruCache this$0;

        private Snapshot(com.jakewharton.disklrucache.DiskLruCache r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.key = r2
                r0.sequenceNumber = r3
                r0.ins = r5
                r0.lengths = r6
                return
        }

        /* synthetic */ Snapshot(com.jakewharton.disklrucache.DiskLruCache r1, java.lang.String r2, long r3, java.io.InputStream[] r5, long[] r6, com.jakewharton.disklrucache.DiskLruCache.CallableC08661 r7) {
                r0 = this;
                r0.<init>(r1, r2, r3, r5, r6)
                return
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
                r4 = this;
                java.io.InputStream[] r0 = r4.ins
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto Le
                r3 = r0[r2]
                com.jakewharton.disklrucache.Util.closeQuietly(r3)
                int r2 = r2 + 1
                goto L4
            Le:
                return
        }

        public com.jakewharton.disklrucache.DiskLruCache.Editor edit() throws java.io.IOException {
                r4 = this;
                com.jakewharton.disklrucache.DiskLruCache r0 = r4.this$0
                java.lang.String r1 = r4.key
                long r2 = r4.sequenceNumber
                com.jakewharton.disklrucache.DiskLruCache$Editor r0 = com.jakewharton.disklrucache.DiskLruCache.access$1600(r0, r1, r2)
                return r0
        }

        public java.io.InputStream getInputStream(int r2) {
                r1 = this;
                java.io.InputStream[] r0 = r1.ins
                r2 = r0[r2]
                return r2
        }

        public long getLength(int r4) {
                r3 = this;
                long[] r0 = r3.lengths
                r1 = r0[r4]
                return r1
        }

        public java.lang.String getString(int r1) throws java.io.IOException {
                r0 = this;
                java.io.InputStream r1 = r0.getInputStream(r1)
                java.lang.String r1 = com.jakewharton.disklrucache.DiskLruCache.access$1700(r1)
                return r1
        }
    }

    static {
            java.lang.String r0 = "[a-z0-9_-]{1,64}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.jakewharton.disklrucache.DiskLruCache.LEGAL_KEY_PATTERN = r0
            com.jakewharton.disklrucache.DiskLruCache$2 r0 = new com.jakewharton.disklrucache.DiskLruCache$2
            r0.<init>()
            com.jakewharton.disklrucache.DiskLruCache.NULL_OUTPUT_STREAM = r0
            return
    }

    private DiskLruCache(java.io.File r16, int r17, int r18, long r19) {
            r15 = this;
            r0 = r15
            r1 = r16
            r15.<init>()
            r2 = 0
            r0.size = r2
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r5 = 1061158912(0x3f400000, float:0.75)
            r6 = 1
            r7 = 0
            r4.<init>(r7, r5, r6)
            r0.lruEntries = r4
            r0.nextSequenceNumber = r2
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            r9 = 0
            r10 = 1
            r11 = 60
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r14 = new java.util.concurrent.LinkedBlockingQueue
            r14.<init>()
            r8 = r2
            r8.<init>(r9, r10, r11, r13, r14)
            r0.executorService = r2
            com.jakewharton.disklrucache.DiskLruCache$1 r2 = new com.jakewharton.disklrucache.DiskLruCache$1
            r2.<init>(r15)
            r0.cleanupCallable = r2
            r0.directory = r1
            r2 = r17
            r0.appVersion = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal"
            r2.<init>(r1, r3)
            r0.journalFile = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.tmp"
            r2.<init>(r1, r3)
            r0.journalFileTmp = r2
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "journal.bkp"
            r2.<init>(r1, r3)
            r0.journalFileBackup = r2
            r1 = r18
            r0.valueCount = r1
            r1 = r19
            r0.maxSize = r1
            return
    }

    static /* synthetic */ java.io.Writer access$000(com.jakewharton.disklrucache.DiskLruCache r0) {
            java.io.Writer r0 = r0.journalWriter
            return r0
    }

    static /* synthetic */ void access$100(com.jakewharton.disklrucache.DiskLruCache r0) throws java.io.IOException {
            r0.trimToSize()
            return
    }

    static /* synthetic */ com.jakewharton.disklrucache.DiskLruCache.Editor access$1600(com.jakewharton.disklrucache.DiskLruCache r0, java.lang.String r1, long r2) throws java.io.IOException {
            com.jakewharton.disklrucache.DiskLruCache$Editor r0 = r0.edit(r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.String access$1700(java.io.InputStream r0) throws java.io.IOException {
            java.lang.String r0 = inputStreamToString(r0)
            return r0
    }

    static /* synthetic */ int access$1800(com.jakewharton.disklrucache.DiskLruCache r0) {
            int r0 = r0.valueCount
            return r0
    }

    static /* synthetic */ java.io.File access$1900(com.jakewharton.disklrucache.DiskLruCache r0) {
            java.io.File r0 = r0.directory
            return r0
    }

    static /* synthetic */ boolean access$200(com.jakewharton.disklrucache.DiskLruCache r0) {
            boolean r0 = r0.journalRebuildRequired()
            return r0
    }

    static /* synthetic */ java.io.OutputStream access$2000() {
            java.io.OutputStream r0 = com.jakewharton.disklrucache.DiskLruCache.NULL_OUTPUT_STREAM
            return r0
    }

    static /* synthetic */ void access$2200(com.jakewharton.disklrucache.DiskLruCache r0, com.jakewharton.disklrucache.DiskLruCache.Editor r1, boolean r2) throws java.io.IOException {
            r0.completeEdit(r1, r2)
            return
    }

    static /* synthetic */ void access$300(com.jakewharton.disklrucache.DiskLruCache r0) throws java.io.IOException {
            r0.rebuildJournal()
            return
    }

    static /* synthetic */ int access$402(com.jakewharton.disklrucache.DiskLruCache r0, int r1) {
            r0.redundantOpCount = r1
            return r1
    }

    private void checkNotClosed() {
            r2 = this;
            java.io.Writer r0 = r2.journalWriter
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "cache is closed"
            r0.<init>(r1)
            throw r0
    }

    private synchronized void completeEdit(com.jakewharton.disklrucache.DiskLruCache.Editor r10, boolean r11) throws java.io.IOException {
            r9 = this;
            monitor-enter(r9)
            com.jakewharton.disklrucache.DiskLruCache$Entry r0 = com.jakewharton.disklrucache.DiskLruCache.Editor.access$1400(r10)     // Catch: java.lang.Throwable -> L119
            com.jakewharton.disklrucache.DiskLruCache$Editor r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r0)     // Catch: java.lang.Throwable -> L119
            if (r1 != r10) goto L113
            r1 = 0
            if (r11 == 0) goto L4f
            boolean r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r0)     // Catch: java.lang.Throwable -> L119
            if (r2 != 0) goto L4f
            r2 = r1
        L15:
            int r3 = r9.valueCount     // Catch: java.lang.Throwable -> L119
            if (r2 >= r3) goto L4f
            boolean[] r3 = com.jakewharton.disklrucache.DiskLruCache.Editor.access$1500(r10)     // Catch: java.lang.Throwable -> L119
            boolean r3 = r3[r2]     // Catch: java.lang.Throwable -> L119
            if (r3 == 0) goto L33
            java.io.File r3 = r0.getDirtyFile(r2)     // Catch: java.lang.Throwable -> L119
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L119
            if (r3 != 0) goto L30
            r10.abort()     // Catch: java.lang.Throwable -> L119
            monitor-exit(r9)
            return
        L30:
            int r2 = r2 + 1
            goto L15
        L33:
            r10.abort()     // Catch: java.lang.Throwable -> L119
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r11.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = "Newly created entry didn't create value for index "
            java.lang.StringBuilder r11 = r11.append(r0)     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r11 = r11.append(r2)     // Catch: java.lang.Throwable -> L119
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L119
            r10.<init>(r11)     // Catch: java.lang.Throwable -> L119
            throw r10     // Catch: java.lang.Throwable -> L119
        L4f:
            int r10 = r9.valueCount     // Catch: java.lang.Throwable -> L119
            if (r1 >= r10) goto L83
            java.io.File r10 = r0.getDirtyFile(r1)     // Catch: java.lang.Throwable -> L119
            if (r11 == 0) goto L7d
            boolean r2 = r10.exists()     // Catch: java.lang.Throwable -> L119
            if (r2 == 0) goto L80
            java.io.File r2 = r0.getCleanFile(r1)     // Catch: java.lang.Throwable -> L119
            r10.renameTo(r2)     // Catch: java.lang.Throwable -> L119
            long[] r10 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r0)     // Catch: java.lang.Throwable -> L119
            r3 = r10[r1]     // Catch: java.lang.Throwable -> L119
            long r5 = r2.length()     // Catch: java.lang.Throwable -> L119
            long[] r10 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r0)     // Catch: java.lang.Throwable -> L119
            r10[r1] = r5     // Catch: java.lang.Throwable -> L119
            long r7 = r9.size     // Catch: java.lang.Throwable -> L119
            long r7 = r7 - r3
            long r7 = r7 + r5
            r9.size = r7     // Catch: java.lang.Throwable -> L119
            goto L80
        L7d:
            deleteIfExists(r10)     // Catch: java.lang.Throwable -> L119
        L80:
            int r1 = r1 + 1
            goto L4f
        L83:
            int r10 = r9.redundantOpCount     // Catch: java.lang.Throwable -> L119
            r1 = 1
            int r10 = r10 + r1
            r9.redundantOpCount = r10     // Catch: java.lang.Throwable -> L119
            r10 = 0
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$702(r0, r10)     // Catch: java.lang.Throwable -> L119
            boolean r10 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r0)     // Catch: java.lang.Throwable -> L119
            r10 = r10 | r11
            r2 = 10
            if (r10 == 0) goto Lce
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$602(r0, r1)     // Catch: java.lang.Throwable -> L119
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r1.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = "CLEAN "
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L119
            java.lang.String r3 = r0.getLengths()     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r1 = r1.append(r3)     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r1 = r1.append(r2)     // Catch: java.lang.Throwable -> L119
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L119
            r10.write(r1)     // Catch: java.lang.Throwable -> L119
            if (r11 == 0) goto Lf7
            long r10 = r9.nextSequenceNumber     // Catch: java.lang.Throwable -> L119
            r1 = 1
            long r1 = r1 + r10
            r9.nextSequenceNumber = r1     // Catch: java.lang.Throwable -> L119
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$1202(r0, r10)     // Catch: java.lang.Throwable -> L119
            goto Lf7
        Lce:
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r10 = r9.lruEntries     // Catch: java.lang.Throwable -> L119
            java.lang.String r11 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L119
            r10.remove(r11)     // Catch: java.lang.Throwable -> L119
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L119
            r11.<init>()     // Catch: java.lang.Throwable -> L119
            java.lang.String r1 = "REMOVE "
            java.lang.StringBuilder r11 = r11.append(r1)     // Catch: java.lang.Throwable -> L119
            java.lang.String r0 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r0)     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r11 = r11.append(r0)     // Catch: java.lang.Throwable -> L119
            java.lang.StringBuilder r11 = r11.append(r2)     // Catch: java.lang.Throwable -> L119
            java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> L119
            r10.write(r11)     // Catch: java.lang.Throwable -> L119
        Lf7:
            java.io.Writer r10 = r9.journalWriter     // Catch: java.lang.Throwable -> L119
            r10.flush()     // Catch: java.lang.Throwable -> L119
            long r10 = r9.size     // Catch: java.lang.Throwable -> L119
            long r0 = r9.maxSize     // Catch: java.lang.Throwable -> L119
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 > 0) goto L10a
            boolean r10 = r9.journalRebuildRequired()     // Catch: java.lang.Throwable -> L119
            if (r10 == 0) goto L111
        L10a:
            java.util.concurrent.ThreadPoolExecutor r10 = r9.executorService     // Catch: java.lang.Throwable -> L119
            java.util.concurrent.Callable<java.lang.Void> r11 = r9.cleanupCallable     // Catch: java.lang.Throwable -> L119
            r10.submit(r11)     // Catch: java.lang.Throwable -> L119
        L111:
            monitor-exit(r9)
            return
        L113:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L119
            r10.<init>()     // Catch: java.lang.Throwable -> L119
            throw r10     // Catch: java.lang.Throwable -> L119
        L119:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
    }

    private static void deleteIfExists(java.io.File r1) throws java.io.IOException {
            boolean r0 = r1.exists()
            if (r0 == 0) goto L13
            boolean r1 = r1.delete()
            if (r1 == 0) goto Ld
            goto L13
        Ld:
            java.io.IOException r1 = new java.io.IOException
            r1.<init>()
            throw r1
        L13:
            return
    }

    private synchronized com.jakewharton.disklrucache.DiskLruCache.Editor edit(java.lang.String r7, long r8) throws java.io.IOException {
            r6 = this;
            java.lang.String r0 = "DIRTY "
            monitor-enter(r6)
            r6.checkNotClosed()     // Catch: java.lang.Throwable -> L60
            r6.validateKey(r7)     // Catch: java.lang.Throwable -> L60
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r1 = r6.lruEntries     // Catch: java.lang.Throwable -> L60
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.Throwable -> L60
            com.jakewharton.disklrucache.DiskLruCache$Entry r1 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r1     // Catch: java.lang.Throwable -> L60
            r2 = -1
            int r2 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r3 = 0
            if (r2 == 0) goto L24
            if (r1 == 0) goto L22
            long r4 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1200(r1)     // Catch: java.lang.Throwable -> L60
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L24
        L22:
            monitor-exit(r6)
            return r3
        L24:
            if (r1 != 0) goto L31
            com.jakewharton.disklrucache.DiskLruCache$Entry r1 = new com.jakewharton.disklrucache.DiskLruCache$Entry     // Catch: java.lang.Throwable -> L60
            r1.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> L60
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r8 = r6.lruEntries     // Catch: java.lang.Throwable -> L60
            r8.put(r7, r1)     // Catch: java.lang.Throwable -> L60
            goto L39
        L31:
            com.jakewharton.disklrucache.DiskLruCache$Editor r8 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L60
            if (r8 == 0) goto L39
            monitor-exit(r6)
            return r3
        L39:
            com.jakewharton.disklrucache.DiskLruCache$Editor r8 = new com.jakewharton.disklrucache.DiskLruCache$Editor     // Catch: java.lang.Throwable -> L60
            r8.<init>(r6, r1, r3)     // Catch: java.lang.Throwable -> L60
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$702(r1, r8)     // Catch: java.lang.Throwable -> L60
            java.io.Writer r9 = r6.journalWriter     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r7 = r1.append(r7)     // Catch: java.lang.Throwable -> L60
            r0 = 10
            java.lang.StringBuilder r7 = r7.append(r0)     // Catch: java.lang.Throwable -> L60
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L60
            r9.write(r7)     // Catch: java.lang.Throwable -> L60
            java.io.Writer r7 = r6.journalWriter     // Catch: java.lang.Throwable -> L60
            r7.flush()     // Catch: java.lang.Throwable -> L60
            monitor-exit(r6)
            return r8
        L60:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
    }

    private static java.lang.String inputStreamToString(java.io.InputStream r2) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.nio.charset.Charset r1 = com.jakewharton.disklrucache.Util.UTF_8
            r0.<init>(r2, r1)
            java.lang.String r2 = com.jakewharton.disklrucache.Util.readFully(r0)
            return r2
    }

    private boolean journalRebuildRequired() {
            r2 = this;
            int r0 = r2.redundantOpCount
            r1 = 2000(0x7d0, float:2.803E-42)
            if (r0 < r1) goto L10
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r1 = r2.lruEntries
            int r1 = r1.size()
            if (r0 < r1) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public static com.jakewharton.disklrucache.DiskLruCache open(java.io.File r9, int r10, int r11, long r12) throws java.io.IOException {
            r0 = 0
            int r0 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9e
            if (r11 <= 0) goto L96
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "journal.bkp"
            r0.<init>(r9, r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L2a
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "journal"
            r1.<init>(r9, r2)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L26
            r0.delete()
            goto L2a
        L26:
            r2 = 0
            renameTo(r0, r1, r2)
        L2a:
            com.jakewharton.disklrucache.DiskLruCache r0 = new com.jakewharton.disklrucache.DiskLruCache
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            java.io.File r1 = r0.journalFile
            boolean r1 = r1.exists()
            if (r1 == 0) goto L85
            r0.readJournal()     // Catch: java.io.IOException -> L59
            r0.processJournal()     // Catch: java.io.IOException -> L59
            java.io.BufferedWriter r1 = new java.io.BufferedWriter     // Catch: java.io.IOException -> L59
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.io.IOException -> L59
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L59
            java.io.File r4 = r0.journalFile     // Catch: java.io.IOException -> L59
            r5 = 1
            r3.<init>(r4, r5)     // Catch: java.io.IOException -> L59
            java.nio.charset.Charset r4 = com.jakewharton.disklrucache.Util.US_ASCII     // Catch: java.io.IOException -> L59
            r2.<init>(r3, r4)     // Catch: java.io.IOException -> L59
            r1.<init>(r2)     // Catch: java.io.IOException -> L59
            r0.journalWriter = r1     // Catch: java.io.IOException -> L59
            return r0
        L59:
            r1 = move-exception
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DiskLruCache "
            r3.<init>(r4)
            java.lang.StringBuilder r3 = r3.append(r9)
            java.lang.String r4 = " is corrupt: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r1 = r1.getMessage()
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = ", removing"
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.println(r1)
            r0.delete()
        L85:
            r9.mkdirs()
            com.jakewharton.disklrucache.DiskLruCache r0 = new com.jakewharton.disklrucache.DiskLruCache
            r3 = r0
            r4 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r3.<init>(r4, r5, r6, r7)
            r0.rebuildJournal()
            return r0
        L96:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "valueCount <= 0"
            r9.<init>(r10)
            throw r9
        L9e:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "maxSize <= 0"
            r9.<init>(r10)
            throw r9
    }

    private void processJournal() throws java.io.IOException {
            r8 = this;
            java.io.File r0 = r8.journalFileTmp
            deleteIfExists(r0)
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r0 = r8.lruEntries
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r0.next()
            com.jakewharton.disklrucache.DiskLruCache$Entry r1 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r1
            com.jakewharton.disklrucache.DiskLruCache$Editor r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)
            r3 = 0
            if (r2 != 0) goto L34
        L22:
            int r2 = r8.valueCount
            if (r3 >= r2) goto Lf
            long r4 = r8.size
            long[] r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r1)
            r6 = r2[r3]
            long r4 = r4 + r6
            r8.size = r4
            int r3 = r3 + 1
            goto L22
        L34:
            r2 = 0
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$702(r1, r2)
        L38:
            int r2 = r8.valueCount
            if (r3 >= r2) goto L4d
            java.io.File r2 = r1.getCleanFile(r3)
            deleteIfExists(r2)
            java.io.File r2 = r1.getDirtyFile(r3)
            deleteIfExists(r2)
            int r3 = r3 + 1
            goto L38
        L4d:
            r0.remove()
            goto Lf
        L51:
            return
    }

    private void readJournal() throws java.io.IOException {
            r9 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            com.jakewharton.disklrucache.StrictLineReader r2 = new com.jakewharton.disklrucache.StrictLineReader
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r4 = r9.journalFile
            r3.<init>(r4)
            java.nio.charset.Charset r4 = com.jakewharton.disklrucache.Util.US_ASCII
            r2.<init>(r3, r4)
            java.lang.String r3 = r2.readLine()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = r2.readLine()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r6 = r2.readLine()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r7 = r2.readLine()     // Catch: java.lang.Throwable -> L9f
            java.lang.String r8 = "libcore.io.DiskLruCache"
            boolean r8 = r8.equals(r3)     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L6e
            java.lang.String r8 = "1"
            boolean r8 = r8.equals(r4)     // Catch: java.lang.Throwable -> L9f
            if (r8 == 0) goto L6e
            int r8 = r9.appVersion     // Catch: java.lang.Throwable -> L9f
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L9f
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L6e
            int r5 = r9.valueCount     // Catch: java.lang.Throwable -> L9f
            java.lang.String r5 = java.lang.Integer.toString(r5)     // Catch: java.lang.Throwable -> L9f
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L6e
            java.lang.String r5 = ""
            boolean r5 = r5.equals(r7)     // Catch: java.lang.Throwable -> L9f
            if (r5 == 0) goto L6e
            r0 = 0
        L57:
            java.lang.String r1 = r2.readLine()     // Catch: java.io.EOFException -> L61 java.lang.Throwable -> L9f
            r9.readJournalLine(r1)     // Catch: java.io.EOFException -> L61 java.lang.Throwable -> L9f
            int r0 = r0 + 1
            goto L57
        L61:
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r1 = r9.lruEntries     // Catch: java.lang.Throwable -> L9f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L9f
            int r0 = r0 - r1
            r9.redundantOpCount = r0     // Catch: java.lang.Throwable -> L9f
            com.jakewharton.disklrucache.Util.closeQuietly(r2)
            return
        L6e:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9f
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r1 = r8.append(r3)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r1 = r1.append(r4)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r1 = r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r1 = r1.append(r6)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = r1.append(r0)     // Catch: java.lang.Throwable -> L9f
            java.lang.StringBuilder r0 = r0.append(r7)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L9f
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9f
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L9f
            throw r5     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            com.jakewharton.disklrucache.Util.closeQuietly(r2)
            throw r0
    }

    private void readJournalLine(java.lang.String r9) throws java.io.IOException {
            r8 = this;
            r0 = 32
            int r1 = r9.indexOf(r0)
            java.lang.String r2 = "unexpected journal line: "
            r3 = -1
            if (r1 == r3) goto L9a
            int r4 = r1 + 1
            int r0 = r9.indexOf(r0, r4)
            if (r0 != r3) goto L28
            java.lang.String r4 = r9.substring(r4)
            r5 = 6
            if (r1 != r5) goto L2c
            java.lang.String r5 = "REMOVE"
            boolean r5 = r9.startsWith(r5)
            if (r5 == 0) goto L2c
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r9 = r8.lruEntries
            r9.remove(r4)
            return
        L28:
            java.lang.String r4 = r9.substring(r4, r0)
        L2c:
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r5 = r8.lruEntries
            java.lang.Object r5 = r5.get(r4)
            com.jakewharton.disklrucache.DiskLruCache$Entry r5 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r5
            r6 = 0
            if (r5 != 0) goto L41
            com.jakewharton.disklrucache.DiskLruCache$Entry r5 = new com.jakewharton.disklrucache.DiskLruCache$Entry
            r5.<init>(r8, r4, r6)
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r7 = r8.lruEntries
            r7.put(r4, r5)
        L41:
            r4 = 5
            if (r0 == r3) goto L64
            if (r1 != r4) goto L64
            java.lang.String r7 = "CLEAN"
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L64
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r9 = r9.substring(r0)
            java.lang.String r0 = " "
            java.lang.String[] r9 = r9.split(r0)
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$602(r5, r1)
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$702(r5, r6)
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$800(r5, r9)
            goto L86
        L64:
            if (r0 != r3) goto L79
            if (r1 != r4) goto L79
            java.lang.String r4 = "DIRTY"
            boolean r4 = r9.startsWith(r4)
            if (r4 == 0) goto L79
            com.jakewharton.disklrucache.DiskLruCache$Editor r9 = new com.jakewharton.disklrucache.DiskLruCache$Editor
            r9.<init>(r8, r5, r6)
            com.jakewharton.disklrucache.DiskLruCache.Entry.access$702(r5, r9)
            goto L86
        L79:
            if (r0 != r3) goto L87
            r0 = 4
            if (r1 != r0) goto L87
            java.lang.String r0 = "READ"
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L87
        L86:
            return
        L87:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
        L9a:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.StringBuilder r9 = r1.append(r9)
            java.lang.String r9 = r9.toString()
            r0.<init>(r9)
            throw r0
    }

    private synchronized void rebuildJournal() throws java.io.IOException {
            r6 = this;
            monitor-enter(r6)
            java.io.Writer r0 = r6.journalWriter     // Catch: java.lang.Throwable -> Lf0
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.Throwable -> Lf0
        L8:
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lf0
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lf0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf0
            java.io.File r3 = r6.journalFileTmp     // Catch: java.lang.Throwable -> Lf0
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Lf0
            java.nio.charset.Charset r3 = com.jakewharton.disklrucache.Util.US_ASCII     // Catch: java.lang.Throwable -> Lf0
            r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> Lf0
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf0
            java.lang.String r1 = "libcore.io.DiskLruCache"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "1"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            int r1 = r6.appVersion     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> Leb
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            int r1 = r6.valueCount     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = java.lang.Integer.toString(r1)     // Catch: java.lang.Throwable -> Leb
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r1 = "\n"
            r0.write(r1)     // Catch: java.lang.Throwable -> Leb
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r1 = r6.lruEntries     // Catch: java.lang.Throwable -> Leb
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> Leb
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> Leb
        L5a:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> Leb
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> Leb
            com.jakewharton.disklrucache.DiskLruCache$Entry r2 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r2     // Catch: java.lang.Throwable -> Leb
            com.jakewharton.disklrucache.DiskLruCache$Editor r3 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r2)     // Catch: java.lang.Throwable -> Leb
            r4 = 10
            if (r3 == 0) goto L8d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r3.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r5 = "DIRTY "
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Leb
            r0.write(r2)     // Catch: java.lang.Throwable -> Leb
            goto L5a
        L8d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Leb
            r3.<init>()     // Catch: java.lang.Throwable -> Leb
            java.lang.String r5 = "CLEAN "
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r5 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1100(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r3 = r3.append(r5)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r2.getLengths()     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r2 = r3.append(r2)     // Catch: java.lang.Throwable -> Leb
            java.lang.StringBuilder r2 = r2.append(r4)     // Catch: java.lang.Throwable -> Leb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Leb
            r0.write(r2)     // Catch: java.lang.Throwable -> Leb
            goto L5a
        Lb4:
            r0.close()     // Catch: java.lang.Throwable -> Lf0
            java.io.File r0 = r6.journalFile     // Catch: java.lang.Throwable -> Lf0
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> Lf0
            r1 = 1
            if (r0 == 0) goto Lc7
            java.io.File r0 = r6.journalFile     // Catch: java.lang.Throwable -> Lf0
            java.io.File r2 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Lf0
            renameTo(r0, r2, r1)     // Catch: java.lang.Throwable -> Lf0
        Lc7:
            java.io.File r0 = r6.journalFileTmp     // Catch: java.lang.Throwable -> Lf0
            java.io.File r2 = r6.journalFile     // Catch: java.lang.Throwable -> Lf0
            r3 = 0
            renameTo(r0, r2, r3)     // Catch: java.lang.Throwable -> Lf0
            java.io.File r0 = r6.journalFileBackup     // Catch: java.lang.Throwable -> Lf0
            r0.delete()     // Catch: java.lang.Throwable -> Lf0
            java.io.BufferedWriter r0 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> Lf0
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> Lf0
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lf0
            java.io.File r4 = r6.journalFile     // Catch: java.lang.Throwable -> Lf0
            r3.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lf0
            java.nio.charset.Charset r1 = com.jakewharton.disklrucache.Util.US_ASCII     // Catch: java.lang.Throwable -> Lf0
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> Lf0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lf0
            r6.journalWriter = r0     // Catch: java.lang.Throwable -> Lf0
            monitor-exit(r6)
            return
        Leb:
            r1 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> Lf0
            throw r1     // Catch: java.lang.Throwable -> Lf0
        Lf0:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
    }

    private static void renameTo(java.io.File r0, java.io.File r1, boolean r2) throws java.io.IOException {
            if (r2 == 0) goto L5
            deleteIfExists(r1)
        L5:
            boolean r0 = r0.renameTo(r1)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.io.IOException r0 = new java.io.IOException
            r0.<init>()
            throw r0
    }

    private void trimToSize() throws java.io.IOException {
            r4 = this;
        L0:
            long r0 = r4.size
            long r2 = r4.maxSize
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L22
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r0 = r4.lruEntries
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r4.remove(r0)
            goto L0
        L22:
            return
    }

    private void validateKey(java.lang.String r4) {
            r3 = this;
            java.util.regex.Pattern r0 = com.jakewharton.disklrucache.DiskLruCache.LEGAL_KEY_PATTERN
            java.util.regex.Matcher r0 = r0.matcher(r4)
            boolean r0 = r0.matches()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "keys must match regex [a-z0-9_-]{1,64}: \""
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "\""
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r3 = this;
            monitor-enter(r3)
            java.io.Writer r0 = r3.journalWriter     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L7
            monitor-exit(r3)
            return
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3d
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r1 = r3.lruEntries     // Catch: java.lang.Throwable -> L3d
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L3d
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3d
        L16:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3d
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3d
            com.jakewharton.disklrucache.DiskLruCache$Entry r1 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r1     // Catch: java.lang.Throwable -> L3d
            com.jakewharton.disklrucache.DiskLruCache$Editor r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L3d
            if (r2 == 0) goto L16
            com.jakewharton.disklrucache.DiskLruCache$Editor r1 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r1)     // Catch: java.lang.Throwable -> L3d
            r1.abort()     // Catch: java.lang.Throwable -> L3d
            goto L16
        L30:
            r3.trimToSize()     // Catch: java.lang.Throwable -> L3d
            java.io.Writer r0 = r3.journalWriter     // Catch: java.lang.Throwable -> L3d
            r0.close()     // Catch: java.lang.Throwable -> L3d
            r0 = 0
            r3.journalWriter = r0     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r3)
            return
        L3d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
    }

    public void delete() throws java.io.IOException {
            r1 = this;
            r1.close()
            java.io.File r0 = r1.directory
            com.jakewharton.disklrucache.Util.deleteContents(r0)
            return
    }

    public com.jakewharton.disklrucache.DiskLruCache.Editor edit(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            r0 = -1
            com.jakewharton.disklrucache.DiskLruCache$Editor r3 = r2.edit(r3, r0)
            return r3
    }

    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.checkNotClosed()     // Catch: java.lang.Throwable -> Le
            r1.trimToSize()     // Catch: java.lang.Throwable -> Le
            java.io.Writer r0 = r1.journalWriter     // Catch: java.lang.Throwable -> Le
            r0.flush()     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        Le:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized com.jakewharton.disklrucache.DiskLruCache.Snapshot get(java.lang.String r12) throws java.io.IOException {
            r11 = this;
            monitor-enter(r11)
            r11.checkNotClosed()     // Catch: java.lang.Throwable -> L88
            r11.validateKey(r12)     // Catch: java.lang.Throwable -> L88
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r0 = r11.lruEntries     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r0.get(r12)     // Catch: java.lang.Throwable -> L88
            com.jakewharton.disklrucache.DiskLruCache$Entry r0 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L88
            r1 = 0
            if (r0 != 0) goto L14
            monitor-exit(r11)
            return r1
        L14:
            boolean r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$600(r0)     // Catch: java.lang.Throwable -> L88
            if (r2 != 0) goto L1c
            monitor-exit(r11)
            return r1
        L1c:
            int r2 = r11.valueCount     // Catch: java.lang.Throwable -> L88
            java.io.InputStream[] r8 = new java.io.InputStream[r2]     // Catch: java.lang.Throwable -> L88
            r2 = 0
            r3 = r2
        L22:
            int r4 = r11.valueCount     // Catch: java.io.FileNotFoundException -> L78 java.lang.Throwable -> L88
            if (r3 >= r4) goto L34
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L78 java.lang.Throwable -> L88
            java.io.File r5 = r0.getCleanFile(r3)     // Catch: java.io.FileNotFoundException -> L78 java.lang.Throwable -> L88
            r4.<init>(r5)     // Catch: java.io.FileNotFoundException -> L78 java.lang.Throwable -> L88
            r8[r3] = r4     // Catch: java.io.FileNotFoundException -> L78 java.lang.Throwable -> L88
            int r3 = r3 + 1
            goto L22
        L34:
            int r1 = r11.redundantOpCount     // Catch: java.lang.Throwable -> L88
            int r1 = r1 + 1
            r11.redundantOpCount = r1     // Catch: java.lang.Throwable -> L88
            java.io.Writer r1 = r11.journalWriter     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L88
            r2.<init>()     // Catch: java.lang.Throwable -> L88
            java.lang.String r3 = "READ "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.StringBuilder r2 = r2.append(r12)     // Catch: java.lang.Throwable -> L88
            r3 = 10
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L88
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L88
            r1.append(r2)     // Catch: java.lang.Throwable -> L88
            boolean r1 = r11.journalRebuildRequired()     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L65
            java.util.concurrent.ThreadPoolExecutor r1 = r11.executorService     // Catch: java.lang.Throwable -> L88
            java.util.concurrent.Callable<java.lang.Void> r2 = r11.cleanupCallable     // Catch: java.lang.Throwable -> L88
            r1.submit(r2)     // Catch: java.lang.Throwable -> L88
        L65:
            com.jakewharton.disklrucache.DiskLruCache$Snapshot r1 = new com.jakewharton.disklrucache.DiskLruCache$Snapshot     // Catch: java.lang.Throwable -> L88
            long r6 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1200(r0)     // Catch: java.lang.Throwable -> L88
            long[] r9 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r0)     // Catch: java.lang.Throwable -> L88
            r10 = 0
            r3 = r1
            r4 = r11
            r5 = r12
            r3.<init>(r4, r5, r6, r8, r9, r10)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r11)
            return r1
        L78:
            int r12 = r11.valueCount     // Catch: java.lang.Throwable -> L88
            if (r2 >= r12) goto L86
            r12 = r8[r2]     // Catch: java.lang.Throwable -> L88
            if (r12 == 0) goto L86
            com.jakewharton.disklrucache.Util.closeQuietly(r12)     // Catch: java.lang.Throwable -> L88
            int r2 = r2 + 1
            goto L78
        L86:
            monitor-exit(r11)
            return r1
        L88:
            r12 = move-exception
            monitor-exit(r11)
            throw r12
    }

    public java.io.File getDirectory() {
            r1 = this;
            java.io.File r0 = r1.directory
            return r0
    }

    public synchronized long getMaxSize() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.maxSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    public synchronized boolean isClosed() {
            r1 = this;
            monitor-enter(r1)
            java.io.Writer r0 = r1.journalWriter     // Catch: java.lang.Throwable -> La
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            monitor-exit(r1)
            return r0
        La:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
    }

    public synchronized boolean remove(java.lang.String r8) throws java.io.IOException {
            r7 = this;
            monitor-enter(r7)
            r7.checkNotClosed()     // Catch: java.lang.Throwable -> L98
            r7.validateKey(r8)     // Catch: java.lang.Throwable -> L98
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L98
            java.lang.Object r0 = r0.get(r8)     // Catch: java.lang.Throwable -> L98
            com.jakewharton.disklrucache.DiskLruCache$Entry r0 = (com.jakewharton.disklrucache.DiskLruCache.Entry) r0     // Catch: java.lang.Throwable -> L98
            r1 = 0
            if (r0 == 0) goto L96
            com.jakewharton.disklrucache.DiskLruCache$Editor r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$700(r0)     // Catch: java.lang.Throwable -> L98
            if (r2 == 0) goto L1a
            goto L96
        L1a:
            int r2 = r7.valueCount     // Catch: java.lang.Throwable -> L98
            if (r1 >= r2) goto L5e
            java.io.File r2 = r0.getCleanFile(r1)     // Catch: java.lang.Throwable -> L98
            boolean r3 = r2.exists()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L48
            boolean r3 = r2.delete()     // Catch: java.lang.Throwable -> L98
            if (r3 == 0) goto L2f
            goto L48
        L2f:
            java.io.IOException r8 = new java.io.IOException     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r1 = "failed to delete "
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r0 = r0.append(r2)     // Catch: java.lang.Throwable -> L98
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L98
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L98
            throw r8     // Catch: java.lang.Throwable -> L98
        L48:
            long r2 = r7.size     // Catch: java.lang.Throwable -> L98
            long[] r4 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r0)     // Catch: java.lang.Throwable -> L98
            r5 = r4[r1]     // Catch: java.lang.Throwable -> L98
            long r2 = r2 - r5
            r7.size = r2     // Catch: java.lang.Throwable -> L98
            long[] r2 = com.jakewharton.disklrucache.DiskLruCache.Entry.access$1000(r0)     // Catch: java.lang.Throwable -> L98
            r3 = 0
            r2[r1] = r3     // Catch: java.lang.Throwable -> L98
            int r1 = r1 + 1
            goto L1a
        L5e:
            int r0 = r7.redundantOpCount     // Catch: java.lang.Throwable -> L98
            r1 = 1
            int r0 = r0 + r1
            r7.redundantOpCount = r0     // Catch: java.lang.Throwable -> L98
            java.io.Writer r0 = r7.journalWriter     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L98
            r2.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.String r3 = "REMOVE "
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.StringBuilder r2 = r2.append(r8)     // Catch: java.lang.Throwable -> L98
            r3 = 10
            java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> L98
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L98
            r0.append(r2)     // Catch: java.lang.Throwable -> L98
            java.util.LinkedHashMap<java.lang.String, com.jakewharton.disklrucache.DiskLruCache$Entry> r0 = r7.lruEntries     // Catch: java.lang.Throwable -> L98
            r0.remove(r8)     // Catch: java.lang.Throwable -> L98
            boolean r8 = r7.journalRebuildRequired()     // Catch: java.lang.Throwable -> L98
            if (r8 == 0) goto L94
            java.util.concurrent.ThreadPoolExecutor r8 = r7.executorService     // Catch: java.lang.Throwable -> L98
            java.util.concurrent.Callable<java.lang.Void> r0 = r7.cleanupCallable     // Catch: java.lang.Throwable -> L98
            r8.submit(r0)     // Catch: java.lang.Throwable -> L98
        L94:
            monitor-exit(r7)
            return r1
        L96:
            monitor-exit(r7)
            return r1
        L98:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
    }

    public synchronized void setMaxSize(long r1) {
            r0 = this;
            monitor-enter(r0)
            r0.maxSize = r1     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.ThreadPoolExecutor r1 = r0.executorService     // Catch: java.lang.Throwable -> Lc
            java.util.concurrent.Callable<java.lang.Void> r2 = r0.cleanupCallable     // Catch: java.lang.Throwable -> Lc
            r1.submit(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    public synchronized long size() {
            r2 = this;
            monitor-enter(r2)
            long r0 = r2.size     // Catch: java.lang.Throwable -> L5
            monitor-exit(r2)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }
}
