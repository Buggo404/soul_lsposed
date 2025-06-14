package com.google.android.material.datepicker;

/* loaded from: classes.dex */
class SmoothCalendarLayoutManager extends androidx.recyclerview.widget.LinearLayoutManager {
    private static final float MILLISECONDS_PER_INCH = 100.0f;


    SmoothCalendarLayoutManager(android.content.Context r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.State r2, int r3) {
            r0 = this;
            com.google.android.material.datepicker.SmoothCalendarLayoutManager$1 r2 = new com.google.android.material.datepicker.SmoothCalendarLayoutManager$1
            android.content.Context r1 = r1.getContext()
            r2.<init>(r0, r1)
            r2.setTargetPosition(r3)
            r0.startSmoothScroll(r2)
            return
    }
}
