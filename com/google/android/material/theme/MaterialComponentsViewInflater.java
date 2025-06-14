package com.google.android.material.theme;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends androidx.appcompat.app.AppCompatViewInflater {
    public MaterialComponentsViewInflater() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatAutoCompleteTextView createAutoCompleteTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.textfield.MaterialAutoCompleteTextView r0 = new com.google.android.material.textfield.MaterialAutoCompleteTextView
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatButton createButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.button.MaterialButton r0 = new com.google.android.material.button.MaterialButton
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatCheckBox createCheckBox(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.checkbox.MaterialCheckBox r0 = new com.google.android.material.checkbox.MaterialCheckBox
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatRadioButton createRadioButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.radiobutton.MaterialRadioButton r0 = new com.google.android.material.radiobutton.MaterialRadioButton
            r0.<init>(r2, r3)
            return r0
    }

    @Override // androidx.appcompat.app.AppCompatViewInflater
    protected androidx.appcompat.widget.AppCompatTextView createTextView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            com.google.android.material.textview.MaterialTextView r0 = new com.google.android.material.textview.MaterialTextView
            r0.<init>(r2, r3)
            return r0
    }
}
