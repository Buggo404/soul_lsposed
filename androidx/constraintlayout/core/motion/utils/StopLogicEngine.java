package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class StopLogicEngine implements androidx.constraintlayout.core.motion.utils.StopEngine {
    private static final float EPSILON = 1.0E-5f;
    private boolean mBackwards;
    private boolean mDone;
    private float mLastPosition;
    private int mNumberOfStages;
    private float mStage1Duration;
    private float mStage1EndPosition;
    private float mStage1Velocity;
    private float mStage2Duration;
    private float mStage2EndPosition;
    private float mStage2Velocity;
    private float mStage3Duration;
    private float mStage3EndPosition;
    private float mStage3Velocity;
    private float mStartPosition;
    private java.lang.String mType;

    public StopLogicEngine() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mBackwards = r0
            r1.mDone = r0
            return
    }

    private float calcY(float r6) {
            r5 = this;
            r0 = 0
            r5.mDone = r0
            float r0 = r5.mStage1Duration
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 > 0) goto L18
            float r1 = r5.mStage1Velocity
            float r3 = r1 * r6
            float r4 = r5.mStage2Velocity
            float r4 = r4 - r1
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r2
            float r4 = r4 / r0
            float r3 = r3 + r4
            return r3
        L18:
            int r1 = r5.mNumberOfStages
            r3 = 1
            if (r1 != r3) goto L20
            float r6 = r5.mStage1EndPosition
            return r6
        L20:
            float r6 = r6 - r0
            float r0 = r5.mStage2Duration
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 >= 0) goto L37
            float r1 = r5.mStage1EndPosition
            float r3 = r5.mStage2Velocity
            float r4 = r3 * r6
            float r1 = r1 + r4
            float r4 = r5.mStage3Velocity
            float r4 = r4 - r3
            float r4 = r4 * r6
            float r4 = r4 * r6
            float r0 = r0 * r2
            float r4 = r4 / r0
            float r1 = r1 + r4
            return r1
        L37:
            r4 = 2
            if (r1 != r4) goto L3d
            float r6 = r5.mStage2EndPosition
            return r6
        L3d:
            float r6 = r6 - r0
            float r0 = r5.mStage3Duration
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 > 0) goto L51
            float r1 = r5.mStage2EndPosition
            float r3 = r5.mStage3Velocity
            float r4 = r3 * r6
            float r1 = r1 + r4
            float r3 = r3 * r6
            float r3 = r3 * r6
            float r0 = r0 * r2
            float r3 = r3 / r0
            float r1 = r1 - r3
            return r1
        L51:
            r5.mDone = r3
            float r6 = r5.mStage3EndPosition
            return r6
    }

    private void setup(float r9, float r10, float r11, float r12, float r13) {
            r8 = this;
            r0 = 0
            r8.mDone = r0
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 != 0) goto Lb
            r9 = 953267991(0x38d1b717, float:1.0E-4)
        Lb:
            r8.mStage1Velocity = r9
            float r1 = r9 / r11
            float r2 = r1 * r9
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r5 = 3
            r6 = 2
            if (r4 >= 0) goto L73
            float r13 = -r9
            float r13 = r13 / r11
            float r13 = r13 * r9
            float r13 = r13 / r3
            float r13 = r10 - r13
            float r13 = r13 * r11
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            int r1 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r1 >= 0) goto L4a
            java.lang.String r12 = "backward accelerate, decelerate"
            r8.mType = r12
            r8.mNumberOfStages = r6
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r13
            r8.mStage3Velocity = r0
            float r12 = r13 - r9
            float r12 = r12 / r11
            r8.mStage1Duration = r12
            float r11 = r13 / r11
            r8.mStage2Duration = r11
            float r9 = r9 + r13
            float r9 = r9 * r12
            float r9 = r9 / r3
            r8.mStage1EndPosition = r9
            r8.mStage2EndPosition = r10
            r8.mStage3EndPosition = r10
            return
        L4a:
            java.lang.String r13 = "backward accelerate cruse decelerate"
            r8.mType = r13
            r8.mNumberOfStages = r5
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r12
            r8.mStage3Velocity = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.mStage1Duration = r13
            float r11 = r12 / r11
            r8.mStage3Duration = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.mStage2Duration = r13
            r8.mStage1EndPosition = r9
            float r9 = r10 - r11
            r8.mStage2EndPosition = r9
            r8.mStage3EndPosition = r10
            return
        L73:
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 < 0) goto L89
            java.lang.String r11 = "hard stop"
            r8.mType = r11
            float r3 = r3 * r10
            float r3 = r3 / r9
            r11 = 1
            r8.mNumberOfStages = r11
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r0
            r8.mStage1EndPosition = r10
            r8.mStage1Duration = r3
            return
        L89:
            float r2 = r10 - r2
            float r4 = r2 / r9
            float r7 = r4 + r1
            int r13 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r13 >= 0) goto La8
            java.lang.String r11 = "cruse decelerate"
            r8.mType = r11
            r8.mNumberOfStages = r6
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r9
            r8.mStage3Velocity = r0
            r8.mStage1EndPosition = r2
            r8.mStage2EndPosition = r10
            r8.mStage1Duration = r4
            r8.mStage2Duration = r1
            return
        La8:
            float r13 = r11 * r10
            float r1 = r9 * r9
            float r1 = r1 / r3
            float r13 = r13 + r1
            double r1 = (double) r13
            double r1 = java.lang.Math.sqrt(r1)
            float r13 = (float) r1
            float r1 = r13 - r9
            float r1 = r1 / r11
            r8.mStage1Duration = r1
            float r2 = r13 / r11
            r8.mStage2Duration = r2
            int r4 = (r13 > r12 ? 1 : (r13 == r12 ? 0 : -1))
            if (r4 >= 0) goto Ld9
            java.lang.String r11 = "accelerate decelerate"
            r8.mType = r11
            r8.mNumberOfStages = r6
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r13
            r8.mStage3Velocity = r0
            r8.mStage1Duration = r1
            r8.mStage2Duration = r2
            float r9 = r9 + r13
            float r9 = r9 * r1
            float r9 = r9 / r3
            r8.mStage1EndPosition = r9
            r8.mStage2EndPosition = r10
            return
        Ld9:
            java.lang.String r13 = "accelerate cruse decelerate"
            r8.mType = r13
            r8.mNumberOfStages = r5
            r8.mStage1Velocity = r9
            r8.mStage2Velocity = r12
            r8.mStage3Velocity = r12
            float r13 = r12 - r9
            float r13 = r13 / r11
            r8.mStage1Duration = r13
            float r11 = r12 / r11
            r8.mStage3Duration = r11
            float r9 = r9 + r12
            float r9 = r9 * r13
            float r9 = r9 / r3
            float r11 = r11 * r12
            float r11 = r11 / r3
            float r13 = r10 - r9
            float r13 = r13 - r11
            float r13 = r13 / r12
            r8.mStage2Duration = r13
            r8.mStage1EndPosition = r9
            float r9 = r10 - r11
            r8.mStage2EndPosition = r9
            r8.mStage3EndPosition = r10
            return
    }

    public void config(float r7, float r8, float r9, float r10, float r11, float r12) {
            r6 = this;
            r1 = 0
            r6.mDone = r1
            r6.mStartPosition = r7
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 <= 0) goto La
            r1 = 1
        La:
            r6.mBackwards = r1
            if (r1 == 0) goto L19
            float r1 = -r9
            float r2 = r7 - r8
            r0 = r6
            r3 = r11
            r4 = r12
            r5 = r10
            r0.setup(r1, r2, r3, r4, r5)
            goto L23
        L19:
            float r2 = r8 - r7
            r0 = r6
            r1 = r9
            r3 = r11
            r4 = r12
            r5 = r10
            r0.setup(r1, r2, r3, r4, r5)
        L23:
            return
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public java.lang.String debug(java.lang.String r9, float r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r1 = " ===== "
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = r8.mType
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "\n"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            boolean r2 = r8.mBackwards
            if (r2 == 0) goto L33
            java.lang.String r2 = "backwards"
            goto L35
        L33:
            java.lang.String r2 = "forward "
        L35:
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.String r2 = " time = "
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r10)
            java.lang.String r2 = "  stages "
            java.lang.StringBuilder r0 = r0.append(r2)
            int r2 = r8.mNumberOfStages
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.StringBuilder r0 = r2.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.String r2 = " dur "
            java.lang.StringBuilder r0 = r0.append(r2)
            float r3 = r8.mStage1Duration
            java.lang.StringBuilder r0 = r0.append(r3)
            java.lang.String r3 = " vel "
            java.lang.StringBuilder r0 = r0.append(r3)
            float r4 = r8.mStage1Velocity
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r4 = " pos "
            java.lang.StringBuilder r0 = r0.append(r4)
            float r5 = r8.mStage1EndPosition
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r5 = r8.mNumberOfStages
            r6 = 1
            if (r5 <= r6) goto Lc8
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r0 = r0.append(r2)
            float r5 = r8.mStage2Duration
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r3)
            float r5 = r8.mStage2Velocity
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r4)
            float r5 = r8.mStage2EndPosition
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        Lc8:
            int r5 = r8.mNumberOfStages
            r7 = 2
            if (r5 <= r7) goto L100
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.StringBuilder r0 = r5.append(r0)
            java.lang.StringBuilder r0 = r0.append(r9)
            java.lang.StringBuilder r0 = r0.append(r2)
            float r2 = r8.mStage3Duration
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r3)
            float r2 = r8.mStage3Velocity
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r4)
            float r2 = r8.mStage3EndPosition
            java.lang.StringBuilder r0 = r0.append(r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
        L100:
            float r1 = r8.mStage1Duration
            int r2 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r2 > 0) goto L11e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "stage 0\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L11e:
            int r2 = r8.mNumberOfStages
            if (r2 != r6) goto L13a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "end stage 0\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L13a:
            float r10 = r10 - r1
            float r1 = r8.mStage2Duration
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 >= 0) goto L159
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = " stage 1\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L159:
            if (r2 != r7) goto L173
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = "end stage 1\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L173:
            float r10 = r10 - r1
            float r1 = r8.mStage3Duration
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L192
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = " stage 2\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
        L192:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.StringBuilder r10 = r10.append(r0)
            java.lang.StringBuilder r9 = r10.append(r9)
            java.lang.String r10 = " end stage 2\n"
            java.lang.StringBuilder r9 = r9.append(r10)
            java.lang.String r9 = r9.toString()
            return r9
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float r2) {
            r1 = this;
            float r0 = r1.calcY(r2)
            r1.mLastPosition = r2
            boolean r2 = r1.mBackwards
            if (r2 == 0) goto Le
            float r2 = r1.mStartPosition
            float r2 = r2 - r0
            goto L11
        Le:
            float r2 = r1.mStartPosition
            float r2 = r2 + r0
        L11:
            return r2
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity() {
            r1 = this;
            boolean r0 = r1.mBackwards
            if (r0 == 0) goto Lc
            float r0 = r1.mLastPosition
            float r0 = r1.getVelocity(r0)
            float r0 = -r0
            goto L12
        Lc:
            float r0 = r1.mLastPosition
            float r0 = r1.getVelocity(r0)
        L12:
            return r0
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getVelocity(float r4) {
            r3 = this;
            float r0 = r3.mStage1Duration
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 > 0) goto Lf
            float r1 = r3.mStage1Velocity
            float r2 = r3.mStage2Velocity
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        Lf:
            int r1 = r3.mNumberOfStages
            r2 = 1
            if (r1 != r2) goto L16
            r4 = 0
            return r4
        L16:
            float r4 = r4 - r0
            float r0 = r3.mStage2Duration
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L26
            float r1 = r3.mStage2Velocity
            float r2 = r3.mStage3Velocity
            float r2 = r2 - r1
            float r2 = r2 * r4
            float r2 = r2 / r0
            float r1 = r1 + r2
            return r1
        L26:
            r2 = 2
            if (r1 != r2) goto L2c
            float r4 = r3.mStage2EndPosition
            return r4
        L2c:
            float r4 = r4 - r0
            float r0 = r3.mStage3Duration
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L39
            float r1 = r3.mStage3Velocity
            float r4 = r4 * r1
            float r4 = r4 / r0
            float r1 = r1 - r4
            return r1
        L39:
            float r4 = r3.mStage3EndPosition
            return r4
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean isStopped() {
            r3 = this;
            float r0 = r3.getVelocity()
            r1 = 925353388(0x3727c5ac, float:1.0E-5)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a
            float r0 = r3.mStage3EndPosition
            float r2 = r3.mLastPosition
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }
}
