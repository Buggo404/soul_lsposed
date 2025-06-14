package com.squareup.picasso;

/* loaded from: classes.dex */
final class PicassoDrawable extends android.graphics.drawable.BitmapDrawable {
    private static final android.graphics.Paint DEBUG_PAINT = null;
    private static final float FADE_DURATION = 200.0f;
    int alpha;
    boolean animating;
    private final boolean debugging;
    private final float density;
    private final com.squareup.picasso.Picasso.LoadedFrom loadedFrom;
    android.graphics.drawable.Drawable placeholder;
    long startTimeMillis;

    static {
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            com.squareup.picasso.PicassoDrawable.DEBUG_PAINT = r0
            return
    }

    PicassoDrawable(android.content.Context r2, android.graphics.Bitmap r3, android.graphics.drawable.Drawable r4, com.squareup.picasso.Picasso.LoadedFrom r5, boolean r6, boolean r7) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            r1.<init>(r0, r3)
            r3 = 255(0xff, float:3.57E-43)
            r1.alpha = r3
            r1.debugging = r7
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r1.density = r2
            r1.loadedFrom = r5
            com.squareup.picasso.Picasso$LoadedFrom r2 = com.squareup.picasso.Picasso.LoadedFrom.MEMORY
            r3 = 1
            if (r5 == r2) goto L24
            if (r6 != 0) goto L24
            r2 = r3
            goto L25
        L24:
            r2 = 0
        L25:
            if (r2 == 0) goto L31
            r1.placeholder = r4
            r1.animating = r3
            long r2 = android.os.SystemClock.uptimeMillis()
            r1.startTimeMillis = r2
        L31:
            return
    }

    private void drawDebugIndicator(android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.Paint r0 = com.squareup.picasso.PicassoDrawable.DEBUG_PAINT
            r1 = -1
            r0.setColor(r1)
            android.graphics.Point r1 = new android.graphics.Point
            r2 = 0
            r1.<init>(r2, r2)
            r3 = 1098907648(0x41800000, float:16.0)
            float r4 = r5.density
            float r4 = r4 * r3
            int r3 = (int) r4
            android.graphics.Path r1 = getTrianglePath(r1, r3)
            r6.drawPath(r1, r0)
            com.squareup.picasso.Picasso$LoadedFrom r1 = r5.loadedFrom
            int r1 = r1.debugColor
            r0.setColor(r1)
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r2, r2)
            r2 = 1097859072(0x41700000, float:15.0)
            float r3 = r5.density
            float r3 = r3 * r2
            int r2 = (int) r3
            android.graphics.Path r1 = getTrianglePath(r1, r2)
            r6.drawPath(r1, r0)
            return
    }

    private static android.graphics.Path getTrianglePath(android.graphics.Point r4, int r5) {
            android.graphics.Point r0 = new android.graphics.Point
            int r1 = r4.x
            int r1 = r1 + r5
            int r2 = r4.y
            r0.<init>(r1, r2)
            android.graphics.Point r1 = new android.graphics.Point
            int r2 = r4.x
            int r3 = r4.y
            int r3 = r3 + r5
            r1.<init>(r2, r3)
            android.graphics.Path r5 = new android.graphics.Path
            r5.<init>()
            int r2 = r4.x
            float r2 = (float) r2
            int r4 = r4.y
            float r4 = (float) r4
            r5.moveTo(r2, r4)
            int r4 = r0.x
            float r4 = (float) r4
            int r0 = r0.y
            float r0 = (float) r0
            r5.lineTo(r4, r0)
            int r4 = r1.x
            float r4 = (float) r4
            int r0 = r1.y
            float r0 = (float) r0
            r5.lineTo(r4, r0)
            return r5
    }

    static void setBitmap(android.widget.ImageView r8, android.content.Context r9, android.graphics.Bitmap r10, com.squareup.picasso.Picasso.LoadedFrom r11, boolean r12, boolean r13) {
            android.graphics.drawable.Drawable r3 = r8.getDrawable()
            boolean r0 = r3 instanceof android.graphics.drawable.AnimationDrawable
            if (r0 == 0) goto Le
            r0 = r3
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.stop()
        Le:
            com.squareup.picasso.PicassoDrawable r7 = new com.squareup.picasso.PicassoDrawable
            r0 = r7
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r8.setImageDrawable(r7)
            return
    }

    static void setPlaceholder(android.widget.ImageView r0, android.graphics.drawable.Drawable r1) {
            r0.setImageDrawable(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            boolean r1 = r1 instanceof android.graphics.drawable.AnimationDrawable
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r0.start()
        L14:
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.animating
            if (r0 != 0) goto L8
            super.draw(r5)
            goto L3a
        L8:
            long r0 = android.os.SystemClock.uptimeMillis()
            long r2 = r4.startTimeMillis
            long r0 = r0 - r2
            float r0 = (float) r0
            r1 = 1128792064(0x43480000, float:200.0)
            float r0 = r0 / r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L23
            r0 = 0
            r4.animating = r0
            r0 = 0
            r4.placeholder = r0
            super.draw(r5)
            goto L3a
        L23:
            android.graphics.drawable.Drawable r1 = r4.placeholder
            if (r1 == 0) goto L2a
            r1.draw(r5)
        L2a:
            int r1 = r4.alpha
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = (int) r1
            super.setAlpha(r0)
            super.draw(r5)
            int r0 = r4.alpha
            super.setAlpha(r0)
        L3a:
            boolean r0 = r4.debugging
            if (r0 == 0) goto L41
            r4.drawDebugIndicator(r5)
        L41:
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.placeholder
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            r1.alpha = r2
            android.graphics.drawable.Drawable r0 = r1.placeholder
            if (r0 == 0) goto L9
            r0.setAlpha(r2)
        L9:
            super.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.BitmapDrawable, android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.placeholder
            if (r0 == 0) goto L7
            r0.setColorFilter(r2)
        L7:
            super.setColorFilter(r2)
            return
    }
}
