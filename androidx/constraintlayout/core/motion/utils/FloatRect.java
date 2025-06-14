package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class FloatRect {
    public float bottom;
    public float left;
    public float right;
    public float top;

    public FloatRect() {
            r0 = this;
            r0.<init>()
            return
    }

    public final float centerX() {
            r2 = this;
            float r0 = r2.left
            float r1 = r2.right
            float r0 = r0 + r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            return r0
    }

    public final float centerY() {
            r2 = this;
            float r0 = r2.top
            float r1 = r2.bottom
            float r0 = r0 + r1
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            return r0
    }
}
