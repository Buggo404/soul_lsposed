package androidx.core.widget;

/* loaded from: classes.dex */
public final class EdgeEffectCompat {
    private android.widget.EdgeEffect mEdgeEffect;

    @java.lang.Deprecated
    public EdgeEffectCompat(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.widget.EdgeEffect r0 = new android.widget.EdgeEffect
            r0.<init>(r2)
            r1.mEdgeEffect = r0
            return
    }

    public static void onPull(android.widget.EdgeEffect r0, float r1, float r2) {
            r0.onPull(r1, r2)
            return
    }

    @java.lang.Deprecated
    public boolean draw(android.graphics.Canvas r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r2 = r0.draw(r2)
            return r2
    }

    @java.lang.Deprecated
    public void finish() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.finish()
            return
    }

    @java.lang.Deprecated
    public boolean isFinished() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    public boolean onAbsorb(int r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onAbsorb(r2)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    public boolean onPull(float r2) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onPull(r2)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    public boolean onPull(float r2, float r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            onPull(r0, r2, r3)
            r2 = 1
            return r2
    }

    @java.lang.Deprecated
    public boolean onRelease() {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    public void setSize(int r2, int r3) {
            r1 = this;
            android.widget.EdgeEffect r0 = r1.mEdgeEffect
            r0.setSize(r2, r3)
            return
    }
}
