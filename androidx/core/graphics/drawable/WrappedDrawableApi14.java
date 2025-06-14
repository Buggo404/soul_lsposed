package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
class WrappedDrawableApi14 extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, androidx.core.graphics.drawable.WrappedDrawable, androidx.core.graphics.drawable.TintAwareDrawable {
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = null;
    private boolean mColorFilterSet;
    private int mCurrentColor;
    private android.graphics.PorterDuff.Mode mCurrentMode;
    android.graphics.drawable.Drawable mDrawable;
    private boolean mMutated;
    androidx.core.graphics.drawable.WrappedDrawableState mState;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            androidx.core.graphics.drawable.WrappedDrawableApi14.DEFAULT_TINT_MODE = r0
            return
    }

    WrappedDrawableApi14(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.<init>()
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mutateConstantState()
            r1.mState = r0
            r1.setWrappedDrawable(r2)
            return
    }

    WrappedDrawableApi14(androidx.core.graphics.drawable.WrappedDrawableState r1, android.content.res.Resources r2) {
            r0 = this;
            r0.<init>()
            r0.mState = r1
            r0.updateLocalState(r2)
            return
    }

    private androidx.core.graphics.drawable.WrappedDrawableState mutateConstantState() {
            r2 = this;
            androidx.core.graphics.drawable.WrappedDrawableState r0 = new androidx.core.graphics.drawable.WrappedDrawableState
            androidx.core.graphics.drawable.WrappedDrawableState r1 = r2.mState
            r0.<init>(r1)
            return r0
    }

    private void updateLocalState(android.content.res.Resources r2) {
            r1 = this;
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mState
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable$ConstantState r0 = r0.mDrawableState
            if (r0 == 0) goto L13
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mState
            android.graphics.drawable.Drawable$ConstantState r0 = r0.mDrawableState
            android.graphics.drawable.Drawable r2 = r0.newDrawable(r2)
            r1.setWrappedDrawable(r2)
        L13:
            return
    }

    private boolean updateTint(int[] r5) {
            r4 = this;
            boolean r0 = r4.isCompatTintEnabled()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r4.mState
            android.content.res.ColorStateList r0 = r0.mTint
            androidx.core.graphics.drawable.WrappedDrawableState r2 = r4.mState
            android.graphics.PorterDuff$Mode r2 = r2.mTintMode
            if (r0 == 0) goto L33
            if (r2 == 0) goto L33
            int r3 = r0.getDefaultColor()
            int r5 = r0.getColorForState(r5, r3)
            boolean r0 = r4.mColorFilterSet
            if (r0 == 0) goto L28
            int r0 = r4.mCurrentColor
            if (r5 != r0) goto L28
            android.graphics.PorterDuff$Mode r0 = r4.mCurrentMode
            if (r2 == r0) goto L38
        L28:
            r4.setColorFilter(r5, r2)
            r4.mCurrentColor = r5
            r4.mCurrentMode = r2
            r5 = 1
            r4.mColorFilterSet = r5
            return r5
        L33:
            r4.mColorFilterSet = r1
            r4.clearColorFilter()
        L38:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.draw(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
            r2 = this;
            int r0 = super.getChangingConfigurations()
            androidx.core.graphics.drawable.WrappedDrawableState r1 = r2.mState
            if (r1 == 0) goto Ld
            int r1 = r1.getChangingConfigurations()
            goto Le
        Ld:
            r1 = 0
        Le:
            r0 = r0 | r1
            android.graphics.drawable.Drawable r1 = r2.mDrawable
            int r1 = r1.getChangingConfigurations()
            r0 = r0 | r1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
            r2 = this;
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mState
            if (r0 == 0) goto L15
            boolean r0 = r0.canConstantState()
            if (r0 == 0) goto L15
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mState
            int r1 = r2.getChangingConfigurations()
            r0.mChangingConfigurations = r1
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mState
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable getCurrent() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            android.graphics.drawable.Drawable r0 = r0.getCurrent()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = r0.getIntrinsicHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = r0.getIntrinsicWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(r0)
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = r0.getMinimumHeight()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = r0.getMinimumWidth()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int r0 = r0.getOpacity()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r2 = r0.getPadding(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            int[] r0 = r0.getState()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.Region getTransparentRegion() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            android.graphics.Region r0 = r0.getTransparentRegion()
            return r0
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final android.graphics.drawable.Drawable getWrappedDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            return r0
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r0)
            return r0
    }

    protected boolean isCompatTintEnabled() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = r1.isCompatTintEnabled()
            if (r0 == 0) goto Ld
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mState
            if (r0 == 0) goto Ld
            android.content.res.ColorStateList r0 = r0.mTint
            goto Le
        Ld:
            r0 = 0
        Le:
            if (r0 == 0) goto L16
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L1e
        L16:
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L20
        L1e:
            r0 = 1
            goto L21
        L20:
            r0 = 0
        L21:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.jumpToCurrentState()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
            r2 = this;
            boolean r0 = r2.mMutated
            if (r0 != 0) goto L2a
            android.graphics.drawable.Drawable r0 = super.mutate()
            if (r0 != r2) goto L2a
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mutateConstantState()
            r2.mState = r0
            android.graphics.drawable.Drawable r0 = r2.mDrawable
            if (r0 == 0) goto L17
            r0.mutate()
        L17:
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mState
            if (r0 == 0) goto L27
            android.graphics.drawable.Drawable r1 = r2.mDrawable
            if (r1 == 0) goto L24
            android.graphics.drawable.Drawable$ConstantState r1 = r1.getConstantState()
            goto L25
        L24:
            r1 = 0
        L25:
            r0.mDrawableState = r1
        L27:
            r0 = 1
            r2.mMutated = r0
        L2a:
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            if (r0 == 0) goto L7
            r0.setBounds(r2)
        L7:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r2 = androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r0, r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r2 = r0.setLevel(r2)
            return r2
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2, long r3) {
            r0 = this;
            r0.scheduleSelf(r2, r3)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(r0, r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.setChangingConfigurations(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.setColorFilter(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.setDither(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            r0.setFilterBitmap(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r0 = r0.setState(r2)
            boolean r2 = r1.updateTint(r2)
            if (r2 != 0) goto L11
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setTintList(r1)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mState
            r0.mTint = r2
            int[] r2 = r1.getState()
            r1.updateTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r1.mState
            r0.mTintMode = r2
            int[] r2 = r1.getState()
            r1.updateTint(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r2, boolean r3) {
            r1 = this;
            boolean r0 = super.setVisible(r2, r3)
            if (r0 != 0) goto L11
            android.graphics.drawable.Drawable r0 = r1.mDrawable
            boolean r2 = r0.setVisible(r2, r3)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            goto L12
        L11:
            r2 = 1
        L12:
            return r2
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void setWrappedDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mDrawable
            if (r0 == 0) goto L8
            r1 = 0
            r0.setCallback(r1)
        L8:
            r2.mDrawable = r3
            if (r3 == 0) goto L36
            r3.setCallback(r2)
            boolean r0 = r3.isVisible()
            r1 = 1
            r2.setVisible(r0, r1)
            int[] r0 = r3.getState()
            r2.setState(r0)
            int r0 = r3.getLevel()
            r2.setLevel(r0)
            android.graphics.Rect r0 = r3.getBounds()
            r2.setBounds(r0)
            androidx.core.graphics.drawable.WrappedDrawableState r0 = r2.mState
            if (r0 == 0) goto L36
            android.graphics.drawable.Drawable$ConstantState r3 = r3.getConstantState()
            r0.mDrawableState = r3
        L36:
            r2.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable r1, java.lang.Runnable r2) {
            r0 = this;
            r0.unscheduleSelf(r2)
            return
    }
}
