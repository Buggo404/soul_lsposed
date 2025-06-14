package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimePickerTextInputPresenter implements com.google.android.material.timepicker.TimePickerView.OnSelectionChange, com.google.android.material.timepicker.TimePickerPresenter {
    private final com.google.android.material.timepicker.TimePickerTextInputKeyController controller;
    private final android.widget.EditText hourEditText;
    private final com.google.android.material.timepicker.ChipTextInputComboView hourTextInput;
    private final android.text.TextWatcher hourTextWatcher;
    private final android.widget.EditText minuteEditText;
    private final com.google.android.material.timepicker.ChipTextInputComboView minuteTextInput;
    private final android.text.TextWatcher minuteTextWatcher;
    private final com.google.android.material.timepicker.TimeModel time;
    private final android.widget.LinearLayout timePickerView;
    private com.google.android.material.button.MaterialButtonToggleGroup toggle;





    public TimePickerTextInputPresenter(android.widget.LinearLayout r7, com.google.android.material.timepicker.TimeModel r8) {
            r6 = this;
            r6.<init>()
            com.google.android.material.timepicker.TimePickerTextInputPresenter$1 r0 = new com.google.android.material.timepicker.TimePickerTextInputPresenter$1
            r0.<init>(r6)
            r6.minuteTextWatcher = r0
            com.google.android.material.timepicker.TimePickerTextInputPresenter$2 r0 = new com.google.android.material.timepicker.TimePickerTextInputPresenter$2
            r0.<init>(r6)
            r6.hourTextWatcher = r0
            r6.timePickerView = r7
            r6.time = r8
            android.content.res.Resources r0 = r7.getResources()
            int r1 = com.google.android.material.C0479R.id.material_minute_text_input
            android.view.View r1 = r7.findViewById(r1)
            com.google.android.material.timepicker.ChipTextInputComboView r1 = (com.google.android.material.timepicker.ChipTextInputComboView) r1
            r6.minuteTextInput = r1
            int r2 = com.google.android.material.C0479R.id.material_hour_text_input
            android.view.View r2 = r7.findViewById(r2)
            com.google.android.material.timepicker.ChipTextInputComboView r2 = (com.google.android.material.timepicker.ChipTextInputComboView) r2
            r6.hourTextInput = r2
            int r3 = com.google.android.material.C0479R.id.material_label
            android.view.View r3 = r1.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r4 = com.google.android.material.C0479R.id.material_label
            android.view.View r4 = r2.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            int r5 = com.google.android.material.C0479R.string.material_timepicker_minute
            java.lang.String r5 = r0.getString(r5)
            r3.setText(r5)
            int r3 = com.google.android.material.C0479R.string.material_timepicker_hour
            java.lang.String r0 = r0.getString(r3)
            r4.setText(r0)
            int r0 = com.google.android.material.C0479R.id.selection_type
            r3 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.setTag(r0, r3)
            int r0 = com.google.android.material.C0479R.id.selection_type
            r3 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.setTag(r0, r3)
            int r0 = r8.format
            if (r0 != 0) goto L6c
            r6.setupPeriodToggle()
        L6c:
            com.google.android.material.timepicker.TimePickerTextInputPresenter$3 r0 = new com.google.android.material.timepicker.TimePickerTextInputPresenter$3
            r0.<init>(r6)
            r2.setOnClickListener(r0)
            r1.setOnClickListener(r0)
            com.google.android.material.timepicker.MaxInputValidator r0 = r8.getHourInputValidator()
            r2.addInputFilter(r0)
            com.google.android.material.timepicker.MaxInputValidator r0 = r8.getMinuteInputValidator()
            r1.addInputFilter(r0)
            com.google.android.material.textfield.TextInputLayout r0 = r2.getTextInput()
            android.widget.EditText r0 = r0.getEditText()
            r6.hourEditText = r0
            com.google.android.material.textfield.TextInputLayout r0 = r1.getTextInput()
            android.widget.EditText r0 = r0.getEditText()
            r6.minuteEditText = r0
            com.google.android.material.timepicker.TimePickerTextInputKeyController r0 = new com.google.android.material.timepicker.TimePickerTextInputKeyController
            r0.<init>(r2, r1, r8)
            r6.controller = r0
            com.google.android.material.timepicker.ClickActionDelegate r8 = new com.google.android.material.timepicker.ClickActionDelegate
            android.content.Context r0 = r7.getContext()
            int r3 = com.google.android.material.C0479R.string.material_hour_selection
            r8.<init>(r0, r3)
            r2.setChipDelegate(r8)
            com.google.android.material.timepicker.ClickActionDelegate r8 = new com.google.android.material.timepicker.ClickActionDelegate
            android.content.Context r7 = r7.getContext()
            int r0 = com.google.android.material.C0479R.string.material_minute_selection
            r8.<init>(r7, r0)
            r1.setChipDelegate(r8)
            r6.initialize()
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.TimeModel access$000(com.google.android.material.timepicker.TimePickerTextInputPresenter r0) {
            com.google.android.material.timepicker.TimeModel r0 = r0.time
            return r0
    }

    private void addTextWatchers() {
            r2 = this;
            android.widget.EditText r0 = r2.hourEditText
            android.text.TextWatcher r1 = r2.hourTextWatcher
            r0.addTextChangedListener(r1)
            android.widget.EditText r0 = r2.minuteEditText
            android.text.TextWatcher r1 = r2.minuteTextWatcher
            r0.addTextChangedListener(r1)
            return
    }

    private void removeTextWatchers() {
            r2 = this;
            android.widget.EditText r0 = r2.hourEditText
            android.text.TextWatcher r1 = r2.hourTextWatcher
            r0.removeTextChangedListener(r1)
            android.widget.EditText r0 = r2.minuteEditText
            android.text.TextWatcher r1 = r2.minuteTextWatcher
            r0.removeTextChangedListener(r1)
            return
    }

    private static void setCursorDrawableColor(android.widget.EditText r5, int r6) {
            android.content.Context r0 = r5.getContext()     // Catch: java.lang.Throwable -> L44
            java.lang.Class<android.widget.TextView> r1 = android.widget.TextView.class
            java.lang.String r2 = "mCursorDrawableRes"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L44
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L44
            int r1 = r1.getInt(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Class<android.widget.TextView> r3 = android.widget.TextView.class
            java.lang.String r4 = "mEditor"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L44
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L44
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.Throwable -> L44
            java.lang.Class r3 = r5.getClass()     // Catch: java.lang.Throwable -> L44
            java.lang.String r4 = "mCursorDrawable"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L44
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L44
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r1)     // Catch: java.lang.Throwable -> L44
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.SRC_IN     // Catch: java.lang.Throwable -> L44
            r0.setColorFilter(r6, r1)     // Catch: java.lang.Throwable -> L44
            r6 = 2
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r6]     // Catch: java.lang.Throwable -> L44
            r1 = 0
            r6[r1] = r0     // Catch: java.lang.Throwable -> L44
            r6[r2] = r0     // Catch: java.lang.Throwable -> L44
            r3.set(r5, r6)     // Catch: java.lang.Throwable -> L44
        L44:
            return
    }

    private void setTime(com.google.android.material.timepicker.TimeModel r6) {
            r5 = this;
            r5.removeTextWatchers()
            android.widget.LinearLayout r0 = r5.timePickerView
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            java.util.Locale r0 = r0.locale
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r3 = r6.minute
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 0
            r2[r4] = r3
            java.lang.String r3 = "%02d"
            java.lang.String r2 = java.lang.String.format(r0, r3, r2)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r6 = r6.getHourForDisplay()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r1[r4] = r6
            java.lang.String r6 = java.lang.String.format(r0, r3, r1)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r5.minuteTextInput
            r0.setText(r2)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r5.hourTextInput
            r0.setText(r6)
            r5.addTextWatchers()
            r5.updateSelection()
            return
    }

    private void setupPeriodToggle() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.timePickerView
            int r1 = com.google.android.material.C0479R.id.material_clock_period_toggle
            android.view.View r0 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = (com.google.android.material.button.MaterialButtonToggleGroup) r0
            r2.toggle = r0
            com.google.android.material.timepicker.TimePickerTextInputPresenter$4 r1 = new com.google.android.material.timepicker.TimePickerTextInputPresenter$4
            r1.<init>(r2)
            r0.addOnButtonCheckedListener(r1)
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.toggle
            r1 = 0
            r0.setVisibility(r1)
            r2.updateSelection()
            return
    }

    private void updateSelection() {
            r2 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.toggle
            if (r0 != 0) goto L5
            return
        L5:
            com.google.android.material.timepicker.TimeModel r1 = r2.time
            int r1 = r1.period
            if (r1 != 0) goto Le
            int r1 = com.google.android.material.C0479R.id.material_clock_period_am_button
            goto L10
        Le:
            int r1 = com.google.android.material.C0479R.id.material_clock_period_pm_button
        L10:
            r0.check(r1)
            return
    }

    public void clearCheck() {
            r2 = this;
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r2.minuteTextInput
            r1 = 0
            r0.setChecked(r1)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r2.hourTextInput
            r0.setChecked(r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
            r4 = this;
            android.widget.LinearLayout r0 = r4.timePickerView
            android.view.View r0 = r0.getFocusedChild()
            r1 = 8
            if (r0 != 0) goto L10
            android.widget.LinearLayout r0 = r4.timePickerView
            r0.setVisibility(r1)
            return
        L10:
            android.widget.LinearLayout r2 = r4.timePickerView
            android.content.Context r2 = r2.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r3 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r2 = androidx.core.content.ContextCompat.getSystemService(r2, r3)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            if (r2 == 0) goto L28
            android.os.IBinder r0 = r0.getWindowToken()
            r3 = 0
            r2.hideSoftInputFromWindow(r0, r3)
        L28:
            android.widget.LinearLayout r0 = r4.timePickerView
            r0.setVisibility(r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
            r1 = this;
            r1.addTextWatchers()
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            r1.setTime(r0)
            com.google.android.material.timepicker.TimePickerTextInputKeyController r0 = r1.controller
            r0.bind()
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            r1.setTime(r0)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int r5) {
            r4 = this;
            com.google.android.material.timepicker.TimeModel r0 = r4.time
            r0.selection = r5
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r4.minuteTextInput
            r1 = 12
            r2 = 1
            r3 = 0
            if (r5 != r1) goto Le
            r1 = r2
            goto Lf
        Le:
            r1 = r3
        Lf:
            r0.setChecked(r1)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r4.hourTextInput
            r1 = 10
            if (r5 != r1) goto L19
            goto L1a
        L19:
            r2 = r3
        L1a:
            r0.setChecked(r2)
            r4.updateSelection()
            return
    }

    public void resetChecked() {
            r5 = this;
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r5.minuteTextInput
            com.google.android.material.timepicker.TimeModel r1 = r5.time
            int r1 = r1.selection
            r2 = 12
            r3 = 1
            r4 = 0
            if (r1 != r2) goto Le
            r1 = r3
            goto Lf
        Le:
            r1 = r4
        Lf:
            r0.setChecked(r1)
            com.google.android.material.timepicker.ChipTextInputComboView r0 = r5.hourTextInput
            com.google.android.material.timepicker.TimeModel r1 = r5.time
            int r1 = r1.selection
            r2 = 10
            if (r1 != r2) goto L1d
            goto L1e
        L1d:
            r3 = r4
        L1e:
            r0.setChecked(r3)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
            r2 = this;
            android.widget.LinearLayout r0 = r2.timePickerView
            r1 = 0
            r0.setVisibility(r1)
            return
    }
}
