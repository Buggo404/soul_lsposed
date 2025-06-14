package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes.dex */
abstract class VectorDrawableCommon extends android.graphics.drawable.Drawable implements androidx.core.graphics.drawable.TintAwareDrawable {
    android.graphics.drawable.Drawable mDelegateDrawable;

    VectorDrawableCommon() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(r0, r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.clearColorFilter()
            return
        L8:
            super.clearColorFilter()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
        L9:
            android.graphics.drawable.Drawable r0 = super.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getMinimumHeight()
            return r0
        L9:
            int r0 = super.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int r0 = r0.getMinimumWidth()
            return r0
        L9:
            int r0 = super.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.getPadding(r2)
            return r2
        L9:
            boolean r2 = super.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            int[] r0 = r0.getState()
            return r0
        L9:
            int[] r0 = super.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
        L9:
            android.graphics.Region r0 = super.getTransparentRegion()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.jumpToCurrentState(r0)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setBounds(r2)
            return
        L8:
            super.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setLevel(r2)
            return r2
        L9:
            boolean r2 = super.onLevelChange(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setChangingConfigurations(r2)
            return
        L8:
            super.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int r2, android.graphics.PorterDuff.Mode r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L8
            r0.setColorFilter(r2, r3)
            return
        L8:
            super.setColorFilter(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            r0.setFilterBitmap(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float r2, float r3) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.setHotspot(r0, r2, r3)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L7
            androidx.core.graphics.drawable.DrawableCompat.setHotspotBounds(r0, r2, r3, r4, r5)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDelegateDrawable
            if (r0 == 0) goto L9
            boolean r2 = r0.setState(r2)
            return r2
        L9:
            boolean r2 = super.setState(r2)
            return r2
    }
}
