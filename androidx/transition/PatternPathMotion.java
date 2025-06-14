package androidx.transition;

/* loaded from: classes.dex */
public class PatternPathMotion extends androidx.transition.PathMotion {
    private android.graphics.Path mOriginalPatternPath;
    private final android.graphics.Path mPatternPath;
    private final android.graphics.Matrix mTempMatrix;

    public PatternPathMotion() {
            r3 = this;
            r3.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r3.mPatternPath = r0
            android.graphics.Matrix r1 = new android.graphics.Matrix
            r1.<init>()
            r3.mTempMatrix = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r0.lineTo(r1, r2)
            r3.mOriginalPatternPath = r0
            return
    }

    public PatternPathMotion(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r2.mPatternPath = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r2.mTempMatrix = r0
            int[] r0 = androidx.transition.Styleable.PATTERN_PATH_MOTION
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0)
            org.xmlpull.v1.XmlPullParser r4 = (org.xmlpull.v1.XmlPullParser) r4     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "patternPathData"
            r1 = 0
            java.lang.String r4 = androidx.core.content.res.TypedArrayUtils.getNamedString(r3, r4, r0, r1)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2d
            android.graphics.Path r4 = androidx.core.graphics.PathParser.createPathFromPathData(r4)     // Catch: java.lang.Throwable -> L35
            r2.setPatternPath(r4)     // Catch: java.lang.Throwable -> L35
            r3.recycle()
            return
        L2d:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = "pathData must be supplied for patternPathMotion"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L35
            throw r4     // Catch: java.lang.Throwable -> L35
        L35:
            r4 = move-exception
            r3.recycle()
            throw r4
    }

    public PatternPathMotion(android.graphics.Path r2) {
            r1 = this;
            r1.<init>()
            android.graphics.Path r0 = new android.graphics.Path
            r0.<init>()
            r1.mPatternPath = r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.mTempMatrix = r0
            r1.setPatternPath(r2)
            return
    }

    private static float distance(float r0, float r1) {
            float r0 = r0 * r0
            float r1 = r1 * r1
            float r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            return r0
    }

    @Override // androidx.transition.PathMotion
    public android.graphics.Path getPath(float r4, float r5, float r6, float r7) {
            r3 = this;
            float r6 = r6 - r4
            float r7 = r7 - r5
            float r0 = distance(r6, r7)
            double r1 = (double) r7
            double r6 = (double) r6
            double r6 = java.lang.Math.atan2(r1, r6)
            android.graphics.Matrix r1 = r3.mTempMatrix
            r1.setScale(r0, r0)
            android.graphics.Matrix r0 = r3.mTempMatrix
            double r6 = java.lang.Math.toDegrees(r6)
            float r6 = (float) r6
            r0.postRotate(r6)
            android.graphics.Matrix r6 = r3.mTempMatrix
            r6.postTranslate(r4, r5)
            android.graphics.Path r4 = new android.graphics.Path
            r4.<init>()
            android.graphics.Path r5 = r3.mPatternPath
            android.graphics.Matrix r6 = r3.mTempMatrix
            r5.transform(r6, r4)
            return r4
    }

    public android.graphics.Path getPatternPath() {
            r1 = this;
            android.graphics.Path r0 = r1.mOriginalPatternPath
            return r0
    }

    public void setPatternPath(android.graphics.Path r9) {
            r8 = this;
            android.graphics.PathMeasure r0 = new android.graphics.PathMeasure
            r1 = 0
            r0.<init>(r9, r1)
            float r2 = r0.getLength()
            r3 = 2
            float[] r3 = new float[r3]
            r4 = 0
            r0.getPosTan(r2, r3, r4)
            r2 = r3[r1]
            r5 = 1
            r6 = r3[r5]
            r7 = 0
            r0.getPosTan(r7, r3, r4)
            r0 = r3[r1]
            r1 = r3[r5]
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 != 0) goto L2f
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 == 0) goto L27
            goto L2f
        L27:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "pattern must not end at the starting point"
            r9.<init>(r0)
            throw r9
        L2f:
            android.graphics.Matrix r3 = r8.mTempMatrix
            float r4 = -r0
            float r5 = -r1
            r3.setTranslate(r4, r5)
            float r2 = r2 - r0
            float r6 = r6 - r1
            float r0 = distance(r2, r6)
            r1 = 1065353216(0x3f800000, float:1.0)
            float r1 = r1 / r0
            android.graphics.Matrix r0 = r8.mTempMatrix
            r0.postScale(r1, r1)
            double r0 = (double) r6
            double r2 = (double) r2
            double r0 = java.lang.Math.atan2(r0, r2)
            android.graphics.Matrix r2 = r8.mTempMatrix
            double r0 = -r0
            double r0 = java.lang.Math.toDegrees(r0)
            float r0 = (float) r0
            r2.postRotate(r0)
            android.graphics.Matrix r0 = r8.mTempMatrix
            android.graphics.Path r1 = r8.mPatternPath
            r9.transform(r0, r1)
            r8.mOriginalPatternPath = r9
            return
    }
}
