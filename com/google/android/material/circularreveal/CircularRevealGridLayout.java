package com.google.android.material.circularreveal;

/* loaded from: classes.dex */
public class CircularRevealGridLayout extends android.widget.GridLayout implements com.google.android.material.circularreveal.CircularRevealWidget {
    private final com.google.android.material.circularreveal.CircularRevealHelper helper;

    public CircularRevealGridLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public CircularRevealGridLayout(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            com.google.android.material.circularreveal.CircularRevealHelper r1 = new com.google.android.material.circularreveal.CircularRevealHelper
            r1.<init>(r0)
            r0.helper = r1
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public void actualDraw(android.graphics.Canvas r1) {
            r0 = this;
            super.draw(r1)
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public boolean actualIsOpaque() {
            r1 = this;
            boolean r0 = super.isOpaque()
            return r0
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            r0.buildCircularRevealCache()
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            r0.destroyCircularRevealCache()
            return
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            if (r0 == 0) goto L8
            r0.draw(r2)
            goto Lb
        L8:
            super.draw(r2)
        Lb:
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            android.graphics.drawable.Drawable r0 = r0.getCircularRevealOverlayDrawable()
            return r0
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            int r0 = r0.getCircularRevealScrimColor()
            return r0
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r0.getRevealInfo()
            return r0
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            if (r0 == 0) goto L9
            boolean r0 = r0.isOpaque()
            return r0
        L9:
            boolean r0 = super.isOpaque()
            return r0
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            r0.setCircularRevealOverlayDrawable(r2)
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(int r2) {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            r0.setCircularRevealScrimColor(r2)
            return
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo r2) {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper r0 = r1.helper
            r0.setRevealInfo(r2)
            return
    }
}
