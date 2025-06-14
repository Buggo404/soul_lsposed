package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class SpringStopEngine implements androidx.constraintlayout.core.motion.utils.StopEngine {
    private static final double UNSET = Double.MAX_VALUE;
    private int mBoundaryMode;
    double mDamping;
    private boolean mInitialized;
    private float mLastTime;
    private double mLastVelocity;
    private float mMass;
    private float mPos;
    private double mStiffness;
    private float mStopThreshold;
    private double mTargetPos;

    /* renamed from: mV */
    private float f34mV;

    public SpringStopEngine() {
            r2 = this;
            r2.<init>()
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.mDamping = r0
            r0 = 0
            r2.mInitialized = r0
            r2.mBoundaryMode = r0
            return
    }

    private void compute(double r25) {
            r24 = this;
            r0 = r24
            double r1 = r0.mStiffness
            double r3 = r0.mDamping
            float r5 = r0.mMass
            double r5 = (double) r5
            double r5 = r1 / r5
            double r5 = java.lang.Math.sqrt(r5)
            double r5 = r5 * r25
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r5 = r5 * r7
            r7 = 4621256167635550208(0x4022000000000000, double:9.0)
            double r7 = r7 / r5
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r7 = r7 + r5
            int r5 = (int) r7
            double r6 = (double) r5
            double r6 = r25 / r6
            r8 = 0
        L1f:
            if (r8 >= r5) goto L8f
            float r9 = r0.mPos
            double r10 = (double) r9
            double r12 = r0.mTargetPos
            double r10 = r10 - r12
            double r14 = -r1
            double r14 = r14 * r10
            float r10 = r0.f34mV
            r16 = r1
            double r1 = (double) r10
            double r1 = r1 * r3
            double r14 = r14 - r1
            float r1 = r0.mMass
            r18 = r3
            double r2 = (double) r1
            double r14 = r14 / r2
            double r2 = (double) r10
            double r14 = r14 * r6
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = r14 / r20
            double r2 = r2 + r14
            double r14 = (double) r9
            double r22 = r6 * r2
            double r22 = r22 / r20
            double r14 = r14 + r22
            double r14 = r14 - r12
            double r11 = -r14
            double r11 = r11 * r16
            double r2 = r2 * r18
            double r11 = r11 - r2
            double r1 = (double) r1
            double r11 = r11 / r1
            double r11 = r11 * r6
            double r1 = (double) r10
            double r3 = r11 / r20
            double r1 = r1 + r3
            double r3 = (double) r10
            double r3 = r3 + r11
            float r3 = (float) r3
            r0.f34mV = r3
            double r9 = (double) r9
            double r1 = r1 * r6
            double r9 = r9 + r1
            float r1 = (float) r9
            r0.mPos = r1
            int r2 = r0.mBoundaryMode
            if (r2 <= 0) goto L88
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L71
            r4 = r2 & 1
            r9 = 1
            if (r4 != r9) goto L71
            float r1 = -r1
            r0.mPos = r1
            float r1 = -r3
            r0.f34mV = r1
        L71:
            float r1 = r0.mPos
            r3 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L88
            r2 = r2 & 2
            r3 = 2
            if (r2 != r3) goto L88
            r2 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 - r1
            r0.mPos = r2
            float r1 = r0.f34mV
            float r1 = -r1
            r0.f34mV = r1
        L88:
            int r8 = r8 + 1
            r1 = r16
            r3 = r18
            goto L1f
        L8f:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public java.lang.String debug(java.lang.String r1, float r2) {
            r0 = this;
            r1 = 0
            return r1
    }

    public float getAcceleration() {
            r8 = this;
            double r0 = r8.mStiffness
            double r2 = r8.mDamping
            float r4 = r8.mPos
            double r4 = (double) r4
            double r6 = r8.mTargetPos
            double r4 = r4 - r6
            double r0 = -r0
            double r0 = r0 * r4
            float r4 = r8.f34mV
            double r4 = (double) r4
            double r2 = r2 * r4
            double r0 = r0 - r2
            float r0 = (float) r0
            float r1 = r8.mMass
            float r0 = r0 / r1
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float r3) {
            r2 = this;
            float r0 = r2.mLastTime
            float r0 = r3 - r0
            double r0 = (double) r0
            r2.compute(r0)
            r2.mLastTime = r3
            float r3 = r2.mPos
            return r3
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float r1) {
            r0 = this;
            float r1 = r0.f34mV
            return r1
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
            r8 = this;
            float r0 = r8.mPos
            double r0 = (double) r0
            double r2 = r8.mTargetPos
            double r0 = r0 - r2
            double r2 = r8.mStiffness
            float r4 = r8.f34mV
            double r4 = (double) r4
            float r6 = r8.mMass
            double r6 = (double) r6
            double r4 = r4 * r4
            double r4 = r4 * r6
            double r6 = r2 * r0
            double r6 = r6 * r0
            double r4 = r4 + r6
            double r4 = r4 / r2
            double r0 = java.lang.Math.sqrt(r4)
            float r2 = r8.mStopThreshold
            double r2 = (double) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L22
            r0 = 1
            goto L23
        L22:
            r0 = 0
        L23:
            return r0
    }

    void log(java.lang.String r4) {
            r3 = this;
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r1 = 1
            r0 = r0[r1]
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ".("
            r1.<init>(r2)
            java.lang.String r2 = r0.getFileName()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            int r2 = r0.getLineNumber()
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ") "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r0.getMethodName()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = "() "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.PrintStream r1 = java.lang.System.out
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r4 = r4.toString()
            r1.println(r4)
            return
    }

    public void springConfig(float r3, float r4, float r5, float r6, float r7, float r8, float r9, int r10) {
            r2 = this;
            double r0 = (double) r4
            r2.mTargetPos = r0
            double r0 = (double) r8
            r2.mDamping = r0
            r4 = 0
            r2.mInitialized = r4
            r2.mPos = r3
            double r3 = (double) r5
            r2.mLastVelocity = r3
            double r3 = (double) r7
            r2.mStiffness = r3
            r2.mMass = r6
            r2.mStopThreshold = r9
            r2.mBoundaryMode = r10
            r3 = 0
            r2.mLastTime = r3
            return
    }
}
