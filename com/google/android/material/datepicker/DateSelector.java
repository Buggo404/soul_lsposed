package com.google.android.material.datepicker;

/* loaded from: classes.dex */
public interface DateSelector<S> extends android.os.Parcelable {
    int getDefaultThemeResId(android.content.Context r1);

    int getDefaultTitleResId();

    java.util.Collection<java.lang.Long> getSelectedDays();

    java.util.Collection<androidx.core.util.Pair<java.lang.Long, java.lang.Long>> getSelectedRanges();

    S getSelection();

    java.lang.String getSelectionDisplayString(android.content.Context r1);

    boolean isSelectionComplete();

    android.view.View onCreateTextInputView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3, com.google.android.material.datepicker.CalendarConstraints r4, com.google.android.material.datepicker.OnSelectionChangedListener<S> r5);

    void select(long r1);

    void setSelection(S r1);
}
