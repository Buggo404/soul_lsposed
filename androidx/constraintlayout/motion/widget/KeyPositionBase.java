package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
abstract class KeyPositionBase extends androidx.constraintlayout.motion.widget.Key {
    protected static final float SELECTION_SLOPE = 20.0f;
    int mCurveFit;

    KeyPositionBase() {
            r1 = this;
            r1.<init>()
            int r0 = androidx.constraintlayout.motion.widget.KeyPositionBase.UNSET
            r1.mCurveFit = r0
            return
    }

    abstract void calcPosition(int r1, int r2, float r3, float r4, float r5, float r6);

    @Override // androidx.constraintlayout.motion.widget.Key
    void getAttributeNames(java.util.HashSet<java.lang.String> r1) {
            r0 = this;
            return
    }

    abstract float getPositionX();

    abstract float getPositionY();

    public abstract boolean intersects(int r1, int r2, android.graphics.RectF r3, android.graphics.RectF r4, float r5, float r6);

    abstract void positionAttributes(android.view.View r1, android.graphics.RectF r2, android.graphics.RectF r3, float r4, float r5, java.lang.String[] r6, float[] r7);
}
