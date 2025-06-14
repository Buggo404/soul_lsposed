package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public interface StopEngine {
    java.lang.String debug(java.lang.String r1, float r2);

    float getInterpolation(float r1);

    float getVelocity();

    float getVelocity(float r1);

    boolean isStopped();
}
