package androidx.transition;

/* loaded from: classes.dex */
class RectEvaluator implements android.animation.TypeEvaluator<android.graphics.Rect> {
    private android.graphics.Rect mRect;

    RectEvaluator() {
            r0 = this;
            r0.<init>()
            return
    }

    RectEvaluator(android.graphics.Rect r1) {
            r0 = this;
            r0.<init>()
            r0.mRect = r1
            return
    }

    /* renamed from: evaluate, reason: avoid collision after fix types in other method */
    public android.graphics.Rect evaluate2(float r6, android.graphics.Rect r7, android.graphics.Rect r8) {
            r5 = this;
            int r0 = r7.left
            int r1 = r8.left
            int r2 = r7.left
            int r1 = r1 - r2
            float r1 = (float) r1
            float r1 = r1 * r6
            int r1 = (int) r1
            int r0 = r0 + r1
            int r1 = r7.top
            int r2 = r8.top
            int r3 = r7.top
            int r2 = r2 - r3
            float r2 = (float) r2
            float r2 = r2 * r6
            int r2 = (int) r2
            int r1 = r1 + r2
            int r2 = r7.right
            int r3 = r8.right
            int r4 = r7.right
            int r3 = r3 - r4
            float r3 = (float) r3
            float r3 = r3 * r6
            int r3 = (int) r3
            int r2 = r2 + r3
            int r3 = r7.bottom
            int r8 = r8.bottom
            int r7 = r7.bottom
            int r8 = r8 - r7
            float r7 = (float) r8
            float r7 = r7 * r6
            int r6 = (int) r7
            int r3 = r3 + r6
            android.graphics.Rect r6 = r5.mRect
            if (r6 != 0) goto L36
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r0, r1, r2, r3)
            return r6
        L36:
            r6.set(r0, r1, r2, r3)
            android.graphics.Rect r6 = r5.mRect
            return r6
    }

    @Override // android.animation.TypeEvaluator
    public /* bridge */ /* synthetic */ android.graphics.Rect evaluate(float r1, android.graphics.Rect r2, android.graphics.Rect r3) {
            r0 = this;
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            android.graphics.Rect r1 = r0.evaluate2(r1, r2, r3)
            return r1
    }
}
