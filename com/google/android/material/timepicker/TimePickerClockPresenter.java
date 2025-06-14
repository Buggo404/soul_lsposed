package com.google.android.material.timepicker;

/* loaded from: classes.dex */
class TimePickerClockPresenter implements com.google.android.material.timepicker.ClockHandView.OnRotateListener, com.google.android.material.timepicker.TimePickerView.OnSelectionChange, com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener, com.google.android.material.timepicker.ClockHandView.OnActionUpListener, com.google.android.material.timepicker.TimePickerPresenter {
    private static final int DEGREES_PER_HOUR = 30;
    private static final int DEGREES_PER_MINUTE = 6;
    private static final java.lang.String[] HOUR_CLOCK_24_VALUES = null;
    private static final java.lang.String[] HOUR_CLOCK_VALUES = null;
    private static final java.lang.String[] MINUTE_CLOCK_VALUES = null;
    private boolean broadcasting;
    private float hourRotation;
    private float minuteRotation;
    private com.google.android.material.timepicker.TimeModel time;
    private com.google.android.material.timepicker.TimePickerView timePickerView;

    static {
            java.lang.String r0 = "12"
            java.lang.String r1 = "1"
            java.lang.String r2 = "2"
            java.lang.String r3 = "3"
            java.lang.String r4 = "4"
            java.lang.String r5 = "5"
            java.lang.String r6 = "6"
            java.lang.String r7 = "7"
            java.lang.String r8 = "8"
            java.lang.String r9 = "9"
            java.lang.String r10 = "10"
            java.lang.String r11 = "11"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_VALUES = r0
            java.lang.String r1 = "00"
            java.lang.String r2 = "2"
            java.lang.String r3 = "4"
            java.lang.String r4 = "6"
            java.lang.String r5 = "8"
            java.lang.String r6 = "10"
            java.lang.String r7 = "12"
            java.lang.String r8 = "14"
            java.lang.String r9 = "16"
            java.lang.String r10 = "18"
            java.lang.String r11 = "20"
            java.lang.String r12 = "22"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_24_VALUES = r0
            java.lang.String r1 = "00"
            java.lang.String r2 = "5"
            java.lang.String r3 = "10"
            java.lang.String r4 = "15"
            java.lang.String r5 = "20"
            java.lang.String r6 = "25"
            java.lang.String r7 = "30"
            java.lang.String r8 = "35"
            java.lang.String r9 = "40"
            java.lang.String r10 = "45"
            java.lang.String r11 = "50"
            java.lang.String r12 = "55"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12}
            com.google.android.material.timepicker.TimePickerClockPresenter.MINUTE_CLOCK_VALUES = r0
            return
    }

    public TimePickerClockPresenter(com.google.android.material.timepicker.TimePickerView r2, com.google.android.material.timepicker.TimeModel r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.broadcasting = r0
            r1.timePickerView = r2
            r1.time = r3
            r1.initialize()
            return
    }

    private int getDegreesPerHour() {
            r2 = this;
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            int r0 = r0.format
            r1 = 1
            if (r0 != r1) goto La
            r0 = 15
            goto Lc
        La:
            r0 = 30
        Lc:
            return r0
    }

    private java.lang.String[] getHourClockValues() {
            r2 = this;
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            int r0 = r0.format
            r1 = 1
            if (r0 != r1) goto La
            java.lang.String[] r0 = com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_24_VALUES
            goto Lc
        La:
            java.lang.String[] r0 = com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_VALUES
        Lc:
            return r0
    }

    private void performHapticFeedback(int r2, int r3) {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.minute
            if (r0 != r3) goto Lc
            com.google.android.material.timepicker.TimeModel r3 = r1.time
            int r3 = r3.hour
            if (r3 == r2) goto L12
        Lc:
            com.google.android.material.timepicker.TimePickerView r2 = r1.timePickerView
            r3 = 4
            r2.performHapticFeedback(r3)
        L12:
            return
    }

    private void updateTime() {
            r4 = this;
            com.google.android.material.timepicker.TimePickerView r0 = r4.timePickerView
            com.google.android.material.timepicker.TimeModel r1 = r4.time
            int r1 = r1.period
            com.google.android.material.timepicker.TimeModel r2 = r4.time
            int r2 = r2.getHourForDisplay()
            com.google.android.material.timepicker.TimeModel r3 = r4.time
            int r3 = r3.minute
            r0.updateTime(r1, r2, r3)
            return
    }

    private void updateValues() {
            r2 = this;
            java.lang.String[] r0 = com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_VALUES
            java.lang.String r1 = "%d"
            r2.updateValues(r0, r1)
            java.lang.String[] r0 = com.google.android.material.timepicker.TimePickerClockPresenter.HOUR_CLOCK_24_VALUES
            r2.updateValues(r0, r1)
            java.lang.String[] r0 = com.google.android.material.timepicker.TimePickerClockPresenter.MINUTE_CLOCK_VALUES
            java.lang.String r1 = "%02d"
            r2.updateValues(r0, r1)
            return
    }

    private void updateValues(java.lang.String[] r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r4.length
            if (r0 >= r1) goto L15
            com.google.android.material.timepicker.TimePickerView r1 = r3.timePickerView
            android.content.res.Resources r1 = r1.getResources()
            r2 = r4[r0]
            java.lang.String r1 = com.google.android.material.timepicker.TimeModel.formatText(r1, r2, r5)
            r4[r0] = r1
            int r0 = r0 + 1
            goto L1
        L15:
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void hide() {
            r2 = this;
            com.google.android.material.timepicker.TimePickerView r0 = r2.timePickerView
            r1 = 8
            r0.setVisibility(r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void initialize() {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            int r0 = r0.format
            if (r0 != 0) goto Lb
            com.google.android.material.timepicker.TimePickerView r0 = r1.timePickerView
            r0.showToggle()
        Lb:
            com.google.android.material.timepicker.TimePickerView r0 = r1.timePickerView
            r0.addOnRotateListener(r1)
            com.google.android.material.timepicker.TimePickerView r0 = r1.timePickerView
            r0.setOnSelectionChangeListener(r1)
            com.google.android.material.timepicker.TimePickerView r0 = r1.timePickerView
            r0.setOnPeriodChangeListener(r1)
            com.google.android.material.timepicker.TimePickerView r0 = r1.timePickerView
            r0.setOnActionUpListener(r1)
            r1.updateValues()
            r1.invalidate()
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void invalidate() {
            r2 = this;
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            int r0 = r0.getHourForDisplay()
            int r1 = r2.getDegreesPerHour()
            int r0 = r0 * r1
            float r0 = (float) r0
            r2.hourRotation = r0
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            int r0 = r0.minute
            int r0 = r0 * 6
            float r0 = (float) r0
            r2.minuteRotation = r0
            com.google.android.material.timepicker.TimeModel r0 = r2.time
            int r0 = r0.selection
            r1 = 0
            r2.setSelection(r0, r1)
            r2.updateTime()
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnActionUpListener
    public void onActionUp(float r7, boolean r8) {
            r6 = this;
            r0 = 1
            r6.broadcasting = r0
            com.google.android.material.timepicker.TimeModel r1 = r6.time
            int r1 = r1.minute
            com.google.android.material.timepicker.TimeModel r2 = r6.time
            int r2 = r2.hour
            com.google.android.material.timepicker.TimeModel r3 = r6.time
            int r3 = r3.selection
            r4 = 10
            r5 = 0
            if (r3 != r4) goto L35
            com.google.android.material.timepicker.TimePickerView r7 = r6.timePickerView
            float r8 = r6.hourRotation
            r7.setHandRotation(r8, r5)
            com.google.android.material.timepicker.TimePickerView r7 = r6.timePickerView
            android.content.Context r7 = r7.getContext()
            java.lang.Class<android.view.accessibility.AccessibilityManager> r8 = android.view.accessibility.AccessibilityManager.class
            java.lang.Object r7 = androidx.core.content.ContextCompat.getSystemService(r7, r8)
            android.view.accessibility.AccessibilityManager r7 = (android.view.accessibility.AccessibilityManager) r7
            boolean r7 = r7.isTouchExplorationEnabled()
            if (r7 != 0) goto L56
            r7 = 12
            r6.setSelection(r7, r0)
            goto L56
        L35:
            int r7 = java.lang.Math.round(r7)
            if (r8 != 0) goto L4f
            int r7 = r7 + 15
            int r7 = r7 / 30
            com.google.android.material.timepicker.TimeModel r0 = r6.time
            int r7 = r7 * 5
            r0.setMinute(r7)
            com.google.android.material.timepicker.TimeModel r7 = r6.time
            int r7 = r7.minute
            int r7 = r7 * 6
            float r7 = (float) r7
            r6.minuteRotation = r7
        L4f:
            com.google.android.material.timepicker.TimePickerView r7 = r6.timePickerView
            float r0 = r6.minuteRotation
            r7.setHandRotation(r0, r8)
        L56:
            r6.broadcasting = r5
            r6.updateTime()
            r6.performHapticFeedback(r2, r1)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnPeriodChangeListener
    public void onPeriodChange(int r2) {
            r1 = this;
            com.google.android.material.timepicker.TimeModel r0 = r1.time
            r0.setPeriod(r2)
            return
    }

    @Override // com.google.android.material.timepicker.ClockHandView.OnRotateListener
    public void onRotate(float r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.broadcasting
            if (r0 == 0) goto L5
            return
        L5:
            com.google.android.material.timepicker.TimeModel r0 = r4.time
            int r0 = r0.hour
            com.google.android.material.timepicker.TimeModel r1 = r4.time
            int r1 = r1.minute
            int r5 = java.lang.Math.round(r5)
            com.google.android.material.timepicker.TimeModel r2 = r4.time
            int r2 = r2.selection
            r3 = 12
            if (r2 != r3) goto L31
            com.google.android.material.timepicker.TimeModel r2 = r4.time
            int r5 = r5 + 3
            int r5 = r5 / 6
            r2.setMinute(r5)
            com.google.android.material.timepicker.TimeModel r5 = r4.time
            int r5 = r5.minute
            int r5 = r5 * 6
            double r2 = (double) r5
            double r2 = java.lang.Math.floor(r2)
            float r5 = (float) r2
            r4.minuteRotation = r5
            goto L50
        L31:
            int r2 = r4.getDegreesPerHour()
            int r2 = r2 / 2
            com.google.android.material.timepicker.TimeModel r3 = r4.time
            int r5 = r5 + r2
            int r2 = r4.getDegreesPerHour()
            int r5 = r5 / r2
            r3.setHour(r5)
            com.google.android.material.timepicker.TimeModel r5 = r4.time
            int r5 = r5.getHourForDisplay()
            int r2 = r4.getDegreesPerHour()
            int r5 = r5 * r2
            float r5 = (float) r5
            r4.hourRotation = r5
        L50:
            if (r6 != 0) goto L58
            r4.updateTime()
            r4.performHapticFeedback(r0, r1)
        L58:
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerView.OnSelectionChange
    public void onSelectionChanged(int r2) {
            r1 = this;
            r0 = 1
            r1.setSelection(r2, r0)
            return
    }

    void setSelection(int r5, boolean r6) {
            r4 = this;
            r0 = 12
            if (r5 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            com.google.android.material.timepicker.TimePickerView r1 = r4.timePickerView
            r1.setAnimateOnTouchUp(r0)
            com.google.android.material.timepicker.TimeModel r1 = r4.time
            r1.selection = r5
            com.google.android.material.timepicker.TimePickerView r1 = r4.timePickerView
            if (r0 == 0) goto L17
            java.lang.String[] r2 = com.google.android.material.timepicker.TimePickerClockPresenter.MINUTE_CLOCK_VALUES
            goto L1b
        L17:
            java.lang.String[] r2 = r4.getHourClockValues()
        L1b:
            if (r0 == 0) goto L20
            int r3 = com.google.android.material.C0479R.string.material_minute_suffix
            goto L22
        L20:
            int r3 = com.google.android.material.C0479R.string.material_hour_suffix
        L22:
            r1.setValues(r2, r3)
            com.google.android.material.timepicker.TimePickerView r1 = r4.timePickerView
            if (r0 == 0) goto L2c
            float r0 = r4.minuteRotation
            goto L2e
        L2c:
            float r0 = r4.hourRotation
        L2e:
            r1.setHandRotation(r0, r6)
            com.google.android.material.timepicker.TimePickerView r6 = r4.timePickerView
            r6.setActiveSelection(r5)
            com.google.android.material.timepicker.TimePickerView r5 = r4.timePickerView
            com.google.android.material.timepicker.ClickActionDelegate r6 = new com.google.android.material.timepicker.ClickActionDelegate
            com.google.android.material.timepicker.TimePickerView r0 = r4.timePickerView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.string.material_hour_selection
            r6.<init>(r0, r1)
            r5.setMinuteHourDelegate(r6)
            com.google.android.material.timepicker.TimePickerView r5 = r4.timePickerView
            com.google.android.material.timepicker.ClickActionDelegate r6 = new com.google.android.material.timepicker.ClickActionDelegate
            com.google.android.material.timepicker.TimePickerView r0 = r4.timePickerView
            android.content.Context r0 = r0.getContext()
            int r1 = com.google.android.material.C0479R.string.material_minute_selection
            r6.<init>(r0, r1)
            r5.setHourClickDelegate(r6)
            return
    }

    @Override // com.google.android.material.timepicker.TimePickerPresenter
    public void show() {
            r2 = this;
            com.google.android.material.timepicker.TimePickerView r0 = r2.timePickerView
            r1 = 0
            r0.setVisibility(r1)
            return
    }
}
