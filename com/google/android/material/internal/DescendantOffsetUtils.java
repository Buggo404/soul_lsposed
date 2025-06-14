package com.google.android.material.internal;

/* loaded from: classes.dex */
public class DescendantOffsetUtils {
    private static final java.lang.ThreadLocal<android.graphics.Matrix> matrix = null;
    private static final java.lang.ThreadLocal<android.graphics.RectF> rectF = null;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.material.internal.DescendantOffsetUtils.matrix = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.google.android.material.internal.DescendantOffsetUtils.rectF = r0
            return
    }

    public DescendantOffsetUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void getDescendantRect(android.view.ViewGroup r3, android.view.View r4, android.graphics.Rect r5) {
            int r0 = r4.getWidth()
            int r1 = r4.getHeight()
            r2 = 0
            r5.set(r2, r2, r0, r1)
            offsetDescendantRect(r3, r4, r5)
            return
    }

    private static void offsetDescendantMatrix(android.view.ViewParent r2, android.view.View r3, android.graphics.Matrix r4) {
            android.view.ViewParent r0 = r3.getParent()
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L1e
            if (r0 == r2) goto L1e
            android.view.View r0 = (android.view.View) r0
            offsetDescendantMatrix(r2, r0, r4)
            int r2 = r0.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r0 = r0.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
        L1e:
            int r2 = r3.getLeft()
            float r2 = (float) r2
            int r0 = r3.getTop()
            float r0 = (float) r0
            r4.preTranslate(r2, r0)
            android.graphics.Matrix r2 = r3.getMatrix()
            boolean r2 = r2.isIdentity()
            if (r2 != 0) goto L3c
            android.graphics.Matrix r2 = r3.getMatrix()
            r4.preConcat(r2)
        L3c:
            return
    }

    public static void offsetDescendantRect(android.view.ViewGroup r3, android.view.View r4, android.graphics.Rect r5) {
            java.lang.ThreadLocal<android.graphics.Matrix> r0 = com.google.android.material.internal.DescendantOffsetUtils.matrix
            java.lang.Object r1 = r0.get()
            android.graphics.Matrix r1 = (android.graphics.Matrix) r1
            if (r1 != 0) goto L13
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r0.set(r1)
            goto L16
        L13:
            r1.reset()
        L16:
            offsetDescendantMatrix(r3, r4, r1)
            java.lang.ThreadLocal<android.graphics.RectF> r3 = com.google.android.material.internal.DescendantOffsetUtils.rectF
            java.lang.Object r4 = r3.get()
            android.graphics.RectF r4 = (android.graphics.RectF) r4
            if (r4 != 0) goto L2b
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r3.set(r4)
        L2b:
            r4.set(r5)
            r1.mapRect(r4)
            float r3 = r4.left
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 + r0
            int r3 = (int) r3
            float r1 = r4.top
            float r1 = r1 + r0
            int r1 = (int) r1
            float r2 = r4.right
            float r2 = r2 + r0
            int r2 = (int) r2
            float r4 = r4.bottom
            float r4 = r4 + r0
            int r4 = (int) r4
            r5.set(r3, r1, r2, r4)
            return
    }
}
