package androidx.cardview.widget;

/* loaded from: classes.dex */
class CardViewBaseImpl implements androidx.cardview.widget.CardViewImpl {
    final android.graphics.RectF mCornerRect;


    CardViewBaseImpl() {
            r1 = this;
            r1.<init>()
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.mCornerRect = r0
            return
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow createBackground(android.content.Context r8, android.content.res.ColorStateList r9, float r10, float r11, float r12) {
            r7 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r6 = new androidx.cardview.widget.RoundRectDrawableWithShadow
            android.content.res.Resources r1 = r8.getResources()
            r0 = r6
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow getShadowBackground(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.getCardBackground()
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = (androidx.cardview.widget.RoundRectDrawableWithShadow) r1
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            android.content.res.ColorStateList r1 = r1.getColor()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            float r1 = r1.getShadowSize()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            float r1 = r1.getMaxShadowSize()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            float r1 = r1.getMinHeight()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            float r1 = r1.getMinWidth()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            float r1 = r1.getCornerRadius()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
            r1 = this;
            androidx.cardview.widget.CardViewBaseImpl$1 r0 = new androidx.cardview.widget.CardViewBaseImpl$1
            r0.<init>(r1)
            androidx.cardview.widget.RoundRectDrawableWithShadow.sRoundRectHelper = r0
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(androidx.cardview.widget.CardViewDelegate r7, android.content.Context r8, android.content.res.ColorStateList r9, float r10, float r11, float r12) {
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            androidx.cardview.widget.RoundRectDrawableWithShadow r8 = r0.createBackground(r1, r2, r3, r4, r5)
            boolean r9 = r7.getPreventCornerOverlap()
            r8.setAddPaddingForCorners(r9)
            r7.setCardBackground(r8)
            r6.updatePadding(r7)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate r3) {
            r2 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r0 = r2.getShadowBackground(r3)
            boolean r1 = r3.getPreventCornerOverlap()
            r0.setAddPaddingForCorners(r1)
            r2.updatePadding(r3)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(androidx.cardview.widget.CardViewDelegate r1, android.content.res.ColorStateList r2) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            r1.setColor(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(androidx.cardview.widget.CardViewDelegate r1, float r2) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r0.getShadowBackground(r1)
            r1.setShadowSize(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(androidx.cardview.widget.CardViewDelegate r2, float r3) {
            r1 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r0 = r1.getShadowBackground(r2)
            r0.setMaxShadowSize(r3)
            r1.updatePadding(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(androidx.cardview.widget.CardViewDelegate r2, float r3) {
            r1 = this;
            androidx.cardview.widget.RoundRectDrawableWithShadow r0 = r1.getShadowBackground(r2)
            r0.setCornerRadius(r3)
            r1.updatePadding(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(androidx.cardview.widget.CardViewDelegate r5) {
            r4 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            androidx.cardview.widget.RoundRectDrawableWithShadow r1 = r4.getShadowBackground(r5)
            r1.getMaxShadowAndCornerPadding(r0)
            float r1 = r4.getMinWidth(r5)
            double r1 = (double) r1
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            float r2 = r4.getMinHeight(r5)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            r5.setMinWidthHeightInternal(r1, r2)
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r0 = r0.bottom
            r5.setShadowPadding(r1, r2, r3, r0)
            return
    }
}
