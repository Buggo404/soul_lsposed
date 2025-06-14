package com.squareup.picasso;

/* loaded from: classes.dex */
public interface Cache {
    public static final com.squareup.picasso.Cache NONE = null;


    static {
            com.squareup.picasso.Cache$1 r0 = new com.squareup.picasso.Cache$1
            r0.<init>()
            com.squareup.picasso.Cache.NONE = r0
            return
    }

    void clear();

    void clearKeyUri(java.lang.String r1);

    android.graphics.Bitmap get(java.lang.String r1);

    int maxSize();

    void set(java.lang.String r1, android.graphics.Bitmap r2);

    int size();
}
