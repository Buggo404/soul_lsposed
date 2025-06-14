package com.google.android.material.textfield;

/* loaded from: classes.dex */
public class TextInputEditText extends androidx.appcompat.widget.AppCompatEditText {
    private final android.graphics.Rect parentRect;
    private boolean textInputLayoutFocusedRectEnabled;

    public TextInputEditText(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TextInputEditText(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.editTextStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public TextInputEditText(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            r0 = 0
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r0)
            r8.<init>(r1, r10, r11)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r8.parentRect = r1
            int[] r4 = com.google.android.material.C0479R.styleable.TextInputEditText
            int r6 = com.google.android.material.C0479R.style.Widget_Design_TextInputEditText
            int[] r7 = new int[r0]
            r2 = r9
            r3 = r10
            r5 = r11
            android.content.res.TypedArray r9 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r2, r3, r4, r5, r6, r7)
            int r10 = com.google.android.material.C0479R.styleable.TextInputEditText_textInputLayoutFocusedRectEnabled
            boolean r10 = r9.getBoolean(r10, r0)
            r8.setTextInputLayoutFocusedRectEnabled(r10)
            r9.recycle()
            return
    }

    private java.lang.String getAccessibilityNodeInfoText(com.google.android.material.textfield.TextInputLayout r5) {
            r4 = this;
            android.text.Editable r0 = r4.getText()
            java.lang.CharSequence r5 = r5.getHint()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r1 = r1 ^ 1
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            r2 = r2 ^ 1
            int r3 = com.google.android.material.C0479R.id.textinput_helper_text
            r4.setLabelFor(r3)
            java.lang.String r3 = ""
            if (r2 == 0) goto L22
            java.lang.String r5 = r5.toString()
            goto L23
        L22:
            r5 = r3
        L23:
            if (r1 == 0) goto L4c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L43
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ", "
            r1.<init>(r2)
            java.lang.StringBuilder r5 = r1.append(r5)
            java.lang.String r3 = r5.toString()
        L43:
            java.lang.StringBuilder r5 = r0.append(r3)
            java.lang.String r5 = r5.toString()
            return r5
        L4c:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L53
            return r5
        L53:
            return r3
    }

    private java.lang.CharSequence getHintFromLayout() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInputLayout()
            if (r0 == 0) goto Lb
            java.lang.CharSequence r0 = r0.getHint()
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private com.google.android.material.textfield.TextInputLayout getTextInputLayout() {
            r2 = this;
            android.view.ViewParent r0 = r2.getParent()
        L4:
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            boolean r1 = r0 instanceof com.google.android.material.textfield.TextInputLayout
            if (r1 == 0) goto Lf
            com.google.android.material.textfield.TextInputLayout r0 = (com.google.android.material.textfield.TextInputLayout) r0
            return r0
        Lf:
            android.view.ViewParent r0 = r0.getParent()
            goto L4
        L14:
            r0 = 0
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(android.graphics.Rect r3) {
            r2 = this;
            super.getFocusedRect(r3)
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L1a
            boolean r1 = r2.textInputLayoutFocusedRectEnabled
            if (r1 == 0) goto L1a
            if (r3 == 0) goto L1a
            android.graphics.Rect r1 = r2.parentRect
            r0.getFocusedRect(r1)
            android.graphics.Rect r0 = r2.parentRect
            int r0 = r0.bottom
            r3.bottom = r0
        L1a:
            return
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(android.graphics.Rect r4, android.graphics.Point r5) {
            r3 = this;
            boolean r0 = super.getGlobalVisibleRect(r4, r5)
            com.google.android.material.textfield.TextInputLayout r1 = r3.getTextInputLayout()
            if (r1 == 0) goto L1b
            boolean r2 = r3.textInputLayoutFocusedRectEnabled
            if (r2 == 0) goto L1b
            if (r4 == 0) goto L1b
            android.graphics.Rect r2 = r3.parentRect
            r1.getGlobalVisibleRect(r2, r5)
            android.graphics.Rect r5 = r3.parentRect
            int r5 = r5.bottom
            r4.bottom = r5
        L1b:
            return r0
    }

    @Override // android.widget.TextView
    public java.lang.CharSequence getHint() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInputLayout()
            if (r0 == 0) goto L11
            boolean r1 = r0.isProvidingHint()
            if (r1 == 0) goto L11
            java.lang.CharSequence r0 = r0.getHint()
            return r0
        L11:
            java.lang.CharSequence r0 = super.getHint()
            return r0
    }

    public boolean isTextInputLayoutFocusedRectEnabled() {
            r1 = this;
            boolean r0 = r1.textInputLayoutFocusedRectEnabled
            return r0
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInputLayout()
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

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r3) {
            r2 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r3)
            if (r0 == 0) goto L10
            java.lang.CharSequence r1 = r3.hintText
            if (r1 != 0) goto L10
            java.lang.CharSequence r1 = r2.getHintFromLayout()
            r3.hintText = r1
        L10:
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r1) {
            r0 = this;
            super.onInitializeAccessibilityNodeInfo(r1)
            r0.getTextInputLayout()
            return
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(android.graphics.Rect r7) {
            r6 = this;
            boolean r7 = super.requestRectangleOnScreen(r7)
            com.google.android.material.textfield.TextInputLayout r0 = r6.getTextInputLayout()
            if (r0 == 0) goto L31
            boolean r1 = r6.textInputLayoutFocusedRectEnabled
            if (r1 == 0) goto L31
            android.graphics.Rect r1 = r6.parentRect
            int r2 = r0.getHeight()
            android.content.res.Resources r3 = r6.getResources()
            int r4 = com.google.android.material.C0479R.dimen.mtrl_edittext_rectangle_top_offset
            int r3 = r3.getDimensionPixelOffset(r4)
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r5 = 0
            r1.set(r5, r2, r3, r4)
            android.graphics.Rect r1 = r6.parentRect
            r2 = 1
            r0.requestRectangleOnScreen(r1, r2)
        L31:
            return r7
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean r1) {
            r0 = this;
            r0.textInputLayoutFocusedRectEnabled = r1
            return
    }
}
