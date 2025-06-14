package com.google.android.material.textfield;

/* loaded from: classes.dex */
public class MaterialAutoCompleteTextView extends androidx.appcompat.widget.AppCompatAutoCompleteTextView {
    private static final int MAX_ITEMS_MEASURED = 15;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private final androidx.appcompat.widget.ListPopupWindow modalListPopup;
    private final android.graphics.Rect tempRect;


    public MaterialAutoCompleteTextView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.autoCompleteTextViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialAutoCompleteTextView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            r0 = 0
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r0)
            r7.<init>(r8, r9, r10)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.tempRect = r8
            android.content.Context r8 = r7.getContext()
            int[] r3 = com.google.android.material.C0479R.styleable.MaterialAutoCompleteTextView
            int r5 = com.google.android.material.C0479R.style.Widget_AppCompat_AutoCompleteTextView
            int[] r6 = new int[r0]
            r1 = r8
            r2 = r9
            r4 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r10 = com.google.android.material.C0479R.styleable.MaterialAutoCompleteTextView_android_inputType
            boolean r10 = r9.hasValue(r10)
            if (r10 == 0) goto L34
            int r10 = com.google.android.material.C0479R.styleable.MaterialAutoCompleteTextView_android_inputType
            int r10 = r9.getInt(r10, r0)
            if (r10 != 0) goto L34
            r10 = 0
            r7.setKeyListener(r10)
        L34:
            java.lang.String r10 = "accessibility"
            java.lang.Object r10 = r8.getSystemService(r10)
            android.view.accessibility.AccessibilityManager r10 = (android.view.accessibility.AccessibilityManager) r10
            r7.accessibilityManager = r10
            androidx.appcompat.widget.ListPopupWindow r10 = new androidx.appcompat.widget.ListPopupWindow
            r10.<init>(r8)
            r7.modalListPopup = r10
            r8 = 1
            r10.setModal(r8)
            r10.setAnchorView(r7)
            r8 = 2
            r10.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r10.setAdapter(r8)
            com.google.android.material.textfield.MaterialAutoCompleteTextView$1 r8 = new com.google.android.material.textfield.MaterialAutoCompleteTextView$1
            r8.<init>(r7)
            r10.setOnItemClickListener(r8)
            r9.recycle()
            return
    }

    static /* synthetic */ androidx.appcompat.widget.ListPopupWindow access$000(com.google.android.material.textfield.MaterialAutoCompleteTextView r0) {
            androidx.appcompat.widget.ListPopupWindow r0 = r0.modalListPopup
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.textfield.MaterialAutoCompleteTextView r0, java.lang.Object r1) {
            r0.updateText(r1)
            return
    }

    private com.google.android.material.textfield.TextInputLayout findTextInputLayoutAncestor() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            if (r0 == 0) goto L12
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Ld
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Ld:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L12:
            r0 = 0
            return r0
    }

    private int measureContentWidth() {
            r12 = this;
            android.widget.ListAdapter r0 = r12.getAdapter()
            com.google.android.material.textfield.TextInputLayout r1 = r12.findTextInputLayoutAncestor()
            r2 = 0
            if (r0 == 0) goto L89
            if (r1 != 0) goto Lf
            goto L89
        Lf:
            int r3 = r12.getMeasuredWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
            int r4 = r12.getMeasuredHeight()
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            androidx.appcompat.widget.ListPopupWindow r5 = r12.modalListPopup
            int r5 = r5.getSelectedItemPosition()
            int r5 = java.lang.Math.max(r2, r5)
            int r6 = r0.getCount()
            int r5 = r5 + 15
            int r5 = java.lang.Math.min(r6, r5)
            int r6 = r5 + (-15)
            int r6 = java.lang.Math.max(r2, r6)
            r7 = 0
            r8 = r6
            r9 = r7
            r6 = r2
        L3d:
            if (r8 >= r5) goto L68
            int r10 = r0.getItemViewType(r8)
            if (r10 == r2) goto L47
            r9 = r7
            r2 = r10
        L47:
            android.view.View r9 = r0.getView(r8, r9, r1)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            if (r10 != 0) goto L5a
            android.view.ViewGroup$LayoutParams r10 = new android.view.ViewGroup$LayoutParams
            r11 = -2
            r10.<init>(r11, r11)
            r9.setLayoutParams(r10)
        L5a:
            r9.measure(r3, r4)
            int r10 = r9.getMeasuredWidth()
            int r6 = java.lang.Math.max(r6, r10)
            int r8 = r8 + 1
            goto L3d
        L68:
            androidx.appcompat.widget.ListPopupWindow r0 = r12.modalListPopup
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 == 0) goto L7f
            android.graphics.Rect r2 = r12.tempRect
            r0.getPadding(r2)
            android.graphics.Rect r0 = r12.tempRect
            int r0 = r0.left
            android.graphics.Rect r2 = r12.tempRect
            int r2 = r2.right
            int r0 = r0 + r2
            int r6 = r6 + r0
        L7f:
            com.google.android.material.internal.CheckableImageButton r0 = r1.getEndIconView()
            int r0 = r0.getMeasuredWidth()
            int r6 = r6 + r0
            return r6
        L89:
            return r2
    }

    private <T extends android.widget.ListAdapter & android.widget.Filterable> void updateText(java.lang.Object r2) {
            r1 = this;
            java.lang.CharSequence r2 = r1.convertSelectionToString(r2)
            r0 = 0
            r1.setText(r2, r0)
            return
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.findTextInputLayoutAncestor()
            if (r0 == 0) goto L11
            boolean r1 = r0.isProvidingHint()
            if (r1 == 0) goto L11
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        L11:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r1.findTextInputLayoutAncestor()
            if (r0 == 0) goto L20
            boolean r0 = r0.isProvidingHint()
            if (r0 == 0) goto L20
            java.lang.CharSequence r0 = super.getHint()
            if (r0 != 0) goto L20
            boolean r0 = com.google.android.material.internal.ManufacturerUtils.isMeizuDevice()
            if (r0 == 0) goto L20
            java.lang.String r0 = ""
            r1.setHint(r0)
        L20:
            return
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            int r3 = android.view.View.MeasureSpec.getMode(r2)
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r0) goto L26
            int r3 = r1.getMeasuredWidth()
            int r0 = r1.measureContentWidth()
            int r3 = java.lang.Math.max(r3, r0)
            int r2 = android.view.View.MeasureSpec.getSize(r2)
            int r2 = java.lang.Math.min(r3, r2)
            int r3 = r1.getMeasuredHeight()
            r1.setMeasuredDimension(r2, r3)
        L26:
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends android.widget.ListAdapter & android.widget.Filterable> void setAdapter(T r2) {
            r1 = this;
            super.setAdapter(r2)
            androidx.appcompat.widget.ListPopupWindow r2 = r1.modalListPopup
            android.widget.ListAdapter r0 = r1.getAdapter()
            r2.setAdapter(r0)
            return
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
            r1 = this;
            android.view.accessibility.AccessibilityManager r0 = r1.accessibilityManager
            if (r0 == 0) goto L10
            boolean r0 = r0.isTouchExplorationEnabled()
            if (r0 == 0) goto L10
            androidx.appcompat.widget.ListPopupWindow r0 = r1.modalListPopup
            r0.show()
            goto L13
        L10:
            super.showDropDown()
        L13:
            return
    }
}
