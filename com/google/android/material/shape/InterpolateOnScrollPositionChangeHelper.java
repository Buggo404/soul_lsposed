package com.google.android.material.shape;

/* loaded from: classes.dex */
public class InterpolateOnScrollPositionChangeHelper {
    private final int[] containerLocation;
    private android.widget.ScrollView containingScrollView;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private final android.view.ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final int[] scrollLocation;
    private android.view.View shapedView;


    public InterpolateOnScrollPositionChangeHelper(android.view.View r3, com.google.android.material.shape.MaterialShapeDrawable r4, android.widget.ScrollView r5) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.scrollLocation = r1
            int[] r0 = new int[r0]
            r2.containerLocation = r0
            com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1 r0 = new com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1
            r0.<init>(r2)
            r2.scrollChangedListener = r0
            r2.shapedView = r3
            r2.materialShapeDrawable = r4
            r2.containingScrollView = r5
            return
    }

    public void setContainingScrollView(android.widget.ScrollView r1) {
            r0 = this;
            r0.containingScrollView = r1
            return
    }

    public void setMaterialShapeDrawable(com.google.android.material.shape.MaterialShapeDrawable r1) {
            r0 = this;
            r0.materialShapeDrawable = r1
            return
    }

    public void startListeningForScrollChanges(android.view.ViewTreeObserver r2) {
            r1 = this;
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r1.scrollChangedListener
            r2.addOnScrollChangedListener(r0)
            return
    }

    public void stopListeningForScrollChanges(android.view.ViewTreeObserver r2) {
            r1 = this;
            android.view.ViewTreeObserver$OnScrollChangedListener r0 = r1.scrollChangedListener
            r2.removeOnScrollChangedListener(r0)
            return
    }

    public void updateInterpolationForScreenPosition() {
            r5 = this;
            android.widget.ScrollView r0 = r5.containingScrollView
            if (r0 != 0) goto L5
            return
        L5:
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L88
            android.widget.ScrollView r0 = r5.containingScrollView
            int[] r1 = r5.scrollLocation
            r0.getLocationInWindow(r1)
            android.widget.ScrollView r0 = r5.containingScrollView
            r1 = 0
            android.view.View r0 = r0.getChildAt(r1)
            int[] r1 = r5.containerLocation
            r0.getLocationInWindow(r1)
            android.view.View r0 = r5.shapedView
            int r0 = r0.getTop()
            int[] r1 = r5.scrollLocation
            r2 = 1
            r1 = r1[r2]
            int r0 = r0 - r1
            int[] r1 = r5.containerLocation
            r1 = r1[r2]
            int r0 = r0 + r1
            android.view.View r1 = r5.shapedView
            int r1 = r1.getHeight()
            android.widget.ScrollView r2 = r5.containingScrollView
            int r2 = r2.getHeight()
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r0 >= 0) goto L57
            com.google.android.material.shape.MaterialShapeDrawable r2 = r5.materialShapeDrawable
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = r0 + r4
            float r0 = java.lang.Math.min(r4, r0)
            float r0 = java.lang.Math.max(r3, r0)
            r2.setInterpolation(r0)
            android.view.View r0 = r5.shapedView
            r0.invalidate()
            goto L87
        L57:
            int r0 = r0 + r1
            if (r0 <= r2) goto L73
            int r0 = r0 - r2
            com.google.android.material.shape.MaterialShapeDrawable r2 = r5.materialShapeDrawable
            float r0 = (float) r0
            float r1 = (float) r1
            float r0 = r0 / r1
            float r0 = r4 - r0
            float r0 = java.lang.Math.min(r4, r0)
            float r0 = java.lang.Math.max(r3, r0)
            r2.setInterpolation(r0)
            android.view.View r0 = r5.shapedView
            r0.invalidate()
            goto L87
        L73:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.materialShapeDrawable
            float r0 = r0.getInterpolation()
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 == 0) goto L87
            com.google.android.material.shape.MaterialShapeDrawable r0 = r5.materialShapeDrawable
            r0.setInterpolation(r4)
            android.view.View r0 = r5.shapedView
            r0.invalidate()
        L87:
            return
        L88:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Scroll bar must contain a child to calculate interpolation."
            r0.<init>(r1)
            throw r0
    }
}
