package androidx.core.os;

/* loaded from: classes.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat sEmptyLocaleList = null;
    private androidx.core.os.LocaleListInterface mImpl;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompat r0 = create(r0)
            androidx.core.os.LocaleListCompat.sEmptyLocaleList = r0
            return
    }

    private LocaleListCompat(androidx.core.os.LocaleListInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    public static androidx.core.os.LocaleListCompat create(java.util.Locale... r1) {
            android.os.LocaleList r0 = new android.os.LocaleList
            r0.<init>(r1)
            androidx.core.os.LocaleListCompat r1 = wrap(r0)
            return r1
    }

    static java.util.Locale forLanguageTagCompat(java.lang.String r6) {
            java.lang.String r0 = "-"
            boolean r1 = r6.contains(r0)
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L37
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L1f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L1f:
            int r1 = r0.length
            if (r1 <= r5) goto L2c
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L2c:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L37:
            java.lang.String r0 = "_"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L85
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L52
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L52:
            int r1 = r0.length
            if (r1 <= r5) goto L5f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L5f:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Can not parse language tag: ["
            r1.<init>(r2)
            java.lang.StringBuilder r6 = r1.append(r6)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r6 = r6.append(r1)
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L85:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
    }

    public static androidx.core.os.LocaleListCompat forLanguageTags(java.lang.String r4) {
            if (r4 == 0) goto L26
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L26
        L9:
            java.lang.String r0 = ","
            r1 = -1
            java.lang.String[] r4 = r4.split(r0, r1)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = java.util.Locale.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            androidx.core.os.LocaleListCompat r4 = create(r1)
            return r4
        L26:
            androidx.core.os.LocaleListCompat r4 = getEmptyLocaleList()
            return r4
    }

    public static androidx.core.os.LocaleListCompat getAdjustedDefault() {
            android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getDefault() {
            android.os.LocaleList r0 = android.os.LocaleList.getDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public static androidx.core.os.LocaleListCompat getEmptyLocaleList() {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.sEmptyLocaleList
            return r0
    }

    public static androidx.core.os.LocaleListCompat wrap(android.os.LocaleList r2) {
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListPlatformWrapper r1 = new androidx.core.os.LocaleListPlatformWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public static androidx.core.os.LocaleListCompat wrap(java.lang.Object r0) {
            android.os.LocaleList r0 = (android.os.LocaleList) r0
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.os.LocaleListCompat
            if (r0 == 0) goto L12
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            androidx.core.os.LocaleListCompat r2 = (androidx.core.os.LocaleListCompat) r2
            androidx.core.os.LocaleListInterface r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    public java.util.Locale get(int r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    public java.util.Locale getFirstMatch(java.lang.String[] r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r2 = r0.getFirstMatch(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    public int indexOf(java.util.Locale r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r2 = r0.indexOf(r2)
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            boolean r0 = r0.isEmpty()
            return r0
    }

    public int size() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.size()
            return r0
    }

    public java.lang.String toLanguageTags() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toLanguageTags()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.Object unwrap() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.getLocaleList()
            return r0
    }
}
