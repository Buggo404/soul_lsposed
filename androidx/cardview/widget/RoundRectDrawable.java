package androidx.cardview.widget;

/* loaded from: classes.dex */
class RoundRectDrawable extends android.graphics.drawable.Drawable {
    private android.content.res.ColorStateList mBackground;
    private final android.graphics.RectF mBoundsF;
    private final android.graphics.Rect mBoundsI;
    private boolean mInsetForPadding;
    private boolean mInsetForRadius;
    private float mPadding;
    private final android.graphics.Paint mPaint;
    private float mRadius;
    private android.content.res.ColorStateList mTint;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private android.graphics.PorterDuff.Mode mTintMode;

    RoundRectDrawable(android.content.res.ColorStateList r2, float r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mInsetForPadding = r0
            r0 = 1
            r1.mInsetForRadius = r0
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            r1.mTintMode = r0
            r1.mRadius = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r0 = 5
            r3.<init>(r0)
            r1.mPaint = r3
            r1.setBackground(r2)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r1.mBoundsF = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.mBoundsI = r2
            return
    }

    private android.graphics.PorterDuffColorFilter createTintFilter(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    private void setBackground(android.content.res.ColorStateList r4) {
            r3 = this;
            if (r4 != 0) goto L7
            r4 = 0
            android.content.res.ColorStateList r4 = android.content.res.ColorStateList.valueOf(r4)
        L7:
            r3.mBackground = r4
            android.graphics.Paint r0 = r3.mPaint
            int[] r1 = r3.getState()
            android.content.res.ColorStateList r2 = r3.mBackground
            int r2 = r2.getDefaultColor()
            int r4 = r4.getColorForState(r1, r2)
            r0.setColor(r4)
            return
    }

    private void updateBounds(android.graphics.Rect r6) {
            r5 = this;
            if (r6 != 0) goto L6
            android.graphics.Rect r6 = r5.getBounds()
        L6:
            android.graphics.RectF r0 = r5.mBoundsF
            int r1 = r6.left
            float r1 = (float) r1
            int r2 = r6.top
            float r2 = (float) r2
            int r3 = r6.right
            float r3 = (float) r3
            int r4 = r6.bottom
            float r4 = (float) r4
            r0.set(r1, r2, r3, r4)
            android.graphics.Rect r0 = r5.mBoundsI
            r0.set(r6)
            boolean r6 = r5.mInsetForPadding
            if (r6 == 0) goto L4c
            float r6 = r5.mPadding
            float r0 = r5.mRadius
            boolean r1 = r5.mInsetForRadius
            float r6 = androidx.cardview.widget.RoundRectDrawableWithShadow.calculateVerticalPadding(r6, r0, r1)
            float r0 = r5.mPadding
            float r1 = r5.mRadius
            boolean r2 = r5.mInsetForRadius
            float r0 = androidx.cardview.widget.RoundRectDrawableWithShadow.calculateHorizontalPadding(r0, r1, r2)
            android.graphics.Rect r1 = r5.mBoundsI
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r0 = (int) r2
            double r2 = (double) r6
            double r2 = java.lang.Math.ceil(r2)
            int r6 = (int) r2
            r1.inset(r0, r6)
            android.graphics.RectF r6 = r5.mBoundsF
            android.graphics.Rect r0 = r5.mBoundsI
            r6.set(r0)
        L4c:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r5) {
            r4 = this;
            android.graphics.Paint r0 = r4.mPaint
            android.graphics.PorterDuffColorFilter r1 = r4.mTintFilter
            if (r1 == 0) goto L13
            android.graphics.ColorFilter r1 = r0.getColorFilter()
            if (r1 != 0) goto L13
            android.graphics.PorterDuffColorFilter r1 = r4.mTintFilter
            r0.setColorFilter(r1)
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            android.graphics.RectF r2 = r4.mBoundsF
            float r3 = r4.mRadius
            r5.drawRoundRect(r2, r3, r3, r0)
            if (r1 == 0) goto L21
            r5 = 0
            r0.setColorFilter(r5)
        L21:
            return
    }

    public android.content.res.ColorStateList getColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mBackground
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = -3
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r3) {
            r2 = this;
            android.graphics.Rect r0 = r2.mBoundsI
            float r1 = r2.mRadius
            r3.setRoundRect(r0, r1)
            return
    }

    float getPadding() {
            r1 = this;
            float r0 = r1.mPadding
            return r0
    }

    public float getRadius() {
            r1 = this;
            float r0 = r1.mRadius
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mTint
            if (r0 == 0) goto La
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        La:
            android.content.res.ColorStateList r0 = r1.mBackground
            if (r0 == 0) goto L14
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1a
        L14:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L1c
        L1a:
            r0 = 1
            goto L1d
        L1c:
            r0 = 0
        L1d:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r1) {
            r0 = this;
            super.onBoundsChange(r1)
            r0.updateBounds(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.mBackground
            int r1 = r0.getDefaultColor()
            int r4 = r0.getColorForState(r4, r1)
            android.graphics.Paint r0 = r3.mPaint
            int r0 = r0.getColor()
            r1 = 1
            if (r4 == r0) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = 0
        L16:
            if (r0 == 0) goto L1d
            android.graphics.Paint r2 = r3.mPaint
            r2.setColor(r4)
        L1d:
            android.content.res.ColorStateList r4 = r3.mTint
            if (r4 == 0) goto L2c
            android.graphics.PorterDuff$Mode r2 = r3.mTintMode
            if (r2 == 0) goto L2c
            android.graphics.PorterDuffColorFilter r4 = r3.createTintFilter(r4, r2)
            r3.mTintFilter = r4
            return r1
        L2c:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            return
    }

    public void setColor(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackground(r1)
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            return
    }

    void setPadding(float r2, boolean r3, boolean r4) {
            r1 = this;
            float r0 = r1.mPadding
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto Lf
            boolean r0 = r1.mInsetForPadding
            if (r0 != r3) goto Lf
            boolean r0 = r1.mInsetForRadius
            if (r0 != r4) goto Lf
            return
        Lf:
            r1.mPadding = r2
            r1.mInsetForPadding = r3
            r1.mInsetForRadius = r4
            r2 = 0
            r1.updateBounds(r2)
            r1.invalidateSelf()
            return
    }

    void setRadius(float r2) {
            r1 = this;
            float r0 = r1.mRadius
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.mRadius = r2
            r2 = 0
            r1.updateBounds(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTint = r2
            android.graphics.PorterDuff$Mode r0 = r1.mTintMode
            android.graphics.PorterDuffColorFilter r2 = r1.createTintFilter(r2, r0)
            r1.mTintFilter = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mTintMode = r2
            android.content.res.ColorStateList r0 = r1.mTint
            android.graphics.PorterDuffColorFilter r2 = r1.createTintFilter(r0, r2)
            r1.mTintFilter = r2
            r1.invalidateSelf()
            return
    }
}
