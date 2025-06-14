package androidx.appcompat.widget;

/* loaded from: classes.dex */
class ActionBarBackgroundDrawable extends android.graphics.drawable.Drawable {
    final androidx.appcompat.widget.ActionBarContainer mContainer;

    public ActionBarBackgroundDrawable(androidx.appcompat.widget.ActionBarContainer r1) {
            r0 = this;
            r0.<init>()
            r0.mContainer = r1
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            boolean r0 = r0.mIsSplit
            if (r0 == 0) goto L14
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            if (r0 == 0) goto L34
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            r0.draw(r2)
            goto L34
        L14:
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mBackground
            if (r0 == 0) goto L21
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mBackground
            r0.draw(r2)
        L21:
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mStackedBackground
            if (r0 == 0) goto L34
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            boolean r0 = r0.mIsStacked
            if (r0 == 0) goto L34
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mStackedBackground
            r0.draw(r2)
        L34:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(android.graphics.Outline r2) {
            r1 = this;
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            boolean r0 = r0.mIsSplit
            if (r0 == 0) goto L14
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            if (r0 == 0) goto L21
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mSplitBackground
            r0.getOutline(r2)
            goto L21
        L14:
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mBackground
            if (r0 == 0) goto L21
            androidx.appcompat.widget.ActionBarContainer r0 = r1.mContainer
            android.graphics.drawable.Drawable r0 = r0.mBackground
            r0.getOutline(r2)
        L21:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int r1) {
            r0 = this;
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter r1) {
            r0 = this;
            return
    }
}
