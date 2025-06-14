package androidx.core.os;

/* loaded from: classes.dex */
final class LocaleListCompatWrapper implements androidx.core.os.LocaleListInterface {
    private static final java.util.Locale EN_LATN = null;
    private static final java.util.Locale LOCALE_AR_XB = null;
    private static final java.util.Locale LOCALE_EN_XA = null;
    private static final java.util.Locale[] sEmptyList = null;
    private final java.util.Locale[] mList;
    private final java.lang.String mStringRepresentation;

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompatWrapper.sEmptyList = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "en"
            java.lang.String r2 = "XA"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_EN_XA = r0
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = "ar"
            java.lang.String r2 = "XB"
            r0.<init>(r1, r2)
            androidx.core.os.LocaleListCompatWrapper.LOCALE_AR_XB = r0
            java.lang.String r0 = "en-Latn"
            java.util.Locale r0 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r0)
            androidx.core.os.LocaleListCompatWrapper.EN_LATN = r0
            return
    }

    LocaleListCompatWrapper(java.util.Locale... r7) {
            r6 = this;
            r6.<init>()
            int r0 = r7.length
            if (r0 != 0) goto Lf
            java.util.Locale[] r7 = androidx.core.os.LocaleListCompatWrapper.sEmptyList
            r6.mList = r7
            java.lang.String r7 = ""
            r6.mStringRepresentation = r7
            goto L78
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
        L1f:
            int r4 = r7.length
            if (r3 >= r4) goto L64
            r4 = r7[r3]
            if (r4 == 0) goto L49
            boolean r5 = r1.contains(r4)
            if (r5 == 0) goto L2d
            goto L46
        L2d:
            java.lang.Object r4 = r4.clone()
            java.util.Locale r4 = (java.util.Locale) r4
            r0.add(r4)
            toLanguageTag(r2, r4)
            int r5 = r7.length
            int r5 = r5 + (-1)
            if (r3 >= r5) goto L43
            r5 = 44
            r2.append(r5)
        L43:
            r1.add(r4)
        L46:
            int r3 = r3 + 1
            goto L1f
        L49:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "list["
            r0.<init>(r1)
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r1 = "] is null"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L64:
            int r7 = r0.size()
            java.util.Locale[] r7 = new java.util.Locale[r7]
            java.lang.Object[] r7 = r0.toArray(r7)
            java.util.Locale[] r7 = (java.util.Locale[]) r7
            r6.mList = r7
            java.lang.String r7 = r2.toString()
            r6.mStringRepresentation = r7
        L78:
            return
    }

    private java.util.Locale computeFirstMatch(java.util.Collection<java.lang.String> r1, boolean r2) {
            r0 = this;
            int r1 = r0.computeFirstMatchIndex(r1, r2)
            r2 = -1
            if (r1 != r2) goto L9
            r1 = 0
            goto Ld
        L9:
            java.util.Locale[] r2 = r0.mList
            r1 = r2[r1]
        Ld:
            return r1
    }

    private int computeFirstMatchIndex(java.util.Collection<java.lang.String> r5, boolean r6) {
            r4 = this;
            java.util.Locale[] r0 = r4.mList
            int r1 = r0.length
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L8
            return r3
        L8:
            int r0 = r0.length
            if (r0 != 0) goto Ld
            r5 = -1
            return r5
        Ld:
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r6 == 0) goto L1e
            java.util.Locale r6 = androidx.core.os.LocaleListCompatWrapper.EN_LATN
            int r6 = r4.findFirstMatchIndex(r6)
            if (r6 != 0) goto L1b
            return r3
        L1b:
            if (r6 >= r0) goto L1e
            goto L1f
        L1e:
            r6 = r0
        L1f:
            java.util.Iterator r5 = r5.iterator()
        L23:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Locale r1 = androidx.core.os.LocaleListCompat.forLanguageTagCompat(r1)
            int r1 = r4.findFirstMatchIndex(r1)
            if (r1 != 0) goto L3a
            return r3
        L3a:
            if (r1 >= r6) goto L23
            r6 = r1
            goto L23
        L3e:
            if (r6 != r0) goto L41
            return r3
        L41:
            return r6
    }

    private int findFirstMatchIndex(java.util.Locale r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r3.mList
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            int r1 = matchScore(r4, r1)
            if (r1 <= 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r4 = 2147483647(0x7fffffff, float:NaN)
            return r4
    }

    private static java.lang.String getLikelyScript(java.util.Locale r1) {
            java.lang.String r1 = r1.getScript()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.String r1 = ""
            return r1
    }

    private static boolean isPseudoLocale(java.util.Locale r1) {
            java.util.Locale r0 = androidx.core.os.LocaleListCompatWrapper.LOCALE_EN_XA
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13
            java.util.Locale r0 = androidx.core.os.LocaleListCompatWrapper.LOCALE_AR_XB
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L11
            goto L13
        L11:
            r1 = 0
            goto L14
        L13:
            r1 = 1
        L14:
            return r1
    }

    private static int matchScore(java.util.Locale r4, java.util.Locale r5) {
            boolean r0 = r4.equals(r5)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = r4.getLanguage()
            java.lang.String r2 = r5.getLanguage()
            boolean r0 = r0.equals(r2)
            r2 = 0
            if (r0 != 0) goto L18
            return r2
        L18:
            boolean r0 = isPseudoLocale(r4)
            if (r0 != 0) goto L4f
            boolean r0 = isPseudoLocale(r5)
            if (r0 == 0) goto L25
            goto L4f
        L25:
            java.lang.String r0 = getLikelyScript(r4)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L46
            java.lang.String r4 = r4.getCountry()
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L45
            java.lang.String r5 = r5.getCountry()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L44
            goto L45
        L44:
            r1 = r2
        L45:
            return r1
        L46:
            java.lang.String r4 = getLikelyScript(r5)
            boolean r4 = r0.equals(r4)
            return r4
        L4f:
            return r2
    }

    static void toLanguageTag(java.lang.StringBuilder r1, java.util.Locale r2) {
            java.lang.String r0 = r2.getLanguage()
            r1.append(r0)
            java.lang.String r0 = r2.getCountry()
            if (r0 == 0) goto L1f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1f
            r0 = 45
            r1.append(r0)
            java.lang.String r2 = r2.getCountry()
            r1.append(r2)
        L1f:
            return
    }

    public boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof androidx.core.os.LocaleListCompatWrapper
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            androidx.core.os.LocaleListCompatWrapper r6 = (androidx.core.os.LocaleListCompatWrapper) r6
            java.util.Locale[] r6 = r6.mList
            java.util.Locale[] r1 = r5.mList
            int r1 = r1.length
            int r3 = r6.length
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = r2
        L16:
            java.util.Locale[] r3 = r5.mList
            int r4 = r3.length
            if (r1 >= r4) goto L29
            r3 = r3[r1]
            r4 = r6[r1]
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L26
            return r2
        L26:
            int r1 = r1 + 1
            goto L16
        L29:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale get(int r3) {
            r2 = this;
            if (r3 < 0) goto La
            java.util.Locale[] r0 = r2.mList
            int r1 = r0.length
            if (r3 >= r1) goto La
            r3 = r0[r3]
            goto Lb
        La:
            r3 = 0
        Lb:
            return r3
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.util.Locale getFirstMatch(java.lang.String[] r2) {
            r1 = this;
            java.util.List r2 = java.util.Arrays.asList(r2)
            r0 = 0
            java.util.Locale r2 = r1.computeFirstMatch(r2, r0)
            return r2
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.Object getLocaleList() {
            r1 = this;
            r0 = 0
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 1
            r1 = 0
        L2:
            java.util.Locale[] r2 = r4.mList
            int r3 = r2.length
            if (r1 >= r3) goto L13
            int r0 = r0 * 31
            r2 = r2[r1]
            int r2 = r2.hashCode()
            int r0 = r0 + r2
            int r1 = r1 + 1
            goto L2
        L13:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int indexOf(java.util.Locale r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.Locale[] r1 = r3.mList
            int r2 = r1.length
            if (r0 >= r2) goto L12
            r1 = r1[r0]
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L1
        L12:
            r4 = -1
            return r4
    }

    @Override // androidx.core.os.LocaleListInterface
    public boolean isEmpty() {
            r1 = this;
            java.util.Locale[] r0 = r1.mList
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public int size() {
            r1 = this;
            java.util.Locale[] r0 = r1.mList
            int r0 = r0.length
            return r0
    }

    @Override // androidx.core.os.LocaleListInterface
    public java.lang.String toLanguageTags() {
            r1 = this;
            java.lang.String r0 = r1.mStringRepresentation
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            r1 = 0
        L8:
            java.util.Locale[] r2 = r4.mList
            int r3 = r2.length
            if (r1 >= r3) goto L21
            r2 = r2[r1]
            r0.append(r2)
            java.util.Locale[] r2 = r4.mList
            int r2 = r2.length
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L1e
            r2 = 44
            r0.append(r2)
        L1e:
            int r1 = r1 + 1
            goto L8
        L21:
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
