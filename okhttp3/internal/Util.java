package okhttp3.internal;

/* loaded from: classes.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY = null;
    public static final okhttp3.Headers EMPTY_HEADERS = null;
    public static final okhttp3.RequestBody EMPTY_REQUEST = null;
    public static final okhttp3.ResponseBody EMPTY_RESPONSE = null;
    public static final java.lang.String[] EMPTY_STRING_ARRAY = null;
    public static final java.util.Comparator<java.lang.String> NATURAL_ORDER = null;
    private static final okio.Options UNICODE_BOMS = null;
    public static final java.util.TimeZone UTC = null;
    private static final java.nio.charset.Charset UTF_32BE = null;
    private static final java.nio.charset.Charset UTF_32LE = null;
    private static final java.util.regex.Pattern VERIFY_AS_IP_ADDRESS = null;
    private static final java.lang.reflect.Method addSuppressedExceptionMethod = null;

    /* renamed from: $r8$lambda$Ds7dtVnGrflEw4-LvNOxA0cDT4Y, reason: not valid java name */
    public static /* synthetic */ int m354$r8$lambda$Ds7dtVnGrflEw4LvNOxA0cDT4Y(java.lang.String r0, java.lang.String r1) {
            int r0 = r0.compareTo(r1)
            return r0
    }

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            okhttp3.internal.Util.EMPTY_BYTE_ARRAY = r1
            java.lang.String[] r2 = new java.lang.String[r0]
            okhttp3.internal.Util.EMPTY_STRING_ARRAY = r2
            java.lang.String[] r2 = new java.lang.String[r0]
            okhttp3.Headers r2 = okhttp3.Headers.m94of(r2)
            okhttp3.internal.Util.EMPTY_HEADERS = r2
            r2 = 0
            okhttp3.ResponseBody r3 = okhttp3.ResponseBody.create(r2, r1)
            okhttp3.internal.Util.EMPTY_RESPONSE = r3
            okhttp3.RequestBody r1 = okhttp3.RequestBody.create(r2, r1)
            okhttp3.internal.Util.EMPTY_REQUEST = r1
            r1 = 5
            okio.ByteString[] r1 = new okio.ByteString[r1]
            java.lang.String r3 = "efbbbf"
            okio.ByteString r3 = okio.ByteString.decodeHex(r3)
            r1[r0] = r3
            java.lang.String r3 = "feff"
            okio.ByteString r3 = okio.ByteString.decodeHex(r3)
            r4 = 1
            r1[r4] = r3
            java.lang.String r3 = "fffe"
            okio.ByteString r3 = okio.ByteString.decodeHex(r3)
            r5 = 2
            r1[r5] = r3
            java.lang.String r3 = "0000ffff"
            okio.ByteString r3 = okio.ByteString.decodeHex(r3)
            r5 = 3
            r1[r5] = r3
            java.lang.String r3 = "ffff0000"
            okio.ByteString r3 = okio.ByteString.decodeHex(r3)
            r5 = 4
            r1[r5] = r3
            okio.Options r1 = okio.Options.m98of(r1)
            okhttp3.internal.Util.UNICODE_BOMS = r1
            java.lang.String r1 = "UTF-32BE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            okhttp3.internal.Util.UTF_32BE = r1
            java.lang.String r1 = "UTF-32LE"
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            okhttp3.internal.Util.UTF_32LE = r1
            java.lang.String r1 = "GMT"
            java.util.TimeZone r1 = java.util.TimeZone.getTimeZone(r1)
            okhttp3.internal.Util.UTC = r1
            okhttp3.internal.Util$$ExternalSyntheticLambda1 r1 = new okhttp3.internal.Util$$ExternalSyntheticLambda1
            r1.<init>()
            okhttp3.internal.Util.NATURAL_ORDER = r1
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r3 = "addSuppressed"
            java.lang.Class[] r4 = new java.lang.Class[r4]     // Catch: java.lang.Exception -> L80
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L80
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Exception -> L80
        L80:
            okhttp3.internal.Util.addSuppressedExceptionMethod = r2
            java.lang.String r0 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS = r0
            return
    }

    private Util() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addSuppressedIfPossible(java.lang.Throwable r3, java.lang.Throwable r4) {
            java.lang.reflect.Method r0 = okhttp3.internal.Util.addSuppressedExceptionMethod
            if (r0 == 0) goto Ld
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> Ld
            r0.invoke(r3, r1)     // Catch: java.lang.Throwable -> Ld
        Ld:
            return
    }

    public static java.nio.charset.Charset bomAwareCharset(okio.BufferedSource r1, java.nio.charset.Charset r2) throws java.io.IOException {
            okio.Options r0 = okhttp3.internal.Util.UNICODE_BOMS
            int r1 = r1.select(r0)
            r0 = -1
            if (r1 == r0) goto L2c
            if (r1 == 0) goto L29
            r2 = 1
            if (r1 == r2) goto L26
            r2 = 2
            if (r1 == r2) goto L23
            r2 = 3
            if (r1 == r2) goto L20
            r2 = 4
            if (r1 != r2) goto L1a
            java.nio.charset.Charset r1 = okhttp3.internal.Util.UTF_32LE
            return r1
        L1a:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L20:
            java.nio.charset.Charset r1 = okhttp3.internal.Util.UTF_32BE
            return r1
        L23:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16LE
            return r1
        L26:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_16BE
            return r1
        L29:
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8
            return r1
        L2c:
            return r2
    }

    public static java.lang.String canonicalizeHost(java.lang.String r4) {
            java.lang.String r0 = ":"
            boolean r0 = r4.contains(r0)
            r1 = 0
            if (r0 == 0) goto L62
            java.lang.String r0 = "["
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = "]"
            boolean r0 = r4.endsWith(r0)
            if (r0 == 0) goto L24
            int r0 = r4.length()
            r2 = 1
            int r0 = r0 - r2
            java.net.InetAddress r0 = decodeIpv6(r4, r2, r0)
            goto L2d
        L24:
            r0 = 0
            int r2 = r4.length()
            java.net.InetAddress r0 = decodeIpv6(r4, r0, r2)
        L2d:
            if (r0 != 0) goto L30
            return r1
        L30:
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L3e
            java.lang.String r4 = inet6AddressToAscii(r1)
            return r4
        L3e:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L47
            java.lang.String r4 = r0.getHostAddress()
            return r4
        L47:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = "'"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L62:
            java.lang.String r4 = java.net.IDN.toASCII(r4)     // Catch: java.lang.IllegalArgumentException -> L7b
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> L7b
            java.lang.String r4 = r4.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> L7b
            boolean r0 = r4.isEmpty()     // Catch: java.lang.IllegalArgumentException -> L7b
            if (r0 == 0) goto L73
            return r1
        L73:
            boolean r0 = containsInvalidHostnameAsciiCodes(r4)     // Catch: java.lang.IllegalArgumentException -> L7b
            if (r0 == 0) goto L7a
            return r1
        L7a:
            return r4
        L7b:
            return r1
    }

    public static int checkDuration(java.lang.String r5, long r6, java.util.concurrent.TimeUnit r8) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L56
            if (r8 == 0) goto L4e
            long r6 = r8.toMillis(r6)
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r8 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r8 > 0) goto L35
            int r8 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r8 != 0) goto L33
            if (r2 > 0) goto L1a
            goto L33
        L1a:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " too small."
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L33:
            int r5 = (int) r6
            return r5
        L35:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " too large."
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L4e:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.String r6 = "unit == null"
            r5.<init>(r6)
            throw r5
        L56:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.String r7 = " < 0"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public static void checkOffsetAndCount(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L12
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L12
            long r4 = r4 - r6
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 < 0) goto L12
            return
        L12:
            java.lang.ArrayIndexOutOfBoundsException r4 = new java.lang.ArrayIndexOutOfBoundsException
            r4.<init>()
            throw r4
    }

    public static void closeQuietly(java.io.Closeable r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static void closeQuietly(java.net.ServerSocket r0) {
            if (r0 == 0) goto L8
            r0.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.Exception -> L8
            goto L8
        L6:
            r0 = move-exception
            throw r0
        L8:
            return
    }

    public static void closeQuietly(java.net.Socket r1) {
            if (r1 == 0) goto L11
            r1.close()     // Catch: java.lang.RuntimeException -> L6 java.lang.AssertionError -> L8 java.lang.Exception -> L11
            goto L11
        L6:
            r1 = move-exception
            throw r1
        L8:
            r1 = move-exception
            boolean r0 = isAndroidGetsocknameError(r1)
            if (r0 == 0) goto L10
            goto L11
        L10:
            throw r1
        L11:
            return
    }

    public static java.lang.String[] concat(java.lang.String[] r4, java.lang.String r5) {
            int r0 = r4.length
            int r0 = r0 + 1
            java.lang.String[] r1 = new java.lang.String[r0]
            r2 = 0
            int r3 = r4.length
            java.lang.System.arraycopy(r4, r2, r1, r2, r3)
            int r0 = r0 + (-1)
            r1[r0] = r5
            return r1
    }

    private static boolean containsInvalidHostnameAsciiCodes(java.lang.String r5) {
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.length()
            if (r1 >= r2) goto L24
            char r2 = r5.charAt(r1)
            r3 = 31
            r4 = 1
            if (r2 <= r3) goto L23
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 < r3) goto L16
            goto L23
        L16:
            java.lang.String r3 = " #%/:?@[\\]"
            int r2 = r3.indexOf(r2)
            r3 = -1
            if (r2 == r3) goto L20
            return r4
        L20:
            int r1 = r1 + 1
            goto L2
        L23:
            return r4
        L24:
            return r0
    }

    public static int decodeHexDigit(char r2) {
            r0 = 48
            if (r2 < r0) goto La
            r1 = 57
            if (r2 > r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r2 < r0) goto L16
            r1 = 102(0x66, float:1.43E-43)
            if (r2 > r1) goto L16
        L12:
            int r2 = r2 - r0
            int r2 = r2 + 10
            return r2
        L16:
            r0 = 65
            if (r2 < r0) goto L1f
            r1 = 70
            if (r2 > r1) goto L1f
            goto L12
        L1f:
            r2 = -1
            return r2
    }

    private static boolean decodeIpv4Suffix(java.lang.String r7, int r8, int r9, byte[] r10, int r11) {
            r0 = r11
        L1:
            r1 = 0
            if (r8 >= r9) goto L44
            int r2 = r10.length
            if (r0 != r2) goto L8
            return r1
        L8:
            if (r0 == r11) goto L15
            char r2 = r7.charAt(r8)
            r3 = 46
            if (r2 == r3) goto L13
            return r1
        L13:
            int r8 = r8 + 1
        L15:
            r2 = r8
            r3 = r1
        L17:
            if (r2 >= r9) goto L37
            char r4 = r7.charAt(r2)
            r5 = 48
            if (r4 < r5) goto L37
            r6 = 57
            if (r4 <= r6) goto L26
            goto L37
        L26:
            if (r3 != 0) goto L2b
            if (r8 == r2) goto L2b
            return r1
        L2b:
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r3 = r3 - r5
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L34
            return r1
        L34:
            int r2 = r2 + 1
            goto L17
        L37:
            int r8 = r2 - r8
            if (r8 != 0) goto L3c
            return r1
        L3c:
            int r8 = r0 + 1
            byte r1 = (byte) r3
            r10[r0] = r1
            r0 = r8
            r8 = r2
            goto L1
        L44:
            int r11 = r11 + 4
            if (r0 == r11) goto L49
            return r1
        L49:
            r7 = 1
            return r7
    }

    @javax.annotation.Nullable
    private static java.net.InetAddress decodeIpv6(java.lang.String r11, int r12, int r13) {
            r0 = 16
            byte[] r1 = new byte[r0]
            r2 = 0
            r3 = -1
            r4 = r2
            r5 = r3
            r6 = r5
        L9:
            r7 = 0
            if (r12 >= r13) goto L7a
            if (r4 != r0) goto Lf
            return r7
        Lf:
            int r8 = r12 + 2
            if (r8 > r13) goto L27
            java.lang.String r9 = "::"
            r10 = 2
            boolean r9 = r11.regionMatches(r12, r9, r2, r10)
            if (r9 == 0) goto L27
            if (r5 == r3) goto L1f
            return r7
        L1f:
            int r4 = r4 + 2
            r5 = r4
            if (r8 != r13) goto L25
            goto L7a
        L25:
            r6 = r8
            goto L4b
        L27:
            if (r4 == 0) goto L4a
            java.lang.String r8 = ":"
            r9 = 1
            boolean r8 = r11.regionMatches(r12, r8, r2, r9)
            if (r8 == 0) goto L35
            int r12 = r12 + 1
            goto L4a
        L35:
            java.lang.String r8 = "."
            boolean r12 = r11.regionMatches(r12, r8, r2, r9)
            if (r12 == 0) goto L49
            int r12 = r4 + (-2)
            boolean r11 = decodeIpv4Suffix(r11, r6, r13, r1, r12)
            if (r11 != 0) goto L46
            return r7
        L46:
            int r4 = r4 + 2
            goto L7a
        L49:
            return r7
        L4a:
            r6 = r12
        L4b:
            r8 = r2
            r12 = r6
        L4d:
            if (r12 >= r13) goto L60
            char r9 = r11.charAt(r12)
            int r9 = decodeHexDigit(r9)
            if (r9 != r3) goto L5a
            goto L60
        L5a:
            int r8 = r8 << 4
            int r8 = r8 + r9
            int r12 = r12 + 1
            goto L4d
        L60:
            int r9 = r12 - r6
            if (r9 == 0) goto L79
            r10 = 4
            if (r9 <= r10) goto L68
            goto L79
        L68:
            int r7 = r4 + 1
            int r9 = r8 >>> 8
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r9 = (byte) r9
            r1[r4] = r9
            int r4 = r7 + 1
            r8 = r8 & 255(0xff, float:3.57E-43)
            byte r8 = (byte) r8
            r1[r7] = r8
            goto L9
        L79:
            return r7
        L7a:
            if (r4 == r0) goto L8b
            if (r5 != r3) goto L7f
            return r7
        L7f:
            int r11 = r4 - r5
            int r12 = 16 - r11
            java.lang.System.arraycopy(r1, r5, r1, r12, r11)
            int r0 = r0 - r4
            int r0 = r0 + r5
            java.util.Arrays.fill(r1, r5, r0, r2)
        L8b:
            java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
            return r11
        L90:
            java.lang.AssertionError r11 = new java.lang.AssertionError
            r11.<init>()
            throw r11
    }

    public static int delimiterOffset(java.lang.String r1, int r2, int r3, char r4) {
        L0:
            if (r2 >= r3) goto Lc
            char r0 = r1.charAt(r2)
            if (r0 != r4) goto L9
            return r2
        L9:
            int r2 = r2 + 1
            goto L0
        Lc:
            return r3
    }

    public static int delimiterOffset(java.lang.String r2, int r3, int r4, java.lang.String r5) {
        L0:
            if (r3 >= r4) goto L11
            char r0 = r2.charAt(r3)
            int r0 = r5.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto Le
            return r3
        Le:
            int r3 = r3 + 1
            goto L0
        L11:
            return r4
    }

    public static boolean discard(okio.Source r0, int r1, java.util.concurrent.TimeUnit r2) {
            boolean r0 = skipAll(r0, r1, r2)     // Catch: java.io.IOException -> L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    public static java.lang.String getSystemProperty(java.lang.String r0, @javax.annotation.Nullable java.lang.String r1) {
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.security.AccessControlException -> L7
            if (r0 == 0) goto L7
            r1 = r0
        L7:
            return r1
    }

    public static java.lang.String hostHeader(okhttp3.HttpUrl r3, boolean r4) {
            java.lang.String r0 = r3.host()
            java.lang.String r1 = ":"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L26
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            java.lang.String r2 = r3.host()
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = "]"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r0 = r0.toString()
            goto L2a
        L26:
            java.lang.String r0 = r3.host()
        L2a:
            if (r4 != 0) goto L3a
            int r4 = r3.port()
            java.lang.String r2 = r3.scheme()
            int r2 = okhttp3.HttpUrl.defaultPort(r2)
            if (r4 == r2) goto L53
        L3a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.StringBuilder r4 = r4.append(r1)
            int r3 = r3.port()
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r0 = r3.toString()
        L53:
            return r0
    }

    public static <T> java.util.List<T> immutableList(java.util.List<T> r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            return r1
    }

    @java.lang.SafeVarargs
    public static <T> java.util.List<T> immutableList(T... r0) {
            java.lang.Object r0 = r0.clone()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            return r0
    }

    public static <K, V> java.util.Map<K, V> immutableMap(java.util.Map<K, V> r1) {
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            java.util.Map r1 = java.util.Collections.emptyMap()
            goto L14
        Lb:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            java.util.Map r1 = java.util.Collections.unmodifiableMap(r0)
        L14:
            return r1
    }

    public static int indexOf(java.util.Comparator<java.lang.String> r3, java.lang.String[] r4, java.lang.String r5) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L10
            r2 = r4[r1]
            int r2 = r3.compare(r2, r5)
            if (r2 != 0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L2
        L10:
            r3 = -1
            return r3
    }

    public static int indexOfControlOrNonAscii(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L18
            char r2 = r4.charAt(r1)
            r3 = 31
            if (r2 <= r3) goto L17
            r3 = 127(0x7f, float:1.78E-43)
            if (r2 < r3) goto L14
            goto L17
        L14:
            int r1 = r1 + 1
            goto L5
        L17:
            return r1
        L18:
            r4 = -1
            return r4
    }

    private static java.lang.String inet6AddressToAscii(byte[] r8) {
            r0 = -1
            r1 = 0
            r2 = r1
            r3 = r2
        L4:
            int r4 = r8.length
            r5 = 16
            if (r2 >= r4) goto L25
            r4 = r2
        La:
            if (r4 >= r5) goto L19
            r6 = r8[r4]
            if (r6 != 0) goto L19
            int r6 = r4 + 1
            r6 = r8[r6]
            if (r6 != 0) goto L19
            int r4 = r4 + 2
            goto La
        L19:
            int r5 = r4 - r2
            if (r5 <= r3) goto L22
            r6 = 4
            if (r5 < r6) goto L22
            r0 = r2
            r3 = r5
        L22:
            int r2 = r4 + 2
            goto L4
        L25:
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
        L2a:
            int r4 = r8.length
            if (r1 >= r4) goto L54
            r4 = 58
            if (r1 != r0) goto L3b
            r2.writeByte(r4)
            int r1 = r1 + r3
            if (r1 != r5) goto L2a
            r2.writeByte(r4)
            goto L2a
        L3b:
            if (r1 <= 0) goto L40
            r2.writeByte(r4)
        L40:
            r4 = r8[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 8
            int r6 = r1 + 1
            r6 = r8[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.writeHexadecimalUnsignedLong(r6)
            int r1 = r1 + 2
            goto L2a
        L54:
            java.lang.String r8 = r2.readUtf8()
            return r8
    }

    public static java.lang.String[] intersect(java.util.Comparator<? super java.lang.String> r8, java.lang.String[] r9, java.lang.String[] r10) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r9.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L22
            r4 = r9[r3]
            int r5 = r10.length
            r6 = r2
        Le:
            if (r6 >= r5) goto L1f
            r7 = r10[r6]
            int r7 = r8.compare(r4, r7)
            if (r7 != 0) goto L1c
            r0.add(r4)
            goto L1f
        L1c:
            int r6 = r6 + 1
            goto Le
        L1f:
            int r3 = r3 + 1
            goto L8
        L22:
            int r8 = r0.size()
            java.lang.String[] r8 = new java.lang.String[r8]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static boolean isAndroidGetsocknameError(java.lang.AssertionError r1) {
            java.lang.Throwable r0 = r1.getCause()
            if (r0 == 0) goto L1a
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L1a
            java.lang.String r1 = r1.getMessage()
            java.lang.String r0 = "getsockname failed"
            boolean r1 = r1.contains(r0)
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1b
        L1a:
            r1 = 0
        L1b:
            return r1
    }

    static /* synthetic */ java.lang.Thread lambda$threadFactory$0(java.lang.String r1, boolean r2, java.lang.Runnable r3) {
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r3, r1)
            r0.setDaemon(r2)
            return r0
    }

    public static boolean nonEmptyIntersection(java.util.Comparator<java.lang.String> r7, java.lang.String[] r8, java.lang.String[] r9) {
            r0 = 0
            if (r8 == 0) goto L26
            if (r9 == 0) goto L26
            int r1 = r8.length
            if (r1 == 0) goto L26
            int r1 = r9.length
            if (r1 != 0) goto Lc
            goto L26
        Lc:
            int r1 = r8.length
            r2 = r0
        Le:
            if (r2 >= r1) goto L26
            r3 = r8[r2]
            int r4 = r9.length
            r5 = r0
        L14:
            if (r5 >= r4) goto L23
            r6 = r9[r5]
            int r6 = r7.compare(r3, r6)
            if (r6 != 0) goto L20
            r7 = 1
            return r7
        L20:
            int r5 = r5 + 1
            goto L14
        L23:
            int r2 = r2 + 1
            goto Le
        L26:
            return r0
    }

    public static javax.net.ssl.X509TrustManager platformTrustManager() {
            java.lang.String r0 = "Unexpected default trust managers:"
            java.lang.String r1 = javax.net.ssl.TrustManagerFactory.getDefaultAlgorithm()     // Catch: java.security.GeneralSecurityException -> L3a
            javax.net.ssl.TrustManagerFactory r1 = javax.net.ssl.TrustManagerFactory.getInstance(r1)     // Catch: java.security.GeneralSecurityException -> L3a
            r2 = 0
            r3 = r2
            java.security.KeyStore r3 = (java.security.KeyStore) r3     // Catch: java.security.GeneralSecurityException -> L3a
            r1.init(r2)     // Catch: java.security.GeneralSecurityException -> L3a
            javax.net.ssl.TrustManager[] r1 = r1.getTrustManagers()     // Catch: java.security.GeneralSecurityException -> L3a
            int r2 = r1.length     // Catch: java.security.GeneralSecurityException -> L3a
            r3 = 1
            if (r2 != r3) goto L23
            r2 = 0
            r2 = r1[r2]     // Catch: java.security.GeneralSecurityException -> L3a
            boolean r3 = r2 instanceof javax.net.ssl.X509TrustManager     // Catch: java.security.GeneralSecurityException -> L3a
            if (r3 == 0) goto L23
            javax.net.ssl.X509TrustManager r2 = (javax.net.ssl.X509TrustManager) r2     // Catch: java.security.GeneralSecurityException -> L3a
            return r2
        L23:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.security.GeneralSecurityException -> L3a
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.security.GeneralSecurityException -> L3a
            r3.<init>(r0)     // Catch: java.security.GeneralSecurityException -> L3a
            java.lang.String r0 = java.util.Arrays.toString(r1)     // Catch: java.security.GeneralSecurityException -> L3a
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.security.GeneralSecurityException -> L3a
            java.lang.String r0 = r0.toString()     // Catch: java.security.GeneralSecurityException -> L3a
            r2.<init>(r0)     // Catch: java.security.GeneralSecurityException -> L3a
            throw r2     // Catch: java.security.GeneralSecurityException -> L3a
        L3a:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError
            java.lang.String r2 = "No System TLS"
            r1.<init>(r2, r0)
            throw r1
    }

    public static boolean sameConnection(okhttp3.HttpUrl r2, okhttp3.HttpUrl r3) {
            java.lang.String r0 = r2.host()
            java.lang.String r1 = r3.host()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            int r0 = r2.port()
            int r1 = r3.port()
            if (r0 != r1) goto L28
            java.lang.String r2 = r2.scheme()
            java.lang.String r3 = r3.scheme()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    public static boolean skipAll(okio.Source r11, int r12, java.util.concurrent.TimeUnit r13) throws java.io.IOException {
            long r0 = java.lang.System.nanoTime()
            okio.Timeout r2 = r11.timeout()
            boolean r2 = r2.hasDeadline()
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r2 == 0) goto L1d
            okio.Timeout r2 = r11.timeout()
            long r5 = r2.deadlineNanoTime()
            long r5 = r5 - r0
            goto L1e
        L1d:
            r5 = r3
        L1e:
            okio.Timeout r2 = r11.timeout()
            long r7 = (long) r12
            long r12 = r13.toNanos(r7)
            long r12 = java.lang.Math.min(r5, r12)
            long r12 = r12 + r0
            r2.deadlineNanoTime(r12)
            okio.Buffer r12 = new okio.Buffer     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            r12.<init>()     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
        L34:
            r7 = 8192(0x2000, double:4.0474E-320)
            long r7 = r11.read(r12, r7)     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            r9 = -1
            int r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r13 == 0) goto L44
            r12.clear()     // Catch: java.lang.Throwable -> L5a java.io.InterruptedIOException -> L70
            goto L34
        L44:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L50
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L58
        L50:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L58:
            r11 = 1
            return r11
        L5a:
            r12 = move-exception
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 != 0) goto L67
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L6f
        L67:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L6f:
            throw r12
        L70:
            int r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r12 != 0) goto L7c
            okio.Timeout r11 = r11.timeout()
            r11.clearDeadline()
            goto L84
        L7c:
            okio.Timeout r11 = r11.timeout()
            long r0 = r0 + r5
            r11.deadlineNanoTime(r0)
        L84:
            r11 = 0
            return r11
    }

    public static int skipLeadingAsciiWhitespace(java.lang.String r2, int r3, int r4) {
        L0:
            if (r3 >= r4) goto L1e
            char r0 = r2.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L1b
            r1 = 10
            if (r0 == r1) goto L1b
            r1 = 12
            if (r0 == r1) goto L1b
            r1 = 13
            if (r0 == r1) goto L1b
            r1 = 32
            if (r0 == r1) goto L1b
            return r3
        L1b:
            int r3 = r3 + 1
            goto L0
        L1e:
            return r4
    }

    public static int skipTrailingAsciiWhitespace(java.lang.String r2, int r3, int r4) {
            int r4 = r4 + (-1)
        L2:
            if (r4 < r3) goto L22
            char r0 = r2.charAt(r4)
            r1 = 9
            if (r0 == r1) goto L1f
            r1 = 10
            if (r0 == r1) goto L1f
            r1 = 12
            if (r0 == r1) goto L1f
            r1 = 13
            if (r0 == r1) goto L1f
            r1 = 32
            if (r0 == r1) goto L1f
            int r4 = r4 + 1
            return r4
        L1f:
            int r4 = r4 + (-1)
            goto L2
        L22:
            return r3
    }

    public static java.util.concurrent.ThreadFactory threadFactory(java.lang.String r1, boolean r2) {
            okhttp3.internal.Util$$ExternalSyntheticLambda0 r0 = new okhttp3.internal.Util$$ExternalSyntheticLambda0
            r0.<init>(r1, r2)
            return r0
    }

    public static java.util.List<okhttp3.internal.http2.Header> toHeaderBlock(okhttp3.Headers r5) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r1 >= r2) goto L1f
            okhttp3.internal.http2.Header r2 = new okhttp3.internal.http2.Header
            java.lang.String r3 = r5.name(r1)
            java.lang.String r4 = r5.value(r1)
            r2.<init>(r3, r4)
            r0.add(r2)
            int r1 = r1 + 1
            goto L6
        L1f:
            return r0
    }

    public static okhttp3.Headers toHeaders(java.util.List<okhttp3.internal.http2.Header> r4) {
            okhttp3.Headers$Builder r0 = new okhttp3.Headers$Builder
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L9:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            okhttp3.internal.http2.Header r1 = (okhttp3.internal.http2.Header) r1
            okhttp3.internal.Internal r2 = okhttp3.internal.Internal.instance
            okio.ByteString r3 = r1.name
            java.lang.String r3 = r3.utf8()
            okio.ByteString r1 = r1.value
            java.lang.String r1 = r1.utf8()
            r2.addLenient(r0, r3, r1)
            goto L9
        L27:
            okhttp3.Headers r4 = r0.build()
            return r4
    }

    public static java.lang.String trimSubstring(java.lang.String r0, int r1, int r2) {
            int r1 = skipLeadingAsciiWhitespace(r0, r1, r2)
            int r2 = skipTrailingAsciiWhitespace(r0, r1, r2)
            java.lang.String r0 = r0.substring(r1, r2)
            return r0
    }

    public static boolean verifyAsIpAddress(java.lang.String r1) {
            java.util.regex.Pattern r0 = okhttp3.internal.Util.VERIFY_AS_IP_ADDRESS
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }
}
