package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimePickerView extends androidx.constraintlayout.widget.ConstraintLayout implements com.google.android.material.timepicker.TimePickerControls {
    private final com.google.android.material.timepicker.ClockFaceView clockFace;
    private final com.google.android.material.timepicker.ClockHandView clockHandView;
    private final com.google.android.material.chip.Chip hourView;
    private final com.google.android.material.chip.Chip minuteView;
    private com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener onDoubleTapListener;
    private com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener onPeriodChangeListener;
    private com.google.android.material.timepicker.TimePickerView.OnSelectionChange onSelectionChangeListener;
    private final android.view.View.OnClickListener selectionListener;
    private final com.google.android.material.button.MaterialButtonToggleGroup toggle;





    interface OnDoubleTapListener {
        void onDoubleTap();
    }

    interface OnPeriodChangeListener {
        void onPeriodChange(int r1);
    }

    interface OnSelectionChange {
        void onSelectionChanged(int r1);
    }

    public TimePickerView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TimePickerView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TimePickerView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            com.google.android.material.timepicker.TimePickerView$1 r2 = new com.google.android.material.timepicker.TimePickerView$1
            r2.<init>(r0)
            r0.selectionListener = r2
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.google.android.material.C0479R.layout.material_timepicker
            r1.inflate(r2, r0)
            int r1 = com.google.android.material.C0479R.id.material_clock_face
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.timepicker.ClockFaceView r1 = (com.google.android.material.timepicker.ClockFaceView) r1
            r0.clockFace = r1
            int r1 = com.google.android.material.C0479R.id.material_clock_period_toggle
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.button.MaterialButtonToggleGroup r1 = (com.google.android.material.button.MaterialButtonToggleGroup) r1
            r0.toggle = r1
            com.google.android.material.timepicker.TimePickerView$2 r2 = new com.google.android.material.timepicker.TimePickerView$2
            r2.<init>(r0)
            r1.addOnButtonCheckedListener(r2)
            int r1 = com.google.android.material.C0479R.id.material_minute_tv
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r0.minuteView = r1
            int r1 = com.google.android.material.C0479R.id.material_hour_tv
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.chip.Chip r1 = (com.google.android.material.chip.Chip) r1
            r0.hourView = r1
            int r1 = com.google.android.material.C0479R.id.material_clock_hand
            android.view.View r1 = r0.findViewById(r1)
            com.google.android.material.timepicker.ClockHandView r1 = (com.google.android.material.timepicker.ClockHandView) r1
            r0.clockHandView = r1
            r0.setupDoubleTap()
            r0.setUpDisplay()
            return
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.OnSelectionChange access$000(com.google.android.material.timepicker.TimePickerView r0) {
            com.google.android.material.timepicker.TimePickerView$OnSelectionChange r0 = r0.onSelectionChangeListener
            return r0
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener access$100(com.google.android.material.timepicker.TimePickerView r0) {
            com.google.android.material.timepicker.TimePickerView$OnPeriodChangeListener r0 = r0.onPeriodChangeListener
            return r0
    }

    static /* synthetic */ com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener access$200(com.google.android.material.timepicker.TimePickerView r0) {
            com.google.android.material.timepicker.TimePickerView$OnDoubleTapListener r0 = r0.onDoubleTapListener
            return r0
    }

    private void setUpDisplay() {
            r3 = this;
            com.google.android.material.chip.Chip r0 = r3.minuteView
            int r1 = com.google.android.material.C0479R.id.selection_type
            r2 = 12
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
            com.google.android.material.chip.Chip r0 = r3.hourView
            int r1 = com.google.android.material.C0479R.id.selection_type
            r2 = 10
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.setTag(r1, r2)
            com.google.android.material.chip.Chip r0 = r3.minuteView
            android.view.View$OnClickListener r1 = r3.selectionListener
            r0.setOnClickListener(r1)
            com.google.android.material.chip.Chip r0 = r3.hourView
            android.view.View$OnClickListener r1 = r3.selectionListener
            r0.setOnClickListener(r1)
            return
    }

    private void setupDoubleTap() {
            r3 = this;
            android.view.GestureDetector r0 = new android.view.GestureDetector
            android.content.Context r1 = r3.getContext()
            com.google.android.material.timepicker.TimePickerView$3 r2 = new com.google.android.material.timepicker.TimePickerView$3
            r2.<init>(r3)
            r0.<init>(r1, r2)
            com.google.android.material.timepicker.TimePickerView$4 r1 = new com.google.android.material.timepicker.TimePickerView$4
            r1.<init>(r3, r0)
            com.google.android.material.chip.Chip r0 = r3.minuteView
            r0.setOnTouchListener(r1)
            com.google.android.material.chip.Chip r0 = r3.hourView
            r0.setOnTouchListener(r1)
            return
    }

    private void updateToggleConstraints() {
            r3 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r3.toggle
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L25
            androidx.constraintlayout.widget.ConstraintSet r0 = new androidx.constraintlayout.widget.ConstraintSet
            r0.<init>()
            r0.clone(r3)
            int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            r2 = 1
            if (r1 != 0) goto L19
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 == 0) goto L1d
            r2 = 2
        L1d:
            int r1 = com.google.android.material.C0479R.id.material_clock_display
            r0.clear(r1, r2)
            r0.applyTo(r3)
        L25:
            return
    }

    public void addOnRotateListener(com.google.android.material.timepicker.ClockHandView.OnRotateListener r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.addOnRotateListener(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.updateToggleConstraints()
            return
    }

    @Override // android.view.View
    protected void onVisibilityChanged(android.view.View r1, int r2) {
            r0 = this;
            super.onVisibilityChanged(r1, r2)
            if (r1 != r0) goto La
            if (r2 != 0) goto La
            r0.updateToggleConstraints()
        La:
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int r5) {
            r4 = this;
            com.google.android.material.chip.Chip r0 = r4.minuteView
            r1 = 12
            r2 = 1
            r3 = 0
            if (r5 != r1) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r3
        Lb:
            r0.setChecked(r1)
            com.google.android.material.chip.Chip r0 = r4.hourView
            r1 = 10
            if (r5 != r1) goto L15
            goto L16
        L15:
            r2 = r3
        L16:
            r0.setChecked(r2)
            return
    }

    public void setAnimateOnTouchUp(boolean r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setAnimateOnTouchUp(r2)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2)
            return
    }

    public void setHandRotation(float r2, boolean r3) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setHandRotation(r2, r3)
            return
    }

    public void setHourClickDelegate(androidx.core.view.AccessibilityDelegateCompat r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.minuteView
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            return
    }

    public void setMinuteHourDelegate(androidx.core.view.AccessibilityDelegateCompat r2) {
            r1 = this;
            com.google.android.material.chip.Chip r0 = r1.hourView
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r0, r2)
            return
    }

    public void setOnActionUpListener(com.google.android.material.timepicker.ClockHandView.OnActionUpListener r2) {
            r1 = this;
            com.google.android.material.timepicker.ClockHandView r0 = r1.clockHandView
            r0.setOnActionUpListener(r2)
            return
    }

    void setOnDoubleTapListener(com.google.android.material.timepicker.TimePickerView.OnDoubleTapListener r1) {
            r0 = this;
            r0.onDoubleTapListener = r1
            return
    }

    void setOnPeriodChangeListener(com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener r1) {
            r0 = this;
            r0.onPeriodChangeListener = r1
            return
    }

    void setOnSelectionChangeListener(com.google.android.material.timepicker.TimePickerView.OnSelectionChange r1) {
            r0 = this;
            r0.onSelectionChangeListener = r1
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(java.lang.String[] r2, int r3) {
            r1 = this;
            com.google.android.material.timepicker.ClockFaceView r0 = r1.clockFace
            r0.setValues(r2, r3)
            return
    }

    public void showToggle() {
            r2 = this;
            com.google.android.material.button.MaterialButtonToggleGroup r0 = r2.toggle
            r1 = 0
            r0.setVisibility(r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void updateTime(int r4, int r5, int r6) {
            r3 = this;
            r0 = 1
            if (r4 != r0) goto L6
            int r4 = com.google.android.material.C0479R.id.material_clock_period_pm_button
            goto L8
        L6:
            int r4 = com.google.android.material.C0479R.id.material_clock_period_am_button
        L8:
            com.google.android.material.button.MaterialButtonToggleGroup r1 = r3.toggle
            r1.check(r4)
            android.content.res.Resources r4 = r3.getResources()
            android.content.res.Configuration r4 = r4.getConfiguration()
            java.util.Locale r4 = r4.locale
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r2 = 0
            r1[r2] = r6
            java.lang.String r6 = "%02d"
            java.lang.String r1 = java.lang.String.format(r4, r6, r1)
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0[r2] = r5
            java.lang.String r4 = java.lang.String.format(r4, r6, r0)
            com.google.android.material.chip.Chip r5 = r3.minuteView
            r5.setText(r1)
            com.google.android.material.chip.Chip r5 = r3.hourView
            r5.setText(r4)
            return
    }
}
