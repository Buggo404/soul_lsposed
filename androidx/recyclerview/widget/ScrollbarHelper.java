package androidx.recyclerview.widget;

/* loaded from: classes.dex */
class ScrollbarHelper {
    private ScrollbarHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    static int computeScrollExtent(androidx.recyclerview.widget.RecyclerView.State r1, androidx.recyclerview.widget.OrientationHelper r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView.LayoutManager r5, boolean r6) {
            int r0 = r5.getChildCount()
            if (r0 == 0) goto L35
            int r1 = r1.getItemCount()
            if (r1 == 0) goto L35
            if (r3 == 0) goto L35
            if (r4 != 0) goto L11
            goto L35
        L11:
            if (r6 != 0) goto L23
            int r1 = r5.getPosition(r3)
            int r2 = r5.getPosition(r4)
            int r1 = r1 - r2
            int r1 = java.lang.Math.abs(r1)
            int r1 = r1 + 1
            return r1
        L23:
            int r1 = r2.getDecoratedEnd(r4)
            int r3 = r2.getDecoratedStart(r3)
            int r1 = r1 - r3
            int r2 = r2.getTotalSpace()
            int r1 = java.lang.Math.min(r2, r1)
            return r1
        L35:
            r1 = 0
            return r1
    }

    static int computeScrollOffset(androidx.recyclerview.widget.RecyclerView.State r4, androidx.recyclerview.widget.OrientationHelper r5, android.view.View r6, android.view.View r7, androidx.recyclerview.widget.RecyclerView.LayoutManager r8, boolean r9, boolean r10) {
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 == 0) goto L70
            int r0 = r4.getItemCount()
            if (r0 == 0) goto L70
            if (r6 == 0) goto L70
            if (r7 != 0) goto L12
            goto L70
        L12:
            int r0 = r8.getPosition(r6)
            int r2 = r8.getPosition(r7)
            int r0 = java.lang.Math.min(r0, r2)
            int r2 = r8.getPosition(r6)
            int r3 = r8.getPosition(r7)
            int r2 = java.lang.Math.max(r2, r3)
            if (r10 == 0) goto L38
            int r4 = r4.getItemCount()
            int r4 = r4 - r2
            int r4 = r4 + (-1)
            int r4 = java.lang.Math.max(r1, r4)
            goto L3c
        L38:
            int r4 = java.lang.Math.max(r1, r0)
        L3c:
            if (r9 != 0) goto L3f
            return r4
        L3f:
            int r9 = r5.getDecoratedEnd(r7)
            int r10 = r5.getDecoratedStart(r6)
            int r9 = r9 - r10
            int r9 = java.lang.Math.abs(r9)
            int r10 = r8.getPosition(r6)
            int r7 = r8.getPosition(r7)
            int r10 = r10 - r7
            int r7 = java.lang.Math.abs(r10)
            int r7 = r7 + 1
            float r8 = (float) r9
            float r7 = (float) r7
            float r8 = r8 / r7
            float r4 = (float) r4
            float r4 = r4 * r8
            int r7 = r5.getStartAfterPadding()
            int r5 = r5.getDecoratedStart(r6)
            int r7 = r7 - r5
            float r5 = (float) r7
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            return r4
        L70:
            return r1
    }

    static int computeScrollRange(androidx.recyclerview.widget.RecyclerView.State r1, androidx.recyclerview.widget.OrientationHelper r2, android.view.View r3, android.view.View r4, androidx.recyclerview.widget.RecyclerView.LayoutManager r5, boolean r6) {
            int r0 = r5.getChildCount()
            if (r0 == 0) goto L3b
            int r0 = r1.getItemCount()
            if (r0 == 0) goto L3b
            if (r3 == 0) goto L3b
            if (r4 != 0) goto L11
            goto L3b
        L11:
            if (r6 != 0) goto L18
            int r1 = r1.getItemCount()
            return r1
        L18:
            int r6 = r2.getDecoratedEnd(r4)
            int r2 = r2.getDecoratedStart(r3)
            int r6 = r6 - r2
            int r2 = r5.getPosition(r3)
            int r3 = r5.getPosition(r4)
            int r2 = r2 - r3
            int r2 = java.lang.Math.abs(r2)
            int r2 = r2 + 1
            float r3 = (float) r6
            float r2 = (float) r2
            float r3 = r3 / r2
            int r1 = r1.getItemCount()
            float r1 = (float) r1
            float r3 = r3 * r1
            int r1 = (int) r3
            return r1
        L3b:
            r1 = 0
            return r1
    }
}
