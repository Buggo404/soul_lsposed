package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public class FabTransformationSheetBehavior extends com.google.android.material.transformation.FabTransformationBehavior {
    private java.util.Map<android.view.View, java.lang.Integer> importantForAccessibilityMap;

    public FabTransformationSheetBehavior() {
            r0 = this;
            r0.<init>()
            return
    }

    public FabTransformationSheetBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private void updateImportantForAccessibility(android.view.View r8, boolean r9) {
            r7 = this;
            android.view.ViewParent r0 = r8.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L9
            return
        L9:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r9 == 0) goto L18
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r7.importantForAccessibilityMap = r2
        L18:
            r2 = 0
            r3 = r2
        L1a:
            if (r3 >= r1) goto L6e
            android.view.View r4 = r0.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            boolean r5 = r5 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r5 == 0) goto L38
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r5 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r5
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r5 = r5.getBehavior()
            boolean r5 = r5 instanceof com.google.android.material.transformation.FabTransformationScrimBehavior
            if (r5 == 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = r2
        L39:
            if (r4 == r8) goto L6b
            if (r5 == 0) goto L3e
            goto L6b
        L3e:
            if (r9 != 0) goto L5a
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.importantForAccessibilityMap
            if (r5 == 0) goto L6b
            boolean r5 = r5.containsKey(r4)
            if (r5 == 0) goto L6b
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.importantForAccessibilityMap
            java.lang.Object r5 = r5.get(r4)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r5)
            goto L6b
        L5a:
            java.util.Map<android.view.View, java.lang.Integer> r5 = r7.importantForAccessibilityMap
            int r6 = r4.getImportantForAccessibility()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.put(r4, r6)
            r5 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r4, r5)
        L6b:
            int r3 = r3 + 1
            goto L1a
        L6e:
            if (r9 != 0) goto L73
            r8 = 0
            r7.importantForAccessibilityMap = r8
        L73:
            return
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    protected com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(android.content.Context r3, boolean r4) {
            r2 = this;
            if (r4 == 0) goto L5
            int r4 = com.google.android.material.C0479R.animator.mtrl_fab_transformation_sheet_expand_spec
            goto L7
        L5:
            int r4 = com.google.android.material.C0479R.animator.mtrl_fab_transformation_sheet_collapse_spec
        L7:
            com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec r0 = new com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec
            r0.<init>()
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.createFromResource(r3, r4)
            r0.timings = r3
            com.google.android.material.animation.Positioning r3 = new com.google.android.material.animation.Positioning
            r4 = 17
            r1 = 0
            r3.<init>(r4, r1, r1)
            r0.positioning = r3
            return r0
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    protected boolean onExpandedStateChange(android.view.View r1, android.view.View r2, boolean r3, boolean r4) {
            r0 = this;
            r0.updateImportantForAccessibility(r2, r3)
            boolean r1 = super.onExpandedStateChange(r1, r2, r3, r4)
            return r1
    }
}
