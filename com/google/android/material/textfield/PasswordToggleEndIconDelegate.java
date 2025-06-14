package com.google.android.material.textfield;

/* loaded from: classes.dex */
class PasswordToggleEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    private final com.google.android.material.textfield.TextInputLayout.OnEditTextAttachedListener onEditTextAttachedListener;
    private final com.google.android.material.textfield.TextInputLayout.OnEndIconChangedListener onEndIconChangedListener;
    private final android.text.TextWatcher textWatcher;





    PasswordToggleEndIconDelegate(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>(r1)
            com.google.android.material.textfield.PasswordToggleEndIconDelegate$1 r1 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate$1
            r1.<init>(r0)
            r0.textWatcher = r1
            com.google.android.material.textfield.PasswordToggleEndIconDelegate$2 r1 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate$2
            r1.<init>(r0)
            r0.onEditTextAttachedListener = r1
            com.google.android.material.textfield.PasswordToggleEndIconDelegate$3 r1 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate$3
            r1.<init>(r0)
            r0.onEndIconChangedListener = r1
            return
    }

    static /* synthetic */ boolean access$000(com.google.android.material.textfield.PasswordToggleEndIconDelegate r0) {
            boolean r0 = r0.hasPasswordTransformation()
            return r0
    }

    static /* synthetic */ android.text.TextWatcher access$100(com.google.android.material.textfield.PasswordToggleEndIconDelegate r0) {
            android.text.TextWatcher r0 = r0.textWatcher
            return r0
    }

    private boolean hasPasswordTransformation() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputLayout
            android.widget.EditText r0 = r0.getEditText()
            if (r0 == 0) goto L12
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    private static boolean isInputTypePassword(android.widget.EditText r2) {
            if (r2 == 0) goto L24
            int r0 = r2.getInputType()
            r1 = 16
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 128(0x80, float:1.794E-43)
            if (r0 == r1) goto L22
            int r0 = r2.getInputType()
            r1 = 144(0x90, float:2.02E-43)
            if (r0 == r1) goto L22
            int r2 = r2.getInputType()
            r0 = 224(0xe0, float:3.14E-43)
            if (r2 != r0) goto L24
        L22:
            r2 = 1
            goto L25
        L24:
            r2 = 0
        L25:
            return r2
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
            r3 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            android.content.Context r1 = r3.context
            int r2 = com.google.android.material.C0479R.drawable.design_password_eye
            android.graphics.drawable.Drawable r1 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r2)
            r0.setEndIconDrawable(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout r1 = r3.textInputLayout
            android.content.res.Resources r1 = r1.getResources()
            int r2 = com.google.android.material.C0479R.string.password_toggle_content_description
            java.lang.CharSequence r1 = r1.getText(r2)
            r0.setEndIconContentDescription(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.PasswordToggleEndIconDelegate$4 r1 = new com.google.android.material.textfield.PasswordToggleEndIconDelegate$4
            r1.<init>(r3)
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEditTextAttachedListener r1 = r3.onEditTextAttachedListener
            r0.addOnEditTextAttachedListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            com.google.android.material.textfield.TextInputLayout$OnEndIconChangedListener r1 = r3.onEndIconChangedListener
            r0.addOnEndIconChangedListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r3.textInputLayout
            android.widget.EditText r0 = r0.getEditText()
            boolean r1 = isInputTypePassword(r0)
            if (r1 == 0) goto L49
            android.text.method.PasswordTransformationMethod r1 = android.text.method.PasswordTransformationMethod.getInstance()
            r0.setTransformationMethod(r1)
        L49:
            return
    }
}
