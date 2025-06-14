package com.google.android.material.textfield;

/* loaded from: classes.dex */
class DropdownMenuEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private static final int ANIMATION_FADE_IN_DURATION = 67;
    private static final int ANIMATION_FADE_OUT_DURATION = 50;
    private static final boolean IS_LOLLIPOP = false;
    private final com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate accessibilityDelegate;
    private android.view.accessibility.AccessibilityManager accessibilityManager;
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener dropdownMenuOnEditTextAttachedListener;
    private long dropdownPopupActivatedAt;
    private boolean dropdownPopupDirty;
    private final com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener endIconChangedListener;
    private final android.text.TextWatcher exposedDropdownEndIconTextWatcher;
    private android.animation.ValueAnimator fadeInAnim;
    private android.animation.ValueAnimator fadeOutAnim;
    private android.graphics.drawable.StateListDrawable filledPopupBackground;
    private boolean isEndIconChecked;
    private final android.view.View.OnFocusChangeListener onFocusChangeListener;
    private com.google.android.material.shape.MaterialShapeDrawable outlinedPopupBackground;











    static {
            r0 = 1
            com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP = r0
            return
    }

    DropdownMenuEndIconDelegate(com.google.android.material.textfield.TextInputLayout r3) {
            r2 = this;
            r2.<init>(r3)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$1 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$1
            r3.<init>(r2)
            r2.exposedDropdownEndIconTextWatcher = r3
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$2 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$2
            r3.<init>(r2)
            r2.onFocusChangeListener = r3
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$3 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$3
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r3.<init>(r2, r0)
            r2.accessibilityDelegate = r3
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$4 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$4
            r3.<init>(r2)
            r2.dropdownMenuOnEditTextAttachedListener = r3
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$5 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$5
            r3.<init>(r2)
            r2.endIconChangedListener = r3
            r3 = 0
            r2.dropdownPopupDirty = r3
            r2.isEndIconChecked = r3
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r2.dropdownPopupActivatedAt = r0
            return
    }

    static /* synthetic */ android.widget.AutoCompleteTextView access$000(android.widget.EditText r0) {
            android.widget.AutoCompleteTextView r0 = castAutoCompleteTextViewOrThrow(r0)
            return r0
    }

    static /* synthetic */ android.view.accessibility.AccessibilityManager access$100(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.view.accessibility.AccessibilityManager r0 = r0.accessibilityManager
            return r0
    }

    static /* synthetic */ com.google.android.material.textfield.TextInputLayout.AccessibilityDelegate access$1000(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            com.google.android.material.textfield.TextInputLayout$AccessibilityDelegate r0 = r0.accessibilityDelegate
            return r0
    }

    static /* synthetic */ android.view.View.OnFocusChangeListener access$1100(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.view.View$OnFocusChangeListener r0 = r0.onFocusChangeListener
            return r0
    }

    static /* synthetic */ boolean access$1200() {
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            return r0
    }

    static /* synthetic */ boolean access$1300(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            boolean r0 = r0.isDropdownPopupActive()
            return r0
    }

    static /* synthetic */ long access$1402(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, long r1) {
            r0.dropdownPopupActivatedAt = r1
            return r1
    }

    static /* synthetic */ boolean access$1500(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            boolean r0 = r0.isEndIconChecked
            return r0
    }

    static /* synthetic */ android.animation.ValueAnimator access$1600(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.animation.ValueAnimator r0 = r0.fadeInAnim
            return r0
    }

    static /* synthetic */ boolean access$200(android.widget.EditText r0) {
            boolean r0 = isEditable(r0)
            return r0
    }

    static /* synthetic */ void access$300(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, boolean r1) {
            r0.setEndIconChecked(r1)
            return
    }

    static /* synthetic */ boolean access$402(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, boolean r1) {
            r0.dropdownPopupDirty = r1
            return r1
    }

    static /* synthetic */ void access$500(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.widget.AutoCompleteTextView r1) {
            r0.showHideDropdown(r1)
            return
    }

    static /* synthetic */ void access$600(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.widget.AutoCompleteTextView r1) {
            r0.setPopupBackground(r1)
            return
    }

    static /* synthetic */ void access$700(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.widget.AutoCompleteTextView r1) {
            r0.addRippleEffect(r1)
            return
    }

    static /* synthetic */ void access$800(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0, android.widget.AutoCompleteTextView r1) {
            r0.setUpDropdownShowHideBehavior(r1)
            return
    }

    static /* synthetic */ android.text.TextWatcher access$900(com.google.android.material.textfield.DropdownMenuEndIconDelegate r0) {
            android.text.TextWatcher r0 = r0.exposedDropdownEndIconTextWatcher
            return r0
    }

    private void addRippleEffect(android.widget.AutoCompleteTextView r10) {
            r9 = this;
            boolean r0 = isEditable(r10)
            if (r0 == 0) goto L7
            return
        L7:
            com.google.android.material.textfield.TextInputLayout r0 = r9.textInputLayout
            int r0 = r0.getBoxBackgroundMode()
            com.google.android.material.textfield.TextInputLayout r1 = r9.textInputLayout
            com.google.android.material.shape.MaterialShapeDrawable r1 = r1.getBoxBackground()
            int r2 = com.google.android.material.C0479R.attr.colorControlHighlight
            int r2 = com.google.android.material.color.MaterialColors.getColor(r10, r2)
            r3 = 2
            int[][] r4 = new int[r3][]
            r5 = 1
            int[] r6 = new int[r5]
            r7 = 16842919(0x10100a7, float:2.3694026E-38)
            r8 = 0
            r6[r8] = r7
            r4[r8] = r6
            int[] r6 = new int[r8]
            r4[r5] = r6
            if (r0 != r3) goto L31
            r9.addRippleEffectOnOutlinedLayout(r10, r2, r4, r1)
            goto L36
        L31:
            if (r0 != r5) goto L36
            r9.addRippleEffectOnFilledLayout(r10, r2, r4, r1)
        L36:
            return
    }

    private void addRippleEffectOnFilledLayout(android.widget.AutoCompleteTextView r6, int r7, int[][] r8, com.google.android.material.shape.MaterialShapeDrawable r9) {
            r5 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r5.textInputLayout
            int r0 = r0.getBoxBackgroundColor()
            r1 = 1036831949(0x3dcccccd, float:0.1)
            int r7 = com.google.android.material.color.MaterialColors.layer(r7, r0, r1)
            r1 = 2
            int[] r2 = new int[r1]
            r3 = 0
            r2[r3] = r7
            r7 = 1
            r2[r7] = r0
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r7 = new android.content.res.ColorStateList
            r7.<init>(r8, r2)
            android.graphics.drawable.RippleDrawable r8 = new android.graphics.drawable.RippleDrawable
            r8.<init>(r7, r9, r9)
            androidx.core.view.ViewCompat.setBackground(r6, r8)
            goto L5a
        L28:
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r4 = r9.getShapeAppearanceModel()
            r0.<init>(r4)
            android.content.res.ColorStateList r4 = new android.content.res.ColorStateList
            r4.<init>(r8, r2)
            r0.setFillColor(r4)
            android.graphics.drawable.Drawable[] r8 = new android.graphics.drawable.Drawable[r1]
            r8[r3] = r9
            r8[r7] = r0
            android.graphics.drawable.LayerDrawable r7 = new android.graphics.drawable.LayerDrawable
            r7.<init>(r8)
            int r8 = androidx.core.view.ViewCompat.getPaddingStart(r6)
            int r9 = r6.getPaddingTop()
            int r0 = androidx.core.view.ViewCompat.getPaddingEnd(r6)
            int r1 = r6.getPaddingBottom()
            androidx.core.view.ViewCompat.setBackground(r6, r7)
            androidx.core.view.ViewCompat.setPaddingRelative(r6, r8, r9, r0, r1)
        L5a:
            return
    }

    private void addRippleEffectOnOutlinedLayout(android.widget.AutoCompleteTextView r8, int r9, int[][] r10, com.google.android.material.shape.MaterialShapeDrawable r11) {
            r7 = this;
            int r0 = com.google.android.material.C0479R.attr.colorSurface
            int r0 = com.google.android.material.color.MaterialColors.getColor(r8, r0)
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r2 = r11.getShapeAppearanceModel()
            r1.<init>(r2)
            r2 = 1036831949(0x3dcccccd, float:0.1)
            int r9 = com.google.android.material.color.MaterialColors.layer(r9, r0, r2)
            r2 = 2
            int[] r3 = new int[r2]
            r4 = 0
            r3[r4] = r9
            r5 = 1
            r3[r5] = r4
            android.content.res.ColorStateList r6 = new android.content.res.ColorStateList
            r6.<init>(r10, r3)
            r1.setFillColor(r6)
            boolean r3 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r3 == 0) goto L57
            r1.setTint(r0)
            int[] r3 = new int[r2]
            r3[r4] = r9
            r3[r5] = r0
            android.content.res.ColorStateList r9 = new android.content.res.ColorStateList
            r9.<init>(r10, r3)
            com.google.android.material.shape.MaterialShapeDrawable r10 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r11.getShapeAppearanceModel()
            r10.<init>(r0)
            r0 = -1
            r10.setTint(r0)
            android.graphics.drawable.RippleDrawable r0 = new android.graphics.drawable.RippleDrawable
            r0.<init>(r9, r1, r10)
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r2]
            r9[r4] = r0
            r9[r5] = r11
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            r10.<init>(r9)
            goto L62
        L57:
            android.graphics.drawable.Drawable[] r9 = new android.graphics.drawable.Drawable[r2]
            r9[r4] = r1
            r9[r5] = r11
            android.graphics.drawable.LayerDrawable r10 = new android.graphics.drawable.LayerDrawable
            r10.<init>(r9)
        L62:
            androidx.core.view.ViewCompat.setBackground(r8, r10)
            return
    }

    private static android.widget.AutoCompleteTextView castAutoCompleteTextViewOrThrow(android.widget.EditText r1) {
            boolean r0 = r1 instanceof android.widget.AutoCompleteTextView
            if (r0 == 0) goto L7
            android.widget.AutoCompleteTextView r1 = (android.widget.AutoCompleteTextView) r1
            return r1
        L7:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used."
            r1.<init>(r0)
            throw r1
    }

    private android.animation.ValueAnimator getAlphaAnimator(int r3, float... r4) {
            r2 = this;
            android.animation.ValueAnimator r4 = android.animation.ValueAnimator.ofFloat(r4)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r4.setInterpolator(r0)
            long r0 = (long) r3
            r4.setDuration(r0)
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$10 r3 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$10
            r3.<init>(r2)
            r4.addUpdateListener(r3)
            return r4
    }

    private com.google.android.material.shape.MaterialShapeDrawable getPopUpMaterialShapeDrawable(float r2, float r3, float r4, int r5) {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r0.setTopLeftCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r0.setTopRightCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setBottomLeftCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r2.setBottomRightCornerSize(r3)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            android.content.Context r3 = r1.context
            com.google.android.material.shape.MaterialShapeDrawable r3 = com.google.android.material.shape.MaterialShapeDrawable.createWithElevationOverlay(r3, r4)
            r3.setShapeAppearanceModel(r2)
            r2 = 0
            r3.setPadding(r2, r5, r2, r5)
            return r3
    }

    private void initAnimators() {
            r3 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0024: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            r2 = 67
            android.animation.ValueAnimator r1 = r3.getAlphaAnimator(r2, r1)
            r3.fadeInAnim = r1
            float[] r0 = new float[r0]
            r0 = {x002c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            r1 = 50
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r1, r0)
            r3.fadeOutAnim = r0
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$9 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$9
            r1.<init>(r3)
            r0.addListener(r1)
            return
    }

    private boolean isDropdownPopupActive() {
            r4 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r4.dropdownPopupActivatedAt
            long r0 = r0 - r2
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 < 0) goto L16
            r2 = 300(0x12c, double:1.48E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L16
        L14:
            r0 = 0
            goto L17
        L16:
            r0 = 1
        L17:
            return r0
    }

    private static boolean isEditable(android.widget.EditText r0) {
            android.text.method.KeyListener r0 = r0.getKeyListener()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    private void setEndIconChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.isEndIconChecked
            if (r0 == r2) goto L10
            r1.isEndIconChecked = r2
            android.animation.ValueAnimator r2 = r1.fadeInAnim
            r2.cancel()
            android.animation.ValueAnimator r2 = r1.fadeOutAnim
            r2.start()
        L10:
            return
    }

    private void setPopupBackground(android.widget.AutoCompleteTextView r3) {
            r2 = this;
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L1b
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            int r0 = r0.getBoxBackgroundMode()
            r1 = 2
            if (r0 != r1) goto L13
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.outlinedPopupBackground
            r3.setDropDownBackgroundDrawable(r0)
            goto L1b
        L13:
            r1 = 1
            if (r0 != r1) goto L1b
            android.graphics.drawable.StateListDrawable r0 = r2.filledPopupBackground
            r3.setDropDownBackgroundDrawable(r0)
        L1b:
            return
    }

    private void setUpDropdownShowHideBehavior(android.widget.AutoCompleteTextView r2) {
            r1 = this;
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$7 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$7
            r0.<init>(r1, r2)
            r2.setOnTouchListener(r0)
            android.view.View$OnFocusChangeListener r0 = r1.onFocusChangeListener
            r2.setOnFocusChangeListener(r0)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L19
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$8 r0 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$8
            r0.<init>(r1)
            r2.setOnDismissListener(r0)
        L19:
            return
    }

    private void showHideDropdown(android.widget.AutoCompleteTextView r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            boolean r0 = r2.isDropdownPopupActive()
            r1 = 0
            if (r0 == 0) goto Lc
            r2.dropdownPopupDirty = r1
        Lc:
            boolean r0 = r2.dropdownPopupDirty
            if (r0 != 0) goto L36
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L1c
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.setEndIconChecked(r0)
            goto L27
        L1c:
            boolean r0 = r2.isEndIconChecked
            r0 = r0 ^ 1
            r2.isEndIconChecked = r0
            com.google.android.material.internal.CheckableImageButton r0 = r2.endIconView
            r0.toggle()
        L27:
            boolean r0 = r2.isEndIconChecked
            if (r0 == 0) goto L32
            r3.requestFocus()
            r3.showDropDown()
            goto L38
        L32:
            r3.dismissDropDown()
            goto L38
        L36:
            r2.dropdownPopupDirty = r1
        L38:
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
            r6 = this;
            android.content.Context r0 = r6.context
            android.content.res.Resources r0 = r0.getResources()
            int r1 = com.google.android.material.C0479R.dimen.mtrl_shape_corner_size_small_component
            int r0 = r0.getDimensionPixelOffset(r1)
            float r0 = (float) r0
            android.content.Context r1 = r6.context
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.material.C0479R.dimen.mtrl_exposed_dropdown_menu_popup_elevation
            int r1 = r1.getDimensionPixelOffset(r2)
            float r1 = (float) r1
            android.content.Context r2 = r6.context
            android.content.res.Resources r2 = r2.getResources()
            int r3 = com.google.android.material.C0479R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding
            int r2 = r2.getDimensionPixelOffset(r3)
            com.google.android.material.shape.MaterialShapeDrawable r3 = r6.getPopUpMaterialShapeDrawable(r0, r0, r1, r2)
            r4 = 0
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.getPopUpMaterialShapeDrawable(r4, r0, r1, r2)
            r6.outlinedPopupBackground = r3
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            r6.filledPopupBackground = r1
            r2 = 1
            int[] r2 = new int[r2]
            r4 = 16842922(0x10100aa, float:2.3694034E-38)
            r5 = 0
            r2[r5] = r4
            r1.addState(r2, r3)
            android.graphics.drawable.StateListDrawable r1 = r6.filledPopupBackground
            int[] r2 = new int[r5]
            r1.addState(r2, r0)
            boolean r0 = com.google.android.material.textfield.DropdownMenuEndIconDelegate.IS_LOLLIPOP
            if (r0 == 0) goto L52
            int r0 = com.google.android.material.C0479R.drawable.mtrl_dropdown_arrow
            goto L54
        L52:
            int r0 = com.google.android.material.C0479R.drawable.mtrl_ic_arrow_drop_down
        L54:
            com.google.android.material.textfield.TextInputLayout r1 = r6.textInputLayout
            android.content.Context r2 = r6.context
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r2, r0)
            r1.setEndIconDrawable(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r6.textInputLayout
            com.google.android.material.textfield.TextInputLayout r1 = r6.textInputLayout
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.material.C0479R.string.exposed_dropdown_menu_content_description
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.textInputLayout
            com.google.android.material.textfield.DropdownMenuEndIconDelegate$6 r1 = new com.google.android.material.textfield.DropdownMenuEndIconDelegate$6
            r1.<init>(r6)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener r1 = r6.dropdownMenuOnEditTextAttachedListener
            r0.addOnEditTextAttachedListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r6.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = r6.endIconChangedListener
            r0.addOnEndIconChangedListener(r1)
            r6.initAnimators()
            android.content.Context r0 = r6.context
            java.lang.String r1 = "accessibility"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r6.accessibilityManager = r0
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            if (r1 == 0) goto L4
            r1 = 1
            goto L5
        L4:
            r1 = 0
        L5:
            return r1
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    boolean shouldTintIconOnError() {
            r1 = this;
            r0 = 1
            return r0
    }
}
