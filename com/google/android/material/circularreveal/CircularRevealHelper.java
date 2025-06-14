package com.google.android.material.circularreveal;

/* loaded from: classes.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 0;
    private boolean buildingCircularRevealCache;
    private android.graphics.Paint debugPaint;
    private final com.google.android.material.circularreveal.CircularRevealHelper.Delegate delegate;
    private boolean hasCircularRevealCache;
    private android.graphics.drawable.Drawable overlayDrawable;
    private com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo;
    private final android.graphics.Paint revealPaint;
    private final android.graphics.Path revealPath;
    private final android.graphics.Paint scrimPaint;
    private final android.view.View view;

    public interface Delegate {
        void actualDraw(android.graphics.Canvas r1);

        boolean actualIsOpaque();
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    static {
            r0 = 2
            com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY = r0
            return
    }

    public CircularRevealHelper(com.google.android.material.circularreveal.CircularRevealHelper.Delegate r3) {
            r2 = this;
            r2.<init>()
            r2.delegate = r3
            android.view.View r3 = (android.view.View) r3
            r2.view = r3
            r0 = 0
            r3.setWillNotDraw(r0)
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r2.revealPath = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 7
            r3.<init>(r1)
            r2.revealPaint = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 1
            r3.<init>(r1)
            r2.scrimPaint = r3
            r3.setColor(r0)
            return
    }

    private void drawDebugCircle(android.graphics.Canvas r4, int r5, float r6) {
            r3 = this;
            android.graphics.Paint r0 = r3.debugPaint
            r0.setColor(r5)
            android.graphics.Paint r5 = r3.debugPaint
            r5.setStrokeWidth(r6)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r5 = r3.revealInfo
            float r5 = r5.centerX
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r3.revealInfo
            float r0 = r0.centerY
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r3.revealInfo
            float r1 = r1.radius
            r2 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r2
            float r1 = r1 - r6
            android.graphics.Paint r6 = r3.debugPaint
            r4.drawCircle(r5, r0, r1, r6)
            return
    }

    private void drawDebugMode(android.graphics.Canvas r5) {
            r4 = this;
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r4.delegate
            r0.actualDraw(r5)
            boolean r0 = r4.shouldDrawScrim()
            if (r0 == 0) goto L1c
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r4.revealInfo
            float r0 = r0.centerX
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r4.revealInfo
            float r1 = r1.centerY
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r4.revealInfo
            float r2 = r2.radius
            android.graphics.Paint r3 = r4.scrimPaint
            r5.drawCircle(r0, r1, r2, r3)
        L1c:
            boolean r0 = r4.shouldDrawCircularReveal()
            if (r0 == 0) goto L30
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 1092616192(0x41200000, float:10.0)
            r4.drawDebugCircle(r5, r0, r1)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = 1084227584(0x40a00000, float:5.0)
            r4.drawDebugCircle(r5, r0, r1)
        L30:
            r4.drawOverlayDrawable(r5)
            return
    }

    private void drawOverlayDrawable(android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.shouldDrawOverlayDrawable()
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.overlayDrawable
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r4.revealInfo
            float r1 = r1.centerX
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r4.revealInfo
            float r2 = r2.centerY
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r5.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r4.overlayDrawable
            r0.draw(r5)
            float r0 = -r1
            float r1 = -r2
            r5.translate(r0, r1)
        L31:
            return
    }

    private float getDistanceToFurthestCorner(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo r7) {
            r6 = this;
            float r0 = r7.centerX
            float r1 = r7.centerY
            r2 = 0
            r3 = 0
            android.view.View r7 = r6.view
            int r7 = r7.getWidth()
            float r4 = (float) r7
            android.view.View r7 = r6.view
            int r7 = r7.getHeight()
            float r5 = (float) r7
            float r7 = com.google.android.material.math.MathUtils.distanceToFurthestCorner(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private void invalidateRevealInfo() {
            r5 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            r1 = 1
            if (r0 != r1) goto L1f
            android.graphics.Path r0 = r5.revealPath
            r0.rewind()
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r5.revealInfo
            if (r0 == 0) goto L1f
            android.graphics.Path r1 = r5.revealPath
            float r0 = r0.centerX
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r5.revealInfo
            float r2 = r2.centerY
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r3 = r5.revealInfo
            float r3 = r3.radius
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r1.addCircle(r0, r2, r3, r4)
        L1f:
            android.view.View r0 = r5.view
            r0.invalidate()
            return
    }

    private boolean shouldDrawCircularReveal() {
            r4 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r4.revealInfo
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.isInvalid()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = r1
            goto L10
        Lf:
            r0 = r2
        L10:
            int r3 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r3 != 0) goto L1c
            if (r0 != 0) goto L1b
            boolean r0 = r4.hasCircularRevealCache
            if (r0 == 0) goto L1b
            r1 = r2
        L1b:
            return r1
        L1c:
            r0 = r0 ^ r2
            return r0
    }

    private boolean shouldDrawOverlayDrawable() {
            r1 = this;
            boolean r0 = r1.buildingCircularRevealCache
            if (r0 != 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.overlayDrawable
            if (r0 == 0) goto Le
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r1.revealInfo
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private boolean shouldDrawScrim() {
            r1 = this;
            boolean r0 = r1.buildingCircularRevealCache
            if (r0 != 0) goto L12
            android.graphics.Paint r0 = r1.scrimPaint
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public void buildCircularRevealCache() {
            r7 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 != 0) goto L57
            r0 = 1
            r7.buildingCircularRevealCache = r0
            r1 = 0
            r7.hasCircularRevealCache = r1
            android.view.View r2 = r7.view
            r2.buildDrawingCache()
            android.view.View r2 = r7.view
            android.graphics.Bitmap r2 = r2.getDrawingCache()
            if (r2 != 0) goto L43
            android.view.View r3 = r7.view
            int r3 = r3.getWidth()
            if (r3 == 0) goto L43
            android.view.View r3 = r7.view
            int r3 = r3.getHeight()
            if (r3 == 0) goto L43
            android.view.View r2 = r7.view
            int r2 = r2.getWidth()
            android.view.View r3 = r7.view
            int r3 = r3.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.view.View r4 = r7.view
            r4.draw(r3)
        L43:
            if (r2 == 0) goto L53
            android.graphics.Paint r3 = r7.revealPaint
            android.graphics.BitmapShader r4 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r6 = android.graphics.Shader.TileMode.CLAMP
            r4.<init>(r2, r5, r6)
            r3.setShader(r4)
        L53:
            r7.buildingCircularRevealCache = r1
            r7.hasCircularRevealCache = r0
        L57:
            return
    }

    public void destroyCircularRevealCache() {
            r2 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 != 0) goto L17
            r0 = 0
            r2.hasCircularRevealCache = r0
            android.view.View r0 = r2.view
            r0.destroyDrawingCache()
            android.graphics.Paint r0 = r2.revealPaint
            r1 = 0
            r0.setShader(r1)
            android.view.View r0 = r2.view
            r0.invalidate()
        L17:
            return
    }

    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            boolean r0 = r8.shouldDrawCircularReveal()
            if (r0 == 0) goto L9f
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 == 0) goto L76
            r1 = 1
            if (r0 == r1) goto L48
            r1 = 2
            if (r0 != r1) goto L33
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r8.delegate
            r0.actualDraw(r9)
            boolean r0 = r8.shouldDrawScrim()
            if (r0 == 0) goto Lc0
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.view
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.view
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.scrimPaint
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
            goto Lc0
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported strategy "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            throw r9
        L48:
            int r0 = r9.save()
            android.graphics.Path r1 = r8.revealPath
            r9.clipPath(r1)
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r1 = r8.delegate
            r1.actualDraw(r9)
            boolean r1 = r8.shouldDrawScrim()
            if (r1 == 0) goto L72
            r3 = 0
            r4 = 0
            android.view.View r1 = r8.view
            int r1 = r1.getWidth()
            float r5 = (float) r1
            android.view.View r1 = r8.view
            int r1 = r1.getHeight()
            float r6 = (float) r1
            android.graphics.Paint r7 = r8.scrimPaint
            r2 = r9
            r2.drawRect(r3, r4, r5, r6, r7)
        L72:
            r9.restoreToCount(r0)
            goto Lc0
        L76:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r8.revealInfo
            float r0 = r0.centerX
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r8.revealInfo
            float r1 = r1.centerY
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r8.revealInfo
            float r2 = r2.radius
            android.graphics.Paint r3 = r8.revealPaint
            r9.drawCircle(r0, r1, r2, r3)
            boolean r0 = r8.shouldDrawScrim()
            if (r0 == 0) goto Lc0
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r8.revealInfo
            float r0 = r0.centerX
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r8.revealInfo
            float r1 = r1.centerY
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r8.revealInfo
            float r2 = r2.radius
            android.graphics.Paint r3 = r8.scrimPaint
            r9.drawCircle(r0, r1, r2, r3)
            goto Lc0
        L9f:
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r8.delegate
            r0.actualDraw(r9)
            boolean r0 = r8.shouldDrawScrim()
            if (r0 == 0) goto Lc0
            r2 = 0
            r3 = 0
            android.view.View r0 = r8.view
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r8.view
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r8.scrimPaint
            r1 = r9
            r1.drawRect(r2, r3, r4, r5, r6)
        Lc0:
            r8.drawOverlayDrawable(r9)
            return
    }

    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.overlayDrawable
            return r0
    }

    public int getCircularRevealScrimColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.scrimPaint
            int r0 = r0.getColor()
            return r0
    }

    public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo() {
            r2 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r2.revealInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r2.revealInfo
            r0.<init>(r1)
            boolean r1 = r0.isInvalid()
            if (r1 == 0) goto L19
            float r1 = r2.getDistanceToFurthestCorner(r0)
            r0.radius = r1
        L19:
            return r0
    }

    public boolean isOpaque() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r1.delegate
            boolean r0 = r0.actualIsOpaque()
            if (r0 == 0) goto L10
            boolean r0 = r1.shouldDrawCircularReveal()
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.overlayDrawable = r1
            android.view.View r1 = r0.view
            r1.invalidate()
            return
    }

    public void setCircularRevealScrimColor(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.scrimPaint
            r0.setColor(r2)
            android.view.View r2 = r1.view
            r2.invalidate()
            return
    }

    public void setRevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r3 = 0
            r2.revealInfo = r3
            goto L2b
        L6:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r2.revealInfo
            if (r0 != 0) goto L12
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r0.<init>(r3)
            r2.revealInfo = r0
            goto L15
        L12:
            r0.set(r3)
        L15:
            float r0 = r3.radius
            float r3 = r2.getDistanceToFurthestCorner(r3)
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            boolean r3 = com.google.android.material.math.MathUtils.geq(r0, r3, r1)
            if (r3 == 0) goto L2b
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r3 = r2.revealInfo
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.radius = r0
        L2b:
            r2.invalidateRevealInfo()
            return
    }
}
