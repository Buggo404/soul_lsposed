package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
public final class FlingAnimation extends androidx.dynamicanimation.animation.DynamicAnimation<androidx.dynamicanimation.animation.FlingAnimation> {
    private final androidx.dynamicanimation.animation.FlingAnimation.DragForce mFlingForce;

    static final class DragForce implements androidx.dynamicanimation.animation.Force {
        private static final float DEFAULT_FRICTION = -4.2f;
        private static final float VELOCITY_THRESHOLD_MULTIPLIER = 62.5f;
        private float mFriction;
        private final androidx.dynamicanimation.animation.DynamicAnimation.MassState mMassState;
        private float mVelocityThreshold;

        DragForce() {
                r1 = this;
                r1.<init>()
                r0 = -1064933786(0xffffffffc0866666, float:-4.2)
                r1.mFriction = r0
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r0 = new androidx.dynamicanimation.animation.DynamicAnimation$MassState
                r0.<init>()
                r1.mMassState = r0
                return
        }

        @Override // androidx.dynamicanimation.animation.Force
        public float getAcceleration(float r1, float r2) {
                r0 = this;
                float r1 = r0.mFriction
                float r2 = r2 * r1
                return r2
        }

        float getFrictionScalar() {
                r2 = this;
                float r0 = r2.mFriction
                r1 = -1064933786(0xffffffffc0866666, float:-4.2)
                float r0 = r0 / r1
                return r0
        }

        @Override // androidx.dynamicanimation.animation.Force
        public boolean isAtEquilibrium(float r1, float r2) {
                r0 = this;
                float r1 = java.lang.Math.abs(r2)
                float r2 = r0.mVelocityThreshold
                int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                if (r1 >= 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }

        void setFrictionScalar(float r2) {
                r1 = this;
                r0 = -1064933786(0xffffffffc0866666, float:-4.2)
                float r2 = r2 * r0
                r1.mFriction = r2
                return
        }

        void setValueThreshold(float r2) {
                r1 = this;
                r0 = 1115291648(0x427a0000, float:62.5)
                float r2 = r2 * r0
                r1.mVelocityThreshold = r2
                return
        }

        androidx.dynamicanimation.animation.DynamicAnimation.MassState updateValueAndVelocity(float r6, float r7, long r8) {
                r5 = this;
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r0 = r5.mMassState
                double r1 = (double) r7
                float r8 = (float) r8
                r9 = 1148846080(0x447a0000, float:1000.0)
                float r3 = r8 / r9
                float r4 = r5.mFriction
                float r3 = r3 * r4
                double r3 = (double) r3
                double r3 = java.lang.Math.exp(r3)
                double r1 = r1 * r3
                float r1 = (float) r1
                r0.mVelocity = r1
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r0 = r5.mMassState
                float r1 = r5.mFriction
                float r2 = r7 / r1
                float r6 = r6 - r2
                double r2 = (double) r6
                float r7 = r7 / r1
                double r6 = (double) r7
                float r1 = r1 * r8
                float r1 = r1 / r9
                double r8 = (double) r1
                double r8 = java.lang.Math.exp(r8)
                double r6 = r6 * r8
                double r2 = r2 + r6
                float r6 = (float) r2
                r0.mValue = r6
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r6 = r5.mMassState
                float r6 = r6.mValue
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r7 = r5.mMassState
                float r7 = r7.mVelocity
                boolean r6 = r5.isAtEquilibrium(r6, r7)
                if (r6 == 0) goto L3d
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r6 = r5.mMassState
                r7 = 0
                r6.mVelocity = r7
            L3d:
                androidx.dynamicanimation.animation.DynamicAnimation$MassState r6 = r5.mMassState
                return r6
        }
    }

    public FlingAnimation(androidx.dynamicanimation.animation.FloatValueHolder r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r2 = new androidx.dynamicanimation.animation.FlingAnimation$DragForce
            r2.<init>()
            r1.mFlingForce = r2
            float r0 = r1.getValueThreshold()
            r2.setValueThreshold(r0)
            return
    }

    public <K> FlingAnimation(K r1, androidx.dynamicanimation.animation.FloatPropertyCompat<K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r1 = new androidx.dynamicanimation.animation.FlingAnimation$DragForce
            r1.<init>()
            r0.mFlingForce = r1
            float r2 = r0.getValueThreshold()
            r1.setValueThreshold(r2)
            return
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    float getAcceleration(float r2, float r3) {
            r1 = this;
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r1.mFlingForce
            float r2 = r0.getAcceleration(r2, r3)
            return r2
    }

    public float getFriction() {
            r1 = this;
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r1.mFlingForce
            float r0 = r0.getFrictionScalar()
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean isAtEquilibrium(float r2, float r3) {
            r1 = this;
            float r0 = r1.mMaxValue
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L17
            float r0 = r1.mMinValue
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L17
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r1.mFlingForce
            boolean r2 = r0.isAtEquilibrium(r2, r3)
            if (r2 == 0) goto L15
            goto L17
        L15:
            r2 = 0
            goto L18
        L17:
            r2 = 1
        L18:
            return r2
    }

    public androidx.dynamicanimation.animation.FlingAnimation setFriction(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lb
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r1.mFlingForce
            r0.setFrictionScalar(r2)
            return r1
        Lb:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Friction must be positive"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ androidx.dynamicanimation.animation.DynamicAnimation setMaxValue(float r1) {
            r0 = this;
            androidx.dynamicanimation.animation.FlingAnimation r1 = r0.setMaxValue(r1)
            return r1
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public androidx.dynamicanimation.animation.FlingAnimation setMaxValue(float r1) {
            r0 = this;
            super.setMaxValue(r1)
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ androidx.dynamicanimation.animation.DynamicAnimation setMinValue(float r1) {
            r0 = this;
            androidx.dynamicanimation.animation.FlingAnimation r1 = r0.setMinValue(r1)
            return r1
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public androidx.dynamicanimation.animation.FlingAnimation setMinValue(float r1) {
            r0 = this;
            super.setMinValue(r1)
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public /* bridge */ /* synthetic */ androidx.dynamicanimation.animation.DynamicAnimation setStartVelocity(float r1) {
            r0 = this;
            androidx.dynamicanimation.animation.FlingAnimation r1 = r0.setStartVelocity(r1)
            return r1
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public androidx.dynamicanimation.animation.FlingAnimation setStartVelocity(float r1) {
            r0 = this;
            super.setStartVelocity(r1)
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void setValueThreshold(float r2) {
            r1 = this;
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r1.mFlingForce
            r0.setValueThreshold(r2)
            return
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean updateValueAndVelocity(long r4) {
            r3 = this;
            androidx.dynamicanimation.animation.FlingAnimation$DragForce r0 = r3.mFlingForce
            float r1 = r3.mValue
            float r2 = r3.mVelocity
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r4 = r0.updateValueAndVelocity(r1, r2, r4)
            float r5 = r4.mValue
            r3.mValue = r5
            float r4 = r4.mVelocity
            r3.mVelocity = r4
            float r4 = r3.mValue
            float r5 = r3.mMinValue
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r5 = 1
            if (r4 >= 0) goto L20
            float r4 = r3.mMinValue
            r3.mValue = r4
            return r5
        L20:
            float r4 = r3.mValue
            float r0 = r3.mMaxValue
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L2d
            float r4 = r3.mMaxValue
            r3.mValue = r4
            return r5
        L2d:
            float r4 = r3.mValue
            float r0 = r3.mVelocity
            boolean r4 = r3.isAtEquilibrium(r4, r0)
            if (r4 == 0) goto L38
            return r5
        L38:
            r4 = 0
            return r4
    }
}
