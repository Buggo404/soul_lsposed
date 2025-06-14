package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class LinearSmoothScroller extends androidx.recyclerview.widget.RecyclerView.SmoothScroller {
    private static final boolean DEBUG = false;
    private static final float MILLISECONDS_PER_INCH = 25.0f;
    public static final int SNAP_TO_ANY = 0;
    public static final int SNAP_TO_END = 1;
    public static final int SNAP_TO_START = -1;
    private static final float TARGET_SEEK_EXTRA_SCROLL_RATIO = 1.2f;
    private static final int TARGET_SEEK_SCROLL_DISTANCE_PX = 10000;
    protected final android.view.animation.DecelerateInterpolator mDecelerateInterpolator;
    private final android.util.DisplayMetrics mDisplayMetrics;
    private boolean mHasCalculatedMillisPerPixel;
    protected int mInterimTargetDx;
    protected int mInterimTargetDy;
    protected final android.view.animation.LinearInterpolator mLinearInterpolator;
    private float mMillisPerPixel;
    protected android.graphics.PointF mTargetVector;

    public LinearSmoothScroller(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r1.mLinearInterpolator = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r0.<init>()
            r1.mDecelerateInterpolator = r0
            r0 = 0
            r1.mHasCalculatedMillisPerPixel = r0
            r1.mInterimTargetDx = r0
            r1.mInterimTargetDy = r0
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            r1.mDisplayMetrics = r2
            return
    }

    private int clampApplyScroll(int r1, int r2) {
            r0 = this;
            int r2 = r1 - r2
            int r1 = r1 * r2
            if (r1 > 0) goto L7
            r1 = 0
            return r1
        L7:
            return r2
    }

    private float getSpeedPerPixel() {
            r1 = this;
            boolean r0 = r1.mHasCalculatedMillisPerPixel
            if (r0 != 0) goto Lf
            android.util.DisplayMetrics r0 = r1.mDisplayMetrics
            float r0 = r1.calculateSpeedPerPixel(r0)
            r1.mMillisPerPixel = r0
            r0 = 1
            r1.mHasCalculatedMillisPerPixel = r0
        Lf:
            float r0 = r1.mMillisPerPixel
            return r0
    }

    public int calculateDtToFit(int r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = -1
            if (r6 == r0) goto L1c
            if (r6 == 0) goto L12
            r2 = 1
            if (r6 != r2) goto La
            int r5 = r5 - r3
            return r5
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            r2.<init>(r3)
            throw r2
        L12:
            int r4 = r4 - r2
            if (r4 <= 0) goto L16
            return r4
        L16:
            int r5 = r5 - r3
            if (r5 >= 0) goto L1a
            return r5
        L1a:
            r2 = 0
            return r2
        L1c:
            int r4 = r4 - r2
            return r4
    }

    public int calculateDxToMakeVisible(android.view.View r11, int r12) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r10.getLayoutManager()
            if (r0 == 0) goto L38
            boolean r1 = r0.canScrollHorizontally()
            if (r1 != 0) goto Ld
            goto L38
        Ld:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r0.getDecoratedLeft(r11)
            int r3 = r1.leftMargin
            int r5 = r2 - r3
            int r11 = r0.getDecoratedRight(r11)
            int r1 = r1.rightMargin
            int r6 = r11 + r1
            int r7 = r0.getPaddingLeft()
            int r11 = r0.getWidth()
            int r0 = r0.getPaddingRight()
            int r8 = r11 - r0
            r4 = r10
            r9 = r12
            int r11 = r4.calculateDtToFit(r5, r6, r7, r8, r9)
            return r11
        L38:
            r11 = 0
            return r11
    }

    public int calculateDyToMakeVisible(android.view.View r11, int r12) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r10.getLayoutManager()
            if (r0 == 0) goto L38
            boolean r1 = r0.canScrollVertically()
            if (r1 != 0) goto Ld
            goto L38
        Ld:
            android.view.ViewGroup$LayoutParams r1 = r11.getLayoutParams()
            androidx.recyclerview.widget.RecyclerView$LayoutParams r1 = (androidx.recyclerview.widget.RecyclerView.LayoutParams) r1
            int r2 = r0.getDecoratedTop(r11)
            int r3 = r1.topMargin
            int r5 = r2 - r3
            int r11 = r0.getDecoratedBottom(r11)
            int r1 = r1.bottomMargin
            int r6 = r11 + r1
            int r7 = r0.getPaddingTop()
            int r11 = r0.getHeight()
            int r0 = r0.getPaddingBottom()
            int r8 = r11 - r0
            r4 = r10
            r9 = r12
            int r11 = r4.calculateDtToFit(r5, r6, r7, r8, r9)
            return r11
        L38:
            r11 = 0
            return r11
    }

    protected float calculateSpeedPerPixel(android.util.DisplayMetrics r2) {
            r1 = this;
            int r2 = r2.densityDpi
            float r2 = (float) r2
            r0 = 1103626240(0x41c80000, float:25.0)
            float r0 = r0 / r2
            return r0
    }

    protected int calculateTimeForDeceleration(int r5) {
            r4 = this;
            int r5 = r4.calculateTimeForScrolling(r5)
            double r0 = (double) r5
            r2 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r0 = r0 / r2
            double r0 = java.lang.Math.ceil(r0)
            int r5 = (int) r0
            return r5
    }

    protected int calculateTimeForScrolling(int r3) {
            r2 = this;
            int r3 = java.lang.Math.abs(r3)
            float r3 = (float) r3
            float r0 = r2.getSpeedPerPixel()
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.ceil(r0)
            int r3 = (int) r0
            return r3
    }

    protected int getHorizontalSnapPreference() {
            r2 = this;
            android.graphics.PointF r0 = r2.mTargetVector
            if (r0 == 0) goto L18
            float r0 = r0.x
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L18
        Lc:
            android.graphics.PointF r0 = r2.mTargetVector
            float r0 = r0.x
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L16
            r0 = 1
            goto L19
        L16:
            r0 = -1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    protected int getVerticalSnapPreference() {
            r2 = this;
            android.graphics.PointF r0 = r2.mTargetVector
            if (r0 == 0) goto L18
            float r0 = r0.y
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto Lc
            goto L18
        Lc:
            android.graphics.PointF r0 = r2.mTargetVector
            float r0 = r0.y
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L16
            r0 = 1
            goto L19
        L16:
            r0 = -1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void onSeekTargetStep(int r1, int r2, androidx.recyclerview.widget.RecyclerView.State r3, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r4) {
            r0 = this;
            int r3 = r0.getChildCount()
            if (r3 != 0) goto La
            r0.stop()
            return
        La:
            int r3 = r0.mInterimTargetDx
            int r1 = r0.clampApplyScroll(r3, r1)
            r0.mInterimTargetDx = r1
            int r1 = r0.mInterimTargetDy
            int r1 = r0.clampApplyScroll(r1, r2)
            r0.mInterimTargetDy = r1
            int r2 = r0.mInterimTargetDx
            if (r2 != 0) goto L23
            if (r1 != 0) goto L23
            r0.updateActionForInterimTarget(r4)
        L23:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void onStart() {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void onStop() {
            r1 = this;
            r0 = 0
            r1.mInterimTargetDy = r0
            r1.mInterimTargetDx = r0
            r0 = 0
            r1.mTargetVector = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    protected void onTargetFound(android.view.View r3, androidx.recyclerview.widget.RecyclerView.State r4, androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r5) {
            r2 = this;
            int r4 = r2.getHorizontalSnapPreference()
            int r4 = r2.calculateDxToMakeVisible(r3, r4)
            int r0 = r2.getVerticalSnapPreference()
            int r3 = r2.calculateDyToMakeVisible(r3, r0)
            int r0 = r4 * r4
            int r1 = r3 * r3
            int r0 = r0 + r1
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            int r0 = (int) r0
            int r0 = r2.calculateTimeForDeceleration(r0)
            if (r0 <= 0) goto L28
            int r4 = -r4
            int r3 = -r3
            android.view.animation.DecelerateInterpolator r1 = r2.mDecelerateInterpolator
            r5.update(r4, r3, r0, r1)
        L28:
            return
    }

    protected void updateActionForInterimTarget(androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action r5) {
            r4 = this;
            int r0 = r4.getTargetPosition()
            android.graphics.PointF r0 = r4.computeScrollVectorForPosition(r0)
            if (r0 == 0) goto L48
            float r1 = r0.x
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            float r1 = r0.y
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L18
            goto L48
        L18:
            r4.normalize(r0)
            r4.mTargetVector = r0
            float r1 = r0.x
            r2 = 1176256512(0x461c4000, float:10000.0)
            float r1 = r1 * r2
            int r1 = (int) r1
            r4.mInterimTargetDx = r1
            float r0 = r0.y
            float r0 = r0 * r2
            int r0 = (int) r0
            r4.mInterimTargetDy = r0
            r0 = 10000(0x2710, float:1.4013E-41)
            int r0 = r4.calculateTimeForScrolling(r0)
            int r1 = r4.mInterimTargetDx
            float r1 = (float) r1
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r1 = r1 * r2
            int r1 = (int) r1
            int r3 = r4.mInterimTargetDy
            float r3 = (float) r3
            float r3 = r3 * r2
            int r3 = (int) r3
            float r0 = (float) r0
            float r0 = r0 * r2
            int r0 = (int) r0
            android.view.animation.LinearInterpolator r2 = r4.mLinearInterpolator
            r5.update(r1, r3, r0, r2)
            return
        L48:
            int r0 = r4.getTargetPosition()
            r5.jumpTo(r0)
            r4.stop()
            return
    }
}
