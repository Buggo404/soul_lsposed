package androidx.constraintlayout.motion.utils;

/* loaded from: classes.dex */
public class StopLogic extends androidx.constraintlayout.motion.widget.MotionInterpolator {
    private androidx.constraintlayout.core.motion.utils.StopEngine mEngine;
    private androidx.constraintlayout.core.motion.utils.SpringStopEngine mSpringStopEngine;
    private androidx.constraintlayout.core.motion.utils.StopLogicEngine mStopLogicEngine;

    public StopLogic() {
            r1 = this;
            r1.<init>()
            androidx.constraintlayout.core.motion.utils.StopLogicEngine r0 = new androidx.constraintlayout.core.motion.utils.StopLogicEngine
            r0.<init>()
            r1.mStopLogicEngine = r0
            r1.mEngine = r0
            return
    }

    public void config(float r8, float r9, float r10, float r11, float r12, float r13) {
            r7 = this;
            androidx.constraintlayout.core.motion.utils.StopLogicEngine r0 = r7.mStopLogicEngine
            r7.mEngine = r0
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r0.config(r1, r2, r3, r4, r5, r6)
            return
    }

    public java.lang.String debug(java.lang.String r2, float r3) {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.StopEngine r0 = r1.mEngine
            java.lang.String r2 = r0.debug(r2, r3)
            return r2
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator, android.animation.TimeInterpolator
    public float getInterpolation(float r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.StopEngine r0 = r1.mEngine
            float r2 = r0.getInterpolation(r2)
            return r2
    }

    @Override // androidx.constraintlayout.motion.widget.MotionInterpolator
    public float getVelocity() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.StopEngine r0 = r1.mEngine
            float r0 = r0.getVelocity()
            return r0
    }

    public float getVelocity(float r2) {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.StopEngine r0 = r1.mEngine
            float r2 = r0.getVelocity(r2)
            return r2
    }

    public boolean isStopped() {
            r1 = this;
            androidx.constraintlayout.core.motion.utils.StopEngine r0 = r1.mEngine
            boolean r0 = r0.isStopped()
            return r0
    }

    public void springConfig(float r12, float r13, float r14, float r15, float r16, float r17, float r18, int r19) {
            r11 = this;
            r0 = r11
            androidx.constraintlayout.core.motion.utils.SpringStopEngine r1 = r0.mSpringStopEngine
            if (r1 != 0) goto Lc
            androidx.constraintlayout.core.motion.utils.SpringStopEngine r1 = new androidx.constraintlayout.core.motion.utils.SpringStopEngine
            r1.<init>()
            r0.mSpringStopEngine = r1
        Lc:
            androidx.constraintlayout.core.motion.utils.SpringStopEngine r2 = r0.mSpringStopEngine
            r0.mEngine = r2
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r2.springConfig(r3, r4, r5, r6, r7, r8, r9, r10)
            return
    }
}
