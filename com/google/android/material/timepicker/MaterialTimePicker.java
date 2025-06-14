package com.google.android.material.timepicker;

/* loaded from: classes.dex */
public final class MaterialTimePicker extends androidx.fragment.app.DialogFragment {
    public static final int INPUT_MODE_CLOCK = 0;
    static final java.lang.String INPUT_MODE_EXTRA = "TIME_PICKER_INPUT_MODE";
    public static final int INPUT_MODE_KEYBOARD = 1;
    static final java.lang.String TIME_MODEL_EXTRA = "TIME_PICKER_TIME_MODEL";
    static final java.lang.String TITLE_RES_EXTRA = "TIME_PICKER_TITLE_RES";
    static final java.lang.String TITLE_TEXT_EXTRA = "TIME_PICKER_TITLE_TEXT";
    private com.google.android.material.timepicker.TimePickerPresenter activePresenter;
    private final java.util.Set<android.content.DialogInterface.OnCancelListener> cancelListeners;
    private int clockIcon;
    private final java.util.Set<android.content.DialogInterface.OnDismissListener> dismissListeners;
    private int inputMode;
    private int keyboardIcon;
    private com.google.android.material.button.MaterialButton modeButton;
    private final java.util.Set<android.view.View.OnClickListener> negativeButtonListeners;
    private final java.util.Set<android.view.View.OnClickListener> positiveButtonListeners;
    private android.view.ViewStub textInputStub;
    private android.widget.LinearLayout textInputView;
    private com.google.android.material.timepicker.TimeModel time;
    private com.google.android.material.timepicker.TimePickerClockPresenter timePickerClockPresenter;
    private com.google.android.material.timepicker.TimePickerTextInputPresenter timePickerTextInputPresenter;
    private com.google.android.material.timepicker.TimePickerView timePickerView;
    private int titleResId;
    private java.lang.String titleText;





    public static final class Builder {
        private int inputMode;
        private com.google.android.material.timepicker.TimeModel time;
        private java.lang.CharSequence titleText;
        private int titleTextResId;

        public Builder() {
                r1 = this;
                r1.<init>()
                com.google.android.material.timepicker.TimeModel r0 = new com.google.android.material.timepicker.TimeModel
                r0.<init>()
                r1.time = r0
                r0 = 0
                r1.titleTextResId = r0
                return
        }

        static /* synthetic */ com.google.android.material.timepicker.TimeModel access$000(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                com.google.android.material.timepicker.TimeModel r0 = r0.time
                return r0
        }

        static /* synthetic */ int access$100(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.inputMode
                return r0
        }

        static /* synthetic */ int access$200(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                int r0 = r0.titleTextResId
                return r0
        }

        static /* synthetic */ java.lang.CharSequence access$300(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
                java.lang.CharSequence r0 = r0.titleText
                return r0
        }

        public com.google.android.material.timepicker.MaterialTimePicker build() {
                r1 = this;
                com.google.android.material.timepicker.MaterialTimePicker r0 = com.google.android.material.timepicker.MaterialTimePicker.access$1000(r1)
                return r0
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setHour(int r2) {
                r1 = this;
                com.google.android.material.timepicker.TimeModel r0 = r1.time
                r0.setHourOfDay(r2)
                return r1
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setInputMode(int r1) {
                r0 = this;
                r0.inputMode = r1
                return r0
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setMinute(int r2) {
                r1 = this;
                com.google.android.material.timepicker.TimeModel r0 = r1.time
                r0.setMinute(r2)
                return r1
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTimeFormat(int r4) {
                r3 = this;
                com.google.android.material.timepicker.TimeModel r0 = r3.time
                int r0 = r0.hour
                com.google.android.material.timepicker.TimeModel r1 = r3.time
                int r1 = r1.minute
                com.google.android.material.timepicker.TimeModel r2 = new com.google.android.material.timepicker.TimeModel
                r2.<init>(r4)
                r3.time = r2
                r2.setMinute(r1)
                com.google.android.material.timepicker.TimeModel r4 = r3.time
                r4.setHourOfDay(r0)
                return r3
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(int r1) {
                r0 = this;
                r0.titleTextResId = r1
                return r0
        }

        public com.google.android.material.timepicker.MaterialTimePicker.Builder setTitleText(java.lang.CharSequence r1) {
                r0 = this;
                r0.titleText = r1
                return r0
        }
    }

    public MaterialTimePicker() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.positiveButtonListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.negativeButtonListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.cancelListeners = r0
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.dismissListeners = r0
            r0 = 0
            r1.titleResId = r0
            r1.inputMode = r0
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.MaterialTimePicker access$1000(com.google.android.material.timepicker.MaterialTimePicker.Builder r0) {
            com.google.android.material.timepicker.MaterialTimePicker r0 = newInstance(r0)
            return r0
    }

    static /* synthetic */ int access$400(com.google.android.material.timepicker.MaterialTimePicker r0) {
            int r0 = r0.inputMode
            return r0
    }

    static /* synthetic */ int access$402(com.google.android.material.timepicker.MaterialTimePicker r0, int r1) {
            r0.inputMode = r1
            return r1
    }

    static /* synthetic */ com.google.android.material.button.MaterialButton access$500(com.google.android.material.timepicker.MaterialTimePicker r0) {
            com.google.android.material.button.MaterialButton r0 = r0.modeButton
            return r0
    }

    static /* synthetic */ void access$600(com.google.android.material.timepicker.MaterialTimePicker r0, com.google.android.material.button.MaterialButton r1) {
            r0.updateInputMode(r1)
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerTextInputPresenter access$700(com.google.android.material.timepicker.MaterialTimePicker r0) {
            com.google.android.material.timepicker.TimePickerTextInputPresenter r0 = r0.timePickerTextInputPresenter
            return r0
    }

    static /* synthetic */ java.util.Set access$800(com.google.android.material.timepicker.MaterialTimePicker r0) {
            java.util.Set<android.view.View$OnClickListener> r0 = r0.positiveButtonListeners
            return r0
    }

    static /* synthetic */ java.util.Set access$900(com.google.android.material.timepicker.MaterialTimePicker r0) {
            java.util.Set<android.view.View$OnClickListener> r0 = r0.negativeButtonListeners
            return r0
    }

    private android.util.Pair<java.lang.Integer, java.lang.Integer> dataForMode(int r4) {
            r3 = this;
            if (r4 == 0) goto L2c
            r0 = 1
            if (r4 != r0) goto L17
            android.util.Pair r4 = new android.util.Pair
            int r0 = r3.clockIcon
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.google.android.material.C0479R.string.material_timepicker_clock_mode_description
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.<init>(r0, r1)
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "no icon for mode: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L2c:
            android.util.Pair r4 = new android.util.Pair
            int r0 = r3.keyboardIcon
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            int r1 = com.google.android.material.C0479R.string.material_timepicker_text_input_mode_description
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4.<init>(r0, r1)
            return r4
    }

    private com.google.android.material.timepicker.TimePickerPresenter initializeOrRetrieveActivePresenterForMode(int r3) {
            r2 = this;
            if (r3 != 0) goto L12
            com.google.android.material.timepicker.TimePickerClockPresenter r3 = r2.timePickerClockPresenter
            if (r3 != 0) goto Lf
            com.google.android.material.timepicker.TimePickerClockPresenter r3 = new com.google.android.material.timepicker.TimePickerClockPresenter
            com.google.android.material.timepicker.TimePickerView r0 = r2.timePickerView
            com.google.android.material.timepicker.TimeModel r1 = r2.time
            r3.<init>(r0, r1)
        Lf:
            r2.timePickerClockPresenter = r3
            return r3
        L12:
            com.google.android.material.timepicker.TimePickerTextInputPresenter r3 = r2.timePickerTextInputPresenter
            if (r3 != 0) goto L2b
            android.view.ViewStub r3 = r2.textInputStub
            android.view.View r3 = r3.inflate()
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r2.textInputView = r3
            com.google.android.material.timepicker.TimePickerTextInputPresenter r3 = new com.google.android.material.timepicker.TimePickerTextInputPresenter
            android.widget.LinearLayout r0 = r2.textInputView
            com.google.android.material.timepicker.TimeModel r1 = r2.time
            r3.<init>(r0, r1)
            r2.timePickerTextInputPresenter = r3
        L2b:
            com.google.android.material.timepicker.TimePickerTextInputPresenter r3 = r2.timePickerTextInputPresenter
            r3.clearCheck()
            com.google.android.material.timepicker.TimePickerTextInputPresenter r3 = r2.timePickerTextInputPresenter
            return r3
    }

    private static com.google.android.material.timepicker.MaterialTimePicker newInstance(com.google.android.material.timepicker.MaterialTimePicker.Builder r4) {
            com.google.android.material.timepicker.MaterialTimePicker r0 = new com.google.android.material.timepicker.MaterialTimePicker
            r0.<init>()
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r2 = "TIME_PICKER_TIME_MODEL"
            com.google.android.material.timepicker.TimeModel r3 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$000(r4)
            r1.putParcelable(r2, r3)
            java.lang.String r2 = "TIME_PICKER_INPUT_MODE"
            int r3 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$100(r4)
            r1.putInt(r2, r3)
            java.lang.String r2 = "TIME_PICKER_TITLE_RES"
            int r3 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$200(r4)
            r1.putInt(r2, r3)
            java.lang.CharSequence r2 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$300(r4)
            if (r2 == 0) goto L38
            java.lang.CharSequence r4 = com.google.android.material.timepicker.MaterialTimePicker.Builder.access$300(r4)
            java.lang.String r4 = r4.toString()
            java.lang.String r2 = "TIME_PICKER_TITLE_TEXT"
            r1.putString(r2, r4)
        L38:
            r0.setArguments(r1)
            return r0
    }

    private void restoreState(android.os.Bundle r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = "TIME_PICKER_TIME_MODEL"
            android.os.Parcelable r0 = r3.getParcelable(r0)
            com.google.android.material.timepicker.TimeModel r0 = (com.google.android.material.timepicker.TimeModel) r0
            r2.time = r0
            if (r0 != 0) goto L16
            com.google.android.material.timepicker.TimeModel r0 = new com.google.android.material.timepicker.TimeModel
            r0.<init>()
            r2.time = r0
        L16:
            java.lang.String r0 = "TIME_PICKER_INPUT_MODE"
            r1 = 0
            int r0 = r3.getInt(r0, r1)
            r2.inputMode = r0
            java.lang.String r0 = "TIME_PICKER_TITLE_RES"
            int r0 = r3.getInt(r0, r1)
            r2.titleResId = r0
            java.lang.String r0 = "TIME_PICKER_TITLE_TEXT"
            java.lang.String r3 = r3.getString(r0)
            r2.titleText = r3
            return
    }

    private void updateInputMode(com.google.android.material.button.MaterialButton r3) {
            r2 = this;
            com.google.android.material.timepicker.TimePickerPresenter r0 = r2.activePresenter
            if (r0 == 0) goto L7
            r0.hide()
        L7:
            int r0 = r2.inputMode
            com.google.android.material.timepicker.TimePickerPresenter r0 = r2.initializeOrRetrieveActivePresenterForMode(r0)
            r2.activePresenter = r0
            r0.show()
            com.google.android.material.timepicker.TimePickerPresenter r0 = r2.activePresenter
            r0.invalidate()
            int r0 = r2.inputMode
            android.util.Pair r0 = r2.dataForMode(r0)
            java.lang.Object r1 = r0.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.setIconResource(r1)
            android.content.res.Resources r1 = r2.getResources()
            java.lang.Object r0 = r0.second
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.lang.String r0 = r1.getString(r0)
            r3.setContentDescription(r0)
            return
    }

    public boolean addOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public boolean addOnPositiveButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    public void clearOnCancelListeners() {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            r0.clear()
            return
    }

    public void clearOnDismissListeners() {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            r0.clear()
            return
    }

    public void clearOnNegativeButtonClickListeners() {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            r0.clear()
            return
    }

    public void clearOnPositiveButtonClickListeners() {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            r0.clear()
            return
    }

    public int getHour() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.hour
            int r0 = r0 % 24
            return r0
    }

    public int getInputMode() {
            r1 = this;
            int r0 = r1.inputMode
            return r0
    }

    public int getMinute() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.minute
            return r0
    }

    com.google.android.material.timepicker.TimePickerClockPresenter getTimePickerClockPresenter() {
            r1 = this;
            com.google.android.material.timepicker.TimePickerClockPresenter r0 = r1.timePickerClockPresenter
            return r0
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface r3) {
            r2 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r2.cancelListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnCancelListener r1 = (android.content.DialogInterface.OnCancelListener) r1
            r1.onCancel(r3)
            goto L6
        L16:
            super.onCancel(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r1) {
            r0 = this;
            super.onCreate(r1)
            if (r1 != 0) goto L9
            android.os.Bundle r1 = r0.getArguments()
        L9:
            r0.restoreState(r1)
            return
    }

    @Override // androidx.fragment.app.DialogFragment
    public final android.app.Dialog onCreateDialog(android.os.Bundle r9) {
            r8 = this;
            android.content.Context r9 = r8.requireContext()
            int r0 = com.google.android.material.C0479R.attr.materialTimePickerTheme
            android.util.TypedValue r9 = com.google.android.material.resources.MaterialAttributes.resolve(r9, r0)
            android.app.Dialog r0 = new android.app.Dialog
            android.content.Context r1 = r8.requireContext()
            r2 = 0
            if (r9 != 0) goto L15
            r9 = r2
            goto L17
        L15:
            int r9 = r9.data
        L17:
            r0.<init>(r1, r9)
            android.content.Context r9 = r0.getContext()
            int r1 = com.google.android.material.C0479R.attr.colorSurface
            java.lang.Class<com.google.android.material.timepicker.MaterialTimePicker> r3 = com.google.android.material.timepicker.MaterialTimePicker.class
            java.lang.String r3 = r3.getCanonicalName()
            int r1 = com.google.android.material.resources.MaterialAttributes.resolveOrThrow(r9, r1, r3)
            com.google.android.material.shape.MaterialShapeDrawable r3 = new com.google.android.material.shape.MaterialShapeDrawable
            int r4 = com.google.android.material.C0479R.attr.materialTimePickerStyle
            int r5 = com.google.android.material.C0479R.style.Widget_MaterialComponents_TimePicker
            r6 = 0
            r3.<init>(r9, r6, r4, r5)
            int[] r4 = com.google.android.material.C0479R.styleable.MaterialTimePicker
            int r5 = com.google.android.material.C0479R.attr.materialTimePickerStyle
            int r7 = com.google.android.material.C0479R.style.Widget_MaterialComponents_TimePicker
            android.content.res.TypedArray r4 = r9.obtainStyledAttributes(r6, r4, r5, r7)
            int r5 = com.google.android.material.C0479R.styleable.MaterialTimePicker_clockIcon
            int r5 = r4.getResourceId(r5, r2)
            r8.clockIcon = r5
            int r5 = com.google.android.material.C0479R.styleable.MaterialTimePicker_keyboardIcon
            int r2 = r4.getResourceId(r5, r2)
            r8.keyboardIcon = r2
            r4.recycle()
            r3.initializeElevationOverlay(r9)
            android.content.res.ColorStateList r9 = android.content.res.ColorStateList.valueOf(r1)
            r3.setFillColor(r9)
            android.view.Window r9 = r0.getWindow()
            r9.setBackgroundDrawable(r3)
            r1 = 1
            r9.requestFeature(r1)
            r1 = -2
            r9.setLayout(r1, r1)
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public final android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
            r0 = this;
            int r3 = com.google.android.material.C0479R.layout.material_timepicker_dialog
            android.view.View r1 = r1.inflate(r3, r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r2 = com.google.android.material.C0479R.id.material_timepicker_view
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.timepicker.TimePickerView r2 = (com.google.android.material.timepicker.TimePickerView) r2
            r0.timePickerView = r2
            com.google.android.material.timepicker.MaterialTimePicker$1 r3 = new com.google.android.material.timepicker.MaterialTimePicker$1
            r3.<init>(r0)
            r2.setOnDoubleTapListener(r3)
            int r2 = com.google.android.material.C0479R.id.material_textinput_timepicker
            android.view.View r2 = r1.findViewById(r2)
            android.view.ViewStub r2 = (android.view.ViewStub) r2
            r0.textInputStub = r2
            int r2 = com.google.android.material.C0479R.id.material_timepicker_mode_button
            android.view.View r2 = r1.findViewById(r2)
            com.google.android.material.button.MaterialButton r2 = (com.google.android.material.button.MaterialButton) r2
            r0.modeButton = r2
            int r2 = com.google.android.material.C0479R.id.header_title
            android.view.View r2 = r1.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            java.lang.String r3 = r0.titleText
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L43
            java.lang.String r3 = r0.titleText
            r2.setText(r3)
        L43:
            int r3 = r0.titleResId
            if (r3 == 0) goto L4a
            r2.setText(r3)
        L4a:
            com.google.android.material.button.MaterialButton r2 = r0.modeButton
            r0.updateInputMode(r2)
            int r2 = com.google.android.material.C0479R.id.material_timepicker_ok_button
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            com.google.android.material.timepicker.MaterialTimePicker$2 r3 = new com.google.android.material.timepicker.MaterialTimePicker$2
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            int r2 = com.google.android.material.C0479R.id.material_timepicker_cancel_button
            android.view.View r2 = r1.findViewById(r2)
            android.widget.Button r2 = (android.widget.Button) r2
            com.google.android.material.timepicker.MaterialTimePicker$3 r3 = new com.google.android.material.timepicker.MaterialTimePicker$3
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            com.google.android.material.button.MaterialButton r2 = r0.modeButton
            com.google.android.material.timepicker.MaterialTimePicker$4 r3 = new com.google.android.material.timepicker.MaterialTimePicker$4
            r3.<init>(r0)
            r2.setOnClickListener(r3)
            return r1
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface r3) {
            r2 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r2.dismissListeners
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            android.content.DialogInterface$OnDismissListener r1 = (android.content.DialogInterface.OnDismissListener) r1
            r1.onDismiss(r3)
            goto L6
        L16:
            android.view.View r0 = r2.getView()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            if (r0 == 0) goto L21
            r0.removeAllViews()
        L21:
            super.onDismiss(r3)
            return
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            super.onSaveInstanceState(r3)
            java.lang.String r0 = "TIME_PICKER_TIME_MODEL"
            com.google.android.material.timepicker.TimeModel r1 = r2.time
            r3.putParcelable(r0, r1)
            java.lang.String r0 = "TIME_PICKER_INPUT_MODE"
            int r1 = r2.inputMode
            r3.putInt(r0, r1)
            java.lang.String r0 = "TIME_PICKER_TITLE_RES"
            int r1 = r2.titleResId
            r3.putInt(r0, r1)
            java.lang.String r0 = "TIME_PICKER_TITLE_TEXT"
            java.lang.String r1 = r2.titleText
            r3.putString(r0, r1)
            return
    }

    public boolean removeOnCancelListener(android.content.DialogInterface.OnCancelListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnCancelListener> r0 = r1.cancelListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnDismissListener(android.content.DialogInterface.OnDismissListener r2) {
            r1 = this;
            java.util.Set<android.content.DialogInterface$OnDismissListener> r0 = r1.dismissListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnNegativeButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.negativeButtonListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public boolean removeOnPositiveButtonClickListener(android.view.View.OnClickListener r2) {
            r1 = this;
            java.util.Set<android.view.View$OnClickListener> r0 = r1.positiveButtonListeners
            boolean r2 = r0.remove(r2)
            return r2
    }
}
