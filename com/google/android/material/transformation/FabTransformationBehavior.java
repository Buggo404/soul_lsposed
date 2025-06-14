package com.google.android.material.transformation;

@java.lang.Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends com.google.android.material.transformation.ExpandableTransformationBehavior {
    private float dependencyOriginalTranslationX;
    private float dependencyOriginalTranslationY;
    private final int[] tmpArray;
    private final android.graphics.Rect tmpRect;
    private final android.graphics.RectF tmpRectF1;
    private final android.graphics.RectF tmpRectF2;





    protected static class FabTransformationSpec {
        public com.google.android.material.animation.Positioning positioning;
        public com.google.android.material.animation.MotionSpec timings;

        protected FabTransformationSpec() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public FabTransformationBehavior() {
            r1 = this;
            r1.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.tmpRect = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.tmpRectF1 = r0
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            r1.tmpRectF2 = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.tmpArray = r0
            return
    }

    public FabTransformationBehavior(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.tmpRect = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF1 = r1
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>()
            r0.tmpRectF2 = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.tmpArray = r1
            return
    }

    private android.view.ViewGroup calculateChildContentContainer(android.view.View r2) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.id.mtrl_child_content_container
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto Ld
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r0)
            return r2
        Ld:
            boolean r0 = r2 instanceof com.google.android.material.transformation.TransformationChildLayout
            if (r0 != 0) goto L1b
            boolean r0 = r2 instanceof com.google.android.material.transformation.TransformationChildCard
            if (r0 == 0) goto L16
            goto L1b
        L16:
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r2)
            return r2
        L1b:
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
            android.view.View r2 = r2.getChildAt(r0)
            android.view.ViewGroup r2 = r1.toViewGroupOrNull(r2)
            return r2
    }

    private void calculateChildVisibleBoundsAtEndOfExpansion(android.view.View r1, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r2, com.google.android.material.animation.MotionTiming r3, com.google.android.material.animation.MotionTiming r4, float r5, float r6, float r7, float r8, android.graphics.RectF r9) {
            r0 = this;
            float r3 = r0.calculateValueOfAnimationAtEndOfExpansion(r2, r3, r5, r7)
            float r2 = r0.calculateValueOfAnimationAtEndOfExpansion(r2, r4, r6, r8)
            android.graphics.Rect r4 = r0.tmpRect
            r1.getWindowVisibleDisplayFrame(r4)
            android.graphics.RectF r5 = r0.tmpRectF1
            r5.set(r4)
            android.graphics.RectF r4 = r0.tmpRectF2
            r0.calculateWindowBounds(r1, r4)
            r4.offset(r3, r2)
            r4.intersect(r5)
            r9.set(r4)
            return
    }

    private void calculateDependencyWindowBounds(android.view.View r2, android.graphics.RectF r3) {
            r1 = this;
            r1.calculateWindowBounds(r2, r3)
            float r2 = r1.dependencyOriginalTranslationX
            float r0 = r1.dependencyOriginalTranslationY
            r3.offset(r2, r0)
            return
    }

    private android.util.Pair<com.google.android.material.animation.MotionTiming, com.google.android.material.animation.MotionTiming> calculateMotionTiming(float r2, float r3, boolean r4, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r5) {
            r1 = this;
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 == 0) goto L36
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto La
            goto L36
        La:
            if (r4 == 0) goto L10
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 < 0) goto L14
        L10:
            if (r4 != 0) goto L25
            if (r2 <= 0) goto L25
        L14:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXCurveUpwards"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYCurveUpwards"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            goto L46
        L25:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXCurveDownwards"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYCurveDownwards"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            goto L46
        L36:
            com.google.android.material.animation.MotionSpec r2 = r5.timings
            java.lang.String r3 = "translationXLinear"
            com.google.android.material.animation.MotionTiming r2 = r2.getTiming(r3)
            com.google.android.material.animation.MotionSpec r3 = r5.timings
            java.lang.String r4 = "translationYLinear"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
        L46:
            android.util.Pair r4 = new android.util.Pair
            r4.<init>(r2, r3)
            return r4
    }

    private float calculateRevealCenterX(android.view.View r3, android.view.View r4, com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            float r3 = r2.calculateTranslationX(r3, r4, r5)
            float r3 = -r3
            r4 = 0
            r1.offset(r3, r4)
            float r3 = r0.centerX()
            float r4 = r1.left
            float r3 = r3 - r4
            return r3
    }

    private float calculateRevealCenterY(android.view.View r3, android.view.View r4, com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            float r3 = r2.calculateTranslationY(r3, r4, r5)
            r4 = 0
            float r3 = -r3
            r1.offset(r4, r3)
            float r3 = r0.centerY()
            float r4 = r1.top
            float r3 = r3 - r4
            return r3
    }

    private float calculateTranslationX(android.view.View r3, android.view.View r4, com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            int r3 = r5.gravity
            r3 = r3 & 7
            r4 = 1
            if (r3 == r4) goto L23
            r4 = 3
            if (r3 == r4) goto L1e
            r4 = 5
            if (r3 == r4) goto L19
            r3 = 0
            goto L2c
        L19:
            float r3 = r1.right
            float r4 = r0.right
            goto L2b
        L1e:
            float r3 = r1.left
            float r4 = r0.left
            goto L2b
        L23:
            float r3 = r1.centerX()
            float r4 = r0.centerX()
        L2b:
            float r3 = r3 - r4
        L2c:
            float r4 = r5.xAdjustment
            float r3 = r3 + r4
            return r3
    }

    private float calculateTranslationY(android.view.View r3, android.view.View r4, com.google.android.material.animation.Positioning r5) {
            r2 = this;
            android.graphics.RectF r0 = r2.tmpRectF1
            android.graphics.RectF r1 = r2.tmpRectF2
            r2.calculateDependencyWindowBounds(r3, r0)
            r2.calculateWindowBounds(r4, r1)
            int r3 = r5.gravity
            r3 = r3 & 112(0x70, float:1.57E-43)
            r4 = 16
            if (r3 == r4) goto L26
            r4 = 48
            if (r3 == r4) goto L21
            r4 = 80
            if (r3 == r4) goto L1c
            r3 = 0
            goto L2f
        L1c:
            float r3 = r1.bottom
            float r4 = r0.bottom
            goto L2e
        L21:
            float r3 = r1.top
            float r4 = r0.top
            goto L2e
        L26:
            float r3 = r1.centerY()
            float r4 = r0.centerY()
        L2e:
            float r3 = r3 - r4
        L2f:
            float r4 = r5.yAdjustment
            float r3 = r3 + r4
            return r3
    }

    private float calculateValueOfAnimationAtEndOfExpansion(com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r9, com.google.android.material.animation.MotionTiming r10, float r11, float r12) {
            r8 = this;
            long r0 = r10.getDelay()
            long r2 = r10.getDuration()
            com.google.android.material.animation.MotionSpec r9 = r9.timings
            java.lang.String r4 = "expansion"
            com.google.android.material.animation.MotionTiming r9 = r9.getTiming(r4)
            long r4 = r9.getDelay()
            long r6 = r9.getDuration()
            long r4 = r4 + r6
            r6 = 17
            long r4 = r4 + r6
            long r4 = r4 - r0
            float r9 = (float) r4
            float r0 = (float) r2
            float r9 = r9 / r0
            android.animation.TimeInterpolator r10 = r10.getInterpolator()
            float r9 = r10.getInterpolation(r9)
            float r9 = com.google.android.material.animation.AnimationUtils.lerp(r11, r12, r9)
            return r9
    }

    private void calculateWindowBounds(android.view.View r4, android.graphics.RectF r5) {
            r3 = this;
            int r0 = r4.getWidth()
            float r0 = (float) r0
            int r1 = r4.getHeight()
            float r1 = (float) r1
            r2 = 0
            r5.set(r2, r2, r0, r1)
            int[] r0 = r3.tmpArray
            r4.getLocationInWindow(r0)
            r1 = 0
            r1 = r0[r1]
            float r1 = (float) r1
            r2 = 1
            r0 = r0[r2]
            float r0 = (float) r0
            r5.offsetTo(r1, r0)
            float r0 = r4.getTranslationX()
            float r0 = -r0
            int r0 = (int) r0
            float r0 = (float) r0
            float r4 = r4.getTranslationY()
            float r4 = -r4
            int r4 = (int) r4
            float r4 = (float) r4
            r5.offset(r0, r4)
            return
    }

    private void createChildrenFadeAnimation(android.view.View r2, android.view.View r3, boolean r4, boolean r5, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r6, java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            boolean r2 = r3 instanceof android.view.ViewGroup
            if (r2 != 0) goto L5
            return
        L5:
            boolean r2 = r3 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r2 == 0) goto Le
            int r2 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r2 != 0) goto Le
            return
        Le:
            android.view.ViewGroup r2 = r1.calculateChildContentContainer(r3)
            if (r2 != 0) goto L15
            return
        L15:
            r3 = 0
            r8 = 0
            r0 = 1
            if (r4 == 0) goto L32
            if (r5 != 0) goto L25
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r4.set(r2, r3)
        L25:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r3 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            float[] r4 = new float[r0]
            r5 = 1065353216(0x3f800000, float:1.0)
            r4[r8] = r5
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r3, r4)
            goto L3c
        L32:
            android.util.Property<android.view.ViewGroup, java.lang.Float> r4 = com.google.android.material.animation.ChildrenAlphaProperty.CHILDREN_ALPHA
            float[] r5 = new float[r0]
            r5[r8] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r2, r4, r5)
        L3c:
            com.google.android.material.animation.MotionSpec r3 = r6.timings
            java.lang.String r4 = "contentFade"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            r3.apply(r2)
            r7.add(r2)
            return
    }

    private void createColorAnimation(android.view.View r3, android.view.View r4, boolean r5, boolean r6, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r7, java.util.List<android.animation.Animator> r8, java.util.List<android.animation.Animator.AnimatorListener> r9) {
            r2 = this;
            boolean r9 = r4 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r9 != 0) goto L5
            return
        L5:
            com.google.android.material.circularreveal.CircularRevealWidget r4 = (com.google.android.material.circularreveal.CircularRevealWidget) r4
            int r3 = r2.getBackgroundTint(r3)
            r9 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r3
            r0 = 0
            r1 = 1
            if (r5 == 0) goto L23
            if (r6 != 0) goto L18
            r4.setCircularRevealScrimColor(r3)
        L18:
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r3 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            int[] r5 = new int[r1]
            r5[r0] = r9
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r4, r3, r5)
            goto L2d
        L23:
            android.util.Property<com.google.android.material.circularreveal.CircularRevealWidget, java.lang.Integer> r5 = com.google.android.material.circularreveal.CircularRevealWidget.CircularRevealScrimColorProperty.CIRCULAR_REVEAL_SCRIM_COLOR
            int[] r6 = new int[r1]
            r6[r0] = r3
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofInt(r4, r5, r6)
        L2d:
            com.google.android.material.animation.ArgbEvaluatorCompat r4 = com.google.android.material.animation.ArgbEvaluatorCompat.getInstance()
            r3.setEvaluator(r4)
            com.google.android.material.animation.MotionSpec r4 = r7.timings
            java.lang.String r5 = "color"
            com.google.android.material.animation.MotionTiming r4 = r4.getTiming(r5)
            r4.apply(r3)
            r8.add(r3)
            return
    }

    private void createDependencyTranslationAnimation(android.view.View r7, android.view.View r8, boolean r9, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r10, java.util.List<android.animation.Animator> r11) {
            r6 = this;
            com.google.android.material.animation.Positioning r0 = r10.positioning
            float r0 = r6.calculateTranslationX(r7, r8, r0)
            com.google.android.material.animation.Positioning r1 = r10.positioning
            float r8 = r6.calculateTranslationY(r7, r8, r1)
            android.util.Pair r10 = r6.calculateMotionTiming(r0, r8, r9, r10)
            java.lang.Object r1 = r10.first
            com.google.android.material.animation.MotionTiming r1 = (com.google.android.material.animation.MotionTiming) r1
            java.lang.Object r10 = r10.second
            com.google.android.material.animation.MotionTiming r10 = (com.google.android.material.animation.MotionTiming) r10
            android.util.Property r2 = android.view.View.TRANSLATION_X
            r3 = 1
            float[] r4 = new float[r3]
            if (r9 == 0) goto L20
            goto L22
        L20:
            float r0 = r6.dependencyOriginalTranslationX
        L22:
            r5 = 0
            r4[r5] = r0
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofFloat(r7, r2, r4)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r3]
            if (r9 == 0) goto L30
            goto L32
        L30:
            float r8 = r6.dependencyOriginalTranslationY
        L32:
            r3[r5] = r8
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r2, r3)
            r1.apply(r0)
            r10.apply(r7)
            r11.add(r0)
            r11.add(r7)
            return
    }

    private void createElevationAnimation(android.view.View r2, android.view.View r3, boolean r4, boolean r5, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r6, java.util.List<android.animation.Animator> r7, java.util.List<android.animation.Animator.AnimatorListener> r8) {
            r1 = this;
            float r8 = androidx.core.view.ViewCompat.getElevation(r3)
            float r2 = androidx.core.view.ViewCompat.getElevation(r2)
            float r8 = r8 - r2
            r2 = 0
            r0 = 1
            if (r4 == 0) goto L1f
            if (r5 != 0) goto L13
            float r4 = -r8
            r3.setTranslationZ(r4)
        L13:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float[] r5 = new float[r0]
            r8 = 0
            r5[r2] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r5)
            goto L2a
        L1f:
            android.util.Property r4 = android.view.View.TRANSLATION_Z
            float[] r5 = new float[r0]
            float r8 = -r8
            r5[r2] = r8
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r3, r4, r5)
        L2a:
            com.google.android.material.animation.MotionSpec r3 = r6.timings
            java.lang.String r4 = "elevation"
            com.google.android.material.animation.MotionTiming r3 = r3.getTiming(r4)
            r3.apply(r2)
            r7.add(r2)
            return
    }

    private void createExpansionAnimation(android.view.View r18, android.view.View r19, boolean r20, boolean r21, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r22, float r23, float r24, java.util.List<android.animation.Animator> r25, java.util.List<android.animation.Animator.AnimatorListener> r26) {
            r17 = this;
            r12 = r17
            r0 = r18
            r8 = r19
            r9 = r22
            boolean r1 = r8 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r1 != 0) goto Ld
            return
        Ld:
            r13 = r8
            com.google.android.material.circularreveal.CircularRevealWidget r13 = (com.google.android.material.circularreveal.CircularRevealWidget) r13
            com.google.android.material.animation.Positioning r1 = r9.positioning
            float r1 = r12.calculateRevealCenterX(r0, r8, r1)
            com.google.android.material.animation.Positioning r2 = r9.positioning
            float r10 = r12.calculateRevealCenterY(r0, r8, r2)
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            android.graphics.Rect r2 = r12.tmpRect
            r0.getContentRect(r2)
            android.graphics.Rect r0 = r12.tmpRect
            int r0 = r0.width()
            float r0 = (float) r0
            r2 = 1073741824(0x40000000, float:2.0)
            float r11 = r0 / r2
            com.google.android.material.animation.MotionSpec r0 = r9.timings
            java.lang.String r2 = "expansion"
            com.google.android.material.animation.MotionTiming r14 = r0.getTiming(r2)
            if (r20 == 0) goto L74
            if (r21 != 0) goto L42
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r0.<init>(r1, r10, r11)
            r13.setRevealInfo(r0)
        L42:
            if (r21 == 0) goto L4b
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r13.getRevealInfo()
            float r0 = r0.radius
            r11 = r0
        L4b:
            r4 = 0
            r5 = 0
            r2 = r1
            r3 = r10
            r6 = r23
            r7 = r24
            float r0 = com.google.android.material.math.MathUtils.distanceToFurthestCorner(r2, r3, r4, r5, r6, r7)
            android.animation.Animator r9 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(r13, r1, r10, r0)
            com.google.android.material.transformation.FabTransformationBehavior$4 r0 = new com.google.android.material.transformation.FabTransformationBehavior$4
            r0.<init>(r12, r13)
            r9.addListener(r0)
            long r2 = r14.getDelay()
            int r4 = (int) r1
            int r5 = (int) r10
            r0 = r17
            r1 = r19
            r6 = r11
            r7 = r25
            r0.createPreFillRadialExpansion(r1, r2, r4, r5, r6, r7)
            goto Lab
        L74:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r13.getRevealInfo()
            float r6 = r0.radius
            android.animation.Animator r15 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularReveal(r13, r1, r10, r11)
            long r2 = r14.getDelay()
            int r7 = (int) r1
            int r10 = (int) r10
            r0 = r17
            r1 = r19
            r4 = r7
            r5 = r10
            r16 = r7
            r7 = r25
            r0.createPreFillRadialExpansion(r1, r2, r4, r5, r6, r7)
            long r2 = r14.getDelay()
            long r4 = r14.getDuration()
            com.google.android.material.animation.MotionSpec r0 = r9.timings
            long r6 = r0.getTotalDuration()
            r0 = r17
            r8 = r16
            r9 = r10
            r10 = r11
            r11 = r25
            r0.createPostFillRadialExpansion(r1, r2, r4, r6, r8, r9, r10, r11)
            r9 = r15
        Lab:
            r14.apply(r9)
            r0 = r25
            r0.add(r9)
            android.animation.Animator$AnimatorListener r0 = com.google.android.material.circularreveal.CircularRevealCompat.createCircularRevealListener(r13)
            r1 = r26
            r1.add(r0)
            return
    }

    private void createIconFadeAnimation(android.view.View r5, android.view.View r6, boolean r7, boolean r8, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r9, java.util.List<android.animation.Animator> r10, java.util.List<android.animation.Animator.AnimatorListener> r11) {
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.material.circularreveal.CircularRevealWidget
            if (r0 == 0) goto L56
            boolean r0 = r5 instanceof android.widget.ImageView
            if (r0 != 0) goto L9
            goto L56
        L9:
            r0 = r6
            com.google.android.material.circularreveal.CircularRevealWidget r0 = (com.google.android.material.circularreveal.CircularRevealWidget) r0
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            android.graphics.drawable.Drawable r5 = r5.getDrawable()
            if (r5 != 0) goto L15
            return
        L15:
            r5.mutate()
            r1 = 255(0xff, float:3.57E-43)
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L2e
            if (r8 != 0) goto L23
            r5.setAlpha(r1)
        L23:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            int[] r8 = new int[r2]
            r8[r3] = r3
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofInt(r5, r7, r8)
            goto L38
        L2e:
            android.util.Property<android.graphics.drawable.Drawable, java.lang.Integer> r7 = com.google.android.material.animation.DrawableAlphaProperty.DRAWABLE_ALPHA_COMPAT
            int[] r8 = new int[r2]
            r8[r3] = r1
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofInt(r5, r7, r8)
        L38:
            com.google.android.material.transformation.FabTransformationBehavior$2 r8 = new com.google.android.material.transformation.FabTransformationBehavior$2
            r8.<init>(r4, r6)
            r7.addUpdateListener(r8)
            com.google.android.material.animation.MotionSpec r6 = r9.timings
            java.lang.String r8 = "iconFade"
            com.google.android.material.animation.MotionTiming r6 = r6.getTiming(r8)
            r6.apply(r7)
            r10.add(r7)
            com.google.android.material.transformation.FabTransformationBehavior$3 r6 = new com.google.android.material.transformation.FabTransformationBehavior$3
            r6.<init>(r4, r0, r5)
            r11.add(r6)
        L56:
            return
    }

    private void createPostFillRadialExpansion(android.view.View r1, long r2, long r4, long r6, int r8, int r9, float r10, java.util.List<android.animation.Animator> r11) {
            r0 = this;
            long r2 = r2 + r4
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 >= 0) goto L13
            android.animation.Animator r1 = android.view.ViewAnimationUtils.createCircularReveal(r1, r8, r9, r10, r10)
            r1.setStartDelay(r2)
            long r6 = r6 - r2
            r1.setDuration(r6)
            r11.add(r1)
        L13:
            return
    }

    private void createPreFillRadialExpansion(android.view.View r4, long r5, int r7, int r8, float r9, java.util.List<android.animation.Animator> r10) {
            r3 = this;
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            android.animation.Animator r4 = android.view.ViewAnimationUtils.createCircularReveal(r4, r7, r8, r9, r9)
            r4.setStartDelay(r0)
            r4.setDuration(r5)
            r10.add(r4)
        L13:
            return
    }

    private void createTranslationAnimation(android.view.View r17, android.view.View r18, boolean r19, boolean r20, com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec r21, java.util.List<android.animation.Animator> r22, java.util.List<android.animation.Animator.AnimatorListener> r23, android.graphics.RectF r24) {
            r16 = this;
            r10 = r16
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r11 = r22
            com.google.android.material.animation.Positioning r4 = r3.positioning
            float r4 = r10.calculateTranslationX(r0, r1, r4)
            com.google.android.material.animation.Positioning r5 = r3.positioning
            float r0 = r10.calculateTranslationY(r0, r1, r5)
            android.util.Pair r5 = r10.calculateMotionTiming(r4, r0, r2, r3)
            java.lang.Object r6 = r5.first
            r12 = r6
            com.google.android.material.animation.MotionTiming r12 = (com.google.android.material.animation.MotionTiming) r12
            java.lang.Object r5 = r5.second
            r13 = r5
            com.google.android.material.animation.MotionTiming r13 = (com.google.android.material.animation.MotionTiming) r13
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L5a
            if (r20 != 0) goto L34
            float r2 = -r4
            r1.setTranslationX(r2)
            float r2 = -r0
            r1.setTranslationY(r2)
        L34:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r7 = new float[r6]
            r8 = 0
            r7[r5] = r8
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r7)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r6 = new float[r6]
            r6[r5] = r8
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r6)
            float r5 = -r4
            float r6 = -r0
            r7 = 0
            r0 = r16
            r1 = r18
            r2 = r21
            r3 = r12
            r4 = r13
            r9 = r24
            r0.calculateChildVisibleBoundsAtEndOfExpansion(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L70
        L5a:
            android.util.Property r2 = android.view.View.TRANSLATION_X
            float[] r3 = new float[r6]
            float r4 = -r4
            r3[r5] = r4
            android.animation.ObjectAnimator r14 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
            android.util.Property r2 = android.view.View.TRANSLATION_Y
            float[] r3 = new float[r6]
            float r0 = -r0
            r3[r5] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r1, r2, r3)
        L70:
            r12.apply(r14)
            r13.apply(r15)
            r11.add(r14)
            r11.add(r15)
            return
    }

    private int getBackgroundTint(android.view.View r3) {
            r2 = this;
            android.content.res.ColorStateList r0 = androidx.core.view.ViewCompat.getBackgroundTintList(r3)
            if (r0 == 0) goto L13
            int[] r3 = r3.getDrawableState()
            int r1 = r0.getDefaultColor()
            int r3 = r0.getColorForState(r3, r1)
            return r3
        L13:
            r3 = 0
            return r3
    }

    private android.view.ViewGroup toViewGroupOrNull(android.view.View r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L7
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4) {
            r1 = this;
            int r2 = r3.getVisibility()
            r0 = 8
            if (r2 == r0) goto L1d
            boolean r2 = r4 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            r0 = 0
            if (r2 == 0) goto L1c
            com.google.android.material.floatingactionbutton.FloatingActionButton r4 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r4
            int r2 = r4.getExpandedComponentIdHint()
            if (r2 == 0) goto L1b
            int r3 = r3.getId()
            if (r2 != r3) goto L1c
        L1b:
            r0 = 1
        L1c:
            return r0
        L1d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead."
            r2.<init>(r3)
            throw r2
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
            r1 = this;
            int r0 = r2.dodgeInsetEdges
            if (r0 != 0) goto L8
            r0 = 80
            r2.dodgeInsetEdges = r0
        L8:
            return
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected android.animation.AnimatorSet onCreateExpandedStateChangeAnimation(android.view.View r16, android.view.View r17, boolean r18, boolean r19) {
            r15 = this;
            r10 = r15
            r11 = r18
            android.content.Context r0 = r17.getContext()
            com.google.android.material.transformation.FabTransformationBehavior$FabTransformationSpec r12 = r15.onCreateMotionSpec(r0, r11)
            if (r11 == 0) goto L19
            float r0 = r16.getTranslationX()
            r10.dependencyOriginalTranslationX = r0
            float r0 = r16.getTranslationY()
            r10.dependencyOriginalTranslationY = r0
        L19:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r12
            r6 = r13
            r7 = r14
            r0.createElevationAnimation(r1, r2, r3, r4, r5, r6, r7)
            android.graphics.RectF r9 = r10.tmpRectF1
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r9
            r0.createTranslationAnimation(r1, r2, r3, r4, r5, r6, r7, r8)
            float r8 = r9.width()
            float r9 = r9.height()
            r4 = r12
            r5 = r13
            r0.createDependencyTranslationAnimation(r1, r2, r3, r4, r5)
            r4 = r19
            r5 = r12
            r0.createIconFadeAnimation(r1, r2, r3, r4, r5, r6, r7)
            r6 = r8
            r7 = r9
            r8 = r13
            r9 = r14
            r0.createExpansionAnimation(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            r6 = r13
            r7 = r14
            r0.createColorAnimation(r1, r2, r3, r4, r5, r6, r7)
            r0.createChildrenFadeAnimation(r1, r2, r3, r4, r5, r6, r7)
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            com.google.android.material.animation.AnimatorSetCompat.playTogether(r0, r13)
            com.google.android.material.transformation.FabTransformationBehavior$1 r1 = new com.google.android.material.transformation.FabTransformationBehavior$1
            r2 = r16
            r3 = r17
            r1.<init>(r15, r11, r3, r2)
            r0.addListener(r1)
            int r1 = r14.size()
            r2 = 0
        L7f:
            if (r2 >= r1) goto L8d
            java.lang.Object r3 = r14.get(r2)
            android.animation.Animator$AnimatorListener r3 = (android.animation.Animator.AnimatorListener) r3
            r0.addListener(r3)
            int r2 = r2 + 1
            goto L7f
        L8d:
            return r0
    }

    protected abstract com.google.android.material.transformation.FabTransformationBehavior.FabTransformationSpec onCreateMotionSpec(android.content.Context r1, boolean r2);
}
