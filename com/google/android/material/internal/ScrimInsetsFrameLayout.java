package com.google.android.material.internal;

/* loaded from: classes.dex */
public class ScrimInsetsFrameLayout extends android.widget.FrameLayout {
    private boolean drawBottomInsetForeground;
    private boolean drawTopInsetForeground;
    android.graphics.drawable.Drawable insetForeground;
    android.graphics.Rect insets;
    private android.graphics.Rect tempRect;


    public ScrimInsetsFrameLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ScrimInsetsFrameLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ScrimInsetsFrameLayout(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.tempRect = r0
            r0 = 1
            r7.drawTopInsetForeground = r0
            r7.drawBottomInsetForeground = r0
            int[] r3 = com.google.android.material.C0479R.styleable.ScrimInsetsFrameLayout
            int r5 = com.google.android.material.C0479R.style.Widget_Design_ScrimInsetsFrameLayout
            r1 = 0
            int[] r6 = new int[r1]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r9 = com.google.android.material.C0479R.styleable.ScrimInsetsFrameLayout_insetForeground
            android.graphics.drawable.Drawable r9 = r8.getDrawable(r9)
            r7.insetForeground = r9
            r8.recycle()
            r7.setWillNotDraw(r0)
            com.google.android.material.internal.ScrimInsetsFrameLayout$1 r8 = new com.google.android.material.internal.ScrimInsetsFrameLayout$1
            r8.<init>(r7)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r7, r8)
            return
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r9) {
            r8 = this;
            super.draw(r9)
            int r0 = r8.getWidth()
            int r1 = r8.getHeight()
            android.graphics.Rect r2 = r8.insets
            if (r2 == 0) goto L9b
            android.graphics.drawable.Drawable r2 = r8.insetForeground
            if (r2 == 0) goto L9b
            int r2 = r9.save()
            int r3 = r8.getScrollX()
            float r3 = (float) r3
            int r4 = r8.getScrollY()
            float r4 = (float) r4
            r9.translate(r3, r4)
            boolean r3 = r8.drawTopInsetForeground
            r4 = 0
            if (r3 == 0) goto L3e
            android.graphics.Rect r3 = r8.tempRect
            android.graphics.Rect r5 = r8.insets
            int r5 = r5.top
            r3.set(r4, r4, r0, r5)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            android.graphics.Rect r5 = r8.tempRect
            r3.setBounds(r5)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            r3.draw(r9)
        L3e:
            boolean r3 = r8.drawBottomInsetForeground
            if (r3 == 0) goto L59
            android.graphics.Rect r3 = r8.tempRect
            android.graphics.Rect r5 = r8.insets
            int r5 = r5.bottom
            int r5 = r1 - r5
            r3.set(r4, r5, r0, r1)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            android.graphics.Rect r5 = r8.tempRect
            r3.setBounds(r5)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            r3.draw(r9)
        L59:
            android.graphics.Rect r3 = r8.tempRect
            android.graphics.Rect r5 = r8.insets
            int r5 = r5.top
            android.graphics.Rect r6 = r8.insets
            int r6 = r6.left
            android.graphics.Rect r7 = r8.insets
            int r7 = r7.bottom
            int r7 = r1 - r7
            r3.set(r4, r5, r6, r7)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            android.graphics.Rect r4 = r8.tempRect
            r3.setBounds(r4)
            android.graphics.drawable.Drawable r3 = r8.insetForeground
            r3.draw(r9)
            android.graphics.Rect r3 = r8.tempRect
            android.graphics.Rect r4 = r8.insets
            int r4 = r4.right
            int r4 = r0 - r4
            android.graphics.Rect r5 = r8.insets
            int r5 = r5.top
            android.graphics.Rect r6 = r8.insets
            int r6 = r6.bottom
            int r1 = r1 - r6
            r3.set(r4, r5, r0, r1)
            android.graphics.drawable.Drawable r0 = r8.insetForeground
            android.graphics.Rect r1 = r8.tempRect
            r0.setBounds(r1)
            android.graphics.drawable.Drawable r0 = r8.insetForeground
            r0.draw(r9)
            r9.restoreToCount(r2)
        L9b:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            android.graphics.drawable.Drawable r0 = r1.insetForeground
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.graphics.drawable.Drawable r0 = r2.insetForeground
            if (r0 == 0) goto Lb
            r1 = 0
            r0.setCallback(r1)
        Lb:
            return
    }

    protected void onInsetsChanged(androidx.core.view.WindowInsetsCompat r1) {
            r0 = this;
            return
    }

    public void setDrawBottomInsetForeground(boolean r1) {
            r0 = this;
            r0.drawBottomInsetForeground = r1
            return
    }

    public void setDrawTopInsetForeground(boolean r1) {
            r0 = this;
            r0.drawTopInsetForeground = r1
            return
    }

    public void setScrimInsetForeground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.insetForeground = r1
            return
    }
}
