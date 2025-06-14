package com.google.android.material.transition.platform;

/* loaded from: classes.dex */
class MaskEvaluator {
    private com.google.android.material.shape.ShapeAppearanceModel currentShapeAppearanceModel;
    private final android.graphics.Path endPath;
    private final android.graphics.Path path;
    private final com.google.android.material.shape.ShapeAppearancePathProvider pathProvider;
    private final android.graphics.Path startPath;

    MaskEvaluator() {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.path = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.startPath = r0
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.endPath = r0
            com.google.android.material.shape.ShapeAppearancePathProvider r0 = com.google.android.material.shape.ShapeAppearancePathProvider.getInstance()
            r1.pathProvider = r0
            return
    }

    void clip(android.graphics.Canvas r2) {
            r1 = this;
            android.graphics.Path r0 = r1.path
            r2.clipPath(r0)
            return
    }

    void evaluate(float r8, com.google.android.material.shape.ShapeAppearanceModel r9, com.google.android.material.shape.ShapeAppearanceModel r10, android.graphics.RectF r11, android.graphics.RectF r12, android.graphics.RectF r13, com.google.android.material.transition.platform.MaterialContainerTransform.ProgressThresholds r14) {
            r7 = this;
            float r4 = r14.getStart()
            float r5 = r14.getEnd()
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r13
            r6 = r8
            com.google.android.material.shape.ShapeAppearanceModel r8 = com.google.android.material.transition.platform.TransitionUtils.lerp(r0, r1, r2, r3, r4, r5, r6)
            r7.currentShapeAppearanceModel = r8
            com.google.android.material.shape.ShapeAppearancePathProvider r9 = r7.pathProvider
            android.graphics.Path r10 = r7.startPath
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.calculatePath(r8, r11, r12, r10)
            com.google.android.material.shape.ShapeAppearancePathProvider r8 = r7.pathProvider
            com.google.android.material.shape.ShapeAppearanceModel r9 = r7.currentShapeAppearanceModel
            android.graphics.Path r10 = r7.endPath
            r8.calculatePath(r9, r11, r13, r10)
            android.graphics.Path r8 = r7.path
            android.graphics.Path r9 = r7.startPath
            android.graphics.Path r10 = r7.endPath
            android.graphics.Path$Op r11 = android.graphics.Path.Op.UNION
            r8.op(r9, r10, r11)
            return
    }

    com.google.android.material.shape.ShapeAppearanceModel getCurrentShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.shape.ShapeAppearanceModel r0 = r1.currentShapeAppearanceModel
            return r0
    }

    android.graphics.Path getPath() {
            r1 = this;
            android.graphics.Path r0 = r1.path
            return r0
    }
}
