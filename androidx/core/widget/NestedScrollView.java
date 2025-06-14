package androidx.core.widget;

/* loaded from: classes.dex */
public class NestedScrollView extends android.widget.FrameLayout implements androidx.core.view.NestedScrollingParent3, androidx.core.view.NestedScrollingChild3, androidx.core.view.ScrollingView {
    private static final androidx.core.widget.NestedScrollView.AccessibilityDelegate ACCESSIBILITY_DELEGATE = null;
    static final int ANIMATED_SCROLL_GAP = 250;
    private static final int DEFAULT_SMOOTH_SCROLL_DURATION = 250;
    private static final int INVALID_POINTER = -1;
    static final float MAX_SCROLL_FACTOR = 0.5f;
    private static final int[] SCROLLVIEW_STYLEABLE = null;
    private static final java.lang.String TAG = "NestedScrollView";
    private int mActivePointerId;
    private final androidx.core.view.NestedScrollingChildHelper mChildHelper;
    private android.view.View mChildToScrollTo;
    private android.widget.EdgeEffect mEdgeGlowBottom;
    private android.widget.EdgeEffect mEdgeGlowTop;
    private boolean mFillViewport;
    private boolean mIsBeingDragged;
    private boolean mIsLaidOut;
    private boolean mIsLayoutDirty;
    private int mLastMotionY;
    private long mLastScroll;
    private int mLastScrollerY;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private int mNestedYOffset;
    private androidx.core.widget.NestedScrollView.OnScrollChangeListener mOnScrollChangeListener;
    private final androidx.core.view.NestedScrollingParentHelper mParentHelper;
    private androidx.core.widget.NestedScrollView.SavedState mSavedState;
    private final int[] mScrollConsumed;
    private final int[] mScrollOffset;
    private android.widget.OverScroller mScroller;
    private boolean mSmoothScrollingEnabled;
    private final android.graphics.Rect mTempRect;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;
    private float mVerticalScrollFactor;

    static class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        AccessibilityDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2, r3)
                androidx.core.widget.NestedScrollView r2 = (androidx.core.widget.NestedScrollView) r2
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r3.setClassName(r0)
                int r0 = r2.getScrollRange()
                if (r0 <= 0) goto L16
                r0 = 1
                goto L17
            L16:
                r0 = 0
            L17:
                r3.setScrollable(r0)
                int r0 = r2.getScrollX()
                r3.setScrollX(r0)
                int r0 = r2.getScrollY()
                r3.setScrollY(r0)
                int r0 = r2.getScrollX()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollX(r3, r0)
                int r2 = r2.getScrollRange()
                androidx.core.view.accessibility.AccessibilityRecordCompat.setMaxScrollY(r3, r2)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4) {
                r2 = this;
                super.onInitializeAccessibilityNodeInfo(r3, r4)
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                java.lang.Class<android.widget.ScrollView> r0 = android.widget.ScrollView.class
                java.lang.String r0 = r0.getName()
                r4.setClassName(r0)
                boolean r0 = r3.isEnabled()
                if (r0 == 0) goto L3e
                int r0 = r3.getScrollRange()
                if (r0 <= 0) goto L3e
                r1 = 1
                r4.setScrollable(r1)
                int r1 = r3.getScrollY()
                if (r1 <= 0) goto L2e
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r4.addAction(r1)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP
                r4.addAction(r1)
            L2e:
                int r3 = r3.getScrollY()
                if (r3 >= r0) goto L3e
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r4.addAction(r3)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r3 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN
                r4.addAction(r3)
            L3e:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r3, int r4, android.os.Bundle r5) {
                r2 = this;
                boolean r5 = super.performAccessibilityAction(r3, r4, r5)
                r0 = 1
                if (r5 == 0) goto L8
                return r0
            L8:
                androidx.core.widget.NestedScrollView r3 = (androidx.core.widget.NestedScrollView) r3
                boolean r5 = r3.isEnabled()
                r1 = 0
                if (r5 != 0) goto L12
                return r1
            L12:
                r5 = 4096(0x1000, float:5.74E-42)
                if (r4 == r5) goto L47
                r5 = 8192(0x2000, float:1.14794E-41)
                if (r4 == r5) goto L25
                r5 = 16908344(0x1020038, float:2.3877386E-38)
                if (r4 == r5) goto L25
                r5 = 16908346(0x102003a, float:2.3877392E-38)
                if (r4 == r5) goto L47
                return r1
            L25:
                int r4 = r3.getHeight()
                int r5 = r3.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r3.getPaddingTop()
                int r4 = r4 - r5
                int r5 = r3.getScrollY()
                int r5 = r5 - r4
                int r4 = java.lang.Math.max(r5, r1)
                int r5 = r3.getScrollY()
                if (r4 == r5) goto L46
                r3.smoothScrollTo(r1, r4, r0)
                return r0
            L46:
                return r1
            L47:
                int r4 = r3.getHeight()
                int r5 = r3.getPaddingBottom()
                int r4 = r4 - r5
                int r5 = r3.getPaddingTop()
                int r4 = r4 - r5
                int r5 = r3.getScrollY()
                int r5 = r5 + r4
                int r4 = r3.getScrollRange()
                int r4 = java.lang.Math.min(r5, r4)
                int r5 = r3.getScrollY()
                if (r4 == r5) goto L6c
                r3.smoothScrollTo(r1, r4, r0)
                return r0
            L6c:
                return r1
        }
    }

    public interface OnScrollChangeListener {
        void onScrollChange(androidx.core.widget.NestedScrollView r1, int r2, int r3, int r4, int r5);
    }

    static class SavedState extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<androidx.core.widget.NestedScrollView.SavedState> CREATOR = null;
        public int scrollPosition;


        static {
                androidx.core.widget.NestedScrollView$SavedState$1 r0 = new androidx.core.widget.NestedScrollView$SavedState$1
                r0.<init>()
                androidx.core.widget.NestedScrollView.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r1.readInt()
                r0.scrollPosition = r1
                return
        }

        SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "HorizontalScrollView.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " scrollPosition="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.scrollPosition
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.scrollPosition
                r1.writeInt(r2)
                return
        }
    }

    static {
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r0 = new androidx.core.widget.NestedScrollView$AccessibilityDelegate
            r0.<init>()
            androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE = r0
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16843130(0x101017a, float:2.3694617E-38)
            r0[r1] = r2
            androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE = r0
            return
    }

    public NestedScrollView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NestedScrollView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NestedScrollView(android.content.Context r5, android.util.AttributeSet r6, int r7) {
            r4 = this;
            r4.<init>(r5, r6, r7)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r4.mTempRect = r0
            r0 = 1
            r4.mIsLayoutDirty = r0
            r1 = 0
            r4.mIsLaidOut = r1
            r2 = 0
            r4.mChildToScrollTo = r2
            r4.mIsBeingDragged = r1
            r4.mSmoothScrollingEnabled = r0
            r2 = -1
            r4.mActivePointerId = r2
            r2 = 2
            int[] r3 = new int[r2]
            r4.mScrollOffset = r3
            int[] r2 = new int[r2]
            r4.mScrollConsumed = r2
            r4.initScrollView()
            int[] r2 = androidx.core.widget.NestedScrollView.SCROLLVIEW_STYLEABLE
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r2, r7, r1)
            boolean r6 = r5.getBoolean(r1, r1)
            r4.setFillViewport(r6)
            r5.recycle()
            androidx.core.view.NestedScrollingParentHelper r5 = new androidx.core.view.NestedScrollingParentHelper
            r5.<init>(r4)
            r4.mParentHelper = r5
            androidx.core.view.NestedScrollingChildHelper r5 = new androidx.core.view.NestedScrollingChildHelper
            r5.<init>(r4)
            r4.mChildHelper = r5
            r4.setNestedScrollingEnabled(r0)
            androidx.core.widget.NestedScrollView$AccessibilityDelegate r5 = androidx.core.widget.NestedScrollView.ACCESSIBILITY_DELEGATE
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r4, r5)
            return
    }

    private void abortAnimatedScroll() {
            r1 = this;
            android.widget.OverScroller r0 = r1.mScroller
            r0.abortAnimation()
            r0 = 1
            r1.stopNestedScroll(r0)
            return
    }

    private boolean canScroll() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2c
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            if (r0 <= r2) goto L2c
            r1 = 1
        L2c:
            return r1
    }

    private static int clamp(int r1, int r2, int r3) {
            if (r2 >= r3) goto Lc
            if (r1 >= 0) goto L5
            goto Lc
        L5:
            int r0 = r2 + r1
            if (r0 <= r3) goto Lb
            int r3 = r3 - r2
            return r3
        Lb:
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private void doScrollY(int r3) {
            r2 = this;
            if (r3 == 0) goto Le
            boolean r0 = r2.mSmoothScrollingEnabled
            r1 = 0
            if (r0 == 0) goto Lb
            r2.smoothScrollBy(r1, r3)
            goto Le
        Lb:
            r2.scrollBy(r1, r3)
        Le:
            return
    }

    private void endDrag() {
            r1 = this;
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.recycleVelocityTracker()
            r1.stopNestedScroll(r0)
            android.widget.EdgeEffect r0 = r1.mEdgeGlowTop
            if (r0 == 0) goto L15
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mEdgeGlowBottom
            r0.onRelease()
        L15:
            return
    }

    private void ensureGlows() {
            r2 = this;
            int r0 = r2.getOverScrollMode()
            r1 = 2
            if (r0 == r1) goto L1e
            android.widget.EdgeEffect r0 = r2.mEdgeGlowTop
            if (r0 != 0) goto L23
            android.content.Context r0 = r2.getContext()
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.mEdgeGlowTop = r1
            android.widget.EdgeEffect r1 = new android.widget.EdgeEffect
            r1.<init>(r0)
            r2.mEdgeGlowBottom = r1
            goto L23
        L1e:
            r0 = 0
            r2.mEdgeGlowTop = r0
            r2.mEdgeGlowBottom = r0
        L23:
            return
    }

    private android.view.View findFocusableViewInBounds(boolean r13, int r14, int r15) {
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r3
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            r9 = 1
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r3
        L29:
            if (r2 != 0) goto L2e
            r2 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r2.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r2.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r3
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r2 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r2 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r2
    }

    private float getVerticalScrollFactorCompat() {
            r5 = this;
            float r0 = r5.mVerticalScrollFactor
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L35
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r5.getContext()
            android.content.res.Resources$Theme r2 = r1.getTheme()
            r3 = 16842829(0x101004d, float:2.3693774E-38)
            r4 = 1
            boolean r2 = r2.resolveAttribute(r3, r0, r4)
            if (r2 == 0) goto L2d
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r0 = r0.getDimension(r1)
            r5.mVerticalScrollFactor = r0
            goto L35
        L2d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Expected theme to define listPreferredItemHeight."
            r0.<init>(r1)
            throw r0
        L35:
            float r0 = r5.mVerticalScrollFactor
            return r0
    }

    private boolean inChild(int r5, int r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2a
            int r0 = r4.getScrollY()
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r2.getTop()
            int r3 = r3 - r0
            if (r6 < r3) goto L2a
            int r3 = r2.getBottom()
            int r3 = r3 - r0
            if (r6 >= r3) goto L2a
            int r6 = r2.getLeft()
            if (r5 < r6) goto L2a
            int r6 = r2.getRight()
            if (r5 >= r6) goto L2a
            r1 = 1
        L2a:
            return r1
    }

    private void initOrResetVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto Lb
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            goto Le
        Lb:
            r0.clear()
        Le:
            return
    }

    private void initScrollView() {
            r2 = this;
            android.widget.OverScroller r0 = new android.widget.OverScroller
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.mScroller = r0
            r0 = 1
            r2.setFocusable(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r2.setDescendantFocusability(r0)
            r0 = 0
            r2.setWillNotDraw(r0)
            android.content.Context r0 = r2.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r1 = r0.getScaledTouchSlop()
            r2.mTouchSlop = r1
            int r1 = r0.getScaledMinimumFlingVelocity()
            r2.mMinimumVelocity = r1
            int r0 = r0.getScaledMaximumFlingVelocity()
            r2.mMaximumVelocity = r0
            return
    }

    private void initVelocityTrackerIfNotExists() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
        La:
            return
    }

    private boolean isOffScreen(android.view.View r3) {
            r2 = this;
            r0 = 0
            int r1 = r2.getHeight()
            boolean r3 = r2.isWithinDeltaOfScreen(r3, r0, r1)
            r3 = r3 ^ 1
            return r3
    }

    private static boolean isViewDescendantOf(android.view.View r2, android.view.View r3) {
            r0 = 1
            if (r2 != r3) goto L4
            return r0
        L4:
            android.view.ViewParent r2 = r2.getParent()
            boolean r1 = r2 instanceof android.view.ViewGroup
            if (r1 == 0) goto L15
            android.view.View r2 = (android.view.View) r2
            boolean r2 = isViewDescendantOf(r2, r3)
            if (r2 == 0) goto L15
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    private boolean isWithinDeltaOfScreen(android.view.View r2, int r3, int r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.bottom
            int r2 = r2 + r3
            int r0 = r1.getScrollY()
            if (r2 < r0) goto L23
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r2.top
            int r2 = r2 - r3
            int r3 = r1.getScrollY()
            int r3 = r3 + r4
            if (r2 > r3) goto L23
            r2 = 1
            goto L24
        L23:
            r2 = 0
        L24:
            return r2
    }

    private void onNestedScrollInternal(int r11, int r12, int[] r13) {
            r10 = this;
            int r0 = r10.getScrollY()
            r1 = 0
            r10.scrollBy(r1, r11)
            int r1 = r10.getScrollY()
            int r4 = r1 - r0
            if (r13 == 0) goto L16
            r0 = 1
            r1 = r13[r0]
            int r1 = r1 + r4
            r13[r0] = r1
        L16:
            int r6 = r11 - r4
            androidx.core.view.NestedScrollingChildHelper r2 = r10.mChildHelper
            r3 = 0
            r5 = 0
            r7 = 0
            r8 = r12
            r9 = r13
            r2.dispatchNestedScroll(r3, r4, r5, r6, r7, r8, r9)
            return
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L25
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getY(r0)
            int r1 = (int) r1
            r3.mLastMotionY = r1
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
            android.view.VelocityTracker r4 = r3.mVelocityTracker
            if (r4 == 0) goto L25
            r4.clear()
        L25:
            return
    }

    private void recycleVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        La:
            return
    }

    private void runAnimatedScroll(boolean r2) {
            r1 = this;
            r0 = 1
            if (r2 == 0) goto L8
            r2 = 2
            r1.startNestedScroll(r2, r0)
            goto Lb
        L8:
            r1.stopNestedScroll(r0)
        Lb:
            int r2 = r1.getScrollY()
            r1.mLastScrollerY = r2
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r1)
            return
    }

    private boolean scrollAndFocus(int r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getHeight()
            int r1 = r6.getScrollY()
            int r0 = r0 + r1
            r2 = 33
            r3 = 0
            r4 = 1
            if (r7 != r2) goto L11
            r2 = r4
            goto L12
        L11:
            r2 = r3
        L12:
            android.view.View r5 = r6.findFocusableViewInBounds(r2, r8, r9)
            if (r5 != 0) goto L19
            r5 = r6
        L19:
            if (r8 < r1) goto L1e
            if (r9 > r0) goto L1e
            goto L28
        L1e:
            if (r2 == 0) goto L22
            int r8 = r8 - r1
            goto L24
        L22:
            int r8 = r9 - r0
        L24:
            r6.doScrollY(r8)
            r3 = r4
        L28:
            android.view.View r8 = r6.findFocus()
            if (r5 == r8) goto L31
            r5.requestFocus(r7)
        L31:
            return r3
    }

    private void scrollToChild(android.view.View r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mTempRect
            r2.getDrawingRect(r0)
            android.graphics.Rect r0 = r1.mTempRect
            r1.offsetDescendantRectToMyCoords(r2, r0)
            android.graphics.Rect r2 = r1.mTempRect
            int r2 = r1.computeScrollDeltaToGetChildRectOnScreen(r2)
            if (r2 == 0) goto L16
            r0 = 0
            r1.scrollBy(r0, r2)
        L16:
            return
    }

    private boolean scrollToChildRect(android.graphics.Rect r3, boolean r4) {
            r2 = this;
            int r3 = r2.computeScrollDeltaToGetChildRectOnScreen(r3)
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = r0
        La:
            if (r1 == 0) goto L15
            if (r4 == 0) goto L12
            r2.scrollBy(r0, r3)
            goto L15
        L12:
            r2.smoothScrollBy(r0, r3)
        L15:
            return r1
    }

    private void smoothScrollBy(int r9, int r10, int r11, boolean r12) {
            r8 = this;
            int r0 = r8.getChildCount()
            if (r0 != 0) goto L7
            return
        L7:
            long r0 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            long r2 = r8.mLastScroll
            long r0 = r0 - r2
            r2 = 250(0xfa, double:1.235E-321)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L5a
            r9 = 0
            android.view.View r0 = r8.getChildAt(r9)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getHeight()
            int r2 = r1.topMargin
            int r0 = r0 + r2
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r8.getHeight()
            int r2 = r8.getPaddingTop()
            int r1 = r1 - r2
            int r2 = r8.getPaddingBottom()
            int r1 = r1 - r2
            int r4 = r8.getScrollY()
            int r0 = r0 - r1
            int r0 = java.lang.Math.max(r9, r0)
            int r10 = r10 + r4
            int r10 = java.lang.Math.min(r10, r0)
            int r9 = java.lang.Math.max(r9, r10)
            int r6 = r9 - r4
            android.widget.OverScroller r2 = r8.mScroller
            int r3 = r8.getScrollX()
            r5 = 0
            r7 = r11
            r2.startScroll(r3, r4, r5, r6, r7)
            r8.runAnimatedScroll(r12)
            goto L68
        L5a:
            android.widget.OverScroller r11 = r8.mScroller
            boolean r11 = r11.isFinished()
            if (r11 != 0) goto L65
            r8.abortAnimatedScroll()
        L65:
            r8.scrollBy(r9, r10)
        L68:
            long r9 = android.view.animation.AnimationUtils.currentAnimationTimeMillis()
            r8.mLastScroll = r9
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r0 = "ScrollView can host only one direct child"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3, r4)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View r2, android.view.ViewGroup.LayoutParams r3) {
            r1 = this;
            int r0 = r1.getChildCount()
            if (r0 > 0) goto La
            super.addView(r2, r3)
            return
        La:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "ScrollView can host only one direct child"
            r2.<init>(r3)
            throw r2
    }

    public boolean arrowScroll(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            if (r0 != r7) goto L7
            r0 = 0
        L7:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r7, r0, r8)
            int r2 = r7.getMaxScrollAmount()
            if (r1 == 0) goto L36
            int r3 = r7.getHeight()
            boolean r3 = r7.isWithinDeltaOfScreen(r1, r2, r3)
            if (r3 == 0) goto L36
            android.graphics.Rect r2 = r7.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r7.mTempRect
            r7.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r2 = r7.mTempRect
            int r2 = r7.computeScrollDeltaToGetChildRectOnScreen(r2)
            r7.doScrollY(r2)
            r1.requestFocus(r8)
            goto L7e
        L36:
            r1 = 33
            r3 = 0
            r4 = 130(0x82, float:1.82E-43)
            if (r8 != r1) goto L48
            int r1 = r7.getScrollY()
            if (r1 >= r2) goto L48
            int r2 = r7.getScrollY()
            goto L74
        L48:
            if (r8 != r4) goto L74
            int r1 = r7.getChildCount()
            if (r1 <= 0) goto L74
            android.view.View r1 = r7.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r5 = (android.widget.FrameLayout.LayoutParams) r5
            int r1 = r1.getBottom()
            int r5 = r5.bottomMargin
            int r1 = r1 + r5
            int r5 = r7.getScrollY()
            int r6 = r7.getHeight()
            int r5 = r5 + r6
            int r6 = r7.getPaddingBottom()
            int r5 = r5 - r6
            int r1 = r1 - r5
            int r2 = java.lang.Math.min(r1, r2)
        L74:
            if (r2 != 0) goto L77
            return r3
        L77:
            if (r8 != r4) goto L7a
            goto L7b
        L7a:
            int r2 = -r2
        L7b:
            r7.doScrollY(r2)
        L7e:
            if (r0 == 0) goto L9b
            boolean r8 = r0.isFocused()
            if (r8 == 0) goto L9b
            boolean r8 = r7.isOffScreen(r0)
            if (r8 == 0) goto L9b
            int r8 = r7.getDescendantFocusability()
            r0 = 131072(0x20000, float:1.83671E-40)
            r7.setDescendantFocusability(r0)
            r7.requestFocus()
            r7.setDescendantFocusability(r8)
        L9b:
            r8 = 1
            return r8
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
            r1 = this;
            int r0 = super.computeHorizontalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
            r1 = this;
            int r0 = super.computeHorizontalScrollOffset()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
            r1 = this;
            int r0 = super.computeHorizontalScrollRange()
            return r0
    }

    @Override // android.view.View
    public void computeScroll() {
            r16 = this;
            r10 = r16
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto Lb
            return
        Lb:
            android.widget.OverScroller r0 = r10.mScroller
            r0.computeScrollOffset()
            android.widget.OverScroller r0 = r10.mScroller
            int r0 = r0.getCurrY()
            int r1 = r10.mLastScrollerY
            int r6 = r0 - r1
            r10.mLastScrollerY = r0
            int[] r3 = r10.mScrollConsumed
            r11 = 1
            r12 = 0
            r3[r11] = r12
            r1 = 0
            r4 = 0
            r5 = 1
            r0 = r16
            r2 = r6
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r11]
            int r13 = r6 - r0
            int r14 = r16.getScrollRange()
            if (r13 == 0) goto L66
            int r15 = r16.getScrollY()
            r1 = 0
            int r3 = r16.getScrollX()
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r0 = r16
            r2 = r13
            r4 = r15
            r6 = r14
            r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            int r0 = r16.getScrollY()
            int r2 = r0 - r15
            int r13 = r13 - r2
            int[] r7 = r10.mScrollConsumed
            r7[r11] = r12
            r3 = 0
            int[] r5 = r10.mScrollOffset
            r6 = 1
            r0 = r16
            r4 = r13
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r11]
            int r13 = r13 - r0
        L66:
            if (r13 == 0) goto La6
            int r0 = r16.getOverScrollMode()
            if (r0 == 0) goto L72
            if (r0 != r11) goto L73
            if (r14 <= 0) goto L73
        L72:
            r12 = r11
        L73:
            if (r12 == 0) goto La3
            r16.ensureGlows()
            if (r13 >= 0) goto L8f
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto La3
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            android.widget.OverScroller r1 = r10.mScroller
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
            goto La3
        L8f:
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto La3
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            android.widget.OverScroller r1 = r10.mScroller
            float r1 = r1.getCurrVelocity()
            int r1 = (int) r1
            r0.onAbsorb(r1)
        La3:
            r16.abortAnimatedScroll()
        La6:
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto Lb2
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r16)
            goto Lb5
        Lb2:
            r10.stopNestedScroll(r11)
        Lb5:
            return
    }

    protected int computeScrollDeltaToGetChildRectOnScreen(android.graphics.Rect r11) {
            r10 = this;
            int r0 = r10.getChildCount()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r10.getHeight()
            int r2 = r10.getScrollY()
            int r3 = r2 + r0
            int r4 = r10.getVerticalFadingEdgeLength()
            int r5 = r11.top
            if (r5 <= 0) goto L1b
            int r2 = r2 + r4
        L1b:
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r6 = (android.widget.FrameLayout.LayoutParams) r6
            int r7 = r11.bottom
            int r8 = r5.getHeight()
            int r9 = r6.topMargin
            int r8 = r8 + r9
            int r9 = r6.bottomMargin
            int r8 = r8 + r9
            if (r7 >= r8) goto L36
            int r4 = r3 - r4
            goto L37
        L36:
            r4 = r3
        L37:
            int r7 = r11.bottom
            if (r7 <= r4) goto L5a
            int r7 = r11.top
            if (r7 <= r2) goto L5a
            int r7 = r11.height()
            if (r7 <= r0) goto L49
            int r11 = r11.top
            int r11 = r11 - r2
            goto L4c
        L49:
            int r11 = r11.bottom
            int r11 = r11 - r4
        L4c:
            int r11 = r11 + r1
            int r0 = r5.getBottom()
            int r1 = r6.bottomMargin
            int r0 = r0 + r1
            int r0 = r0 - r3
            int r1 = java.lang.Math.min(r11, r0)
            goto L7a
        L5a:
            int r3 = r11.top
            if (r3 >= r2) goto L7a
            int r3 = r11.bottom
            if (r3 >= r4) goto L7a
            int r3 = r11.height()
            if (r3 <= r0) goto L6d
            int r11 = r11.bottom
            int r4 = r4 - r11
            int r1 = r1 - r4
            goto L71
        L6d:
            int r11 = r11.top
            int r2 = r2 - r11
            int r1 = r1 - r2
        L71:
            int r11 = r10.getScrollY()
            int r11 = -r11
            int r1 = java.lang.Math.max(r1, r11)
        L7a:
            return r1
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
            r1 = this;
            int r0 = super.computeVerticalScrollExtent()
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
            r2 = this;
            r0 = 0
            int r1 = super.computeVerticalScrollOffset()
            int r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            int r1 = r4.getHeight()
            int r2 = r4.getPaddingBottom()
            int r1 = r1 - r2
            int r2 = r4.getPaddingTop()
            int r1 = r1 - r2
            if (r0 != 0) goto L15
            return r1
        L15:
            r0 = 0
            android.view.View r2 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getBottom()
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
            int r3 = r4.getScrollY()
            int r1 = r2 - r1
            int r0 = java.lang.Math.max(r0, r1)
            if (r3 >= 0) goto L35
            int r2 = r2 - r3
            goto L39
        L35:
            if (r3 <= r0) goto L39
            int r3 = r3 - r0
            int r2 = r2 + r3
        L39:
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent r2) {
            r1 = this;
            boolean r0 = super.dispatchKeyEvent(r2)
            if (r0 != 0) goto Lf
            boolean r2 = r1.executeKeyEvent(r2)
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            r2 = 0
            goto L10
        Lf:
            r2 = 1
        L10:
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float r2, float r3, boolean r4) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.dispatchNestedFling(r2, r3, r4)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float r2, float r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.dispatchNestedPreFling(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
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

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int r7, int r8, int[] r9, int[] r10, int r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int r9, int r10, int r11, int r12, int[] r13, int r14, int[] r15) {
            r8 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r8.mChildHelper
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int r7, int r8, int r9, int r10, int[] r11) {
            r6 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r6.mChildHelper
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            boolean r7 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int r8, int r9, int r10, int r11, int[] r12, int r13) {
            r7 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r7.mChildHelper
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            boolean r8 = r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r10) {
            r9 = this;
            super.draw(r10)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowTop
            if (r0 == 0) goto Lcf
            int r0 = r9.getScrollY()
            android.widget.EdgeEffect r1 = r9.mEdgeGlowTop
            boolean r1 = r1.isFinished()
            r2 = 0
            if (r1 != 0) goto L68
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = java.lang.Math.min(r2, r0)
            boolean r6 = r9.getClipToPadding()
            if (r6 == 0) goto L3a
            int r6 = r9.getPaddingLeft()
            int r7 = r9.getPaddingRight()
            int r6 = r6 + r7
            int r3 = r3 - r6
            int r6 = r9.getPaddingLeft()
            int r6 = r6 + r2
            goto L3b
        L3a:
            r6 = r2
        L3b:
            boolean r7 = r9.getClipToPadding()
            if (r7 == 0) goto L50
            int r7 = r9.getPaddingTop()
            int r8 = r9.getPaddingBottom()
            int r7 = r7 + r8
            int r4 = r4 - r7
            int r7 = r9.getPaddingTop()
            int r5 = r5 + r7
        L50:
            float r6 = (float) r6
            float r5 = (float) r5
            r10.translate(r6, r5)
            android.widget.EdgeEffect r5 = r9.mEdgeGlowTop
            r5.setSize(r3, r4)
            android.widget.EdgeEffect r3 = r9.mEdgeGlowTop
            boolean r3 = r3.draw(r10)
            if (r3 == 0) goto L65
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r9)
        L65:
            r10.restoreToCount(r1)
        L68:
            android.widget.EdgeEffect r1 = r9.mEdgeGlowBottom
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto Lcf
            int r1 = r10.save()
            int r3 = r9.getWidth()
            int r4 = r9.getHeight()
            int r5 = r9.getScrollRange()
            int r0 = java.lang.Math.max(r5, r0)
            int r0 = r0 + r4
            boolean r5 = r9.getClipToPadding()
            if (r5 == 0) goto L9a
            int r5 = r9.getPaddingLeft()
            int r6 = r9.getPaddingRight()
            int r5 = r5 + r6
            int r3 = r3 - r5
            int r5 = r9.getPaddingLeft()
            int r2 = r2 + r5
        L9a:
            boolean r5 = r9.getClipToPadding()
            if (r5 == 0) goto Laf
            int r5 = r9.getPaddingTop()
            int r6 = r9.getPaddingBottom()
            int r5 = r5 + r6
            int r4 = r4 - r5
            int r5 = r9.getPaddingBottom()
            int r0 = r0 - r5
        Laf:
            int r2 = r2 - r3
            float r2 = (float) r2
            float r0 = (float) r0
            r10.translate(r2, r0)
            float r0 = (float) r3
            r2 = 0
            r5 = 1127481344(0x43340000, float:180.0)
            r10.rotate(r5, r0, r2)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            r0.setSize(r3, r4)
            android.widget.EdgeEffect r0 = r9.mEdgeGlowBottom
            boolean r0 = r0.draw(r10)
            if (r0 == 0) goto Lcc
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r9)
        Lcc:
            r10.restoreToCount(r1)
        Lcf:
            return
    }

    public boolean executeKeyEvent(android.view.KeyEvent r6) {
            r5 = this;
            android.graphics.Rect r0 = r5.mTempRect
            r0.setEmpty()
            boolean r0 = r5.canScroll()
            r1 = 0
            r2 = 130(0x82, float:1.82E-43)
            if (r0 != 0) goto L36
            boolean r0 = r5.isFocused()
            if (r0 == 0) goto L35
            int r6 = r6.getKeyCode()
            r0 = 4
            if (r6 == r0) goto L35
            android.view.View r6 = r5.findFocus()
            if (r6 != r5) goto L22
            r6 = 0
        L22:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r6 = r0.findNextFocus(r5, r6, r2)
            if (r6 == 0) goto L35
            if (r6 == r5) goto L35
            boolean r6 = r6.requestFocus(r2)
            if (r6 == 0) goto L35
            r1 = 1
        L35:
            return r1
        L36:
            int r0 = r6.getAction()
            if (r0 != 0) goto L79
            int r0 = r6.getKeyCode()
            r3 = 19
            r4 = 33
            if (r0 == r3) goto L6a
            r3 = 20
            if (r0 == r3) goto L5a
            r3 = 62
            if (r0 == r3) goto L4f
            goto L79
        L4f:
            boolean r6 = r6.isShiftPressed()
            if (r6 == 0) goto L56
            r2 = r4
        L56:
            r5.pageScroll(r2)
            goto L79
        L5a:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L65
            boolean r1 = r5.arrowScroll(r2)
            goto L79
        L65:
            boolean r1 = r5.fullScroll(r2)
            goto L79
        L6a:
            boolean r6 = r6.isAltPressed()
            if (r6 != 0) goto L75
            boolean r1 = r5.arrowScroll(r4)
            goto L79
        L75:
            boolean r1 = r5.fullScroll(r4)
        L79:
            return r1
    }

    public void fling(int r13) {
            r12 = this;
            int r0 = r12.getChildCount()
            if (r0 <= 0) goto L22
            android.widget.OverScroller r1 = r12.mScroller
            int r2 = r12.getScrollX()
            int r3 = r12.getScrollY()
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r9 = 2147483647(0x7fffffff, float:NaN)
            r10 = 0
            r11 = 0
            r5 = r13
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            r13 = 1
            r12.runAnimatedScroll(r13)
        L22:
            return
    }

    public boolean fullScroll(int r6) {
            r5 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 1
            r2 = 0
            if (r6 != r0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            int r3 = r5.getHeight()
            android.graphics.Rect r4 = r5.mTempRect
            r4.top = r2
            android.graphics.Rect r2 = r5.mTempRect
            r2.bottom = r3
            if (r0 == 0) goto L3f
            int r0 = r5.getChildCount()
            if (r0 <= 0) goto L3f
            int r0 = r0 - r1
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            android.graphics.Rect r2 = r5.mTempRect
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getPaddingBottom()
            int r0 = r0 + r1
            r2.bottom = r0
            android.graphics.Rect r0 = r5.mTempRect
            int r1 = r0.bottom
            int r1 = r1 - r3
            r0.top = r1
        L3f:
            android.graphics.Rect r0 = r5.mTempRect
            int r0 = r0.top
            android.graphics.Rect r1 = r5.mTempRect
            int r1 = r1.bottom
            boolean r6 = r5.scrollAndFocus(r6, r0, r1)
            return r6
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
            r5 = this;
            int r0 = r5.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 0
            android.view.View r0 = r5.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r5.getVerticalFadingEdgeLength()
            int r3 = r5.getHeight()
            int r4 = r5.getPaddingBottom()
            int r3 = r3 - r4
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r5.getScrollY()
            int r0 = r0 - r1
            int r0 = r0 - r3
            if (r0 >= r2) goto L33
            float r0 = (float) r0
            float r1 = (float) r2
            float r0 = r0 / r1
            return r0
        L33:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public int getMaxScrollAmount() {
            r2 = this;
            int r0 = r2.getHeight()
            float r0 = (float) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            int r0 = r0.getNestedScrollAxes()
            return r0
    }

    int getScrollRange() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L2e
            android.view.View r0 = r4.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r2 = (android.widget.FrameLayout.LayoutParams) r2
            int r0 = r0.getHeight()
            int r3 = r2.topMargin
            int r0 = r0 + r3
            int r2 = r2.bottomMargin
            int r0 = r0 + r2
            int r2 = r4.getHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r0 = r0 - r2
            int r1 = java.lang.Math.max(r1, r0)
        L2e:
            return r1
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
            r2 = this;
            int r0 = r2.getChildCount()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            int r0 = r2.getVerticalFadingEdgeLength()
            int r1 = r2.getScrollY()
            if (r1 >= r0) goto L16
            float r1 = (float) r1
            float r0 = (float) r0
            float r1 = r1 / r0
            return r1
        L16:
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.hasNestedScrollingParent(r0)
            return r0
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.hasNestedScrollingParent(r2)
            return r2
    }

    public boolean isFillViewport() {
            r1 = this;
            boolean r0 = r1.mFillViewport
            return r0
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r0 = r0.isNestedScrollingEnabled()
            return r0
    }

    public boolean isSmoothScrollingEnabled() {
            r1 = this;
            boolean r0 = r1.mSmoothScrollingEnabled
            return r0
    }

    @Override // android.view.ViewGroup
    protected void measureChild(android.view.View r3, int r4, int r5) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r0 = r2.getPaddingLeft()
            int r1 = r2.getPaddingRight()
            int r0 = r0 + r1
            int r5 = r5.width
            int r4 = getChildMeasureSpec(r4, r0, r5)
            r5 = 0
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r5)
            r3.measure(r4, r5)
            return
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(android.view.View r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r5 = r2.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r5 = (android.view.ViewGroup.MarginLayoutParams) r5
            int r6 = r1.getPaddingLeft()
            int r0 = r1.getPaddingRight()
            int r6 = r6 + r0
            int r0 = r5.leftMargin
            int r6 = r6 + r0
            int r0 = r5.rightMargin
            int r6 = r6 + r0
            int r6 = r6 + r4
            int r4 = r5.width
            int r3 = getChildMeasureSpec(r3, r6, r4)
            int r4 = r5.topMargin
            int r5 = r5.bottomMargin
            int r4 = r4 + r5
            r5 = 0
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r5)
            r2.measure(r3, r4)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 0
            r1.mIsLaidOut = r0
            return
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L44
            int r0 = r4.getAction()
            r2 = 8
            if (r0 == r2) goto L12
            goto L44
        L12:
            boolean r0 = r3.mIsBeingDragged
            if (r0 != 0) goto L44
            r0 = 9
            float r4 = r4.getAxisValue(r0)
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 == 0) goto L44
            float r0 = r3.getVerticalScrollFactorCompat()
            float r4 = r4 * r0
            int r4 = (int) r4
            int r0 = r3.getScrollRange()
            int r2 = r3.getScrollY()
            int r4 = r2 - r4
            if (r4 >= 0) goto L35
            r0 = r1
            goto L39
        L35:
            if (r4 <= r0) goto L38
            goto L39
        L38:
            r0 = r4
        L39:
            if (r0 == r2) goto L44
            int r4 = r3.getScrollX()
            super.scrollTo(r4, r0)
            r4 = 1
            return r4
        L44:
            return r1
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
            r11 = this;
            int r0 = r12.getAction()
            r1 = 1
            r2 = 2
            if (r0 != r2) goto Ld
            boolean r3 = r11.mIsBeingDragged
            if (r3 == 0) goto Ld
            return r1
        Ld:
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3 = 0
            if (r0 == 0) goto La1
            r4 = -1
            if (r0 == r1) goto L7c
            if (r0 == r2) goto L24
            r1 = 3
            if (r0 == r1) goto L7c
            r1 = 6
            if (r0 == r1) goto L1f
            goto Ld8
        L1f:
            r11.onSecondaryPointerUp(r12)
            goto Ld8
        L24:
            int r0 = r11.mActivePointerId
            if (r0 != r4) goto L2a
            goto Ld8
        L2a:
            int r5 = r12.findPointerIndex(r0)
            if (r5 != r4) goto L4c
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r12.<init>(r1)
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r0 = " in onInterceptTouchEvent"
            java.lang.StringBuilder r12 = r12.append(r0)
            java.lang.String r12 = r12.toString()
            java.lang.String r0 = "NestedScrollView"
            android.util.Log.e(r0, r12)
            goto Ld8
        L4c:
            float r0 = r12.getY(r5)
            int r0 = (int) r0
            int r4 = r11.mLastMotionY
            int r4 = r0 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r11.mTouchSlop
            if (r4 <= r5) goto Ld8
            int r4 = r11.getNestedScrollAxes()
            r2 = r2 & r4
            if (r2 != 0) goto Ld8
            r11.mIsBeingDragged = r1
            r11.mLastMotionY = r0
            r11.initVelocityTrackerIfNotExists()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            r11.mNestedYOffset = r3
            android.view.ViewParent r12 = r11.getParent()
            if (r12 == 0) goto Ld8
            r12.requestDisallowInterceptTouchEvent(r1)
            goto Ld8
        L7c:
            r11.mIsBeingDragged = r3
            r11.mActivePointerId = r4
            r11.recycleVelocityTracker()
            android.widget.OverScroller r4 = r11.mScroller
            int r5 = r11.getScrollX()
            int r6 = r11.getScrollY()
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r11.getScrollRange()
            boolean r12 = r4.springBack(r5, r6, r7, r8, r9, r10)
            if (r12 == 0) goto L9d
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r11)
        L9d:
            r11.stopNestedScroll(r3)
            goto Ld8
        La1:
            float r0 = r12.getY()
            int r0 = (int) r0
            float r4 = r12.getX()
            int r4 = (int) r4
            boolean r4 = r11.inChild(r4, r0)
            if (r4 != 0) goto Lb7
            r11.mIsBeingDragged = r3
            r11.recycleVelocityTracker()
            goto Ld8
        Lb7:
            r11.mLastMotionY = r0
            int r0 = r12.getPointerId(r3)
            r11.mActivePointerId = r0
            r11.initOrResetVelocityTracker()
            android.view.VelocityTracker r0 = r11.mVelocityTracker
            r0.addMovement(r12)
            android.widget.OverScroller r12 = r11.mScroller
            r12.computeScrollOffset()
            android.widget.OverScroller r12 = r11.mScroller
            boolean r12 = r12.isFinished()
            r12 = r12 ^ r1
            r11.mIsBeingDragged = r12
            r11.startNestedScroll(r2, r3)
        Ld8:
            boolean r12 = r11.mIsBeingDragged
            return r12
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            super.onLayout(r2, r3, r4, r5, r6)
            r2 = 0
            r1.mIsLayoutDirty = r2
            android.view.View r3 = r1.mChildToScrollTo
            if (r3 == 0) goto L15
            boolean r3 = isViewDescendantOf(r3, r1)
            if (r3 == 0) goto L15
            android.view.View r3 = r1.mChildToScrollTo
            r1.scrollToChild(r3)
        L15:
            r3 = 0
            r1.mChildToScrollTo = r3
            boolean r5 = r1.mIsLaidOut
            if (r5 != 0) goto L63
            androidx.core.widget.NestedScrollView$SavedState r5 = r1.mSavedState
            if (r5 == 0) goto L2d
            int r5 = r1.getScrollX()
            androidx.core.widget.NestedScrollView$SavedState r0 = r1.mSavedState
            int r0 = r0.scrollPosition
            r1.scrollTo(r5, r0)
            r1.mSavedState = r3
        L2d:
            int r3 = r1.getChildCount()
            if (r3 <= 0) goto L47
            android.view.View r2 = r1.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r3 = (android.widget.FrameLayout.LayoutParams) r3
            int r2 = r2.getMeasuredHeight()
            int r5 = r3.topMargin
            int r2 = r2 + r5
            int r3 = r3.bottomMargin
            int r2 = r2 + r3
        L47:
            int r6 = r6 - r4
            int r3 = r1.getPaddingTop()
            int r6 = r6 - r3
            int r3 = r1.getPaddingBottom()
            int r6 = r6 - r3
            int r3 = r1.getScrollY()
            int r2 = clamp(r3, r6, r2)
            if (r2 == r3) goto L63
            int r3 = r1.getScrollX()
            r1.scrollTo(r3, r2)
        L63:
            int r2 = r1.getScrollX()
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            r2 = 1
            r1.mIsLaidOut = r2
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r5, int r6) {
            r4 = this;
            super.onMeasure(r5, r6)
            boolean r0 = r4.mFillViewport
            if (r0 != 0) goto L8
            return
        L8:
            int r6 = android.view.View.MeasureSpec.getMode(r6)
            if (r6 != 0) goto Lf
            return
        Lf:
            int r6 = r4.getChildCount()
            if (r6 <= 0) goto L58
            r6 = 0
            android.view.View r6 = r4.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            int r1 = r6.getMeasuredHeight()
            int r2 = r4.getMeasuredHeight()
            int r3 = r4.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r4.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r0.topMargin
            int r2 = r2 - r3
            int r3 = r0.bottomMargin
            int r2 = r2 - r3
            if (r1 >= r2) goto L58
            int r1 = r4.getPaddingLeft()
            int r3 = r4.getPaddingRight()
            int r1 = r1 + r3
            int r3 = r0.leftMargin
            int r1 = r1 + r3
            int r3 = r0.rightMargin
            int r1 = r1 + r3
            int r0 = r0.width
            int r5 = getChildMeasureSpec(r5, r1, r0)
            r0 = 1073741824(0x40000000, float:2.0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r6.measure(r5, r0)
        L58:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            if (r4 != 0) goto Lc
            r1 = 0
            r2 = 1
            r0.dispatchNestedFling(r1, r3, r2)
            int r1 = (int) r3
            r0.fling(r1)
            return r2
        Lc:
            r1 = 0
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            boolean r1 = r0.dispatchNestedPreFling(r2, r3)
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.onNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(android.view.View r7, int r8, int r9, int[] r10, int r11) {
            r6 = this;
            r4 = 0
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r11
            r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            r1 = 0
            r2 = 0
            r0.onNestedScrollInternal(r5, r1, r2)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.onNestedScrollInternal(r5, r6, r1)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            r0.onNestedScrollInternal(r5, r6, r7)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            r1.onNestedScrollAccepted(r2, r3, r4, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(android.view.View r2, android.view.View r3, int r4, int r5) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onNestedScrollAccepted(r2, r3, r4, r5)
            r2 = 2
            r1.startNestedScroll(r2, r5)
            return
    }

    @Override // android.view.View
    protected void onOverScrolled(int r1, int r2, boolean r3, boolean r4) {
            r0 = this;
            super.scrollTo(r1, r2)
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r4, android.graphics.Rect r5) {
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L6
            r4 = 130(0x82, float:1.82E-43)
            goto Lb
        L6:
            r0 = 1
            if (r4 != r0) goto Lb
            r4 = 33
        Lb:
            if (r5 != 0) goto L17
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            r1 = 0
            android.view.View r0 = r0.findNextFocus(r3, r1, r4)
            goto L1f
        L17:
            android.view.FocusFinder r0 = android.view.FocusFinder.getInstance()
            android.view.View r0 = r0.findNextFocusFromRect(r3, r5, r4)
        L1f:
            r1 = 0
            if (r0 != 0) goto L23
            return r1
        L23:
            boolean r2 = r3.isOffScreen(r0)
            if (r2 == 0) goto L2a
            return r1
        L2a:
            boolean r4 = r0.requestFocus(r4, r5)
            return r4
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.widget.NestedScrollView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            androidx.core.widget.NestedScrollView$SavedState r2 = (androidx.core.widget.NestedScrollView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            r1.mSavedState = r2
            r1.requestLayout()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.core.widget.NestedScrollView$SavedState r1 = new androidx.core.widget.NestedScrollView$SavedState
            r1.<init>(r0)
            int r0 = r2.getScrollY()
            r1.scrollPosition = r0
            return r1
    }

    @Override // android.view.View
    protected void onScrollChanged(int r7, int r8, int r9, int r10) {
            r6 = this;
            super.onScrollChanged(r7, r8, r9, r10)
            androidx.core.widget.NestedScrollView$OnScrollChangeListener r0 = r6.mOnScrollChangeListener
            if (r0 == 0) goto Lf
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.onScrollChange(r1, r2, r3, r4, r5)
        Lf:
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            android.view.View r1 = r0.findFocus()
            if (r1 == 0) goto L26
            if (r0 != r1) goto Lc
            goto L26
        Lc:
            r2 = 0
            boolean r2 = r0.isWithinDeltaOfScreen(r1, r2, r4)
            if (r2 == 0) goto L26
            android.graphics.Rect r2 = r0.mTempRect
            r1.getDrawingRect(r2)
            android.graphics.Rect r2 = r0.mTempRect
            r0.offsetDescendantRectToMyCoords(r1, r2)
            android.graphics.Rect r1 = r0.mTempRect
            int r1 = r0.computeScrollDeltaToGetChildRectOnScreen(r1)
            r0.doScrollY(r1)
        L26:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(android.view.View r2, android.view.View r3, int r4) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.onStartNestedScroll(r2, r3, r4, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            r1 = r3 & 2
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            return r1
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.onStopNestedScroll(r2, r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(android.view.View r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingParentHelper r0 = r1.mParentHelper
            r0.onStopNestedScroll(r2, r3)
            r1.stopNestedScroll(r3)
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r24) {
            r23 = this;
            r10 = r23
            r11 = r24
            r23.initVelocityTrackerIfNotExists()
            int r0 = r24.getActionMasked()
            r12 = 0
            if (r0 != 0) goto L10
            r10.mNestedYOffset = r12
        L10:
            android.view.MotionEvent r13 = android.view.MotionEvent.obtain(r24)
            int r1 = r10.mNestedYOffset
            float r1 = (float) r1
            r2 = 0
            r13.offsetLocation(r2, r1)
            r1 = 2
            r14 = 1
            if (r0 == 0) goto L21b
            r3 = -1
            if (r0 == r14) goto L1d0
            if (r0 == r1) goto L82
            r1 = 3
            if (r0 == r1) goto L54
            r1 = 5
            if (r0 == r1) goto L41
            r1 = 6
            if (r0 == r1) goto L2f
            goto L251
        L2f:
            r23.onSecondaryPointerUp(r24)
            int r0 = r10.mActivePointerId
            int r0 = r11.findPointerIndex(r0)
            float r0 = r11.getY(r0)
            int r0 = (int) r0
            r10.mLastMotionY = r0
            goto L251
        L41:
            int r0 = r24.getActionIndex()
            float r1 = r11.getY(r0)
            int r1 = (int) r1
            r10.mLastMotionY = r1
            int r0 = r11.getPointerId(r0)
            r10.mActivePointerId = r0
            goto L251
        L54:
            boolean r0 = r10.mIsBeingDragged
            if (r0 == 0) goto L7b
            int r0 = r23.getChildCount()
            if (r0 <= 0) goto L7b
            android.widget.OverScroller r15 = r10.mScroller
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L7b
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r23)
        L7b:
            r10.mActivePointerId = r3
            r23.endDrag()
            goto L251
        L82:
            int r0 = r10.mActivePointerId
            int r15 = r11.findPointerIndex(r0)
            if (r15 != r3) goto La8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid pointerId="
            r0.<init>(r1)
            int r1 = r10.mActivePointerId
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = " in onTouchEvent"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "NestedScrollView"
            android.util.Log.e(r1, r0)
            goto L251
        La8:
            float r0 = r11.getY(r15)
            int r6 = (int) r0
            int r0 = r10.mLastMotionY
            int r0 = r0 - r6
            boolean r1 = r10.mIsBeingDragged
            if (r1 != 0) goto Ld0
            int r1 = java.lang.Math.abs(r0)
            int r2 = r10.mTouchSlop
            if (r1 <= r2) goto Ld0
            android.view.ViewParent r1 = r23.getParent()
            if (r1 == 0) goto Lc5
            r1.requestDisallowInterceptTouchEvent(r14)
        Lc5:
            r10.mIsBeingDragged = r14
            if (r0 <= 0) goto Lcd
            int r1 = r10.mTouchSlop
            int r0 = r0 - r1
            goto Ld0
        Lcd:
            int r1 = r10.mTouchSlop
            int r0 = r0 + r1
        Ld0:
            r7 = r0
            boolean r0 = r10.mIsBeingDragged
            if (r0 == 0) goto L251
            r1 = 0
            int[] r3 = r10.mScrollConsumed
            int[] r4 = r10.mScrollOffset
            r5 = 0
            r0 = r23
            r2 = r7
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto Lf2
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r14]
            int r7 = r7 - r0
            int r0 = r10.mNestedYOffset
            int[] r1 = r10.mScrollOffset
            r1 = r1[r14]
            int r0 = r0 + r1
            r10.mNestedYOffset = r0
        Lf2:
            r16 = r7
            int[] r0 = r10.mScrollOffset
            r0 = r0[r14]
            int r6 = r6 - r0
            r10.mLastMotionY = r6
            int r17 = r23.getScrollY()
            int r9 = r23.getScrollRange()
            int r0 = r23.getOverScrollMode()
            if (r0 == 0) goto L111
            if (r0 != r14) goto L10e
            if (r9 <= 0) goto L10e
            goto L111
        L10e:
            r18 = r12
            goto L113
        L111:
            r18 = r14
        L113:
            r1 = 0
            r3 = 0
            int r4 = r23.getScrollY()
            r5 = 0
            r7 = 0
            r8 = 0
            r19 = 1
            r0 = r23
            r2 = r16
            r6 = r9
            r22 = r9
            r9 = r19
            boolean r0 = r0.overScrollByCompat(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            if (r0 == 0) goto L138
            boolean r0 = r10.hasNestedScrollingParent(r12)
            if (r0 != 0) goto L138
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            r0.clear()
        L138:
            int r0 = r23.getScrollY()
            int r2 = r0 - r17
            int r4 = r16 - r2
            int[] r7 = r10.mScrollConsumed
            r7[r14] = r12
            r1 = 0
            r3 = 0
            int[] r5 = r10.mScrollOffset
            r6 = 0
            r0 = r23
            r0.dispatchNestedScroll(r1, r2, r3, r4, r5, r6, r7)
            int r0 = r10.mLastMotionY
            int[] r1 = r10.mScrollOffset
            r1 = r1[r14]
            int r0 = r0 - r1
            r10.mLastMotionY = r0
            int r0 = r10.mNestedYOffset
            int r0 = r0 + r1
            r10.mNestedYOffset = r0
            if (r18 == 0) goto L251
            int[] r0 = r10.mScrollConsumed
            r0 = r0[r14]
            int r0 = r16 - r0
            r23.ensureGlows()
            int r1 = r17 + r0
            if (r1 >= 0) goto L18f
            android.widget.EdgeEffect r1 = r10.mEdgeGlowTop
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            androidx.core.widget.EdgeEffectCompat.onPull(r1, r0, r2)
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L1b9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            r0.onRelease()
            goto L1b9
        L18f:
            r2 = r22
            if (r1 <= r2) goto L1b9
            android.widget.EdgeEffect r1 = r10.mEdgeGlowBottom
            float r0 = (float) r0
            int r2 = r23.getHeight()
            float r2 = (float) r2
            float r0 = r0 / r2
            float r2 = r11.getX(r15)
            int r3 = r23.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r3 = 1065353216(0x3f800000, float:1.0)
            float r3 = r3 - r2
            androidx.core.widget.EdgeEffectCompat.onPull(r1, r0, r3)
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L1b9
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            r0.onRelease()
        L1b9:
            android.widget.EdgeEffect r0 = r10.mEdgeGlowTop
            if (r0 == 0) goto L251
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L1cb
            android.widget.EdgeEffect r0 = r10.mEdgeGlowBottom
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L251
        L1cb:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r23)
            goto L251
        L1d0:
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r1 = r10.mMaximumVelocity
            float r1 = (float) r1
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4, r1)
            int r1 = r10.mActivePointerId
            float r0 = r0.getYVelocity(r1)
            int r0 = (int) r0
            int r1 = java.lang.Math.abs(r0)
            int r4 = r10.mMinimumVelocity
            if (r1 < r4) goto L1f8
            int r0 = -r0
            float r1 = (float) r0
            boolean r4 = r10.dispatchNestedPreFling(r2, r1)
            if (r4 != 0) goto L215
            r10.dispatchNestedFling(r2, r1, r14)
            r10.fling(r0)
            goto L215
        L1f8:
            android.widget.OverScroller r15 = r10.mScroller
            int r16 = r23.getScrollX()
            int r17 = r23.getScrollY()
            r18 = 0
            r19 = 0
            r20 = 0
            int r21 = r23.getScrollRange()
            boolean r0 = r15.springBack(r16, r17, r18, r19, r20, r21)
            if (r0 == 0) goto L215
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r23)
        L215:
            r10.mActivePointerId = r3
            r23.endDrag()
            goto L251
        L21b:
            int r0 = r23.getChildCount()
            if (r0 != 0) goto L222
            return r12
        L222:
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            r0 = r0 ^ r14
            r10.mIsBeingDragged = r0
            if (r0 == 0) goto L236
            android.view.ViewParent r0 = r23.getParent()
            if (r0 == 0) goto L236
            r0.requestDisallowInterceptTouchEvent(r14)
        L236:
            android.widget.OverScroller r0 = r10.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L241
            r23.abortAnimatedScroll()
        L241:
            float r0 = r24.getY()
            int r0 = (int) r0
            r10.mLastMotionY = r0
            int r0 = r11.getPointerId(r12)
            r10.mActivePointerId = r0
            r10.startNestedScroll(r1, r12)
        L251:
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            if (r0 == 0) goto L258
            r0.addMovement(r13)
        L258:
            r13.recycle()
            return r14
    }

    boolean overScrollByCompat(int r13, int r14, int r15, int r16, int r17, int r18, int r19, int r20, boolean r21) {
            r12 = this;
            r0 = r12
            int r1 = r12.getOverScrollMode()
            int r2 = r12.computeHorizontalScrollRange()
            int r3 = r12.computeHorizontalScrollExtent()
            r4 = 0
            r5 = 1
            if (r2 <= r3) goto L13
            r2 = r5
            goto L14
        L13:
            r2 = r4
        L14:
            int r3 = r12.computeVerticalScrollRange()
            int r6 = r12.computeVerticalScrollExtent()
            if (r3 <= r6) goto L20
            r3 = r5
            goto L21
        L20:
            r3 = r4
        L21:
            if (r1 == 0) goto L2a
            if (r1 != r5) goto L28
            if (r2 == 0) goto L28
            goto L2a
        L28:
            r2 = r4
            goto L2b
        L2a:
            r2 = r5
        L2b:
            if (r1 == 0) goto L34
            if (r1 != r5) goto L32
            if (r3 == 0) goto L32
            goto L34
        L32:
            r1 = r4
            goto L35
        L34:
            r1 = r5
        L35:
            int r3 = r15 + r13
            if (r2 != 0) goto L3b
            r2 = r4
            goto L3d
        L3b:
            r2 = r19
        L3d:
            int r6 = r16 + r14
            if (r1 != 0) goto L43
            r1 = r4
            goto L45
        L43:
            r1 = r20
        L45:
            int r7 = -r2
            int r2 = r2 + r17
            int r8 = -r1
            int r1 = r1 + r18
            if (r3 <= r2) goto L50
            r3 = r2
            r2 = r5
            goto L56
        L50:
            if (r3 >= r7) goto L55
            r2 = r5
            r3 = r7
            goto L56
        L55:
            r2 = r4
        L56:
            if (r6 <= r1) goto L5b
            r6 = r1
            r1 = r5
            goto L61
        L5b:
            if (r6 >= r8) goto L60
            r1 = r5
            r6 = r8
            goto L61
        L60:
            r1 = r4
        L61:
            if (r1 == 0) goto L80
            boolean r7 = r12.hasNestedScrollingParent(r5)
            if (r7 != 0) goto L80
            android.widget.OverScroller r7 = r0.mScroller
            r8 = 0
            r9 = 0
            r10 = 0
            int r11 = r12.getScrollRange()
            r13 = r7
            r14 = r3
            r15 = r6
            r16 = r8
            r17 = r9
            r18 = r10
            r19 = r11
            r13.springBack(r14, r15, r16, r17, r18, r19)
        L80:
            r12.onOverScrolled(r3, r6, r2, r1)
            if (r2 != 0) goto L87
            if (r1 == 0) goto L88
        L87:
            r4 = r5
        L88:
            return r4
    }

    public boolean pageScroll(int r5) {
            r4 = this;
            r0 = 130(0x82, float:1.82E-43)
            r1 = 1
            r2 = 0
            if (r5 != r0) goto L8
            r0 = r1
            goto L9
        L8:
            r0 = r2
        L9:
            int r3 = r4.getHeight()
            if (r0 == 0) goto L42
            android.graphics.Rect r0 = r4.mTempRect
            int r2 = r4.getScrollY()
            int r2 = r2 + r3
            r0.top = r2
            int r0 = r4.getChildCount()
            if (r0 <= 0) goto L55
            int r0 = r0 - r1
            android.view.View r0 = r4.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r0 = r0.getBottom()
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r1 = r4.getPaddingBottom()
            int r0 = r0 + r1
            android.graphics.Rect r1 = r4.mTempRect
            int r1 = r1.top
            int r1 = r1 + r3
            if (r1 <= r0) goto L55
            android.graphics.Rect r1 = r4.mTempRect
            int r0 = r0 - r3
            r1.top = r0
            goto L55
        L42:
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r4.getScrollY()
            int r1 = r1 - r3
            r0.top = r1
            android.graphics.Rect r0 = r4.mTempRect
            int r0 = r0.top
            if (r0 >= 0) goto L55
            android.graphics.Rect r0 = r4.mTempRect
            r0.top = r2
        L55:
            android.graphics.Rect r0 = r4.mTempRect
            int r1 = r0.top
            int r1 = r1 + r3
            r0.bottom = r1
            android.graphics.Rect r0 = r4.mTempRect
            int r0 = r0.top
            android.graphics.Rect r1 = r4.mTempRect
            int r1 = r1.bottom
            boolean r5 = r4.scrollAndFocus(r5, r0, r1)
            return r5
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(android.view.View r2, android.view.View r3) {
            r1 = this;
            boolean r0 = r1.mIsLayoutDirty
            if (r0 != 0) goto L8
            r1.scrollToChild(r3)
            goto La
        L8:
            r1.mChildToScrollTo = r3
        La:
            super.requestChildFocus(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(android.view.View r3, android.graphics.Rect r4, boolean r5) {
            r2 = this;
            int r0 = r3.getLeft()
            int r1 = r3.getScrollX()
            int r0 = r0 - r1
            int r1 = r3.getTop()
            int r3 = r3.getScrollY()
            int r1 = r1 - r3
            r4.offset(r0, r1)
            boolean r3 = r2.scrollToChildRect(r4, r5)
            return r3
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L5
            r0.recycleVelocityTracker()
        L5:
            super.requestDisallowInterceptTouchEvent(r1)
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            r0 = 1
            r1.mIsLayoutDirty = r0
            super.requestLayout()
            return
    }

    @Override // android.view.View
    public void scrollTo(int r7, int r8) {
            r6 = this;
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L58
            r0 = 0
            android.view.View r0 = r6.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r1 = (android.widget.FrameLayout.LayoutParams) r1
            int r2 = r6.getWidth()
            int r3 = r6.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r6.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r0.getWidth()
            int r4 = r1.leftMargin
            int r3 = r3 + r4
            int r4 = r1.rightMargin
            int r3 = r3 + r4
            int r4 = r6.getHeight()
            int r5 = r6.getPaddingTop()
            int r4 = r4 - r5
            int r5 = r6.getPaddingBottom()
            int r4 = r4 - r5
            int r0 = r0.getHeight()
            int r5 = r1.topMargin
            int r0 = r0 + r5
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
            int r7 = clamp(r7, r2, r3)
            int r8 = clamp(r8, r4, r0)
            int r0 = r6.getScrollX()
            if (r7 != r0) goto L55
            int r0 = r6.getScrollY()
            if (r8 == r0) goto L58
        L55:
            super.scrollTo(r7, r8)
        L58:
            return
    }

    public void setFillViewport(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFillViewport
            if (r2 == r0) goto L9
            r1.mFillViewport = r2
            r1.requestLayout()
        L9:
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.setNestedScrollingEnabled(r2)
            return
    }

    public void setOnScrollChangeListener(androidx.core.widget.NestedScrollView.OnScrollChangeListener r1) {
            r0 = this;
            r0.mOnScrollChangeListener = r1
            return
    }

    public void setSmoothScrollingEnabled(boolean r1) {
            r0 = this;
            r0.mSmoothScrollingEnabled = r1
            return
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
            r1 = this;
            r0 = 1
            return r0
    }

    public final void smoothScrollBy(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollBy(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollBy(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollBy(r2, r3, r4, r0)
            return
    }

    public final void smoothScrollTo(int r3, int r4) {
            r2 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1 = 0
            r2.smoothScrollTo(r3, r4, r0, r1)
            return
    }

    public final void smoothScrollTo(int r2, int r3, int r4) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r4, r0)
            return
    }

    void smoothScrollTo(int r2, int r3, int r4, boolean r5) {
            r1 = this;
            int r0 = r1.getScrollX()
            int r2 = r2 - r0
            int r0 = r1.getScrollY()
            int r3 = r3 - r0
            r1.smoothScrollBy(r2, r3, r4, r5)
            return
    }

    void smoothScrollTo(int r2, int r3, boolean r4) {
            r1 = this;
            r0 = 250(0xfa, float:3.5E-43)
            r1.smoothScrollTo(r2, r3, r0, r4)
            return
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.startNestedScroll(r2, r0)
            return r2
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int r2, int r3) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            boolean r2 = r0.startNestedScroll(r2, r3)
            return r2
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
            r1 = this;
            r0 = 0
            r1.stopNestedScroll(r0)
            return
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int r2) {
            r1 = this;
            androidx.core.view.NestedScrollingChildHelper r0 = r1.mChildHelper
            r0.stopNestedScroll(r2)
            return
    }
}
