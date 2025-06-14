package androidx.core.view;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final java.lang.Object mDisplayCutout;

    public DisplayCutoutCompat(android.graphics.Rect r3, java.util.List<android.graphics.Rect> r4) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            android.view.DisplayCutout r0 = new android.view.DisplayCutout
            r0.<init>(r3, r4)
            goto Ld
        Lc:
            r0 = 0
        Ld:
            r2.<init>(r0)
            return
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets r1, android.graphics.Rect r2, android.graphics.Rect r3, android.graphics.Rect r4, android.graphics.Rect r5, androidx.core.graphics.Insets r6) {
            r0 = this;
            android.view.DisplayCutout r1 = constructDisplayCutout(r1, r2, r3, r4, r5, r6)
            r0.<init>(r1)
            return
    }

    private DisplayCutoutCompat(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mDisplayCutout = r1
            return
    }

    private static android.view.DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets r8, android.graphics.Rect r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12, androidx.core.graphics.Insets r13) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastR()
            if (r0 == 0) goto L19
            android.view.DisplayCutout r0 = new android.view.DisplayCutout
            android.graphics.Insets r2 = r8.toPlatformInsets()
            android.graphics.Insets r7 = r13.toPlatformInsets()
            r1 = r0
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            return r0
        L19:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r13 < r0) goto L2e
            android.view.DisplayCutout r13 = new android.view.DisplayCutout
            android.graphics.Insets r2 = r8.toPlatformInsets()
            r1 = r13
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            return r13
        L2e:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r13 < r0) goto L60
            android.graphics.Rect r13 = new android.graphics.Rect
            int r0 = r8.left
            int r1 = r8.top
            int r2 = r8.right
            int r8 = r8.bottom
            r13.<init>(r0, r1, r2, r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            if (r9 == 0) goto L4b
            r8.add(r9)
        L4b:
            if (r10 == 0) goto L50
            r8.add(r10)
        L50:
            if (r11 == 0) goto L55
            r8.add(r11)
        L55:
            if (r12 == 0) goto L5a
            r8.add(r12)
        L5a:
            android.view.DisplayCutout r9 = new android.view.DisplayCutout
            r9.<init>(r13, r8)
            return r9
        L60:
            r8 = 0
            return r8
    }

    static androidx.core.view.DisplayCutoutCompat wrap(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            goto La
        L4:
            androidx.core.view.DisplayCutoutCompat r0 = new androidx.core.view.DisplayCutoutCompat
            r0.<init>(r1)
            r1 = r0
        La:
            return r1
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1c
            java.lang.Class r0 = r2.getClass()
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto L11
            goto L1c
        L11:
            androidx.core.view.DisplayCutoutCompat r3 = (androidx.core.view.DisplayCutoutCompat) r3
            java.lang.Object r0 = r2.mDisplayCutout
            java.lang.Object r3 = r3.mDisplayCutout
            boolean r3 = androidx.core.util.ObjectsCompat.equals(r0, r3)
            return r3
        L1c:
            r3 = 0
            return r3
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            java.util.List r0 = r0.getBoundingRects()
            return r0
        Lf:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
    }

    public int getSafeInsetBottom() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            int r0 = r0.getSafeInsetBottom()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getSafeInsetLeft() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            int r0 = r0.getSafeInsetLeft()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getSafeInsetRight() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            int r0 = r0.getSafeInsetRight()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public int getSafeInsetTop() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.Object r0 = r2.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            int r0 = r0.getSafeInsetTop()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
            r1 = this;
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastR()
            if (r0 == 0) goto L13
            java.lang.Object r0 = r1.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            android.graphics.Insets r0 = r0.getWaterfallInsets()
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.toCompatInsets(r0)
            return r0
        L13:
            androidx.core.graphics.Insets r0 = androidx.core.graphics.Insets.NONE
            return r0
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.mDisplayCutout
            if (r0 != 0) goto L6
            r0 = 0
            goto La
        L6:
            int r0 = r0.hashCode()
        La:
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "DisplayCutoutCompat{"
            r0.<init>(r1)
            java.lang.Object r1 = r2.mDisplayCutout
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "}"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    android.view.DisplayCutout unwrap() {
            r1 = this;
            java.lang.Object r0 = r1.mDisplayCutout
            android.view.DisplayCutout r0 = (android.view.DisplayCutout) r0
            return r0
    }
}
