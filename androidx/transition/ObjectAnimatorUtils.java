package androidx.transition;

/* loaded from: classes.dex */
class ObjectAnimatorUtils {
    private ObjectAnimatorUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> android.animation.ObjectAnimator ofPointF(T r1, android.util.Property<T, android.graphics.PointF> r2, android.graphics.Path r3) {
            r0 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r1, r2, r0, r3)
            return r1
    }
}
