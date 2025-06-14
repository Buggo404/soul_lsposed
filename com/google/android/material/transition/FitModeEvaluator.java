package com.google.android.material.transition;

/* loaded from: classes.dex */
interface FitModeEvaluator {
    void applyMask(android.graphics.RectF r1, float r2, com.google.android.material.transition.FitModeResult r3);

    com.google.android.material.transition.FitModeResult evaluate(float r1, float r2, float r3, float r4, float r5, float r6, float r7);

    boolean shouldMaskStartBounds(com.google.android.material.transition.FitModeResult r1);
}
