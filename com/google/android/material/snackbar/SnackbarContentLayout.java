package com.google.android.material.snackbar;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends android.widget.LinearLayout implements com.google.android.material.snackbar.ContentViewCallback {
    private android.widget.Button actionView;
    private int maxInlineActionWidth;
    private int maxWidth;
    private android.widget.TextView messageView;

    public SnackbarContentLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SnackbarContentLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            int[] r0 = com.google.android.material.C0479R.styleable.SnackbarLayout
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
            int r3 = com.google.android.material.C0479R.styleable.SnackbarLayout_android_maxWidth
            r0 = -1
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.maxWidth = r3
            int r3 = com.google.android.material.C0479R.styleable.SnackbarLayout_maxActionInlineWidth
            int r3 = r2.getDimensionPixelSize(r3, r0)
            r1.maxInlineActionWidth = r3
            r2.recycle()
            return
    }

    private static void updateTopBottomPadding(android.view.View r2, int r3, int r4) {
            boolean r0 = androidx.core.view.ViewCompat.isPaddingRelative(r2)
            if (r0 == 0) goto L12
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            androidx.core.view.ViewCompat.setPaddingRelative(r2, r0, r3, r1, r4)
            goto L1d
        L12:
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            r2.setPadding(r0, r3, r1, r4)
        L1d:
            return
    }

    private boolean updateViewsWithinLayout(int r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.getOrientation()
            r1 = 1
            if (r3 == r0) goto Lc
            r2.setOrientation(r3)
            r3 = r1
            goto Ld
        Lc:
            r3 = 0
        Ld:
            android.widget.TextView r0 = r2.messageView
            int r0 = r0.getPaddingTop()
            if (r0 != r4) goto L20
            android.widget.TextView r0 = r2.messageView
            int r0 = r0.getPaddingBottom()
            if (r0 == r5) goto L1e
            goto L20
        L1e:
            r1 = r3
            goto L25
        L20:
            android.widget.TextView r3 = r2.messageView
            updateTopBottomPadding(r3, r4, r5)
        L25:
            return r1
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentIn(int r8, int r9) {
            r7 = this;
            android.widget.TextView r0 = r7.messageView
            r1 = 0
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.messageView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r2 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
            long r3 = (long) r9
            android.view.ViewPropertyAnimator r9 = r0.setDuration(r3)
            long r5 = (long) r8
            android.view.ViewPropertyAnimator r8 = r9.setStartDelay(r5)
            r8.start()
            android.widget.Button r8 = r7.actionView
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L41
            android.widget.Button r8 = r7.actionView
            r8.setAlpha(r1)
            android.widget.Button r8 = r7.actionView
            android.view.ViewPropertyAnimator r8 = r8.animate()
            android.view.ViewPropertyAnimator r8 = r8.alpha(r2)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r3)
            android.view.ViewPropertyAnimator r8 = r8.setStartDelay(r5)
            r8.start()
        L41:
            return
    }

    @Override // com.google.android.material.snackbar.ContentViewCallback
    public void animateContentOut(int r8, int r9) {
            r7 = this;
            android.widget.TextView r0 = r7.messageView
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            android.widget.TextView r0 = r7.messageView
            android.view.ViewPropertyAnimator r0 = r0.animate()
            r2 = 0
            android.view.ViewPropertyAnimator r0 = r0.alpha(r2)
            long r3 = (long) r9
            android.view.ViewPropertyAnimator r9 = r0.setDuration(r3)
            long r5 = (long) r8
            android.view.ViewPropertyAnimator r8 = r9.setStartDelay(r5)
            r8.start()
            android.widget.Button r8 = r7.actionView
            int r8 = r8.getVisibility()
            if (r8 != 0) goto L41
            android.widget.Button r8 = r7.actionView
            r8.setAlpha(r1)
            android.widget.Button r8 = r7.actionView
            android.view.ViewPropertyAnimator r8 = r8.animate()
            android.view.ViewPropertyAnimator r8 = r8.alpha(r2)
            android.view.ViewPropertyAnimator r8 = r8.setDuration(r3)
            android.view.ViewPropertyAnimator r8 = r8.setStartDelay(r5)
            r8.start()
        L41:
            return
    }

    public android.widget.Button getActionView() {
            r1 = this;
            android.widget.Button r0 = r1.actionView
            return r0
    }

    public android.widget.TextView getMessageView() {
            r1 = this;
            android.widget.TextView r0 = r1.messageView
            return r0
    }

    @Override // android.view.View
    protected void onFinishInflate() {
            r1 = this;
            super.onFinishInflate()
            int r0 = com.google.android.material.C0479R.id.snackbar_text
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1.messageView = r0
            int r0 = com.google.android.material.C0479R.id.snackbar_action
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r1.actionView = r0
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r8, int r9) {
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.maxWidth
            if (r0 <= 0) goto L18
            int r0 = r7.getMeasuredWidth()
            int r1 = r7.maxWidth
            if (r0 <= r1) goto L18
            r8 = 1073741824(0x40000000, float:2.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            super.onMeasure(r8, r9)
        L18:
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C0479R.dimen.design_snackbar_padding_vertical_2lines
            int r0 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r1 = r7.getResources()
            int r2 = com.google.android.material.C0479R.dimen.design_snackbar_padding_vertical
            int r1 = r1.getDimensionPixelSize(r2)
            android.widget.TextView r2 = r7.messageView
            android.text.Layout r2 = r2.getLayout()
            int r2 = r2.getLineCount()
            r3 = 0
            r4 = 1
            if (r2 <= r4) goto L3c
            r2 = r4
            goto L3d
        L3c:
            r2 = r3
        L3d:
            if (r2 == 0) goto L56
            int r5 = r7.maxInlineActionWidth
            if (r5 <= 0) goto L56
            android.widget.Button r5 = r7.actionView
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.maxInlineActionWidth
            if (r5 <= r6) goto L56
            int r1 = r0 - r1
            boolean r0 = r7.updateViewsWithinLayout(r4, r0, r1)
            if (r0 == 0) goto L61
            goto L60
        L56:
            if (r2 == 0) goto L59
            goto L5a
        L59:
            r0 = r1
        L5a:
            boolean r0 = r7.updateViewsWithinLayout(r3, r0, r0)
            if (r0 == 0) goto L61
        L60:
            r3 = r4
        L61:
            if (r3 == 0) goto L66
            super.onMeasure(r8, r9)
        L66:
            return
    }

    public void setMaxInlineActionWidth(int r1) {
            r0 = this;
            r0.maxInlineActionWidth = r1
            return
    }

    void updateActionTextColorAlphaIfNeeded(float r3) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 == 0) goto L1b
            android.widget.Button r0 = r2.actionView
            int r0 = r0.getCurrentTextColor()
            int r1 = com.google.android.material.C0479R.attr.colorSurface
            int r1 = com.google.android.material.color.MaterialColors.getColor(r2, r1)
            int r3 = com.google.android.material.color.MaterialColors.layer(r1, r0, r3)
            android.widget.Button r0 = r2.actionView
            r0.setTextColor(r3)
        L1b:
            return
    }
}
