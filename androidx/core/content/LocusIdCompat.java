package androidx.core.content;

/* loaded from: classes.dex */
public final class LocusIdCompat {
    private final java.lang.String mId;
    private final android.content.LocusId mWrapped;

    private static class Api29Impl {
        private Api29Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static android.content.LocusId create(java.lang.String r1) {
                android.content.LocusId r0 = new android.content.LocusId
                r0.<init>(r1)
                return r0
        }

        static java.lang.String getId(android.content.LocusId r0) {
                java.lang.String r0 = r0.getId()
                return r0
        }
    }

    public LocusIdCompat(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = "id cannot be empty"
            java.lang.CharSequence r0 = androidx.core.util.Preconditions.checkStringNotEmpty(r3, r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.mId = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L1a
            android.content.LocusId r3 = androidx.core.content.LocusIdCompat.Api29Impl.create(r3)
            r2.mWrapped = r3
            goto L1d
        L1a:
            r3 = 0
            r2.mWrapped = r3
        L1d:
            return
    }

    private java.lang.String getSanitizedId() {
            r2 = this;
            java.lang.String r0 = r2.mId
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "_chars"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public static androidx.core.content.LocusIdCompat toLocusIdCompat(android.content.LocusId r2) {
            java.lang.String r0 = "locusId cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r0)
            androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
            java.lang.String r2 = androidx.core.content.LocusIdCompat.Api29Impl.getId(r2)
            java.lang.String r1 = "id cannot be empty"
            java.lang.CharSequence r2 = androidx.core.util.Preconditions.checkStringNotEmpty(r2, r1)
            java.lang.String r2 = (java.lang.String) r2
            r0.<init>(r2)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 != 0) goto L8
            return r1
        L8:
            java.lang.Class r2 = r4.getClass()
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L13
            return r1
        L13:
            androidx.core.content.LocusIdCompat r5 = (androidx.core.content.LocusIdCompat) r5
            java.lang.String r2 = r4.mId
            if (r2 != 0) goto L20
            java.lang.String r5 = r5.mId
            if (r5 != 0) goto L1e
            goto L1f
        L1e:
            r0 = r1
        L1f:
            return r0
        L20:
            java.lang.String r5 = r5.mId
            boolean r5 = r2.equals(r5)
            return r5
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.mId
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            r1 = 31
            int r1 = r1 + r0
            return r1
    }

    public android.content.LocusId toLocusId() {
            r1 = this;
            android.content.LocusId r0 = r1.mWrapped
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LocusIdCompat["
            r0.<init>(r1)
            java.lang.String r1 = r2.getSanitizedId()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "]"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
