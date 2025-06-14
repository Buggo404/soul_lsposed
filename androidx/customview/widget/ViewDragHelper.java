package androidx.customview.widget;

/* loaded from: classes.dex */
public class ViewDragHelper {
    private static final int BASE_SETTLE_DURATION = 256;
    public static final int DIRECTION_ALL = 3;
    public static final int DIRECTION_HORIZONTAL = 1;
    public static final int DIRECTION_VERTICAL = 2;
    public static final int EDGE_ALL = 15;
    public static final int EDGE_BOTTOM = 8;
    public static final int EDGE_LEFT = 1;
    public static final int EDGE_RIGHT = 2;
    private static final int EDGE_SIZE = 20;
    public static final int EDGE_TOP = 4;
    public static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewDragHelper";
    private static final android.view.animation.Interpolator sInterpolator = null;
    private int mActivePointerId;
    private final androidx.customview.widget.ViewDragHelper.Callback mCallback;
    private android.view.View mCapturedView;
    private int mDragState;
    private int[] mEdgeDragsInProgress;
    private int[] mEdgeDragsLocked;
    private int mEdgeSize;
    private int[] mInitialEdgesTouched;
    private float[] mInitialMotionX;
    private float[] mInitialMotionY;
    private float[] mLastMotionX;
    private float[] mLastMotionY;
    private float mMaxVelocity;
    private float mMinVelocity;
    private final android.view.ViewGroup mParentView;
    private int mPointersDown;
    private boolean mReleaseInProgress;
    private android.widget.OverScroller mScroller;
    private final java.lang.Runnable mSetIdleRunnable;
    private int mTouchSlop;
    private int mTrackingEdges;
    private android.view.VelocityTracker mVelocityTracker;



    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public int clampViewPositionHorizontal(android.view.View r1, int r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int clampViewPositionVertical(android.view.View r1, int r2, int r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int getOrderedChildIndex(int r1) {
                r0 = this;
                return r1
        }

        public int getViewHorizontalDragRange(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public int getViewVerticalDragRange(android.view.View r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onEdgeDragStarted(int r1, int r2) {
                r0 = this;
                return
        }

        public boolean onEdgeLock(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public void onEdgeTouched(int r1, int r2) {
                r0 = this;
                return
        }

        public void onViewCaptured(android.view.View r1, int r2) {
                r0 = this;
                return
        }

        public void onViewDragStateChanged(int r1) {
                r0 = this;
                return
        }

        public void onViewPositionChanged(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                return
        }

        public void onViewReleased(android.view.View r1, float r2, float r3) {
                r0 = this;
                return
        }

        public abstract boolean tryCaptureView(android.view.View r1, int r2);
    }

    static {
            androidx.customview.widget.ViewDragHelper$1 r0 = new androidx.customview.widget.ViewDragHelper$1
            r0.<init>()
            androidx.customview.widget.ViewDragHelper.sInterpolator = r0
            return
    }

    private ViewDragHelper(android.content.Context r2, android.view.ViewGroup r3, androidx.customview.widget.ViewDragHelper.Callback r4) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.mActivePointerId = r0
            androidx.customview.widget.ViewDragHelper$2 r0 = new androidx.customview.widget.ViewDragHelper$2
            r0.<init>(r1)
            r1.mSetIdleRunnable = r0
            if (r3 == 0) goto L52
            if (r4 == 0) goto L4a
            r1.mParentView = r3
            r1.mCallback = r4
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r2)
            android.content.res.Resources r4 = r2.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            r0 = 1101004800(0x41a00000, float:20.0)
            float r4 = r4 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r4 = r4 + r0
            int r4 = (int) r4
            r1.mEdgeSize = r4
            int r4 = r3.getScaledTouchSlop()
            r1.mTouchSlop = r4
            int r4 = r3.getScaledMaximumFlingVelocity()
            float r4 = (float) r4
            r1.mMaxVelocity = r4
            int r3 = r3.getScaledMinimumFlingVelocity()
            float r3 = (float) r3
            r1.mMinVelocity = r3
            android.widget.OverScroller r3 = new android.widget.OverScroller
            android.view.animation.Interpolator r4 = androidx.customview.widget.ViewDragHelper.sInterpolator
            r3.<init>(r2, r4)
            r1.mScroller = r3
            return
        L4a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Callback may not be null"
            r2.<init>(r3)
            throw r2
        L52:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "Parent view may not be null"
            r2.<init>(r3)
            throw r2
    }

    private boolean checkNewEdgeDrag(float r4, float r5, int r6, int r7) {
            r3 = this;
            float r4 = java.lang.Math.abs(r4)
            float r5 = java.lang.Math.abs(r5)
            int[] r0 = r3.mInitialEdgesTouched
            r0 = r0[r6]
            r0 = r0 & r7
            r1 = 0
            if (r0 != r7) goto L56
            int r0 = r3.mTrackingEdges
            r0 = r0 & r7
            if (r0 == 0) goto L56
            int[] r0 = r3.mEdgeDragsLocked
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L56
            int[] r0 = r3.mEdgeDragsInProgress
            r0 = r0[r6]
            r0 = r0 & r7
            if (r0 == r7) goto L56
            int r0 = r3.mTouchSlop
            float r2 = (float) r0
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 > 0) goto L30
            float r0 = (float) r0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 > 0) goto L30
            goto L56
        L30:
            r0 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L47
            androidx.customview.widget.ViewDragHelper$Callback r5 = r3.mCallback
            boolean r5 = r5.onEdgeLock(r7)
            if (r5 == 0) goto L47
            int[] r4 = r3.mEdgeDragsLocked
            r5 = r4[r6]
            r5 = r5 | r7
            r4[r6] = r5
            return r1
        L47:
            int[] r5 = r3.mEdgeDragsInProgress
            r5 = r5[r6]
            r5 = r5 & r7
            if (r5 != 0) goto L56
            int r5 = r3.mTouchSlop
            float r5 = (float) r5
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L56
            r1 = 1
        L56:
            return r1
    }

    private boolean checkTouchSlop(android.view.View r5, float r6, float r7) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            androidx.customview.widget.ViewDragHelper$Callback r1 = r4.mCallback
            int r1 = r1.getViewHorizontalDragRange(r5)
            r2 = 1
            if (r1 <= 0) goto Lf
            r1 = r2
            goto L10
        Lf:
            r1 = r0
        L10:
            androidx.customview.widget.ViewDragHelper$Callback r3 = r4.mCallback
            int r5 = r3.getViewVerticalDragRange(r5)
            if (r5 <= 0) goto L1a
            r5 = r2
            goto L1b
        L1a:
            r5 = r0
        L1b:
            if (r1 == 0) goto L2c
            if (r5 == 0) goto L2c
            float r6 = r6 * r6
            float r7 = r7 * r7
            float r6 = r6 + r7
            int r5 = r4.mTouchSlop
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L2b
            r0 = r2
        L2b:
            return r0
        L2c:
            if (r1 == 0) goto L3b
            float r5 = java.lang.Math.abs(r6)
            int r6 = r4.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L3a
            r0 = r2
        L3a:
            return r0
        L3b:
            if (r5 == 0) goto L49
            float r5 = java.lang.Math.abs(r7)
            int r6 = r4.mTouchSlop
            float r6 = (float) r6
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L49
            r0 = r2
        L49:
            return r0
    }

    private float clampMag(float r3, float r4, float r5) {
            r2 = this;
            float r0 = java.lang.Math.abs(r3)
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 0
            if (r4 >= 0) goto La
            return r1
        La:
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L15
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 <= 0) goto L13
            goto L14
        L13:
            float r5 = -r5
        L14:
            return r5
        L15:
            return r3
    }

    private int clampMag(int r2, int r3, int r4) {
            r1 = this;
            int r0 = java.lang.Math.abs(r2)
            if (r0 >= r3) goto L8
            r2 = 0
            return r2
        L8:
            if (r0 <= r4) goto Lf
            if (r2 <= 0) goto Ld
            goto Le
        Ld:
            int r4 = -r4
        Le:
            return r4
        Lf:
            return r2
    }

    private void clearMotionHistory() {
            r2 = this;
            float[] r0 = r2.mInitialMotionX
            if (r0 != 0) goto L5
            return
        L5:
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mInitialMotionY
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mLastMotionX
            java.util.Arrays.fill(r0, r1)
            float[] r0 = r2.mLastMotionY
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mInitialEdgesTouched
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mEdgeDragsInProgress
            java.util.Arrays.fill(r0, r1)
            int[] r0 = r2.mEdgeDragsLocked
            java.util.Arrays.fill(r0, r1)
            r2.mPointersDown = r1
            return
    }

    private void clearMotionHistory(int r3) {
            r2 = this;
            float[] r0 = r2.mInitialMotionX
            if (r0 == 0) goto L32
            boolean r0 = r2.isPointerDown(r3)
            if (r0 != 0) goto Lb
            goto L32
        Lb:
            float[] r0 = r2.mInitialMotionX
            r1 = 0
            r0[r3] = r1
            float[] r0 = r2.mInitialMotionY
            r0[r3] = r1
            float[] r0 = r2.mLastMotionX
            r0[r3] = r1
            float[] r0 = r2.mLastMotionY
            r0[r3] = r1
            int[] r0 = r2.mInitialEdgesTouched
            r1 = 0
            r0[r3] = r1
            int[] r0 = r2.mEdgeDragsInProgress
            r0[r3] = r1
            int[] r0 = r2.mEdgeDragsLocked
            r0[r3] = r1
            int r0 = r2.mPointersDown
            r1 = 1
            int r3 = r1 << r3
            int r3 = ~r3
            r3 = r3 & r0
            r2.mPointersDown = r3
        L32:
            return
    }

    private int computeAxisDuration(int r4, int r5, int r6) {
            r3 = this;
            if (r4 != 0) goto L4
            r4 = 0
            return r4
        L4:
            android.view.ViewGroup r0 = r3.mParentView
            int r0 = r0.getWidth()
            int r1 = r0 / 2
            int r2 = java.lang.Math.abs(r4)
            float r2 = (float) r2
            float r0 = (float) r0
            float r2 = r2 / r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r0, r2)
            float r1 = (float) r1
            float r2 = r3.distanceInfluenceForSnapDuration(r2)
            float r2 = r2 * r1
            float r1 = r1 + r2
            int r5 = java.lang.Math.abs(r5)
            if (r5 <= 0) goto L36
            float r4 = (float) r5
            float r1 = r1 / r4
            float r4 = java.lang.Math.abs(r1)
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            int r4 = r4 * 4
            goto L42
        L36:
            int r4 = java.lang.Math.abs(r4)
            float r4 = (float) r4
            float r5 = (float) r6
            float r4 = r4 / r5
            float r4 = r4 + r0
            r5 = 1132462080(0x43800000, float:256.0)
            float r4 = r4 * r5
            int r4 = (int) r4
        L42:
            r5 = 600(0x258, float:8.41E-43)
            int r4 = java.lang.Math.min(r4, r5)
            return r4
    }

    private int computeSettleDuration(android.view.View r7, int r8, int r9, int r10, int r11) {
            r6 = this;
            float r0 = r6.mMinVelocity
            int r0 = (int) r0
            float r1 = r6.mMaxVelocity
            int r1 = (int) r1
            int r10 = r6.clampMag(r10, r0, r1)
            float r0 = r6.mMinVelocity
            int r0 = (int) r0
            float r1 = r6.mMaxVelocity
            int r1 = (int) r1
            int r11 = r6.clampMag(r11, r0, r1)
            int r0 = java.lang.Math.abs(r8)
            int r1 = java.lang.Math.abs(r9)
            int r2 = java.lang.Math.abs(r10)
            int r3 = java.lang.Math.abs(r11)
            int r4 = r2 + r3
            int r5 = r0 + r1
            if (r10 == 0) goto L2d
            float r0 = (float) r2
            float r2 = (float) r4
            goto L2f
        L2d:
            float r0 = (float) r0
            float r2 = (float) r5
        L2f:
            float r0 = r0 / r2
            if (r11 == 0) goto L35
            float r1 = (float) r3
            float r2 = (float) r4
            goto L37
        L35:
            float r1 = (float) r1
            float r2 = (float) r5
        L37:
            float r1 = r1 / r2
            androidx.customview.widget.ViewDragHelper$Callback r2 = r6.mCallback
            int r2 = r2.getViewHorizontalDragRange(r7)
            int r8 = r6.computeAxisDuration(r8, r10, r2)
            androidx.customview.widget.ViewDragHelper$Callback r10 = r6.mCallback
            int r7 = r10.getViewVerticalDragRange(r7)
            int r7 = r6.computeAxisDuration(r9, r11, r7)
            float r8 = (float) r8
            float r8 = r8 * r0
            float r7 = (float) r7
            float r7 = r7 * r1
            float r8 = r8 + r7
            int r7 = (int) r8
            return r7
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup r1, float r2, androidx.customview.widget.ViewDragHelper.Callback r3) {
            androidx.customview.widget.ViewDragHelper r1 = create(r1, r3)
            int r3 = r1.mTouchSlop
            float r3 = (float) r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 / r2
            float r3 = r3 * r0
            int r2 = (int) r3
            r1.mTouchSlop = r2
            return r1
    }

    public static androidx.customview.widget.ViewDragHelper create(android.view.ViewGroup r2, androidx.customview.widget.ViewDragHelper.Callback r3) {
            androidx.customview.widget.ViewDragHelper r0 = new androidx.customview.widget.ViewDragHelper
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r2, r3)
            return r0
    }

    private void dispatchViewReleased(float r4, float r5) {
            r3 = this;
            r0 = 1
            r3.mReleaseInProgress = r0
            androidx.customview.widget.ViewDragHelper$Callback r1 = r3.mCallback
            android.view.View r2 = r3.mCapturedView
            r1.onViewReleased(r2, r4, r5)
            r4 = 0
            r3.mReleaseInProgress = r4
            int r5 = r3.mDragState
            if (r5 != r0) goto L14
            r3.setDragState(r4)
        L14:
            return
    }

    private float distanceInfluenceForSnapDuration(float r3) {
            r2 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            float r3 = r3 - r0
            r0 = 1055999547(0x3ef1463b, float:0.47123894)
            float r3 = r3 * r0
            double r0 = (double) r3
            double r0 = java.lang.Math.sin(r0)
            float r3 = (float) r0
            return r3
    }

    private void dragTo(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.mCapturedView
            int r0 = r0.getLeft()
            android.view.View r1 = r10.mCapturedView
            int r1 = r1.getTop()
            if (r13 == 0) goto L1d
            androidx.customview.widget.ViewDragHelper$Callback r2 = r10.mCallback
            android.view.View r3 = r10.mCapturedView
            int r11 = r2.clampViewPositionHorizontal(r3, r11, r13)
            android.view.View r2 = r10.mCapturedView
            int r3 = r11 - r0
            androidx.core.view.ViewCompat.offsetLeftAndRight(r2, r3)
        L1d:
            r6 = r11
            if (r14 == 0) goto L2f
            androidx.customview.widget.ViewDragHelper$Callback r11 = r10.mCallback
            android.view.View r2 = r10.mCapturedView
            int r12 = r11.clampViewPositionVertical(r2, r12, r14)
            android.view.View r11 = r10.mCapturedView
            int r2 = r12 - r1
            androidx.core.view.ViewCompat.offsetTopAndBottom(r11, r2)
        L2f:
            r7 = r12
            if (r13 != 0) goto L34
            if (r14 == 0) goto L3f
        L34:
            int r8 = r6 - r0
            int r9 = r7 - r1
            androidx.customview.widget.ViewDragHelper$Callback r4 = r10.mCallback
            android.view.View r5 = r10.mCapturedView
            r4.onViewPositionChanged(r5, r6, r7, r8, r9)
        L3f:
            return
    }

    private void ensureMotionHistorySizeForId(int r10) {
            r9 = this;
            float[] r0 = r9.mInitialMotionX
            if (r0 == 0) goto L7
            int r1 = r0.length
            if (r1 > r10) goto L50
        L7:
            int r10 = r10 + 1
            float[] r1 = new float[r10]
            float[] r2 = new float[r10]
            float[] r3 = new float[r10]
            float[] r4 = new float[r10]
            int[] r5 = new int[r10]
            int[] r6 = new int[r10]
            int[] r10 = new int[r10]
            if (r0 == 0) goto L42
            int r7 = r0.length
            r8 = 0
            java.lang.System.arraycopy(r0, r8, r1, r8, r7)
            float[] r0 = r9.mInitialMotionY
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r2, r8, r7)
            float[] r0 = r9.mLastMotionX
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r3, r8, r7)
            float[] r0 = r9.mLastMotionY
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r4, r8, r7)
            int[] r0 = r9.mInitialEdgesTouched
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r5, r8, r7)
            int[] r0 = r9.mEdgeDragsInProgress
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r6, r8, r7)
            int[] r0 = r9.mEdgeDragsLocked
            int r7 = r0.length
            java.lang.System.arraycopy(r0, r8, r10, r8, r7)
        L42:
            r9.mInitialMotionX = r1
            r9.mInitialMotionY = r2
            r9.mLastMotionX = r3
            r9.mLastMotionY = r4
            r9.mInitialEdgesTouched = r5
            r9.mEdgeDragsInProgress = r6
            r9.mEdgeDragsLocked = r10
        L50:
            return
    }

    private boolean forceSettleCapturedViewAt(int r11, int r12, int r13, int r14) {
            r10 = this;
            android.view.View r0 = r10.mCapturedView
            int r2 = r0.getLeft()
            android.view.View r0 = r10.mCapturedView
            int r3 = r0.getTop()
            int r11 = r11 - r2
            int r12 = r12 - r3
            if (r11 != 0) goto L1c
            if (r12 != 0) goto L1c
            android.widget.OverScroller r11 = r10.mScroller
            r11.abortAnimation()
            r11 = 0
            r10.setDragState(r11)
            return r11
        L1c:
            android.view.View r5 = r10.mCapturedView
            r4 = r10
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            int r6 = r4.computeSettleDuration(r5, r6, r7, r8, r9)
            android.widget.OverScroller r1 = r10.mScroller
            r4 = r11
            r5 = r12
            r1.startScroll(r2, r3, r4, r5, r6)
            r11 = 2
            r10.setDragState(r11)
            r11 = 1
            return r11
    }

    private int getEdgesTouched(int r4, int r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.mParentView
            int r0 = r0.getLeft()
            int r1 = r3.mEdgeSize
            int r0 = r0 + r1
            if (r4 >= r0) goto Ld
            r0 = 1
            goto Le
        Ld:
            r0 = 0
        Le:
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getTop()
            int r2 = r3.mEdgeSize
            int r1 = r1 + r2
            if (r5 >= r1) goto L1b
            r0 = r0 | 4
        L1b:
            android.view.ViewGroup r1 = r3.mParentView
            int r1 = r1.getRight()
            int r2 = r3.mEdgeSize
            int r1 = r1 - r2
            if (r4 <= r1) goto L28
            r0 = r0 | 2
        L28:
            android.view.ViewGroup r4 = r3.mParentView
            int r4 = r4.getBottom()
            int r1 = r3.mEdgeSize
            int r4 = r4 - r1
            if (r5 <= r4) goto L35
            r0 = r0 | 8
        L35:
            return r0
    }

    private boolean isValidPointerForActionMove(int r3) {
            r2 = this;
            boolean r0 = r2.isPointerDown(r3)
            if (r0 != 0) goto L22
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Ignoring pointerId="
            r0.<init>(r1)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r0 = " because ACTION_DOWN was not received for this pointer before ACTION_MOVE. It likely happened because  ViewDragHelper did not receive all the events in the event stream."
            java.lang.StringBuilder r3 = r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.String r0 = "ViewDragHelper"
            android.util.Log.e(r0, r3)
            r3 = 0
            return r3
        L22:
            r3 = 1
            return r3
    }

    private void releaseViewForPointerUp() {
            r4 = this;
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r4.mMaxVelocity
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r4.mVelocityTracker
            int r1 = r4.mActivePointerId
            float r0 = r0.getXVelocity(r1)
            float r1 = r4.mMinVelocity
            float r2 = r4.mMaxVelocity
            float r0 = r4.clampMag(r0, r1, r2)
            android.view.VelocityTracker r1 = r4.mVelocityTracker
            int r2 = r4.mActivePointerId
            float r1 = r1.getYVelocity(r2)
            float r2 = r4.mMinVelocity
            float r3 = r4.mMaxVelocity
            float r1 = r4.clampMag(r1, r2, r3)
            r4.dispatchViewReleased(r0, r1)
            return
    }

    private void reportNewEdgeDrags(float r3, float r4, int r5) {
            r2 = this;
            r0 = 1
            boolean r0 = r2.checkNewEdgeDrag(r3, r4, r5, r0)
            r1 = 4
            boolean r1 = r2.checkNewEdgeDrag(r4, r3, r5, r1)
            if (r1 == 0) goto Le
            r0 = r0 | 4
        Le:
            r1 = 2
            boolean r1 = r2.checkNewEdgeDrag(r3, r4, r5, r1)
            if (r1 == 0) goto L17
            r0 = r0 | 2
        L17:
            r1 = 8
            boolean r3 = r2.checkNewEdgeDrag(r4, r3, r5, r1)
            if (r3 == 0) goto L21
            r0 = r0 | 8
        L21:
            if (r0 == 0) goto L2f
            int[] r3 = r2.mEdgeDragsInProgress
            r4 = r3[r5]
            r4 = r4 | r0
            r3[r5] = r4
            androidx.customview.widget.ViewDragHelper$Callback r3 = r2.mCallback
            r3.onEdgeDragStarted(r0, r5)
        L2f:
            return
    }

    private void saveInitialMotion(float r3, float r4, int r5) {
            r2 = this;
            r2.ensureMotionHistorySizeForId(r5)
            float[] r0 = r2.mInitialMotionX
            float[] r1 = r2.mLastMotionX
            r1[r5] = r3
            r0[r5] = r3
            float[] r0 = r2.mInitialMotionY
            float[] r1 = r2.mLastMotionY
            r1[r5] = r4
            r0[r5] = r4
            int[] r0 = r2.mInitialEdgesTouched
            int r3 = (int) r3
            int r4 = (int) r4
            int r3 = r2.getEdgesTouched(r3, r4)
            r0[r5] = r3
            int r3 = r2.mPointersDown
            r4 = 1
            int r4 = r4 << r5
            r3 = r3 | r4
            r2.mPointersDown = r3
            return
    }

    private void saveLastMotion(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getPointerCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L25
            int r2 = r7.getPointerId(r1)
            boolean r3 = r6.isValidPointerForActionMove(r2)
            if (r3 != 0) goto L12
            goto L22
        L12:
            float r3 = r7.getX(r1)
            float r4 = r7.getY(r1)
            float[] r5 = r6.mLastMotionX
            r5[r2] = r3
            float[] r3 = r6.mLastMotionY
            r3[r2] = r4
        L22:
            int r1 = r1 + 1
            goto L5
        L25:
            return
    }

    public void abort() {
            r9 = this;
            r9.cancel()
            int r0 = r9.mDragState
            r1 = 2
            if (r0 != r1) goto L30
            android.widget.OverScroller r0 = r9.mScroller
            int r0 = r0.getCurrX()
            android.widget.OverScroller r1 = r9.mScroller
            int r1 = r1.getCurrY()
            android.widget.OverScroller r2 = r9.mScroller
            r2.abortAnimation()
            android.widget.OverScroller r2 = r9.mScroller
            int r5 = r2.getCurrX()
            android.widget.OverScroller r2 = r9.mScroller
            int r6 = r2.getCurrY()
            androidx.customview.widget.ViewDragHelper$Callback r3 = r9.mCallback
            android.view.View r4 = r9.mCapturedView
            int r7 = r5 - r0
            int r8 = r6 - r1
            r3.onViewPositionChanged(r4, r5, r6, r7, r8)
        L30:
            r0 = 0
            r9.setDragState(r0)
            return
    }

    protected boolean canScroll(android.view.View r14, boolean r15, int r16, int r17, int r18, int r19) {
            r13 = this;
            r0 = r14
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 1
            if (r1 == 0) goto L55
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = r14.getScrollX()
            int r4 = r14.getScrollY()
            int r5 = r1.getChildCount()
            int r5 = r5 - r2
        L16:
            if (r5 < 0) goto L55
            android.view.View r7 = r1.getChildAt(r5)
            int r6 = r18 + r3
            int r8 = r7.getLeft()
            if (r6 < r8) goto L52
            int r8 = r7.getRight()
            if (r6 >= r8) goto L52
            int r8 = r19 + r4
            int r9 = r7.getTop()
            if (r8 < r9) goto L52
            int r9 = r7.getBottom()
            if (r8 >= r9) goto L52
            r9 = 1
            int r10 = r7.getLeft()
            int r11 = r6 - r10
            int r6 = r7.getTop()
            int r12 = r8 - r6
            r6 = r13
            r8 = r9
            r9 = r16
            r10 = r17
            boolean r6 = r6.canScroll(r7, r8, r9, r10, r11, r12)
            if (r6 == 0) goto L52
            return r2
        L52:
            int r5 = r5 + (-1)
            goto L16
        L55:
            if (r15 == 0) goto L6a
            r1 = r16
            int r1 = -r1
            boolean r1 = r14.canScrollHorizontally(r1)
            if (r1 != 0) goto L6b
            r1 = r17
            int r1 = -r1
            boolean r0 = r14.canScrollVertically(r1)
            if (r0 == 0) goto L6a
            goto L6b
        L6a:
            r2 = 0
        L6b:
            return r2
    }

    public void cancel() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r1.clearMotionHistory()
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L10
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        L10:
            return
    }

    public void captureChildView(android.view.View r3, int r4) {
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
            android.view.ViewGroup r1 = r2.mParentView
            if (r0 != r1) goto L16
            r2.mCapturedView = r3
            r2.mActivePointerId = r4
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.mCallback
            r0.onViewCaptured(r3, r4)
            r3 = 1
            r2.setDragState(r3)
            return
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view ("
            r4.<init>(r0)
            android.view.ViewGroup r0 = r2.mParentView
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r0 = ")"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public boolean checkTouchSlop(int r5) {
            r4 = this;
            float[] r0 = r4.mInitialMotionX
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L12
            boolean r3 = r4.checkTouchSlop(r5, r2)
            if (r3 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            int r2 = r2 + 1
            goto L5
        L12:
            return r1
    }

    public boolean checkTouchSlop(int r7, int r8) {
            r6 = this;
            boolean r0 = r6.isPointerDown(r8)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r0 = r7 & 1
            r2 = 1
            if (r0 != r2) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r1
        L10:
            r3 = 2
            r7 = r7 & r3
            if (r7 != r3) goto L16
            r7 = r2
            goto L17
        L16:
            r7 = r1
        L17:
            float[] r3 = r6.mLastMotionX
            r3 = r3[r8]
            float[] r4 = r6.mInitialMotionX
            r4 = r4[r8]
            float r3 = r3 - r4
            float[] r4 = r6.mLastMotionY
            r4 = r4[r8]
            float[] r5 = r6.mInitialMotionY
            r8 = r5[r8]
            float r4 = r4 - r8
            if (r0 == 0) goto L3a
            if (r7 == 0) goto L3a
            float r3 = r3 * r3
            float r4 = r4 * r4
            float r3 = r3 + r4
            int r7 = r6.mTouchSlop
            int r7 = r7 * r7
            float r7 = (float) r7
            int r7 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r7 <= 0) goto L39
            r1 = r2
        L39:
            return r1
        L3a:
            if (r0 == 0) goto L49
            float r7 = java.lang.Math.abs(r3)
            int r8 = r6.mTouchSlop
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L48
            r1 = r2
        L48:
            return r1
        L49:
            if (r7 == 0) goto L57
            float r7 = java.lang.Math.abs(r4)
            int r8 = r6.mTouchSlop
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L57
            r1 = r2
        L57:
            return r1
    }

    public boolean continueSettling(boolean r12) {
            r11 = this;
            int r0 = r11.mDragState
            r1 = 0
            r2 = 2
            if (r0 != r2) goto L6a
            android.widget.OverScroller r0 = r11.mScroller
            boolean r0 = r0.computeScrollOffset()
            android.widget.OverScroller r3 = r11.mScroller
            int r3 = r3.getCurrX()
            android.widget.OverScroller r4 = r11.mScroller
            int r10 = r4.getCurrY()
            android.view.View r4 = r11.mCapturedView
            int r4 = r4.getLeft()
            int r8 = r3 - r4
            android.view.View r4 = r11.mCapturedView
            int r4 = r4.getTop()
            int r9 = r10 - r4
            if (r8 == 0) goto L2f
            android.view.View r4 = r11.mCapturedView
            androidx.core.view.ViewCompat.offsetLeftAndRight(r4, r8)
        L2f:
            if (r9 == 0) goto L36
            android.view.View r4 = r11.mCapturedView
            androidx.core.view.ViewCompat.offsetTopAndBottom(r4, r9)
        L36:
            if (r8 != 0) goto L3a
            if (r9 == 0) goto L43
        L3a:
            androidx.customview.widget.ViewDragHelper$Callback r4 = r11.mCallback
            android.view.View r5 = r11.mCapturedView
            r6 = r3
            r7 = r10
            r4.onViewPositionChanged(r5, r6, r7, r8, r9)
        L43:
            if (r0 == 0) goto L5b
            android.widget.OverScroller r4 = r11.mScroller
            int r4 = r4.getFinalX()
            if (r3 != r4) goto L5b
            android.widget.OverScroller r3 = r11.mScroller
            int r3 = r3.getFinalY()
            if (r10 != r3) goto L5b
            android.widget.OverScroller r0 = r11.mScroller
            r0.abortAnimation()
            r0 = r1
        L5b:
            if (r0 != 0) goto L6a
            if (r12 == 0) goto L67
            android.view.ViewGroup r12 = r11.mParentView
            java.lang.Runnable r0 = r11.mSetIdleRunnable
            r12.post(r0)
            goto L6a
        L67:
            r11.setDragState(r1)
        L6a:
            int r12 = r11.mDragState
            if (r12 != r2) goto L6f
            r1 = 1
        L6f:
            return r1
    }

    public android.view.View findTopChildUnder(int r4, int r5) {
            r3 = this;
            android.view.ViewGroup r0 = r3.mParentView
            int r0 = r0.getChildCount()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L32
            android.view.ViewGroup r1 = r3.mParentView
            androidx.customview.widget.ViewDragHelper$Callback r2 = r3.mCallback
            int r2 = r2.getOrderedChildIndex(r0)
            android.view.View r1 = r1.getChildAt(r2)
            int r2 = r1.getLeft()
            if (r4 < r2) goto L2f
            int r2 = r1.getRight()
            if (r4 >= r2) goto L2f
            int r2 = r1.getTop()
            if (r5 < r2) goto L2f
            int r2 = r1.getBottom()
            if (r5 >= r2) goto L2f
            return r1
        L2f:
            int r0 = r0 + (-1)
            goto L8
        L32:
            r4 = 0
            return r4
    }

    public void flingCapturedView(int r11, int r12, int r13, int r14) {
            r10 = this;
            boolean r0 = r10.mReleaseInProgress
            if (r0 == 0) goto L30
            android.widget.OverScroller r1 = r10.mScroller
            android.view.View r0 = r10.mCapturedView
            int r2 = r0.getLeft()
            android.view.View r0 = r10.mCapturedView
            int r3 = r0.getTop()
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r4 = r10.mActivePointerId
            float r0 = r0.getXVelocity(r4)
            int r4 = (int) r0
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            int r5 = r10.mActivePointerId
            float r0 = r0.getYVelocity(r5)
            int r5 = (int) r0
            r6 = r11
            r7 = r13
            r8 = r12
            r9 = r14
            r1.fling(r2, r3, r4, r5, r6, r7, r8, r9)
            r11 = 2
            r10.setDragState(r11)
            return
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Cannot flingCapturedView outside of a call to Callback#onViewReleased"
            r11.<init>(r12)
            throw r11
    }

    public int getActivePointerId() {
            r1 = this;
            int r0 = r1.mActivePointerId
            return r0
    }

    public android.view.View getCapturedView() {
            r1 = this;
            android.view.View r0 = r1.mCapturedView
            return r0
    }

    public int getEdgeSize() {
            r1 = this;
            int r0 = r1.mEdgeSize
            return r0
    }

    public float getMinVelocity() {
            r1 = this;
            float r0 = r1.mMinVelocity
            return r0
    }

    public int getTouchSlop() {
            r1 = this;
            int r0 = r1.mTouchSlop
            return r0
    }

    public int getViewDragState() {
            r1 = this;
            int r0 = r1.mDragState
            return r0
    }

    public boolean isCapturedViewUnder(int r2, int r3) {
            r1 = this;
            android.view.View r0 = r1.mCapturedView
            boolean r2 = r1.isViewUnder(r0, r2, r3)
            return r2
    }

    public boolean isEdgeTouched(int r5) {
            r4 = this;
            int[] r0 = r4.mInitialEdgesTouched
            int r0 = r0.length
            r1 = 0
            r2 = r1
        L5:
            if (r2 >= r0) goto L12
            boolean r3 = r4.isEdgeTouched(r5, r2)
            if (r3 == 0) goto Lf
            r5 = 1
            return r5
        Lf:
            int r2 = r2 + 1
            goto L5
        L12:
            return r1
    }

    public boolean isEdgeTouched(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isPointerDown(r3)
            if (r0 == 0) goto Lf
            int[] r0 = r1.mInitialEdgesTouched
            r3 = r0[r3]
            r2 = r2 & r3
            if (r2 == 0) goto Lf
            r2 = 1
            goto L10
        Lf:
            r2 = 0
        L10:
            return r2
    }

    public boolean isPointerDown(int r3) {
            r2 = this;
            int r0 = r2.mPointersDown
            r1 = 1
            int r3 = r1 << r3
            r3 = r3 & r0
            if (r3 == 0) goto L9
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    public boolean isViewUnder(android.view.View r3, int r4, int r5) {
            r2 = this;
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.getLeft()
            if (r4 < r1) goto L1d
            int r1 = r3.getRight()
            if (r4 >= r1) goto L1d
            int r4 = r3.getTop()
            if (r5 < r4) goto L1d
            int r3 = r3.getBottom()
            if (r5 >= r3) goto L1d
            r0 = 1
        L1d:
            return r0
    }

    public void processTouchEvent(android.view.MotionEvent r10) {
            r9 = this;
            int r0 = r10.getActionMasked()
            int r1 = r10.getActionIndex()
            if (r0 != 0) goto Ld
            r9.cancel()
        Ld:
            android.view.VelocityTracker r2 = r9.mVelocityTracker
            if (r2 != 0) goto L17
            android.view.VelocityTracker r2 = android.view.VelocityTracker.obtain()
            r9.mVelocityTracker = r2
        L17:
            android.view.VelocityTracker r2 = r9.mVelocityTracker
            r2.addMovement(r10)
            r2 = 0
            if (r0 == 0) goto L151
            r3 = 1
            if (r0 == r3) goto L146
            r4 = 2
            if (r0 == r4) goto Lbf
            r4 = 3
            if (r0 == r4) goto Lb2
            r4 = 5
            if (r0 == r4) goto L75
            r4 = 6
            if (r0 == r4) goto L30
            goto L179
        L30:
            int r0 = r10.getPointerId(r1)
            int r1 = r9.mDragState
            if (r1 != r3) goto L70
            int r1 = r9.mActivePointerId
            if (r0 != r1) goto L70
            int r1 = r10.getPointerCount()
        L40:
            r3 = -1
            if (r2 >= r1) goto L6a
            int r4 = r10.getPointerId(r2)
            int r5 = r9.mActivePointerId
            if (r4 != r5) goto L4c
            goto L67
        L4c:
            float r5 = r10.getX(r2)
            float r6 = r10.getY(r2)
            int r5 = (int) r5
            int r6 = (int) r6
            android.view.View r5 = r9.findTopChildUnder(r5, r6)
            android.view.View r6 = r9.mCapturedView
            if (r5 != r6) goto L67
            boolean r4 = r9.tryCaptureViewForDrag(r6, r4)
            if (r4 == 0) goto L67
            int r10 = r9.mActivePointerId
            goto L6b
        L67:
            int r2 = r2 + 1
            goto L40
        L6a:
            r10 = r3
        L6b:
            if (r10 != r3) goto L70
            r9.releaseViewForPointerUp()
        L70:
            r9.clearMotionHistory(r0)
            goto L179
        L75:
            int r0 = r10.getPointerId(r1)
            float r2 = r10.getX(r1)
            float r10 = r10.getY(r1)
            r9.saveInitialMotion(r2, r10, r0)
            int r1 = r9.mDragState
            if (r1 != 0) goto La3
            int r1 = (int) r2
            int r10 = (int) r10
            android.view.View r10 = r9.findTopChildUnder(r1, r10)
            r9.tryCaptureViewForDrag(r10, r0)
            int[] r10 = r9.mInitialEdgesTouched
            r10 = r10[r0]
            int r1 = r9.mTrackingEdges
            r2 = r10 & r1
            if (r2 == 0) goto L179
            androidx.customview.widget.ViewDragHelper$Callback r2 = r9.mCallback
            r10 = r10 & r1
            r2.onEdgeTouched(r10, r0)
            goto L179
        La3:
            int r1 = (int) r2
            int r10 = (int) r10
            boolean r10 = r9.isCapturedViewUnder(r1, r10)
            if (r10 == 0) goto L179
            android.view.View r10 = r9.mCapturedView
            r9.tryCaptureViewForDrag(r10, r0)
            goto L179
        Lb2:
            int r10 = r9.mDragState
            if (r10 != r3) goto Lba
            r10 = 0
            r9.dispatchViewReleased(r10, r10)
        Lba:
            r9.cancel()
            goto L179
        Lbf:
            int r0 = r9.mDragState
            if (r0 != r3) goto Lff
            int r0 = r9.mActivePointerId
            boolean r0 = r9.isValidPointerForActionMove(r0)
            if (r0 != 0) goto Lcd
            goto L179
        Lcd:
            int r0 = r9.mActivePointerId
            int r0 = r10.findPointerIndex(r0)
            float r1 = r10.getX(r0)
            float r0 = r10.getY(r0)
            float[] r2 = r9.mLastMotionX
            int r3 = r9.mActivePointerId
            r2 = r2[r3]
            float r1 = r1 - r2
            int r1 = (int) r1
            float[] r2 = r9.mLastMotionY
            r2 = r2[r3]
            float r0 = r0 - r2
            int r0 = (int) r0
            android.view.View r2 = r9.mCapturedView
            int r2 = r2.getLeft()
            int r2 = r2 + r1
            android.view.View r3 = r9.mCapturedView
            int r3 = r3.getTop()
            int r3 = r3 + r0
            r9.dragTo(r2, r3, r1, r0)
            r9.saveLastMotion(r10)
            goto L179
        Lff:
            int r0 = r10.getPointerCount()
        L103:
            if (r2 >= r0) goto L142
            int r1 = r10.getPointerId(r2)
            boolean r4 = r9.isValidPointerForActionMove(r1)
            if (r4 != 0) goto L110
            goto L13f
        L110:
            float r4 = r10.getX(r2)
            float r5 = r10.getY(r2)
            float[] r6 = r9.mInitialMotionX
            r6 = r6[r1]
            float r6 = r4 - r6
            float[] r7 = r9.mInitialMotionY
            r7 = r7[r1]
            float r7 = r5 - r7
            r9.reportNewEdgeDrags(r6, r7, r1)
            int r8 = r9.mDragState
            if (r8 != r3) goto L12c
            goto L142
        L12c:
            int r4 = (int) r4
            int r5 = (int) r5
            android.view.View r4 = r9.findTopChildUnder(r4, r5)
            boolean r5 = r9.checkTouchSlop(r4, r6, r7)
            if (r5 == 0) goto L13f
            boolean r1 = r9.tryCaptureViewForDrag(r4, r1)
            if (r1 == 0) goto L13f
            goto L142
        L13f:
            int r2 = r2 + 1
            goto L103
        L142:
            r9.saveLastMotion(r10)
            goto L179
        L146:
            int r10 = r9.mDragState
            if (r10 != r3) goto L14d
            r9.releaseViewForPointerUp()
        L14d:
            r9.cancel()
            goto L179
        L151:
            float r0 = r10.getX()
            float r1 = r10.getY()
            int r10 = r10.getPointerId(r2)
            int r2 = (int) r0
            int r3 = (int) r1
            android.view.View r2 = r9.findTopChildUnder(r2, r3)
            r9.saveInitialMotion(r0, r1, r10)
            r9.tryCaptureViewForDrag(r2, r10)
            int[] r0 = r9.mInitialEdgesTouched
            r0 = r0[r10]
            int r1 = r9.mTrackingEdges
            r2 = r0 & r1
            if (r2 == 0) goto L179
            androidx.customview.widget.ViewDragHelper$Callback r2 = r9.mCallback
            r0 = r0 & r1
            r2.onEdgeTouched(r0, r10)
        L179:
            return
    }

    void setDragState(int r3) {
            r2 = this;
            android.view.ViewGroup r0 = r2.mParentView
            java.lang.Runnable r1 = r2.mSetIdleRunnable
            r0.removeCallbacks(r1)
            int r0 = r2.mDragState
            if (r0 == r3) goto L19
            r2.mDragState = r3
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.mCallback
            r0.onViewDragStateChanged(r3)
            int r3 = r2.mDragState
            if (r3 != 0) goto L19
            r3 = 0
            r2.mCapturedView = r3
        L19:
            return
    }

    public void setEdgeTrackingEnabled(int r1) {
            r0 = this;
            r0.mTrackingEdges = r1
            return
    }

    public void setMinVelocity(float r1) {
            r0 = this;
            r0.mMinVelocity = r1
            return
    }

    public boolean settleCapturedViewAt(int r4, int r5) {
            r3 = this;
            boolean r0 = r3.mReleaseInProgress
            if (r0 == 0) goto L1b
            android.view.VelocityTracker r0 = r3.mVelocityTracker
            int r1 = r3.mActivePointerId
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            android.view.VelocityTracker r1 = r3.mVelocityTracker
            int r2 = r3.mActivePointerId
            float r1 = r1.getYVelocity(r2)
            int r1 = (int) r1
            boolean r4 = r3.forceSettleCapturedViewAt(r4, r5, r0, r1)
            return r4
        L1b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
            r4.<init>(r5)
            throw r4
    }

    public boolean shouldInterceptTouchEvent(android.view.MotionEvent r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getActionMasked()
            int r3 = r17.getActionIndex()
            if (r2 != 0) goto L11
            r16.cancel()
        L11:
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            if (r4 != 0) goto L1b
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r0.mVelocityTracker = r4
        L1b:
            android.view.VelocityTracker r4 = r0.mVelocityTracker
            r4.addMovement(r1)
            r4 = 2
            r6 = 1
            if (r2 == 0) goto L104
            if (r2 == r6) goto Lff
            if (r2 == r4) goto L70
            r7 = 3
            if (r2 == r7) goto Lff
            r7 = 5
            if (r2 == r7) goto L3c
            r4 = 6
            if (r2 == r4) goto L34
        L31:
            r5 = 0
            goto L135
        L34:
            int r1 = r1.getPointerId(r3)
            r0.clearMotionHistory(r1)
            goto L31
        L3c:
            int r2 = r1.getPointerId(r3)
            float r7 = r1.getX(r3)
            float r1 = r1.getY(r3)
            r0.saveInitialMotion(r7, r1, r2)
            int r3 = r0.mDragState
            if (r3 != 0) goto L60
            int[] r1 = r0.mInitialEdgesTouched
            r1 = r1[r2]
            int r3 = r0.mTrackingEdges
            r4 = r1 & r3
            if (r4 == 0) goto L31
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.mCallback
            r1 = r1 & r3
            r4.onEdgeTouched(r1, r2)
            goto L31
        L60:
            if (r3 != r4) goto L31
            int r3 = (int) r7
            int r1 = (int) r1
            android.view.View r1 = r0.findTopChildUnder(r3, r1)
            android.view.View r3 = r0.mCapturedView
            if (r1 != r3) goto L31
            r0.tryCaptureViewForDrag(r1, r2)
            goto L31
        L70:
            float[] r2 = r0.mInitialMotionX
            if (r2 == 0) goto L31
            float[] r2 = r0.mInitialMotionY
            if (r2 != 0) goto L79
            goto L31
        L79:
            int r2 = r17.getPointerCount()
            r3 = 0
        L7e:
            if (r3 >= r2) goto Lfa
            int r4 = r1.getPointerId(r3)
            boolean r7 = r0.isValidPointerForActionMove(r4)
            if (r7 != 0) goto L8c
            goto Lf7
        L8c:
            float r7 = r1.getX(r3)
            float r8 = r1.getY(r3)
            float[] r9 = r0.mInitialMotionX
            r9 = r9[r4]
            float r9 = r7 - r9
            float[] r10 = r0.mInitialMotionY
            r10 = r10[r4]
            float r10 = r8 - r10
            int r7 = (int) r7
            int r8 = (int) r8
            android.view.View r7 = r0.findTopChildUnder(r7, r8)
            if (r7 == 0) goto Lb0
            boolean r8 = r0.checkTouchSlop(r7, r9, r10)
            if (r8 == 0) goto Lb0
            r8 = r6
            goto Lb1
        Lb0:
            r8 = 0
        Lb1:
            if (r8 == 0) goto Le6
            int r11 = r7.getLeft()
            int r12 = (int) r9
            int r13 = r11 + r12
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.mCallback
            int r12 = r14.clampViewPositionHorizontal(r7, r13, r12)
            int r13 = r7.getTop()
            int r14 = (int) r10
            int r15 = r13 + r14
            androidx.customview.widget.ViewDragHelper$Callback r5 = r0.mCallback
            int r5 = r5.clampViewPositionVertical(r7, r15, r14)
            androidx.customview.widget.ViewDragHelper$Callback r14 = r0.mCallback
            int r14 = r14.getViewHorizontalDragRange(r7)
            androidx.customview.widget.ViewDragHelper$Callback r15 = r0.mCallback
            int r15 = r15.getViewVerticalDragRange(r7)
            if (r14 == 0) goto Ldf
            if (r14 <= 0) goto Le6
            if (r12 != r11) goto Le6
        Ldf:
            if (r15 == 0) goto Lfa
            if (r15 <= 0) goto Le6
            if (r5 != r13) goto Le6
            goto Lfa
        Le6:
            r0.reportNewEdgeDrags(r9, r10, r4)
            int r5 = r0.mDragState
            if (r5 != r6) goto Lee
            goto Lfa
        Lee:
            if (r8 == 0) goto Lf7
            boolean r4 = r0.tryCaptureViewForDrag(r7, r4)
            if (r4 == 0) goto Lf7
            goto Lfa
        Lf7:
            int r3 = r3 + 1
            goto L7e
        Lfa:
            r16.saveLastMotion(r17)
            goto L31
        Lff:
            r16.cancel()
            goto L31
        L104:
            float r2 = r17.getX()
            float r3 = r17.getY()
            r5 = 0
            int r1 = r1.getPointerId(r5)
            r0.saveInitialMotion(r2, r3, r1)
            int r2 = (int) r2
            int r3 = (int) r3
            android.view.View r2 = r0.findTopChildUnder(r2, r3)
            android.view.View r3 = r0.mCapturedView
            if (r2 != r3) goto L125
            int r3 = r0.mDragState
            if (r3 != r4) goto L125
            r0.tryCaptureViewForDrag(r2, r1)
        L125:
            int[] r2 = r0.mInitialEdgesTouched
            r2 = r2[r1]
            int r3 = r0.mTrackingEdges
            r4 = r2 & r3
            if (r4 == 0) goto L135
            androidx.customview.widget.ViewDragHelper$Callback r4 = r0.mCallback
            r2 = r2 & r3
            r4.onEdgeTouched(r2, r1)
        L135:
            int r1 = r0.mDragState
            if (r1 != r6) goto L13a
            r5 = r6
        L13a:
            return r5
    }

    public boolean smoothSlideViewTo(android.view.View r1, int r2, int r3) {
            r0 = this;
            r0.mCapturedView = r1
            r1 = -1
            r0.mActivePointerId = r1
            r1 = 0
            boolean r1 = r0.forceSettleCapturedViewAt(r2, r3, r1, r1)
            if (r1 != 0) goto L17
            int r2 = r0.mDragState
            if (r2 != 0) goto L17
            android.view.View r2 = r0.mCapturedView
            if (r2 == 0) goto L17
            r2 = 0
            r0.mCapturedView = r2
        L17:
            return r1
    }

    boolean tryCaptureViewForDrag(android.view.View r3, int r4) {
            r2 = this;
            android.view.View r0 = r2.mCapturedView
            r1 = 1
            if (r3 != r0) goto La
            int r0 = r2.mActivePointerId
            if (r0 != r4) goto La
            return r1
        La:
            if (r3 == 0) goto L1a
            androidx.customview.widget.ViewDragHelper$Callback r0 = r2.mCallback
            boolean r0 = r0.tryCaptureView(r3, r4)
            if (r0 == 0) goto L1a
            r2.mActivePointerId = r4
            r2.captureChildView(r3, r4)
            return r1
        L1a:
            r3 = 0
            return r3
    }
}
