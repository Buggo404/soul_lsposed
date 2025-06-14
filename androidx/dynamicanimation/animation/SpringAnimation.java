package androidx.dynamicanimation.animation;

/* loaded from: classes.dex */
public final class SpringAnimation extends androidx.dynamicanimation.animation.DynamicAnimation<androidx.dynamicanimation.animation.SpringAnimation> {
    private static final float UNSET = Float.MAX_VALUE;
    private boolean mEndRequested;
    private float mPendingPosition;
    private androidx.dynamicanimation.animation.SpringForce mSpring;

    public SpringAnimation(androidx.dynamicanimation.animation.FloatValueHolder r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.mSpring = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mPendingPosition = r1
            r1 = 0
            r0.mEndRequested = r1
            return
    }

    public <K> SpringAnimation(K r1, androidx.dynamicanimation.animation.FloatPropertyCompat<K> r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mSpring = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mPendingPosition = r1
            r1 = 0
            r0.mEndRequested = r1
            return
    }

    public <K> SpringAnimation(K r1, androidx.dynamicanimation.animation.FloatPropertyCompat<K> r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 0
            r0.mSpring = r1
            r1 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mPendingPosition = r1
            r1 = 0
            r0.mEndRequested = r1
            androidx.dynamicanimation.animation.SpringForce r1 = new androidx.dynamicanimation.animation.SpringForce
            r1.<init>(r3)
            r0.mSpring = r1
            return
    }

    private void sanityCheck() {
            r4 = this;
            androidx.dynamicanimation.animation.SpringForce r0 = r4.mSpring
            if (r0 == 0) goto L28
            float r0 = r0.getFinalPosition()
            double r0 = (double) r0
            float r2 = r4.mMaxValue
            double r2 = (double) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L20
            float r2 = r4.mMinValue
            double r2 = (double) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L18
            return
        L18:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Final position of the spring cannot be less than the min value."
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Final position of the spring cannot be greater than the max value."
            r0.<init>(r1)
            throw r0
        L28:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Incomplete SpringAnimation: Either final position or a spring force needs to be set."
            r0.<init>(r1)
            throw r0
    }

    public void animateToFinalPosition(float r2) {
            r1 = this;
            boolean r0 = r1.isRunning()
            if (r0 == 0) goto L9
            r1.mPendingPosition = r2
            goto L1c
        L9:
            androidx.dynamicanimation.animation.SpringForce r0 = r1.mSpring
            if (r0 != 0) goto L14
            androidx.dynamicanimation.animation.SpringForce r0 = new androidx.dynamicanimation.animation.SpringForce
            r0.<init>(r2)
            r1.mSpring = r0
        L14:
            androidx.dynamicanimation.animation.SpringForce r0 = r1.mSpring
            r0.setFinalPosition(r2)
            r1.start()
        L1c:
            return
    }

    public boolean canSkipToEnd() {
            r4 = this;
            androidx.dynamicanimation.animation.SpringForce r0 = r4.mSpring
            double r0 = r0.mDampingRatio
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    float getAcceleration(float r2, float r3) {
            r1 = this;
            androidx.dynamicanimation.animation.SpringForce r0 = r1.mSpring
            float r2 = r0.getAcceleration(r2, r3)
            return r2
    }

    public androidx.dynamicanimation.animation.SpringForce getSpring() {
            r1 = this;
            androidx.dynamicanimation.animation.SpringForce r0 = r1.mSpring
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean isAtEquilibrium(float r2, float r3) {
            r1 = this;
            androidx.dynamicanimation.animation.SpringForce r0 = r1.mSpring
            boolean r2 = r0.isAtEquilibrium(r2, r3)
            return r2
    }

    public androidx.dynamicanimation.animation.SpringAnimation setSpring(androidx.dynamicanimation.animation.SpringForce r1) {
            r0 = this;
            r0.mSpring = r1
            return r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void setValueThreshold(float r1) {
            r0 = this;
            return
    }

    public void skipToEnd() {
            r2 = this;
            boolean r0 = r2.canSkipToEnd()
            if (r0 == 0) goto L20
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L18
            boolean r0 = r2.mRunning
            if (r0 == 0) goto L17
            r0 = 1
            r2.mEndRequested = r0
        L17:
            return
        L18:
            android.util.AndroidRuntimeException r0 = new android.util.AndroidRuntimeException
            java.lang.String r1 = "Animations may only be started on the main thread"
            r0.<init>(r1)
            throw r0
        L20:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Spring animations can only come to an end when there is damping"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void start() {
            r3 = this;
            r3.sanityCheck()
            androidx.dynamicanimation.animation.SpringForce r0 = r3.mSpring
            float r1 = r3.getValueThreshold()
            double r1 = (double) r1
            r0.setValueThreshold(r1)
            super.start()
            return
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean updateValueAndVelocity(long r21) {
            r20 = this;
            r0 = r20
            boolean r1 = r0.mEndRequested
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
            if (r1 == 0) goto L26
            float r1 = r0.mPendingPosition
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 == 0) goto L19
            androidx.dynamicanimation.animation.SpringForce r6 = r0.mSpring
            r6.setFinalPosition(r1)
            r0.mPendingPosition = r5
        L19:
            androidx.dynamicanimation.animation.SpringForce r1 = r0.mSpring
            float r1 = r1.getFinalPosition()
            r0.mValue = r1
            r0.mVelocity = r4
            r0.mEndRequested = r3
            return r2
        L26:
            float r1 = r0.mPendingPosition
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 == 0) goto L63
            androidx.dynamicanimation.animation.SpringForce r1 = r0.mSpring
            r1.getFinalPosition()
            androidx.dynamicanimation.animation.SpringForce r6 = r0.mSpring
            float r1 = r0.mValue
            double r7 = (double) r1
            float r1 = r0.mVelocity
            double r9 = (double) r1
            r11 = 2
            long r18 = r21 / r11
            r11 = r18
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r6.updateValues(r7, r9, r11)
            androidx.dynamicanimation.animation.SpringForce r6 = r0.mSpring
            float r7 = r0.mPendingPosition
            r6.setFinalPosition(r7)
            r0.mPendingPosition = r5
            androidx.dynamicanimation.animation.SpringForce r13 = r0.mSpring
            float r5 = r1.mValue
            double r14 = (double) r5
            float r1 = r1.mVelocity
            double r5 = (double) r1
            r16 = r5
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r13.updateValues(r14, r16, r18)
            float r5 = r1.mValue
            r0.mValue = r5
            float r1 = r1.mVelocity
            r0.mVelocity = r1
            goto L7b
        L63:
            androidx.dynamicanimation.animation.SpringForce r13 = r0.mSpring
            float r1 = r0.mValue
            double r14 = (double) r1
            float r1 = r0.mVelocity
            double r5 = (double) r1
            r16 = r5
            r18 = r21
            androidx.dynamicanimation.animation.DynamicAnimation$MassState r1 = r13.updateValues(r14, r16, r18)
            float r5 = r1.mValue
            r0.mValue = r5
            float r1 = r1.mVelocity
            r0.mVelocity = r1
        L7b:
            float r1 = r0.mValue
            float r5 = r0.mMinValue
            float r1 = java.lang.Math.max(r1, r5)
            r0.mValue = r1
            float r1 = r0.mValue
            float r5 = r0.mMaxValue
            float r1 = java.lang.Math.min(r1, r5)
            r0.mValue = r1
            float r1 = r0.mValue
            float r5 = r0.mVelocity
            boolean r1 = r0.isAtEquilibrium(r1, r5)
            if (r1 == 0) goto La4
            androidx.dynamicanimation.animation.SpringForce r1 = r0.mSpring
            float r1 = r1.getFinalPosition()
            r0.mValue = r1
            r0.mVelocity = r4
            return r2
        La4:
            return r3
    }
}
