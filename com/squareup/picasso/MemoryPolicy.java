package com.squareup.picasso;

/* loaded from: classes.dex */
public enum MemoryPolicy extends java.lang.Enum<com.squareup.picasso.MemoryPolicy> {
    private static final /* synthetic */ com.squareup.picasso.MemoryPolicy[] $VALUES = null;
    public static final com.squareup.picasso.MemoryPolicy NO_CACHE = null;
    public static final com.squareup.picasso.MemoryPolicy NO_STORE = null;
    final int index;

    static {
            com.squareup.picasso.MemoryPolicy r0 = new com.squareup.picasso.MemoryPolicy
            java.lang.String r1 = "NO_CACHE"
            r2 = 0
            r3 = 1
            r0.<init>(r1, r2, r3)
            com.squareup.picasso.MemoryPolicy.NO_CACHE = r0
            com.squareup.picasso.MemoryPolicy r1 = new com.squareup.picasso.MemoryPolicy
            java.lang.String r4 = "NO_STORE"
            r5 = 2
            r1.<init>(r4, r3, r5)
            com.squareup.picasso.MemoryPolicy.NO_STORE = r1
            com.squareup.picasso.MemoryPolicy[] r4 = new com.squareup.picasso.MemoryPolicy[r5]
            r4[r2] = r0
            r4[r3] = r1
            com.squareup.picasso.MemoryPolicy.$VALUES = r4
            return
    }

    MemoryPolicy(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.index = r3
            return
    }

    static boolean shouldReadFromMemoryCache(int r1) {
            com.squareup.picasso.MemoryPolicy r0 = com.squareup.picasso.MemoryPolicy.NO_CACHE
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

    static boolean shouldWriteToMemoryCache(int r1) {
            com.squareup.picasso.MemoryPolicy r0 = com.squareup.picasso.MemoryPolicy.NO_STORE
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

    public static com.squareup.picasso.MemoryPolicy valueOf(java.lang.String r1) {
            java.lang.Class<com.squareup.picasso.MemoryPolicy> r0 = com.squareup.picasso.MemoryPolicy.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.squareup.picasso.MemoryPolicy r1 = (com.squareup.picasso.MemoryPolicy) r1
            return r1
    }

    public static com.squareup.picasso.MemoryPolicy[] values() {
            com.squareup.picasso.MemoryPolicy[] r0 = com.squareup.picasso.MemoryPolicy.$VALUES
            java.lang.Object r0 = r0.clone()
            com.squareup.picasso.MemoryPolicy[] r0 = (com.squareup.picasso.MemoryPolicy[]) r0
            return r0
    }
}
