package com.google.android.material.internal;

/* loaded from: classes.dex */
public class TextScale extends androidx.transition.Transition {
    private static final java.lang.String PROPNAME_SCALE = "android:textscale:scale";


    public TextScale() {
            r0 = this;
            r0.<init>()
            return
    }

    private void captureValues(androidx.transition.TransitionValues r3) {
            r2 = this;
            android.view.View r0 = r3.view
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L19
            android.view.View r0 = r3.view
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            float r0 = r0.getScaleX()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            java.lang.String r1 = "android:textscale:scale"
            r3.put(r1, r0)
        L19:
            return
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(androidx.transition.TransitionValues r1) {
            r0 = this;
            r0.captureValues(r1)
            return
    }

    @Override // androidx.transition.Transition
    public android.animation.Animator createAnimator(android.view.ViewGroup r5, androidx.transition.TransitionValues r6, androidx.transition.TransitionValues r7) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L5a
            if (r7 == 0) goto L5a
            android.view.View r0 = r6.view
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 == 0) goto L5a
            android.view.View r0 = r7.view
            boolean r0 = r0 instanceof android.widget.TextView
            if (r0 != 0) goto L12
            goto L5a
        L12:
            android.view.View r0 = r7.view
            android.widget.TextView r0 = (android.widget.TextView) r0
            java.util.Map<java.lang.String, java.lang.Object> r6 = r6.values
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.values
            java.lang.String r1 = "android:textscale:scale"
            java.lang.Object r2 = r6.get(r1)
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L2f
            java.lang.Object r6 = r6.get(r1)
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            goto L30
        L2f:
            r6 = r3
        L30:
            java.lang.Object r2 = r7.get(r1)
            if (r2 == 0) goto L40
            java.lang.Object r7 = r7.get(r1)
            java.lang.Float r7 = (java.lang.Float) r7
            float r3 = r7.floatValue()
        L40:
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 != 0) goto L45
            return r5
        L45:
            r5 = 2
            float[] r5 = new float[r5]
            r7 = 0
            r5[r7] = r6
            r6 = 1
            r5[r6] = r3
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            com.google.android.material.internal.TextScale$1 r6 = new com.google.android.material.internal.TextScale$1
            r6.<init>(r4, r0)
            r5.addUpdateListener(r6)
        L5a:
            return r5
    }
}
