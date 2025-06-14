package com.squareup.picasso;

/* loaded from: classes.dex */
public interface Target {
    void onBitmapFailed(android.graphics.drawable.Drawable r1);

    void onBitmapLoaded(android.graphics.Bitmap r1, com.squareup.picasso.Picasso.LoadedFrom r2);

    void onPrepareLoad(android.graphics.drawable.Drawable r1);
}
