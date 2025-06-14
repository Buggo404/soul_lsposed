package okio;

/* loaded from: classes.dex */
public class ByteString implements java.io.Serializable, java.lang.Comparable<okio.ByteString> {
    public static final okio.ByteString EMPTY = null;
    static final char[] HEX_DIGITS = null;
    private static final long serialVersionUID = 1;
    final byte[] data;
    transient int hashCode;
    transient java.lang.String utf8;

    static {
            r0 = 16
            char[] r0 = new char[r0]
            r0 = {x0014: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            okio.ByteString.HEX_DIGITS = r0
            r0 = 0
            byte[] r0 = new byte[r0]
            okio.ByteString r0 = m96of(r0)
            okio.ByteString.EMPTY = r0
            return
    }

    ByteString(byte[] r1) {
            r0 = this;
            r0.<init>()
            r0.data = r1
            return
    }

    static int codePointIndexToCharIndex(java.lang.String r5, int r6) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r1 >= r0) goto L2c
            if (r2 != r6) goto Lb
            return r1
        Lb:
            int r3 = r5.codePointAt(r1)
            boolean r4 = java.lang.Character.isISOControl(r3)
            if (r4 == 0) goto L1d
            r4 = 10
            if (r3 == r4) goto L1d
            r4 = 13
            if (r3 != r4) goto L22
        L1d:
            r4 = 65533(0xfffd, float:9.1831E-41)
            if (r3 != r4) goto L24
        L22:
            r5 = -1
            return r5
        L24:
            int r2 = r2 + 1
            int r3 = java.lang.Character.charCount(r3)
            int r1 = r1 + r3
            goto L6
        L2c:
            int r5 = r5.length()
            return r5
    }

    @javax.annotation.Nullable
    public static okio.ByteString decodeBase64(java.lang.String r1) {
            if (r1 == 0) goto L10
            byte[] r1 = okio.Base64.decode(r1)
            if (r1 == 0) goto Le
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
        L10:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "base64 == null"
            r1.<init>(r0)
            throw r1
    }

    public static okio.ByteString decodeHex(java.lang.String r5) {
            if (r5 == 0) goto L4c
            int r0 = r5.length()
            int r0 = r0 % 2
            if (r0 != 0) goto L37
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L13:
            if (r2 >= r0) goto L32
            int r3 = r2 * 2
            char r4 = r5.charAt(r3)
            int r4 = decodeHexDigit(r4)
            int r4 = r4 << 4
            int r3 = r3 + 1
            char r3 = r5.charAt(r3)
            int r3 = decodeHexDigit(r3)
            int r4 = r4 + r3
            byte r3 = (byte) r4
            r1[r2] = r3
            int r2 = r2 + 1
            goto L13
        L32:
            okio.ByteString r5 = m96of(r1)
            return r5
        L37:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex string: "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r5 = r5.toString()
            r0.<init>(r5)
            throw r0
        L4c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "hex == null"
            r5.<init>(r0)
            throw r5
    }

    private static int decodeHexDigit(char r3) {
            r0 = 48
            if (r3 < r0) goto La
            r1 = 57
            if (r3 > r1) goto La
            int r3 = r3 - r0
            return r3
        La:
            r0 = 97
            if (r3 < r0) goto L16
            r1 = 102(0x66, float:1.43E-43)
            if (r3 > r1) goto L16
        L12:
            int r3 = r3 - r0
            int r3 = r3 + 10
            return r3
        L16:
            r0 = 65
            if (r3 < r0) goto L1f
            r1 = 70
            if (r3 > r1) goto L1f
            goto L12
        L1f:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected hex digit: "
            r1.<init>(r2)
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    private okio.ByteString digest(java.lang.String r2) {
            r1 = this;
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            byte[] r0 = r1.data     // Catch: java.security.NoSuchAlgorithmException -> Lf
            byte[] r2 = r2.digest(r0)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            okio.ByteString r2 = m96of(r2)     // Catch: java.security.NoSuchAlgorithmException -> Lf
            return r2
        Lf:
            r2 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r2)
            throw r0
    }

    public static okio.ByteString encodeString(java.lang.String r1, java.nio.charset.Charset r2) {
            if (r1 == 0) goto L16
            if (r2 == 0) goto Le
            okio.ByteString r0 = new okio.ByteString
            byte[] r1 = r1.getBytes(r2)
            r0.<init>(r1)
            return r0
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "charset == null"
            r1.<init>(r2)
            throw r1
        L16:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "s == null"
            r1.<init>(r2)
            throw r1
    }

    public static okio.ByteString encodeUtf8(java.lang.String r2) {
            if (r2 == 0) goto L10
            okio.ByteString r0 = new okio.ByteString
            java.nio.charset.Charset r1 = okio.Util.UTF_8
            byte[] r1 = r2.getBytes(r1)
            r0.<init>(r1)
            r0.utf8 = r2
            return r0
        L10:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "s == null"
            r2.<init>(r0)
            throw r2
    }

    private okio.ByteString hmac(java.lang.String r3, okio.ByteString r4) {
            r2 = this;
            javax.crypto.Mac r0 = javax.crypto.Mac.getInstance(r3)     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            javax.crypto.spec.SecretKeySpec r1 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            byte[] r4 = r4.toByteArray()     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            r1.<init>(r4, r3)     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            r0.init(r1)     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            byte[] r3 = r2.data     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            byte[] r3 = r0.doFinal(r3)     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            okio.ByteString r3 = m96of(r3)     // Catch: java.security.InvalidKeyException -> L1b java.security.NoSuchAlgorithmException -> L22
            return r3
        L1b:
            r3 = move-exception
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>(r3)
            throw r4
        L22:
            r3 = move-exception
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>(r3)
            throw r4
    }

    /* renamed from: of */
    public static okio.ByteString m95of(java.nio.ByteBuffer r1) {
            if (r1 == 0) goto L11
            int r0 = r1.remaining()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            okio.ByteString r1 = new okio.ByteString
            r1.<init>(r0)
            return r1
        L11:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "data == null"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: of */
    public static okio.ByteString m96of(byte... r1) {
            if (r1 == 0) goto Le
            okio.ByteString r0 = new okio.ByteString
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            r0.<init>(r1)
            return r0
        Le:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "data == null"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: of */
    public static okio.ByteString m97of(byte[] r7, int r8, int r9) {
            if (r7 == 0) goto L15
            int r0 = r7.length
            long r1 = (long) r0
            long r3 = (long) r8
            long r5 = (long) r9
            okio.Util.checkOffsetAndCount(r1, r3, r5)
            byte[] r0 = new byte[r9]
            r1 = 0
            java.lang.System.arraycopy(r7, r8, r0, r1, r9)
            okio.ByteString r7 = new okio.ByteString
            r7.<init>(r0)
            return r7
        L15:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "data == null"
            r7.<init>(r8)
            throw r7
    }

    public static okio.ByteString read(java.io.InputStream r4, int r5) throws java.io.IOException {
            if (r4 == 0) goto L35
            if (r5 < 0) goto L20
            byte[] r0 = new byte[r5]
            r1 = 0
        L7:
            if (r1 >= r5) goto L1a
            int r2 = r5 - r1
            int r2 = r4.read(r0, r1, r2)
            r3 = -1
            if (r2 == r3) goto L14
            int r1 = r1 + r2
            goto L7
        L14:
            java.io.EOFException r4 = new java.io.EOFException
            r4.<init>()
            throw r4
        L1a:
            okio.ByteString r4 = new okio.ByteString
            r4.<init>(r0)
            return r4
        L20:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "byteCount < 0: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L35:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "in == null"
            r4.<init>(r5)
            throw r4
    }

    private void readObject(java.io.ObjectInputStream r3) throws java.io.IOException {
            r2 = this;
            int r0 = r3.readInt()
            okio.ByteString r3 = read(r3, r0)
            java.lang.Class<okio.ByteString> r0 = okio.ByteString.class
            java.lang.String r1 = "data"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L20
            r1 = 1
            r0.setAccessible(r1)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L20
            byte[] r3 = r3.data     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L20
            r0.set(r2, r3)     // Catch: java.lang.IllegalAccessException -> L1a java.lang.NoSuchFieldException -> L20
            return
        L1a:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L20:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
    }

    private void writeObject(java.io.ObjectOutputStream r2) throws java.io.IOException {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            r2.writeInt(r0)
            byte[] r0 = r1.data
            r2.write(r0)
            return
    }

    public java.nio.ByteBuffer asByteBuffer() {
            r1 = this;
            byte[] r0 = r1.data
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            java.nio.ByteBuffer r0 = r0.asReadOnlyBuffer()
            return r0
    }

    public java.lang.String base64() {
            r1 = this;
            byte[] r0 = r1.data
            java.lang.String r0 = okio.Base64.encode(r0)
            return r0
    }

    public java.lang.String base64Url() {
            r1 = this;
            byte[] r0 = r1.data
            java.lang.String r0 = okio.Base64.encodeUrl(r0)
            return r0
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(okio.ByteString r1) {
            r0 = this;
            okio.ByteString r1 = (okio.ByteString) r1
            int r1 = r0.compareTo2(r1)
            return r1
    }

    /* renamed from: compareTo, reason: avoid collision after fix types in other method */
    public int compareTo2(okio.ByteString r10) {
            r9 = this;
            int r0 = r9.size()
            int r1 = r10.size()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        Le:
            r5 = -1
            r6 = 1
            if (r4 >= r2) goto L28
            byte r7 = r9.getByte(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            byte r8 = r10.getByte(r4)
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r7 != r8) goto L23
            int r4 = r4 + 1
            goto Le
        L23:
            if (r7 >= r8) goto L26
            goto L27
        L26:
            r5 = r6
        L27:
            return r5
        L28:
            if (r0 != r1) goto L2b
            return r3
        L2b:
            if (r0 >= r1) goto L2e
            goto L2f
        L2e:
            r5 = r6
        L2f:
            return r5
    }

    public final boolean endsWith(okio.ByteString r4) {
            r3 = this;
            int r0 = r3.size()
            int r1 = r4.size()
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.size()
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public final boolean endsWith(byte[] r4) {
            r3 = this;
            int r0 = r3.size()
            int r1 = r4.length
            int r0 = r0 - r1
            r1 = 0
            int r2 = r4.length
            boolean r4 = r3.rangeEquals(r0, r4, r1, r2)
            return r4
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof okio.ByteString
            r2 = 0
            if (r1 == 0) goto L1c
            okio.ByteString r6 = (okio.ByteString) r6
            int r1 = r6.size()
            byte[] r3 = r5.data
            int r4 = r3.length
            if (r1 != r4) goto L1c
            int r1 = r3.length
            boolean r6 = r6.rangeEquals(r2, r3, r2, r1)
            if (r6 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r2
        L1d:
            return r0
    }

    public byte getByte(int r2) {
            r1 = this;
            byte[] r0 = r1.data
            r2 = r0[r2]
            return r2
    }

    public int hashCode() {
            r1 = this;
            int r0 = r1.hashCode
            if (r0 == 0) goto L5
            goto Ld
        L5:
            byte[] r0 = r1.data
            int r0 = java.util.Arrays.hashCode(r0)
            r1.hashCode = r0
        Ld:
            return r0
    }

    public java.lang.String hex() {
            r9 = this;
            byte[] r0 = r9.data
            int r1 = r0.length
            int r1 = r1 * 2
            char[] r1 = new char[r1]
            int r2 = r0.length
            r3 = 0
            r4 = r3
        La:
            if (r3 >= r2) goto L25
            r5 = r0[r3]
            int r6 = r4 + 1
            char[] r7 = okio.ByteString.HEX_DIGITS
            int r8 = r5 >> 4
            r8 = r8 & 15
            char r8 = r7[r8]
            r1[r4] = r8
            int r4 = r6 + 1
            r5 = r5 & 15
            char r5 = r7[r5]
            r1[r6] = r5
            int r3 = r3 + 1
            goto La
        L25:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
            return r0
    }

    public okio.ByteString hmacSha1(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "HmacSHA1"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public okio.ByteString hmacSha256(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "HmacSHA256"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public okio.ByteString hmacSha512(okio.ByteString r2) {
            r1 = this;
            java.lang.String r0 = "HmacSHA512"
            okio.ByteString r2 = r1.hmac(r0, r2)
            return r2
    }

    public final int indexOf(okio.ByteString r2) {
            r1 = this;
            byte[] r2 = r2.internalArray()
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public final int indexOf(okio.ByteString r1, int r2) {
            r0 = this;
            byte[] r1 = r1.internalArray()
            int r1 = r0.indexOf(r1, r2)
            return r1
    }

    public final int indexOf(byte[] r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public int indexOf(byte[] r5, int r6) {
            r4 = this;
            r0 = 0
            int r6 = java.lang.Math.max(r6, r0)
            byte[] r1 = r4.data
            int r1 = r1.length
            int r2 = r5.length
            int r1 = r1 - r2
        La:
            if (r6 > r1) goto L19
            byte[] r2 = r4.data
            int r3 = r5.length
            boolean r2 = okio.Util.arrayRangeEquals(r2, r6, r5, r0, r3)
            if (r2 == 0) goto L16
            return r6
        L16:
            int r6 = r6 + 1
            goto La
        L19:
            r5 = -1
            return r5
    }

    byte[] internalArray() {
            r1 = this;
            byte[] r0 = r1.data
            return r0
    }

    public final int lastIndexOf(okio.ByteString r2) {
            r1 = this;
            byte[] r2 = r2.internalArray()
            int r0 = r1.size()
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public final int lastIndexOf(okio.ByteString r1, int r2) {
            r0 = this;
            byte[] r1 = r1.internalArray()
            int r1 = r0.lastIndexOf(r1, r2)
            return r1
    }

    public final int lastIndexOf(byte[] r2) {
            r1 = this;
            int r0 = r1.size()
            int r2 = r1.lastIndexOf(r2, r0)
            return r2
    }

    public int lastIndexOf(byte[] r4, int r5) {
            r3 = this;
            byte[] r0 = r3.data
            int r0 = r0.length
            int r1 = r4.length
            int r0 = r0 - r1
            int r5 = java.lang.Math.min(r5, r0)
        L9:
            if (r5 < 0) goto L19
            byte[] r0 = r3.data
            r1 = 0
            int r2 = r4.length
            boolean r0 = okio.Util.arrayRangeEquals(r0, r5, r4, r1, r2)
            if (r0 == 0) goto L16
            return r5
        L16:
            int r5 = r5 + (-1)
            goto L9
        L19:
            r4 = -1
            return r4
    }

    public okio.ByteString md5() {
            r1 = this;
            java.lang.String r0 = "MD5"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public boolean rangeEquals(int r2, okio.ByteString r3, int r4, int r5) {
            r1 = this;
            byte[] r0 = r1.data
            boolean r2 = r3.rangeEquals(r4, r0, r2, r5)
            return r2
    }

    public boolean rangeEquals(int r3, byte[] r4, int r5, int r6) {
            r2 = this;
            if (r3 < 0) goto L16
            byte[] r0 = r2.data
            int r1 = r0.length
            int r1 = r1 - r6
            if (r3 > r1) goto L16
            if (r5 < 0) goto L16
            int r1 = r4.length
            int r1 = r1 - r6
            if (r5 > r1) goto L16
            boolean r3 = okio.Util.arrayRangeEquals(r0, r3, r4, r5, r6)
            if (r3 == 0) goto L16
            r3 = 1
            goto L17
        L16:
            r3 = 0
        L17:
            return r3
    }

    public okio.ByteString sha1() {
            r1 = this;
            java.lang.String r0 = "SHA-1"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public okio.ByteString sha256() {
            r1 = this;
            java.lang.String r0 = "SHA-256"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public okio.ByteString sha512() {
            r1 = this;
            java.lang.String r0 = "SHA-512"
            okio.ByteString r0 = r1.digest(r0)
            return r0
    }

    public int size() {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            return r0
    }

    public final boolean startsWith(okio.ByteString r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.size()
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    public final boolean startsWith(byte[] r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length
            boolean r3 = r2.rangeEquals(r0, r3, r0, r1)
            return r3
    }

    public java.lang.String string(java.nio.charset.Charset r3) {
            r2 = this;
            if (r3 == 0) goto La
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r2.data
            r0.<init>(r1, r3)
            return r0
        La:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "charset == null"
            r3.<init>(r0)
            throw r3
    }

    public okio.ByteString substring(int r2) {
            r1 = this;
            byte[] r0 = r1.data
            int r0 = r0.length
            okio.ByteString r2 = r1.substring(r2, r0)
            return r2
    }

    public okio.ByteString substring(int r4, int r5) {
            r3 = this;
            if (r4 < 0) goto L43
            byte[] r0 = r3.data
            int r1 = r0.length
            if (r5 > r1) goto L25
            int r1 = r5 - r4
            if (r1 < 0) goto L1d
            if (r4 != 0) goto L11
            int r2 = r0.length
            if (r5 != r2) goto L11
            return r3
        L11:
            byte[] r5 = new byte[r1]
            r2 = 0
            java.lang.System.arraycopy(r0, r4, r5, r2, r1)
            okio.ByteString r4 = new okio.ByteString
            r4.<init>(r5)
            return r4
        L1d:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "endIndex < beginIndex"
            r4.<init>(r5)
            throw r4
        L25:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "endIndex > length("
            r5.<init>(r0)
            byte[] r0 = r3.data
            int r0 = r0.length
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L43:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "beginIndex < 0"
            r4.<init>(r5)
            throw r4
    }

    public okio.ByteString toAsciiLowercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.data
            int r2 = r1.length
            if (r0 >= r2) goto L39
            r2 = r1[r0]
            r3 = 65
            if (r2 < r3) goto L36
            r4 = 90
            if (r2 <= r4) goto L11
            goto L36
        L11:
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            int r5 = r0 + 1
            int r2 = r2 + 32
            byte r2 = (byte) r2
            r1[r0] = r2
        L1e:
            int r0 = r1.length
            if (r5 >= r0) goto L30
            r0 = r1[r5]
            if (r0 < r3) goto L2d
            if (r0 <= r4) goto L28
            goto L2d
        L28:
            int r0 = r0 + 32
            byte r0 = (byte) r0
            r1[r5] = r0
        L2d:
            int r5 = r5 + 1
            goto L1e
        L30:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            return r0
        L36:
            int r0 = r0 + 1
            goto L1
        L39:
            return r6
    }

    public okio.ByteString toAsciiUppercase() {
            r6 = this;
            r0 = 0
        L1:
            byte[] r1 = r6.data
            int r2 = r1.length
            if (r0 >= r2) goto L39
            r2 = r1[r0]
            r3 = 97
            if (r2 < r3) goto L36
            r4 = 122(0x7a, float:1.71E-43)
            if (r2 <= r4) goto L11
            goto L36
        L11:
            java.lang.Object r1 = r1.clone()
            byte[] r1 = (byte[]) r1
            int r5 = r0 + 1
            int r2 = r2 + (-32)
            byte r2 = (byte) r2
            r1[r0] = r2
        L1e:
            int r0 = r1.length
            if (r5 >= r0) goto L30
            r0 = r1[r5]
            if (r0 < r3) goto L2d
            if (r0 <= r4) goto L28
            goto L2d
        L28:
            int r0 = r0 + (-32)
            byte r0 = (byte) r0
            r1[r5] = r0
        L2d:
            int r5 = r5 + 1
            goto L1e
        L30:
            okio.ByteString r0 = new okio.ByteString
            r0.<init>(r1)
            return r0
        L36:
            int r0 = r0 + 1
            goto L1
        L39:
            return r6
    }

    public byte[] toByteArray() {
            r1 = this;
            byte[] r0 = r1.data
            java.lang.Object r0 = r0.clone()
            byte[] r0 = (byte[]) r0
            return r0
    }

    public java.lang.String toString() {
            r8 = this;
            byte[] r0 = r8.data
            int r0 = r0.length
            if (r0 != 0) goto L8
            java.lang.String r0 = "[size=0]"
            return r0
        L8:
            java.lang.String r0 = r8.utf8()
            r1 = 64
            int r2 = codePointIndexToCharIndex(r0, r1)
            r3 = -1
            java.lang.String r4 = "…]"
            java.lang.String r5 = "[size="
            java.lang.String r6 = "]"
            r7 = 0
            if (r2 != r3) goto L60
            byte[] r0 = r8.data
            int r0 = r0.length
            if (r0 > r1) goto L39
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[hex="
            r0.<init>(r1)
            java.lang.String r1 = r8.hex()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
            goto L5f
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r2 = r8.data
            int r2 = r2.length
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " hex="
            java.lang.StringBuilder r0 = r0.append(r2)
            okio.ByteString r1 = r8.substring(r7, r1)
            java.lang.String r1 = r1.hex()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
        L5f:
            return r0
        L60:
            java.lang.String r1 = r0.substring(r7, r2)
            java.lang.String r3 = "\\"
            java.lang.String r7 = "\\\\"
            java.lang.String r1 = r1.replace(r3, r7)
            java.lang.String r3 = "\n"
            java.lang.String r7 = "\\n"
            java.lang.String r1 = r1.replace(r3, r7)
            java.lang.String r3 = "\r"
            java.lang.String r7 = "\\r"
            java.lang.String r1 = r1.replace(r3, r7)
            int r0 = r0.length()
            if (r2 >= r0) goto La1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            byte[] r2 = r8.data
            int r2 = r2.length
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " text="
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto Lb4
        La1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "[text="
            r0.<init>(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.StringBuilder r0 = r0.append(r6)
            java.lang.String r0 = r0.toString()
        Lb4:
            return r0
    }

    public java.lang.String utf8() {
            r3 = this;
            java.lang.String r0 = r3.utf8
            if (r0 == 0) goto L5
            goto L10
        L5:
            java.lang.String r0 = new java.lang.String
            byte[] r1 = r3.data
            java.nio.charset.Charset r2 = okio.Util.UTF_8
            r0.<init>(r1, r2)
            r3.utf8 = r0
        L10:
            return r0
    }

    public void write(java.io.OutputStream r2) throws java.io.IOException {
            r1 = this;
            if (r2 == 0) goto L8
            byte[] r0 = r1.data
            r2.write(r0)
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "out == null"
            r2.<init>(r0)
            throw r2
    }

    void write(okio.Buffer r4) {
            r3 = this;
            byte[] r0 = r3.data
            r1 = 0
            int r2 = r0.length
            r4.write(r0, r1, r2)
            return
    }
}
