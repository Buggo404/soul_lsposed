package com.google.android.material.textfield;

/* loaded from: classes.dex */
class CustomEndIconDelegate extends com.google.android.material.textfield.EndIconDelegate {
    CustomEndIconDelegate(com.google.android.material.textfield.TextInputLayout r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    void initialize() {
            r2 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r1 = 0
            r0.setEndIconOnClickListener(r1)
            com.google.android.material.textfield.TextInputLayout r0 = r2.textInputLayout
            r0.setEndIconOnLongClickListener(r1)
            return
    }
}
