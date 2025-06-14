package com.squareup.picasso;

/* loaded from: classes.dex */
public enum NetworkPolicy extends java.lang.Enum<com.squareup.picasso.NetworkPolicy> {
    private static final /* synthetic */ com.squareup.picasso.NetworkPolicy[] $VALUES = null;
    public static final com.squareup.picasso.NetworkPolicy NO_CACHE = null;
    public static final com.squareup.picasso.NetworkPolicy NO_STORE = null;
    public static final com.squareup.picasso.NetworkPolicy OFFLINE = null;
    final int index;

    static {
            com.squareup.picasso.NetworkPolicy r0 = new com.squareup.picasso.NetworkPolicy
            java.lang.String r1 = "NO_CACHE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.squareup.picasso.NetworkPolicy.NO_CACHE = r0
            com.squareup.picasso.NetworkPolicy r1 = new com.squareup.picasso.NetworkPolicy
            java.lang.String r4 = "NO_STORE"
            r5 = 2
            r1.<init>(r4, r3, r5)
            com.squareup.picasso.NetworkPolicy.NO_STORE = r1
            com.squareup.picasso.NetworkPolicy r4 = new com.squareup.picasso.NetworkPolicy
            java.lang.String r6 = "OFFLINE"
            r7 = 4
            r4.<init>(r6, r5, r7)
            com.squareup.picasso.NetworkPolicy.OFFLINE = r4
            r6 = 3
            com.squareup.picasso.NetworkPolicy[] r6 = new com.squareup.picasso.NetworkPolicy[r6]
            r6[r2] = r0
            r6[r3] = r1
            r6[r5] = r4
            com.squareup.picasso.NetworkPolicy.$VALUES = r6
            return
    }

    NetworkPolicy(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.index = r3
            return
    }

    public static boolean isOfflineOnly(int r1) {
            com.squareup.picasso.NetworkPolicy r0 = com.squareup.picasso.NetworkPolicy.OFFLINE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static boolean shouldReadFromDiskCache(int r1) {
            com.squareup.picasso.NetworkPolicy r0 = com.squareup.picasso.NetworkPolicy.NO_CACHE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static boolean shouldWriteToDiskCache(int r1) {
            com.squareup.picasso.NetworkPolicy r0 = com.squareup.picasso.NetworkPolicy.NO_STORE
            int r0 = r0.index
            r1 = r1 & r0
            if (r1 != 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public static com.squareup.picasso.NetworkPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.squareup.picasso.NetworkPolicy> r0 = com.squareup.picasso.NetworkPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.squareup.picasso.NetworkPolicy r1 = (com.squareup.picasso.NetworkPolicy) r1
            return r1
    }

    public static com.squareup.picasso.NetworkPolicy[] values() {
            com.squareup.picasso.NetworkPolicy[] r0 = com.squareup.picasso.NetworkPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.squareup.picasso.NetworkPolicy[] r0 = (com.squareup.picasso.NetworkPolicy[]) r0
            return r0
    }
}
