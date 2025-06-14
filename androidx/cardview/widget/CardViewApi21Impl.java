package androidx.cardview.widget;

/* loaded from: classes.dex */
class CardViewApi21Impl implements androidx.cardview.widget.CardViewImpl {
    CardViewApi21Impl() {
            r0 = this;
            r0.<init>()
            return
    }

    private androidx.cardview.widget.RoundRectDrawable getCardBackground(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = r1.getCardBackground()
            androidx.cardview.widget.RoundRectDrawable r1 = (androidx.cardview.widget.RoundRectDrawable) r1
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r1 = r0.getCardBackground(r1)
            android.content.res.ColorStateList r1 = r1.getColor()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            android.view.View r1 = r1.getCardView()
            float r1 = r1.getElevation()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r1 = r0.getCardBackground(r1)
            float r1 = r1.getPadding()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(androidx.cardview.widget.CardViewDelegate r2) {
            r1 = this;
            float r2 = r1.getRadius(r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r0
            return r2
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(androidx.cardview.widget.CardViewDelegate r2) {
            r1 = this;
            float r2 = r1.getRadius(r2)
            r0 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 * r0
            return r2
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(androidx.cardview.widget.CardViewDelegate r1) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r1 = r0.getCardBackground(r1)
            float r1 = r1.getRadius()
            return r1
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
            r0 = this;
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(androidx.cardview.widget.CardViewDelegate r1, android.content.Context r2, android.content.res.ColorStateList r3, float r4, float r5, float r6) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r2 = new androidx.cardview.widget.RoundRectDrawable
            r2.<init>(r3, r4)
            r1.setCardBackground(r2)
            android.view.View r2 = r1.getCardView()
            r3 = 1
            r2.setClipToOutline(r3)
            r2.setElevation(r5)
            r0.setMaxElevation(r1, r6)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate r2) {
            r1 = this;
            float r0 = r1.getMaxElevation(r2)
            r1.setMaxElevation(r2, r0)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate r2) {
            r1 = this;
            float r0 = r1.getMaxElevation(r2)
            r1.setMaxElevation(r2, r0)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(androidx.cardview.widget.CardViewDelegate r1, android.content.res.ColorStateList r2) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r1 = r0.getCardBackground(r1)
            r1.setColor(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(androidx.cardview.widget.CardViewDelegate r1, float r2) {
            r0 = this;
            android.view.View r1 = r1.getCardView()
            r1.setElevation(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(androidx.cardview.widget.CardViewDelegate r4, float r5) {
            r3 = this;
            androidx.cardview.widget.RoundRectDrawable r0 = r3.getCardBackground(r4)
            boolean r1 = r4.getUseCompatPadding()
            boolean r2 = r4.getPreventCornerOverlap()
            r0.setPadding(r5, r1, r2)
            r3.updatePadding(r4)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(androidx.cardview.widget.CardViewDelegate r1, float r2) {
            r0 = this;
            androidx.cardview.widget.RoundRectDrawable r1 = r0.getCardBackground(r1)
            r1.setRadius(r2)
            return
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(androidx.cardview.widget.CardViewDelegate r5) {
            r4 = this;
            boolean r0 = r5.getUseCompatPadding()
            if (r0 != 0) goto Lb
            r0 = 0
            r5.setShadowPadding(r0, r0, r0, r0)
            return
        Lb:
            float r0 = r4.getMaxElevation(r5)
            float r1 = r4.getRadius(r5)
            boolean r2 = r5.getPreventCornerOverlap()
            float r2 = androidx.cardview.widget.RoundRectDrawableWithShadow.calculateHorizontalPadding(r0, r1, r2)
            double r2 = (double) r2
            double r2 = java.lang.Math.ceil(r2)
            int r2 = (int) r2
            boolean r3 = r5.getPreventCornerOverlap()
            float r0 = androidx.cardview.widget.RoundRectDrawableWithShadow.calculateVerticalPadding(r0, r1, r3)
            double r0 = (double) r0
            double r0 = java.lang.Math.ceil(r0)
            int r0 = (int) r0
            r5.setShadowPadding(r2, r0, r2, r0)
            return
    }
}
