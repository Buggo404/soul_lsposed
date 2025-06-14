package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class VelocityMatrix {
    private static java.lang.String TAG = "VelocityMatrix";
    float mDRotate;
    float mDScaleX;
    float mDScaleY;
    float mDTranslateX;
    float mDTranslateY;
    float mRotate;

    static {
            return
    }

    public VelocityMatrix() {
            r0 = this;
            r0.<init>()
            return
    }

    public void applyTransform(float r19, float r20, int r21, int r22, float[] r23) {
            r18 = this;
            r0 = r18
            r1 = r21
            r2 = 0
            r3 = r23[r2]
            r4 = 1
            r5 = r23[r4]
            r6 = 1056964608(0x3f000000, float:0.5)
            float r7 = r19 - r6
            r8 = 1073741824(0x40000000, float:2.0)
            float r7 = r7 * r8
            float r6 = r20 - r6
            float r6 = r6 * r8
            float r8 = r0.mDTranslateX
            float r3 = r3 + r8
            float r8 = r0.mDTranslateY
            float r5 = r5 + r8
            float r8 = r0.mDScaleX
            float r8 = r8 * r7
            float r3 = r3 + r8
            float r8 = r0.mDScaleY
            float r8 = r8 * r6
            float r5 = r5 + r8
            float r8 = r0.mRotate
            double r8 = (double) r8
            double r8 = java.lang.Math.toRadians(r8)
            float r8 = (float) r8
            float r9 = r0.mDRotate
            double r9 = (double) r9
            double r9 = java.lang.Math.toRadians(r9)
            float r9 = (float) r9
            int r10 = -r1
            float r10 = (float) r10
            float r10 = r10 * r7
            double r10 = (double) r10
            double r12 = (double) r8
            double r14 = java.lang.Math.sin(r12)
            double r10 = r10 * r14
            r8 = r22
            float r8 = (float) r8
            float r8 = r8 * r6
            double r14 = (double) r8
            double r16 = java.lang.Math.cos(r12)
            double r16 = r16 * r14
            double r10 = r10 - r16
            float r6 = (float) r10
            float r6 = r6 * r9
            float r3 = r3 + r6
            float r1 = (float) r1
            float r1 = r1 * r7
            double r6 = (double) r1
            double r10 = java.lang.Math.cos(r12)
            double r6 = r6 * r10
            double r10 = java.lang.Math.sin(r12)
            double r14 = r14 * r10
            double r6 = r6 - r14
            float r1 = (float) r6
            float r9 = r9 * r1
            float r5 = r5 + r9
            r23[r2] = r3
            r23[r4] = r5
            return
    }

    public void clear() {
            r1 = this;
            r0 = 0
            r1.mDRotate = r0
            r1.mDTranslateY = r0
            r1.mDTranslateX = r0
            r1.mDScaleY = r0
            r1.mDScaleX = r0
            return
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1, float r2) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.getSlope(r2)
            r0.mDRotate = r1
        L8:
            return
    }

    public void setRotationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet r2, float r3) {
            r1 = this;
            if (r2 == 0) goto Le
            float r0 = r2.getSlope(r3)
            r1.mDRotate = r0
            float r2 = r2.get(r3)
            r1.mRotate = r2
        Le:
            return
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.getSlope(r3)
            r0.mDScaleX = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.getSlope(r3)
            r0.mDScaleY = r1
        L10:
            return
    }

    public void setScaleVelocity(androidx.constraintlayout.core.motion.utils.SplineSet r1, androidx.constraintlayout.core.motion.utils.SplineSet r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.getSlope(r3)
            r0.mDScaleX = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.getSlope(r3)
            r0.mDScaleY = r1
        L10:
            return
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r1, androidx.constraintlayout.core.motion.utils.KeyCycleOscillator r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.getSlope(r3)
            r0.mDTranslateX = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.getSlope(r3)
            r0.mDTranslateY = r1
        L10:
            return
    }

    public void setTranslationVelocity(androidx.constraintlayout.core.motion.utils.SplineSet r1, androidx.constraintlayout.core.motion.utils.SplineSet r2, float r3) {
            r0 = this;
            if (r1 == 0) goto L8
            float r1 = r1.getSlope(r3)
            r0.mDTranslateX = r1
        L8:
            if (r2 == 0) goto L10
            float r1 = r2.getSlope(r3)
            r0.mDTranslateY = r1
        L10:
            return
    }
}
