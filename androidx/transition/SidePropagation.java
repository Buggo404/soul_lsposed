package androidx.transition;

/* loaded from: classes.dex */
public class SidePropagation extends androidx.transition.VisibilityPropagation {
    private float mPropagationSpeed;
    private int mSide;

    public SidePropagation() {
            r1 = this;
            r1.<init>()
            r0 = 1077936128(0x40400000, float:3.0)
            r1.mPropagationSpeed = r0
            r0 = 80
            r1.mSide = r0
            return
    }

    private int distance(android.view.View r7, int r8, int r9, int r10, int r11, int r12, int r13, int r14, int r15) {
            r6 = this;
            int r0 = r6.mSide
            r1 = 8388611(0x800003, float:1.1754948E-38)
            r2 = 5
            r3 = 3
            r4 = 0
            r5 = 1
            if (r0 != r1) goto L19
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r5) goto L12
            goto L13
        L12:
            r5 = r4
        L13:
            if (r5 == 0) goto L17
        L15:
            r0 = r2
            goto L29
        L17:
            r0 = r3
            goto L29
        L19:
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 != r1) goto L29
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r7)
            if (r7 != r5) goto L25
            goto L26
        L25:
            r5 = r4
        L26:
            if (r5 == 0) goto L15
            goto L17
        L29:
            if (r0 == r3) goto L51
            if (r0 == r2) goto L48
            r7 = 48
            if (r0 == r7) goto L3f
            r7 = 80
            if (r0 == r7) goto L36
            goto L59
        L36:
            int r9 = r9 - r13
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r9 + r7
            goto L59
        L3f:
            int r15 = r15 - r9
            int r10 = r10 - r8
            int r7 = java.lang.Math.abs(r10)
            int r4 = r15 + r7
            goto L59
        L48:
            int r8 = r8 - r12
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r8 + r7
            goto L59
        L51:
            int r14 = r14 - r8
            int r11 = r11 - r9
            int r7 = java.lang.Math.abs(r11)
            int r4 = r14 + r7
        L59:
            return r4
    }

    private int getMaxDistance(android.view.ViewGroup r3) {
            r2 = this;
            int r0 = r2.mSide
            r1 = 3
            if (r0 == r1) goto L17
            r1 = 5
            if (r0 == r1) goto L17
            r1 = 8388611(0x800003, float:1.1754948E-38)
            if (r0 == r1) goto L17
            r1 = 8388613(0x800005, float:1.175495E-38)
            if (r0 == r1) goto L17
            int r3 = r3.getHeight()
            return r3
        L17:
            int r3 = r3.getWidth()
            return r3
    }

    @Override // androidx.transition.TransitionPropagation
    public long getStartDelay(android.view.ViewGroup r17, androidx.transition.Transition r18, androidx.transition.TransitionValues r19, androidx.transition.TransitionValues r20) {
            r16 = this;
            r10 = r16
            r0 = r19
            r11 = 0
            if (r0 != 0) goto Lb
            if (r20 != 0) goto Lb
            return r11
        Lb:
            android.graphics.Rect r1 = r18.getEpicenter()
            r2 = 1
            if (r20 == 0) goto L1d
            int r3 = r10.getViewVisibility(r0)
            if (r3 != 0) goto L19
            goto L1d
        L19:
            r0 = r20
            r13 = r2
            goto L1f
        L1d:
            r3 = -1
            r13 = r3
        L1f:
            int r3 = r10.getViewX(r0)
            int r4 = r10.getViewY(r0)
            r0 = 2
            int[] r5 = new int[r0]
            r14 = r17
            r14.getLocationOnScreen(r5)
            r6 = 0
            r6 = r5[r6]
            float r7 = r17.getTranslationX()
            int r7 = java.lang.Math.round(r7)
            int r6 = r6 + r7
            r2 = r5[r2]
            float r5 = r17.getTranslationY()
            int r5 = java.lang.Math.round(r5)
            int r7 = r2 + r5
            int r2 = r17.getWidth()
            int r8 = r6 + r2
            int r2 = r17.getHeight()
            int r9 = r7 + r2
            if (r1 == 0) goto L60
            int r0 = r1.centerX()
            int r1 = r1.centerY()
            r5 = r0
            r15 = r1
            goto L68
        L60:
            int r1 = r6 + r8
            int r1 = r1 / r0
            int r2 = r7 + r9
            int r2 = r2 / r0
            r5 = r1
            r15 = r2
        L68:
            r0 = r16
            r1 = r17
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r15
            int r0 = r0.distance(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            float r0 = (float) r0
            int r1 = r16.getMaxDistance(r17)
            float r1 = (float) r1
            float r0 = r0 / r1
            long r1 = r18.getDuration()
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 >= 0) goto L85
            r1 = 300(0x12c, double:1.48E-321)
        L85:
            long r3 = (long) r13
            long r1 = r1 * r3
            float r1 = (float) r1
            float r2 = r10.mPropagationSpeed
            float r1 = r1 / r2
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            long r0 = (long) r0
            return r0
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

    public void setSide(int r1) {
            r0 = this;
            r0.mSide = r1
            return
    }
}
