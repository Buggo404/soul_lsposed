package androidx.constraintlayout.motion.utils;

/* loaded from: classes.dex */
public class ViewState {
    public int bottom;
    public int left;
    public int right;
    public float rotation;
    public int top;

    public ViewState() {
            r0 = this;
            r0.<init>()
            return
    }

    public void getState(android.view.View r2) {
            r1 = this;
            int r0 = r2.getLeft()
            r1.left = r0
            int r0 = r2.getTop()
            r1.top = r0
            int r0 = r2.getRight()
            r1.right = r0
            int r0 = r2.getBottom()
            r1.bottom = r0
            float r2 = r2.getRotation()
            r1.rotation = r2
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
