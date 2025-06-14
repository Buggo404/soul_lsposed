package androidx.core.view.animation;

/* loaded from: classes.dex */
public final class PathInterpolatorCompat {
    private PathInterpolatorCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.view.animation.Interpolator create(float r1, float r2) {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r1, r2)
            return r0
    }

    public static android.view.animation.Interpolator create(float r1, float r2, float r3, float r4) {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static android.view.animation.Interpolator create(android.graphics.Path r1) {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r0.<init>(r1)
            return r0
    }
}
