package androidx.constraintlayout.core.motion.utils;

/* loaded from: classes.dex */
public class Rect {
    public int bottom;
    public int left;
    public int right;
    public int top;

    public Rect() {
            r0 = this;
            r0.<init>()
            return
    }

    public int height() {
            r2 = this;
            int r0 = r2.bottom
            int r1 = r2.top
            int r0 = r0 - r1
            return r0
    }

    public int width() {
            r2 = this;
            int r0 = r2.right
            int r1 = r2.left
            int r0 = r0 - r1
            return r0
    }
}
