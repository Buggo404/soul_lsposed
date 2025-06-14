package androidx.viewpager.widget;

/* loaded from: classes.dex */
public class ViewPager extends android.view.ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final java.util.Comparator<androidx.viewpager.widget.ViewPager.ItemInfo> COMPARATOR = null;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    static final int[] LAYOUT_ATTRS = null;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final java.lang.String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private static final android.view.animation.Interpolator sInterpolator = null;
    private static final androidx.viewpager.widget.ViewPager.ViewPositionComparator sPositionComparator = null;
    private int mActivePointerId;
    androidx.viewpager.widget.PagerAdapter mAdapter;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnAdapterChangeListener> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private java.util.ArrayList<android.view.View> mDrawingOrderedChildren;
    private final java.lang.Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final java.util.ArrayList<androidx.viewpager.widget.ViewPager.ItemInfo> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private android.widget.EdgeEffect mLeftEdge;
    private android.graphics.drawable.Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private androidx.viewpager.widget.ViewPager.PagerObserver mObserver;
    private int mOffscreenPageLimit;
    private androidx.viewpager.widget.ViewPager.OnPageChangeListener mOnPageChangeListener;
    private java.util.List<androidx.viewpager.widget.ViewPager.OnPageChangeListener> mOnPageChangeListeners;
    private int mPageMargin;
    private androidx.viewpager.widget.ViewPager.PageTransformer mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private android.os.Parcelable mRestoredAdapterState;
    private java.lang.ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private android.widget.EdgeEffect mRightEdge;
    private int mScrollState;
    private android.widget.Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final androidx.viewpager.widget.ViewPager.ItemInfo mTempItem;
    private final android.graphics.Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private android.view.VelocityTracker mVelocityTracker;





    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE})
    @java.lang.annotation.Inherited
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
    public @interface DecorView {
    }

    static class ItemInfo {
        java.lang.Object object;
        float offset;
        int position;
        boolean scrolling;
        float widthFactor;

        ItemInfo() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {
        int childIndex;
        public int gravity;
        public boolean isDecor;
        boolean needsMeasure;
        int position;
        float widthFactor;

        public LayoutParams() {
                r1 = this;
                r0 = -1
                r1.<init>(r0, r0)
                r0 = 0
                r1.widthFactor = r0
                return
        }

        public LayoutParams(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                r0 = 0
                r1.widthFactor = r0
                int[] r0 = androidx.viewpager.widget.ViewPager.LAYOUT_ATTRS
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                r3 = 0
                r0 = 48
                int r3 = r2.getInteger(r3, r0)
                r1.gravity = r3
                r2.recycle()
                return
        }
    }

    class MyAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        final /* synthetic */ androidx.viewpager.widget.ViewPager this$0;

        MyAccessibilityDelegate(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        private boolean canScroll() {
                r2 = this;
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                if (r0 == 0) goto L12
                androidx.viewpager.widget.ViewPager r0 = r2.this$0
                androidx.viewpager.widget.PagerAdapter r0 = r0.mAdapter
                int r0 = r0.getCount()
                r1 = 1
                if (r0 <= r1) goto L12
                goto L13
            L12:
                r1 = 0
            L13:
                return r1
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r2, android.view.accessibility.AccessibilityEvent r3) {
                r1 = this;
                super.onInitializeAccessibilityEvent(r2, r3)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r2 = r2.getName()
                r3.setClassName(r2)
                boolean r2 = r1.canScroll()
                r3.setScrollable(r2)
                int r2 = r3.getEventType()
                r0 = 4096(0x1000, float:5.74E-42)
                if (r2 != r0) goto L3a
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                androidx.viewpager.widget.PagerAdapter r2 = r2.mAdapter
                if (r2 == 0) goto L3a
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                androidx.viewpager.widget.PagerAdapter r2 = r2.mAdapter
                int r2 = r2.getCount()
                r3.setItemCount(r2)
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                int r2 = r2.mCurItem
                r3.setFromIndex(r2)
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                int r2 = r2.mCurItem
                r3.setToIndex(r2)
            L3a:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r1 = this;
                super.onInitializeAccessibilityNodeInfo(r2, r3)
                java.lang.Class<androidx.viewpager.widget.ViewPager> r2 = androidx.viewpager.widget.ViewPager.class
                java.lang.String r2 = r2.getName()
                r3.setClassName(r2)
                boolean r2 = r1.canScroll()
                r3.setScrollable(r2)
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                r0 = 1
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 == 0) goto L21
                r2 = 4096(0x1000, float:5.74E-42)
                r3.addAction(r2)
            L21:
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                r0 = -1
                boolean r2 = r2.canScrollHorizontally(r0)
                if (r2 == 0) goto L2f
                r2 = 8192(0x2000, float:1.14794E-41)
                r3.addAction(r2)
            L2f:
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(android.view.View r2, int r3, android.os.Bundle r4) {
                r1 = this;
                boolean r2 = super.performAccessibilityAction(r2, r3, r4)
                r4 = 1
                if (r2 == 0) goto L8
                return r4
            L8:
                r2 = 4096(0x1000, float:5.74E-42)
                r0 = 0
                if (r3 == r2) goto L25
                r2 = 8192(0x2000, float:1.14794E-41)
                if (r3 == r2) goto L12
                return r0
            L12:
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                r3 = -1
                boolean r2 = r2.canScrollHorizontally(r3)
                if (r2 == 0) goto L24
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                int r3 = r2.mCurItem
                int r3 = r3 - r4
                r2.setCurrentItem(r3)
                return r4
            L24:
                return r0
            L25:
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                boolean r2 = r2.canScrollHorizontally(r4)
                if (r2 == 0) goto L36
                androidx.viewpager.widget.ViewPager r2 = r1.this$0
                int r3 = r2.mCurItem
                int r3 = r3 + r4
                r2.setCurrentItem(r3)
                return r4
            L36:
                return r0
        }
    }

    public interface OnAdapterChangeListener {
        void onAdapterChanged(androidx.viewpager.widget.ViewPager r1, androidx.viewpager.widget.PagerAdapter r2, androidx.viewpager.widget.PagerAdapter r3);
    }

    public interface OnPageChangeListener {
        void onPageScrollStateChanged(int r1);

        void onPageScrolled(int r1, float r2, int r3);

        void onPageSelected(int r1);
    }

    public interface PageTransformer {
        void transformPage(android.view.View r1, float r2);
    }

    private class PagerObserver extends android.database.DataSetObserver {
        final /* synthetic */ androidx.viewpager.widget.ViewPager this$0;

        PagerObserver(androidx.viewpager.widget.ViewPager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
                r1 = this;
                androidx.viewpager.widget.ViewPager r0 = r1.this$0
                r0.dataSetChanged()
                return
        }
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.viewpager.widget.ViewPager.SavedState> CREATOR = null;
        android.os.Parcelable adapterState;
        java.lang.ClassLoader loader;
        int position;


        static {
                androidx.viewpager.widget.ViewPager$SavedState$1 r0 = new androidx.viewpager.widget.ViewPager$SavedState$1
                r0.<init>()
                androidx.viewpager.widget.ViewPager.SavedState.CREATOR = r0
                return
        }

        SavedState(android.os.Parcel r2, java.lang.ClassLoader r3) {
                r1 = this;
                r1.<init>(r2, r3)
                if (r3 != 0) goto Ld
                java.lang.Class r3 = r1.getClass()
                java.lang.ClassLoader r3 = r3.getClassLoader()
            Ld:
                int r0 = r2.readInt()
                r1.position = r0
                android.os.Parcelable r2 = r2.readParcelable(r3)
                r1.adapterState = r2
                r1.loader = r3
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "FragmentPager.SavedState{"
                r0.<init>(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = " position="
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r2.position
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r1 = "}"
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r2, int r3) {
                r1 = this;
                super.writeToParcel(r2, r3)
                int r0 = r1.position
                r2.writeInt(r0)
                android.os.Parcelable r0 = r1.adapterState
                r2.writeParcelable(r0, r3)
                return
        }
    }

    public static class SimpleOnPageChangeListener implements androidx.viewpager.widget.ViewPager.OnPageChangeListener {
        public SimpleOnPageChangeListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int r1) {
                r0 = this;
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int r1, float r2, int r3) {
                r0 = this;
                return
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int r1) {
                r0 = this;
                return
        }
    }

    static class ViewPositionComparator implements java.util.Comparator<android.view.View> {
        ViewPositionComparator() {
                r0 = this;
                r0.<init>()
                return
        }

        /* renamed from: compare, reason: avoid collision after fix types in other method */
        public int compare2(android.view.View r3, android.view.View r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
                androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
                boolean r0 = r3.isDecor
                boolean r1 = r4.isDecor
                if (r0 == r1) goto L1a
                boolean r3 = r3.isDecor
                if (r3 == 0) goto L18
                r3 = 1
                goto L19
            L18:
                r3 = -1
            L19:
                return r3
            L1a:
                int r3 = r3.position
                int r4 = r4.position
                int r3 = r3 - r4
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(android.view.View r1, android.view.View r2) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                android.view.View r2 = (android.view.View) r2
                int r1 = r0.compare2(r1, r2)
                return r1
        }
    }

    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842931(0x10100b3, float:2.369406E-38)
            r0[r1] = r2
            androidx.viewpager.widget.ViewPager.LAYOUT_ATTRS = r0
            androidx.viewpager.widget.ViewPager$1 r0 = new androidx.viewpager.widget.ViewPager$1
            r0.<init>()
            androidx.viewpager.widget.ViewPager.COMPARATOR = r0
            androidx.viewpager.widget.ViewPager$2 r0 = new androidx.viewpager.widget.ViewPager$2
            r0.<init>()
            androidx.viewpager.widget.ViewPager.sInterpolator = r0
            androidx.viewpager.widget.ViewPager$ViewPositionComparator r0 = new androidx.viewpager.widget.ViewPager$ViewPositionComparator
            r0.<init>()
            androidx.viewpager.widget.ViewPager.sPositionComparator = r0
            return
    }

    public ViewPager(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.mItems = r2
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r2.<init>()
            r1.mTempItem = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.mTempRect = r2
            r2 = -1
            r1.mRestoredCurItem = r2
            r0 = 0
            r1.mRestoredAdapterState = r0
            r1.mRestoredClassLoader = r0
            r0 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r1.mFirstOffset = r0
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r1.mLastOffset = r0
            r0 = 1
            r1.mOffscreenPageLimit = r0
            r1.mActivePointerId = r2
            r1.mFirstLayout = r0
            r2 = 0
            r1.mNeedCalculatePageOffsets = r2
            androidx.viewpager.widget.ViewPager$3 r0 = new androidx.viewpager.widget.ViewPager$3
            r0.<init>(r1)
            r1.mEndScrollRunnable = r0
            r1.mScrollState = r2
            r1.initViewPager()
            return
    }

    public ViewPager(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mItems = r1
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r1.<init>()
            r0.mTempItem = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.mTempRect = r1
            r1 = -1
            r0.mRestoredCurItem = r1
            r2 = 0
            r0.mRestoredAdapterState = r2
            r0.mRestoredClassLoader = r2
            r2 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r0.mFirstOffset = r2
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r0.mLastOffset = r2
            r2 = 1
            r0.mOffscreenPageLimit = r2
            r0.mActivePointerId = r1
            r0.mFirstLayout = r2
            r1 = 0
            r0.mNeedCalculatePageOffsets = r1
            androidx.viewpager.widget.ViewPager$3 r2 = new androidx.viewpager.widget.ViewPager$3
            r2.<init>(r0)
            r0.mEndScrollRunnable = r2
            r0.mScrollState = r1
            r0.initViewPager()
            return
    }

    private void calculatePageOffsets(androidx.viewpager.widget.ViewPager.ItemInfo r11, int r12, androidx.viewpager.widget.ViewPager.ItemInfo r13) {
            r10 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r10.mAdapter
            int r0 = r0.getCount()
            int r1 = r10.getClientWidth()
            if (r1 <= 0) goto L12
            int r2 = r10.mPageMargin
            float r2 = (float) r2
            float r1 = (float) r1
            float r2 = r2 / r1
            goto L13
        L12:
            r2 = 0
        L13:
            r1 = 0
            if (r13 == 0) goto Lb1
            int r3 = r13.position
            int r4 = r11.position
            if (r3 >= r4) goto L6a
            float r4 = r13.offset
            float r13 = r13.widthFactor
            float r4 = r4 + r13
            float r4 = r4 + r2
            int r3 = r3 + 1
            r13 = r1
        L25:
            int r5 = r11.position
            if (r3 > r5) goto Lb1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r10.mItems
            int r5 = r5.size()
            if (r13 >= r5) goto Lb1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r10.mItems
            java.lang.Object r5 = r5.get(r13)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L39:
            int r6 = r5.position
            if (r3 <= r6) goto L52
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r6 = r10.mItems
            int r6 = r6.size()
            int r6 = r6 + (-1)
            if (r13 >= r6) goto L52
            int r13 = r13 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r10.mItems
            java.lang.Object r5 = r5.get(r13)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L39
        L52:
            int r6 = r5.position
            if (r3 >= r6) goto L61
            androidx.viewpager.widget.PagerAdapter r6 = r10.mAdapter
            float r6 = r6.getPageWidth(r3)
            float r6 = r6 + r2
            float r4 = r4 + r6
            int r3 = r3 + 1
            goto L52
        L61:
            r5.offset = r4
            float r5 = r5.widthFactor
            float r5 = r5 + r2
            float r4 = r4 + r5
            int r3 = r3 + 1
            goto L25
        L6a:
            int r4 = r11.position
            if (r3 <= r4) goto Lb1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r10.mItems
            int r4 = r4.size()
            int r4 = r4 + (-1)
            float r13 = r13.offset
            int r3 = r3 + (-1)
        L7a:
            int r5 = r11.position
            if (r3 < r5) goto Lb1
            if (r4 < 0) goto Lb1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r10.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L88:
            int r6 = r5.position
            if (r3 >= r6) goto L99
            if (r4 <= 0) goto L99
            int r4 = r4 + (-1)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r10.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L88
        L99:
            int r6 = r5.position
            if (r3 <= r6) goto La8
            androidx.viewpager.widget.PagerAdapter r6 = r10.mAdapter
            float r6 = r6.getPageWidth(r3)
            float r6 = r6 + r2
            float r13 = r13 - r6
            int r3 = r3 + (-1)
            goto L99
        La8:
            float r6 = r5.widthFactor
            float r6 = r6 + r2
            float r13 = r13 - r6
            r5.offset = r13
            int r3 = r3 + (-1)
            goto L7a
        Lb1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r13 = r10.mItems
            int r13 = r13.size()
            float r3 = r11.offset
            int r4 = r11.position
            int r4 = r4 + (-1)
            int r5 = r11.position
            if (r5 != 0) goto Lc4
            float r5 = r11.offset
            goto Lc7
        Lc4:
            r5 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
        Lc7:
            r10.mFirstOffset = r5
            int r5 = r11.position
            int r0 = r0 + (-1)
            r6 = 1065353216(0x3f800000, float:1.0)
            if (r5 != r0) goto Ld8
            float r5 = r11.offset
            float r7 = r11.widthFactor
            float r5 = r5 + r7
            float r5 = r5 - r6
            goto Ldb
        Ld8:
            r5 = 2139095039(0x7f7fffff, float:3.4028235E38)
        Ldb:
            r10.mLastOffset = r5
            int r5 = r12 + (-1)
        Ldf:
            if (r5 < 0) goto L10a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r10.mItems
            java.lang.Object r7 = r7.get(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
        Le9:
            int r8 = r7.position
            if (r4 <= r8) goto Lf9
            androidx.viewpager.widget.PagerAdapter r8 = r10.mAdapter
            int r9 = r4 + (-1)
            float r4 = r8.getPageWidth(r4)
            float r4 = r4 + r2
            float r3 = r3 - r4
            r4 = r9
            goto Le9
        Lf9:
            float r8 = r7.widthFactor
            float r8 = r8 + r2
            float r3 = r3 - r8
            r7.offset = r3
            int r7 = r7.position
            if (r7 != 0) goto L105
            r10.mFirstOffset = r3
        L105:
            int r5 = r5 + (-1)
            int r4 = r4 + (-1)
            goto Ldf
        L10a:
            float r3 = r11.offset
            float r4 = r11.widthFactor
            float r3 = r3 + r4
            float r3 = r3 + r2
            int r11 = r11.position
            int r11 = r11 + 1
            int r12 = r12 + 1
        L116:
            if (r12 >= r13) goto L145
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r10.mItems
            java.lang.Object r4 = r4.get(r12)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
        L120:
            int r5 = r4.position
            if (r11 >= r5) goto L130
            androidx.viewpager.widget.PagerAdapter r5 = r10.mAdapter
            int r7 = r11 + 1
            float r11 = r5.getPageWidth(r11)
            float r11 = r11 + r2
            float r3 = r3 + r11
            r11 = r7
            goto L120
        L130:
            int r5 = r4.position
            if (r5 != r0) goto L13a
            float r5 = r4.widthFactor
            float r5 = r5 + r3
            float r5 = r5 - r6
            r10.mLastOffset = r5
        L13a:
            r4.offset = r3
            float r4 = r4.widthFactor
            float r4 = r4 + r2
            float r3 = r3 + r4
            int r12 = r12 + 1
            int r11 = r11 + 1
            goto L116
        L145:
            r10.mNeedCalculatePageOffsets = r1
            return
    }

    private void completeScroll(boolean r8) {
            r7 = this;
            int r0 = r7.mScrollState
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r3
        La:
            if (r0 == 0) goto L3d
            r7.setScrollingCacheEnabled(r3)
            android.widget.Scroller r1 = r7.mScroller
            boolean r1 = r1.isFinished()
            r1 = r1 ^ r2
            if (r1 == 0) goto L3d
            android.widget.Scroller r1 = r7.mScroller
            r1.abortAnimation()
            int r1 = r7.getScrollX()
            int r4 = r7.getScrollY()
            android.widget.Scroller r5 = r7.mScroller
            int r5 = r5.getCurrX()
            android.widget.Scroller r6 = r7.mScroller
            int r6 = r6.getCurrY()
            if (r1 != r5) goto L35
            if (r4 == r6) goto L3d
        L35:
            r7.scrollTo(r5, r6)
            if (r5 == r1) goto L3d
            r7.pageScrolled(r5)
        L3d:
            r7.mPopulatePending = r3
            r1 = r3
        L40:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r7.mItems
            int r4 = r4.size()
            if (r1 >= r4) goto L5a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r7.mItems
            java.lang.Object r4 = r4.get(r1)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
            boolean r5 = r4.scrolling
            if (r5 == 0) goto L57
            r4.scrolling = r3
            r0 = r2
        L57:
            int r1 = r1 + 1
            goto L40
        L5a:
            if (r0 == 0) goto L69
            if (r8 == 0) goto L64
            java.lang.Runnable r8 = r7.mEndScrollRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r7, r8)
            goto L69
        L64:
            java.lang.Runnable r8 = r7.mEndScrollRunnable
            r8.run()
        L69:
            return
    }

    private int determineTargetPage(int r2, float r3, int r4, int r5) {
            r1 = this;
            int r5 = java.lang.Math.abs(r5)
            int r0 = r1.mFlingDistance
            if (r5 <= r0) goto L16
            int r5 = java.lang.Math.abs(r4)
            int r0 = r1.mMinimumVelocity
            if (r5 <= r0) goto L16
            if (r4 <= 0) goto L13
            goto L24
        L13:
            int r2 = r2 + 1
            goto L24
        L16:
            int r4 = r1.mCurItem
            if (r2 < r4) goto L1e
            r4 = 1053609165(0x3ecccccd, float:0.4)
            goto L21
        L1e:
            r4 = 1058642330(0x3f19999a, float:0.6)
        L21:
            float r3 = r3 + r4
            int r3 = (int) r3
            int r2 = r2 + r3
        L24:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r1.mItems
            int r3 = r3.size()
            if (r3 <= 0) goto L4f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r1.mItems
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = (androidx.viewpager.widget.ViewPager.ItemInfo) r3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r1.mItems
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.Object r4 = r4.get(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
            int r3 = r3.position
            int r4 = r4.position
            int r2 = java.lang.Math.min(r2, r4)
            int r2 = java.lang.Math.max(r3, r2)
        L4f:
            return r2
    }

    private void dispatchOnPageScrolled(int r4, float r5, int r6) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L7
            r0.onPageScrolled(r4, r5, r6)
        L7:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L1f
            r2.onPageScrolled(r4, r5, r6)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L29
            r0.onPageScrolled(r4, r5, r6)
        L29:
            return
    }

    private void dispatchOnPageSelected(int r4) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L7
            r0.onPageSelected(r4)
        L7:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L1f
            r2.onPageSelected(r4)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L29
            r0.onPageSelected(r4)
        L29:
            return
    }

    private void dispatchOnScrollStateChanged(int r4) {
            r3 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mOnPageChangeListener
            if (r0 == 0) goto L7
            r0.onPageScrollStateChanged(r4)
        L7:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r3.mOnPageChangeListeners
            if (r0 == 0) goto L22
            int r0 = r0.size()
            r1 = 0
        L10:
            if (r1 >= r0) goto L22
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r2 = r3.mOnPageChangeListeners
            java.lang.Object r2 = r2.get(r1)
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r2 = (androidx.viewpager.widget.ViewPager.OnPageChangeListener) r2
            if (r2 == 0) goto L1f
            r2.onPageScrollStateChanged(r4)
        L1f:
            int r1 = r1 + 1
            goto L10
        L22:
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r3.mInternalPageChangeListener
            if (r0 == 0) goto L29
            r0.onPageScrollStateChanged(r4)
        L29:
            return
    }

    private void enableLayers(boolean r7) {
            r6 = this;
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L19
            if (r7 == 0) goto Ld
            int r3 = r6.mPageTransformerLayerType
            goto Le
        Ld:
            r3 = r1
        Le:
            android.view.View r4 = r6.getChildAt(r2)
            r5 = 0
            r4.setLayerType(r3, r5)
            int r2 = r2 + 1
            goto L6
        L19:
            return
    }

    private void endDrag() {
            r1 = this;
            r0 = 0
            r1.mIsBeingDragged = r0
            r1.mIsUnableToDrag = r0
            android.view.VelocityTracker r0 = r1.mVelocityTracker
            if (r0 == 0) goto Lf
            r0.recycle()
            r0 = 0
            r1.mVelocityTracker = r0
        Lf:
            return
    }

    private android.graphics.Rect getChildRectInPagerCoordinates(android.graphics.Rect r3, android.view.View r4) {
            r2 = this;
            if (r3 != 0) goto L7
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
        L7:
            if (r4 != 0) goto Le
            r4 = 0
            r3.set(r4, r4, r4, r4)
            return r3
        Le:
            int r0 = r4.getLeft()
            r3.left = r0
            int r0 = r4.getRight()
            r3.right = r0
            int r0 = r4.getTop()
            r3.top = r0
            int r0 = r4.getBottom()
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
        L2a:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L5b
            if (r4 == r2) goto L5b
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.left
            int r1 = r4.getLeft()
            int r0 = r0 + r1
            r3.left = r0
            int r0 = r3.right
            int r1 = r4.getRight()
            int r0 = r0 + r1
            r3.right = r0
            int r0 = r3.top
            int r1 = r4.getTop()
            int r0 = r0 + r1
            r3.top = r0
            int r0 = r3.bottom
            int r1 = r4.getBottom()
            int r0 = r0 + r1
            r3.bottom = r0
            android.view.ViewParent r4 = r4.getParent()
            goto L2a
        L5b:
            return r3
    }

    private int getClientWidth() {
            r2 = this;
            int r0 = r2.getMeasuredWidth()
            int r1 = r2.getPaddingLeft()
            int r0 = r0 - r1
            int r1 = r2.getPaddingRight()
            int r0 = r0 - r1
            return r0
    }

    private androidx.viewpager.widget.ViewPager.ItemInfo infoForCurrentScrollPosition() {
            r13 = this;
            int r0 = r13.getClientWidth()
            r1 = 0
            if (r0 <= 0) goto Lf
            int r2 = r13.getScrollX()
            float r2 = (float) r2
            float r3 = (float) r0
            float r2 = r2 / r3
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r0 <= 0) goto L18
            int r3 = r13.mPageMargin
            float r3 = (float) r3
            float r0 = (float) r0
            float r3 = r3 / r0
            goto L19
        L18:
            r3 = r1
        L19:
            r0 = 0
            r4 = -1
            r5 = 1
            r6 = 0
            r8 = r0
            r9 = r5
            r7 = r6
            r6 = r4
            r4 = r1
        L22:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r10 = r13.mItems
            int r10 = r10.size()
            if (r8 >= r10) goto L77
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r10 = r13.mItems
            java.lang.Object r10 = r10.get(r8)
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = (androidx.viewpager.widget.ViewPager.ItemInfo) r10
            if (r9 != 0) goto L4d
            int r11 = r10.position
            int r6 = r6 + r5
            if (r11 == r6) goto L4d
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = r13.mTempItem
            float r1 = r1 + r4
            float r1 = r1 + r3
            r10.offset = r1
            r10.position = r6
            androidx.viewpager.widget.PagerAdapter r1 = r13.mAdapter
            int r4 = r10.position
            float r1 = r1.getPageWidth(r4)
            r10.widthFactor = r1
            int r8 = r8 + (-1)
        L4d:
            r6 = r10
            float r1 = r6.offset
            float r4 = r6.widthFactor
            float r4 = r4 + r1
            float r4 = r4 + r3
            if (r9 != 0) goto L5c
            int r9 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r9 < 0) goto L5b
            goto L5c
        L5b:
            return r7
        L5c:
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L76
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r13.mItems
            int r4 = r4.size()
            int r4 = r4 - r5
            if (r8 != r4) goto L6a
            goto L76
        L6a:
            int r4 = r6.position
            float r7 = r6.widthFactor
            int r8 = r8 + 1
            r9 = r0
            r12 = r6
            r6 = r4
            r4 = r7
            r7 = r12
            goto L22
        L76:
            return r6
        L77:
            return r7
    }

    private static boolean isDecorView(android.view.View r1) {
            java.lang.Class r1 = r1.getClass()
            java.lang.Class<androidx.viewpager.widget.ViewPager$DecorView> r0 = androidx.viewpager.widget.ViewPager.DecorView.class
            java.lang.annotation.Annotation r1 = r1.getAnnotation(r0)
            if (r1 == 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private boolean isGutterDrag(float r4, float r5) {
            r3 = this;
            int r0 = r3.mGutterSize
            float r0 = (float) r0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 0
            if (r0 >= 0) goto Lc
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L1c
        Lc:
            int r0 = r3.getWidth()
            int r2 = r3.mGutterSize
            int r0 = r0 - r2
            float r0 = (float) r0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L1e
            int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r4 >= 0) goto L1e
        L1c:
            r4 = 1
            goto L1f
        L1e:
            r4 = 0
        L1f:
            return r4
    }

    private void onSecondaryPointerUp(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getActionIndex()
            int r1 = r4.getPointerId(r0)
            int r2 = r3.mActivePointerId
            if (r1 != r2) goto L24
            if (r0 != 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            float r1 = r4.getX(r0)
            r3.mLastMotionX = r1
            int r4 = r4.getPointerId(r0)
            r3.mActivePointerId = r4
            android.view.VelocityTracker r4 = r3.mVelocityTracker
            if (r4 == 0) goto L24
            r4.clear()
        L24:
            return
    }

    private boolean pageScrolled(int r8) {
            r7 = this;
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r7.mItems
            int r0 = r0.size()
            java.lang.String r1 = "onPageScrolled did not call superclass implementation"
            r2 = 0
            if (r0 != 0) goto L21
            boolean r8 = r7.mFirstLayout
            if (r8 == 0) goto L10
            return r2
        L10:
            r7.mCalledSuper = r2
            r8 = 0
            r7.onPageScrolled(r2, r8, r2)
            boolean r8 = r7.mCalledSuper
            if (r8 == 0) goto L1b
            return r2
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
        L21:
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r7.infoForCurrentScrollPosition()
            int r3 = r7.getClientWidth()
            int r4 = r7.mPageMargin
            int r5 = r3 + r4
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            int r6 = r0.position
            float r8 = (float) r8
            float r8 = r8 / r3
            float r3 = r0.offset
            float r8 = r8 - r3
            float r0 = r0.widthFactor
            float r0 = r0 + r4
            float r8 = r8 / r0
            float r0 = (float) r5
            float r0 = r0 * r8
            int r0 = (int) r0
            r7.mCalledSuper = r2
            r7.onPageScrolled(r6, r8, r0)
            boolean r8 = r7.mCalledSuper
            if (r8 == 0) goto L49
            r8 = 1
            return r8
        L49:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
            throw r8
    }

    private boolean performDrag(float r10) {
            r9 = this;
            float r0 = r9.mLastMotionX
            float r0 = r0 - r10
            r9.mLastMotionX = r10
            int r10 = r9.getScrollX()
            float r10 = (float) r10
            float r10 = r10 + r0
            int r0 = r9.getClientWidth()
            float r0 = (float) r0
            float r1 = r9.mFirstOffset
            float r1 = r1 * r0
            float r2 = r9.mLastOffset
            float r2 = r2 * r0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r9.mItems
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = (androidx.viewpager.widget.ViewPager.ItemInfo) r3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r9.mItems
            int r6 = r5.size()
            r7 = 1
            int r6 = r6 - r7
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            int r6 = r3.position
            if (r6 == 0) goto L36
            float r1 = r3.offset
            float r1 = r1 * r0
            r3 = r4
            goto L37
        L36:
            r3 = r7
        L37:
            int r6 = r5.position
            androidx.viewpager.widget.PagerAdapter r8 = r9.mAdapter
            int r8 = r8.getCount()
            int r8 = r8 - r7
            if (r6 == r8) goto L47
            float r2 = r5.offset
            float r2 = r2 * r0
            r5 = r4
            goto L48
        L47:
            r5 = r7
        L48:
            int r6 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r6 >= 0) goto L5d
            if (r3 == 0) goto L5b
            float r10 = r1 - r10
            android.widget.EdgeEffect r2 = r9.mLeftEdge
            float r10 = java.lang.Math.abs(r10)
            float r10 = r10 / r0
            r2.onPull(r10)
            r4 = r7
        L5b:
            r10 = r1
            goto L70
        L5d:
            int r1 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r1 <= 0) goto L70
            if (r5 == 0) goto L6f
            float r10 = r10 - r2
            android.widget.EdgeEffect r1 = r9.mRightEdge
            float r10 = java.lang.Math.abs(r10)
            float r10 = r10 / r0
            r1.onPull(r10)
            r4 = r7
        L6f:
            r10 = r2
        L70:
            float r0 = r9.mLastMotionX
            int r1 = (int) r10
            float r2 = (float) r1
            float r10 = r10 - r2
            float r0 = r0 + r10
            r9.mLastMotionX = r0
            int r10 = r9.getScrollY()
            r9.scrollTo(r1, r10)
            r9.pageScrolled(r1)
            return r4
    }

    private void recomputeScrollPosition(int r2, int r3, int r4, int r5) {
            r1 = this;
            if (r3 <= 0) goto L49
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r1.mItems
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L49
            android.widget.Scroller r0 = r1.mScroller
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L21
            android.widget.Scroller r2 = r1.mScroller
            int r3 = r1.getCurrentItem()
            int r4 = r1.getClientWidth()
            int r3 = r3 * r4
            r2.setFinalX(r3)
            goto L79
        L21:
            int r0 = r1.getPaddingLeft()
            int r2 = r2 - r0
            int r0 = r1.getPaddingRight()
            int r2 = r2 - r0
            int r2 = r2 + r4
            int r4 = r1.getPaddingLeft()
            int r3 = r3 - r4
            int r4 = r1.getPaddingRight()
            int r3 = r3 - r4
            int r3 = r3 + r5
            int r4 = r1.getScrollX()
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            float r2 = (float) r2
            float r4 = r4 * r2
            int r2 = (int) r4
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
            goto L79
        L49:
            int r3 = r1.mCurItem
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r1.infoForPosition(r3)
            if (r3 == 0) goto L5a
            float r3 = r3.offset
            float r4 = r1.mLastOffset
            float r3 = java.lang.Math.min(r3, r4)
            goto L5b
        L5a:
            r3 = 0
        L5b:
            int r4 = r1.getPaddingLeft()
            int r2 = r2 - r4
            int r4 = r1.getPaddingRight()
            int r2 = r2 - r4
            float r2 = (float) r2
            float r3 = r3 * r2
            int r2 = (int) r3
            int r3 = r1.getScrollX()
            if (r2 == r3) goto L79
            r3 = 0
            r1.completeScroll(r3)
            int r3 = r1.getScrollY()
            r1.scrollTo(r2, r3)
        L79:
            return
    }

    private void removeNonDecorViews() {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L1d
            android.view.View r1 = r2.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r1 = (androidx.viewpager.widget.ViewPager.LayoutParams) r1
            boolean r1 = r1.isDecor
            if (r1 != 0) goto L1a
            r2.removeViewAt(r0)
            int r0 = r0 + (-1)
        L1a:
            int r0 = r0 + 1
            goto L1
        L1d:
            return
    }

    private void requestParentDisallowInterceptTouchEvent(boolean r2) {
            r1 = this;
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L9
            r0.requestDisallowInterceptTouchEvent(r2)
        L9:
            return
    }

    private boolean resetTouch() {
            r1 = this;
            r0 = -1
            r1.mActivePointerId = r0
            r1.endDrag()
            android.widget.EdgeEffect r0 = r1.mLeftEdge
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mRightEdge
            r0.onRelease()
            android.widget.EdgeEffect r0 = r1.mLeftEdge
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L23
            android.widget.EdgeEffect r0 = r1.mRightEdge
            boolean r0 = r0.isFinished()
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            goto L24
        L23:
            r0 = 1
        L24:
            return r0
    }

    private void scrollToItem(int r6, boolean r7, int r8, boolean r9) {
            r5 = this;
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = r5.infoForPosition(r6)
            r1 = 0
            if (r0 == 0) goto L1d
            int r2 = r5.getClientWidth()
            float r2 = (float) r2
            float r3 = r5.mFirstOffset
            float r0 = r0.offset
            float r4 = r5.mLastOffset
            float r0 = java.lang.Math.min(r0, r4)
            float r0 = java.lang.Math.max(r3, r0)
            float r2 = r2 * r0
            int r0 = (int) r2
            goto L1e
        L1d:
            r0 = r1
        L1e:
            if (r7 == 0) goto L29
            r5.smoothScrollTo(r0, r1, r8)
            if (r9 == 0) goto L37
            r5.dispatchOnPageSelected(r6)
            goto L37
        L29:
            if (r9 == 0) goto L2e
            r5.dispatchOnPageSelected(r6)
        L2e:
            r5.completeScroll(r1)
            r5.scrollTo(r0, r1)
            r5.pageScrolled(r0)
        L37:
            return
    }

    private void setScrollingCacheEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mScrollingCacheEnabled
            if (r0 == r2) goto L6
            r1.mScrollingCacheEnabled = r2
        L6:
            return
    }

    private void sortChildDrawingOrder() {
            r4 = this;
            int r0 = r4.mDrawingOrder
            if (r0 == 0) goto L2d
            java.util.ArrayList<android.view.View> r0 = r4.mDrawingOrderedChildren
            if (r0 != 0) goto L10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.mDrawingOrderedChildren = r0
            goto L13
        L10:
            r0.clear()
        L13:
            int r0 = r4.getChildCount()
            r1 = 0
        L18:
            if (r1 >= r0) goto L26
            android.view.View r2 = r4.getChildAt(r1)
            java.util.ArrayList<android.view.View> r3 = r4.mDrawingOrderedChildren
            r3.add(r2)
            int r1 = r1 + 1
            goto L18
        L26:
            java.util.ArrayList<android.view.View> r0 = r4.mDrawingOrderedChildren
            androidx.viewpager.widget.ViewPager$ViewPositionComparator r1 = androidx.viewpager.widget.ViewPager.sPositionComparator
            java.util.Collections.sort(r0, r1)
        L2d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r7.size()
            int r1 = r6.getDescendantFocusability()
            r2 = 393216(0x60000, float:5.51013E-40)
            if (r1 == r2) goto L2f
            r2 = 0
        Ld:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L2f
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L2c
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r6.infoForChild(r3)
            if (r4 == 0) goto L2c
            int r4 = r4.position
            int r5 = r6.mCurItem
            if (r4 != r5) goto L2c
            r3.addFocusables(r7, r8, r9)
        L2c:
            int r2 = r2 + 1
            goto Ld
        L2f:
            r8 = 262144(0x40000, float:3.67342E-40)
            if (r1 != r8) goto L39
            int r8 = r7.size()
            if (r0 != r8) goto L56
        L39:
            boolean r8 = r6.isFocusable()
            if (r8 != 0) goto L40
            return
        L40:
            r8 = 1
            r9 = r9 & r8
            if (r9 != r8) goto L51
            boolean r8 = r6.isInTouchMode()
            if (r8 == 0) goto L51
            boolean r8 = r6.isFocusableInTouchMode()
            if (r8 != 0) goto L51
            return
        L51:
            if (r7 == 0) goto L56
            r7.add(r6)
        L56:
            return
    }

    androidx.viewpager.widget.ViewPager.ItemInfo addNewItem(int r3, int r4) {
            r2 = this;
            androidx.viewpager.widget.ViewPager$ItemInfo r0 = new androidx.viewpager.widget.ViewPager$ItemInfo
            r0.<init>()
            r0.position = r3
            androidx.viewpager.widget.PagerAdapter r1 = r2.mAdapter
            java.lang.Object r1 = r1.instantiateItem(r2, r3)
            r0.object = r1
            androidx.viewpager.widget.PagerAdapter r1 = r2.mAdapter
            float r3 = r1.getPageWidth(r3)
            r0.widthFactor = r3
            if (r4 < 0) goto L28
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r2.mItems
            int r3 = r3.size()
            if (r4 < r3) goto L22
            goto L28
        L22:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r2.mItems
            r3.add(r4, r0)
            goto L2d
        L28:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r2.mItems
            r3.add(r0)
        L2d:
            return r0
    }

    public void addOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mAdapterChangeListeners = r0
        Lb:
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            r0.add(r2)
            return
    }

    public void addOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mOnPageChangeListeners = r0
        Lb:
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(java.util.ArrayList<android.view.View> r5) {
            r4 = this;
            r0 = 0
        L1:
            int r1 = r4.getChildCount()
            if (r0 >= r1) goto L23
            android.view.View r1 = r4.getChildAt(r0)
            int r2 = r1.getVisibility()
            if (r2 != 0) goto L20
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r4.infoForChild(r1)
            if (r2 == 0) goto L20
            int r2 = r2.position
            int r3 = r4.mCurItem
            if (r2 != r3) goto L20
            r1.addTouchables(r5)
        L20:
            int r0 = r0 + 1
            goto L1
        L23:
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r4, int r5, android.view.ViewGroup.LayoutParams r6) {
            r3 = this;
            boolean r0 = r3.checkLayoutParams(r6)
            if (r0 != 0) goto La
            android.view.ViewGroup$LayoutParams r6 = r3.generateLayoutParams(r6)
        La:
            r0 = r6
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r1 = r0.isDecor
            boolean r2 = isDecorView(r4)
            r1 = r1 | r2
            r0.isDecor = r1
            boolean r1 = r3.mInLayout
            if (r1 == 0) goto L30
            if (r0 == 0) goto L29
            boolean r1 = r0.isDecor
            if (r1 != 0) goto L21
            goto L29
        L21:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "Cannot add pager decor view during layout"
            r4.<init>(r5)
            throw r4
        L29:
            r1 = 1
            r0.needsMeasure = r1
            r3.addViewInLayout(r4, r5, r6)
            goto L33
        L30:
            super.addView(r4, r5, r6)
        L33:
            return
    }

    public boolean arrowScroll(int r8) {
            r7 = this;
            android.view.View r0 = r7.findFocus()
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 != r7) goto Lb
        L9:
            r0 = r3
            goto L68
        Lb:
            if (r0 == 0) goto L68
            android.view.ViewParent r4 = r0.getParent()
        L11:
            boolean r5 = r4 instanceof android.view.ViewGroup
            if (r5 == 0) goto L1e
            if (r4 != r7) goto L19
            r4 = r1
            goto L1f
        L19:
            android.view.ViewParent r4 = r4.getParent()
            goto L11
        L1e:
            r4 = r2
        L1f:
            if (r4 != 0) goto L68
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.Class r5 = r0.getClass()
            java.lang.String r5 = r5.getSimpleName()
            r4.append(r5)
            android.view.ViewParent r0 = r0.getParent()
        L35:
            boolean r5 = r0 instanceof android.view.ViewGroup
            if (r5 == 0) goto L4f
            java.lang.String r5 = " => "
            java.lang.StringBuilder r5 = r4.append(r5)
            java.lang.Class r6 = r0.getClass()
            java.lang.String r6 = r6.getSimpleName()
            r5.append(r6)
            android.view.ViewParent r0 = r0.getParent()
            goto L35
        L4f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r5 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r5)
            java.lang.String r4 = r4.toString()
            java.lang.StringBuilder r0 = r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "ViewPager"
            android.util.Log.e(r4, r0)
            goto L9
        L68:
            android.view.FocusFinder r3 = android.view.FocusFinder.getInstance()
            android.view.View r3 = r3.findNextFocus(r7, r0, r8)
            r4 = 66
            r5 = 17
            if (r3 == 0) goto Lb9
            if (r3 == r0) goto Lb9
            if (r8 != r5) goto L99
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.mTempRect
            android.graphics.Rect r2 = r7.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto L93
            if (r1 < r2) goto L93
            boolean r0 = r7.pageLeft()
            goto L97
        L93:
            boolean r0 = r3.requestFocus()
        L97:
            r2 = r0
            goto Lcc
        L99:
            if (r8 != r4) goto Lcc
            android.graphics.Rect r1 = r7.mTempRect
            android.graphics.Rect r1 = r7.getChildRectInPagerCoordinates(r1, r3)
            int r1 = r1.left
            android.graphics.Rect r2 = r7.mTempRect
            android.graphics.Rect r2 = r7.getChildRectInPagerCoordinates(r2, r0)
            int r2 = r2.left
            if (r0 == 0) goto Lb4
            if (r1 > r2) goto Lb4
            boolean r0 = r7.pageRight()
            goto L97
        Lb4:
            boolean r0 = r3.requestFocus()
            goto L97
        Lb9:
            if (r8 == r5) goto Lc8
            if (r8 != r1) goto Lbe
            goto Lc8
        Lbe:
            if (r8 == r4) goto Lc3
            r0 = 2
            if (r8 != r0) goto Lcc
        Lc3:
            boolean r2 = r7.pageRight()
            goto Lcc
        Lc8:
            boolean r2 = r7.pageLeft()
        Lcc:
            if (r2 == 0) goto Ld5
            int r8 = android.view.SoundEffectConstants.getContantForFocusDirection(r8)
            r7.playSoundEffect(r8)
        Ld5:
            return r2
    }

    public boolean beginFakeDrag() {
            r12 = this;
            boolean r0 = r12.mIsBeingDragged
            if (r0 == 0) goto L6
            r0 = 0
            return r0
        L6:
            r0 = 1
            r12.mFakeDragging = r0
            r12.setScrollState(r0)
            r1 = 0
            r12.mLastMotionX = r1
            r12.mInitialMotionX = r1
            android.view.VelocityTracker r1 = r12.mVelocityTracker
            if (r1 != 0) goto L1c
            android.view.VelocityTracker r1 = android.view.VelocityTracker.obtain()
            r12.mVelocityTracker = r1
            goto L1f
        L1c:
            r1.clear()
        L1f:
            long r10 = android.os.SystemClock.uptimeMillis()
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r2 = r10
            r4 = r10
            android.view.MotionEvent r1 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.VelocityTracker r2 = r12.mVelocityTracker
            r2.addMovement(r1)
            r1.recycle()
            r12.mFakeDragBeginTime = r10
            return r0
    }

    protected boolean canScroll(android.view.View r13, boolean r14, int r15, int r16, int r17) {
            r12 = this;
            r0 = r13
            boolean r1 = r0 instanceof android.view.ViewGroup
            r2 = 1
            if (r1 == 0) goto L52
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r3 = r13.getScrollX()
            int r4 = r13.getScrollY()
            int r5 = r1.getChildCount()
            int r5 = r5 - r2
        L16:
            if (r5 < 0) goto L52
            android.view.View r7 = r1.getChildAt(r5)
            int r6 = r16 + r3
            int r8 = r7.getLeft()
            if (r6 < r8) goto L4f
            int r8 = r7.getRight()
            if (r6 >= r8) goto L4f
            int r8 = r17 + r4
            int r9 = r7.getTop()
            if (r8 < r9) goto L4f
            int r9 = r7.getBottom()
            if (r8 >= r9) goto L4f
            r9 = 1
            int r10 = r7.getLeft()
            int r10 = r6 - r10
            int r6 = r7.getTop()
            int r11 = r8 - r6
            r6 = r12
            r8 = r9
            r9 = r15
            boolean r6 = r6.canScroll(r7, r8, r9, r10, r11)
            if (r6 == 0) goto L4f
            return r2
        L4f:
            int r5 = r5 + (-1)
            goto L16
        L52:
            if (r14 == 0) goto L5d
            r1 = r15
            int r1 = -r1
            boolean r0 = r13.canScrollHorizontally(r1)
            if (r0 == 0) goto L5d
            goto L5e
        L5d:
            r2 = 0
        L5e:
            return r2
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int r5) {
            r4 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r4.mAdapter
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r4.getClientWidth()
            int r2 = r4.getScrollX()
            r3 = 1
            if (r5 >= 0) goto L1a
            float r5 = (float) r0
            float r0 = r4.mFirstOffset
            float r5 = r5 * r0
            int r5 = (int) r5
            if (r2 <= r5) goto L19
            r1 = r3
        L19:
            return r1
        L1a:
            if (r5 <= 0) goto L24
            float r5 = (float) r0
            float r0 = r4.mLastOffset
            float r5 = r5 * r0
            int r5 = (int) r5
            if (r2 >= r5) goto L24
            r1 = r3
        L24:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.viewpager.widget.ViewPager.LayoutParams
            if (r0 == 0) goto Lc
            boolean r2 = super.checkLayoutParams(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public void clearOnPageChangeListeners() {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r4 = this;
            r0 = 1
            r4.mIsScrollStarted = r0
            android.widget.Scroller r1 = r4.mScroller
            boolean r1 = r1.isFinished()
            if (r1 != 0) goto L41
            android.widget.Scroller r1 = r4.mScroller
            boolean r1 = r1.computeScrollOffset()
            if (r1 == 0) goto L41
            int r0 = r4.getScrollX()
            int r1 = r4.getScrollY()
            android.widget.Scroller r2 = r4.mScroller
            int r2 = r2.getCurrX()
            android.widget.Scroller r3 = r4.mScroller
            int r3 = r3.getCurrY()
            if (r0 != r2) goto L2b
            if (r1 == r3) goto L3d
        L2b:
            r4.scrollTo(r2, r3)
            boolean r0 = r4.pageScrolled(r2)
            if (r0 != 0) goto L3d
            android.widget.Scroller r0 = r4.mScroller
            r0.abortAnimation()
            r0 = 0
            r4.scrollTo(r0, r3)
        L3d:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r4)
            return
        L41:
            r4.completeScroll(r0)
            return
    }

    void dataSetChanged() {
            r10 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r10.mAdapter
            int r0 = r0.getCount()
            r10.mExpectedAdapterCount = r0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r10.mItems
            int r1 = r1.size()
            int r2 = r10.mOffscreenPageLimit
            int r2 = r2 * 2
            r3 = 1
            int r2 = r2 + r3
            r4 = 0
            if (r1 >= r2) goto L21
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r10.mItems
            int r1 = r1.size()
            if (r1 >= r0) goto L21
            r1 = r3
            goto L22
        L21:
            r1 = r4
        L22:
            int r2 = r10.mCurItem
            r5 = r4
            r6 = r5
        L26:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r10.mItems
            int r7 = r7.size()
            if (r5 >= r7) goto L82
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r10.mItems
            java.lang.Object r7 = r7.get(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r7 = (androidx.viewpager.widget.ViewPager.ItemInfo) r7
            androidx.viewpager.widget.PagerAdapter r8 = r10.mAdapter
            java.lang.Object r9 = r7.object
            int r8 = r8.getItemPosition(r9)
            r9 = -1
            if (r8 != r9) goto L42
            goto L80
        L42:
            r9 = -2
            if (r8 != r9) goto L72
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r10.mItems
            r1.remove(r5)
            int r5 = r5 + (-1)
            if (r6 != 0) goto L54
            androidx.viewpager.widget.PagerAdapter r1 = r10.mAdapter
            r1.startUpdate(r10)
            r6 = r3
        L54:
            androidx.viewpager.widget.PagerAdapter r1 = r10.mAdapter
            int r8 = r7.position
            java.lang.Object r9 = r7.object
            r1.destroyItem(r10, r8, r9)
            int r1 = r10.mCurItem
            int r7 = r7.position
            if (r1 != r7) goto L70
            int r1 = r10.mCurItem
            int r2 = r0 + (-1)
            int r1 = java.lang.Math.min(r1, r2)
            int r1 = java.lang.Math.max(r4, r1)
            r2 = r1
        L70:
            r1 = r3
            goto L80
        L72:
            int r9 = r7.position
            if (r9 == r8) goto L80
            int r1 = r7.position
            int r9 = r10.mCurItem
            if (r1 != r9) goto L7d
            r2 = r8
        L7d:
            r7.position = r8
            goto L70
        L80:
            int r5 = r5 + r3
            goto L26
        L82:
            if (r6 == 0) goto L89
            androidx.viewpager.widget.PagerAdapter r0 = r10.mAdapter
            r0.finishUpdate(r10)
        L89:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r10.mItems
            java.util.Comparator<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = androidx.viewpager.widget.ViewPager.COMPARATOR
            java.util.Collections.sort(r0, r5)
            if (r1 == 0) goto Lb3
            int r0 = r10.getChildCount()
            r1 = r4
        L97:
            if (r1 >= r0) goto Lad
            android.view.View r5 = r10.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r5 = (androidx.viewpager.widget.ViewPager.LayoutParams) r5
            boolean r6 = r5.isDecor
            if (r6 != 0) goto Laa
            r6 = 0
            r5.widthFactor = r6
        Laa:
            int r1 = r1 + 1
            goto L97
        Lad:
            r10.setCurrentItemInternal(r2, r4, r3)
            r10.requestLayout()
        Lb3:
            return
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

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent r7) {
            r6 = this;
            int r0 = r7.getEventType()
            r1 = 4096(0x1000, float:5.74E-42)
            if (r0 != r1) goto Ld
            boolean r7 = super.dispatchPopulateAccessibilityEvent(r7)
            return r7
        Ld:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = r1
        L13:
            if (r2 >= r0) goto L36
            android.view.View r3 = r6.getChildAt(r2)
            int r4 = r3.getVisibility()
            if (r4 != 0) goto L33
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r6.infoForChild(r3)
            if (r4 == 0) goto L33
            int r4 = r4.position
            int r5 = r6.mCurItem
            if (r4 != r5) goto L33
            boolean r3 = r3.dispatchPopulateAccessibilityEvent(r7)
            if (r3 == 0) goto L33
            r7 = 1
            return r7
        L33:
            int r2 = r2 + 1
            goto L13
        L36:
            return r1
    }

    float distanceInfluenceForSnapDuration(float r3) {
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

    @Override // android.view.View
    public void draw(android.graphics.Canvas r8) {
            r7 = this;
            super.draw(r8)
            int r0 = r7.getOverScrollMode()
            r1 = 0
            if (r0 == 0) goto L24
            r2 = 1
            if (r0 != r2) goto L18
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            if (r0 == 0) goto L18
            int r0 = r0.getCount()
            if (r0 <= r2) goto L18
            goto L24
        L18:
            android.widget.EdgeEffect r8 = r7.mLeftEdge
            r8.finish()
            android.widget.EdgeEffect r8 = r7.mRightEdge
            r8.finish()
            goto La7
        L24:
            android.widget.EdgeEffect r0 = r7.mLeftEdge
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L64
            int r0 = r8.save()
            int r2 = r7.getHeight()
            int r3 = r7.getPaddingTop()
            int r2 = r2 - r3
            int r3 = r7.getPaddingBottom()
            int r2 = r2 - r3
            int r3 = r7.getWidth()
            r4 = 1132920832(0x43870000, float:270.0)
            r8.rotate(r4)
            int r4 = -r2
            int r5 = r7.getPaddingTop()
            int r4 = r4 + r5
            float r4 = (float) r4
            float r5 = r7.mFirstOffset
            float r6 = (float) r3
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.mLeftEdge
            r4.setSize(r2, r3)
            android.widget.EdgeEffect r2 = r7.mLeftEdge
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        L64:
            android.widget.EdgeEffect r0 = r7.mRightEdge
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto La7
            int r0 = r8.save()
            int r2 = r7.getWidth()
            int r3 = r7.getHeight()
            int r4 = r7.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r7.getPaddingBottom()
            int r3 = r3 - r4
            r4 = 1119092736(0x42b40000, float:90.0)
            r8.rotate(r4)
            int r4 = r7.getPaddingTop()
            int r4 = -r4
            float r4 = (float) r4
            float r5 = r7.mLastOffset
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = r5 + r6
            float r5 = -r5
            float r6 = (float) r2
            float r5 = r5 * r6
            r8.translate(r4, r5)
            android.widget.EdgeEffect r4 = r7.mRightEdge
            r4.setSize(r3, r2)
            android.widget.EdgeEffect r2 = r7.mRightEdge
            boolean r2 = r2.draw(r8)
            r1 = r1 | r2
            r8.restoreToCount(r0)
        La7:
            if (r1 == 0) goto Lac
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
        Lac:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            android.graphics.drawable.Drawable r0 = r2.mMarginDrawable
            if (r0 == 0) goto L14
            boolean r1 = r0.isStateful()
            if (r1 == 0) goto L14
            int[] r1 = r2.getDrawableState()
            r0.setState(r1)
        L14:
            return
    }

    public void endFakeDrag() {
            r6 = this;
            boolean r0 = r6.mFakeDragging
            if (r0 == 0) goto L47
            androidx.viewpager.widget.PagerAdapter r0 = r6.mAdapter
            if (r0 == 0) goto L40
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            int r1 = r6.mMaximumVelocity
            float r1 = (float) r1
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2, r1)
            int r1 = r6.mActivePointerId
            float r0 = r0.getXVelocity(r1)
            int r0 = (int) r0
            r1 = 1
            r6.mPopulatePending = r1
            int r2 = r6.getClientWidth()
            int r3 = r6.getScrollX()
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r6.infoForCurrentScrollPosition()
            int r5 = r4.position
            float r3 = (float) r3
            float r2 = (float) r2
            float r3 = r3 / r2
            float r2 = r4.offset
            float r3 = r3 - r2
            float r2 = r4.widthFactor
            float r3 = r3 / r2
            float r2 = r6.mLastMotionX
            float r4 = r6.mInitialMotionX
            float r2 = r2 - r4
            int r2 = (int) r2
            int r2 = r6.determineTargetPage(r5, r3, r0, r2)
            r6.setCurrentItemInternal(r2, r1, r1, r0)
        L40:
            r6.endDrag()
            r0 = 0
            r6.mFakeDragging = r0
            return
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "No fake drag in progress. Call beginFakeDrag first."
            r0.<init>(r1)
            throw r0
    }

    public boolean executeKeyEvent(android.view.KeyEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L53
            int r0 = r4.getKeyCode()
            r1 = 21
            r2 = 2
            if (r0 == r1) goto L41
            r1 = 22
            if (r0 == r1) goto L2f
            r1 = 61
            if (r0 == r1) goto L18
            goto L53
        L18:
            boolean r0 = r4.hasNoModifiers()
            if (r0 == 0) goto L23
            boolean r4 = r3.arrowScroll(r2)
            goto L54
        L23:
            r0 = 1
            boolean r4 = r4.hasModifiers(r0)
            if (r4 == 0) goto L53
            boolean r4 = r3.arrowScroll(r0)
            goto L54
        L2f:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L3a
            boolean r4 = r3.pageRight()
            goto L54
        L3a:
            r4 = 66
            boolean r4 = r3.arrowScroll(r4)
            goto L54
        L41:
            boolean r4 = r4.hasModifiers(r2)
            if (r4 == 0) goto L4c
            boolean r4 = r3.pageLeft()
            goto L54
        L4c:
            r4 = 17
            boolean r4 = r3.arrowScroll(r4)
            goto L54
        L53:
            r4 = 0
        L54:
            return r4
    }

    public void fakeDragBy(float r11) {
            r10 = this;
            boolean r0 = r10.mFakeDragging
            if (r0 == 0) goto L81
            androidx.viewpager.widget.PagerAdapter r0 = r10.mAdapter
            if (r0 != 0) goto L9
            return
        L9:
            float r0 = r10.mLastMotionX
            float r0 = r0 + r11
            r10.mLastMotionX = r0
            int r0 = r10.getScrollX()
            float r0 = (float) r0
            float r0 = r0 - r11
            int r11 = r10.getClientWidth()
            float r11 = (float) r11
            float r1 = r10.mFirstOffset
            float r1 = r1 * r11
            float r2 = r10.mLastOffset
            float r2 = r2 * r11
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r10.mItems
            r4 = 0
            java.lang.Object r3 = r3.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = (androidx.viewpager.widget.ViewPager.ItemInfo) r3
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r4 = r10.mItems
            int r5 = r4.size()
            int r5 = r5 + (-1)
            java.lang.Object r4 = r4.get(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = (androidx.viewpager.widget.ViewPager.ItemInfo) r4
            int r5 = r3.position
            if (r5 == 0) goto L3d
            float r1 = r3.offset
            float r1 = r1 * r11
        L3d:
            int r3 = r4.position
            androidx.viewpager.widget.PagerAdapter r5 = r10.mAdapter
            int r5 = r5.getCount()
            int r5 = r5 + (-1)
            if (r3 == r5) goto L4c
            float r2 = r4.offset
            float r2 = r2 * r11
        L4c:
            int r11 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r11 >= 0) goto L52
            r0 = r1
            goto L57
        L52:
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 <= 0) goto L57
            r0 = r2
        L57:
            float r11 = r10.mLastMotionX
            int r1 = (int) r0
            float r2 = (float) r1
            float r0 = r0 - r2
            float r11 = r11 + r0
            r10.mLastMotionX = r11
            int r11 = r10.getScrollY()
            r10.scrollTo(r1, r11)
            r10.pageScrolled(r1)
            long r4 = android.os.SystemClock.uptimeMillis()
            long r2 = r10.mFakeDragBeginTime
            r6 = 2
            float r7 = r10.mLastMotionX
            r8 = 0
            r9 = 0
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r2, r4, r6, r7, r8, r9)
            android.view.VelocityTracker r0 = r10.mVelocityTracker
            r0.addMovement(r11)
            r11.recycle()
            return
        L81:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "No fake drag in progress. Call beginFakeDrag first."
            r11.<init>(r0)
            throw r11
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = new androidx.viewpager.widget.ViewPager$LayoutParams
            r0.<init>()
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = new androidx.viewpager.widget.ViewPager$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r0.generateDefaultLayoutParams()
            return r1
    }

    public androidx.viewpager.widget.PagerAdapter getAdapter() {
            r1 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r1.mAdapter
            return r0
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int r3, int r4) {
            r2 = this;
            int r0 = r2.mDrawingOrder
            r1 = 2
            if (r0 != r1) goto L9
            int r3 = r3 + (-1)
            int r4 = r3 - r4
        L9:
            java.util.ArrayList<android.view.View> r3 = r2.mDrawingOrderedChildren
            java.lang.Object r3 = r3.get(r4)
            android.view.View r3 = (android.view.View) r3
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r3 = (androidx.viewpager.widget.ViewPager.LayoutParams) r3
            int r3 = r3.childIndex
            return r3
    }

    public int getCurrentItem() {
            r1 = this;
            int r0 = r1.mCurItem
            return r0
    }

    public int getOffscreenPageLimit() {
            r1 = this;
            int r0 = r1.mOffscreenPageLimit
            return r0
    }

    public int getPageMargin() {
            r1 = this;
            int r0 = r1.mPageMargin
            return r0
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForAnyChild(android.view.View r2) {
            r1 = this;
        L0:
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == r1) goto L13
            if (r0 == 0) goto L11
            boolean r2 = r0 instanceof android.view.View
            if (r2 != 0) goto Ld
            goto L11
        Ld:
            r2 = r0
            android.view.View r2 = (android.view.View) r2
            goto L0
        L11:
            r2 = 0
            return r2
        L13:
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r1.infoForChild(r2)
            return r2
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForChild(android.view.View r5) {
            r4 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r4.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L1f
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r4.mItems
            java.lang.Object r1 = r1.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = (androidx.viewpager.widget.ViewPager.ItemInfo) r1
            androidx.viewpager.widget.PagerAdapter r2 = r4.mAdapter
            java.lang.Object r3 = r1.object
            boolean r2 = r2.isViewFromObject(r5, r3)
            if (r2 == 0) goto L1c
            return r1
        L1c:
            int r0 = r0 + 1
            goto L1
        L1f:
            r5 = 0
            return r5
    }

    androidx.viewpager.widget.ViewPager.ItemInfo infoForPosition(int r4) {
            r3 = this;
            r0 = 0
        L1:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r3.mItems
            int r1 = r1.size()
            if (r0 >= r1) goto L19
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r3.mItems
            java.lang.Object r1 = r1.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r1 = (androidx.viewpager.widget.ViewPager.ItemInfo) r1
            int r2 = r1.position
            if (r2 != r4) goto L16
            return r1
        L16:
            int r0 = r0 + 1
            goto L1
        L19:
            r4 = 0
            return r4
    }

    void initViewPager() {
            r5 = this;
            r0 = 0
            r5.setWillNotDraw(r0)
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r0)
            r0 = 1
            r5.setFocusable(r0)
            android.content.Context r1 = r5.getContext()
            android.widget.Scroller r2 = new android.widget.Scroller
            android.view.animation.Interpolator r3 = androidx.viewpager.widget.ViewPager.sInterpolator
            r2.<init>(r1, r3)
            r5.mScroller = r2
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r1)
            android.content.res.Resources r3 = r1.getResources()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r4 = r2.getScaledPagingTouchSlop()
            r5.mTouchSlop = r4
            r4 = 1137180672(0x43c80000, float:400.0)
            float r4 = r4 * r3
            int r4 = (int) r4
            r5.mMinimumVelocity = r4
            int r2 = r2.getScaledMaximumFlingVelocity()
            r5.mMaximumVelocity = r2
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            r5.mLeftEdge = r2
            android.widget.EdgeEffect r2 = new android.widget.EdgeEffect
            r2.<init>(r1)
            r5.mRightEdge = r2
            r1 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            r5.mFlingDistance = r1
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 * r3
            int r1 = (int) r1
            r5.mCloseEnough = r1
            r1 = 1098907648(0x41800000, float:16.0)
            float r3 = r3 * r1
            int r1 = (int) r3
            r5.mDefaultGutterSize = r1
            androidx.viewpager.widget.ViewPager$MyAccessibilityDelegate r1 = new androidx.viewpager.widget.ViewPager$MyAccessibilityDelegate
            r1.<init>(r5)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r1)
            int r1 = androidx.core.view.ViewCompat.getImportantForAccessibility(r5)
            if (r1 != 0) goto L6b
            androidx.core.view.ViewCompat.setImportantForAccessibility(r5, r0)
        L6b:
            androidx.viewpager.widget.ViewPager$4 r0 = new androidx.viewpager.widget.ViewPager$4
            r0.<init>(r5)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r0)
            return
    }

    public boolean isFakeDragging() {
            r1 = this;
            boolean r0 = r1.mFakeDragging
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            java.lang.Runnable r0 = r1.mEndScrollRunnable
            r1.removeCallbacks(r0)
            android.widget.Scroller r0 = r1.mScroller
            if (r0 == 0) goto L14
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L14
            android.widget.Scroller r0 = r1.mScroller
            r0.abortAnimation()
        L14:
            super.onDetachedFromWindow()
            return
    }

    @Override // android.view.View
    protected void onDraw(android.graphics.Canvas r18) {
            r17 = this;
            r0 = r17
            super.onDraw(r18)
            int r1 = r0.mPageMargin
            if (r1 <= 0) goto Lb0
            android.graphics.drawable.Drawable r1 = r0.mMarginDrawable
            if (r1 == 0) goto Lb0
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r1 = r0.mItems
            int r1 = r1.size()
            if (r1 <= 0) goto Lb0
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            if (r1 == 0) goto Lb0
            int r1 = r17.getScrollX()
            int r2 = r17.getWidth()
            int r3 = r0.mPageMargin
            float r3 = (float) r3
            float r4 = (float) r2
            float r3 = r3 / r4
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            r6 = 0
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            float r7 = r5.offset
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r0.mItems
            int r8 = r8.size()
            int r9 = r5.position
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r10 = r0.mItems
            int r11 = r8 + (-1)
            java.lang.Object r10 = r10.get(r11)
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = (androidx.viewpager.widget.ViewPager.ItemInfo) r10
            int r10 = r10.position
        L45:
            if (r9 >= r10) goto Lb0
        L47:
            int r11 = r5.position
            if (r9 <= r11) goto L58
            if (r6 >= r8) goto L58
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            int r6 = r6 + 1
            java.lang.Object r5 = r5.get(r6)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L47
        L58:
            int r11 = r5.position
            if (r9 != r11) goto L69
            float r7 = r5.offset
            float r11 = r5.widthFactor
            float r7 = r7 + r11
            float r7 = r7 * r4
            float r11 = r5.offset
            float r12 = r5.widthFactor
            float r11 = r11 + r12
            float r11 = r11 + r3
            goto L76
        L69:
            androidx.viewpager.widget.PagerAdapter r11 = r0.mAdapter
            float r11 = r11.getPageWidth(r9)
            float r12 = r7 + r11
            float r12 = r12 * r4
            float r11 = r11 + r3
            float r7 = r7 + r11
            r11 = r7
            r7 = r12
        L76:
            int r12 = r0.mPageMargin
            float r12 = (float) r12
            float r12 = r12 + r7
            float r13 = (float) r1
            int r12 = (r12 > r13 ? 1 : (r12 == r13 ? 0 : -1))
            if (r12 <= 0) goto L9e
            android.graphics.drawable.Drawable r12 = r0.mMarginDrawable
            int r13 = java.lang.Math.round(r7)
            int r14 = r0.mTopPageBounds
            int r15 = r0.mPageMargin
            float r15 = (float) r15
            float r15 = r15 + r7
            int r15 = java.lang.Math.round(r15)
            r16 = r3
            int r3 = r0.mBottomPageBounds
            r12.setBounds(r13, r14, r15, r3)
            android.graphics.drawable.Drawable r3 = r0.mMarginDrawable
            r12 = r18
            r3.draw(r12)
            goto La2
        L9e:
            r12 = r18
            r16 = r3
        La2:
            int r3 = r1 + r2
            float r3 = (float) r3
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 <= 0) goto Laa
            goto Lb0
        Laa:
            int r9 = r9 + 1
            r7 = r11
            r3 = r16
            goto L45
        Lb0:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r16) {
            r15 = this;
            r6 = r15
            r7 = r16
            int r0 = r16.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 3
            r8 = 0
            if (r0 == r1) goto L10f
            r9 = 1
            if (r0 != r9) goto L12
            goto L10f
        L12:
            if (r0 == 0) goto L1e
            boolean r1 = r6.mIsBeingDragged
            if (r1 == 0) goto L19
            return r9
        L19:
            boolean r1 = r6.mIsUnableToDrag
            if (r1 == 0) goto L1e
            return r8
        L1e:
            r1 = 2
            if (r0 == 0) goto Lad
            if (r0 == r1) goto L2d
            r1 = 6
            if (r0 == r1) goto L28
            goto Lfd
        L28:
            r15.onSecondaryPointerUp(r16)
            goto Lfd
        L2d:
            int r0 = r6.mActivePointerId
            r1 = -1
            if (r0 != r1) goto L34
            goto Lfd
        L34:
            int r0 = r7.findPointerIndex(r0)
            float r10 = r7.getX(r0)
            float r1 = r6.mLastMotionX
            float r1 = r10 - r1
            float r11 = java.lang.Math.abs(r1)
            float r12 = r7.getY(r0)
            float r0 = r6.mInitialMotionY
            float r0 = r12 - r0
            float r13 = java.lang.Math.abs(r0)
            r0 = 0
            int r14 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r14 == 0) goto L70
            float r0 = r6.mLastMotionX
            boolean r0 = r15.isGutterDrag(r0, r1)
            if (r0 != 0) goto L70
            r2 = 0
            int r3 = (int) r1
            int r4 = (int) r10
            int r5 = (int) r12
            r0 = r15
            r1 = r15
            boolean r0 = r0.canScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L70
            r6.mLastMotionX = r10
            r6.mLastMotionY = r12
            r6.mIsUnableToDrag = r9
            return r8
        L70:
            int r0 = r6.mTouchSlop
            float r1 = (float) r0
            int r1 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r1 <= 0) goto L98
            r1 = 1056964608(0x3f000000, float:0.5)
            float r11 = r11 * r1
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 <= 0) goto L98
            r6.mIsBeingDragged = r9
            r15.requestParentDisallowInterceptTouchEvent(r9)
            r15.setScrollState(r9)
            float r0 = r6.mInitialMotionX
            int r1 = r6.mTouchSlop
            float r1 = (float) r1
            if (r14 <= 0) goto L8f
            float r0 = r0 + r1
            goto L90
        L8f:
            float r0 = r0 - r1
        L90:
            r6.mLastMotionX = r0
            r6.mLastMotionY = r12
            r15.setScrollingCacheEnabled(r9)
            goto L9f
        L98:
            float r0 = (float) r0
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 <= 0) goto L9f
            r6.mIsUnableToDrag = r9
        L9f:
            boolean r0 = r6.mIsBeingDragged
            if (r0 == 0) goto Lfd
            boolean r0 = r15.performDrag(r10)
            if (r0 == 0) goto Lfd
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r15)
            goto Lfd
        Lad:
            float r0 = r16.getX()
            r6.mInitialMotionX = r0
            r6.mLastMotionX = r0
            float r0 = r16.getY()
            r6.mInitialMotionY = r0
            r6.mLastMotionY = r0
            int r0 = r7.getPointerId(r8)
            r6.mActivePointerId = r0
            r6.mIsUnableToDrag = r8
            r6.mIsScrollStarted = r9
            android.widget.Scroller r0 = r6.mScroller
            r0.computeScrollOffset()
            int r0 = r6.mScrollState
            if (r0 != r1) goto Lf8
            android.widget.Scroller r0 = r6.mScroller
            int r0 = r0.getFinalX()
            android.widget.Scroller r1 = r6.mScroller
            int r1 = r1.getCurrX()
            int r0 = r0 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r6.mCloseEnough
            if (r0 <= r1) goto Lf8
            android.widget.Scroller r0 = r6.mScroller
            r0.abortAnimation()
            r6.mPopulatePending = r8
            r15.populate()
            r6.mIsBeingDragged = r9
            r15.requestParentDisallowInterceptTouchEvent(r9)
            r15.setScrollState(r9)
            goto Lfd
        Lf8:
            r15.completeScroll(r8)
            r6.mIsBeingDragged = r8
        Lfd:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L107
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L107:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r7)
            boolean r0 = r6.mIsBeingDragged
            return r0
        L10f:
            r15.resetTouch()
            return r8
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
            r18 = this;
            r0 = r18
            int r1 = r18.getChildCount()
            int r2 = r22 - r20
            int r3 = r23 - r21
            int r4 = r18.getPaddingLeft()
            int r5 = r18.getPaddingTop()
            int r6 = r18.getPaddingRight()
            int r7 = r18.getPaddingBottom()
            int r8 = r18.getScrollX()
            r10 = 0
            r11 = 0
        L20:
            r12 = 8
            if (r10 >= r1) goto Lb8
            android.view.View r13 = r0.getChildAt(r10)
            int r14 = r13.getVisibility()
            if (r14 == r12) goto Lb4
            android.view.ViewGroup$LayoutParams r12 = r13.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r12 = (androidx.viewpager.widget.ViewPager.LayoutParams) r12
            boolean r14 = r12.isDecor
            if (r14 == 0) goto Lb4
            int r14 = r12.gravity
            r14 = r14 & 7
            int r12 = r12.gravity
            r12 = r12 & 112(0x70, float:1.57E-43)
            r15 = 1
            if (r14 == r15) goto L5e
            r15 = 3
            if (r14 == r15) goto L58
            r15 = 5
            if (r14 == r15) goto L4b
            r14 = r4
            goto L6f
        L4b:
            int r14 = r2 - r6
            int r15 = r13.getMeasuredWidth()
            int r14 = r14 - r15
            int r15 = r13.getMeasuredWidth()
            int r6 = r6 + r15
            goto L6a
        L58:
            int r14 = r13.getMeasuredWidth()
            int r14 = r14 + r4
            goto L6f
        L5e:
            int r14 = r13.getMeasuredWidth()
            int r14 = r2 - r14
            int r14 = r14 / 2
            int r14 = java.lang.Math.max(r14, r4)
        L6a:
            r17 = r14
            r14 = r4
            r4 = r17
        L6f:
            r15 = 16
            if (r12 == r15) goto L90
            r15 = 48
            if (r12 == r15) goto L8a
            r15 = 80
            if (r12 == r15) goto L7d
            r12 = r5
            goto La1
        L7d:
            int r12 = r3 - r7
            int r15 = r13.getMeasuredHeight()
            int r12 = r12 - r15
            int r15 = r13.getMeasuredHeight()
            int r7 = r7 + r15
            goto L9c
        L8a:
            int r12 = r13.getMeasuredHeight()
            int r12 = r12 + r5
            goto La1
        L90:
            int r12 = r13.getMeasuredHeight()
            int r12 = r3 - r12
            int r12 = r12 / 2
            int r12 = java.lang.Math.max(r12, r5)
        L9c:
            r17 = r12
            r12 = r5
            r5 = r17
        La1:
            int r4 = r4 + r8
            int r15 = r13.getMeasuredWidth()
            int r15 = r15 + r4
            int r16 = r13.getMeasuredHeight()
            int r9 = r5 + r16
            r13.layout(r4, r5, r15, r9)
            int r11 = r11 + 1
            r5 = r12
            r4 = r14
        Lb4:
            int r10 = r10 + 1
            goto L20
        Lb8:
            int r2 = r2 - r4
            int r2 = r2 - r6
            r6 = 0
        Lbb:
            if (r6 >= r1) goto L108
            android.view.View r8 = r0.getChildAt(r6)
            int r9 = r8.getVisibility()
            if (r9 == r12) goto L105
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L105
            androidx.viewpager.widget.ViewPager$ItemInfo r10 = r0.infoForChild(r8)
            if (r10 == 0) goto L105
            float r13 = (float) r2
            float r10 = r10.offset
            float r10 = r10 * r13
            int r10 = (int) r10
            int r10 = r10 + r4
            boolean r14 = r9.needsMeasure
            if (r14 == 0) goto Lf8
            r14 = 0
            r9.needsMeasure = r14
            float r9 = r9.widthFactor
            float r13 = r13 * r9
            int r9 = (int) r13
            r13 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r13)
            int r14 = r3 - r5
            int r14 = r14 - r7
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r13)
            r8.measure(r9, r13)
        Lf8:
            int r9 = r8.getMeasuredWidth()
            int r9 = r9 + r10
            int r13 = r8.getMeasuredHeight()
            int r13 = r13 + r5
            r8.layout(r10, r5, r9, r13)
        L105:
            int r6 = r6 + 1
            goto Lbb
        L108:
            r0.mTopPageBounds = r5
            int r3 = r3 - r7
            r0.mBottomPageBounds = r3
            r0.mDecorChildCount = r11
            boolean r1 = r0.mFirstLayout
            if (r1 == 0) goto L11a
            int r1 = r0.mCurItem
            r2 = 0
            r0.scrollToItem(r1, r2, r2, r2)
            goto L11b
        L11a:
            r2 = 0
        L11b:
            r0.mFirstLayout = r2
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r17, int r18) {
            r16 = this;
            r0 = r16
            r1 = 0
            r2 = r17
            int r2 = getDefaultSize(r1, r2)
            r3 = r18
            int r3 = getDefaultSize(r1, r3)
            r0.setMeasuredDimension(r2, r3)
            int r2 = r16.getMeasuredWidth()
            int r3 = r2 / 10
            int r4 = r0.mDefaultGutterSize
            int r3 = java.lang.Math.min(r3, r4)
            r0.mGutterSize = r3
            int r3 = r16.getPaddingLeft()
            int r2 = r2 - r3
            int r3 = r16.getPaddingRight()
            int r2 = r2 - r3
            int r3 = r16.getMeasuredHeight()
            int r4 = r16.getPaddingTop()
            int r3 = r3 - r4
            int r4 = r16.getPaddingBottom()
            int r3 = r3 - r4
            int r4 = r16.getChildCount()
            r5 = r1
        L3d:
            r6 = 8
            r7 = 1
            r8 = 1073741824(0x40000000, float:2.0)
            if (r5 >= r4) goto Lc2
            android.view.View r9 = r0.getChildAt(r5)
            int r10 = r9.getVisibility()
            if (r10 == r6) goto Lbd
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r6 = (androidx.viewpager.widget.ViewPager.LayoutParams) r6
            if (r6 == 0) goto Lbd
            boolean r10 = r6.isDecor
            if (r10 == 0) goto Lbd
            int r10 = r6.gravity
            r10 = r10 & 7
            int r11 = r6.gravity
            r11 = r11 & 112(0x70, float:1.57E-43)
            r12 = 48
            if (r11 == r12) goto L6d
            r12 = 80
            if (r11 != r12) goto L6b
            goto L6d
        L6b:
            r11 = r1
            goto L6e
        L6d:
            r11 = r7
        L6e:
            r12 = 3
            if (r10 == r12) goto L76
            r12 = 5
            if (r10 != r12) goto L75
            goto L76
        L75:
            r7 = r1
        L76:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r11 == 0) goto L7d
            r12 = r10
            r10 = r8
            goto L82
        L7d:
            if (r7 == 0) goto L81
            r12 = r8
            goto L82
        L81:
            r12 = r10
        L82:
            int r13 = r6.width
            r14 = -1
            r15 = -2
            if (r13 == r15) goto L92
            int r10 = r6.width
            if (r10 == r14) goto L8f
            int r10 = r6.width
            goto L90
        L8f:
            r10 = r2
        L90:
            r13 = r8
            goto L94
        L92:
            r13 = r10
            r10 = r2
        L94:
            int r1 = r6.height
            if (r1 == r15) goto La1
            int r1 = r6.height
            if (r1 == r14) goto L9f
            int r1 = r6.height
            goto La3
        L9f:
            r1 = r3
            goto La3
        La1:
            r1 = r3
            r8 = r12
        La3:
            int r6 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r13)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r8)
            r9.measure(r6, r1)
            if (r11 == 0) goto Lb6
            int r1 = r9.getMeasuredHeight()
            int r3 = r3 - r1
            goto Lbd
        Lb6:
            if (r7 == 0) goto Lbd
            int r1 = r9.getMeasuredWidth()
            int r2 = r2 - r1
        Lbd:
            int r5 = r5 + 1
            r1 = 0
            goto L3d
        Lc2:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r8)
            r0.mChildWidthMeasureSpec = r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r8)
            r0.mChildHeightMeasureSpec = r1
            r0.mInLayout = r7
            r16.populate()
            r1 = 0
            r0.mInLayout = r1
            int r3 = r16.getChildCount()
        Lda:
            if (r1 >= r3) goto L103
            android.view.View r4 = r0.getChildAt(r1)
            int r5 = r4.getVisibility()
            if (r5 == r6) goto L100
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r5 = (androidx.viewpager.widget.ViewPager.LayoutParams) r5
            if (r5 == 0) goto Lf2
            boolean r7 = r5.isDecor
            if (r7 != 0) goto L100
        Lf2:
            float r7 = (float) r2
            float r5 = r5.widthFactor
            float r7 = r7 * r5
            int r5 = (int) r7
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r8)
            int r7 = r0.mChildHeightMeasureSpec
            r4.measure(r5, r7)
        L100:
            int r1 = r1 + 1
            goto Lda
        L103:
            return
    }

    protected void onPageScrolled(int r13, float r14, int r15) {
            r12 = this;
            int r0 = r12.mDecorChildCount
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L6b
            int r0 = r12.getScrollX()
            int r3 = r12.getPaddingLeft()
            int r4 = r12.getPaddingRight()
            int r5 = r12.getWidth()
            int r6 = r12.getChildCount()
            r7 = r1
        L1b:
            if (r7 >= r6) goto L6b
            android.view.View r8 = r12.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r9 = r8.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r9 = (androidx.viewpager.widget.ViewPager.LayoutParams) r9
            boolean r10 = r9.isDecor
            if (r10 != 0) goto L2c
            goto L68
        L2c:
            int r9 = r9.gravity
            r9 = r9 & 7
            if (r9 == r2) goto L4d
            r10 = 3
            if (r9 == r10) goto L47
            r10 = 5
            if (r9 == r10) goto L3a
            r9 = r3
            goto L5c
        L3a:
            int r9 = r5 - r4
            int r10 = r8.getMeasuredWidth()
            int r9 = r9 - r10
            int r10 = r8.getMeasuredWidth()
            int r4 = r4 + r10
            goto L59
        L47:
            int r9 = r8.getWidth()
            int r9 = r9 + r3
            goto L5c
        L4d:
            int r9 = r8.getMeasuredWidth()
            int r9 = r5 - r9
            int r9 = r9 / 2
            int r9 = java.lang.Math.max(r9, r3)
        L59:
            r11 = r9
            r9 = r3
            r3 = r11
        L5c:
            int r3 = r3 + r0
            int r10 = r8.getLeft()
            int r3 = r3 - r10
            if (r3 == 0) goto L67
            r8.offsetLeftAndRight(r3)
        L67:
            r3 = r9
        L68:
            int r7 = r7 + 1
            goto L1b
        L6b:
            r12.dispatchOnPageScrolled(r13, r14, r15)
            androidx.viewpager.widget.ViewPager$PageTransformer r13 = r12.mPageTransformer
            if (r13 == 0) goto L9f
            int r13 = r12.getScrollX()
            int r14 = r12.getChildCount()
        L7a:
            if (r1 >= r14) goto L9f
            android.view.View r15 = r12.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r0 = r15.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r0 = (androidx.viewpager.widget.ViewPager.LayoutParams) r0
            boolean r0 = r0.isDecor
            if (r0 == 0) goto L8b
            goto L9c
        L8b:
            int r0 = r15.getLeft()
            int r0 = r0 - r13
            float r0 = (float) r0
            int r3 = r12.getClientWidth()
            float r3 = (float) r3
            float r0 = r0 / r3
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r12.mPageTransformer
            r3.transformPage(r15, r0)
        L9c:
            int r1 = r1 + 1
            goto L7a
        L9f:
            r12.mCalledSuper = r2
            return
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int r9, android.graphics.Rect r10) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = r9 & 2
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Le
            r1 = r0
            r0 = r2
            r4 = r3
            goto L12
        Le:
            int r0 = r0 + (-1)
            r1 = -1
            r4 = r1
        L12:
            if (r0 == r1) goto L33
            android.view.View r5 = r8.getChildAt(r0)
            int r6 = r5.getVisibility()
            if (r6 != 0) goto L31
            androidx.viewpager.widget.ViewPager$ItemInfo r6 = r8.infoForChild(r5)
            if (r6 == 0) goto L31
            int r6 = r6.position
            int r7 = r8.mCurItem
            if (r6 != r7) goto L31
            boolean r5 = r5.requestFocus(r9, r10)
            if (r5 == 0) goto L31
            return r3
        L31:
            int r0 = r0 + r4
            goto L12
        L33:
            return r2
    }

    @Override // android.view.View
    public void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.viewpager.widget.ViewPager.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            androidx.viewpager.widget.ViewPager$SavedState r4 = (androidx.viewpager.widget.ViewPager.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r0)
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L24
            android.os.Parcelable r1 = r4.adapterState
            java.lang.ClassLoader r2 = r4.loader
            r0.restoreState(r1, r2)
            int r4 = r4.position
            r0 = 0
            r1 = 1
            r3.setCurrentItemInternal(r4, r0, r1)
            goto L30
        L24:
            int r0 = r4.position
            r3.mRestoredCurItem = r0
            android.os.Parcelable r0 = r4.adapterState
            r3.mRestoredAdapterState = r0
            java.lang.ClassLoader r4 = r4.loader
            r3.mRestoredClassLoader = r4
        L30:
            return
    }

    @Override // android.view.View
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.viewpager.widget.ViewPager$SavedState r1 = new androidx.viewpager.widget.ViewPager$SavedState
            r1.<init>(r0)
            int r0 = r2.mCurItem
            r1.position = r0
            androidx.viewpager.widget.PagerAdapter r0 = r2.mAdapter
            if (r0 == 0) goto L17
            android.os.Parcelable r0 = r0.saveState()
            r1.adapterState = r0
        L17:
            return r1
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            if (r1 == r3) goto La
            int r2 = r0.mPageMargin
            r0.recomputeScrollPosition(r1, r3, r2, r2)
        La:
            return
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r8) {
            r7 = this;
            boolean r0 = r7.mFakeDragging
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r8.getAction()
            r2 = 0
            if (r0 != 0) goto L14
            int r0 = r8.getEdgeFlags()
            if (r0 == 0) goto L14
            return r2
        L14:
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            if (r0 == 0) goto L15f
            int r0 = r0.getCount()
            if (r0 != 0) goto L20
            goto L15f
        L20:
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            if (r0 != 0) goto L2a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r7.mVelocityTracker = r0
        L2a:
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            r0.addMovement(r8)
            int r0 = r8.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L139
            if (r0 == r1) goto Lec
            r3 = 2
            if (r0 == r3) goto L79
            r3 = 3
            if (r0 == r3) goto L6a
            r3 = 5
            if (r0 == r3) goto L58
            r3 = 6
            if (r0 == r3) goto L47
            goto L159
        L47:
            r7.onSecondaryPointerUp(r8)
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            r7.mLastMotionX = r8
            goto L159
        L58:
            int r0 = r8.getActionIndex()
            float r3 = r8.getX(r0)
            r7.mLastMotionX = r3
            int r8 = r8.getPointerId(r0)
            r7.mActivePointerId = r8
            goto L159
        L6a:
            boolean r8 = r7.mIsBeingDragged
            if (r8 == 0) goto L159
            int r8 = r7.mCurItem
            r7.scrollToItem(r8, r1, r2, r2)
            boolean r2 = r7.resetTouch()
            goto L159
        L79:
            boolean r0 = r7.mIsBeingDragged
            if (r0 != 0) goto Ld8
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            r3 = -1
            if (r0 != r3) goto L8c
            boolean r2 = r7.resetTouch()
            goto L159
        L8c:
            float r3 = r8.getX(r0)
            float r4 = r7.mLastMotionX
            float r4 = r3 - r4
            float r4 = java.lang.Math.abs(r4)
            float r0 = r8.getY(r0)
            float r5 = r7.mLastMotionY
            float r5 = r0 - r5
            float r5 = java.lang.Math.abs(r5)
            int r6 = r7.mTouchSlop
            float r6 = (float) r6
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto Ld8
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto Ld8
            r7.mIsBeingDragged = r1
            r7.requestParentDisallowInterceptTouchEvent(r1)
            float r4 = r7.mInitialMotionX
            float r3 = r3 - r4
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto Lc1
            int r3 = r7.mTouchSlop
            float r3 = (float) r3
            float r4 = r4 + r3
            goto Lc5
        Lc1:
            int r3 = r7.mTouchSlop
            float r3 = (float) r3
            float r4 = r4 - r3
        Lc5:
            r7.mLastMotionX = r4
            r7.mLastMotionY = r0
            r7.setScrollState(r1)
            r7.setScrollingCacheEnabled(r1)
            android.view.ViewParent r0 = r7.getParent()
            if (r0 == 0) goto Ld8
            r0.requestDisallowInterceptTouchEvent(r1)
        Ld8:
            boolean r0 = r7.mIsBeingDragged
            if (r0 == 0) goto L159
            int r0 = r7.mActivePointerId
            int r0 = r8.findPointerIndex(r0)
            float r8 = r8.getX(r0)
            boolean r8 = r7.performDrag(r8)
            r2 = r2 | r8
            goto L159
        Lec:
            boolean r0 = r7.mIsBeingDragged
            if (r0 == 0) goto L159
            android.view.VelocityTracker r0 = r7.mVelocityTracker
            int r2 = r7.mMaximumVelocity
            float r2 = (float) r2
            r3 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r3, r2)
            int r2 = r7.mActivePointerId
            float r0 = r0.getXVelocity(r2)
            int r0 = (int) r0
            r7.mPopulatePending = r1
            int r2 = r7.getClientWidth()
            int r3 = r7.getScrollX()
            androidx.viewpager.widget.ViewPager$ItemInfo r4 = r7.infoForCurrentScrollPosition()
            int r5 = r7.mPageMargin
            float r5 = (float) r5
            float r2 = (float) r2
            float r5 = r5 / r2
            int r6 = r4.position
            float r3 = (float) r3
            float r3 = r3 / r2
            float r2 = r4.offset
            float r3 = r3 - r2
            float r2 = r4.widthFactor
            float r2 = r2 + r5
            float r3 = r3 / r2
            int r2 = r7.mActivePointerId
            int r2 = r8.findPointerIndex(r2)
            float r8 = r8.getX(r2)
            float r2 = r7.mInitialMotionX
            float r8 = r8 - r2
            int r8 = (int) r8
            int r8 = r7.determineTargetPage(r6, r3, r0, r8)
            r7.setCurrentItemInternal(r8, r1, r1, r0)
            boolean r2 = r7.resetTouch()
            goto L159
        L139:
            android.widget.Scroller r0 = r7.mScroller
            r0.abortAnimation()
            r7.mPopulatePending = r2
            r7.populate()
            float r0 = r8.getX()
            r7.mInitialMotionX = r0
            r7.mLastMotionX = r0
            float r0 = r8.getY()
            r7.mInitialMotionY = r0
            r7.mLastMotionY = r0
            int r8 = r8.getPointerId(r2)
            r7.mActivePointerId = r8
        L159:
            if (r2 == 0) goto L15e
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r7)
        L15e:
            return r1
        L15f:
            return r2
    }

    boolean pageLeft() {
            r2 = this;
            int r0 = r2.mCurItem
            if (r0 <= 0) goto La
            r1 = 1
            int r0 = r0 - r1
            r2.setCurrentItem(r0, r1)
            return r1
        La:
            r0 = 0
            return r0
    }

    boolean pageRight() {
            r3 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r3.mAdapter
            if (r0 == 0) goto L15
            int r1 = r3.mCurItem
            int r0 = r0.getCount()
            r2 = 1
            int r0 = r0 - r2
            if (r1 >= r0) goto L15
            int r0 = r3.mCurItem
            int r0 = r0 + r2
            r3.setCurrentItem(r0, r2)
            return r2
        L15:
            r0 = 0
            return r0
    }

    void populate() {
            r1 = this;
            int r0 = r1.mCurItem
            r1.populate(r0)
            return
    }

    void populate(int r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.mCurItem
            if (r2 == r1) goto Lf
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r0.infoForPosition(r2)
            r0.mCurItem = r1
            goto L10
        Lf:
            r2 = 0
        L10:
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            if (r1 != 0) goto L18
            r17.sortChildDrawingOrder()
            return
        L18:
            boolean r1 = r0.mPopulatePending
            if (r1 == 0) goto L20
            r17.sortChildDrawingOrder()
            return
        L20:
            android.os.IBinder r1 = r17.getWindowToken()
            if (r1 != 0) goto L27
            return
        L27:
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            r1.startUpdate(r0)
            int r1 = r0.mOffscreenPageLimit
            int r4 = r0.mCurItem
            int r4 = r4 - r1
            r5 = 0
            int r4 = java.lang.Math.max(r5, r4)
            androidx.viewpager.widget.PagerAdapter r6 = r0.mAdapter
            int r6 = r6.getCount()
            int r7 = r6 + (-1)
            int r8 = r0.mCurItem
            int r8 = r8 + r1
            int r1 = java.lang.Math.min(r7, r8)
            int r7 = r0.mExpectedAdapterCount
            if (r6 != r7) goto L212
            r7 = r5
        L4a:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r0.mItems
            int r8 = r8.size()
            if (r7 >= r8) goto L6a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r8 = r0.mItems
            java.lang.Object r8 = r8.get(r7)
            androidx.viewpager.widget.ViewPager$ItemInfo r8 = (androidx.viewpager.widget.ViewPager.ItemInfo) r8
            int r9 = r8.position
            int r10 = r0.mCurItem
            if (r9 < r10) goto L67
            int r9 = r8.position
            int r10 = r0.mCurItem
            if (r9 != r10) goto L6a
            goto L6b
        L67:
            int r7 = r7 + 1
            goto L4a
        L6a:
            r8 = 0
        L6b:
            if (r8 != 0) goto L75
            if (r6 <= 0) goto L75
            int r8 = r0.mCurItem
            androidx.viewpager.widget.ViewPager$ItemInfo r8 = r0.addNewItem(r8, r7)
        L75:
            r9 = 0
            if (r8 == 0) goto L19f
            int r10 = r7 + (-1)
            if (r10 < 0) goto L85
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r11 = r0.mItems
            java.lang.Object r11 = r11.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r11 = (androidx.viewpager.widget.ViewPager.ItemInfo) r11
            goto L86
        L85:
            r11 = 0
        L86:
            int r12 = r17.getClientWidth()
            r13 = 1073741824(0x40000000, float:2.0)
            if (r12 > 0) goto L90
            r14 = r9
            goto L9c
        L90:
            float r14 = r8.widthFactor
            float r14 = r13 - r14
            int r15 = r17.getPaddingLeft()
            float r15 = (float) r15
            float r3 = (float) r12
            float r15 = r15 / r3
            float r14 = r14 + r15
        L9c:
            int r3 = r0.mCurItem
            int r3 = r3 + (-1)
            r15 = r9
        La1:
            if (r3 < 0) goto L101
            int r16 = (r15 > r14 ? 1 : (r15 == r14 ? 0 : -1))
            if (r16 < 0) goto Lcf
            if (r3 >= r4) goto Lcf
            if (r11 != 0) goto Lac
            goto L101
        Lac:
            int r5 = r11.position
            if (r3 != r5) goto Lfd
            boolean r5 = r11.scrolling
            if (r5 != 0) goto Lfd
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            r5.remove(r10)
            androidx.viewpager.widget.PagerAdapter r5 = r0.mAdapter
            java.lang.Object r11 = r11.object
            r5.destroyItem(r0, r3, r11)
            int r10 = r10 + (-1)
            int r7 = r7 + (-1)
            if (r10 < 0) goto Lfb
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto Lfc
        Lcf:
            if (r11 == 0) goto Le5
            int r5 = r11.position
            if (r3 != r5) goto Le5
            float r5 = r11.widthFactor
            float r15 = r15 + r5
            int r10 = r10 + (-1)
            if (r10 < 0) goto Lfb
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto Lfc
        Le5:
            int r5 = r10 + 1
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = r0.addNewItem(r3, r5)
            float r5 = r5.widthFactor
            float r15 = r15 + r5
            int r7 = r7 + 1
            if (r10 < 0) goto Lfb
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r10)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto Lfc
        Lfb:
            r5 = 0
        Lfc:
            r11 = r5
        Lfd:
            int r3 = r3 + (-1)
            r5 = 0
            goto La1
        L101:
            float r3 = r8.widthFactor
            int r4 = r7 + 1
            int r5 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r5 >= 0) goto L193
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L11a
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L11b
        L11a:
            r5 = 0
        L11b:
            if (r12 > 0) goto L11f
            r10 = r9
            goto L127
        L11f:
            int r10 = r17.getPaddingRight()
            float r10 = (float) r10
            float r11 = (float) r12
            float r10 = r10 / r11
            float r10 = r10 + r13
        L127:
            int r11 = r0.mCurItem
        L129:
            int r11 = r11 + 1
            if (r11 >= r6) goto L193
            int r12 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r12 < 0) goto L15d
            if (r11 <= r1) goto L15d
            if (r5 != 0) goto L136
            goto L193
        L136:
            int r12 = r5.position
            if (r11 != r12) goto L192
            boolean r12 = r5.scrolling
            if (r12 != 0) goto L192
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r12 = r0.mItems
            r12.remove(r4)
            androidx.viewpager.widget.PagerAdapter r12 = r0.mAdapter
            java.lang.Object r5 = r5.object
            r12.destroyItem(r0, r11, r5)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L15b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L192
        L15b:
            r5 = 0
            goto L192
        L15d:
            if (r5 == 0) goto L179
            int r12 = r5.position
            if (r11 != r12) goto L179
            float r5 = r5.widthFactor
            float r3 = r3 + r5
            int r4 = r4 + 1
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L15b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
            goto L192
        L179:
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = r0.addNewItem(r11, r4)
            int r4 = r4 + 1
            float r5 = r5.widthFactor
            float r3 = r3 + r5
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            int r5 = r5.size()
            if (r4 >= r5) goto L15b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r5 = r0.mItems
            java.lang.Object r5 = r5.get(r4)
            androidx.viewpager.widget.ViewPager$ItemInfo r5 = (androidx.viewpager.widget.ViewPager.ItemInfo) r5
        L192:
            goto L129
        L193:
            r0.calculatePageOffsets(r8, r7, r2)
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            int r2 = r0.mCurItem
            java.lang.Object r3 = r8.object
            r1.setPrimaryItem(r0, r2, r3)
        L19f:
            androidx.viewpager.widget.PagerAdapter r1 = r0.mAdapter
            r1.finishUpdate(r0)
            int r1 = r17.getChildCount()
            r2 = 0
        L1a9:
            if (r2 >= r1) goto L1d2
            android.view.View r3 = r0.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.viewpager.widget.ViewPager$LayoutParams r4 = (androidx.viewpager.widget.ViewPager.LayoutParams) r4
            r4.childIndex = r2
            boolean r5 = r4.isDecor
            if (r5 != 0) goto L1cf
            float r5 = r4.widthFactor
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r5 != 0) goto L1cf
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r0.infoForChild(r3)
            if (r3 == 0) goto L1cf
            float r5 = r3.widthFactor
            r4.widthFactor = r5
            int r3 = r3.position
            r4.position = r3
        L1cf:
            int r2 = r2 + 1
            goto L1a9
        L1d2:
            r17.sortChildDrawingOrder()
            boolean r1 = r17.hasFocus()
            if (r1 == 0) goto L211
            android.view.View r1 = r17.findFocus()
            if (r1 == 0) goto L1e6
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = r0.infoForAnyChild(r1)
            goto L1e7
        L1e6:
            r3 = 0
        L1e7:
            if (r3 == 0) goto L1ef
            int r1 = r3.position
            int r2 = r0.mCurItem
            if (r1 == r2) goto L211
        L1ef:
            r5 = 0
        L1f0:
            int r1 = r17.getChildCount()
            if (r5 >= r1) goto L211
            android.view.View r1 = r0.getChildAt(r5)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = r0.infoForChild(r1)
            if (r2 == 0) goto L20e
            int r2 = r2.position
            int r3 = r0.mCurItem
            if (r2 != r3) goto L20e
            r2 = 2
            boolean r1 = r1.requestFocus(r2)
            if (r1 == 0) goto L20e
            goto L211
        L20e:
            int r5 = r5 + 1
            goto L1f0
        L211:
            return
        L212:
            android.content.res.Resources r1 = r17.getResources()     // Catch: android.content.res.Resources.NotFoundException -> L21f
            int r2 = r17.getId()     // Catch: android.content.res.Resources.NotFoundException -> L21f
            java.lang.String r1 = r1.getResourceName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L21f
            goto L227
        L21f:
            int r1 = r17.getId()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
        L227:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
            r3.<init>(r4)
            int r4 = r0.mExpectedAdapterCount
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", found: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " Pager id: "
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.StringBuilder r1 = r3.append(r1)
            java.lang.String r3 = " Pager class: "
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.Class r3 = r17.getClass()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r3 = " Problematic adapter: "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.viewpager.widget.PagerAdapter r3 = r0.mAdapter
            java.lang.Class r3 = r3.getClass()
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public void removeOnAdapterChangeListener(androidx.viewpager.widget.ViewPager.OnAdapterChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r0 = r1.mAdapterChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    public void removeOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            java.util.List<androidx.viewpager.widget.ViewPager$OnPageChangeListener> r0 = r1.mOnPageChangeListeners
            if (r0 == 0) goto L7
            r0.remove(r2)
        L7:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.mInLayout
            if (r0 == 0) goto L8
            r1.removeViewInLayout(r2)
            goto Lb
        L8:
            super.removeView(r2)
        Lb:
            return
    }

    public void setAdapter(androidx.viewpager.widget.PagerAdapter r8) {
            r7 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L3d
            r0.setViewPagerObserver(r1)
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            r0.startUpdate(r7)
            r0 = r2
        Lf:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r7.mItems
            int r3 = r3.size()
            if (r0 >= r3) goto L2b
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r3 = r7.mItems
            java.lang.Object r3 = r3.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r3 = (androidx.viewpager.widget.ViewPager.ItemInfo) r3
            androidx.viewpager.widget.PagerAdapter r4 = r7.mAdapter
            int r5 = r3.position
            java.lang.Object r3 = r3.object
            r4.destroyItem(r7, r5, r3)
            int r0 = r0 + 1
            goto Lf
        L2b:
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            r0.finishUpdate(r7)
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r0 = r7.mItems
            r0.clear()
            r7.removeNonDecorViews()
            r7.mCurItem = r2
            r7.scrollTo(r2, r2)
        L3d:
            androidx.viewpager.widget.PagerAdapter r0 = r7.mAdapter
            r7.mAdapter = r8
            r7.mExpectedAdapterCount = r2
            if (r8 == 0) goto L89
            androidx.viewpager.widget.ViewPager$PagerObserver r3 = r7.mObserver
            if (r3 != 0) goto L50
            androidx.viewpager.widget.ViewPager$PagerObserver r3 = new androidx.viewpager.widget.ViewPager$PagerObserver
            r3.<init>(r7)
            r7.mObserver = r3
        L50:
            androidx.viewpager.widget.PagerAdapter r3 = r7.mAdapter
            androidx.viewpager.widget.ViewPager$PagerObserver r4 = r7.mObserver
            r3.setViewPagerObserver(r4)
            r7.mPopulatePending = r2
            boolean r3 = r7.mFirstLayout
            r4 = 1
            r7.mFirstLayout = r4
            androidx.viewpager.widget.PagerAdapter r5 = r7.mAdapter
            int r5 = r5.getCount()
            r7.mExpectedAdapterCount = r5
            int r5 = r7.mRestoredCurItem
            if (r5 < 0) goto L80
            androidx.viewpager.widget.PagerAdapter r3 = r7.mAdapter
            android.os.Parcelable r5 = r7.mRestoredAdapterState
            java.lang.ClassLoader r6 = r7.mRestoredClassLoader
            r3.restoreState(r5, r6)
            int r3 = r7.mRestoredCurItem
            r7.setCurrentItemInternal(r3, r2, r4)
            r3 = -1
            r7.mRestoredCurItem = r3
            r7.mRestoredAdapterState = r1
            r7.mRestoredClassLoader = r1
            goto L89
        L80:
            if (r3 != 0) goto L86
            r7.populate()
            goto L89
        L86:
            r7.requestLayout()
        L89:
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r1 = r7.mAdapterChangeListeners
            if (r1 == 0) goto La9
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto La9
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r1 = r7.mAdapterChangeListeners
            int r1 = r1.size()
        L99:
            if (r2 >= r1) goto La9
            java.util.List<androidx.viewpager.widget.ViewPager$OnAdapterChangeListener> r3 = r7.mAdapterChangeListeners
            java.lang.Object r3 = r3.get(r2)
            androidx.viewpager.widget.ViewPager$OnAdapterChangeListener r3 = (androidx.viewpager.widget.ViewPager.OnAdapterChangeListener) r3
            r3.onAdapterChanged(r7, r0, r8)
            int r2 = r2 + 1
            goto L99
        La9:
            return
    }

    public void setCurrentItem(int r3) {
            r2 = this;
            r0 = 0
            r2.mPopulatePending = r0
            boolean r1 = r2.mFirstLayout
            r1 = r1 ^ 1
            r2.setCurrentItemInternal(r3, r1, r0)
            return
    }

    public void setCurrentItem(int r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.mPopulatePending = r0
            r1.setCurrentItemInternal(r2, r3, r0)
            return
    }

    void setCurrentItemInternal(int r2, boolean r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.setCurrentItemInternal(r2, r3, r4, r0)
            return
    }

    void setCurrentItemInternal(int r5, boolean r6, boolean r7, int r8) {
            r4 = this;
            androidx.viewpager.widget.PagerAdapter r0 = r4.mAdapter
            r1 = 0
            if (r0 == 0) goto L6e
            int r0 = r0.getCount()
            if (r0 > 0) goto Lc
            goto L6e
        Lc:
            if (r7 != 0) goto L1e
            int r7 = r4.mCurItem
            if (r7 != r5) goto L1e
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r7 = r4.mItems
            int r7 = r7.size()
            if (r7 == 0) goto L1e
            r4.setScrollingCacheEnabled(r1)
            return
        L1e:
            r7 = 1
            if (r5 >= 0) goto L23
            r5 = r1
            goto L32
        L23:
            androidx.viewpager.widget.PagerAdapter r0 = r4.mAdapter
            int r0 = r0.getCount()
            if (r5 < r0) goto L32
            androidx.viewpager.widget.PagerAdapter r5 = r4.mAdapter
            int r5 = r5.getCount()
            int r5 = r5 - r7
        L32:
            int r0 = r4.mOffscreenPageLimit
            int r2 = r4.mCurItem
            int r3 = r2 + r0
            if (r5 > r3) goto L3d
            int r2 = r2 - r0
            if (r5 >= r2) goto L53
        L3d:
            r0 = r1
        L3e:
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r4.mItems
            int r2 = r2.size()
            if (r0 >= r2) goto L53
            java.util.ArrayList<androidx.viewpager.widget.ViewPager$ItemInfo> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r0)
            androidx.viewpager.widget.ViewPager$ItemInfo r2 = (androidx.viewpager.widget.ViewPager.ItemInfo) r2
            r2.scrolling = r7
            int r0 = r0 + 1
            goto L3e
        L53:
            int r0 = r4.mCurItem
            if (r0 == r5) goto L58
            r1 = r7
        L58:
            boolean r7 = r4.mFirstLayout
            if (r7 == 0) goto L67
            r4.mCurItem = r5
            if (r1 == 0) goto L63
            r4.dispatchOnPageSelected(r5)
        L63:
            r4.requestLayout()
            goto L6d
        L67:
            r4.populate(r5)
            r4.scrollToItem(r5, r6, r8, r1)
        L6d:
            return
        L6e:
            r4.setScrollingCacheEnabled(r1)
            return
    }

    androidx.viewpager.widget.ViewPager.OnPageChangeListener setInternalPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r2) {
            r1 = this;
            androidx.viewpager.widget.ViewPager$OnPageChangeListener r0 = r1.mInternalPageChangeListener
            r1.mInternalPageChangeListener = r2
            return r0
    }

    public void setOffscreenPageLimit(int r4) {
            r3 = this;
            r0 = 1
            if (r4 >= r0) goto L1e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Requested offscreen page limit "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " too small; defaulting to 1"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            java.lang.String r1 = "ViewPager"
            android.util.Log.w(r1, r4)
            r4 = r0
        L1e:
            int r0 = r3.mOffscreenPageLimit
            if (r4 == r0) goto L27
            r3.mOffscreenPageLimit = r4
            r3.populate()
        L27:
            return
    }

    @java.lang.Deprecated
    public void setOnPageChangeListener(androidx.viewpager.widget.ViewPager.OnPageChangeListener r1) {
            r0 = this;
            r0.mOnPageChangeListener = r1
            return
    }

    public void setPageMargin(int r3) {
            r2 = this;
            int r0 = r2.mPageMargin
            r2.mPageMargin = r3
            int r1 = r2.getWidth()
            r2.recomputeScrollPosition(r1, r1, r3, r0)
            r2.requestLayout()
            return
    }

    public void setPageMarginDrawable(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setPageMarginDrawable(r2)
            return
    }

    public void setPageMarginDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mMarginDrawable = r1
            if (r1 == 0) goto L7
            r0.refreshDrawableState()
        L7:
            if (r1 != 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r0.setWillNotDraw(r1)
            r0.invalidate()
            return
    }

    public void setPageTransformer(boolean r2, androidx.viewpager.widget.ViewPager.PageTransformer r3) {
            r1 = this;
            r0 = 2
            r1.setPageTransformer(r2, r3, r0)
            return
    }

    public void setPageTransformer(boolean r5, androidx.viewpager.widget.ViewPager.PageTransformer r6, int r7) {
            r4 = this;
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L6
            r2 = r0
            goto L7
        L6:
            r2 = r1
        L7:
            androidx.viewpager.widget.ViewPager$PageTransformer r3 = r4.mPageTransformer
            if (r3 == 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r1
        Le:
            if (r2 == r3) goto L12
            r3 = r0
            goto L13
        L12:
            r3 = r1
        L13:
            r4.mPageTransformer = r6
            r4.setChildrenDrawingOrderEnabled(r2)
            if (r2 == 0) goto L22
            if (r5 == 0) goto L1d
            r0 = 2
        L1d:
            r4.mDrawingOrder = r0
            r4.mPageTransformerLayerType = r7
            goto L24
        L22:
            r4.mDrawingOrder = r1
        L24:
            if (r3 == 0) goto L29
            r4.populate()
        L29:
            return
    }

    void setScrollState(int r2) {
            r1 = this;
            int r0 = r1.mScrollState
            if (r0 != r2) goto L5
            return
        L5:
            r1.mScrollState = r2
            androidx.viewpager.widget.ViewPager$PageTransformer r0 = r1.mPageTransformer
            if (r0 == 0) goto L13
            if (r2 == 0) goto Lf
            r0 = 1
            goto L10
        Lf:
            r0 = 0
        L10:
            r1.enableLayers(r0)
        L13:
            r1.dispatchOnScrollStateChanged(r2)
            return
    }

    void smoothScrollTo(int r2, int r3) {
            r1 = this;
            r0 = 0
            r1.smoothScrollTo(r2, r3, r0)
            return
    }

    void smoothScrollTo(int r10, int r11, int r12) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            if (r0 != 0) goto Lb
            r9.setScrollingCacheEnabled(r1)
            return
        Lb:
            android.widget.Scroller r0 = r9.mScroller
            r2 = 1
            if (r0 == 0) goto L18
            boolean r0 = r0.isFinished()
            if (r0 != 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 == 0) goto L35
            boolean r0 = r9.mIsScrollStarted
            if (r0 == 0) goto L26
            android.widget.Scroller r0 = r9.mScroller
            int r0 = r0.getCurrX()
            goto L2c
        L26:
            android.widget.Scroller r0 = r9.mScroller
            int r0 = r0.getStartX()
        L2c:
            android.widget.Scroller r3 = r9.mScroller
            r3.abortAnimation()
            r9.setScrollingCacheEnabled(r1)
            goto L39
        L35:
            int r0 = r9.getScrollX()
        L39:
            r4 = r0
            int r5 = r9.getScrollY()
            int r6 = r10 - r4
            int r7 = r11 - r5
            if (r6 != 0) goto L50
            if (r7 != 0) goto L50
            r9.completeScroll(r1)
            r9.populate()
            r9.setScrollState(r1)
            return
        L50:
            r9.setScrollingCacheEnabled(r2)
            r10 = 2
            r9.setScrollState(r10)
            int r10 = r9.getClientWidth()
            int r11 = r10 / 2
            int r0 = java.lang.Math.abs(r6)
            float r0 = (float) r0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r2
            float r10 = (float) r10
            float r0 = r0 / r10
            float r0 = java.lang.Math.min(r2, r0)
            float r11 = (float) r11
            float r0 = r9.distanceInfluenceForSnapDuration(r0)
            float r0 = r0 * r11
            float r11 = r11 + r0
            int r12 = java.lang.Math.abs(r12)
            if (r12 <= 0) goto L88
            float r10 = (float) r12
            float r11 = r11 / r10
            float r10 = java.lang.Math.abs(r11)
            r11 = 1148846080(0x447a0000, float:1000.0)
            float r10 = r10 * r11
            int r10 = java.lang.Math.round(r10)
            int r10 = r10 * 4
            goto La0
        L88:
            androidx.viewpager.widget.PagerAdapter r11 = r9.mAdapter
            int r12 = r9.mCurItem
            float r11 = r11.getPageWidth(r12)
            float r10 = r10 * r11
            int r11 = java.lang.Math.abs(r6)
            float r11 = (float) r11
            int r12 = r9.mPageMargin
            float r12 = (float) r12
            float r10 = r10 + r12
            float r11 = r11 / r10
            float r11 = r11 + r2
            r10 = 1120403456(0x42c80000, float:100.0)
            float r11 = r11 * r10
            int r10 = (int) r11
        La0:
            r11 = 600(0x258, float:8.41E-43)
            int r8 = java.lang.Math.min(r10, r11)
            r9.mIsScrollStarted = r1
            android.widget.Scroller r3 = r9.mScroller
            r3.startScroll(r4, r5, r6, r7, r8)
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r9)
            return
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.mMarginDrawable
            if (r2 != r0) goto Lb
            goto Ld
        Lb:
            r2 = 0
            goto Le
        Ld:
            r2 = 1
        Le:
            return r2
    }
}
