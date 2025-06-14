package com.google.android.material.textfield;

/* loaded from: classes.dex */
final class IndicatorViewController {
    private static final int CAPTION_OPACITY_FADE_ANIMATION_DURATION = 167;
    private static final int CAPTION_STATE_ERROR = 1;
    private static final int CAPTION_STATE_HELPER_TEXT = 2;
    private static final int CAPTION_STATE_NONE = 0;
    private static final int CAPTION_TRANSLATE_Y_ANIMATION_DURATION = 217;
    static final int COUNTER_INDEX = 2;
    static final int ERROR_INDEX = 0;
    static final int HELPER_INDEX = 1;
    private android.animation.Animator captionAnimator;
    private android.widget.FrameLayout captionArea;
    private int captionDisplayed;
    private int captionToShow;
    private final float captionTranslationYPx;
    private final android.content.Context context;
    private boolean errorEnabled;
    private java.lang.CharSequence errorText;
    private int errorTextAppearance;
    private android.widget.TextView errorView;
    private java.lang.CharSequence errorViewContentDescription;
    private android.content.res.ColorStateList errorViewTextColor;
    private java.lang.CharSequence helperText;
    private boolean helperTextEnabled;
    private int helperTextTextAppearance;
    private android.widget.TextView helperTextView;
    private android.content.res.ColorStateList helperTextViewTextColor;
    private android.widget.LinearLayout indicatorArea;
    private int indicatorsAdded;
    private final com.google.android.material.textfield.TextInputLayout textInputView;
    private android.graphics.Typeface typeface;


    public IndicatorViewController(com.google.android.material.textfield.TextInputLayout r2) {
            r1 = this;
            r1.<init>()
            android.content.Context r0 = r2.getContext()
            r1.context = r0
            r1.textInputView = r2
            android.content.res.Resources r2 = r0.getResources()
            int r0 = com.google.android.material.C0479R.dimen.design_textinput_caption_translate_y
            int r2 = r2.getDimensionPixelSize(r0)
            float r2 = (float) r2
            r1.captionTranslationYPx = r2
            return
    }

    static /* synthetic */ int access$002(com.google.android.material.textfield.IndicatorViewController r0, int r1) {
            r0.captionDisplayed = r1
            return r1
    }

    static /* synthetic */ android.animation.Animator access$102(com.google.android.material.textfield.IndicatorViewController r0, android.animation.Animator r1) {
            r0.captionAnimator = r1
            return r1
    }

    static /* synthetic */ android.widget.TextView access$200(com.google.android.material.textfield.IndicatorViewController r0) {
            android.widget.TextView r0 = r0.errorView
            return r0
    }

    private boolean canAdjustIndicatorPadding() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.indicatorArea
            if (r0 == 0) goto Le
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputView
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void createCaptionAnimators(java.util.List<android.animation.Animator> r1, boolean r2, android.widget.TextView r3, int r4, int r5, int r6) {
            r0 = this;
            if (r3 == 0) goto L1e
            if (r2 != 0) goto L5
            goto L1e
        L5:
            if (r4 == r6) goto L9
            if (r4 != r5) goto L1e
        L9:
            if (r6 != r4) goto Ld
            r2 = 1
            goto Le
        Ld:
            r2 = 0
        Le:
            android.animation.ObjectAnimator r2 = r0.createCaptionOpacityAnimator(r3, r2)
            r1.add(r2)
            if (r6 != r4) goto L1e
            android.animation.ObjectAnimator r2 = r0.createCaptionTranslationYAnimator(r3)
            r1.add(r2)
        L1e:
            return
    }

    private android.animation.ObjectAnimator createCaptionOpacityAnimator(android.widget.TextView r4, boolean r5) {
            r3 = this;
            if (r5 == 0) goto L5
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L6
        L5:
            r5 = 0
        L6:
            android.util.Property r0 = android.view.View.ALPHA
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            r1[r2] = r5
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r4, r0, r1)
            r0 = 167(0xa7, double:8.25E-322)
            r4.setDuration(r0)
            android.animation.TimeInterpolator r5 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r4.setInterpolator(r5)
            return r4
    }

    private android.animation.ObjectAnimator createCaptionTranslationYAnimator(android.widget.TextView r5) {
            r4 = this;
            android.util.Property r0 = android.view.View.TRANSLATION_Y
            r1 = 2
            float[] r1 = new float[r1]
            float r2 = r4.captionTranslationYPx
            float r2 = -r2
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r3 = 0
            r1[r2] = r3
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofFloat(r5, r0, r1)
            r0 = 217(0xd9, double:1.07E-321)
            r5.setDuration(r0)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            r5.setInterpolator(r0)
            return r5
    }

    private android.widget.TextView getCaptionViewFromDisplayState(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto Lb
            r0 = 2
            if (r2 == r0) goto L8
            r2 = 0
            return r2
        L8:
            android.widget.TextView r2 = r1.helperTextView
            return r2
        Lb:
            android.widget.TextView r2 = r1.errorView
            return r2
    }

    private int getIndicatorPadding(boolean r1, int r2, int r3) {
            r0 = this;
            if (r1 == 0) goto Lc
            android.content.Context r1 = r0.context
            android.content.res.Resources r1 = r1.getResources()
            int r3 = r1.getDimensionPixelSize(r2)
        Lc:
            return r3
    }

    private boolean isCaptionStateError(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L10
            android.widget.TextView r2 = r1.errorView
            if (r2 == 0) goto L10
            java.lang.CharSequence r2 = r1.errorText
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L10
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private boolean isCaptionStateHelperText(int r2) {
            r1 = this;
            r0 = 2
            if (r2 != r0) goto L11
            android.widget.TextView r2 = r1.helperTextView
            if (r2 == 0) goto L11
            java.lang.CharSequence r2 = r1.helperText
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L11
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            return r2
    }

    private void setCaptionViewVisibilities(int r3, int r4) {
            r2 = this;
            if (r3 != r4) goto L3
            return
        L3:
            if (r4 == 0) goto L14
            android.widget.TextView r0 = r2.getCaptionViewFromDisplayState(r4)
            if (r0 == 0) goto L14
            r1 = 0
            r0.setVisibility(r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
        L14:
            if (r3 == 0) goto L27
            android.widget.TextView r0 = r2.getCaptionViewFromDisplayState(r3)
            if (r0 == 0) goto L27
            r1 = 4
            r0.setVisibility(r1)
            r1 = 1
            if (r3 != r1) goto L27
            r3 = 0
            r0.setText(r3)
        L27:
            r2.captionDisplayed = r4
            return
    }

    private void setTextViewTypeface(android.widget.TextView r1, android.graphics.Typeface r2) {
            r0 = this;
            if (r1 == 0) goto L5
            r1.setTypeface(r2)
        L5:
            return
    }

    private void setViewGroupGoneIfEmpty(android.view.ViewGroup r1, int r2) {
            r0 = this;
            if (r2 != 0) goto L7
            r2 = 8
            r1.setVisibility(r2)
        L7:
            return
    }

    private boolean shouldAnimateCaptionView(android.widget.TextView r3, java.lang.CharSequence r4) {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputView
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 == 0) goto L24
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputView
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L24
            int r0 = r2.captionToShow
            int r1 = r2.captionDisplayed
            if (r0 != r1) goto L22
            if (r3 == 0) goto L22
            java.lang.CharSequence r3 = r3.getText()
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L24
        L22:
            r3 = 1
            goto L25
        L24:
            r3 = 0
        L25:
            return r3
    }

    private void updateCaptionViewsVisibility(int r14, int r15, boolean r16) {
            r13 = this;
            r7 = r13
            r8 = r15
            r9 = r14
            r10 = r16
            if (r9 != r8) goto L8
            return
        L8:
            if (r10 == 0) goto L45
            android.animation.AnimatorSet r11 = new android.animation.AnimatorSet
            r11.<init>()
            r7.captionAnimator = r11
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            boolean r2 = r7.helperTextEnabled
            android.widget.TextView r3 = r7.helperTextView
            r4 = 2
            r0 = r13
            r1 = r12
            r5 = r14
            r6 = r15
            r0.createCaptionAnimators(r1, r2, r3, r4, r5, r6)
            boolean r2 = r7.errorEnabled
            android.widget.TextView r3 = r7.errorView
            r4 = 1
            r0.createCaptionAnimators(r1, r2, r3, r4, r5, r6)
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r11, r12)
            android.widget.TextView r3 = r13.getCaptionViewFromDisplayState(r14)
            android.widget.TextView r5 = r13.getCaptionViewFromDisplayState(r15)
            com.google.android.material.textfield.IndicatorViewController$1 r6 = new com.google.android.material.textfield.IndicatorViewController$1
            r0 = r6
            r1 = r13
            r2 = r15
            r4 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r11.addListener(r6)
            r11.start()
            goto L48
        L45:
            r13.setCaptionViewVisibilities(r14, r15)
        L48:
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateLabelState(r10)
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            r0.updateTextInputBoxState()
            return
    }

    void addIndicator(android.widget.TextView r6, int r7) {
            r5 = this;
            android.widget.LinearLayout r0 = r5.indicatorArea
            r1 = 0
            r2 = -2
            if (r0 != 0) goto L40
            android.widget.FrameLayout r0 = r5.captionArea
            if (r0 != 0) goto L40
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r3 = r5.context
            r0.<init>(r3)
            r5.indicatorArea = r0
            r0.setOrientation(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            android.widget.LinearLayout r3 = r5.indicatorArea
            r4 = -1
            r0.addView(r3, r4, r2)
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            android.content.Context r3 = r5.context
            r0.<init>(r3)
            r5.captionArea = r0
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r3 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r2, r3)
            android.widget.LinearLayout r3 = r5.indicatorArea
            android.widget.FrameLayout r4 = r5.captionArea
            r3.addView(r4, r0)
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputView
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L40
            r5.adjustIndicatorPadding()
        L40:
            boolean r7 = r5.isCaptionView(r7)
            if (r7 == 0) goto L51
            android.widget.FrameLayout r7 = r5.captionArea
            r7.setVisibility(r1)
            android.widget.FrameLayout r7 = r5.captionArea
            r7.addView(r6)
            goto L5b
        L51:
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            r7.<init>(r2, r2)
            android.widget.LinearLayout r0 = r5.indicatorArea
            r0.addView(r6, r7)
        L5b:
            android.widget.LinearLayout r6 = r5.indicatorArea
            r6.setVisibility(r1)
            int r6 = r5.indicatorsAdded
            int r6 = r6 + 1
            r5.indicatorsAdded = r6
            return
    }

    void adjustIndicatorPadding() {
            r7 = this;
            boolean r0 = r7.canAdjustIndicatorPadding()
            if (r0 == 0) goto L3e
            com.google.android.material.textfield.TextInputLayout r0 = r7.textInputView
            android.widget.EditText r0 = r0.getEditText()
            android.content.Context r1 = r7.context
            boolean r1 = com.google.android.material.resources.MaterialResources.isFontScaleAtLeast1_3(r1)
            android.widget.LinearLayout r2 = r7.indicatorArea
            int r3 = com.google.android.material.C0479R.dimen.material_helper_text_font_1_3_padding_horizontal
            int r4 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            int r3 = r7.getIndicatorPadding(r1, r3, r4)
            int r4 = com.google.android.material.C0479R.dimen.material_helper_text_font_1_3_padding_top
            android.content.Context r5 = r7.context
            android.content.res.Resources r5 = r5.getResources()
            int r6 = com.google.android.material.C0479R.dimen.material_helper_text_default_padding_top
            int r5 = r5.getDimensionPixelSize(r6)
            int r4 = r7.getIndicatorPadding(r1, r4, r5)
            int r5 = com.google.android.material.C0479R.dimen.material_helper_text_font_1_3_padding_horizontal
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            int r0 = r7.getIndicatorPadding(r1, r5, r0)
            r1 = 0
            androidx.core.view.ViewCompat.setPaddingRelative(r2, r3, r4, r0, r1)
        L3e:
            return
    }

    void cancelCaptionAnimator() {
            r1 = this;
            android.animation.Animator r0 = r1.captionAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            return
    }

    boolean errorIsDisplayed() {
            r1 = this;
            int r0 = r1.captionDisplayed
            boolean r0 = r1.isCaptionStateError(r0)
            return r0
    }

    boolean errorShouldBeShown() {
            r1 = this;
            int r0 = r1.captionToShow
            boolean r0 = r1.isCaptionStateError(r0)
            return r0
    }

    java.lang.CharSequence getErrorContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorViewContentDescription
            return r0
    }

    java.lang.CharSequence getErrorText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.errorText
            return r0
    }

    int getErrorViewCurrentTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentTextColor()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    android.content.res.ColorStateList getErrorViewTextColors() {
            r1 = this;
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    java.lang.CharSequence getHelperText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.helperText
            return r0
    }

    android.content.res.ColorStateList getHelperTextViewColors() {
            r1 = this;
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto L9
            android.content.res.ColorStateList r0 = r0.getTextColors()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    int getHelperTextViewCurrentTextColor() {
            r1 = this;
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto L9
            int r0 = r0.getCurrentTextColor()
            goto La
        L9:
            r0 = -1
        La:
            return r0
    }

    boolean helperTextIsDisplayed() {
            r1 = this;
            int r0 = r1.captionDisplayed
            boolean r0 = r1.isCaptionStateHelperText(r0)
            return r0
    }

    boolean helperTextShouldBeShown() {
            r1 = this;
            int r0 = r1.captionToShow
            boolean r0 = r1.isCaptionStateHelperText(r0)
            return r0
    }

    void hideError() {
            r4 = this;
            r0 = 0
            r4.errorText = r0
            r4.cancelCaptionAnimator()
            int r1 = r4.captionDisplayed
            r2 = 1
            if (r1 != r2) goto L1e
            boolean r1 = r4.helperTextEnabled
            if (r1 == 0) goto L1b
            java.lang.CharSequence r1 = r4.helperText
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1b
            r1 = 2
            r4.captionToShow = r1
            goto L1e
        L1b:
            r1 = 0
            r4.captionToShow = r1
        L1e:
            int r1 = r4.captionDisplayed
            int r2 = r4.captionToShow
            android.widget.TextView r3 = r4.errorView
            boolean r0 = r4.shouldAnimateCaptionView(r3, r0)
            r4.updateCaptionViewsVisibility(r1, r2, r0)
            return
    }

    void hideHelperText() {
            r4 = this;
            r4.cancelCaptionAnimator()
            int r0 = r4.captionDisplayed
            r1 = 2
            if (r0 != r1) goto Lb
            r1 = 0
            r4.captionToShow = r1
        Lb:
            int r1 = r4.captionToShow
            android.widget.TextView r2 = r4.helperTextView
            r3 = 0
            boolean r2 = r4.shouldAnimateCaptionView(r2, r3)
            r4.updateCaptionViewsVisibility(r0, r1, r2)
            return
    }

    boolean isCaptionView(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L7
            if (r2 != r0) goto L6
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    boolean isErrorEnabled() {
            r1 = this;
            boolean r0 = r1.errorEnabled
            return r0
    }

    boolean isHelperTextEnabled() {
            r1 = this;
            boolean r0 = r1.helperTextEnabled
            return r0
    }

    void removeIndicator(android.widget.TextView r2, int r3) {
            r1 = this;
            android.widget.LinearLayout r0 = r1.indicatorArea
            if (r0 != 0) goto L5
            return
        L5:
            boolean r3 = r1.isCaptionView(r3)
            if (r3 == 0) goto L13
            android.widget.FrameLayout r3 = r1.captionArea
            if (r3 == 0) goto L13
            r3.removeView(r2)
            goto L18
        L13:
            android.widget.LinearLayout r3 = r1.indicatorArea
            r3.removeView(r2)
        L18:
            int r2 = r1.indicatorsAdded
            int r2 = r2 + (-1)
            r1.indicatorsAdded = r2
            android.widget.LinearLayout r3 = r1.indicatorArea
            r1.setViewGroupGoneIfEmpty(r3, r2)
            return
    }

    void setErrorContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.errorViewContentDescription = r2
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto L9
            r0.setContentDescription(r2)
        L9:
            return
    }

    void setErrorEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.errorEnabled
            if (r0 != r4) goto L5
            return
        L5:
            r3.cancelCaptionAnimator()
            r0 = 0
            if (r4 == 0) goto L49
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r3.context
            r1.<init>(r2)
            r3.errorView = r1
            int r2 = com.google.android.material.C0479R.id.textinput_error
            r1.setId(r2)
            android.widget.TextView r1 = r3.errorView
            r2 = 5
            r1.setTextAlignment(r2)
            android.graphics.Typeface r1 = r3.typeface
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.errorView
            r2.setTypeface(r1)
        L28:
            int r1 = r3.errorTextAppearance
            r3.setErrorTextAppearance(r1)
            android.content.res.ColorStateList r1 = r3.errorViewTextColor
            r3.setErrorViewTextColor(r1)
            java.lang.CharSequence r1 = r3.errorViewContentDescription
            r3.setErrorContentDescription(r1)
            android.widget.TextView r1 = r3.errorView
            r2 = 4
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.errorView
            r2 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r1, r2)
            android.widget.TextView r1 = r3.errorView
            r3.addIndicator(r1, r0)
            goto L5e
        L49:
            r3.hideError()
            android.widget.TextView r1 = r3.errorView
            r3.removeIndicator(r1, r0)
            r0 = 0
            r3.errorView = r0
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputView
            r0.updateTextInputBoxState()
        L5e:
            r3.errorEnabled = r4
            return
    }

    void setErrorTextAppearance(int r3) {
            r2 = this;
            r2.errorTextAppearance = r3
            android.widget.TextView r0 = r2.errorView
            if (r0 == 0) goto Lb
            com.google.android.material.textfield.TextInputLayout r1 = r2.textInputView
            r1.setTextAppearanceCompatWithErrorFallback(r0, r3)
        Lb:
            return
    }

    void setErrorViewTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.errorViewTextColor = r2
            android.widget.TextView r0 = r1.errorView
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r0.setTextColor(r2)
        Lb:
            return
    }

    void setHelperTextAppearance(int r2) {
            r1 = this;
            r1.helperTextTextAppearance = r2
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto L9
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
        L9:
            return
    }

    void setHelperTextEnabled(boolean r4) {
            r3 = this;
            boolean r0 = r3.helperTextEnabled
            if (r0 != r4) goto L5
            return
        L5:
            r3.cancelCaptionAnimator()
            r0 = 1
            if (r4 == 0) goto L43
            androidx.appcompat.widget.AppCompatTextView r1 = new androidx.appcompat.widget.AppCompatTextView
            android.content.Context r2 = r3.context
            r1.<init>(r2)
            r3.helperTextView = r1
            int r2 = com.google.android.material.C0479R.id.textinput_helper_text
            r1.setId(r2)
            android.widget.TextView r1 = r3.helperTextView
            r2 = 5
            r1.setTextAlignment(r2)
            android.graphics.Typeface r1 = r3.typeface
            if (r1 == 0) goto L28
            android.widget.TextView r2 = r3.helperTextView
            r2.setTypeface(r1)
        L28:
            android.widget.TextView r1 = r3.helperTextView
            r2 = 4
            r1.setVisibility(r2)
            android.widget.TextView r1 = r3.helperTextView
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r1, r0)
            int r1 = r3.helperTextTextAppearance
            r3.setHelperTextAppearance(r1)
            android.content.res.ColorStateList r1 = r3.helperTextViewTextColor
            r3.setHelperTextViewTextColor(r1)
            android.widget.TextView r1 = r3.helperTextView
            r3.addIndicator(r1, r0)
            goto L58
        L43:
            r3.hideHelperText()
            android.widget.TextView r1 = r3.helperTextView
            r3.removeIndicator(r1, r0)
            r0 = 0
            r3.helperTextView = r0
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputView
            r0.updateEditTextBackground()
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputView
            r0.updateTextInputBoxState()
        L58:
            r3.helperTextEnabled = r4
            return
    }

    void setHelperTextViewTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.helperTextViewTextColor = r2
            android.widget.TextView r0 = r1.helperTextView
            if (r0 == 0) goto Lb
            if (r2 == 0) goto Lb
            r0.setTextColor(r2)
        Lb:
            return
    }

    void setTypefaces(android.graphics.Typeface r2) {
            r1 = this;
            android.graphics.Typeface r0 = r1.typeface
            if (r2 == r0) goto L10
            r1.typeface = r2
            android.widget.TextView r0 = r1.errorView
            r1.setTextViewTypeface(r0, r2)
            android.widget.TextView r0 = r1.helperTextView
            r1.setTextViewTypeface(r0, r2)
        L10:
            return
    }

    void showError(java.lang.CharSequence r4) {
            r3 = this;
            r3.cancelCaptionAnimator()
            r3.errorText = r4
            android.widget.TextView r0 = r3.errorView
            r0.setText(r4)
            int r0 = r3.captionDisplayed
            r1 = 1
            if (r0 == r1) goto L11
            r3.captionToShow = r1
        L11:
            int r1 = r3.captionToShow
            android.widget.TextView r2 = r3.errorView
            boolean r4 = r3.shouldAnimateCaptionView(r2, r4)
            r3.updateCaptionViewsVisibility(r0, r1, r4)
            return
    }

    void showHelper(java.lang.CharSequence r4) {
            r3 = this;
            r3.cancelCaptionAnimator()
            r3.helperText = r4
            android.widget.TextView r0 = r3.helperTextView
            r0.setText(r4)
            int r0 = r3.captionDisplayed
            r1 = 2
            if (r0 == r1) goto L11
            r3.captionToShow = r1
        L11:
            int r1 = r3.captionToShow
            android.widget.TextView r2 = r3.helperTextView
            boolean r4 = r3.shouldAnimateCaptionView(r2, r4)
            r3.updateCaptionViewsVisibility(r0, r1, r4)
            return
    }
}
