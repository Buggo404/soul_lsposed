package androidx.core.content;

/* loaded from: classes.dex */
public final class MimeTypeFilter {
    private MimeTypeFilter() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String matches(java.lang.String r6, java.lang.String[] r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "/"
            java.lang.String[] r6 = r6.split(r1)
            int r2 = r7.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1e
            r4 = r7[r3]
            java.lang.String[] r5 = r4.split(r1)
            boolean r5 = mimeTypeAgainstFilter(r6, r5)
            if (r5 == 0) goto L1b
            return r4
        L1b:
            int r3 = r3 + 1
            goto Lc
        L1e:
            return r0
    }

    public static java.lang.String matches(java.lang.String[] r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "/"
            java.lang.String[] r7 = r7.split(r1)
            int r2 = r6.length
            r3 = 0
        Lc:
            if (r3 >= r2) goto L1e
            r4 = r6[r3]
            java.lang.String[] r5 = r4.split(r1)
            boolean r5 = mimeTypeAgainstFilter(r5, r7)
            if (r5 == 0) goto L1b
            return r4
        L1b:
            int r3 = r3 + 1
            goto Lc
        L1e:
            return r0
    }

    public static boolean matches(java.lang.String r1, java.lang.String r2) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "/"
            java.lang.String[] r1 = r1.split(r0)
            java.lang.String[] r2 = r2.split(r0)
            boolean r1 = mimeTypeAgainstFilter(r1, r2)
            return r1
    }

    public static java.lang.String[] matchesMany(java.lang.String[] r6, java.lang.String r7) {
            r0 = 0
            if (r6 != 0) goto L6
            java.lang.String[] r6 = new java.lang.String[r0]
            return r6
        L6:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "/"
            java.lang.String[] r7 = r7.split(r2)
            int r3 = r6.length
        L12:
            if (r0 >= r3) goto L26
            r4 = r6[r0]
            java.lang.String[] r5 = r4.split(r2)
            boolean r5 = mimeTypeAgainstFilter(r5, r7)
            if (r5 == 0) goto L23
            r1.add(r4)
        L23:
            int r0 = r0 + 1
            goto L12
        L26:
            int r6 = r1.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r1.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
    }

    private static boolean mimeTypeAgainstFilter(java.lang.String[] r5, java.lang.String[] r6) {
            int r0 = r6.length
            r1 = 2
            if (r0 != r1) goto L4b
            r0 = 0
            r2 = r6[r0]
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L43
            r2 = 1
            r3 = r6[r2]
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L43
            int r3 = r5.length
            if (r3 == r1) goto L1a
            return r0
        L1a:
            r1 = r6[r0]
            java.lang.String r3 = "*"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L2f
            r1 = r6[r0]
            r4 = r5[r0]
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L2f
            return r0
        L2f:
            r1 = r6[r2]
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L42
            r6 = r6[r2]
            r5 = r5[r2]
            boolean r5 = r6.equals(r5)
            if (r5 != 0) goto L42
            return r0
        L42:
            return r2
        L43:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Ill-formatted MIME type filter. Type or subtype empty."
            r5.<init>(r6)
            throw r5
        L4b:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Ill-formatted MIME type filter. Must be type/subtype."
            r5.<init>(r6)
            throw r5
    }
}
