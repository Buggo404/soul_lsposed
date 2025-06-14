package androidx.core.provider;

/* loaded from: classes.dex */
public final class FontRequest {
    private final java.util.List<java.util.List<byte[]>> mCertificates;
    private final int mCertificatesArray;
    private final java.lang.String mIdentifier;
    private final java.lang.String mProviderAuthority;
    private final java.lang.String mProviderPackage;
    private final java.lang.String mQuery;

    public FontRequest(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.mProviderAuthority = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.mProviderPackage = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r4)
            java.lang.String r0 = (java.lang.String) r0
            r1.mQuery = r0
            r0 = 0
            r1.mCertificates = r0
            if (r5 == 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            androidx.core.util.Preconditions.checkArgument(r0)
            r1.mCertificatesArray = r5
            java.lang.String r2 = r1.createIdentifier(r2, r3, r4)
            r1.mIdentifier = r2
            return
    }

    public FontRequest(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.util.List<java.util.List<byte[]>> r5) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r0 = (java.lang.String) r0
            r1.mProviderAuthority = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.String r0 = (java.lang.String) r0
            r1.mProviderPackage = r0
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r4)
            java.lang.String r0 = (java.lang.String) r0
            r1.mQuery = r0
            java.lang.Object r5 = androidx.core.util.Preconditions.checkNotNull(r5)
            java.util.List r5 = (java.util.List) r5
            r1.mCertificates = r5
            r5 = 0
            r1.mCertificatesArray = r5
            java.lang.String r2 = r1.createIdentifier(r2, r3, r4)
            r1.mIdentifier = r2
            return
    }

    private java.lang.String createIdentifier(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            java.lang.String r2 = "-"
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public java.util.List<java.util.List<byte[]>> getCertificates() {
            r1 = this;
            java.util.List<java.util.List<byte[]>> r0 = r1.mCertificates
            return r0
    }

    public int getCertificatesArrayResId() {
            r1 = this;
            int r0 = r1.mCertificatesArray
            return r0
    }

    java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mIdentifier
            return r0
    }

    @java.lang.Deprecated
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.mIdentifier
            return r0
    }

    public java.lang.String getProviderAuthority() {
            r1 = this;
            java.lang.String r0 = r1.mProviderAuthority
            return r0
    }

    public java.lang.String getProviderPackage() {
            r1 = this;
            java.lang.String r0 = r1.mProviderPackage
            return r0
    }

    public java.lang.String getQuery() {
            r1 = this;
            java.lang.String r0 = r1.mQuery
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "FontRequest {mProviderAuthority: "
            r1.<init>(r2)
            java.lang.String r2 = r6.mProviderAuthority
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mProviderPackage: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mProviderPackage
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mQuery: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = r6.mQuery
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ", mCertificates:"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = r1
        L39:
            java.util.List<java.util.List<byte[]>> r3 = r6.mCertificates
            int r3 = r3.size()
            if (r2 >= r3) goto L77
            java.lang.String r3 = " ["
            r0.append(r3)
            java.util.List<java.util.List<byte[]>> r3 = r6.mCertificates
            java.lang.Object r3 = r3.get(r2)
            java.util.List r3 = (java.util.List) r3
            r4 = r1
        L4f:
            int r5 = r3.size()
            if (r4 >= r5) goto L6f
            java.lang.String r5 = " \""
            r0.append(r5)
            java.lang.Object r5 = r3.get(r4)
            byte[] r5 = (byte[]) r5
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r1)
            r0.append(r5)
            java.lang.String r5 = "\""
            r0.append(r5)
            int r4 = r4 + 1
            goto L4f
        L6f:
            java.lang.String r3 = " ]"
            r0.append(r3)
            int r2 = r2 + 1
            goto L39
        L77:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "mCertificatesArray: "
            r1.<init>(r2)
            int r2 = r6.mCertificatesArray
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
