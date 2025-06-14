package com.google.android.material.timepicker;

/* loaded from: classes.dex */
interface TimePickerControls {

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ActiveSelection {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ClockPeriod {
    }

    void setActiveSelection(int r1);

    void setHandRotation(float r1);

    void setValues(java.lang.String[] r1, int r2);

    void updateTime(int r1, int r2, int r3);
}
