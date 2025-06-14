package com.google.android.material.textfield;

/* loaded from: classes.dex */
abstract class EndIconDelegate {
    android.content.Context context;
    com.google.android.material.internal.CheckableImageButton endIconView;
    com.google.android.material.textfield.TextInputLayout textInputLayout;

    EndIconDelegate(com.google.android.material.textfield.TextInputLayout r2) {
            r1 = this;
            r1.<init>()
            r1.textInputLayout = r2
            android.content.Context r0 = r2.getContext()
            r1.context = r0
            com.google.android.material.internal.CheckableImageButton r2 = r2.getEndIconView()
            r1.endIconView = r2
            return
    }

    abstract void initialize();

    boolean isBoxBackgroundModeSupported(int r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    void onSuffixVisibilityChanged(boolean r1) {
            r0 = this;
            return
    }

    boolean shouldTintIconOnError() {
            r1 = this;
            r0 = 0
            return r0
    }
}
