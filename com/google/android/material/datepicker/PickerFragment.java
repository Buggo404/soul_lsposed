package com.google.android.material.datepicker;

/* loaded from: classes.dex */
abstract class PickerFragment<S> extends androidx.fragment.app.Fragment {
    protected final java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> onSelectionChangedListeners;

    PickerFragment() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r1.onSelectionChangedListeners = r0
            return
    }

    boolean addOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> r0 = r1.onSelectionChangedListeners
            boolean r2 = r0.add(r2)
            return r2
    }

    void clearOnSelectionChangedListeners() {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> r0 = r1.onSelectionChangedListeners
            r0.clear()
            return
    }

    abstract com.google.android.material.datepicker.DateSelector<S> getDateSelector();

    boolean removeOnSelectionChangedListener(com.google.android.material.datepicker.OnSelectionChangedListener<S> r2) {
            r1 = this;
            java.util.LinkedHashSet<com.google.android.material.datepicker.OnSelectionChangedListener<S>> r0 = r1.onSelectionChangedListeners
            boolean r2 = r0.remove(r2)
            return r2
    }
}
