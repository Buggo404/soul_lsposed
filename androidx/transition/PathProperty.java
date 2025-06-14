package androidx.transition;

/* loaded from: classes.dex */
class PathProperty<T> extends android.util.Property<T, java.lang.Float> {
    private float mCurrentFraction;
    private final float mPathLength;
    private final android.graphics.PathMeasure mPathMeasure;
    private final android.graphics.PointF mPointF;
    private final float[] mPosition;
    private final android.util.Property<T, android.graphics.PointF> mProperty;

    PathProperty(android.util.Property<T, android.graphics.PointF> r3, android.graphics.Path r4) {
            r2 = this;
            java.lang.Class<java.lang.Float> r0 = java.lang.Float.class
            java.lang.String r1 = r3.getName()
            r2.<init>(r0, r1)
            r0 = 2
            float[] r0 = new float[r0]
            r2.mPosition = r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r2.mPointF = r0
            r2.mProperty = r3
            android.graphics.PathMeasure r3 = new android.graphics.PathMeasure
            r0 = 0
            r3.<init>(r4, r0)
            r2.mPathMeasure = r3
            float r3 = r3.getLength()
            r2.mPathLength = r3
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.util.Property
    public java.lang.Float get(T r1) {
            r0 = this;
            float r1 = r0.mCurrentFraction
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            return r1
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ java.lang.Float get(java.lang.Object r1) {
            r0 = this;
            java.lang.Float r1 = r0.get(r1)
            return r1
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(T r4, java.lang.Float r5) {
            r3 = this;
            float r0 = r5.floatValue()
            r3.mCurrentFraction = r0
            android.graphics.PathMeasure r0 = r3.mPathMeasure
            float r1 = r3.mPathLength
            float r5 = r5.floatValue()
            float r1 = r1 * r5
            float[] r5 = r3.mPosition
            r2 = 0
            r0.getPosTan(r1, r5, r2)
            android.graphics.PointF r5 = r3.mPointF
            float[] r0 = r3.mPosition
            r1 = 0
            r0 = r0[r1]
            r5.x = r0
            android.graphics.PointF r5 = r3.mPointF
            float[] r0 = r3.mPosition
            r1 = 1
            r0 = r0[r1]
            r5.y = r0
            android.util.Property<T, android.graphics.PointF> r5 = r3.mProperty
            android.graphics.PointF r0 = r3.mPointF
            r5.set(r4, r0)
            return
    }

    @Override // android.util.Property
    public /* bridge */ /* synthetic */ void set(java.lang.Object r1, java.lang.Float r2) {
            r0 = this;
            java.lang.Float r2 = (java.lang.Float) r2
            r0.set2(r1, r2)
            return
    }
}
