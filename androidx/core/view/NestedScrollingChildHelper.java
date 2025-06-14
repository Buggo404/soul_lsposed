package androidx.core.view;

/* loaded from: classes.dex */
public class NestedScrollingChildHelper {
    private boolean mIsNestedScrollingEnabled;
    private android.view.ViewParent mNestedScrollingParentNonTouch;
    private android.view.ViewParent mNestedScrollingParentTouch;
    private int[] mTempNestedScrollConsumed;
    private final android.view.View mView;

    public NestedScrollingChildHelper(android.view.View r1) {
            r0 = this;
            r0.<init>()
            r0.mView = r1
            return
    }

    private boolean dispatchNestedScrollInternal(int r16, int r17, int r18, int r19, int[] r20, int r21, int[] r22) {
            r15 = this;
            r0 = r15
            r1 = r20
            boolean r2 = r15.isNestedScrollingEnabled()
            r3 = 0
            if (r2 == 0) goto L63
            r2 = r21
            android.view.ViewParent r4 = r15.getNestedScrollingParentForType(r2)
            if (r4 != 0) goto L13
            return r3
        L13:
            r12 = 1
            if (r16 != 0) goto L24
            if (r17 != 0) goto L24
            if (r18 != 0) goto L24
            if (r19 == 0) goto L1d
            goto L24
        L1d:
            if (r1 == 0) goto L63
            r1[r3] = r3
            r1[r12] = r3
            goto L63
        L24:
            if (r1 == 0) goto L32
            android.view.View r5 = r0.mView
            r5.getLocationInWindow(r1)
            r5 = r1[r3]
            r6 = r1[r12]
            r13 = r5
            r14 = r6
            goto L34
        L32:
            r13 = r3
            r14 = r13
        L34:
            if (r22 != 0) goto L40
            int[] r5 = r15.getTempNestedScrollConsumed()
            r5[r3] = r3
            r5[r12] = r3
            r11 = r5
            goto L42
        L40:
            r11 = r22
        L42:
            android.view.View r5 = r0.mView
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r21
            androidx.core.view.ViewParentCompat.onNestedScroll(r4, r5, r6, r7, r8, r9, r10, r11)
            if (r1 == 0) goto L62
            android.view.View r2 = r0.mView
            r2.getLocationInWindow(r1)
            r2 = r1[r3]
            int r2 = r2 - r13
            r1[r3] = r2
            r2 = r1[r12]
            int r2 = r2 - r14
            r1[r12] = r2
        L62:
            return r12
        L63:
            return r3
    }

    private android.view.ViewParent getNestedScrollingParentForType(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r2 = 0
            return r2
        L7:
            android.view.ViewParent r2 = r1.mNestedScrollingParentNonTouch
            return r2
        La:
            android.view.ViewParent r2 = r1.mNestedScrollingParentTouch
            return r2
    }

    private int[] getTempNestedScrollConsumed() {
            r1 = this;
            int[] r0 = r1.mTempNestedScrollConsumed
            if (r0 != 0) goto L9
            r0 = 2
            int[] r0 = new int[r0]
            r1.mTempNestedScrollConsumed = r0
        L9:
            int[] r0 = r1.mTempNestedScrollConsumed
            return r0
    }

    private void setNestedScrollingParentForType(int r2, android.view.ViewParent r3) {
            r1 = this;
            if (r2 == 0) goto L9
            r0 = 1
            if (r2 == r0) goto L6
            goto Lb
        L6:
            r1.mNestedScrollingParentNonTouch = r3
            goto Lb
        L9:
            r1.mNestedScrollingParentTouch = r3
        Lb:
            return
    }

    public boolean dispatchNestedFling(float r3, float r4, boolean r5) {
            r2 = this;
            boolean r0 = r2.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.mView
            boolean r3 = androidx.core.view.ViewParentCompat.onNestedFling(r0, r1, r3, r4, r5)
            return r3
        L14:
            return r1
    }

    public boolean dispatchNestedPreFling(float r3, float r4) {
            r2 = this;
            boolean r0 = r2.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L14
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r1)
            if (r0 == 0) goto L14
            android.view.View r1 = r2.mView
            boolean r3 = androidx.core.view.ViewParentCompat.onNestedPreFling(r0, r1, r3, r4)
            return r3
        L14:
            return r1
    }

    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    public boolean dispatchNestedPreScroll(int r11, int r12, int[] r13, int[] r14, int r15) {
            r10 = this;
            boolean r0 = r10.isNestedScrollingEnabled()
            r1 = 0
            if (r0 == 0) goto L58
            android.view.ViewParent r2 = r10.getNestedScrollingParentForType(r15)
            if (r2 != 0) goto Le
            return r1
        Le:
            r0 = 1
            if (r11 != 0) goto L1b
            if (r12 == 0) goto L14
            goto L1b
        L14:
            if (r14 == 0) goto L58
            r14[r1] = r1
            r14[r0] = r1
            goto L58
        L1b:
            if (r14 == 0) goto L29
            android.view.View r3 = r10.mView
            r3.getLocationInWindow(r14)
            r3 = r14[r1]
            r4 = r14[r0]
            r8 = r3
            r9 = r4
            goto L2b
        L29:
            r8 = r1
            r9 = r8
        L2b:
            if (r13 != 0) goto L31
            int[] r13 = r10.getTempNestedScrollConsumed()
        L31:
            r13[r1] = r1
            r13[r0] = r1
            android.view.View r3 = r10.mView
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r15
            androidx.core.view.ViewParentCompat.onNestedPreScroll(r2, r3, r4, r5, r6, r7)
            if (r14 == 0) goto L4f
            android.view.View r11 = r10.mView
            r11.getLocationInWindow(r14)
            r11 = r14[r1]
            int r11 = r11 - r8
            r14[r1] = r11
            r11 = r14[r0]
            int r11 = r11 - r9
            r14[r0] = r11
        L4f:
            r11 = r13[r1]
            if (r11 != 0) goto L57
            r11 = r13[r0]
            if (r11 == 0) goto L58
        L57:
            r1 = r0
        L58:
            return r1
    }

    public void dispatchNestedScroll(int r1, int r2, int r3, int r4, int[] r5, int r6, int[] r7) {
            r0 = this;
            r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13) {
            r8 = this;
            r6 = 0
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            boolean r9 = r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public boolean dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14) {
            r8 = this;
            r7 = 0
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            boolean r9 = r0.dispatchNestedScrollInternal(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    public boolean hasNestedScrollingParent(int r1) {
            r0 = this;
            android.view.ViewParent r1 = r0.getNestedScrollingParentForType(r1)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isNestedScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mIsNestedScrollingEnabled
            return r0
    }

    public void onDetachedFromWindow() {
            r1 = this;
            android.view.View r0 = r1.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r0)
            return
    }

    public void onStopNestedScroll(android.view.View r1) {
            r0 = this;
            android.view.View r1 = r0.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r1)
            return
    }

    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIsNestedScrollingEnabled
            if (r0 == 0) goto L9
            android.view.View r0 = r1.mView
            androidx.core.view.ViewCompat.stopNestedScroll(r0)
        L9:
            r1.mIsNestedScrollingEnabled = r2
            return
    }

    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startNestedScroll(r2, r0)
            return r2
    }

    public boolean startNestedScroll(int r5, int r6) {
            r4 = this;
            boolean r0 = r4.hasNestedScrollingParent(r6)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r4.isNestedScrollingEnabled()
            if (r0 == 0) goto L35
            android.view.View r0 = r4.mView
            android.view.ViewParent r0 = r0.getParent()
            android.view.View r2 = r4.mView
        L16:
            if (r0 == 0) goto L35
            android.view.View r3 = r4.mView
            boolean r3 = androidx.core.view.ViewParentCompat.onStartNestedScroll(r0, r2, r3, r5, r6)
            if (r3 == 0) goto L29
            r4.setNestedScrollingParentForType(r6, r0)
            android.view.View r3 = r4.mView
            androidx.core.view.ViewParentCompat.onNestedScrollAccepted(r0, r2, r3, r5, r6)
            return r1
        L29:
            boolean r3 = r0 instanceof android.view.View
            if (r3 == 0) goto L30
            r2 = r0
            android.view.View r2 = (android.view.View) r2
        L30:
            android.view.ViewParent r0 = r0.getParent()
            goto L16
        L35:
            r5 = 0
            return r5
    }

    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    public void stopNestedScroll(int r3) {
            r2 = this;
            android.view.ViewParent r0 = r2.getNestedScrollingParentForType(r3)
            if (r0 == 0) goto Lf
            android.view.View r1 = r2.mView
            androidx.core.view.ViewParentCompat.onStopNestedScroll(r0, r1, r3)
            r0 = 0
            r2.setNestedScrollingParentForType(r3, r0)
        Lf:
            return
    }
}
