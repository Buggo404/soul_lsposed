package okhttp3.internal.publicsuffix;

/* loaded from: classes.dex */
public final class PublicSuffixDatabase {
    private static final java.lang.String[] EMPTY_RULE = null;
    private static final byte EXCEPTION_MARKER = 33;
    private static final java.lang.String[] PREVAILING_RULE = null;
    public static final java.lang.String PUBLIC_SUFFIX_RESOURCE = "publicsuffixes.gz";
    private static final byte[] WILDCARD_LABEL = null;
    private static final okhttp3.internal.publicsuffix.PublicSuffixDatabase instance = null;
    private final java.util.concurrent.atomic.AtomicBoolean listRead;
    private byte[] publicSuffixExceptionListBytes;
    private byte[] publicSuffixListBytes;
    private final java.util.concurrent.CountDownLatch readCompleteLatch;

    static {
            r0 = 1
            byte[] r0 = new byte[r0]
            r1 = 42
            r2 = 0
            r0[r2] = r1
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL = r0
            java.lang.String[] r0 = new java.lang.String[r2]
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.EMPTY_RULE = r0
            java.lang.String r0 = "*"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE = r0
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = new okhttp3.internal.publicsuffix.PublicSuffixDatabase
            r0.<init>()
            okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance = r0
            return
    }

    public PublicSuffixDatabase() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.listRead = r0
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r1 = 1
            r0.<init>(r1)
            r2.readCompleteLatch = r0
            return
    }

    private static java.lang.String binarySearchBytes(byte[] r17, byte[][] r18, int r19) {
            r0 = r17
            r1 = r18
            int r2 = r0.length
            r3 = 0
            r4 = r3
        L7:
            if (r4 >= r2) goto L88
            int r5 = r4 + r2
            int r5 = r5 / 2
        Ld:
            r6 = 10
            r7 = -1
            if (r5 <= r7) goto L19
            r8 = r0[r5]
            if (r8 == r6) goto L19
            int r5 = r5 + (-1)
            goto Ld
        L19:
            int r5 = r5 + 1
            r8 = 1
            r9 = r8
        L1d:
            int r10 = r5 + r9
            r11 = r0[r10]
            if (r11 == r6) goto L26
            int r9 = r9 + 1
            goto L1d
        L26:
            int r6 = r10 - r5
            r11 = r19
            r9 = r3
            r12 = r9
            r13 = r12
        L2d:
            if (r9 == 0) goto L33
            r9 = 46
            r14 = r3
            goto L3e
        L33:
            r14 = r1[r11]
            r14 = r14[r12]
            r14 = r14 & 255(0xff, float:3.57E-43)
            r16 = r14
            r14 = r9
            r9 = r16
        L3e:
            int r15 = r5 + r13
            r15 = r0[r15]
            r15 = r15 & 255(0xff, float:3.57E-43)
            int r9 = r9 - r15
            if (r9 == 0) goto L48
            goto L58
        L48:
            int r13 = r13 + 1
            int r12 = r12 + 1
            if (r13 != r6) goto L4f
            goto L58
        L4f:
            r15 = r1[r11]
            int r15 = r15.length
            if (r15 != r12) goto L86
            int r14 = r1.length
            int r14 = r14 - r8
            if (r11 != r14) goto L81
        L58:
            if (r9 >= 0) goto L5e
        L5a:
            int r5 = r5 + (-1)
            r2 = r5
            goto L7
        L5e:
            if (r9 <= 0) goto L63
        L60:
            int r4 = r10 + 1
            goto L7
        L63:
            int r7 = r6 - r13
            r8 = r1[r11]
            int r8 = r8.length
            int r8 = r8 - r12
        L69:
            int r11 = r11 + 1
            int r9 = r1.length
            if (r11 >= r9) goto L73
            r9 = r1[r11]
            int r9 = r9.length
            int r8 = r8 + r9
            goto L69
        L73:
            if (r8 >= r7) goto L76
            goto L5a
        L76:
            if (r8 <= r7) goto L79
            goto L60
        L79:
            java.lang.String r1 = new java.lang.String
            java.nio.charset.Charset r2 = java.nio.charset.StandardCharsets.UTF_8
            r1.<init>(r0, r5, r6, r2)
            goto L89
        L81:
            int r11 = r11 + 1
            r12 = r7
            r9 = r8
            goto L2d
        L86:
            r9 = r14
            goto L2d
        L88:
            r1 = 0
        L89:
            return r1
    }

    private java.lang.String[] findMatchingRule(java.lang.String[] r9) {
            r8 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.listRead
            boolean r0 = r0.get()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L16
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.listRead
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L16
            r8.readTheListUninterruptibly()
            goto L23
        L16:
            java.util.concurrent.CountDownLatch r0 = r8.readCompleteLatch     // Catch: java.lang.InterruptedException -> L1c
            r0.await()     // Catch: java.lang.InterruptedException -> L1c
            goto L23
        L1c:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L23:
            monitor-enter(r8)
            byte[] r0 = r8.publicSuffixListBytes     // Catch: java.lang.Throwable -> Lc3
            if (r0 == 0) goto Lbb
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc3
            int r0 = r9.length
            byte[][] r3 = new byte[r0][]
            r4 = r1
        L2d:
            int r5 = r9.length
            if (r4 >= r5) goto L3d
            r5 = r9[r4]
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            byte[] r5 = r5.getBytes(r6)
            r3[r4] = r5
            int r4 = r4 + 1
            goto L2d
        L3d:
            r9 = r1
        L3e:
            r4 = 0
            if (r9 >= r0) goto L4d
            byte[] r5 = r8.publicSuffixListBytes
            java.lang.String r5 = binarySearchBytes(r5, r3, r9)
            if (r5 == 0) goto L4a
            goto L4e
        L4a:
            int r9 = r9 + 1
            goto L3e
        L4d:
            r5 = r4
        L4e:
            if (r0 <= r2) goto L6b
            java.lang.Object r9 = r3.clone()
            byte[][] r9 = (byte[][]) r9
            r6 = r1
        L57:
            int r7 = r9.length
            int r7 = r7 - r2
            if (r6 >= r7) goto L6b
            byte[] r7 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.WILDCARD_LABEL
            r9[r6] = r7
            byte[] r7 = r8.publicSuffixListBytes
            java.lang.String r7 = binarySearchBytes(r7, r9, r6)
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r6 = r6 + 1
            goto L57
        L6b:
            r7 = r4
        L6c:
            if (r7 == 0) goto L7f
        L6e:
            int r9 = r0 + (-1)
            if (r1 >= r9) goto L7f
            byte[] r9 = r8.publicSuffixExceptionListBytes
            java.lang.String r9 = binarySearchBytes(r9, r3, r1)
            if (r9 == 0) goto L7c
            r4 = r9
            goto L7f
        L7c:
            int r1 = r1 + 1
            goto L6e
        L7f:
            if (r4 == 0) goto L97
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "!"
            r9.<init>(r0)
            java.lang.StringBuilder r9 = r9.append(r4)
            java.lang.String r9 = r9.toString()
            java.lang.String r0 = "\\."
            java.lang.String[] r9 = r9.split(r0)
            return r9
        L97:
            if (r5 != 0) goto L9e
            if (r7 != 0) goto L9e
            java.lang.String[] r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.PREVAILING_RULE
            return r9
        L9e:
            if (r5 == 0) goto La7
            java.lang.String r9 = "\\."
            java.lang.String[] r9 = r5.split(r9)
            goto La9
        La7:
            java.lang.String[] r9 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.EMPTY_RULE
        La9:
            if (r7 == 0) goto Lb2
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r7.split(r0)
            goto Lb4
        Lb2:
            java.lang.String[] r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.EMPTY_RULE
        Lb4:
            int r1 = r9.length
            int r2 = r0.length
            if (r1 <= r2) goto Lb9
            goto Lba
        Lb9:
            r9 = r0
        Lba:
            return r9
        Lbb:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = "Unable to load publicsuffixes.gz resource from the classpath."
            r9.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            throw r9     // Catch: java.lang.Throwable -> Lc3
        Lc3:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> Lc3
            throw r9
    }

    public static okhttp3.internal.publicsuffix.PublicSuffixDatabase get() {
            okhttp3.internal.publicsuffix.PublicSuffixDatabase r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.instance
            return r0
    }

    private void readTheList() throws java.io.IOException {
            r3 = this;
            java.lang.Class<okhttp3.internal.publicsuffix.PublicSuffixDatabase> r0 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.class
            java.lang.String r1 = "publicsuffixes.gz"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)
            if (r0 != 0) goto Lb
            return
        Lb:
            okio.GzipSource r1 = new okio.GzipSource
            okio.Source r0 = okio.Okio.source(r0)
            r1.<init>(r0)
            okio.BufferedSource r0 = okio.Okio.buffer(r1)
            int r1 = r0.readInt()     // Catch: java.lang.Throwable -> L3e
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L3e
            r0.readFully(r1)     // Catch: java.lang.Throwable -> L3e
            int r2 = r0.readInt()     // Catch: java.lang.Throwable -> L3e
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L3e
            r0.readFully(r2)     // Catch: java.lang.Throwable -> L3e
            if (r0 == 0) goto L2f
            r0.close()
        L2f:
            monitor-enter(r3)
            r3.publicSuffixListBytes = r1     // Catch: java.lang.Throwable -> L3b
            r3.publicSuffixExceptionListBytes = r2     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            java.util.concurrent.CountDownLatch r0 = r3.readCompleteLatch
            r0.countDown()
            return
        L3b:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r1 = move-exception
            throw r1     // Catch: java.lang.Throwable -> L40
        L40:
            r2 = move-exception
            if (r0 == 0) goto L4b
            r0.close()     // Catch: java.lang.Throwable -> L47
            goto L4b
        L47:
            r0 = move-exception
            r1.addSuppressed(r0)
        L4b:
            throw r2
    }

    private void readTheListUninterruptibly() {
            r5 = this;
            r0 = 0
        L1:
            r5.readTheList()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10 java.io.InterruptedIOException -> L25
            if (r0 == 0) goto Ld
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        Ld:
            return
        Le:
            r1 = move-exception
            goto L2a
        L10:
            r1 = move-exception
            okhttp3.internal.platform.Platform r2 = okhttp3.internal.platform.Platform.get()     // Catch: java.lang.Throwable -> Le
            java.lang.String r3 = "Failed to read public suffix list"
            r4 = 5
            r2.log(r4, r3, r1)     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L24
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L24:
            return
        L25:
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> Le
            r0 = 1
            goto L1
        L2a:
            if (r0 == 0) goto L33
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L33:
            throw r1
    }

    public java.lang.String getEffectiveTldPlusOne(java.lang.String r8) {
            r7 = this;
            if (r8 == 0) goto L59
            java.lang.String r0 = java.net.IDN.toUnicode(r8)
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            java.lang.String[] r2 = r7.findMatchingRule(r0)
            int r3 = r0.length
            int r4 = r2.length
            r5 = 33
            r6 = 0
            if (r3 != r4) goto L21
            r3 = r2[r6]
            char r3 = r3.charAt(r6)
            if (r3 == r5) goto L21
            r8 = 0
            return r8
        L21:
            r3 = r2[r6]
            char r3 = r3.charAt(r6)
            if (r3 != r5) goto L2c
            int r0 = r0.length
            int r2 = r2.length
            goto L30
        L2c:
            int r0 = r0.length
            int r2 = r2.length
            int r2 = r2 + 1
        L30:
            int r0 = r0 - r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String[] r8 = r8.split(r1)
        L3a:
            int r1 = r8.length
            if (r0 >= r1) goto L4b
            r1 = r8[r0]
            java.lang.StringBuilder r1 = r2.append(r1)
            r3 = 46
            r1.append(r3)
            int r0 = r0 + 1
            goto L3a
        L4b:
            int r8 = r2.length()
            int r8 = r8 + (-1)
            r2.deleteCharAt(r8)
            java.lang.String r8 = r2.toString()
            return r8
        L59:
            java.lang.NullPointerException r8 = new java.lang.NullPointerException
            java.lang.String r0 = "domain == null"
            r8.<init>(r0)
            throw r8
    }

    void setListBytes(byte[] r1, byte[] r2) {
            r0 = this;
            r0.publicSuffixListBytes = r1
            r0.publicSuffixExceptionListBytes = r2
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.listRead
            r2 = 1
            r1.set(r2)
            java.util.concurrent.CountDownLatch r1 = r0.readCompleteLatch
            r1.countDown()
            return
    }
}
