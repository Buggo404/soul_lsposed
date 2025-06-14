package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class ChipTextInputComboView extends android.widget.FrameLayout implements android.widget.Checkable {
    private final com.google.android.material.chip.Chip chip;
    private final android.widget.EditText editText;
    private android.widget.TextView label;
    private final com.google.android.material.textfield.TextInputLayout textInputLayout;
    private android.text.TextWatcher watcher;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$1 */
    static /* synthetic */ class C06851 {
    }

    private class TextFormatter extends com.google.android.material.internal.TextWatcherAdapter {
        private static final java.lang.String DEFAULT_TEXT = "00";
        final /* synthetic */ com.google.android.material.timepicker.ChipTextInputComboView this$0;

        private TextFormatter(com.google.android.material.timepicker.ChipTextInputComboView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ TextFormatter(com.google.android.material.timepicker.ChipTextInputComboView r1, com.google.android.material.timepicker.ChipTextInputComboView.C06851 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public void afterTextChanged(android.text.Editable r3) {
                r2 = this;
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 == 0) goto L18
                com.google.android.material.timepicker.ChipTextInputComboView r3 = r2.this$0
                com.google.android.material.chip.Chip r3 = com.google.android.material.timepicker.ChipTextInputComboView.access$200(r3)
                com.google.android.material.timepicker.ChipTextInputComboView r0 = r2.this$0
                java.lang.String r1 = "00"
                java.lang.String r0 = com.google.android.material.timepicker.ChipTextInputComboView.access$100(r0, r1)
                r3.setText(r0)
                return
            L18:
                com.google.android.material.timepicker.ChipTextInputComboView r0 = r2.this$0
                com.google.android.material.chip.Chip r0 = com.google.android.material.timepicker.ChipTextInputComboView.access$200(r0)
                com.google.android.material.timepicker.ChipTextInputComboView r1 = r2.this$0
                java.lang.String r3 = com.google.android.material.timepicker.ChipTextInputComboView.access$100(r1, r3)
                r0.setText(r3)
                return
        }
    }

    public ChipTextInputComboView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ChipTextInputComboView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public ChipTextInputComboView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r5 = com.google.android.material.C0479R.layout.material_time_chip
            r6 = 0
            android.view.View r5 = r4.inflate(r5, r3, r6)
            com.google.android.material.chip.Chip r5 = (com.google.android.material.chip.Chip) r5
            r3.chip = r5
            int r0 = com.google.android.material.C0479R.layout.material_time_input
            android.view.View r4 = r4.inflate(r0, r3, r6)
            com.google.android.material.textfield.TextInputLayout r4 = (com.google.android.material.textfield.TextInputLayout) r4
            r3.textInputLayout = r4
            android.widget.EditText r0 = r4.getEditText()
            r3.editText = r0
            r1 = 4
            r0.setVisibility(r1)
            com.google.android.material.timepicker.ChipTextInputComboView$TextFormatter r1 = new com.google.android.material.timepicker.ChipTextInputComboView$TextFormatter
            r2 = 0
            r1.<init>(r3, r2)
            r3.watcher = r1
            r0.addTextChangedListener(r1)
            r3.updateHintLocales()
            r3.addView(r5)
            r3.addView(r4)
            int r4 = com.google.android.material.C0479R.id.material_label
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.label = r4
            r0.setSaveEnabled(r6)
            return
    }

    static /* synthetic */ java.lang.String access$100(com.google.android.material.timepicker.ChipTextInputComboView r0, java.lang.CharSequence r1) {
            java.lang.String r0 = r0.formatText(r1)
            return r0
    }

    static /* synthetic */ com.google.android.material.chip.Chip access$200(com.google.android.material.timepicker.ChipTextInputComboView r0) {
            com.google.android.material.chip.Chip r0 = r0.chip
            return r0
    }

    private java.lang.String formatText(java.lang.CharSequence r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            java.lang.String r2 = com.google.android.material.timepicker.TimeModel.formatText(r0, r2)
            return r2
    }

    private void updateHintLocales() {
            r2 = this;
            android.content.Context r0 = r2.getContext()
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            android.widget.EditText r1 = r2.editText
            r1.setImeHintLocales(r0)
            return
    }

    public void addInputFilter(android.text.InputFilter r3) {
            r2 = this;
            android.widget.EditText r0 = r2.editText
            android.text.InputFilter[] r0 = r0.getFilters()
            int r1 = r0.length
            int r1 = r1 + 1
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r0, r1)
            android.text.InputFilter[] r1 = (android.text.InputFilter[]) r1
            int r0 = r0.length
            r1[r0] = r3
            android.widget.EditText r3 = r2.editText
            r3.setFilters(r1)
            return
    }

    public com.google.android.material.textfield.TextInputLayout getTextInput() {
            r1 = this;
            com.google.android.material.textfield.TextInputLayout r0 = r1.textInputLayout
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            boolean r0 = r0.isChecked()
            return r0
    }

    @Override // android.view.View
    protected void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            super.onConfigurationChanged(r1)
            r0.updateHintLocales()
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r4) {
            r3 = this;
            com.google.android.material.chip.Chip r0 = r3.chip
            r0.setChecked(r4)
            android.widget.EditText r0 = r3.editText
            r1 = 0
            if (r4 == 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = 4
        Ld:
            r0.setVisibility(r2)
            com.google.android.material.chip.Chip r0 = r3.chip
            if (r4 == 0) goto L16
            r1 = 8
        L16:
            r0.setVisibility(r1)
            boolean r4 = r3.isChecked()
            if (r4 == 0) goto L3d
            android.widget.EditText r4 = r3.editText
            r4.requestFocus()
            android.widget.EditText r4 = r3.editText
            android.text.Editable r4 = r4.getText()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3d
            android.widget.EditText r4 = r3.editText
            android.text.Editable r0 = r4.getText()
            int r0 = r0.length()
            r4.setSelection(r0)
        L3d:
            return
    }

    public void setChipDelegate(androidx.core.view.AccessibilityDelegateCompat r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            return
    }

    public void setCursorVisible(boolean r2) {
            r1 = this;
            android.widget.EditText r0 = r1.editText
            r0.setCursorVisible(r2)
            return
    }

    public void setHelperText(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.label
            r0.setText(r2)
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            r0.setOnClickListener(r2)
            return
    }

    @Override // android.view.View
    public void setTag(int r2, java.lang.Object r3) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            r0.setTag(r2, r3)
            return
    }

    public void setText(java.lang.CharSequence r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            java.lang.String r2 = r1.formatText(r2)
            r0.setText(r2)
            android.widget.EditText r2 = r1.editText
            android.text.Editable r2 = r2.getText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L29
            android.widget.EditText r2 = r1.editText
            android.text.TextWatcher r0 = r1.watcher
            r2.removeTextChangedListener(r0)
            android.widget.EditText r2 = r1.editText
            r0 = 0
            r2.setText(r0)
            android.widget.EditText r2 = r1.editText
            android.text.TextWatcher r0 = r1.watcher
            r2.addTextChangedListener(r0)
        L29:
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.chip
            r0.toggle()
            return
    }
}
