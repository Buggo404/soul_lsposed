package okhttp3.internal.tls;

/* loaded from: classes.dex */
final class DistinguishedNameParser {
    private int beg;
    private char[] chars;
    private int cur;

    /* renamed from: dn */
    private final java.lang.String f613dn;
    private int end;
    private final int length;
    private int pos;

    DistinguishedNameParser(javax.security.auth.x500.X500Principal r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "RFC2253"
            java.lang.String r2 = r2.getName(r0)
            r1.f613dn = r2
            int r2 = r2.length()
            r1.length = r2
            return
    }

    private java.lang.String escapedAV() {
            r8 = this;
            int r0 = r8.pos
            r8.beg = r0
            r8.end = r0
        L6:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.chars
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5e
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.end
            int r4 = r3 + 1
            r8.end = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L3e:
            int r0 = r8.end
            int r2 = r0 + 1
            r8.end = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.pos
            int r0 = r0 + 1
            r8.pos = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5e:
            int r2 = r8.end
            r8.cur = r2
            int r0 = r0 + 1
            r8.pos = r0
            int r0 = r2 + 1
            r8.end = r0
            r1[r2] = r6
        L6c:
            int r0 = r8.pos
            int r1 = r8.length
            if (r0 >= r1) goto L85
            char[] r2 = r8.chars
            char r7 = r2[r0]
            if (r7 != r6) goto L85
            int r1 = r8.end
            int r7 = r1 + 1
            r8.end = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.pos = r0
            goto L6c
        L85:
            if (r0 == r1) goto L91
            char[] r1 = r8.chars
            char r0 = r1[r0]
            if (r0 == r3) goto L91
            if (r0 == r4) goto L91
            if (r0 != r5) goto L6
        L91:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.chars
            int r2 = r8.beg
            int r3 = r8.cur
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
    }

    private int getByte(int r10) {
            r9 = this;
            int r0 = r10 + 1
            int r1 = r9.length
            java.lang.String r2 = "Malformed DN: "
            if (r0 >= r1) goto L6e
            char[] r1 = r9.chars
            char r10 = r1[r10]
            r3 = 70
            r4 = 102(0x66, float:1.43E-43)
            r5 = 65
            r6 = 57
            r7 = 97
            r8 = 48
            if (r10 < r8) goto L1e
            if (r10 > r6) goto L1e
            int r10 = r10 - r8
            goto L2b
        L1e:
            if (r10 < r7) goto L25
            if (r10 > r4) goto L25
            int r10 = r10 + (-87)
            goto L2b
        L25:
            if (r10 < r5) goto L59
            if (r10 > r3) goto L59
            int r10 = r10 + (-55)
        L2b:
            char r0 = r1[r0]
            if (r0 < r8) goto L33
            if (r0 > r6) goto L33
            int r0 = r0 - r8
            goto L40
        L33:
            if (r0 < r7) goto L3a
            if (r0 > r4) goto L3a
            int r0 = r0 + (-87)
            goto L40
        L3a:
            if (r0 < r5) goto L44
            if (r0 > r3) goto L44
            int r0 = r0 + (-55)
        L40:
            int r10 = r10 << 4
            int r10 = r10 + r0
            return r10
        L44:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = r9.f613dn
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L59:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = r9.f613dn
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        L6e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r1 = r9.f613dn
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
    }

    private char getEscaped() {
            r3 = this;
            int r0 = r3.pos
            int r0 = r0 + 1
            r3.pos = r0
            int r1 = r3.length
            if (r0 == r1) goto L31
            char[] r1 = r3.chars
            char r0 = r1[r0]
            r1 = 32
            if (r0 == r1) goto L30
            r1 = 37
            if (r0 == r1) goto L30
            r1 = 92
            if (r0 == r1) goto L30
            r1 = 95
            if (r0 == r1) goto L30
            r1 = 34
            if (r0 == r1) goto L30
            r1 = 35
            if (r0 == r1) goto L30
            switch(r0) {
                case 42: goto L30;
                case 43: goto L30;
                case 44: goto L30;
                default: goto L29;
            }
        L29:
            switch(r0) {
                case 59: goto L30;
                case 60: goto L30;
                case 61: goto L30;
                case 62: goto L30;
                default: goto L2c;
            }
        L2c:
            char r0 = r3.getUTF8()
        L30:
            return r0
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected end of DN: "
            r1.<init>(r2)
            java.lang.String r2 = r3.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private char getUTF8() {
            r9 = this;
            int r0 = r9.pos
            int r0 = r9.getByte(r0)
            int r1 = r9.pos
            r2 = 1
            int r1 = r1 + r2
            r9.pos = r1
            r1 = 128(0x80, float:1.794E-43)
            if (r0 >= r1) goto L12
            char r0 = (char) r0
            return r0
        L12:
            r3 = 192(0xc0, float:2.69E-43)
            r4 = 63
            if (r0 < r3) goto L61
            r3 = 247(0xf7, float:3.46E-43)
            if (r0 > r3) goto L61
            r3 = 223(0xdf, float:3.12E-43)
            if (r0 > r3) goto L24
            r0 = r0 & 31
            r3 = r2
            goto L2f
        L24:
            r3 = 239(0xef, float:3.35E-43)
            if (r0 > r3) goto L2c
            r0 = r0 & 15
            r3 = 2
            goto L2f
        L2c:
            r0 = r0 & 7
            r3 = 3
        L2f:
            r5 = 0
        L30:
            if (r5 >= r3) goto L5f
            int r6 = r9.pos
            int r6 = r6 + r2
            r9.pos = r6
            int r7 = r9.length
            if (r6 == r7) goto L5e
            char[] r7 = r9.chars
            char r7 = r7[r6]
            r8 = 92
            if (r7 == r8) goto L44
            goto L5e
        L44:
            int r6 = r6 + 1
            r9.pos = r6
            int r6 = r9.getByte(r6)
            int r7 = r9.pos
            int r7 = r7 + r2
            r9.pos = r7
            r7 = r6 & 192(0xc0, float:2.69E-43)
            if (r7 == r1) goto L56
            return r4
        L56:
            int r0 = r0 << 6
            r6 = r6 & 63
            int r0 = r0 + r6
            int r5 = r5 + 1
            goto L30
        L5e:
            return r4
        L5f:
            char r0 = (char) r0
            return r0
        L61:
            return r4
    }

    private java.lang.String hexAV() {
            r6 = this;
            int r0 = r6.pos
            int r1 = r0 + 4
            int r2 = r6.length
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L96
            r6.beg = r0
            int r0 = r0 + 1
            r6.pos = r0
        L10:
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 == r1) goto L54
            char[] r1 = r6.chars
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L54
            r4 = 44
            if (r2 == r4) goto L54
            r4 = 59
            if (r2 != r4) goto L27
            goto L54
        L27:
            r4 = 32
            if (r2 != r4) goto L42
            r6.end = r0
            int r0 = r0 + 1
            r6.pos = r0
        L31:
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 >= r1) goto L56
            char[] r1 = r6.chars
            char r1 = r1[r0]
            if (r1 != r4) goto L56
            int r0 = r0 + 1
            r6.pos = r0
            goto L31
        L42:
            r4 = 65
            if (r2 < r4) goto L4f
            r4 = 70
            if (r2 > r4) goto L4f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L4f:
            int r0 = r0 + 1
            r6.pos = r0
            goto L10
        L54:
            r6.end = r0
        L56:
            int r0 = r6.end
            int r1 = r6.beg
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L81
            r2 = r0 & 1
            if (r2 == 0) goto L81
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L69:
            if (r4 >= r2) goto L77
            int r5 = r6.getByte(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L69
        L77:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.chars
            int r3 = r6.beg
            r1.<init>(r2, r3, r0)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r6.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L96:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            java.lang.String r2 = r6.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String nextAT() {
            r6 = this;
        L0:
            int r0 = r6.pos
            int r1 = r6.length
            r2 = 32
            if (r0 >= r1) goto L13
            char[] r3 = r6.chars
            char r3 = r3[r0]
            if (r3 != r2) goto L13
            int r0 = r0 + 1
            r6.pos = r0
            goto L0
        L13:
            if (r0 != r1) goto L17
            r0 = 0
            return r0
        L17:
            r6.beg = r0
            int r0 = r0 + 1
            r6.pos = r0
        L1d:
            int r0 = r6.pos
            int r1 = r6.length
            r3 = 61
            if (r0 >= r1) goto L32
            char[] r4 = r6.chars
            char r4 = r4[r0]
            if (r4 == r3) goto L32
            if (r4 == r2) goto L32
            int r0 = r0 + 1
            r6.pos = r0
            goto L1d
        L32:
            java.lang.String r4 = "Unexpected end of DN: "
            if (r0 >= r1) goto Ld2
            r6.end = r0
            char[] r1 = r6.chars
            char r0 = r1[r0]
            if (r0 != r2) goto L6f
        L3e:
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 >= r1) goto L51
            char[] r5 = r6.chars
            char r5 = r5[r0]
            if (r5 == r3) goto L51
            if (r5 != r2) goto L51
            int r0 = r0 + 1
            r6.pos = r0
            goto L3e
        L51:
            char[] r5 = r6.chars
            char r5 = r5[r0]
            if (r5 != r3) goto L5a
            if (r0 == r1) goto L5a
            goto L6f
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r2 = r6.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L6f:
            int r0 = r6.pos
            int r0 = r0 + 1
            r6.pos = r0
        L75:
            int r0 = r6.pos
            int r1 = r6.length
            if (r0 >= r1) goto L86
            char[] r1 = r6.chars
            char r1 = r1[r0]
            if (r1 != r2) goto L86
            int r0 = r0 + 1
            r6.pos = r0
            goto L75
        L86:
            int r0 = r6.end
            int r1 = r6.beg
            int r0 = r0 - r1
            r2 = 4
            if (r0 <= r2) goto Lc5
            char[] r0 = r6.chars
            int r3 = r1 + 3
            char r3 = r0[r3]
            r4 = 46
            if (r3 != r4) goto Lc5
            char r3 = r0[r1]
            r4 = 79
            if (r3 == r4) goto La2
            r4 = 111(0x6f, float:1.56E-43)
            if (r3 != r4) goto Lc5
        La2:
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 73
            if (r3 == r4) goto Lb2
            int r3 = r1 + 1
            char r3 = r0[r3]
            r4 = 105(0x69, float:1.47E-43)
            if (r3 != r4) goto Lc5
        Lb2:
            int r3 = r1 + 2
            char r3 = r0[r3]
            r4 = 68
            if (r3 == r4) goto Lc2
            int r3 = r1 + 2
            char r0 = r0[r3]
            r3 = 100
            if (r0 != r3) goto Lc5
        Lc2:
            int r1 = r1 + r2
            r6.beg = r1
        Lc5:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r6.chars
            int r2 = r6.beg
            int r3 = r6.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        Ld2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r4)
            java.lang.String r2 = r6.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    private java.lang.String quotedAV() {
            r4 = this;
            int r0 = r4.pos
            int r0 = r0 + 1
            r4.pos = r0
            r4.beg = r0
            r4.end = r0
        La:
            int r0 = r4.pos
            int r1 = r4.length
            if (r0 == r1) goto L5a
            char[] r1 = r4.chars
            char r2 = r1[r0]
            r3 = 34
            if (r2 != r3) goto L3c
            int r0 = r0 + 1
            r4.pos = r0
        L1c:
            int r0 = r4.pos
            int r1 = r4.length
            if (r0 >= r1) goto L2f
            char[] r1 = r4.chars
            char r1 = r1[r0]
            r2 = 32
            if (r1 != r2) goto L2f
            int r0 = r0 + 1
            r4.pos = r0
            goto L1c
        L2f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.chars
            int r2 = r4.beg
            int r3 = r4.end
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L3c:
            r0 = 92
            if (r2 != r0) goto L49
            int r0 = r4.end
            char r2 = r4.getEscaped()
            r1[r0] = r2
            goto L4d
        L49:
            int r0 = r4.end
            r1[r0] = r2
        L4d:
            int r0 = r4.pos
            int r0 = r0 + 1
            r4.pos = r0
            int r0 = r4.end
            int r0 = r0 + 1
            r4.end = r0
            goto La
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unexpected end of DN: "
            r1.<init>(r2)
            java.lang.String r2 = r4.f613dn
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public java.lang.String findMostSpecific(java.lang.String r8) {
            r7 = this;
            r0 = 0
            r7.pos = r0
            r7.beg = r0
            r7.end = r0
            r7.cur = r0
            java.lang.String r0 = r7.f613dn
            char[] r0 = r0.toCharArray()
            r7.chars = r0
            java.lang.String r0 = r7.nextAT()
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            int r2 = r7.pos
            int r3 = r7.length
            if (r2 != r3) goto L20
            return r1
        L20:
            char[] r3 = r7.chars
            char r2 = r3[r2]
            r3 = 34
            r4 = 59
            r5 = 44
            r6 = 43
            if (r2 == r3) goto L45
            r3 = 35
            if (r2 == r3) goto L40
            if (r2 == r6) goto L3d
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L3d
            java.lang.String r2 = r7.escapedAV()
            goto L49
        L3d:
            java.lang.String r2 = ""
            goto L49
        L40:
            java.lang.String r2 = r7.hexAV()
            goto L49
        L45:
            java.lang.String r2 = r7.quotedAV()
        L49:
            boolean r0 = r8.equalsIgnoreCase(r0)
            if (r0 == 0) goto L50
            return r2
        L50:
            int r0 = r7.pos
            int r2 = r7.length
            if (r0 < r2) goto L57
            return r1
        L57:
            char[] r2 = r7.chars
            char r2 = r2[r0]
            java.lang.String r3 = "Malformed DN: "
            if (r2 == r5) goto L7a
            if (r2 != r4) goto L62
            goto L7a
        L62:
            if (r2 != r6) goto L65
            goto L7a
        L65:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = r7.f613dn
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L7a:
            int r0 = r0 + 1
            r7.pos = r0
            java.lang.String r0 = r7.nextAT()
            if (r0 == 0) goto L85
            goto L19
        L85:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r1 = r7.f613dn
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
    }
}
