package androidx.transition;

/* loaded from: classes.dex */
class FloatArrayEvaluator implements android.animation.TypeEvaluator<float[]> {
    private float[] mArray;

    FloatArrayEvaluator(float[] r1) {
            r0 = this;
            r0.<init>()
            r0.mArray = r1
            return
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ float[] evaluate(float r1, float[] r2, float[] r3) {
            r0 = this;
            float[] r2 = (float[]) r2
            float[] r3 = (float[]) r3
            float[] r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }

    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public float[] evaluate2(float r5, float[] r6, float[] r7) {
            r4 = this;
            float[] r0 = r4.mArray
            if (r0 != 0) goto L7
            int r0 = r6.length
            float[] r0 = new float[r0]
        L7:
            r1 = 0
        L8:
            int r2 = r0.length
            if (r1 >= r2) goto L17
            r2 = r6[r1]
            r3 = r7[r1]
            float r3 = r3 - r2
            float r3 = r3 * r5
            float r2 = r2 + r3
            r0[r1] = r2
            int r1 = r1 + 1
            goto L8
        L17:
            return r0
    }
}
