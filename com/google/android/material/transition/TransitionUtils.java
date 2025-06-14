package com.google.android.material.transition;

/* loaded from: classes.dex */
class TransitionUtils {
    private static final android.graphics.RectF transformAlphaRectF = null;



    interface CanvasOperation {
        void run(android.graphics.Canvas r1);
    }

    interface CornerSizeBinaryOperator {
        com.google.android.material.shape.CornerSize apply(com.google.android.material.shape.CornerSize r1, com.google.android.material.shape.CornerSize r2);
    }

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            com.google.android.material.transition.TransitionUtils.transformAlphaRectF = r0
            return
    }

    private TransitionUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static float calculateArea(android.graphics.RectF r1) {
            float r0 = r1.width()
            float r1 = r1.height()
            float r0 = r0 * r1
            return r0
    }

    static com.google.android.material.shape.ShapeAppearanceModel convertToRelativeCornerSizes(com.google.android.material.shape.ShapeAppearanceModel r1, android.graphics.RectF r2) {
            com.google.android.material.transition.TransitionUtils$1 r0 = new com.google.android.material.transition.TransitionUtils$1
            r0.<init>(r2)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.withTransformedCornerSizes(r0)
            return r1
    }

    static android.graphics.Shader createColorShader(int r9) {
            android.graphics.LinearGradient r8 = new android.graphics.LinearGradient
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            android.graphics.Shader$TileMode r7 = android.graphics.Shader.TileMode.CLAMP
            r0 = r8
            r5 = r9
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    static <T> T defaultIfNull(T r0, T r1) {
            if (r0 == 0) goto L3
            goto L4
        L3:
            r0 = r1
        L4:
            return r0
    }

    static android.view.View findAncestorById(android.view.View r2, int r3) {
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r0 = r0.getResourceName(r3)
        L8:
            if (r2 == 0) goto L1c
            int r1 = r2.getId()
            if (r1 != r3) goto L11
            return r2
        L11:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L1c
            android.view.View r2 = (android.view.View) r2
            goto L8
        L1c:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r0 = " is not a valid ancestor"
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    static android.view.View findDescendantOrAncestorById(android.view.View r1, int r2) {
            android.view.View r0 = r1.findViewById(r2)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.view.View r1 = findAncestorById(r1, r2)
            return r1
    }

    static android.graphics.RectF getLocationOnScreen(android.view.View r4) {
            r0 = 2
            int[] r0 = new int[r0]
            r4.getLocationOnScreen(r0)
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            int r2 = r4.getWidth()
            int r2 = r2 + r1
            int r4 = r4.getHeight()
            int r4 = r4 + r0
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = (float) r1
            float r0 = (float) r0
            float r2 = (float) r2
            float r4 = (float) r4
            r3.<init>(r1, r0, r2, r4)
            return r3
    }

    static android.graphics.RectF getRelativeBounds(android.view.View r4) {
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r4.getLeft()
            float r1 = (float) r1
            int r2 = r4.getTop()
            float r2 = (float) r2
            int r3 = r4.getRight()
            float r3 = (float) r3
            int r4 = r4.getBottom()
            float r4 = (float) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    static android.graphics.Rect getRelativeBoundsRect(android.view.View r4) {
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r4.getLeft()
            int r2 = r4.getTop()
            int r3 = r4.getRight()
            int r4 = r4.getBottom()
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static boolean isShapeAppearanceSignificant(com.google.android.material.shape.ShapeAppearanceModel r2, android.graphics.RectF r3) {
            com.google.android.material.shape.CornerSize r0 = r2.getTopLeftCornerSize()
            float r0 = r0.getCornerSize(r3)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getTopRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r0 = r2.getBottomRightCornerSize()
            float r0 = r0.getCornerSize(r3)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L34
            com.google.android.material.shape.CornerSize r2 = r2.getBottomLeftCornerSize()
            float r2 = r2.getCornerSize(r3)
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 == 0) goto L32
            goto L34
        L32:
            r2 = 0
            goto L35
        L34:
            r2 = 1
        L35:
            return r2
    }

    static float lerp(float r0, float r1, float r2) {
            float r1 = r1 - r0
            float r2 = r2 * r1
            float r0 = r0 + r2
            return r0
    }

    static float lerp(float r6, float r7, float r8, float r9, float r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            float r6 = lerp(r0, r1, r2, r3, r4, r5)
            return r6
    }

    static float lerp(float r0, float r1, float r2, float r3, float r4, boolean r5) {
            if (r5 == 0) goto L12
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 < 0) goto Ld
            r5 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L12
        Ld:
            float r0 = lerp(r0, r1, r4)
            return r0
        L12:
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto L17
            return r0
        L17:
            int r5 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r5 <= 0) goto L1c
            return r1
        L1c:
            float r4 = r4 - r2
            float r3 = r3 - r2
            float r4 = r4 / r3
            float r0 = lerp(r0, r1, r4)
            return r0
    }

    static int lerp(int r1, int r2, float r3, float r4, float r5) {
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r1
        L5:
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 <= 0) goto La
            return r2
        La:
            float r1 = (float) r1
            float r2 = (float) r2
            float r5 = r5 - r3
            float r4 = r4 - r3
            float r5 = r5 / r4
            float r1 = lerp(r1, r2, r5)
            int r1 = (int) r1
            return r1
    }

    static com.google.android.material.shape.ShapeAppearanceModel lerp(com.google.android.material.shape.ShapeAppearanceModel r7, com.google.android.material.shape.ShapeAppearanceModel r8, android.graphics.RectF r9, android.graphics.RectF r10, float r11, float r12, float r13) {
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 >= 0) goto L5
            return r7
        L5:
            int r0 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r0 <= 0) goto La
            return r8
        La:
            com.google.android.material.transition.TransitionUtils$2 r0 = new com.google.android.material.transition.TransitionUtils$2
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            com.google.android.material.shape.ShapeAppearanceModel r7 = transformCornerSizes(r7, r8, r9, r0)
            return r7
    }

    static void maybeAddTransition(androidx.transition.TransitionSet r0, androidx.transition.Transition r1) {
            if (r1 == 0) goto L5
            r0.addTransition(r1)
        L5:
            return
    }

    static void maybeRemoveTransition(androidx.transition.TransitionSet r0, androidx.transition.Transition r1) {
            if (r1 == 0) goto L5
            r0.removeTransition(r1)
        L5:
            return
    }

    private static int saveLayerAlphaCompat(android.graphics.Canvas r1, android.graphics.Rect r2, int r3) {
            android.graphics.RectF r0 = com.google.android.material.transition.TransitionUtils.transformAlphaRectF
            r0.set(r2)
            int r1 = r1.saveLayerAlpha(r0, r3)
            return r1
    }

    static void transform(android.graphics.Canvas r1, android.graphics.Rect r2, float r3, float r4, float r5, int r6, com.google.android.material.transition.TransitionUtils.CanvasOperation r7) {
            if (r6 > 0) goto L3
            return
        L3:
            int r0 = r1.save()
            r1.translate(r3, r4)
            r1.scale(r5, r5)
            r3 = 255(0xff, float:3.57E-43)
            if (r6 >= r3) goto L14
            saveLayerAlphaCompat(r1, r2, r6)
        L14:
            r7.run(r1)
            r1.restoreToCount(r0)
            return
    }

    static com.google.android.material.shape.ShapeAppearanceModel transformCornerSizes(com.google.android.material.shape.ShapeAppearanceModel r2, com.google.android.material.shape.ShapeAppearanceModel r3, android.graphics.RectF r4, com.google.android.material.transition.TransitionUtils.CornerSizeBinaryOperator r5) {
            boolean r4 = isShapeAppearanceSignificant(r2, r4)
            if (r4 == 0) goto L8
            r4 = r2
            goto L9
        L8:
            r4 = r3
        L9:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.toBuilder()
            com.google.android.material.shape.CornerSize r0 = r2.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getTopLeftCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setTopLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getTopRightCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setTopRightCornerSize(r0)
            com.google.android.material.shape.CornerSize r0 = r2.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r1 = r3.getBottomLeftCornerSize()
            com.google.android.material.shape.CornerSize r0 = r5.apply(r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = r4.setBottomLeftCornerSize(r0)
            com.google.android.material.shape.CornerSize r2 = r2.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r3 = r3.getBottomRightCornerSize()
            com.google.android.material.shape.CornerSize r2 = r5.apply(r2, r3)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r2 = r4.setBottomRightCornerSize(r2)
            com.google.android.material.shape.ShapeAppearanceModel r2 = r2.build()
            return r2
    }
}
