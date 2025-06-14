package com.google.android.material.textfield;

/* loaded from: classes.dex */
class ClearTextEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_DURATION = 100;
    private static final int ANIMATION_SCALE_DURATION = 150;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    private final android.text.TextWatcher clearTextEndIconTextWatcher;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener clearTextOnEditTextAttachedListener;
    private final com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private android.animation.AnimatorSet iconInAnim;
    private android.animation.ValueAnimator iconOutAnim;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;










    ClearTextEndIconDelegate(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.material.textfield.ClearTextEndIconDelegate$1 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$1
            r1.<init>(r0)
            r0.clearTextEndIconTextWatcher = r1
            com.google.android.material.textfield.ClearTextEndIconDelegate$2 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$2
            r1.<init>(r0)
            r0.onFocusChangeListener = r1
            com.google.android.material.textfield.ClearTextEndIconDelegate$3 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$3
            r1.<init>(r0)
            r0.clearTextOnEditTextAttachedListener = r1
            com.google.android.material.textfield.ClearTextEndIconDelegate$4 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$4
            r1.<init>(r0)
            r0.endIconChangedListener = r1
            return
    }

    static /* synthetic */ boolean access$000(android.text.Editable r0) {
            boolean r0 = hasText(r0)
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.textfield.ClearTextEndIconDelegate r0, boolean r1) {
            r0.animateIcon(r1)
            return
    }

    static /* synthetic */ android.view.View.OnFocusChangeListener access$200(com.google.android.material.textfield.ClearTextEndIconDelegate r0) {
            android.view.View$OnFocusChangeListener r0 = r0.onFocusChangeListener
            return r0
    }

    static /* synthetic */ android.text.TextWatcher access$300(com.google.android.material.textfield.ClearTextEndIconDelegate r0) {
            android.text.TextWatcher r0 = r0.clearTextEndIconTextWatcher
            return r0
    }

    private void animateIcon(boolean r3) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            boolean r0 = r0.isEndIconVisible()
            if (r0 != r3) goto La
            r0 = 1
            goto Lb
        La:
            r0 = 0
        Lb:
            if (r3 == 0) goto L27
            android.animation.AnimatorSet r1 = r2.iconInAnim
            boolean r1 = r1.isRunning()
            if (r1 != 0) goto L27
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.cancel()
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.end()
            goto L3a
        L27:
            if (r3 != 0) goto L3a
            android.animation.AnimatorSet r3 = r2.iconInAnim
            r3.cancel()
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.start()
            if (r0 == 0) goto L3a
            android.animation.ValueAnimator r3 = r2.iconOutAnim
            r3.end()
        L3a:
            return
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... r3) {
            r2 = this;
            android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r3.setInterpolator(r0)
            r0 = 100
            r3.setDuration(r0)
            com.google.android.material.textfield.ClearTextEndIconDelegate$8 r0 = new com.google.android.material.textfield.ClearTextEndIconDelegate$8
            r0.<init>(r2)
            r3.addUpdateListener(r0)
            return r3
    }

    private android.animation.ValueAnimator getScaleAnimator() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001e: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            r1 = 150(0x96, double:7.4E-322)
            r0.setDuration(r1)
            com.google.android.material.textfield.ClearTextEndIconDelegate$9 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$9
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            return r0
    }

    private static boolean hasText(android.text.Editable r0) {
            int r0 = r0.length()
            if (r0 <= 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void initAnimators() {
            r6 = this;
            android.animation.ValueAnimator r0 = r6.getScaleAnimator()
            r1 = 2
            float[] r2 = new float[r1]
            r2 = {x003e: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = r6.getAlphaAnimator(r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            r6.iconInAnim = r3
            android.animation.Animator[] r4 = new android.animation.Animator[r1]
            r5 = 0
            r4[r5] = r0
            r0 = 1
            r4[r0] = r2
            r3.playTogether(r4)
            android.animation.AnimatorSet r0 = r6.iconInAnim
            com.google.android.material.textfield.ClearTextEndIconDelegate$6 r2 = new com.google.android.material.textfield.ClearTextEndIconDelegate$6
            r2.<init>(r6)
            r0.addListener(r2)
            float[] r0 = new float[r1]
            r0 = {x0046: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r6.getAlphaAnimator(r0)
            r6.iconOutAnim = r0
            com.google.android.material.textfield.ClearTextEndIconDelegate$7 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$7
            r1.<init>(r6)
            r0.addListener(r1)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            android.content.Context r1 = r3.context
            int r2 = com.google.android.material.C0479R.drawable.mtrl_ic_cancel
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            r0.setEndIconDrawable(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout r1 = r3.textInputLayout
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.material.C0479R.string.clear_text_end_icon_content_description
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.ClearTextEndIconDelegate$5 r1 = new com.google.android.material.textfield.ClearTextEndIconDelegate$5
            r1.<init>(r3)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener r1 = r3.clearTextOnEditTextAttachedListener
            r0.addOnEditTextAttachedListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = r3.endIconChangedListener
            r0.addOnEndIconChangedListener(r1)
            r3.initAnimators()
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void onSuffixVisibilityChanged(boolean r2) {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputLayout
            java.lang.CharSequence r0 = r0.getSuffixText()
            if (r0 != 0) goto L9
            return
        L9:
            r1.animateIcon(r2)
            return
    }
}
