package androidx.transition;

/* loaded from: classes.dex */
public abstract class VisibilityPropagation extends androidx.transition.TransitionPropagation {
    private static final java.lang.String PROPNAME_VIEW_CENTER = "android:visibilityPropagation:center";
    private static final java.lang.String PROPNAME_VISIBILITY = "android:visibilityPropagation:visibility";
    private static final java.lang.String[] VISIBILITY_PROPAGATION_VALUES = null;

    static {
            java.lang.String r0 = "android:visibilityPropagation:visibility"
            java.lang.String r1 = "android:visibilityPropagation:center"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            androidx.transition.VisibilityPropagation.VISIBILITY_PROPAGATION_VALUES = r0
            return
    }

    public VisibilityPropagation() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getViewCoordinate(androidx.transition.TransitionValues r2, int r3) {
            r0 = -1
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r2.values
            java.lang.String r1 = "android:visibilityPropagation:center"
            java.lang.Object r2 = r2.get(r1)
            int[] r2 = (int[]) r2
            int[] r2 = (int[]) r2
            if (r2 != 0) goto L13
            return r0
        L13:
            r2 = r2[r3]
            return r2
    }

    @Override // androidx.transition.TransitionPropagation
    public void captureValues(androidx.transition.TransitionValues r7) {
            r6 = this;
            android.view.View r0 = r7.view
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.values
            java.lang.String r2 = "android:visibility:visibility"
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L16
            int r1 = r0.getVisibility()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L16:
            java.util.Map<java.lang.String, java.lang.Object> r2 = r7.values
            java.lang.String r3 = "android:visibilityPropagation:visibility"
            r2.put(r3, r1)
            r1 = 2
            int[] r2 = new int[r1]
            r0.getLocationOnScreen(r2)
            r3 = 0
            r4 = r2[r3]
            float r5 = r0.getTranslationX()
            int r5 = java.lang.Math.round(r5)
            int r4 = r4 + r5
            r2[r3] = r4
            int r5 = r0.getWidth()
            int r5 = r5 / r1
            int r4 = r4 + r5
            r2[r3] = r4
            r3 = 1
            r4 = r2[r3]
            float r5 = r0.getTranslationY()
            int r5 = java.lang.Math.round(r5)
            int r4 = r4 + r5
            r2[r3] = r4
            int r0 = r0.getHeight()
            int r0 = r0 / r1
            int r4 = r4 + r0
            r2[r3] = r4
            java.util.Map<java.lang.String, java.lang.Object> r7 = r7.values
            java.lang.String r0 = "android:visibilityPropagation:center"
            r7.put(r0, r2)
            return
    }

    @Override // androidx.transition.TransitionPropagation
    public java.lang.String[] getPropagationProperties() {
            r1 = this;
            java.lang.String[] r0 = androidx.transition.VisibilityPropagation.VISIBILITY_PROPAGATION_VALUES
            return r0
    }

    public int getViewVisibility(androidx.transition.TransitionValues r3) {
            r2 = this;
            r0 = 8
            if (r3 != 0) goto L5
            return r0
        L5:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.values
            java.lang.String r1 = "android:visibilityPropagation:visibility"
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L12
            return r0
        L12:
            int r3 = r3.intValue()
            return r3
    }

    public int getViewX(androidx.transition.TransitionValues r2) {
            r1 = this;
            r0 = 0
            int r2 = getViewCoordinate(r2, r0)
            return r2
    }

    public int getViewY(androidx.transition.TransitionValues r2) {
            r1 = this;
            r0 = 1
            int r2 = getViewCoordinate(r2, r0)
            return r2
    }
}
