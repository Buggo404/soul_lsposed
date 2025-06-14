package androidx.core.widget;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class ScrollerCompat {
    android.widget.OverScroller mScroller;

    ScrollerCompat(android.content.Context r2, android.view.animation.Interpolator r3) {
            r1 = this;
            r1.<init>()
            if (r3 == 0) goto Lb
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r2, r3)
            goto L10
        Lb:
            android.widget.OverScroller r0 = new android.widget.OverScroller
            r0.<init>(r2)
        L10:
            r1.mScroller = r0
            return
    }

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context r1) {
            r0 = 0
            androidx.core.widget.ScrollerCompat r1 = create(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static androidx.core.widget.ScrollerCompat create(android.content.Context r1, android.view.animation.Interpolator r2) {
            androidx.core.widget.ScrollerCompat r0 = new androidx.core.widget.ScrollerCompat
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public void abortAnimation() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.abortAnimation()
            return
    }

    @java.lang.Deprecated
    public boolean computeScrollOffset() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            boolean r0 = r0.computeScrollOffset()
            return r0
    }

    @java.lang.Deprecated
    public void fling(int r11, int r12, int r13, int r14, int r15, int r16, int r17, int r18) {
            r10 = this;
            r0 = r10
            android.widget.OverScroller r1 = r0.mScroller
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @java.lang.Deprecated
    public void fling(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22) {
            r12 = this;
            r0 = r12
            android.widget.OverScroller r1 = r0.mScroller
            r2 = r13
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r11 = r22
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
    }

    @java.lang.Deprecated
    public float getCurrVelocity() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            float r0 = r0.getCurrVelocity()
            return r0
    }

    @java.lang.Deprecated
    public int getCurrX() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            int r0 = r0.getCurrX()
            return r0
    }

    @java.lang.Deprecated
    public int getCurrY() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            int r0 = r0.getCurrY()
            return r0
    }

    @java.lang.Deprecated
    public int getFinalX() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            int r0 = r0.getFinalX()
            return r0
    }

    @java.lang.Deprecated
    public int getFinalY() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            int r0 = r0.getFinalY()
            return r0
    }

    @java.lang.Deprecated
    public boolean isFinished() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            boolean r0 = r0.isFinished()
            return r0
    }

    @java.lang.Deprecated
    public boolean isOverScrolled() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            boolean r0 = r0.isOverScrolled()
            return r0
    }

    @java.lang.Deprecated
    public void notifyHorizontalEdgeReached(int r2, int r3, int r4) {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.notifyHorizontalEdgeReached(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public void notifyVerticalEdgeReached(int r2, int r3, int r4) {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.notifyVerticalEdgeReached(r2, r3, r4)
            return
    }

    @java.lang.Deprecated
    public boolean springBack(int r8, int r9, int r10, int r11, int r12, int r13) {
            r7 = this;
            android.widget.OverScroller r0 = r7.mScroller
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.springBack(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @java.lang.Deprecated
    public void startScroll(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.startScroll(r2, r3, r4, r5)
            return
    }

    @java.lang.Deprecated
    public void startScroll(int r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            android.widget.OverScroller r0 = r6.mScroller
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r0.startScroll(r1, r2, r3, r4, r5)
            return
    }
}
