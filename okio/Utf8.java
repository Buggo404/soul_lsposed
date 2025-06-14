package okio;

/* loaded from: classes.dex */
public final class Utf8 {
    private Utf8() {
            r0 = this;
            r0.<init>()
            return
    }

    public static long size(java.lang.String r2) {
            r0 = 0
            int r1 = r2.length()
            long r0 = size(r2, r0, r1)
            return r0
    }

    public static long size(java.lang.String r9, int r10, int r11) {
            if (r9 == 0) goto Lac
            if (r10 < 0) goto L97
            if (r11 < r10) goto L78
            int r0 = r9.length()
            if (r11 > r0) goto L55
            r0 = 0
        Le:
            if (r10 >= r11) goto L54
            char r2 = r9.charAt(r10)
            r3 = 128(0x80, float:1.794E-43)
            r4 = 1
            if (r2 >= r3) goto L1e
            long r0 = r0 + r4
        L1b:
            int r10 = r10 + 1
            goto Le
        L1e:
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 >= r3) goto L26
            r2 = 2
        L24:
            long r0 = r0 + r2
            goto L1b
        L26:
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r2 < r3) goto L51
            r3 = 57343(0xdfff, float:8.0355E-41)
            if (r2 <= r3) goto L31
            goto L51
        L31:
            int r6 = r10 + 1
            if (r6 >= r11) goto L3a
            char r7 = r9.charAt(r6)
            goto L3b
        L3a:
            r7 = 0
        L3b:
            r8 = 56319(0xdbff, float:7.892E-41)
            if (r2 > r8) goto L4e
            r2 = 56320(0xdc00, float:7.8921E-41)
            if (r7 < r2) goto L4e
            if (r7 <= r3) goto L48
            goto L4e
        L48:
            r2 = 4
            long r0 = r0 + r2
            int r10 = r10 + 2
            goto Le
        L4e:
            long r0 = r0 + r4
            r10 = r6
            goto Le
        L51:
            r2 = 3
            goto L24
        L54:
            return r0
        L55:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "endIndex > string.length: "
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r0 = " > "
            java.lang.StringBuilder r11 = r11.append(r0)
            int r9 = r9.length()
            java.lang.StringBuilder r9 = r11.append(r9)
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        L78:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "endIndex < beginIndex: "
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.String r0 = " < "
            java.lang.StringBuilder r11 = r11.append(r0)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L97:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "beginIndex < 0: "
            r11.<init>(r0)
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lac:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "string == null"
            r9.<init>(r10)
            throw r9
    }
}
