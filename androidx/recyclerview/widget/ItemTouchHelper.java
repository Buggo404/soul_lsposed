package androidx.recyclerview.widget;

/* loaded from: classes.dex */
public class ItemTouchHelper extends androidx.recyclerview.widget.RecyclerView.ItemDecoration implements androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {
    static final int ACTION_MODE_DRAG_MASK = 16711680;
    private static final int ACTION_MODE_IDLE_MASK = 255;
    static final int ACTION_MODE_SWIPE_MASK = 65280;
    public static final int ACTION_STATE_DRAG = 2;
    public static final int ACTION_STATE_IDLE = 0;
    public static final int ACTION_STATE_SWIPE = 1;
    private static final int ACTIVE_POINTER_ID_NONE = -1;
    public static final int ANIMATION_TYPE_DRAG = 8;
    public static final int ANIMATION_TYPE_SWIPE_CANCEL = 4;
    public static final int ANIMATION_TYPE_SWIPE_SUCCESS = 2;
    private static final boolean DEBUG = false;
    static final int DIRECTION_FLAG_COUNT = 8;
    public static final int DOWN = 2;
    public static final int END = 32;
    public static final int LEFT = 4;
    private static final int PIXELS_PER_SECOND = 1000;
    public static final int RIGHT = 8;
    public static final int START = 16;
    private static final java.lang.String TAG = "ItemTouchHelper";

    /* renamed from: UP */
    public static final int f80UP = 1;
    private int mActionState;
    int mActivePointerId;
    androidx.recyclerview.widget.ItemTouchHelper.Callback mCallback;
    private androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback mChildDrawingOrderCallback;
    private java.util.List<java.lang.Integer> mDistances;
    private long mDragScrollStartTimeInMs;
    float mDx;
    float mDy;
    androidx.core.view.GestureDetectorCompat mGestureDetector;
    float mInitialTouchX;
    float mInitialTouchY;
    private androidx.recyclerview.widget.ItemTouchHelper.ItemTouchHelperGestureListener mItemTouchHelperGestureListener;
    private float mMaxSwipeVelocity;
    private final androidx.recyclerview.widget.RecyclerView.OnItemTouchListener mOnItemTouchListener;
    android.view.View mOverdrawChild;
    int mOverdrawChildPosition;
    final java.util.List<android.view.View> mPendingCleanup;
    java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> mRecoverAnimations;
    androidx.recyclerview.widget.RecyclerView mRecyclerView;
    final java.lang.Runnable mScrollRunnable;
    androidx.recyclerview.widget.RecyclerView.ViewHolder mSelected;
    int mSelectedFlags;
    private float mSelectedStartX;
    private float mSelectedStartY;
    private int mSlop;
    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> mSwapTargets;
    private float mSwipeEscapeVelocity;
    private final float[] mTmpPosition;
    private android.graphics.Rect mTmpRect;
    android.view.VelocityTracker mVelocityTracker;





    /* renamed from: androidx.recyclerview.widget.ItemTouchHelper$5 */
    class C03735 implements androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback {
        final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper this$0;

        C03735(androidx.recyclerview.widget.ItemTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ChildDrawingOrderCallback
        public int onGetChildDrawingOrder(int r3, int r4) {
                r2 = this;
                androidx.recyclerview.widget.ItemTouchHelper r0 = r2.this$0
                android.view.View r0 = r0.mOverdrawChild
                if (r0 != 0) goto L7
                return r4
            L7:
                androidx.recyclerview.widget.ItemTouchHelper r0 = r2.this$0
                int r0 = r0.mOverdrawChildPosition
                r1 = -1
                if (r0 != r1) goto L1e
                androidx.recyclerview.widget.ItemTouchHelper r0 = r2.this$0
                androidx.recyclerview.widget.RecyclerView r0 = r0.mRecyclerView
                androidx.recyclerview.widget.ItemTouchHelper r1 = r2.this$0
                android.view.View r1 = r1.mOverdrawChild
                int r0 = r0.indexOfChild(r1)
                androidx.recyclerview.widget.ItemTouchHelper r1 = r2.this$0
                r1.mOverdrawChildPosition = r0
            L1e:
                int r3 = r3 + (-1)
                if (r4 != r3) goto L23
                return r0
            L23:
                if (r4 >= r0) goto L26
                goto L28
            L26:
                int r4 = r4 + 1
            L28:
                return r4
        }
    }

    public static abstract class Callback {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final android.view.animation.Interpolator sDragScrollInterpolator = null;
        private static final android.view.animation.Interpolator sDragViewScrollCapInterpolator = null;
        private int mCachedMaxScrollSpeed;



        static {
                androidx.recyclerview.widget.ItemTouchHelper$Callback$1 r0 = new androidx.recyclerview.widget.ItemTouchHelper$Callback$1
                r0.<init>()
                androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragScrollInterpolator = r0
                androidx.recyclerview.widget.ItemTouchHelper$Callback$2 r0 = new androidx.recyclerview.widget.ItemTouchHelper$Callback$2
                r0.<init>()
                androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragViewScrollCapInterpolator = r0
                return
        }

        public Callback() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.mCachedMaxScrollSpeed = r0
                return
        }

        public static int convertToRelativeDirection(int r3, int r4) {
                r0 = 789516(0xc0c0c, float:1.106348E-39)
                r1 = r3 & r0
                if (r1 != 0) goto L8
                return r3
            L8:
                int r2 = ~r1
                r3 = r3 & r2
                if (r4 != 0) goto L10
                int r4 = r1 << 2
            Le:
                r3 = r3 | r4
                return r3
            L10:
                int r4 = r1 << 1
                r1 = -789517(0xfffffffffff3f3f3, float:NaN)
                r1 = r1 & r4
                r3 = r3 | r1
                r4 = r4 & r0
                int r4 = r4 << 2
                goto Le
        }

        public static androidx.recyclerview.widget.ItemTouchUIUtil getDefaultUIUtil() {
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                return r0
        }

        private int getMaxDragScroll(androidx.recyclerview.widget.RecyclerView r3) {
                r2 = this;
                int r0 = r2.mCachedMaxScrollSpeed
                r1 = -1
                if (r0 != r1) goto L11
                android.content.res.Resources r3 = r3.getResources()
                int r0 = androidx.recyclerview.C0353R.dimen.item_touch_helper_max_drag_scroll_per_frame
                int r3 = r3.getDimensionPixelSize(r0)
                r2.mCachedMaxScrollSpeed = r3
            L11:
                int r3 = r2.mCachedMaxScrollSpeed
                return r3
        }

        public static int makeFlag(int r0, int r1) {
                int r0 = r0 * 8
                int r0 = r1 << r0
                return r0
        }

        public static int makeMovementFlags(int r2, int r3) {
                r0 = 0
                r1 = r3 | r2
                int r0 = makeFlag(r0, r1)
                r1 = 1
                int r3 = makeFlag(r1, r3)
                r3 = r3 | r0
                r0 = 2
                int r2 = makeFlag(r0, r2)
                r2 = r2 | r3
                return r2
        }

        public boolean canDropOver(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r0 = this;
                r1 = 1
                return r1
        }

        public androidx.recyclerview.widget.RecyclerView.ViewHolder chooseDropTarget(androidx.recyclerview.widget.RecyclerView.ViewHolder r15, java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> r16, int r17, int r18) {
                r14 = this;
                r0 = r15
                android.view.View r1 = r0.itemView
                int r1 = r1.getWidth()
                int r1 = r17 + r1
                android.view.View r2 = r0.itemView
                int r2 = r2.getHeight()
                int r2 = r18 + r2
                android.view.View r3 = r0.itemView
                int r3 = r3.getLeft()
                int r3 = r17 - r3
                android.view.View r4 = r0.itemView
                int r4 = r4.getTop()
                int r4 = r18 - r4
                int r5 = r16.size()
                r6 = 0
                r7 = -1
                r8 = 0
            L28:
                if (r8 >= r5) goto Lbc
                r9 = r16
                java.lang.Object r10 = r9.get(r8)
                androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = (androidx.recyclerview.widget.RecyclerView.ViewHolder) r10
                if (r3 <= 0) goto L53
                android.view.View r11 = r10.itemView
                int r11 = r11.getRight()
                int r11 = r11 - r1
                if (r11 >= 0) goto L53
                android.view.View r12 = r10.itemView
                int r12 = r12.getRight()
                android.view.View r13 = r0.itemView
                int r13 = r13.getRight()
                if (r12 <= r13) goto L53
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L53
                r6 = r10
                r7 = r11
            L53:
                if (r3 >= 0) goto L75
                android.view.View r11 = r10.itemView
                int r11 = r11.getLeft()
                int r11 = r11 - r17
                if (r11 <= 0) goto L75
                android.view.View r12 = r10.itemView
                int r12 = r12.getLeft()
                android.view.View r13 = r0.itemView
                int r13 = r13.getLeft()
                if (r12 >= r13) goto L75
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L75
                r6 = r10
                r7 = r11
            L75:
                if (r4 >= 0) goto L97
                android.view.View r11 = r10.itemView
                int r11 = r11.getTop()
                int r11 = r11 - r18
                if (r11 <= 0) goto L97
                android.view.View r12 = r10.itemView
                int r12 = r12.getTop()
                android.view.View r13 = r0.itemView
                int r13 = r13.getTop()
                if (r12 >= r13) goto L97
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto L97
                r6 = r10
                r7 = r11
            L97:
                if (r4 <= 0) goto Lb8
                android.view.View r11 = r10.itemView
                int r11 = r11.getBottom()
                int r11 = r11 - r2
                if (r11 >= 0) goto Lb8
                android.view.View r12 = r10.itemView
                int r12 = r12.getBottom()
                android.view.View r13 = r0.itemView
                int r13 = r13.getBottom()
                if (r12 <= r13) goto Lb8
                int r11 = java.lang.Math.abs(r11)
                if (r11 <= r7) goto Lb8
                r6 = r10
                r7 = r11
            Lb8:
                int r8 = r8 + 1
                goto L28
            Lbc:
                return r6
        }

        public void clearView(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r1 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r2 = r2.itemView
                r1.clearView(r2)
                return
        }

        public int convertToAbsoluteDirection(int r4, int r5) {
                r3 = this;
                r0 = 3158064(0x303030, float:4.42539E-39)
                r1 = r4 & r0
                if (r1 != 0) goto L8
                return r4
            L8:
                int r2 = ~r1
                r4 = r4 & r2
                if (r5 != 0) goto L10
                int r5 = r1 >> 2
            Le:
                r4 = r4 | r5
                return r4
            L10:
                int r5 = r1 >> 1
                r1 = -3158065(0xffffffffffcfcfcf, float:NaN)
                r1 = r1 & r5
                r4 = r4 | r1
                r5 = r5 & r0
                int r5 = r5 >> 2
                goto Le
        }

        final int getAbsoluteMovementFlags(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r2 = r0.getMovementFlags(r1, r2)
                int r1 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
                int r1 = r0.convertToAbsoluteDirection(r2, r1)
                return r1
        }

        public long getAnimationDuration(androidx.recyclerview.widget.RecyclerView r1, int r2, float r3, float r4) {
                r0 = this;
                androidx.recyclerview.widget.RecyclerView$ItemAnimator r1 = r1.getItemAnimator()
                r3 = 8
                if (r1 != 0) goto L10
                if (r2 != r3) goto Ld
                r1 = 200(0xc8, double:9.9E-322)
                goto Lf
            Ld:
                r1 = 250(0xfa, double:1.235E-321)
            Lf:
                return r1
            L10:
                if (r2 != r3) goto L17
                long r1 = r1.getMoveDuration()
                goto L1b
            L17:
                long r1 = r1.getRemoveDuration()
            L1b:
                return r1
        }

        public int getBoundingBoxMargin() {
                r1 = this;
                r0 = 0
                return r0
        }

        public float getMoveThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1056964608(0x3f000000, float:0.5)
                return r1
        }

        public abstract int getMovementFlags(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2);

        public float getSwipeEscapeVelocity(float r1) {
                r0 = this;
                return r1
        }

        public float getSwipeThreshold(androidx.recyclerview.widget.RecyclerView.ViewHolder r1) {
                r0 = this;
                r1 = 1056964608(0x3f000000, float:0.5)
                return r1
        }

        public float getSwipeVelocityThreshold(float r1) {
                r0 = this;
                return r1
        }

        boolean hasDragFlag(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.getAbsoluteMovementFlags(r1, r2)
                r2 = 16711680(0xff0000, float:2.3418052E-38)
                r1 = r1 & r2
                if (r1 == 0) goto Lb
                r1 = 1
                goto Lc
            Lb:
                r1 = 0
            Lc:
                return r1
        }

        boolean hasSwipeFlag(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.getAbsoluteMovementFlags(r1, r2)
                r2 = 65280(0xff00, float:9.1477E-41)
                r1 = r1 & r2
                if (r1 == 0) goto Lc
                r1 = 1
                goto Ld
            Lc:
                r1 = 0
            Ld:
                return r1
        }

        public int interpolateOutOfBoundsScroll(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7, int r8, long r9) {
                r4 = this;
                int r5 = r4.getMaxDragScroll(r5)
                int r8 = java.lang.Math.abs(r7)
                float r0 = (float) r7
                float r0 = java.lang.Math.signum(r0)
                int r0 = (int) r0
                float r8 = (float) r8
                r1 = 1065353216(0x3f800000, float:1.0)
                float r8 = r8 * r1
                float r6 = (float) r6
                float r8 = r8 / r6
                float r6 = java.lang.Math.min(r1, r8)
                int r0 = r0 * r5
                float r5 = (float) r0
                android.view.animation.Interpolator r8 = androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragViewScrollCapInterpolator
                float r6 = r8.getInterpolation(r6)
                float r5 = r5 * r6
                int r5 = (int) r5
                r2 = 2000(0x7d0, double:9.88E-321)
                int r6 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r6 <= 0) goto L29
                goto L2e
            L29:
                float r6 = (float) r9
                r8 = 1157234688(0x44fa0000, float:2000.0)
                float r1 = r6 / r8
            L2e:
                float r5 = (float) r5
                android.view.animation.Interpolator r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.sDragScrollInterpolator
                float r6 = r6.getInterpolation(r1)
                float r5 = r5 * r6
                int r5 = (int) r5
                if (r5 != 0) goto L3e
                if (r7 <= 0) goto L3d
                r5 = 1
                goto L3e
            L3d:
                r5 = -1
            L3e:
                return r5
        }

        public boolean isItemViewSwipeEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        public boolean isLongPressDragEnabled() {
                r1 = this;
                r0 = 1
                return r0
        }

        public void onChildDraw(android.graphics.Canvas r9, androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.RecyclerView.ViewHolder r11, float r12, float r13, int r14, boolean r15) {
                r8 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r3 = r11.itemView
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r0.onDraw(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public void onChildDrawOver(android.graphics.Canvas r9, androidx.recyclerview.widget.RecyclerView r10, androidx.recyclerview.widget.RecyclerView.ViewHolder r11, float r12, float r13, int r14, boolean r15) {
                r8 = this;
                androidx.recyclerview.widget.ItemTouchUIUtil r0 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r3 = r11.itemView
                r1 = r9
                r2 = r10
                r4 = r12
                r5 = r13
                r6 = r14
                r7 = r15
                r0.onDrawOver(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        void onDraw(android.graphics.Canvas r14, androidx.recyclerview.widget.RecyclerView r15, androidx.recyclerview.widget.RecyclerView.ViewHolder r16, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> r17, int r18, float r19, float r20) {
                r13 = this;
                r8 = r14
                int r9 = r17.size()
                r0 = 0
                r10 = r0
            L7:
                if (r10 >= r9) goto L2d
                r11 = r17
                java.lang.Object r0 = r11.get(r10)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r0 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r0
                r0.update()
                int r12 = r14.save()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.mViewHolder
                float r4 = r0.f81mX
                float r5 = r0.f82mY
                int r6 = r0.mActionState
                r7 = 0
                r0 = r13
                r1 = r14
                r2 = r15
                r0.onChildDraw(r1, r2, r3, r4, r5, r6, r7)
                r14.restoreToCount(r12)
                int r10 = r10 + 1
                goto L7
            L2d:
                if (r16 == 0) goto L45
                int r9 = r14.save()
                r7 = 1
                r0 = r13
                r1 = r14
                r2 = r15
                r3 = r16
                r4 = r19
                r5 = r20
                r6 = r18
                r0.onChildDraw(r1, r2, r3, r4, r5, r6, r7)
                r14.restoreToCount(r9)
            L45:
                return
        }

        void onDrawOver(android.graphics.Canvas r15, androidx.recyclerview.widget.RecyclerView r16, androidx.recyclerview.widget.RecyclerView.ViewHolder r17, java.util.List<androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation> r18, int r19, float r20, float r21) {
                r14 = this;
                r8 = r15
                r9 = r18
                int r10 = r18.size()
                r11 = 0
                r12 = r11
            L9:
                if (r12 >= r10) goto L2b
                java.lang.Object r0 = r9.get(r12)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r0 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r0
                int r13 = r15.save()
                androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.mViewHolder
                float r4 = r0.f81mX
                float r5 = r0.f82mY
                int r6 = r0.mActionState
                r7 = 0
                r0 = r14
                r1 = r15
                r2 = r16
                r0.onChildDrawOver(r1, r2, r3, r4, r5, r6, r7)
                r15.restoreToCount(r13)
                int r12 = r12 + 1
                goto L9
            L2b:
                if (r17 == 0) goto L44
                int r12 = r15.save()
                r7 = 1
                r0 = r14
                r1 = r15
                r2 = r16
                r3 = r17
                r4 = r20
                r5 = r21
                r6 = r19
                r0.onChildDrawOver(r1, r2, r3, r4, r5, r6, r7)
                r15.restoreToCount(r12)
            L44:
                r0 = 1
                int r10 = r10 - r0
            L46:
                if (r10 < 0) goto L62
                java.lang.Object r1 = r9.get(r10)
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
                boolean r2 = r1.mEnded
                if (r2 == 0) goto L5a
                boolean r2 = r1.mIsPendingCleanup
                if (r2 != 0) goto L5a
                r9.remove(r10)
                goto L5f
            L5a:
                boolean r1 = r1.mEnded
                if (r1 != 0) goto L5f
                r11 = r0
            L5f:
                int r10 = r10 + (-1)
                goto L46
            L62:
                if (r11 == 0) goto L67
                r16.invalidate()
            L67:
                return
        }

        public abstract boolean onMove(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3);

        public void onMoved(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3, int r4, androidx.recyclerview.widget.RecyclerView.ViewHolder r5, int r6, int r7, int r8) {
                r1 = this;
                androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r2.getLayoutManager()
                boolean r0 = r4 instanceof androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler
                if (r0 == 0) goto L12
                androidx.recyclerview.widget.ItemTouchHelper$ViewDropHandler r4 = (androidx.recyclerview.widget.ItemTouchHelper.ViewDropHandler) r4
                android.view.View r2 = r3.itemView
                android.view.View r3 = r5.itemView
                r4.prepareForDrop(r2, r3, r7, r8)
                return
            L12:
                boolean r3 = r4.canScrollHorizontally()
                if (r3 == 0) goto L3b
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedLeft(r3)
                int r7 = r2.getPaddingLeft()
                if (r3 > r7) goto L27
                r2.scrollToPosition(r6)
            L27:
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedRight(r3)
                int r7 = r2.getWidth()
                int r8 = r2.getPaddingRight()
                int r7 = r7 - r8
                if (r3 < r7) goto L3b
                r2.scrollToPosition(r6)
            L3b:
                boolean r3 = r4.canScrollVertically()
                if (r3 == 0) goto L64
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedTop(r3)
                int r7 = r2.getPaddingTop()
                if (r3 > r7) goto L50
                r2.scrollToPosition(r6)
            L50:
                android.view.View r3 = r5.itemView
                int r3 = r4.getDecoratedBottom(r3)
                int r4 = r2.getHeight()
                int r5 = r2.getPaddingBottom()
                int r4 = r4 - r5
                if (r3 < r4) goto L64
                r2.scrollToPosition(r6)
            L64:
                return
        }

        public void onSelectedChanged(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2) {
                r0 = this;
                if (r1 == 0) goto L9
                androidx.recyclerview.widget.ItemTouchUIUtil r2 = androidx.recyclerview.widget.ItemTouchUIUtilImpl.INSTANCE
                android.view.View r1 = r1.itemView
                r2.onSelected(r1)
            L9:
                return
        }

        public abstract void onSwiped(androidx.recyclerview.widget.RecyclerView.ViewHolder r1, int r2);
    }

    private class ItemTouchHelperGestureListener extends android.view.GestureDetector.SimpleOnGestureListener {
        private boolean mShouldReactToLongPress;
        final /* synthetic */ androidx.recyclerview.widget.ItemTouchHelper this$0;

        ItemTouchHelperGestureListener(androidx.recyclerview.widget.ItemTouchHelper r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = 1
                r0.mShouldReactToLongPress = r1
                return
        }

        void doNotReactToLongPress() {
                r1 = this;
                r0 = 0
                r1.mShouldReactToLongPress = r0
                return
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(android.view.MotionEvent r1) {
                r0 = this;
                r1 = 1
                return r1
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(android.view.MotionEvent r4) {
                r3 = this;
                boolean r0 = r3.mShouldReactToLongPress
                if (r0 != 0) goto L5
                return
            L5:
                androidx.recyclerview.widget.ItemTouchHelper r0 = r3.this$0
                android.view.View r0 = r0.findChildView(r4)
                if (r0 == 0) goto L60
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r1 = r1.mRecyclerView
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r1.getChildViewHolder(r0)
                if (r0 == 0) goto L60
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r1.mCallback
                androidx.recyclerview.widget.ItemTouchHelper r2 = r3.this$0
                androidx.recyclerview.widget.RecyclerView r2 = r2.mRecyclerView
                boolean r1 = r1.hasDragFlag(r2, r0)
                if (r1 != 0) goto L26
                return
            L26:
                r1 = 0
                int r1 = r4.getPointerId(r1)
                androidx.recyclerview.widget.ItemTouchHelper r2 = r3.this$0
                int r2 = r2.mActivePointerId
                if (r1 != r2) goto L60
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                int r1 = r1.mActivePointerId
                int r1 = r4.findPointerIndex(r1)
                float r2 = r4.getX(r1)
                float r4 = r4.getY(r1)
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                r1.mInitialTouchX = r2
                androidx.recyclerview.widget.ItemTouchHelper r1 = r3.this$0
                r1.mInitialTouchY = r4
                androidx.recyclerview.widget.ItemTouchHelper r4 = r3.this$0
                r1 = 0
                r4.mDy = r1
                r4.mDx = r1
                androidx.recyclerview.widget.ItemTouchHelper r4 = r3.this$0
                androidx.recyclerview.widget.ItemTouchHelper$Callback r4 = r4.mCallback
                boolean r4 = r4.isLongPressDragEnabled()
                if (r4 == 0) goto L60
                androidx.recyclerview.widget.ItemTouchHelper r4 = r3.this$0
                r1 = 2
                r4.select(r0, r1)
            L60:
                return
        }
    }

    private static class RecoverAnimation implements android.animation.Animator.AnimatorListener {
        final int mActionState;
        final int mAnimationType;
        boolean mEnded;
        private float mFraction;
        boolean mIsPendingCleanup;
        boolean mOverridden;
        final float mStartDx;
        final float mStartDy;
        final float mTargetX;
        final float mTargetY;
        private final android.animation.ValueAnimator mValueAnimator;
        final androidx.recyclerview.widget.RecyclerView.ViewHolder mViewHolder;

        /* renamed from: mX */
        float f81mX;

        /* renamed from: mY */
        float f82mY;


        RecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r2, int r3, int r4, float r5, float r6, float r7, float r8) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mOverridden = r0
                r1.mEnded = r0
                r1.mActionState = r4
                r1.mAnimationType = r3
                r1.mViewHolder = r2
                r1.mStartDx = r5
                r1.mStartDy = r6
                r1.mTargetX = r7
                r1.mTargetY = r8
                r3 = 2
                float[] r3 = new float[r3]
                r3 = {x0038: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
                android.animation.ValueAnimator r3 = android.animation.ValueAnimator.ofFloat(r3)
                r1.mValueAnimator = r3
                androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1 r4 = new androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation$1
                r4.<init>(r1)
                r3.addUpdateListener(r4)
                android.view.View r2 = r2.itemView
                r3.setTarget(r2)
                r3.addListener(r1)
                r2 = 0
                r1.setFraction(r2)
                return
        }

        public void cancel() {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.mValueAnimator
                r0.cancel()
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(android.animation.Animator r1) {
                r0 = this;
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setFraction(r1)
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(android.animation.Animator r2) {
                r1 = this;
                boolean r2 = r1.mEnded
                r0 = 1
                if (r2 != 0) goto La
                androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mViewHolder
                r2.setIsRecyclable(r0)
            La:
                r1.mEnded = r0
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(android.animation.Animator r1) {
                r0 = this;
                return
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(android.animation.Animator r1) {
                r0 = this;
                return
        }

        public void setDuration(long r2) {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.mValueAnimator
                r0.setDuration(r2)
                return
        }

        public void setFraction(float r1) {
                r0 = this;
                r0.mFraction = r1
                return
        }

        public void start() {
                r2 = this;
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.mViewHolder
                r1 = 0
                r0.setIsRecyclable(r1)
                android.animation.ValueAnimator r0 = r2.mValueAnimator
                r0.start()
                return
        }

        public void update() {
                r3 = this;
                float r0 = r3.mStartDx
                float r1 = r3.mTargetX
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L13
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mViewHolder
                android.view.View r0 = r0.itemView
                float r0 = r0.getTranslationX()
                r3.f81mX = r0
                goto L1a
            L13:
                float r2 = r3.mFraction
                float r1 = r1 - r0
                float r2 = r2 * r1
                float r0 = r0 + r2
                r3.f81mX = r0
            L1a:
                float r0 = r3.mStartDy
                float r1 = r3.mTargetY
                int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                if (r2 != 0) goto L2d
                androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mViewHolder
                android.view.View r0 = r0.itemView
                float r0 = r0.getTranslationY()
                r3.f82mY = r0
                goto L34
            L2d:
                float r2 = r3.mFraction
                float r1 = r1 - r0
                float r2 = r2 * r1
                float r0 = r0 + r2
                r3.f82mY = r0
            L34:
                return
        }
    }

    public static abstract class SimpleCallback extends androidx.recyclerview.widget.ItemTouchHelper.Callback {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public SimpleCallback(int r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.mDefaultSwipeDirs = r2
                r0.mDefaultDragDirs = r1
                return
        }

        public int getDragDirs(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.mDefaultDragDirs
                return r1
        }

        @Override // androidx.recyclerview.widget.ItemTouchHelper.Callback
        public int getMovementFlags(androidx.recyclerview.widget.RecyclerView r2, androidx.recyclerview.widget.RecyclerView.ViewHolder r3) {
                r1 = this;
                int r0 = r1.getDragDirs(r2, r3)
                int r2 = r1.getSwipeDirs(r2, r3)
                int r2 = makeMovementFlags(r0, r2)
                return r2
        }

        public int getSwipeDirs(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView.ViewHolder r2) {
                r0 = this;
                int r1 = r0.mDefaultSwipeDirs
                return r1
        }

        public void setDefaultDragDirs(int r1) {
                r0 = this;
                r0.mDefaultDragDirs = r1
                return
        }

        public void setDefaultSwipeDirs(int r1) {
                r0 = this;
                r0.mDefaultSwipeDirs = r1
                return
        }
    }

    public interface ViewDropHandler {
        void prepareForDrop(android.view.View r1, android.view.View r2, int r3, int r4);
    }

    public ItemTouchHelper(androidx.recyclerview.widget.ItemTouchHelper.Callback r4) {
            r3 = this;
            r3.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.mPendingCleanup = r0
            r0 = 2
            float[] r0 = new float[r0]
            r3.mTmpPosition = r0
            r0 = 0
            r3.mSelected = r0
            r1 = -1
            r3.mActivePointerId = r1
            r2 = 0
            r3.mActionState = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3.mRecoverAnimations = r2
            androidx.recyclerview.widget.ItemTouchHelper$1 r2 = new androidx.recyclerview.widget.ItemTouchHelper$1
            r2.<init>(r3)
            r3.mScrollRunnable = r2
            r3.mChildDrawingOrderCallback = r0
            r3.mOverdrawChild = r0
            r3.mOverdrawChildPosition = r1
            androidx.recyclerview.widget.ItemTouchHelper$2 r0 = new androidx.recyclerview.widget.ItemTouchHelper$2
            r0.<init>(r3)
            r3.mOnItemTouchListener = r0
            r3.mCallback = r4
            return
    }

    private void addChildDrawingOrderCallback() {
            r0 = this;
            return
    }

    private int checkHorizontalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            r7 = this;
            r0 = r9 & 12
            if (r0 == 0) goto L79
            float r0 = r7.mDx
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 8
            r3 = 4
            if (r0 <= 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r3
        L11:
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            if (r4 == 0) goto L5c
            int r5 = r7.mActivePointerId
            r6 = -1
            if (r5 <= r6) goto L5c
            androidx.recyclerview.widget.ItemTouchHelper$Callback r5 = r7.mCallback
            float r6 = r7.mMaxSwipeVelocity
            float r5 = r5.getSwipeVelocityThreshold(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r6, r5)
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            int r5 = r7.mActivePointerId
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.mVelocityTracker
            int r6 = r7.mActivePointerId
            float r5 = r5.getYVelocity(r6)
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L3c
            goto L3d
        L3c:
            r2 = r3
        L3d:
            float r1 = java.lang.Math.abs(r4)
            r3 = r2 & r9
            if (r3 == 0) goto L5c
            if (r0 != r2) goto L5c
            androidx.recyclerview.widget.ItemTouchHelper$Callback r3 = r7.mCallback
            float r4 = r7.mSwipeEscapeVelocity
            float r3 = r3.getSwipeEscapeVelocity(r4)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L5c
            float r3 = java.lang.Math.abs(r5)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L5c
            return r2
        L5c:
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
            int r1 = r1.getWidth()
            float r1 = (float) r1
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r7.mCallback
            float r8 = r2.getSwipeThreshold(r8)
            float r1 = r1 * r8
            r8 = r9 & r0
            if (r8 == 0) goto L79
            float r8 = r7.mDx
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L79
            return r0
        L79:
            r8 = 0
            return r8
    }

    private int checkVerticalSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder r8, int r9) {
            r7 = this;
            r0 = r9 & 3
            if (r0 == 0) goto L78
            float r0 = r7.mDy
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r2 = 2
            r3 = 1
            if (r0 <= 0) goto Lf
            r0 = r2
            goto L10
        Lf:
            r0 = r3
        L10:
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            if (r4 == 0) goto L5b
            int r5 = r7.mActivePointerId
            r6 = -1
            if (r5 <= r6) goto L5b
            androidx.recyclerview.widget.ItemTouchHelper$Callback r5 = r7.mCallback
            float r6 = r7.mMaxSwipeVelocity
            float r5 = r5.getSwipeVelocityThreshold(r6)
            r6 = 1000(0x3e8, float:1.401E-42)
            r4.computeCurrentVelocity(r6, r5)
            android.view.VelocityTracker r4 = r7.mVelocityTracker
            int r5 = r7.mActivePointerId
            float r4 = r4.getXVelocity(r5)
            android.view.VelocityTracker r5 = r7.mVelocityTracker
            int r6 = r7.mActivePointerId
            float r5 = r5.getYVelocity(r6)
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 <= 0) goto L3b
            goto L3c
        L3b:
            r2 = r3
        L3c:
            float r1 = java.lang.Math.abs(r5)
            r3 = r2 & r9
            if (r3 == 0) goto L5b
            if (r2 != r0) goto L5b
            androidx.recyclerview.widget.ItemTouchHelper$Callback r3 = r7.mCallback
            float r5 = r7.mSwipeEscapeVelocity
            float r3 = r3.getSwipeEscapeVelocity(r5)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 < 0) goto L5b
            float r3 = java.lang.Math.abs(r4)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L5b
            return r2
        L5b:
            androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
            int r1 = r1.getHeight()
            float r1 = (float) r1
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r7.mCallback
            float r8 = r2.getSwipeThreshold(r8)
            float r1 = r1 * r8
            r8 = r9 & r0
            if (r8 == 0) goto L78
            float r8 = r7.mDy
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r8 <= 0) goto L78
            return r0
        L78:
            r8 = 0
            return r8
    }

    private void destroyCallbacks() {
            r4 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r0.removeItemDecoration(r4)
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r1 = r4.mOnItemTouchListener
            r0.removeOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r4.mRecyclerView
            r0.removeOnChildAttachStateChangeListener(r4)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L19:
            if (r0 < 0) goto L30
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r4.mRecoverAnimations
            r2 = 0
            java.lang.Object r1 = r1.get(r2)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r4.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r4.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r1.mViewHolder
            r2.clearView(r3, r1)
            int r0 = r0 + (-1)
            goto L19
        L30:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            r0.clear()
            r0 = 0
            r4.mOverdrawChild = r0
            r0 = -1
            r4.mOverdrawChildPosition = r0
            r4.releaseVelocityTracker()
            r4.stopGestureDetection()
            return
    }

    private java.util.List<androidx.recyclerview.widget.RecyclerView.ViewHolder> findSwapTargets(androidx.recyclerview.widget.RecyclerView.ViewHolder r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r2 = r0.mSwapTargets
            if (r2 != 0) goto L17
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mSwapTargets = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mDistances = r2
            goto L1f
        L17:
            r2.clear()
            java.util.List<java.lang.Integer> r2 = r0.mDistances
            r2.clear()
        L1f:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r0.mCallback
            int r2 = r2.getBoundingBoxMargin()
            float r3 = r0.mSelectedStartX
            float r4 = r0.mDx
            float r3 = r3 + r4
            int r3 = java.lang.Math.round(r3)
            int r3 = r3 - r2
            float r4 = r0.mSelectedStartY
            float r5 = r0.mDy
            float r4 = r4 + r5
            int r4 = java.lang.Math.round(r4)
            int r4 = r4 - r2
            android.view.View r5 = r1.itemView
            int r5 = r5.getWidth()
            int r5 = r5 + r3
            int r2 = r2 * 2
            int r5 = r5 + r2
            android.view.View r6 = r1.itemView
            int r6 = r6.getHeight()
            int r6 = r6 + r4
            int r6 = r6 + r2
            int r2 = r3 + r5
            int r2 = r2 / 2
            int r7 = r4 + r6
            int r7 = r7 / 2
            androidx.recyclerview.widget.RecyclerView r8 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r8 = r8.getLayoutManager()
            int r9 = r8.getChildCount()
            r11 = 0
        L5e:
            if (r11 >= r9) goto Led
            android.view.View r12 = r8.getChildAt(r11)
            android.view.View r13 = r1.itemView
            if (r12 != r13) goto L6a
            goto Le7
        L6a:
            int r13 = r12.getBottom()
            if (r13 < r4) goto Le7
            int r13 = r12.getTop()
            if (r13 > r6) goto Le7
            int r13 = r12.getRight()
            if (r13 < r3) goto Le7
            int r13 = r12.getLeft()
            if (r13 <= r5) goto L83
            goto Le7
        L83:
            androidx.recyclerview.widget.RecyclerView r13 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r13 = r13.getChildViewHolder(r12)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r14 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r15 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r10 = r0.mSelected
            boolean r10 = r14.canDropOver(r15, r10, r13)
            if (r10 == 0) goto Le7
            int r10 = r12.getLeft()
            int r14 = r12.getRight()
            int r10 = r10 + r14
            int r10 = r10 / 2
            int r10 = r2 - r10
            int r10 = java.lang.Math.abs(r10)
            int r14 = r12.getTop()
            int r12 = r12.getBottom()
            int r14 = r14 + r12
            int r14 = r14 / 2
            int r12 = r7 - r14
            int r12 = java.lang.Math.abs(r12)
            int r10 = r10 * r10
            int r12 = r12 * r12
            int r10 = r10 + r12
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r12 = r0.mSwapTargets
            int r12 = r12.size()
            r14 = 0
            r15 = 0
        Lc2:
            if (r14 >= r12) goto Ld9
            java.util.List<java.lang.Integer> r1 = r0.mDistances
            java.lang.Object r1 = r1.get(r14)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            if (r10 <= r1) goto Ld9
            int r15 = r15 + 1
            int r14 = r14 + 1
            r1 = r17
            goto Lc2
        Ld9:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r0.mSwapTargets
            r1.add(r15, r13)
            java.util.List<java.lang.Integer> r1 = r0.mDistances
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r1.add(r15, r10)
        Le7:
            int r11 = r11 + 1
            r1 = r17
            goto L5e
        Led:
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r1 = r0.mSwapTargets
            return r1
    }

    private androidx.recyclerview.widget.RecyclerView.ViewHolder findSwipedView(android.view.MotionEvent r7) {
            r6 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            int r1 = r6.mActivePointerId
            r2 = -1
            r3 = 0
            if (r1 != r2) goto Ld
            return r3
        Ld:
            int r1 = r7.findPointerIndex(r1)
            float r2 = r7.getX(r1)
            float r4 = r6.mInitialTouchX
            float r2 = r2 - r4
            float r1 = r7.getY(r1)
            float r4 = r6.mInitialTouchY
            float r1 = r1 - r4
            float r2 = java.lang.Math.abs(r2)
            float r1 = java.lang.Math.abs(r1)
            int r4 = r6.mSlop
            float r5 = (float) r4
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L34
            float r4 = (float) r4
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L34
            return r3
        L34:
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L3f
            boolean r4 = r0.canScrollHorizontally()
            if (r4 == 0) goto L3f
            return r3
        L3f:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L4a
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L4a
            return r3
        L4a:
            android.view.View r7 = r6.findChildView(r7)
            if (r7 != 0) goto L51
            return r3
        L51:
            androidx.recyclerview.widget.RecyclerView r0 = r6.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r7 = r0.getChildViewHolder(r7)
            return r7
    }

    private void getSelectedDxDy(float[] r4) {
            r3 = this;
            int r0 = r3.mSelectedFlags
            r0 = r0 & 12
            r1 = 0
            if (r0 == 0) goto L19
            float r0 = r3.mSelectedStartX
            float r2 = r3.mDx
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r3.mSelected
            android.view.View r2 = r2.itemView
            int r2 = r2.getLeft()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L23
        L19:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mSelected
            android.view.View r0 = r0.itemView
            float r0 = r0.getTranslationX()
            r4[r1] = r0
        L23:
            int r0 = r3.mSelectedFlags
            r0 = r0 & 3
            r1 = 1
            if (r0 == 0) goto L3c
            float r0 = r3.mSelectedStartY
            float r2 = r3.mDy
            float r0 = r0 + r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r3.mSelected
            android.view.View r2 = r2.itemView
            int r2 = r2.getTop()
            float r2 = (float) r2
            float r0 = r0 - r2
            r4[r1] = r0
            goto L46
        L3c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r3.mSelected
            android.view.View r0 = r0.itemView
            float r0 = r0.getTranslationY()
            r4[r1] = r0
        L46:
            return
    }

    private static boolean hitTest(android.view.View r1, float r2, float r3, float r4, float r5) {
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L1e
            int r0 = r1.getWidth()
            float r0 = (float) r0
            float r4 = r4 + r0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L1e
            int r2 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r2 < 0) goto L1e
            int r1 = r1.getHeight()
            float r1 = (float) r1
            float r5 = r5 + r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 > 0) goto L1e
            r1 = 1
            goto L1f
        L1e:
            r1 = 0
        L1f:
            return r1
    }

    private void releaseVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto La
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        La:
            return
    }

    private void setupCallbacks() {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            android.content.Context r0 = r0.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r2.mSlop = r0
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addItemDecoration(r2)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$OnItemTouchListener r1 = r2.mOnItemTouchListener
            r0.addOnItemTouchListener(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            r0.addOnChildAttachStateChangeListener(r2)
            r2.startGestureDetection()
            return
    }

    private void startGestureDetection() {
            r3 = this;
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r0 = new androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener
            r0.<init>(r3)
            r3.mItemTouchHelperGestureListener = r0
            androidx.core.view.GestureDetectorCompat r0 = new androidx.core.view.GestureDetectorCompat
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            android.content.Context r1 = r1.getContext()
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r2 = r3.mItemTouchHelperGestureListener
            r0.<init>(r1, r2)
            r3.mGestureDetector = r0
            return
    }

    private void stopGestureDetection() {
            r2 = this;
            androidx.recyclerview.widget.ItemTouchHelper$ItemTouchHelperGestureListener r0 = r2.mItemTouchHelperGestureListener
            r1 = 0
            if (r0 == 0) goto La
            r0.doNotReactToLongPress()
            r2.mItemTouchHelperGestureListener = r1
        La:
            androidx.core.view.GestureDetectorCompat r0 = r2.mGestureDetector
            if (r0 == 0) goto L10
            r2.mGestureDetector = r1
        L10:
            return
    }

    private int swipeIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder r6) {
            r5 = this;
            int r0 = r5.mActionState
            r1 = 2
            r2 = 0
            if (r0 != r1) goto L7
            return r2
        L7:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r5.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            int r0 = r0.getMovementFlags(r1, r6)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r5.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r5.mRecyclerView
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            int r1 = r1.convertToAbsoluteDirection(r0, r3)
            r3 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r3
            int r1 = r1 >> 8
            if (r1 != 0) goto L24
            return r2
        L24:
            r0 = r0 & r3
            int r0 = r0 >> 8
            float r3 = r5.mDx
            float r3 = java.lang.Math.abs(r3)
            float r4 = r5.mDy
            float r4 = java.lang.Math.abs(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L54
            int r3 = r5.checkHorizontalSwipe(r6, r1)
            if (r3 <= 0) goto L4d
            r6 = r0 & r3
            if (r6 != 0) goto L4c
            androidx.recyclerview.widget.RecyclerView r6 = r5.mRecyclerView
            int r6 = androidx.core.view.ViewCompat.getLayoutDirection(r6)
            int r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(r3, r6)
            return r6
        L4c:
            return r3
        L4d:
            int r6 = r5.checkVerticalSwipe(r6, r1)
            if (r6 <= 0) goto L6f
            return r6
        L54:
            int r3 = r5.checkVerticalSwipe(r6, r1)
            if (r3 <= 0) goto L5b
            return r3
        L5b:
            int r6 = r5.checkHorizontalSwipe(r6, r1)
            if (r6 <= 0) goto L6f
            r0 = r0 & r6
            if (r0 != 0) goto L6e
            androidx.recyclerview.widget.RecyclerView r0 = r5.mRecyclerView
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r0)
            int r6 = androidx.recyclerview.widget.ItemTouchHelper.Callback.convertToRelativeDirection(r6, r0)
        L6e:
            return r6
        L6f:
            return r2
    }

    public void attachToRecyclerView(androidx.recyclerview.widget.RecyclerView r2) {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            if (r0 != r2) goto L5
            return
        L5:
            if (r0 == 0) goto La
            r1.destroyCallbacks()
        La:
            r1.mRecyclerView = r2
            if (r2 == 0) goto L25
            android.content.res.Resources r2 = r2.getResources()
            int r0 = androidx.recyclerview.C0353R.dimen.item_touch_helper_swipe_escape_velocity
            float r0 = r2.getDimension(r0)
            r1.mSwipeEscapeVelocity = r0
            int r0 = androidx.recyclerview.C0353R.dimen.item_touch_helper_swipe_escape_max_velocity
            float r2 = r2.getDimension(r0)
            r1.mMaxSwipeVelocity = r2
            r1.setupCallbacks()
        L25:
            return
    }

    void checkSelectForSwipe(int r9, android.view.MotionEvent r10, int r11) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r8.mSelected
            if (r0 != 0) goto L91
            r0 = 2
            if (r9 != r0) goto L91
            int r9 = r8.mActionState
            if (r9 == r0) goto L91
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r8.mCallback
            boolean r9 = r9.isItemViewSwipeEnabled()
            if (r9 != 0) goto L15
            goto L91
        L15:
            androidx.recyclerview.widget.RecyclerView r9 = r8.mRecyclerView
            int r9 = r9.getScrollState()
            r1 = 1
            if (r9 != r1) goto L1f
            return
        L1f:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r8.findSwipedView(r10)
            if (r9 != 0) goto L26
            return
        L26:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r8.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r8.mRecyclerView
            int r2 = r2.getAbsoluteMovementFlags(r3, r9)
            r3 = 65280(0xff00, float:9.1477E-41)
            r2 = r2 & r3
            int r2 = r2 >> 8
            if (r2 != 0) goto L37
            return
        L37:
            float r3 = r10.getX(r11)
            float r11 = r10.getY(r11)
            float r4 = r8.mInitialTouchX
            float r3 = r3 - r4
            float r4 = r8.mInitialTouchY
            float r11 = r11 - r4
            float r4 = java.lang.Math.abs(r3)
            float r5 = java.lang.Math.abs(r11)
            int r6 = r8.mSlop
            float r7 = (float) r6
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5a
            float r6 = (float) r6
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 >= 0) goto L5a
            return
        L5a:
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            r5 = 0
            if (r4 <= 0) goto L71
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 >= 0) goto L68
            r11 = r2 & 4
            if (r11 != 0) goto L68
            return
        L68:
            int r11 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r11 <= 0) goto L83
            r11 = r2 & 8
            if (r11 != 0) goto L83
            return
        L71:
            int r3 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r3 >= 0) goto L7a
            r3 = r2 & 1
            if (r3 != 0) goto L7a
            return
        L7a:
            int r11 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r11 <= 0) goto L83
            r11 = r2 & 2
            if (r11 != 0) goto L83
            return
        L83:
            r8.mDy = r5
            r8.mDx = r5
            r11 = 0
            int r10 = r10.getPointerId(r11)
            r8.mActivePointerId = r10
            r8.select(r9, r1)
        L91:
            return
    }

    void endRecoverAnimation(androidx.recyclerview.widget.RecyclerView.ViewHolder r4, boolean r5) {
            r3 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r3.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L8:
            if (r0 < 0) goto L2b
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r3.mRecoverAnimations
            java.lang.Object r1 = r1.get(r0)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r1 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r1
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r1.mViewHolder
            if (r2 != r4) goto L28
            boolean r4 = r1.mOverridden
            r4 = r4 | r5
            r1.mOverridden = r4
            boolean r4 = r1.mEnded
            if (r4 != 0) goto L22
            r1.cancel()
        L22:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r4 = r3.mRecoverAnimations
            r4.remove(r0)
            return
        L28:
            int r0 = r0 + (-1)
            goto L8
        L2b:
            return
    }

    androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation findAnimation(android.view.MotionEvent r5) {
            r4 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            android.view.View r5 = r4.findChildView(r5)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L16:
            if (r0 < 0) goto L2a
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r2 = r4.mRecoverAnimations
            java.lang.Object r2 = r2.get(r0)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r2 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.mViewHolder
            android.view.View r3 = r3.itemView
            if (r3 != r5) goto L27
            return r2
        L27:
            int r0 = r0 + (-1)
            goto L16
        L2a:
            return r1
    }

    android.view.View findChildView(android.view.MotionEvent r6) {
            r5 = this;
            float r0 = r6.getX()
            float r6 = r6.getY()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r5.mSelected
            if (r1 == 0) goto L1f
            android.view.View r1 = r1.itemView
            float r2 = r5.mSelectedStartX
            float r3 = r5.mDx
            float r2 = r2 + r3
            float r3 = r5.mSelectedStartY
            float r4 = r5.mDy
            float r3 = r3 + r4
            boolean r2 = hitTest(r1, r0, r6, r2, r3)
            if (r2 == 0) goto L1f
            return r1
        L1f:
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r1 = r5.mRecoverAnimations
            int r1 = r1.size()
            int r1 = r1 + (-1)
        L27:
            if (r1 < 0) goto L43
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r2 = r5.mRecoverAnimations
            java.lang.Object r2 = r2.get(r1)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r2 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r2
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r2.mViewHolder
            android.view.View r3 = r3.itemView
            float r4 = r2.f81mX
            float r2 = r2.f82mY
            boolean r2 = hitTest(r3, r0, r6, r4, r2)
            if (r2 == 0) goto L40
            return r3
        L40:
            int r1 = r1 + (-1)
            goto L27
        L43:
            androidx.recyclerview.widget.RecyclerView r1 = r5.mRecyclerView
            android.view.View r6 = r1.findChildViewUnder(r0, r6)
            return r6
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(android.graphics.Rect r1, android.view.View r2, androidx.recyclerview.widget.RecyclerView r3, androidx.recyclerview.widget.RecyclerView.State r4) {
            r0 = this;
            r1.setEmpty()
            return
    }

    boolean hasRunningRecoverAnim() {
            r4 = this;
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r4.mRecoverAnimations
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L1b
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r3 = r4.mRecoverAnimations
            java.lang.Object r3 = r3.get(r2)
            androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation r3 = (androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation) r3
            boolean r3 = r3.mEnded
            if (r3 != 0) goto L18
            r0 = 1
            return r0
        L18:
            int r2 = r2 + 1
            goto L8
        L1b:
            return r1
    }

    void moveIfNecessary(androidx.recyclerview.widget.RecyclerView.ViewHolder r11) {
            r10 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r10.mRecyclerView
            boolean r0 = r0.isLayoutRequested()
            if (r0 == 0) goto L9
            return
        L9:
            int r0 = r10.mActionState
            r1 = 2
            if (r0 == r1) goto Lf
            return
        Lf:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r10.mCallback
            float r0 = r0.getMoveThreshold(r11)
            float r1 = r10.mSelectedStartX
            float r2 = r10.mDx
            float r1 = r1 + r2
            int r8 = (int) r1
            float r1 = r10.mSelectedStartY
            float r2 = r10.mDy
            float r1 = r1 + r2
            int r9 = (int) r1
            android.view.View r1 = r11.itemView
            int r1 = r1.getTop()
            int r1 = r9 - r1
            int r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            android.view.View r2 = r11.itemView
            int r2 = r2.getHeight()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L54
            android.view.View r1 = r11.itemView
            int r1 = r1.getLeft()
            int r1 = r8 - r1
            int r1 = java.lang.Math.abs(r1)
            float r1 = (float) r1
            android.view.View r2 = r11.itemView
            int r2 = r2.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r0
            int r0 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r0 >= 0) goto L54
            return
        L54:
            java.util.List r0 = r10.findSwapTargets(r11)
            int r1 = r0.size()
            if (r1 != 0) goto L5f
            return
        L5f:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r6 = r1.chooseDropTarget(r11, r0, r8, r9)
            if (r6 != 0) goto L72
            java.util.List<androidx.recyclerview.widget.RecyclerView$ViewHolder> r11 = r10.mSwapTargets
            r11.clear()
            java.util.List<java.lang.Integer> r11 = r10.mDistances
            r11.clear()
            return
        L72:
            int r7 = r6.getAdapterPosition()
            int r5 = r11.getAdapterPosition()
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r10.mRecyclerView
            boolean r0 = r0.onMove(r1, r11, r6)
            if (r0 == 0) goto L8c
            androidx.recyclerview.widget.ItemTouchHelper$Callback r2 = r10.mCallback
            androidx.recyclerview.widget.RecyclerView r3 = r10.mRecyclerView
            r4 = r11
            r2.onMoved(r3, r4, r5, r6, r7, r8, r9)
        L8c:
            return
    }

    void obtainVelocityTracker() {
            r1 = this;
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto L7
            r0.recycle()
        L7:
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r1.mVelocityTracker = r0
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
    public void onChildViewDetachedFromWindow(android.view.View r3) {
            r2 = this;
            r2.removeChildDrawingOrderCallbackIfNecessary(r3)
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r3 = r0.getChildViewHolder(r3)
            if (r3 != 0) goto Lc
            return
        Lc:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r2.mSelected
            r1 = 0
            if (r0 == 0) goto L18
            if (r3 != r0) goto L18
            r3 = 0
            r2.select(r3, r1)
            goto L2c
        L18:
            r2.endRecoverAnimation(r3, r1)
            java.util.List<android.view.View> r0 = r2.mPendingCleanup
            android.view.View r1 = r3.itemView
            boolean r0 = r0.remove(r1)
            if (r0 == 0) goto L2c
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r2.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r2.mRecyclerView
            r0.clearView(r1, r3)
        L2c:
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDraw(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            r12 = -1
            r9.mOverdrawChildPosition = r12
            androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = r9.mSelected
            if (r12 == 0) goto L17
            float[] r12 = r9.mTmpPosition
            r9.getSelectedDxDy(r12)
            float[] r12 = r9.mTmpPosition
            r0 = 0
            r0 = r12[r0]
            r1 = 1
            r12 = r12[r1]
            r8 = r12
            r7 = r0
            goto L1a
        L17:
            r0 = 0
            r7 = r0
            r8 = r7
        L1a:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r9.mSelected
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r5 = r9.mRecoverAnimations
            int r6 = r9.mActionState
            r2 = r10
            r3 = r11
            r1.onDraw(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(android.graphics.Canvas r10, androidx.recyclerview.widget.RecyclerView r11, androidx.recyclerview.widget.RecyclerView.State r12) {
            r9 = this;
            androidx.recyclerview.widget.RecyclerView$ViewHolder r12 = r9.mSelected
            if (r12 == 0) goto L14
            float[] r12 = r9.mTmpPosition
            r9.getSelectedDxDy(r12)
            float[] r12 = r9.mTmpPosition
            r0 = 0
            r0 = r12[r0]
            r1 = 1
            r12 = r12[r1]
            r8 = r12
            r7 = r0
            goto L17
        L14:
            r0 = 0
            r7 = r0
            r8 = r7
        L17:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r9.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r4 = r9.mSelected
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r5 = r9.mRecoverAnimations
            int r6 = r9.mActionState
            r2 = r10
            r3 = r11
            r1.onDrawOver(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    void postDispatchSwipe(androidx.recyclerview.widget.ItemTouchHelper.RecoverAnimation r3, int r4) {
            r2 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r2.mRecyclerView
            androidx.recyclerview.widget.ItemTouchHelper$4 r1 = new androidx.recyclerview.widget.ItemTouchHelper$4
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            return
    }

    void removeChildDrawingOrderCallbackIfNecessary(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.mOverdrawChild
            if (r2 != r0) goto L10
            r2 = 0
            r1.mOverdrawChild = r2
            androidx.recyclerview.widget.RecyclerView$ChildDrawingOrderCallback r0 = r1.mChildDrawingOrderCallback
            if (r0 == 0) goto L10
            androidx.recyclerview.widget.RecyclerView r0 = r1.mRecyclerView
            r0.setChildDrawingOrderCallback(r2)
        L10:
            return
    }

    boolean scrollIfNecessary() {
            r16 = this;
            r0 = r16
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r0.mSelected
            r2 = 0
            r3 = -9223372036854775808
            if (r1 != 0) goto Lc
            r0.mDragScrollStartTimeInMs = r3
            return r2
        Lc:
            long r5 = java.lang.System.currentTimeMillis()
            long r7 = r0.mDragScrollStartTimeInMs
            int r1 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r1 != 0) goto L19
            r7 = 0
            goto L1b
        L19:
            long r7 = r5 - r7
        L1b:
            androidx.recyclerview.widget.RecyclerView r1 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r1.getLayoutManager()
            android.graphics.Rect r9 = r0.mTmpRect
            if (r9 != 0) goto L2c
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r0.mTmpRect = r9
        L2c:
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r0.mSelected
            android.view.View r9 = r9.itemView
            android.graphics.Rect r10 = r0.mTmpRect
            r1.calculateItemDecorationsForChild(r9, r10)
            boolean r9 = r1.canScrollHorizontally()
            r10 = 0
            if (r9 == 0) goto L7d
            float r9 = r0.mSelectedStartX
            float r11 = r0.mDx
            float r9 = r9 + r11
            int r9 = (int) r9
            android.graphics.Rect r11 = r0.mTmpRect
            int r11 = r11.left
            int r11 = r9 - r11
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r12 = r12.getPaddingLeft()
            int r11 = r11 - r12
            float r12 = r0.mDx
            int r13 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r13 >= 0) goto L59
            if (r11 >= 0) goto L59
            r12 = r11
            goto L7e
        L59:
            int r11 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r11 <= 0) goto L7d
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            int r9 = r9 + r11
            android.graphics.Rect r11 = r0.mTmpRect
            int r11 = r11.right
            int r9 = r9 + r11
            androidx.recyclerview.widget.RecyclerView r11 = r0.mRecyclerView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r12 = r12.getPaddingRight()
            int r11 = r11 - r12
            int r9 = r9 - r11
            if (r9 <= 0) goto L7d
            r12 = r9
            goto L7e
        L7d:
            r12 = r2
        L7e:
            boolean r1 = r1.canScrollVertically()
            if (r1 == 0) goto Lc4
            float r1 = r0.mSelectedStartY
            float r9 = r0.mDy
            float r1 = r1 + r9
            int r1 = (int) r1
            android.graphics.Rect r9 = r0.mTmpRect
            int r9 = r9.top
            int r9 = r1 - r9
            androidx.recyclerview.widget.RecyclerView r11 = r0.mRecyclerView
            int r11 = r11.getPaddingTop()
            int r9 = r9 - r11
            float r11 = r0.mDy
            int r13 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r13 >= 0) goto La1
            if (r9 >= 0) goto La1
            r1 = r9
            goto Lc5
        La1:
            int r9 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r9 <= 0) goto Lc4
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r0.mSelected
            android.view.View r9 = r9.itemView
            int r9 = r9.getHeight()
            int r1 = r1 + r9
            android.graphics.Rect r9 = r0.mTmpRect
            int r9 = r9.bottom
            int r1 = r1 + r9
            androidx.recyclerview.widget.RecyclerView r9 = r0.mRecyclerView
            int r9 = r9.getHeight()
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            int r10 = r10.getPaddingBottom()
            int r9 = r9 - r10
            int r1 = r1 - r9
            if (r1 <= 0) goto Lc4
            goto Lc5
        Lc4:
            r1 = r2
        Lc5:
            if (r12 == 0) goto Lde
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getWidth()
            androidx.recyclerview.widget.RecyclerView r13 = r0.mRecyclerView
            int r13 = r13.getWidth()
            r14 = r7
            int r12 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
        Lde:
            r14 = r12
            if (r1 == 0) goto Lfd
            androidx.recyclerview.widget.ItemTouchHelper$Callback r9 = r0.mCallback
            androidx.recyclerview.widget.RecyclerView r10 = r0.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$ViewHolder r11 = r0.mSelected
            android.view.View r11 = r11.itemView
            int r11 = r11.getHeight()
            androidx.recyclerview.widget.RecyclerView r12 = r0.mRecyclerView
            int r13 = r12.getHeight()
            r12 = r1
            r1 = r14
            r14 = r7
            int r7 = r9.interpolateOutOfBoundsScroll(r10, r11, r12, r13, r14)
            r12 = r1
            r1 = r7
            goto Lfe
        Lfd:
            r12 = r14
        Lfe:
            if (r12 != 0) goto L106
            if (r1 == 0) goto L103
            goto L106
        L103:
            r0.mDragScrollStartTimeInMs = r3
            return r2
        L106:
            long r7 = r0.mDragScrollStartTimeInMs
            int r2 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r2 != 0) goto L10e
            r0.mDragScrollStartTimeInMs = r5
        L10e:
            androidx.recyclerview.widget.RecyclerView r2 = r0.mRecyclerView
            r2.scrollBy(r12, r1)
            r1 = 1
            return r1
    }

    void select(androidx.recyclerview.widget.RecyclerView.ViewHolder r24, int r25) {
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$ViewHolder r0 = r11.mSelected
            if (r12 != r0) goto Lf
            int r0 = r11.mActionState
            if (r13 != r0) goto Lf
            return
        Lf:
            r0 = -9223372036854775808
            r11.mDragScrollStartTimeInMs = r0
            int r4 = r11.mActionState
            r14 = 1
            r11.endRecoverAnimation(r12, r14)
            r11.mActionState = r13
            r15 = 2
            if (r13 != r15) goto L30
            if (r12 == 0) goto L28
            android.view.View r0 = r12.itemView
            r11.mOverdrawChild = r0
            r23.addChildDrawingOrderCallback()
            goto L30
        L28:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L30:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + (-1)
            androidx.recyclerview.widget.RecyclerView$ViewHolder r9 = r11.mSelected
            r8 = 0
            if (r9 == 0) goto Led
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto Ld9
            if (r4 != r15) goto L4a
            r7 = r8
            goto L4f
        L4a:
            int r0 = r11.swipeIfNecessary(r9)
            r7 = r0
        L4f:
            r23.releaseVelocityTracker()
            r0 = 4
            r1 = 0
            if (r7 == r14) goto L7c
            if (r7 == r15) goto L7c
            if (r7 == r0) goto L69
            if (r7 == r10) goto L69
            r2 = 16
            if (r7 == r2) goto L69
            r2 = 32
            if (r7 == r2) goto L69
            r17 = r1
            r18 = r17
            goto L8e
        L69:
            float r2 = r11.mDx
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.mRecyclerView
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L8e
        L7c:
            float r2 = r11.mDy
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.mRecyclerView
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L8e:
            if (r4 != r15) goto L92
            r6 = r10
            goto L97
        L92:
            if (r7 <= 0) goto L96
            r6 = r15
            goto L97
        L96:
            r6 = r0
        L97:
            float[] r0 = r11.mTmpPosition
            r11.getSelectedDxDy(r0)
            float[] r0 = r11.mTmpPosition
            r19 = r0[r8]
            r20 = r0[r14]
            androidx.recyclerview.widget.ItemTouchHelper$3 r5 = new androidx.recyclerview.widget.ItemTouchHelper$3
            r0 = r5
            r1 = r23
            r2 = r9
            r3 = r6
            r14 = r5
            r5 = r19
            r15 = r6
            r6 = r20
            r21 = r7
            r7 = r17
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r11.mRecyclerView
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            r14.setDuration(r0)
            java.util.List<androidx.recyclerview.widget.ItemTouchHelper$RecoverAnimation> r0 = r11.mRecoverAnimations
            r0.add(r14)
            r14.start()
            r8 = 1
            goto Le9
        Ld9:
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.removeChildDrawingOrderCallbackIfNecessary(r1)
            androidx.recyclerview.widget.ItemTouchHelper$Callback r1 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r2 = r11.mRecyclerView
            r1.clearView(r2, r0)
            r8 = 0
        Le9:
            r0 = 0
            r11.mSelected = r0
            goto Lf0
        Led:
            r21 = r10
            r8 = 0
        Lf0:
            if (r12 == 0) goto L121
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r11.mRecyclerView
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.mActionState
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.mSelectedFlags = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.mSelectedStartX = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.mSelectedStartY = r0
            r11.mSelected = r12
            r0 = 2
            if (r13 != r0) goto L121
            android.view.View r0 = r12.itemView
            r1 = 0
            r0.performHapticFeedback(r1)
            goto L122
        L121:
            r1 = 0
        L122:
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L134
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r11.mSelected
            if (r2 == 0) goto L130
            r14 = 1
            goto L131
        L130:
            r14 = r1
        L131:
            r0.requestDisallowInterceptTouchEvent(r14)
        L134:
            if (r8 != 0) goto L13f
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L13f:
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r11.mCallback
            androidx.recyclerview.widget.RecyclerView$ViewHolder r1 = r11.mSelected
            int r2 = r11.mActionState
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.mRecyclerView
            r0.invalidate()
            return
    }

    public void startDrag(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r3.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            boolean r0 = r0.hasDragFlag(r1, r4)
            java.lang.String r1 = "ItemTouchHelper"
            if (r0 != 0) goto L12
            java.lang.String r4 = "Start drag has been called but dragging is not enabled"
            android.util.Log.e(r1, r4)
            return
        L12:
            android.view.View r0 = r4.itemView
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r2 = r3.mRecyclerView
            if (r0 == r2) goto L22
            java.lang.String r4 = "Start drag has been called with a view holder which is not a child of the RecyclerView which is controlled by this ItemTouchHelper."
            android.util.Log.e(r1, r4)
            return
        L22:
            r3.obtainVelocityTracker()
            r0 = 0
            r3.mDy = r0
            r3.mDx = r0
            r0 = 2
            r3.select(r4, r0)
            return
    }

    public void startSwipe(androidx.recyclerview.widget.RecyclerView.ViewHolder r4) {
            r3 = this;
            androidx.recyclerview.widget.ItemTouchHelper$Callback r0 = r3.mCallback
            androidx.recyclerview.widget.RecyclerView r1 = r3.mRecyclerView
            boolean r0 = r0.hasSwipeFlag(r1, r4)
            java.lang.String r1 = "ItemTouchHelper"
            if (r0 != 0) goto L12
            java.lang.String r4 = "Start swipe has been called but swiping is not enabled"
            android.util.Log.e(r1, r4)
            return
        L12:
            android.view.View r0 = r4.itemView
            android.view.ViewParent r0 = r0.getParent()
            androidx.recyclerview.widget.RecyclerView r2 = r3.mRecyclerView
            if (r0 == r2) goto L22
            java.lang.String r4 = "Start swipe has been called with a view holder which is not a child of the RecyclerView controlled by this ItemTouchHelper."
            android.util.Log.e(r1, r4)
            return
        L22:
            r3.obtainVelocityTracker()
            r0 = 0
            r3.mDy = r0
            r3.mDx = r0
            r0 = 1
            r3.select(r4, r0)
            return
    }

    void updateDxDy(android.view.MotionEvent r2, int r3, int r4) {
            r1 = this;
            float r0 = r2.getX(r4)
            float r2 = r2.getY(r4)
            float r4 = r1.mInitialTouchX
            float r0 = r0 - r4
            r1.mDx = r0
            float r4 = r1.mInitialTouchY
            float r2 = r2 - r4
            r1.mDy = r2
            r2 = r3 & 4
            r4 = 0
            if (r2 != 0) goto L1d
            float r2 = java.lang.Math.max(r4, r0)
            r1.mDx = r2
        L1d:
            r2 = r3 & 8
            if (r2 != 0) goto L29
            float r2 = r1.mDx
            float r2 = java.lang.Math.min(r4, r2)
            r1.mDx = r2
        L29:
            r2 = r3 & 1
            if (r2 != 0) goto L35
            float r2 = r1.mDy
            float r2 = java.lang.Math.max(r4, r2)
            r1.mDy = r2
        L35:
            r2 = r3 & 2
            if (r2 != 0) goto L41
            float r2 = r1.mDy
            float r2 = java.lang.Math.min(r4, r2)
            r1.mDy = r2
        L41:
            return
    }
}
