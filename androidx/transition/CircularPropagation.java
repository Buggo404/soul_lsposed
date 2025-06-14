package androidx.transition;

/* loaded from: classes.dex */
public class CircularPropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed;

    public CircularPropagation() {
            r1 = this;
            r1.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r1.mPropagationSpeed = r0
            return
    }

    private static float distance(float r0, float r1, float r2, float r3) {
            float r2 = r2 - r0
            float r3 = r3 - r1
            float r2 = r2 * r2
            float r3 = r3 * r3
            float r2 = r2 + r3
            double r0 = (double) r2
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup r9, androidx.transition.Transition r10, androidx.transition.TransitionValues r11, androidx.transition.TransitionValues r12) {
            r8 = this;
            r0 = 0
            if (r11 != 0) goto L7
            if (r12 != 0) goto L7
            return r0
        L7:
            r2 = 1
            if (r12 == 0) goto L14
            int r3 = r8.getViewVisibility(r11)
            if (r3 != 0) goto L11
            goto L14
        L11:
            r11 = r12
            r12 = r2
            goto L15
        L14:
            r12 = -1
        L15:
            int r3 = r8.getViewX(r11)
            int r11 = r8.getViewY(r11)
            android.graphics.Rect r4 = r10.getEpicenter()
            if (r4 == 0) goto L2c
            int r2 = r4.centerX()
            int r4 = r4.centerY()
            goto L58
        L2c:
            r4 = 2
            int[] r5 = new int[r4]
            r9.getLocationOnScreen(r5)
            r6 = 0
            r6 = r5[r6]
            int r7 = r9.getWidth()
            int r7 = r7 / r4
            int r6 = r6 + r7
            float r6 = (float) r6
            float r7 = r9.getTranslationX()
            float r6 = r6 + r7
            int r6 = java.lang.Math.round(r6)
            r2 = r5[r2]
            int r5 = r9.getHeight()
            int r5 = r5 / r4
            int r2 = r2 + r5
            float r2 = (float) r2
            float r4 = r9.getTranslationY()
            float r2 = r2 + r4
            int r4 = java.lang.Math.round(r2)
            r2 = r6
        L58:
            float r3 = (float) r3
            float r11 = (float) r11
            float r2 = (float) r2
            float r4 = (float) r4
            float r11 = distance(r3, r11, r2, r4)
            int r2 = r9.getWidth()
            float r2 = (float) r2
            int r9 = r9.getHeight()
            float r9 = (float) r9
            r3 = 0
            float r9 = distance(r3, r3, r2, r9)
            float r11 = r11 / r9
            long r9 = r10.getDuration()
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7a
            r9 = 300(0x12c, double:1.48E-321)
        L7a:
            long r0 = (long) r12
            long r9 = r9 * r0
            float r9 = (float) r9
            float r10 = r8.mPropagationSpeed
            float r9 = r9 / r10
            float r9 = r9 * r11
            int r9 = java.lang.Math.round(r9)
            long r9 = (long) r9
            return r9
    }

    public void setPropagationSpeed(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L8
            r1.mPropagationSpeed = r2
            return
        L8:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "propagationSpeed may not be 0"
            r2.<init>(r0)
            throw r2
    }
}
