package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
public final class SpringForce implements androidx.dynamicanimation.animation.Force {
    public static final float DAMPING_RATIO_HIGH_BOUNCY = 0.2f;
    public static final float DAMPING_RATIO_LOW_BOUNCY = 0.75f;
    public static final float DAMPING_RATIO_MEDIUM_BOUNCY = 0.5f;
    public static final float DAMPING_RATIO_NO_BOUNCY = 1.0f;
    public static final float STIFFNESS_HIGH = 10000.0f;
    public static final float STIFFNESS_LOW = 200.0f;
    public static final float STIFFNESS_MEDIUM = 1500.0f;
    public static final float STIFFNESS_VERY_LOW = 50.0f;
    private static final double UNSET = Double.MAX_VALUE;
    private static final double VELOCITY_THRESHOLD_MULTIPLIER = 62.5d;
    private double mDampedFreq;
    double mDampingRatio;
    private double mFinalPosition;
    private double mGammaMinus;
    private double mGammaPlus;
    private boolean mInitialized;
    private final androidx.dynamicanimation.animation.DynamicAnimation.MassState mMassState;
    double mNaturalFreq;
    private double mValueThreshold;
    private double mVelocityThreshold;

    public SpringForce() {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.mNaturalFreq = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.mDampingRatio = r0
            r0 = 0
            r2.mInitialized = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.mFinalPosition = r0
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r0 = new androidx.dynamicanimation.animation.DynamicAnimation$MassState
            r0.<init>()
            r2.mMassState = r0
            return
    }

    public SpringForce(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.mNaturalFreq = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.mDampingRatio = r0
            r0 = 0
            r2.mInitialized = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.mFinalPosition = r0
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r0 = new androidx.dynamicanimation.animation.DynamicAnimation$MassState
            r0.<init>()
            r2.mMassState = r0
            double r0 = (double) r3
            r2.mFinalPosition = r0
            return
    }

    private void init() {
            r8 = this;
            boolean r0 = r8.mInitialized
            if (r0 == 0) goto L5
            return
        L5:
            double r0 = r8.mFinalPosition
            r2 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L50
            double r0 = r8.mDampingRatio
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L37
            double r4 = -r0
            double r6 = r8.mNaturalFreq
            double r4 = r4 * r6
            double r0 = r0 * r0
            double r0 = r0 - r2
            double r0 = java.lang.Math.sqrt(r0)
            double r6 = r6 * r0
            double r4 = r4 + r6
            r8.mGammaPlus = r4
            double r0 = r8.mDampingRatio
            double r4 = -r0
            double r6 = r8.mNaturalFreq
            double r4 = r4 * r6
            double r0 = r0 * r0
            double r0 = r0 - r2
            double r0 = java.lang.Math.sqrt(r0)
            double r6 = r6 * r0
            double r4 = r4 - r6
            r8.mGammaMinus = r4
            goto L4c
        L37:
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 < 0) goto L4c
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L4c
            double r4 = r8.mNaturalFreq
            double r0 = r0 * r0
            double r2 = r2 - r0
            double r0 = java.lang.Math.sqrt(r2)
            double r4 = r4 * r0
            r8.mDampedFreq = r4
        L4c:
            r0 = 1
            r8.mInitialized = r0
            return
        L50:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Error: Final position of the spring must be set before the animation starts"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.dynamicanimation.animation.Force
    public float getAcceleration(float r7, float r8) {
            r6 = this;
            float r0 = r6.getFinalPosition()
            float r7 = r7 - r0
            double r0 = r6.mNaturalFreq
            double r2 = r0 * r0
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 * r4
            double r4 = r6.mDampingRatio
            double r0 = r0 * r4
            double r2 = -r2
            double r4 = (double) r7
            double r2 = r2 * r4
            double r7 = (double) r8
            double r0 = r0 * r7
            double r2 = r2 - r0
            float r7 = (float) r2
            return r7
    }

    public float getDampingRatio() {
            r2 = this;
            double r0 = r2.mDampingRatio
            float r0 = (float) r0
            return r0
    }

    public float getFinalPosition() {
            r2 = this;
            double r0 = r2.mFinalPosition
            float r0 = (float) r0
            return r0
    }

    public float getStiffness() {
            r2 = this;
            double r0 = r2.mNaturalFreq
            double r0 = r0 * r0
            float r0 = (float) r0
            return r0
    }

    @Override // androidx.dynamicanimation.animation.Force
    public boolean isAtEquilibrium(float r5, float r6) {
            r4 = this;
            float r6 = java.lang.Math.abs(r6)
            double r0 = (double) r6
            double r2 = r4.mVelocityThreshold
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 >= 0) goto L1d
            float r6 = r4.getFinalPosition()
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            double r5 = (double) r5
            double r0 = r4.mValueThreshold
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L1d
            r5 = 1
            return r5
        L1d:
            r5 = 0
            return r5
    }

    public androidx.dynamicanimation.animation.SpringForce setDampingRatio(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            double r0 = (double) r3
            r2.mDampingRatio = r0
            r3 = 0
            r2.mInitialized = r3
            return r2
        Lc:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Damping ratio must be non-negative"
            r3.<init>(r0)
            throw r3
    }

    public androidx.dynamicanimation.animation.SpringForce setFinalPosition(float r3) {
            r2 = this;
            double r0 = (double) r3
            r2.mFinalPosition = r0
            return r2
    }

    public androidx.dynamicanimation.animation.SpringForce setStiffness(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            double r0 = (double) r3
            double r0 = java.lang.Math.sqrt(r0)
            r2.mNaturalFreq = r0
            r3 = 0
            r2.mInitialized = r3
            return r2
        L10:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Spring stiffness constant must be positive."
            r3.<init>(r0)
            throw r3
    }

    void setValueThreshold(double r3) {
            r2 = this;
            double r3 = java.lang.Math.abs(r3)
            r2.mValueThreshold = r3
            r0 = 4633992910331707392(0x404f400000000000, double:62.5)
            double r3 = r3 * r0
            r2.mVelocityThreshold = r3
            return
    }

    androidx.dynamicanimation.animation.DynamicAnimation.MassState updateValues(double r17, double r19, long r21) {
            r16 = this;
            r0 = r16
            r16.init()
            r1 = r21
            double r1 = (double) r1
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r3
            double r3 = r0.mFinalPosition
            double r3 = r17 - r3
            double r5 = r0.mDampingRatio
            r7 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r10 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            if (r9 <= 0) goto L56
            double r5 = r0.mGammaMinus
            double r7 = r5 * r3
            double r7 = r7 - r19
            double r12 = r0.mGammaPlus
            double r14 = r5 - r12
            double r7 = r7 / r14
            double r7 = r3 - r7
            double r3 = r3 * r5
            double r3 = r3 - r19
            double r12 = r5 - r12
            double r3 = r3 / r12
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r5 = r5 * r7
            double r12 = r0.mGammaPlus
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 * r3
            double r5 = r5 + r12
            double r12 = r0.mGammaMinus
            double r7 = r7 * r12
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r7 = r7 * r12
            double r12 = r0.mGammaPlus
            double r3 = r3 * r12
            double r12 = r12 * r1
            double r1 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r1
            double r7 = r7 + r3
            goto Ld2
        L56:
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L80
            double r5 = r0.mNaturalFreq
            double r7 = r5 * r3
            double r7 = r19 + r7
            double r12 = r7 * r1
            double r3 = r3 + r12
            double r5 = -r5
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r5 = r5 * r3
            double r12 = r0.mNaturalFreq
            double r12 = -r12
            double r12 = r12 * r1
            double r12 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r12
            double r12 = r0.mNaturalFreq
            double r14 = -r12
            double r3 = r3 * r14
            double r12 = -r12
            double r12 = r12 * r1
            double r1 = java.lang.Math.pow(r10, r12)
            double r7 = r7 * r1
            double r7 = r7 + r3
            goto Ld2
        L80:
            double r12 = r0.mDampedFreq
            double r7 = r7 / r12
            double r12 = r0.mNaturalFreq
            double r14 = r5 * r12
            double r14 = r14 * r3
            double r14 = r14 + r19
            double r7 = r7 * r14
            double r5 = -r5
            double r5 = r5 * r12
            double r5 = r5 * r1
            double r5 = java.lang.Math.pow(r10, r5)
            double r12 = r0.mDampedFreq
            double r12 = r12 * r1
            double r12 = java.lang.Math.cos(r12)
            double r12 = r12 * r3
            double r14 = r0.mDampedFreq
            double r14 = r14 * r1
            double r14 = java.lang.Math.sin(r14)
            double r14 = r14 * r7
            double r12 = r12 + r14
            double r5 = r5 * r12
            double r12 = r0.mNaturalFreq
            double r14 = -r12
            double r14 = r14 * r5
            double r10 = r0.mDampingRatio
            double r14 = r14 * r10
            double r9 = -r10
            double r9 = r9 * r12
            double r9 = r9 * r1
            r11 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            double r9 = java.lang.Math.pow(r11, r9)
            double r11 = r0.mDampedFreq
            r17 = r5
            double r5 = -r11
            double r5 = r5 * r3
            double r11 = r11 * r1
            double r3 = java.lang.Math.sin(r11)
            double r5 = r5 * r3
            double r3 = r0.mDampedFreq
            double r7 = r7 * r3
            double r3 = r3 * r1
            double r1 = java.lang.Math.cos(r3)
            double r7 = r7 * r1
            double r5 = r5 + r7
            double r9 = r9 * r5
            double r7 = r14 + r9
            r5 = r17
        Ld2:
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r0.mMassState
            double r2 = r0.mFinalPosition
            double r5 = r5 + r2
            float r2 = (float) r5
            r1.mValue = r2
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r0.mMassState
            float r2 = (float) r7
            r1.mVelocity = r2
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r0.mMassState
            return r1
    }
}
