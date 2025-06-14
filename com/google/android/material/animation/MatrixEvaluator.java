package com.google.android.material.animation;

/* loaded from: classes.dex */
public class MatrixEvaluator implements android.animation.TypeEvaluator<android.graphics.Matrix> {
    private final float[] tempEndValues;
    private final android.graphics.Matrix tempMatrix;
    private final float[] tempStartValues;

    public MatrixEvaluator() {
            r2 = this;
            r2.<init>()
            r0 = 9
            float[] r1 = new float[r0]
            r2.tempStartValues = r1
            float[] r0 = new float[r0]
            r2.tempEndValues = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.tempMatrix = r0
            return
    }

    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public android.graphics.Matrix evaluate2(float r3, android.graphics.Matrix r4, android.graphics.Matrix r5) {
            r2 = this;
            float[] r0 = r2.tempStartValues
            r4.getValues(r0)
            float[] r4 = r2.tempEndValues
            r5.getValues(r4)
            r4 = 0
        Lb:
            r5 = 9
            if (r4 >= r5) goto L1f
            float[] r5 = r2.tempEndValues
            r0 = r5[r4]
            float[] r1 = r2.tempStartValues
            r1 = r1[r4]
            float r0 = r0 - r1
            float r0 = r0 * r3
            float r1 = r1 + r0
            r5[r4] = r1
            int r4 = r4 + 1
            goto Lb
        L1f:
            android.graphics.Matrix r3 = r2.tempMatrix
            float[] r4 = r2.tempEndValues
            r3.setValues(r4)
            android.graphics.Matrix r3 = r2.tempMatrix
            return r3
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ android.graphics.Matrix evaluate(float r1, android.graphics.Matrix r2, android.graphics.Matrix r3) {
            r0 = this;
            android.graphics.Matrix r2 = (android.graphics.Matrix) r2
            android.graphics.Matrix r3 = (android.graphics.Matrix) r3
            android.graphics.Matrix r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }
}
