package com.google.android.material.textfield;

/* loaded from: classes.dex */
class CutoutDrawable extends com.google.android.material.shape.MaterialShapeDrawable {
    private final android.graphics.RectF cutoutBounds;
    private final android.graphics.Paint cutoutPaint;
    private int savedLayer;

    CutoutDrawable() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    CutoutDrawable(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            if (r2 == 0) goto L3
            goto L8
        L3:
            com.google.android.material.shape.ShapeAppearanceModel r2 = new com.google.android.material.shape.ShapeAppearanceModel
            r2.<init>()
        L8:
            r1.<init>(r2)
            android.graphics.Paint r2 = new android.graphics.Paint
            r0 = 1
            r2.<init>(r0)
            r1.cutoutPaint = r2
            r1.setPaintStyles()
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.cutoutBounds = r2
            return
    }

    private void postDraw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable$Callback r0 = r1.getCallback()
            boolean r0 = r1.useHardwareLayer(r0)
            if (r0 != 0) goto Lf
            int r0 = r1.savedLayer
            r2.restoreToCount(r0)
        Lf:
            return
    }

    private void preDraw(android.graphics.Canvas r3) {
            r2 = this;
            android.graphics.drawable.Drawable$Callback r0 = r2.getCallback()
            boolean r1 = r2.useHardwareLayer(r0)
            if (r1 == 0) goto L18
            android.view.View r0 = (android.view.View) r0
            int r3 = r0.getLayerType()
            r1 = 2
            if (r3 == r1) goto L1b
            r3 = 0
            r0.setLayerType(r1, r3)
            goto L1b
        L18:
            r2.saveCanvasLayer(r3)
        L1b:
            return
    }

    private void saveCanvasLayer(android.graphics.Canvas r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            int r0 = r7.getWidth()
            float r3 = (float) r0
            int r0 = r7.getHeight()
            float r4 = (float) r0
            r5 = 0
            r0 = r7
            int r7 = r0.saveLayer(r1, r2, r3, r4, r5)
            r6.savedLayer = r7
            return
    }

    private void setPaintStyles() {
            r3 = this;
            android.graphics.Paint r0 = r3.cutoutPaint
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.setStyle(r1)
            android.graphics.Paint r0 = r3.cutoutPaint
            r1 = -1
            r0.setColor(r1)
            android.graphics.Paint r0 = r3.cutoutPaint
            android.graphics.PorterDuffXfermode r1 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.DST_OUT
            r1.<init>(r2)
            r0.setXfermode(r1)
            return
    }

    private boolean useHardwareLayer(android.graphics.drawable.Drawable.Callback r1) {
            r0 = this;
            boolean r1 = r1 instanceof android.view.View
            return r1
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r3) {
            r2 = this;
            r2.preDraw(r3)
            super.draw(r3)
            android.graphics.RectF r0 = r2.cutoutBounds
            android.graphics.Paint r1 = r2.cutoutPaint
            r3.drawRect(r0, r1)
            r2.postDraw(r3)
            return
    }

    boolean hasCutout() {
            r1 = this;
            android.graphics.RectF r0 = r1.cutoutBounds
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    void removeCutout() {
            r1 = this;
            r0 = 0
            r1.setCutout(r0, r0, r0, r0)
            return
    }

    void setCutout(float r2, float r3, float r4, float r5) {
            r1 = this;
            android.graphics.RectF r0 = r1.cutoutBounds
            float r0 = r0.left
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L20
            android.graphics.RectF r0 = r1.cutoutBounds
            float r0 = r0.top
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 != 0) goto L20
            android.graphics.RectF r0 = r1.cutoutBounds
            float r0 = r0.right
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 != 0) goto L20
            android.graphics.RectF r0 = r1.cutoutBounds
            float r0 = r0.bottom
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 == 0) goto L28
        L20:
            android.graphics.RectF r0 = r1.cutoutBounds
            r0.set(r2, r3, r4, r5)
            r1.invalidateSelf()
        L28:
            return
    }

    void setCutout(android.graphics.RectF r4) {
            r3 = this;
            float r0 = r4.left
            float r1 = r4.top
            float r2 = r4.right
            float r4 = r4.bottom
            r3.setCutout(r0, r1, r2, r4)
            return
    }
}
