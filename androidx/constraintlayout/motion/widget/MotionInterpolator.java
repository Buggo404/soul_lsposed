package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
public abstract class MotionInterpolator implements android.view.animation.Interpolator {
    public MotionInterpolator() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.animation.TimeInterpolator
    public abstract float getInterpolation(float r1);

    public abstract float getVelocity();
}
