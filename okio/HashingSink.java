package okio;

/* loaded from: classes.dex */
public final class HashingSink extends okio.ForwardingSink {

    @javax.annotation.Nullable
    private final javax.crypto.Mac mac;

    @javax.annotation.Nullable
    private final java.security.MessageDigest messageDigest;

    private HashingSink(okio.Sink r1, java.lang.String r2) {
            r0 = this;
            r0.<init>(r1)
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r2)     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r0.messageDigest = r1     // Catch: java.security.NoSuchAlgorithmException -> Ld
            r1 = 0
            r0.mac = r1     // Catch: java.security.NoSuchAlgorithmException -> Ld
            return
        Ld:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
    }

    private HashingSink(okio.Sink r2, okio.ByteString r3, java.lang.String r4) {
            r1 = this;
            r1.<init>(r2)
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r4)     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            r1.mac = r2     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            byte[] r3 = r3.toByteArray()     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            r0.<init>(r3, r4)     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            r2.init(r0)     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            r2 = 0
            r1.messageDigest = r2     // Catch: java.security.InvalidKeyException -> L19 java.security.NoSuchAlgorithmException -> L20
            return
        L19:
            r2 = move-exception
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            r3.<init>(r2)
            throw r3
        L20:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
    }

    public static okio.HashingSink hmacSha1(okio.Sink r2, okio.ByteString r3) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "HmacSHA1"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static okio.HashingSink hmacSha256(okio.Sink r2, okio.ByteString r3) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "HmacSHA256"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static okio.HashingSink hmacSha512(okio.Sink r2, okio.ByteString r3) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "HmacSHA512"
            r0.<init>(r2, r3, r1)
            return r0
    }

    public static okio.HashingSink md5(okio.Sink r2) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "MD5"
            r0.<init>(r2, r1)
            return r0
    }

    public static okio.HashingSink sha1(okio.Sink r2) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "SHA-1"
            r0.<init>(r2, r1)
            return r0
    }

    public static okio.HashingSink sha256(okio.Sink r2) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "SHA-256"
            r0.<init>(r2, r1)
            return r0
    }

    public static okio.HashingSink sha512(okio.Sink r2) {
            okio.HashingSink r0 = new okio.HashingSink
            java.lang.String r1 = "SHA-512"
            r0.<init>(r2, r1)
            return r0
    }

    public final okio.ByteString hash() {
            r1 = this;
            java.security.MessageDigest r0 = r1.messageDigest
            if (r0 == 0) goto L9
            byte[] r0 = r0.digest()
            goto Lf
        L9:
            javax.crypto.Mac r0 = r1.mac
            byte[] r0 = r0.doFinal()
        Lf:
            okio.ByteString r0 = okio.ByteString.m96of(r0)
            return r0
    }

    @Override // okio.ForwardingSink, okio.Sink
    public void write(okio.Buffer r8, long r9) throws java.io.IOException {
            r7 = this;
            long r0 = r8.size
            r2 = 0
            r4 = r9
            okio.Util.checkOffsetAndCount(r0, r2, r4)
            okio.Segment r0 = r8.head
            r1 = 0
        Lc:
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L37
            long r3 = r9 - r1
            int r5 = r0.limit
            int r6 = r0.pos
            int r5 = r5 - r6
            long r5 = (long) r5
            long r3 = java.lang.Math.min(r3, r5)
            int r3 = (int) r3
            java.security.MessageDigest r4 = r7.messageDigest
            if (r4 == 0) goto L29
            byte[] r5 = r0.data
            int r6 = r0.pos
            r4.update(r5, r6, r3)
            goto L32
        L29:
            javax.crypto.Mac r4 = r7.mac
            byte[] r5 = r0.data
            int r6 = r0.pos
            r4.update(r5, r6, r3)
        L32:
            long r3 = (long) r3
            long r1 = r1 + r3
            okio.Segment r0 = r0.next
            goto Lc
        L37:
            super.write(r8, r9)
            return
    }
}
