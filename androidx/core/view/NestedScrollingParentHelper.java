package androidx.core.view;

/* loaded from: classes.dex */
public class NestedScrollingParentHelper {
    private int mNestedScrollAxesNonTouch;
    private int mNestedScrollAxesTouch;

    public NestedScrollingParentHelper(android.view.ViewGroup r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public int getNestedScrollAxes() {
            r2 = this;
            int r0 = r2.mNestedScrollAxesTouch
            int r1 = r2.mNestedScrollAxesNonTouch
            r0 = r0 | r1
            return r0
    }

    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    public void onNestedScrollAccepted(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = 1
            if (r4 != r1) goto L6
            r0.mNestedScrollAxesNonTouch = r3
            goto L8
        L6:
            r0.mNestedScrollAxesTouch = r3
        L8:
            return
    }

    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    public void onStopNestedScroll(android.view.View r2, int r3) {
            r1 = this;
            r2 = 1
            r0 = 0
            if (r3 != r2) goto L7
            r1.mNestedScrollAxesNonTouch = r0
            goto L9
        L7:
            r1.mNestedScrollAxesTouch = r0
        L9:
            return
    }
}
