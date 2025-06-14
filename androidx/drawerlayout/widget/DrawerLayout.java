package androidx.drawerlayout.widget;

/* loaded from: classes.dex */
public class DrawerLayout extends android.view.ViewGroup {
    private static final boolean ALLOW_EDGE_LOCK = false;
    static final boolean CAN_HIDE_DESCENDANTS = false;
    private static final boolean CHILDREN_DISALLOW_INTERCEPT = true;
    private static final int DEFAULT_SCRIM_COLOR = -1728053248;
    private static final int DRAWER_ELEVATION = 10;
    static final int[] LAYOUT_ATTRS = null;
    public static final int LOCK_MODE_LOCKED_CLOSED = 1;
    public static final int LOCK_MODE_LOCKED_OPEN = 2;
    public static final int LOCK_MODE_UNDEFINED = 3;
    public static final int LOCK_MODE_UNLOCKED = 0;
    private static final int MIN_DRAWER_MARGIN = 64;
    private static final int MIN_FLING_VELOCITY = 400;
    private static final int PEEK_DELAY = 160;
    private static final boolean SET_DRAWER_SHADOW_FROM_ELEVATION = false;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_IDLE = 0;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "DrawerLayout";
    private static final int[] THEME_ATTRS = null;
    private static final float TOUCH_SLOP_SENSITIVITY = 1.0f;
    private final androidx.drawerlayout.widget.DrawerLayout.ChildAccessibilityDelegate mChildAccessibilityDelegate;
    private android.graphics.Rect mChildHitRect;
    private android.graphics.Matrix mChildInvertedMatrix;
    private boolean mChildrenCanceledTouch;
    private boolean mDisallowInterceptRequested;
    private boolean mDrawStatusBarBackground;
    private float mDrawerElevation;
    private int mDrawerState;
    private boolean mFirstLayout;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private java.lang.Object mLastInsets;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mLeftCallback;
    private final androidx.customview.widget.ViewDragHelper mLeftDragger;
    private androidx.drawerlayout.widget.DrawerLayout.DrawerListener mListener;
    private java.util.List<androidx.drawerlayout.widget.DrawerLayout.DrawerListener> mListeners;
    private int mLockModeEnd;
    private int mLockModeLeft;
    private int mLockModeRight;
    private int mLockModeStart;
    private int mMinDrawerMargin;
    private final java.util.ArrayList<android.view.View> mNonDrawerViews;
    private final androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback mRightCallback;
    private final androidx.customview.widget.ViewDragHelper mRightDragger;
    private int mScrimColor;
    private float mScrimOpacity;
    private android.graphics.Paint mScrimPaint;
    private android.graphics.drawable.Drawable mShadowEnd;
    private android.graphics.drawable.Drawable mShadowLeft;
    private android.graphics.drawable.Drawable mShadowLeftResolved;
    private android.graphics.drawable.Drawable mShadowRight;
    private android.graphics.drawable.Drawable mShadowRightResolved;
    private android.graphics.drawable.Drawable mShadowStart;
    private android.graphics.drawable.Drawable mStatusBarBackground;
    private java.lang.CharSequence mTitleLeft;
    private java.lang.CharSequence mTitleRight;


    class AccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        private final android.graphics.Rect mTmpRect;
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout this$0;

        AccessibilityDelegate(androidx.drawerlayout.widget.DrawerLayout r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.mTmpRect = r1
                return
        }

        private void addChildrenForAccessibility(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5, android.view.ViewGroup r6) {
                r4 = this;
                int r0 = r6.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                android.view.View r2 = r6.getChildAt(r1)
                boolean r3 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r2)
                if (r3 == 0) goto L14
                r5.addChild(r2)
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                return
        }

        private void copyNodeInfoNoChildren(androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r3) {
                r1 = this;
                android.graphics.Rect r0 = r1.mTmpRect
                r3.getBoundsInParent(r0)
                r2.setBoundsInParent(r0)
                r3.getBoundsInScreen(r0)
                r2.setBoundsInScreen(r0)
                boolean r0 = r3.isVisibleToUser()
                r2.setVisibleToUser(r0)
                java.lang.CharSequence r0 = r3.getPackageName()
                r2.setPackageName(r0)
                java.lang.CharSequence r0 = r3.getClassName()
                r2.setClassName(r0)
                java.lang.CharSequence r0 = r3.getContentDescription()
                r2.setContentDescription(r0)
                boolean r0 = r3.isEnabled()
                r2.setEnabled(r0)
                boolean r0 = r3.isClickable()
                r2.setClickable(r0)
                boolean r0 = r3.isFocusable()
                r2.setFocusable(r0)
                boolean r0 = r3.isFocused()
                r2.setFocused(r0)
                boolean r0 = r3.isAccessibilityFocused()
                r2.setAccessibilityFocused(r0)
                boolean r0 = r3.isSelected()
                r2.setSelected(r0)
                boolean r0 = r3.isLongClickable()
                r2.setLongClickable(r0)
                int r3 = r3.getActions()
                r2.addAction(r3)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r2 = this;
                int r0 = r4.getEventType()
                r1 = 32
                if (r0 != r1) goto L27
                java.util.List r3 = r4.getText()
                androidx.drawerlayout.widget.DrawerLayout r4 = r2.this$0
                android.view.View r4 = r4.findVisibleDrawer()
                if (r4 == 0) goto L25
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                int r4 = r0.getDrawerViewAbsoluteGravity(r4)
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                java.lang.CharSequence r4 = r0.getDrawerTitle(r4)
                if (r4 == 0) goto L25
                r3.add(r4)
            L25:
                r3 = 1
                return r3
            L27:
                boolean r3 = super.dispatchPopulateAccessibilityEvent(r3, r4)
                return r3
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(android.view.View r1, android.view.accessibility.AccessibilityEvent r2) {
                r0 = this;
                super.onInitializeAccessibilityEvent(r1, r2)
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r1 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r1 = r1.getName()
                r2.setClassName(r1)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r4, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r5) {
                r3 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
                if (r0 == 0) goto L8
                super.onInitializeAccessibilityNodeInfo(r4, r5)
                goto L2a
            L8:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.obtain(r5)
                super.onInitializeAccessibilityNodeInfo(r4, r0)
                r5.setSource(r4)
                android.view.ViewParent r1 = androidx.core.view.ViewCompat.getParentForAccessibility(r4)
                boolean r2 = r1 instanceof android.view.View
                if (r2 == 0) goto L1f
                android.view.View r1 = (android.view.View) r1
                r5.setParent(r1)
            L1f:
                r3.copyNodeInfoNoChildren(r5, r0)
                r0.recycle()
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r3.addChildrenForAccessibility(r5, r4)
            L2a:
                java.lang.Class<androidx.drawerlayout.widget.DrawerLayout> r4 = androidx.drawerlayout.widget.DrawerLayout.class
                java.lang.String r4 = r4.getName()
                r5.setClassName(r4)
                r4 = 0
                r5.setFocusable(r4)
                r5.setFocused(r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_FOCUS
                r5.removeAction(r4)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLEAR_FOCUS
                r5.removeAction(r4)
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(android.view.ViewGroup r2, android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
                r1 = this;
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
                if (r0 != 0) goto Ld
                boolean r0 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r3)
                if (r0 == 0) goto Lb
                goto Ld
            Lb:
                r2 = 0
                return r2
            Ld:
                boolean r2 = super.onRequestSendAccessibilityEvent(r2, r3, r4)
                return r2
        }
    }

    static final class ChildAccessibilityDelegate extends androidx.core.view.AccessibilityDelegateCompat {
        ChildAccessibilityDelegate() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(android.view.View r1, androidx.core.view.accessibility.AccessibilityNodeInfoCompat r2) {
                r0 = this;
                super.onInitializeAccessibilityNodeInfo(r1, r2)
                boolean r1 = androidx.drawerlayout.widget.DrawerLayout.includeChildForAccessibility(r1)
                if (r1 != 0) goto Ld
                r1 = 0
                r2.setParent(r1)
            Ld:
                return
        }
    }

    public interface DrawerListener {
        void onDrawerClosed(android.view.View r1);

        void onDrawerOpened(android.view.View r1);

        void onDrawerSlide(android.view.View r1, float r2);

        void onDrawerStateChanged(int r1);
    }

    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        private static final int FLAG_IS_CLOSING = 4;
        private static final int FLAG_IS_OPENED = 1;
        private static final int FLAG_IS_OPENING = 2;
        public int gravity;
        boolean isPeeking;
        float onScreen;
        int openState;

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 0
                r0.gravity = r1
                return
        }

        public LayoutParams(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.gravity = r3
                return
        }

        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 0
                r2.gravity = r0
                int[] r1 = androidx.drawerlayout.widget.DrawerLayout.LAYOUT_ATTRS
                android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r1)
                int r4 = r3.getInt(r0, r0)
                r2.gravity = r4
                r3.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.gravity = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.gravity = r1
                return
        }

        public LayoutParams(androidx.drawerlayout.widget.DrawerLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 0
                r1.gravity = r0
                int r2 = r2.gravity
                r1.gravity = r2
                return
        }
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<androidx.drawerlayout.widget.DrawerLayout.SavedState> CREATOR = null;
        int lockModeEnd;
        int lockModeLeft;
        int lockModeRight;
        int lockModeStart;
        int openDrawerGravity;


        static {
                androidx.drawerlayout.widget.DrawerLayout$SavedState$1 r0 = new androidx.drawerlayout.widget.DrawerLayout$SavedState$1
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r2 = 0
                r0.openDrawerGravity = r2
                int r2 = r1.readInt()
                r0.openDrawerGravity = r2
                int r2 = r1.readInt()
                r0.lockModeLeft = r2
                int r2 = r1.readInt()
                r0.lockModeRight = r2
                int r2 = r1.readInt()
                r0.lockModeStart = r2
                int r1 = r1.readInt()
                r0.lockModeEnd = r1
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 0
                r0.openDrawerGravity = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.openDrawerGravity
                r1.writeInt(r2)
                int r2 = r0.lockModeLeft
                r1.writeInt(r2)
                int r2 = r0.lockModeRight
                r1.writeInt(r2)
                int r2 = r0.lockModeStart
                r1.writeInt(r2)
                int r2 = r0.lockModeEnd
                r1.writeInt(r2)
                return
        }
    }

    public static abstract class SimpleDrawerListener implements androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
        public SimpleDrawerListener() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerClosed(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerOpened(android.view.View r1) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerSlide(android.view.View r1, float r2) {
                r0 = this;
                return
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void onDrawerStateChanged(int r1) {
                r0 = this;
                return
        }
    }

    private class ViewDragCallback extends androidx.customview.widget.ViewDragHelper.Callback {
        private final int mAbsGravity;
        private androidx.customview.widget.ViewDragHelper mDragger;
        private final java.lang.Runnable mPeekRunnable;
        final /* synthetic */ androidx.drawerlayout.widget.DrawerLayout this$0;


        ViewDragCallback(androidx.drawerlayout.widget.DrawerLayout r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1 r1 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback$1
                r1.<init>(r0)
                r0.mPeekRunnable = r1
                r0.mAbsGravity = r2
                return
        }

        private void closeOtherDrawer() {
                r2 = this;
                int r0 = r2.mAbsGravity
                r1 = 3
                if (r0 != r1) goto L6
                r1 = 5
            L6:
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                android.view.View r0 = r0.findDrawerWithGravity(r1)
                if (r0 == 0) goto L13
                androidx.drawerlayout.widget.DrawerLayout r1 = r2.this$0
                r1.closeDrawer(r0)
            L13:
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(android.view.View r2, int r3, int r4) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r4 = r1.this$0
                r0 = 3
                boolean r4 = r4.checkDrawerViewAbsoluteGravity(r2, r0)
                if (r4 == 0) goto L18
                int r2 = r2.getWidth()
                int r2 = -r2
                r4 = 0
                int r3 = java.lang.Math.min(r3, r4)
                int r2 = java.lang.Math.max(r2, r3)
                return r2
            L18:
                androidx.drawerlayout.widget.DrawerLayout r4 = r1.this$0
                int r4 = r4.getWidth()
                int r2 = r2.getWidth()
                int r2 = r4 - r2
                int r3 = java.lang.Math.min(r3, r4)
                int r2 = java.lang.Math.max(r2, r3)
                return r2
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(android.view.View r1, int r2, int r3) {
                r0 = this;
                int r1 = r1.getTop()
                return r1
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewHorizontalDragRange(android.view.View r2) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r1.this$0
                boolean r0 = r0.isDrawerView(r2)
                if (r0 == 0) goto Ld
                int r2 = r2.getWidth()
                goto Le
            Ld:
                r2 = 0
            Le:
                return r2
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeDragStarted(int r2, int r3) {
                r1 = this;
                r0 = 1
                r2 = r2 & r0
                if (r2 != r0) goto Lc
                androidx.drawerlayout.widget.DrawerLayout r2 = r1.this$0
                r0 = 3
                android.view.View r2 = r2.findDrawerWithGravity(r0)
                goto L13
            Lc:
                androidx.drawerlayout.widget.DrawerLayout r2 = r1.this$0
                r0 = 5
                android.view.View r2 = r2.findDrawerWithGravity(r0)
            L13:
                if (r2 == 0) goto L22
                androidx.drawerlayout.widget.DrawerLayout r0 = r1.this$0
                int r0 = r0.getDrawerLockMode(r2)
                if (r0 != 0) goto L22
                androidx.customview.widget.ViewDragHelper r0 = r1.mDragger
                r0.captureChildView(r2, r3)
            L22:
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean onEdgeLock(int r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onEdgeTouched(int r3, int r4) {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r3 = r2.this$0
                java.lang.Runnable r4 = r2.mPeekRunnable
                r0 = 160(0xa0, double:7.9E-322)
                r3.postDelayed(r4, r0)
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewCaptured(android.view.View r1, int r2) {
                r0 = this;
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
                r2 = 0
                r1.isPeeking = r2
                r0.closeOtherDrawer()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int r4) {
                r3 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r3.this$0
                int r1 = r3.mAbsGravity
                androidx.customview.widget.ViewDragHelper r2 = r3.mDragger
                android.view.View r2 = r2.getCapturedView()
                r0.updateDrawerState(r1, r4, r2)
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(android.view.View r1, int r2, int r3, int r4, int r5) {
                r0 = this;
                int r3 = r1.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r4 = r0.this$0
                r5 = 3
                boolean r4 = r4.checkDrawerViewAbsoluteGravity(r1, r5)
                if (r4 == 0) goto L10
                int r2 = r2 + r3
                float r2 = (float) r2
                goto L18
            L10:
                androidx.drawerlayout.widget.DrawerLayout r4 = r0.this$0
                int r4 = r4.getWidth()
                int r4 = r4 - r2
                float r2 = (float) r4
            L18:
                float r3 = (float) r3
                float r2 = r2 / r3
                androidx.drawerlayout.widget.DrawerLayout r3 = r0.this$0
                r3.setDrawerViewOffset(r1, r2)
                r3 = 0
                int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
                if (r2 != 0) goto L26
                r2 = 4
                goto L27
            L26:
                r2 = 0
            L27:
                r1.setVisibility(r2)
                androidx.drawerlayout.widget.DrawerLayout r1 = r0.this$0
                r1.invalidate()
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(android.view.View r6, float r7, float r8) {
                r5 = this;
                androidx.drawerlayout.widget.DrawerLayout r8 = r5.this$0
                float r8 = r8.getDrawerViewOffset(r6)
                int r0 = r6.getWidth()
                androidx.drawerlayout.widget.DrawerLayout r1 = r5.this$0
                r2 = 3
                boolean r1 = r1.checkDrawerViewAbsoluteGravity(r6, r2)
                r2 = 1056964608(0x3f000000, float:0.5)
                r3 = 0
                if (r1 == 0) goto L25
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 > 0) goto L23
                if (r7 != 0) goto L21
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 <= 0) goto L21
                goto L23
            L21:
                int r7 = -r0
                goto L39
            L23:
                r7 = 0
                goto L39
            L25:
                androidx.drawerlayout.widget.DrawerLayout r1 = r5.this$0
                int r1 = r1.getWidth()
                int r4 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r4 < 0) goto L37
                int r7 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
                if (r7 != 0) goto L38
                int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r7 <= 0) goto L38
            L37:
                int r1 = r1 - r0
            L38:
                r7 = r1
            L39:
                androidx.customview.widget.ViewDragHelper r8 = r5.mDragger
                int r6 = r6.getTop()
                r8.settleCapturedViewAt(r7, r6)
                androidx.drawerlayout.widget.DrawerLayout r6 = r5.this$0
                r6.invalidate()
                return
        }

        void peekDrawer() {
                r6 = this;
                androidx.customview.widget.ViewDragHelper r0 = r6.mDragger
                int r0 = r0.getEdgeSize()
                int r1 = r6.mAbsGravity
                r2 = 1
                r3 = 0
                r4 = 3
                if (r1 != r4) goto Lf
                r1 = r2
                goto L10
            Lf:
                r1 = r3
            L10:
                if (r1 == 0) goto L21
                androidx.drawerlayout.widget.DrawerLayout r5 = r6.this$0
                android.view.View r4 = r5.findDrawerWithGravity(r4)
                if (r4 == 0) goto L1f
                int r3 = r4.getWidth()
                int r3 = -r3
            L1f:
                int r3 = r3 + r0
                goto L2f
            L21:
                androidx.drawerlayout.widget.DrawerLayout r3 = r6.this$0
                r4 = 5
                android.view.View r4 = r3.findDrawerWithGravity(r4)
                androidx.drawerlayout.widget.DrawerLayout r3 = r6.this$0
                int r3 = r3.getWidth()
                int r3 = r3 - r0
            L2f:
                if (r4 == 0) goto L67
                if (r1 == 0) goto L39
                int r0 = r4.getLeft()
                if (r0 < r3) goto L41
            L39:
                if (r1 != 0) goto L67
                int r0 = r4.getLeft()
                if (r0 <= r3) goto L67
            L41:
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.this$0
                int r0 = r0.getDrawerLockMode(r4)
                if (r0 != 0) goto L67
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
                androidx.customview.widget.ViewDragHelper r1 = r6.mDragger
                int r5 = r4.getTop()
                r1.smoothSlideViewTo(r4, r3, r5)
                r0.isPeeking = r2
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.this$0
                r0.invalidate()
                r6.closeOtherDrawer()
                androidx.drawerlayout.widget.DrawerLayout r0 = r6.this$0
                r0.cancelChildViewTouch()
            L67:
                return
        }

        public void removeCallbacks() {
                r2 = this;
                androidx.drawerlayout.widget.DrawerLayout r0 = r2.this$0
                java.lang.Runnable r1 = r2.mPeekRunnable
                r0.removeCallbacks(r1)
                return
        }

        public void setDragger(androidx.customview.widget.ViewDragHelper r1) {
                r0 = this;
                r0.mDragger = r1
                return
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(android.view.View r2, int r3) {
                r1 = this;
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.this$0
                boolean r3 = r3.isDrawerView(r2)
                if (r3 == 0) goto L1c
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.this$0
                int r0 = r1.mAbsGravity
                boolean r3 = r3.checkDrawerViewAbsoluteGravity(r2, r0)
                if (r3 == 0) goto L1c
                androidx.drawerlayout.widget.DrawerLayout r3 = r1.this$0
                int r2 = r3.getDrawerLockMode(r2)
                if (r2 != 0) goto L1c
                r2 = 1
                goto L1d
            L1c:
                r2 = 0
            L1d:
                return r2
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843828(0x1010434, float:2.3696574E-38)
            r3 = 0
            r1[r3] = r2
            androidx.drawerlayout.widget.DrawerLayout.THEME_ATTRS = r1
            int[] r1 = new int[r0]
            r2 = 16842931(0x10100b3, float:2.369406E-38)
            r1[r3] = r2
            androidx.drawerlayout.widget.DrawerLayout.LAYOUT_ATTRS = r1
            androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS = r0
            androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION = r0
            return
    }

    public DrawerLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public DrawerLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public DrawerLayout(android.content.Context r6, android.util.AttributeSet r7, int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate r7 = new androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate
            r7.<init>()
            r5.mChildAccessibilityDelegate = r7
            r7 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r5.mScrimColor = r7
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r5.mScrimPaint = r7
            r7 = 1
            r5.mFirstLayout = r7
            r8 = 3
            r5.mLockModeLeft = r8
            r5.mLockModeRight = r8
            r5.mLockModeStart = r8
            r5.mLockModeEnd = r8
            r0 = 0
            r5.mShadowStart = r0
            r5.mShadowEnd = r0
            r5.mShadowLeft = r0
            r5.mShadowRight = r0
            r0 = 262144(0x40000, float:3.67342E-40)
            r5.setDescendantFocusability(r0)
            android.content.res.Resources r0 = r5.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            r1 = 1115684864(0x42800000, float:64.0)
            float r1 = r1 * r0
            r2 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r2
            int r1 = (int) r1
            r5.mMinDrawerMargin = r1
            r1 = 1137180672(0x43c80000, float:400.0)
            float r1 = r1 * r0
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r2 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback
            r2.<init>(r5, r8)
            r5.mLeftCallback = r2
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r8 = new androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback
            r3 = 5
            r8.<init>(r5, r3)
            r5.mRightCallback = r8
            r3 = 1065353216(0x3f800000, float:1.0)
            androidx.customview.widget.ViewDragHelper r4 = androidx.customview.widget.ViewDragHelper.create(r5, r3, r2)
            r5.mLeftDragger = r4
            r4.setEdgeTrackingEnabled(r7)
            r4.setMinVelocity(r1)
            r2.setDragger(r4)
            androidx.customview.widget.ViewDragHelper r2 = androidx.customview.widget.ViewDragHelper.create(r5, r3, r8)
            r5.mRightDragger = r2
            r3 = 2
            r2.setEdgeTrackingEnabled(r3)
            r2.setMinVelocity(r1)
            r8.setDragger(r2)
            r5.setFocusableInTouchMode(r7)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r5, r7)
            androidx.drawerlayout.widget.DrawerLayout$AccessibilityDelegate r7 = new androidx.drawerlayout.widget.DrawerLayout$AccessibilityDelegate
            r7.<init>(r5)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r7)
            r7 = 0
            r5.setMotionEventSplittingEnabled(r7)
            boolean r8 = androidx.core.view.ViewCompat.getFitsSystemWindows(r5)
            if (r8 == 0) goto Laf
            androidx.drawerlayout.widget.DrawerLayout$1 r8 = new androidx.drawerlayout.widget.DrawerLayout$1
            r8.<init>(r5)
            r5.setOnApplyWindowInsetsListener(r8)
            r8 = 1280(0x500, float:1.794E-42)
            r5.setSystemUiVisibility(r8)
            int[] r8 = androidx.drawerlayout.widget.DrawerLayout.THEME_ATTRS
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r8)
            android.graphics.drawable.Drawable r7 = r6.getDrawable(r7)     // Catch: java.lang.Throwable -> Laa
            r5.mStatusBarBackground = r7     // Catch: java.lang.Throwable -> Laa
            r6.recycle()
            goto Laf
        Laa:
            r7 = move-exception
            r6.recycle()
            throw r7
        Laf:
            r6 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 * r6
            r5.mDrawerElevation = r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.mNonDrawerViews = r6
            return
    }

    private boolean dispatchTransformedGenericPointerEvent(android.view.MotionEvent r4, android.view.View r5) {
            r3 = this;
            android.graphics.Matrix r0 = r5.getMatrix()
            boolean r0 = r0.isIdentity()
            if (r0 != 0) goto L16
            android.view.MotionEvent r4 = r3.getTransformedMotionEvent(r4, r5)
            boolean r5 = r5.dispatchGenericMotionEvent(r4)
            r4.recycle()
            goto L36
        L16:
            int r0 = r3.getScrollX()
            int r1 = r5.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r3.getScrollY()
            int r2 = r5.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            r4.offsetLocation(r0, r1)
            boolean r5 = r5.dispatchGenericMotionEvent(r4)
            float r0 = -r0
            float r1 = -r1
            r4.offsetLocation(r0, r1)
        L36:
            return r5
    }

    private android.view.MotionEvent getTransformedMotionEvent(android.view.MotionEvent r4, android.view.View r5) {
            r3 = this;
            int r0 = r3.getScrollX()
            int r1 = r5.getLeft()
            int r0 = r0 - r1
            float r0 = (float) r0
            int r1 = r3.getScrollY()
            int r2 = r5.getTop()
            int r1 = r1 - r2
            float r1 = (float) r1
            android.view.MotionEvent r4 = android.view.MotionEvent.obtain(r4)
            r4.offsetLocation(r0, r1)
            android.graphics.Matrix r5 = r5.getMatrix()
            boolean r0 = r5.isIdentity()
            if (r0 != 0) goto L3a
            android.graphics.Matrix r0 = r3.mChildInvertedMatrix
            if (r0 != 0) goto L30
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r3.mChildInvertedMatrix = r0
        L30:
            android.graphics.Matrix r0 = r3.mChildInvertedMatrix
            r5.invert(r0)
            android.graphics.Matrix r5 = r3.mChildInvertedMatrix
            r4.transform(r5)
        L3a:
            return r4
    }

    static java.lang.String gravityToString(int r2) {
            r0 = r2 & 3
            r1 = 3
            if (r0 != r1) goto L8
            java.lang.String r2 = "LEFT"
            return r2
        L8:
            r0 = r2 & 5
            r1 = 5
            if (r0 != r1) goto L10
            java.lang.String r2 = "RIGHT"
            return r2
        L10:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            return r2
    }

    private static boolean hasOpaqueBackground(android.view.View r2) {
            android.graphics.drawable.Drawable r2 = r2.getBackground()
            r0 = 0
            if (r2 == 0) goto Lf
            int r2 = r2.getOpacity()
            r1 = -1
            if (r2 != r1) goto Lf
            r0 = 1
        Lf:
            return r0
    }

    private boolean hasPeekingDrawer() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            boolean r3 = r3.isPeeking
            if (r3 == 0) goto L18
            r0 = 1
            return r0
        L18:
            int r2 = r2 + 1
            goto L6
        L1b:
            return r1
    }

    private boolean hasVisibleDrawer() {
            r1 = this;
            android.view.View r0 = r1.findVisibleDrawer()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    static boolean includeChildForAccessibility(android.view.View r2) {
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r2)
            r1 = 4
            if (r0 == r1) goto L10
            int r2 = androidx.core.view.ViewCompat.getImportantForAccessibility(r2)
            r0 = 2
            if (r2 == r0) goto L10
            r2 = 1
            goto L11
        L10:
            r2 = 0
        L11:
            return r2
    }

    private boolean isInBoundsOfChild(float r2, float r3, android.view.View r4) {
            r1 = this;
            android.graphics.Rect r0 = r1.mChildHitRect
            if (r0 != 0) goto Lb
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r1.mChildHitRect = r0
        Lb:
            android.graphics.Rect r0 = r1.mChildHitRect
            r4.getHitRect(r0)
            android.graphics.Rect r4 = r1.mChildHitRect
            int r2 = (int) r2
            int r3 = (int) r3
            boolean r2 = r4.contains(r2, r3)
            return r2
    }

    private boolean mirror(android.graphics.drawable.Drawable r2, int r3) {
            r1 = this;
            if (r2 == 0) goto Le
            boolean r0 = androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(r2)
            if (r0 != 0) goto L9
            goto Le
        L9:
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r2, r3)
            r2 = 1
            return r2
        Le:
            r2 = 0
            return r2
    }

    private android.graphics.drawable.Drawable resolveLeftShadow() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            if (r0 != 0) goto L10
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            if (r1 == 0) goto L1a
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.mShadowStart
            return r0
        L10:
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            if (r1 == 0) goto L1a
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.mShadowEnd
            return r0
        L1a:
            android.graphics.drawable.Drawable r0 = r2.mShadowLeft
            return r0
    }

    private android.graphics.drawable.Drawable resolveRightShadow() {
            r2 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            if (r0 != 0) goto L10
            android.graphics.drawable.Drawable r1 = r2.mShadowEnd
            if (r1 == 0) goto L1a
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.mShadowEnd
            return r0
        L10:
            android.graphics.drawable.Drawable r1 = r2.mShadowStart
            if (r1 == 0) goto L1a
            r2.mirror(r1, r0)
            android.graphics.drawable.Drawable r0 = r2.mShadowStart
            return r0
        L1a:
            android.graphics.drawable.Drawable r0 = r2.mShadowRight
            return r0
    }

    private void resolveShadowDrawables() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L5
            return
        L5:
            android.graphics.drawable.Drawable r0 = r1.resolveLeftShadow()
            r1.mShadowLeftResolved = r0
            android.graphics.drawable.Drawable r0 = r1.resolveRightShadow()
            r1.mShadowRightResolved = r0
            return
    }

    private void updateChildrenImportantForAccessibility(android.view.View r5, boolean r6) {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L23
            android.view.View r2 = r4.getChildAt(r1)
            if (r6 != 0) goto L13
            boolean r3 = r4.isDrawerView(r2)
            if (r3 == 0) goto L17
        L13:
            if (r6 == 0) goto L1c
            if (r2 != r5) goto L1c
        L17:
            r3 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
            goto L20
        L1c:
            r3 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r2, r3)
        L20:
            int r1 = r1 + 1
            goto L5
        L23:
            return
    }

    public void addDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mListeners = r0
        Le:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(java.util.ArrayList<android.view.View> r7, int r8, int r9) {
            r6 = this;
            int r0 = r6.getDescendantFocusability()
            r1 = 393216(0x60000, float:5.51013E-40)
            if (r0 != r1) goto L9
            return
        L9:
            int r0 = r6.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L10:
            if (r2 >= r0) goto L2f
            android.view.View r4 = r6.getChildAt(r2)
            boolean r5 = r6.isDrawerView(r4)
            if (r5 == 0) goto L27
            boolean r5 = r6.isDrawerOpen(r4)
            if (r5 == 0) goto L2c
            r4.addFocusables(r7, r8, r9)
            r3 = 1
            goto L2c
        L27:
            java.util.ArrayList<android.view.View> r5 = r6.mNonDrawerViews
            r5.add(r4)
        L2c:
            int r2 = r2 + 1
            goto L10
        L2f:
            if (r3 != 0) goto L4d
            java.util.ArrayList<android.view.View> r0 = r6.mNonDrawerViews
            int r0 = r0.size()
        L37:
            if (r1 >= r0) goto L4d
            java.util.ArrayList<android.view.View> r2 = r6.mNonDrawerViews
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L4a
            r2.addFocusables(r7, r8, r9)
        L4a:
            int r1 = r1 + 1
            goto L37
        L4d:
            java.util.ArrayList<android.view.View> r7 = r6.mNonDrawerViews
            r7.clear()
            return
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            android.view.View r2 = r0.findOpenDrawer()
            if (r2 != 0) goto L15
            boolean r2 = r0.isDrawerView(r1)
            if (r2 == 0) goto L10
            goto L15
        L10:
            r2 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
            goto L19
        L15:
            r2 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r1, r2)
        L19:
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.CAN_HIDE_DESCENDANTS
            if (r2 != 0) goto L22
            androidx.drawerlayout.widget.DrawerLayout$ChildAccessibilityDelegate r2 = r0.mChildAccessibilityDelegate
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r1, r2)
        L22:
            return
    }

    void cancelChildViewTouch() {
            r9 = this;
            boolean r0 = r9.mChildrenCanceledTouch
            if (r0 != 0) goto L28
            long r3 = android.os.SystemClock.uptimeMillis()
            r5 = 3
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r3
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r1, r3, r5, r6, r7, r8)
            int r1 = r9.getChildCount()
            r2 = 0
        L16:
            if (r2 >= r1) goto L22
            android.view.View r3 = r9.getChildAt(r2)
            r3.dispatchTouchEvent(r0)
            int r2 = r2 + 1
            goto L16
        L22:
            r0.recycle()
            r0 = 1
            r9.mChildrenCanceledTouch = r0
        L28:
            return
    }

    boolean checkDrawerViewAbsoluteGravity(android.view.View r1, int r2) {
            r0 = this;
            int r1 = r0.getDrawerViewAbsoluteGravity(r1)
            r1 = r1 & r2
            if (r1 != r2) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            return r1
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
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

    public void closeDrawer(int r2) {
            r1 = this;
            r0 = 1
            r1.closeDrawer(r2, r0)
            return
    }

    public void closeDrawer(int r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.findDrawerWithGravity(r3)
            if (r0 == 0) goto La
            r2.closeDrawer(r0, r4)
            return
        La:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No drawer view found with gravity "
            r0.<init>(r1)
            java.lang.String r3 = gravityToString(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public void closeDrawer(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.closeDrawer(r2, r0)
            return
    }

    public void closeDrawer(android.view.View r5, boolean r6) {
            r4 = this;
            boolean r0 = r4.isDrawerView(r5)
            if (r0 == 0) goto L52
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            boolean r1 = r4.mFirstLayout
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L17
            r0.onScreen = r3
            r0.openState = r2
            goto L4e
        L17:
            r1 = 4
            if (r6 == 0) goto L43
            int r6 = r0.openState
            r6 = r6 | r1
            r0.openState = r6
            r6 = 3
            boolean r6 = r4.checkDrawerViewAbsoluteGravity(r5, r6)
            if (r6 == 0) goto L35
            androidx.customview.widget.ViewDragHelper r6 = r4.mLeftDragger
            int r0 = r5.getWidth()
            int r0 = -r0
            int r1 = r5.getTop()
            r6.smoothSlideViewTo(r5, r0, r1)
            goto L4e
        L35:
            androidx.customview.widget.ViewDragHelper r6 = r4.mRightDragger
            int r0 = r4.getWidth()
            int r1 = r5.getTop()
            r6.smoothSlideViewTo(r5, r0, r1)
            goto L4e
        L43:
            r4.moveDrawerToOffset(r5, r3)
            int r6 = r0.gravity
            r4.updateDrawerState(r6, r2, r5)
            r5.setVisibility(r1)
        L4e:
            r4.invalidate()
            return
        L52:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "View "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r0 = " is not a sliding drawer"
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
    }

    public void closeDrawers() {
            r1 = this;
            r0 = 0
            r1.closeDrawers(r0)
            return
    }

    void closeDrawers(boolean r10) {
            r9 = this;
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            if (r2 >= r0) goto L4b
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r5 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r5
            boolean r6 = r9.isDrawerView(r4)
            if (r6 == 0) goto L48
            if (r10 == 0) goto L20
            boolean r6 = r5.isPeeking
            if (r6 != 0) goto L20
            goto L48
        L20:
            int r6 = r4.getWidth()
            r7 = 3
            boolean r7 = r9.checkDrawerViewAbsoluteGravity(r4, r7)
            if (r7 == 0) goto L37
            androidx.customview.widget.ViewDragHelper r7 = r9.mLeftDragger
            int r6 = -r6
            int r8 = r4.getTop()
            boolean r4 = r7.smoothSlideViewTo(r4, r6, r8)
            goto L45
        L37:
            androidx.customview.widget.ViewDragHelper r6 = r9.mRightDragger
            int r7 = r9.getWidth()
            int r8 = r4.getTop()
            boolean r4 = r6.smoothSlideViewTo(r4, r7, r8)
        L45:
            r3 = r3 | r4
            r5.isPeeking = r1
        L48:
            int r2 = r2 + 1
            goto L7
        L4b:
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r10 = r9.mLeftCallback
            r10.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r10 = r9.mRightCallback
            r10.removeCallbacks()
            if (r3 == 0) goto L5a
            r9.invalidate()
        L5a:
            return
    }

    @Override // android.view.View
    public void computeScroll() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L1b
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            float r3 = r3.onScreen
            float r1 = java.lang.Math.max(r1, r3)
            int r2 = r2 + 1
            goto L6
        L1b:
            r4.mScrimOpacity = r1
            androidx.customview.widget.ViewDragHelper r0 = r4.mLeftDragger
            r1 = 1
            boolean r0 = r0.continueSettling(r1)
            androidx.customview.widget.ViewDragHelper r2 = r4.mRightDragger
            boolean r1 = r2.continueSettling(r1)
            if (r0 != 0) goto L2e
            if (r1 == 0) goto L31
        L2e:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r4)
        L31:
            return
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getSource()
            r0 = r0 & 2
            if (r0 == 0) goto L47
            int r0 = r7.getAction()
            r1 = 10
            if (r0 == r1) goto L47
            float r0 = r6.mScrimOpacity
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L18
            goto L47
        L18:
            int r0 = r6.getChildCount()
            if (r0 == 0) goto L45
            float r1 = r7.getX()
            float r2 = r7.getY()
            r3 = 1
            int r0 = r0 - r3
        L28:
            if (r0 < 0) goto L45
            android.view.View r4 = r6.getChildAt(r0)
            boolean r5 = r6.isInBoundsOfChild(r1, r2, r4)
            if (r5 == 0) goto L42
            boolean r5 = r6.isContentView(r4)
            if (r5 == 0) goto L3b
            goto L42
        L3b:
            boolean r4 = r6.dispatchTransformedGenericPointerEvent(r7, r4)
            if (r4 == 0) goto L42
            return r3
        L42:
            int r0 = r0 + (-1)
            goto L28
        L45:
            r7 = 0
            return r7
        L47:
            boolean r7 = super.dispatchGenericMotionEvent(r7)
            return r7
    }

    void dispatchOnDrawerClosed(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r1 = r0.openState
            r2 = 1
            r1 = r1 & r2
            if (r1 != r2) goto L3c
            r1 = 0
            r0.openState = r1
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r3.mListeners
            if (r0 == 0) goto L28
            int r0 = r0.size()
            int r0 = r0 - r2
        L18:
            if (r0 < 0) goto L28
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r2 = r3.mListeners
            java.lang.Object r2 = r2.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r2 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r2
            r2.onDrawerClosed(r4)
            int r0 = r0 + (-1)
            goto L18
        L28:
            r3.updateChildrenImportantForAccessibility(r4, r1)
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L3c
            android.view.View r4 = r3.getRootView()
            if (r4 == 0) goto L3c
            r0 = 32
            r4.sendAccessibilityEvent(r0)
        L3c:
            return
    }

    void dispatchOnDrawerOpened(android.view.View r4) {
            r3 = this;
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r1 = r0.openState
            r2 = 1
            r1 = r1 & r2
            if (r1 != 0) goto L35
            r0.openState = r2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r3.mListeners
            if (r0 == 0) goto L27
            int r0 = r0.size()
            int r0 = r0 - r2
        L17:
            if (r0 < 0) goto L27
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r1 = r3.mListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r1
            r1.onDrawerOpened(r4)
            int r0 = r0 + (-1)
            goto L17
        L27:
            r3.updateChildrenImportantForAccessibility(r4, r2)
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L35
            r4 = 32
            r3.sendAccessibilityEvent(r4)
        L35:
            return
    }

    void dispatchOnDrawerSlide(android.view.View r3, float r4) {
            r2 = this;
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r2.mListeners
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            int r0 = r0 + (-1)
        La:
            if (r0 < 0) goto L1a
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r1 = r2.mListeners
            java.lang.Object r1 = r1.get(r0)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r1 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r1
            r1.onDrawerSlide(r3, r4)
            int r0 = r0 + (-1)
            goto La
        L1a:
            return
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(android.graphics.Canvas r15, android.view.View r16, long r17) {
            r14 = this;
            r0 = r14
            r1 = r15
            r2 = r16
            int r3 = r14.getHeight()
            boolean r4 = r14.isContentView(r2)
            int r5 = r14.getWidth()
            int r6 = r15.save()
            r7 = 3
            r8 = 0
            if (r4 == 0) goto L5f
            int r9 = r14.getChildCount()
            r10 = r8
            r11 = r10
        L1e:
            if (r10 >= r9) goto L57
            android.view.View r12 = r14.getChildAt(r10)
            if (r12 == r2) goto L54
            int r13 = r12.getVisibility()
            if (r13 != 0) goto L54
            boolean r13 = hasOpaqueBackground(r12)
            if (r13 == 0) goto L54
            boolean r13 = r14.isDrawerView(r12)
            if (r13 == 0) goto L54
            int r13 = r12.getHeight()
            if (r13 >= r3) goto L3f
            goto L54
        L3f:
            boolean r13 = r14.checkDrawerViewAbsoluteGravity(r12, r7)
            if (r13 == 0) goto L4d
            int r12 = r12.getRight()
            if (r12 <= r11) goto L54
            r11 = r12
            goto L54
        L4d:
            int r12 = r12.getLeft()
            if (r12 >= r5) goto L54
            r5 = r12
        L54:
            int r10 = r10 + 1
            goto L1e
        L57:
            int r3 = r14.getHeight()
            r15.clipRect(r11, r8, r5, r3)
            r8 = r11
        L5f:
            boolean r9 = super.drawChild(r15, r16, r17)
            r15.restoreToCount(r6)
            float r3 = r0.mScrimOpacity
            r6 = 0
            int r10 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r10 <= 0) goto L95
            if (r4 == 0) goto L95
            int r2 = r0.mScrimColor
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4 = r4 & r2
            int r4 = r4 >>> 24
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            int r3 = r3 << 24
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r4
            r2 = r2 | r3
            android.graphics.Paint r3 = r0.mScrimPaint
            r3.setColor(r2)
            float r2 = (float) r8
            r3 = 0
            float r4 = (float) r5
            int r5 = r14.getHeight()
            float r5 = (float) r5
            android.graphics.Paint r6 = r0.mScrimPaint
            r1 = r15
            r1.drawRect(r2, r3, r4, r5, r6)
            goto L11f
        L95:
            android.graphics.drawable.Drawable r3 = r0.mShadowLeftResolved
            r4 = 1132396544(0x437f0000, float:255.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 == 0) goto Ld9
            boolean r3 = r14.checkDrawerViewAbsoluteGravity(r2, r7)
            if (r3 == 0) goto Ld9
            android.graphics.drawable.Drawable r3 = r0.mShadowLeftResolved
            int r3 = r3.getIntrinsicWidth()
            int r7 = r16.getRight()
            androidx.customview.widget.ViewDragHelper r8 = r0.mLeftDragger
            int r8 = r8.getEdgeSize()
            float r10 = (float) r7
            float r8 = (float) r8
            float r10 = r10 / r8
            float r5 = java.lang.Math.min(r10, r5)
            float r5 = java.lang.Math.max(r6, r5)
            android.graphics.drawable.Drawable r6 = r0.mShadowLeftResolved
            int r8 = r16.getTop()
            int r3 = r3 + r7
            int r2 = r16.getBottom()
            r6.setBounds(r7, r8, r3, r2)
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            float r5 = r5 * r4
            int r3 = (int) r5
            r2.setAlpha(r3)
            android.graphics.drawable.Drawable r2 = r0.mShadowLeftResolved
            r2.draw(r15)
            goto L11f
        Ld9:
            android.graphics.drawable.Drawable r3 = r0.mShadowRightResolved
            if (r3 == 0) goto L11f
            r3 = 5
            boolean r3 = r14.checkDrawerViewAbsoluteGravity(r2, r3)
            if (r3 == 0) goto L11f
            android.graphics.drawable.Drawable r3 = r0.mShadowRightResolved
            int r3 = r3.getIntrinsicWidth()
            int r7 = r16.getLeft()
            int r8 = r14.getWidth()
            int r8 = r8 - r7
            androidx.customview.widget.ViewDragHelper r10 = r0.mRightDragger
            int r10 = r10.getEdgeSize()
            float r8 = (float) r8
            float r10 = (float) r10
            float r8 = r8 / r10
            float r5 = java.lang.Math.min(r8, r5)
            float r5 = java.lang.Math.max(r6, r5)
            android.graphics.drawable.Drawable r6 = r0.mShadowRightResolved
            int r3 = r7 - r3
            int r8 = r16.getTop()
            int r2 = r16.getBottom()
            r6.setBounds(r3, r8, r7, r2)
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            float r5 = r5 * r4
            int r3 = (int) r5
            r2.setAlpha(r3)
            android.graphics.drawable.Drawable r2 = r0.mShadowRightResolved
            r2.draw(r15)
        L11f:
            return r9
    }

    android.view.View findDrawerWithGravity(int r5) {
            r4 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            int r5 = androidx.core.view.GravityCompat.getAbsoluteGravity(r5, r0)
            r5 = r5 & 7
            int r0 = r4.getChildCount()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L21
            android.view.View r2 = r4.getChildAt(r1)
            int r3 = r4.getDrawerViewAbsoluteGravity(r2)
            r3 = r3 & 7
            if (r3 != r5) goto L1e
            return r2
        L1e:
            int r1 = r1 + 1
            goto Lf
        L21:
            r5 = 0
            return r5
    }

    android.view.View findOpenDrawer() {
            r5 = this;
            int r0 = r5.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.View r2 = r5.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r3 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r3
            int r3 = r3.openState
            r4 = 1
            r3 = r3 & r4
            if (r3 != r4) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r0 = 0
            return r0
    }

    android.view.View findVisibleDrawer() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1b
            android.view.View r2 = r4.getChildAt(r1)
            boolean r3 = r4.isDrawerView(r2)
            if (r3 == 0) goto L18
            boolean r3 = r4.isDrawerVisible(r2)
            if (r3 == 0) goto L18
            return r2
        L18:
            int r1 = r1 + 1
            goto L5
        L1b:
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r1 = -1
            r0.<init>(r1, r1)
            return r0
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.view.ViewGroup
    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.drawerlayout.widget.DrawerLayout.LayoutParams
            if (r0 == 0) goto Lc
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r2 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r2
            r0.<init>(r2)
            goto L1d
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            goto L1d
        L18:
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = new androidx.drawerlayout.widget.DrawerLayout$LayoutParams
            r0.<init>(r2)
        L1d:
            return r0
    }

    public float getDrawerElevation() {
            r1 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L7
            float r0 = r1.mDrawerElevation
            return r0
        L7:
            r0 = 0
            return r0
    }

    public int getDrawerLockMode(int r4) {
            r3 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            r1 = 3
            if (r4 == r1) goto L42
            r2 = 5
            if (r4 == r2) goto L33
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 == r2) goto L24
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r4 == r2) goto L15
            goto L51
        L15:
            int r4 = r3.mLockModeEnd
            if (r4 == r1) goto L1a
            return r4
        L1a:
            if (r0 != 0) goto L1f
            int r4 = r3.mLockModeRight
            goto L21
        L1f:
            int r4 = r3.mLockModeLeft
        L21:
            if (r4 == r1) goto L51
            return r4
        L24:
            int r4 = r3.mLockModeStart
            if (r4 == r1) goto L29
            return r4
        L29:
            if (r0 != 0) goto L2e
            int r4 = r3.mLockModeLeft
            goto L30
        L2e:
            int r4 = r3.mLockModeRight
        L30:
            if (r4 == r1) goto L51
            return r4
        L33:
            int r4 = r3.mLockModeRight
            if (r4 == r1) goto L38
            return r4
        L38:
            if (r0 != 0) goto L3d
            int r4 = r3.mLockModeEnd
            goto L3f
        L3d:
            int r4 = r3.mLockModeStart
        L3f:
            if (r4 == r1) goto L51
            return r4
        L42:
            int r4 = r3.mLockModeLeft
            if (r4 == r1) goto L47
            return r4
        L47:
            if (r0 != 0) goto L4c
            int r4 = r3.mLockModeStart
            goto L4e
        L4c:
            int r4 = r3.mLockModeEnd
        L4e:
            if (r4 == r1) goto L51
            return r4
        L51:
            r4 = 0
            return r4
    }

    public int getDrawerLockMode(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L13
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r4 = r4.gravity
            int r4 = r3.getDrawerLockMode(r4)
            return r4
        L13:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not a drawer"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.lang.CharSequence getDrawerTitle(int r2) {
            r1 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r0 = 3
            if (r2 != r0) goto Le
            java.lang.CharSequence r2 = r1.mTitleLeft
            return r2
        Le:
            r0 = 5
            if (r2 != r0) goto L14
            java.lang.CharSequence r2 = r1.mTitleRight
            return r2
        L14:
            r2 = 0
            return r2
    }

    int getDrawerViewAbsoluteGravity(android.view.View r2) {
            r1 = this;
            android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r2 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r2
            int r2 = r2.gravity
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            return r2
    }

    float getDrawerViewOffset(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            float r1 = r1.onScreen
            return r1
    }

    public android.graphics.drawable.Drawable getStatusBarBackgroundDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mStatusBarBackground
            return r0
    }

    boolean isContentView(android.view.View r1) {
            r0 = this;
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r1 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r1
            int r1 = r1.gravity
            if (r1 != 0) goto Lc
            r1 = 1
            goto Ld
        Lc:
            r1 = 0
        Ld:
            return r1
    }

    public boolean isDrawerOpen(int r1) {
            r0 = this;
            android.view.View r1 = r0.findDrawerWithGravity(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r0.isDrawerOpen(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean isDrawerOpen(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L15
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r4 = r4.openState
            r0 = 1
            r4 = r4 & r0
            if (r4 != r0) goto L13
            goto L14
        L13:
            r0 = 0
        L14:
            return r0
        L15:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not a drawer"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    boolean isDrawerView(android.view.View r3) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            int r0 = r0.gravity
            int r3 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            int r3 = androidx.core.view.GravityCompat.getAbsoluteGravity(r0, r3)
            r0 = r3 & 3
            r1 = 1
            if (r0 == 0) goto L16
            return r1
        L16:
            r3 = r3 & 5
            if (r3 == 0) goto L1b
            return r1
        L1b:
            r3 = 0
            return r3
    }

    public boolean isDrawerVisible(int r1) {
            r0 = this;
            android.view.View r1 = r0.findDrawerWithGravity(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r0.isDrawerVisible(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean isDrawerVisible(android.view.View r4) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L17
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            float r4 = r4.onScreen
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L15
            r4 = 1
            goto L16
        L15:
            r4 = 0
        L16:
            return r4
        L17:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "View "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r1 = " is not a drawer"
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    void moveDrawerToOffset(android.view.View r3, float r4) {
            r2 = this;
            float r0 = r2.getDrawerViewOffset(r3)
            int r1 = r3.getWidth()
            float r1 = (float) r1
            float r0 = r0 * r1
            int r0 = (int) r0
            float r1 = r1 * r4
            int r1 = (int) r1
            int r1 = r1 - r0
            r0 = 3
            boolean r0 = r2.checkDrawerViewAbsoluteGravity(r3, r0)
            if (r0 == 0) goto L16
            goto L17
        L16:
            int r1 = -r1
        L17:
            r3.offsetLeftAndRight(r1)
            r2.setDrawerViewOffset(r3, r4)
            return
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
            super.onDetachedFromWindow()
            r0 = 1
            r1.mFirstLayout = r0
            return
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas r5) {
            r4 = this;
            super.onDraw(r5)
            boolean r0 = r4.mDrawStatusBarBackground
            if (r0 == 0) goto L28
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            if (r0 == 0) goto L28
            java.lang.Object r0 = r4.mLastInsets
            r1 = 0
            if (r0 == 0) goto L17
            android.view.WindowInsets r0 = (android.view.WindowInsets) r0
            int r0 = r0.getSystemWindowInsetTop()
            goto L18
        L17:
            r0 = r1
        L18:
            if (r0 <= 0) goto L28
            android.graphics.drawable.Drawable r2 = r4.mStatusBarBackground
            int r3 = r4.getWidth()
            r2.setBounds(r1, r1, r3, r0)
            android.graphics.drawable.Drawable r0 = r4.mStatusBarBackground
            r0.draw(r5)
        L28:
            return
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            int r0 = r7.getActionMasked()
            androidx.customview.widget.ViewDragHelper r1 = r6.mLeftDragger
            boolean r1 = r1.shouldInterceptTouchEvent(r7)
            androidx.customview.widget.ViewDragHelper r2 = r6.mRightDragger
            boolean r2 = r2.shouldInterceptTouchEvent(r7)
            r1 = r1 | r2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L3a
            if (r0 == r2) goto L31
            r7 = 2
            r4 = 3
            if (r0 == r7) goto L1e
            if (r0 == r4) goto L31
            goto L38
        L1e:
            androidx.customview.widget.ViewDragHelper r7 = r6.mLeftDragger
            boolean r7 = r7.checkTouchSlop(r4)
            if (r7 == 0) goto L38
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.mLeftCallback
            r7.removeCallbacks()
            androidx.drawerlayout.widget.DrawerLayout$ViewDragCallback r7 = r6.mRightCallback
            r7.removeCallbacks()
            goto L38
        L31:
            r6.closeDrawers(r2)
            r6.mDisallowInterceptRequested = r3
            r6.mChildrenCanceledTouch = r3
        L38:
            r7 = r3
            goto L64
        L3a:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r7
            float r4 = r6.mScrimOpacity
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 <= 0) goto L5f
            androidx.customview.widget.ViewDragHelper r4 = r6.mLeftDragger
            int r0 = (int) r0
            int r7 = (int) r7
            android.view.View r7 = r4.findTopChildUnder(r0, r7)
            if (r7 == 0) goto L5f
            boolean r7 = r6.isContentView(r7)
            if (r7 == 0) goto L5f
            r7 = r2
            goto L60
        L5f:
            r7 = r3
        L60:
            r6.mDisallowInterceptRequested = r3
            r6.mChildrenCanceledTouch = r3
        L64:
            if (r1 != 0) goto L74
            if (r7 != 0) goto L74
            boolean r7 = r6.hasPeekingDrawer()
            if (r7 != 0) goto L74
            boolean r7 = r6.mChildrenCanceledTouch
            if (r7 == 0) goto L73
            goto L74
        L73:
            r2 = r3
        L74:
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto Le
            boolean r0 = r1.hasVisibleDrawer()
            if (r0 == 0) goto Le
            r3.startTracking()
            r2 = 1
            return r2
        Le:
            boolean r2 = super.onKeyDown(r2, r3)
            return r2
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int r2, android.view.KeyEvent r3) {
            r1 = this;
            r0 = 4
            if (r2 != r0) goto L18
            android.view.View r2 = r1.findVisibleDrawer()
            if (r2 == 0) goto L12
            int r3 = r1.getDrawerLockMode(r2)
            if (r3 != 0) goto L12
            r1.closeDrawers()
        L12:
            if (r2 == 0) goto L16
            r2 = 1
            goto L17
        L16:
            r2 = 0
        L17:
            return r2
        L18:
            boolean r2 = super.onKeyUp(r2, r3)
            return r2
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r17, int r18, int r19, int r20, int r21) {
            r16 = this;
            r0 = r16
            r1 = 1
            r0.mInLayout = r1
            int r2 = r20 - r18
            int r3 = r16.getChildCount()
            r4 = 0
            r5 = r4
        Ld:
            if (r5 >= r3) goto Ld5
            android.view.View r6 = r0.getChildAt(r5)
            int r7 = r6.getVisibility()
            r8 = 8
            if (r7 != r8) goto L1d
            goto Ld0
        L1d:
            android.view.ViewGroup$LayoutParams r7 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r7 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r7
            boolean r8 = r0.isContentView(r6)
            if (r8 == 0) goto L40
            int r8 = r7.leftMargin
            int r9 = r7.topMargin
            int r10 = r7.leftMargin
            int r11 = r6.getMeasuredWidth()
            int r10 = r10 + r11
            int r7 = r7.topMargin
            int r11 = r6.getMeasuredHeight()
            int r7 = r7 + r11
            r6.layout(r8, r9, r10, r7)
            goto Ld0
        L40:
            int r8 = r6.getMeasuredWidth()
            int r9 = r6.getMeasuredHeight()
            r10 = 3
            boolean r10 = r0.checkDrawerViewAbsoluteGravity(r6, r10)
            if (r10 == 0) goto L5b
            int r10 = -r8
            float r11 = (float) r8
            float r12 = r7.onScreen
            float r12 = r12 * r11
            int r12 = (int) r12
            int r10 = r10 + r12
            int r12 = r8 + r10
            float r12 = (float) r12
            float r12 = r12 / r11
            goto L67
        L5b:
            float r10 = (float) r8
            float r11 = r7.onScreen
            float r11 = r11 * r10
            int r11 = (int) r11
            int r11 = r2 - r11
            int r12 = r2 - r11
            float r12 = (float) r12
            float r12 = r12 / r10
            r10 = r11
        L67:
            float r11 = r7.onScreen
            int r11 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
            if (r11 == 0) goto L6f
            r11 = r1
            goto L70
        L6f:
            r11 = r4
        L70:
            int r13 = r7.gravity
            r13 = r13 & 112(0x70, float:1.57E-43)
            r14 = 16
            if (r13 == r14) goto L99
            r14 = 80
            if (r13 == r14) goto L86
            int r13 = r7.topMargin
            int r8 = r8 + r10
            int r14 = r7.topMargin
            int r14 = r14 + r9
            r6.layout(r10, r13, r8, r14)
            goto Lb8
        L86:
            int r9 = r21 - r19
            int r13 = r7.bottomMargin
            int r13 = r9 - r13
            int r14 = r6.getMeasuredHeight()
            int r13 = r13 - r14
            int r8 = r8 + r10
            int r14 = r7.bottomMargin
            int r9 = r9 - r14
            r6.layout(r10, r13, r8, r9)
            goto Lb8
        L99:
            int r13 = r21 - r19
            int r14 = r13 - r9
            int r14 = r14 / 2
            int r15 = r7.topMargin
            if (r14 >= r15) goto La6
            int r14 = r7.topMargin
            goto Lb3
        La6:
            int r15 = r14 + r9
            int r1 = r7.bottomMargin
            int r1 = r13 - r1
            if (r15 <= r1) goto Lb3
            int r1 = r7.bottomMargin
            int r13 = r13 - r1
            int r14 = r13 - r9
        Lb3:
            int r8 = r8 + r10
            int r9 = r9 + r14
            r6.layout(r10, r14, r8, r9)
        Lb8:
            if (r11 == 0) goto Lbd
            r0.setDrawerViewOffset(r6, r12)
        Lbd:
            float r1 = r7.onScreen
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 <= 0) goto Lc6
            r1 = r4
            goto Lc7
        Lc6:
            r1 = 4
        Lc7:
            int r7 = r6.getVisibility()
            if (r7 == r1) goto Ld0
            r6.setVisibility(r1)
        Ld0:
            int r5 = r5 + 1
            r1 = 1
            goto Ld
        Ld5:
            r0.mInLayout = r4
            r0.mFirstLayout = r4
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            int r1 = android.view.View.MeasureSpec.getMode(r18)
            int r2 = android.view.View.MeasureSpec.getMode(r19)
            int r3 = android.view.View.MeasureSpec.getSize(r18)
            int r4 = android.view.View.MeasureSpec.getSize(r19)
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 != r5) goto L18
            if (r2 == r5) goto L2e
        L18:
            boolean r6 = r17.isInEditMode()
            if (r6 == 0) goto L1a4
            r6 = 300(0x12c, float:4.2E-43)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r7) goto L25
            goto L28
        L25:
            if (r1 != 0) goto L28
            r3 = r6
        L28:
            if (r2 != r7) goto L2b
            goto L2e
        L2b:
            if (r2 != 0) goto L2e
            r4 = r6
        L2e:
            r0.setMeasuredDimension(r3, r4)
            java.lang.Object r1 = r0.mLastInsets
            r6 = 0
            if (r1 == 0) goto L3e
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r17)
            if (r1 == 0) goto L3e
            r1 = 1
            goto L3f
        L3e:
            r1 = r6
        L3f:
            int r7 = androidx.core.view.ViewCompat.getLayoutDirection(r17)
            int r8 = r17.getChildCount()
            r9 = r6
            r10 = r9
            r11 = r10
        L4a:
            if (r9 >= r8) goto L1a3
            android.view.View r12 = r0.getChildAt(r9)
            int r13 = r12.getVisibility()
            r14 = 8
            if (r13 != r14) goto L5a
            goto L100
        L5a:
            android.view.ViewGroup$LayoutParams r13 = r12.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r13 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r13
            r14 = 3
            if (r1 == 0) goto Ldf
            int r15 = r13.gravity
            int r15 = androidx.core.view.GravityCompat.getAbsoluteGravity(r15, r7)
            boolean r16 = androidx.core.view.ViewCompat.getFitsSystemWindows(r12)
            r2 = 5
            if (r16 == 0) goto L9d
            java.lang.Object r5 = r0.mLastInsets
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5
            if (r15 != r14) goto L87
            int r2 = r5.getSystemWindowInsetLeft()
            int r15 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r15, r6, r14)
            goto L99
        L87:
            if (r15 != r2) goto L99
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        L99:
            r12.dispatchApplyWindowInsets(r5)
            goto Ldf
        L9d:
            java.lang.Object r5 = r0.mLastInsets
            android.view.WindowInsets r5 = (android.view.WindowInsets) r5
            r14 = 3
            if (r15 != r14) goto Lb5
            int r2 = r5.getSystemWindowInsetLeft()
            int r14 = r5.getSystemWindowInsetTop()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r2, r14, r6, r15)
            goto Lc7
        Lb5:
            if (r15 != r2) goto Lc7
            int r2 = r5.getSystemWindowInsetTop()
            int r14 = r5.getSystemWindowInsetRight()
            int r15 = r5.getSystemWindowInsetBottom()
            android.view.WindowInsets r5 = r5.replaceSystemWindowInsets(r6, r2, r14, r15)
        Lc7:
            int r2 = r5.getSystemWindowInsetLeft()
            r13.leftMargin = r2
            int r2 = r5.getSystemWindowInsetTop()
            r13.topMargin = r2
            int r2 = r5.getSystemWindowInsetRight()
            r13.rightMargin = r2
            int r2 = r5.getSystemWindowInsetBottom()
            r13.bottomMargin = r2
        Ldf:
            boolean r2 = r0.isContentView(r12)
            if (r2 == 0) goto L106
            int r2 = r13.leftMargin
            int r2 = r3 - r2
            int r5 = r13.rightMargin
            int r2 = r2 - r5
            r5 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            int r14 = r13.topMargin
            int r14 = r4 - r14
            int r13 = r13.bottomMargin
            int r14 = r14 - r13
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r14, r5)
            r12.measure(r2, r13)
        L100:
            r15 = r18
            r13 = r19
            goto L178
        L106:
            r5 = 1073741824(0x40000000, float:2.0)
            boolean r2 = r0.isDrawerView(r12)
            if (r2 == 0) goto L17e
            boolean r2 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r2 == 0) goto L11f
            float r2 = androidx.core.view.ViewCompat.getElevation(r12)
            float r14 = r0.mDrawerElevation
            int r2 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r2 == 0) goto L11f
            androidx.core.view.ViewCompat.setElevation(r12, r14)
        L11f:
            int r2 = r0.getDrawerViewAbsoluteGravity(r12)
            r2 = r2 & 7
            r14 = 3
            if (r2 != r14) goto L12a
            r14 = 1
            goto L12b
        L12a:
            r14 = r6
        L12b:
            if (r14 == 0) goto L12f
            if (r10 != 0) goto L134
        L12f:
            if (r14 != 0) goto L153
            if (r11 != 0) goto L134
            goto L153
        L134:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Child drawer has absolute gravity "
            r3.<init>(r4)
            java.lang.String r2 = gravityToString(r2)
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r3 = " but this DrawerLayout already has a drawer view along that edge"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L153:
            if (r14 == 0) goto L157
            r10 = 1
            goto L158
        L157:
            r11 = 1
        L158:
            int r2 = r0.mMinDrawerMargin
            int r14 = r13.leftMargin
            int r2 = r2 + r14
            int r14 = r13.rightMargin
            int r2 = r2 + r14
            int r14 = r13.width
            r15 = r18
            int r2 = getChildMeasureSpec(r15, r2, r14)
            int r14 = r13.topMargin
            int r5 = r13.bottomMargin
            int r14 = r14 + r5
            int r5 = r13.height
            r13 = r19
            int r5 = getChildMeasureSpec(r13, r14, r5)
            r12.measure(r2, r5)
        L178:
            int r9 = r9 + 1
            r5 = 1073741824(0x40000000, float:2.0)
            goto L4a
        L17e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Child "
            r2.<init>(r3)
            java.lang.StringBuilder r2 = r2.append(r12)
            java.lang.String r3 = " at index "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r9)
            java.lang.String r3 = " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L1a3:
            return
        L1a4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "DrawerLayout must be measured with MeasureSpec.EXACTLY."
            r1.<init>(r2)
            throw r1
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r4) {
            r3 = this;
            boolean r0 = r4 instanceof androidx.drawerlayout.widget.DrawerLayout.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r4)
            return
        L8:
            androidx.drawerlayout.widget.DrawerLayout$SavedState r4 = (androidx.drawerlayout.widget.DrawerLayout.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r4.openDrawerGravity
            if (r0 == 0) goto L20
            int r0 = r4.openDrawerGravity
            android.view.View r0 = r3.findDrawerWithGravity(r0)
            if (r0 == 0) goto L20
            r3.openDrawer(r0)
        L20:
            int r0 = r4.lockModeLeft
            r1 = 3
            if (r0 == r1) goto L2a
            int r0 = r4.lockModeLeft
            r3.setDrawerLockMode(r0, r1)
        L2a:
            int r0 = r4.lockModeRight
            if (r0 == r1) goto L34
            int r0 = r4.lockModeRight
            r2 = 5
            r3.setDrawerLockMode(r0, r2)
        L34:
            int r0 = r4.lockModeStart
            if (r0 == r1) goto L40
            int r0 = r4.lockModeStart
            r2 = 8388611(0x800003, float:1.1754948E-38)
            r3.setDrawerLockMode(r0, r2)
        L40:
            int r0 = r4.lockModeEnd
            if (r0 == r1) goto L4c
            int r4 = r4.lockModeEnd
            r0 = 8388613(0x800005, float:1.175495E-38)
            r3.setDrawerLockMode(r4, r0)
        L4c:
            return
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int r1) {
            r0 = this;
            r0.resolveShadowDrawables()
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r9 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.drawerlayout.widget.DrawerLayout$SavedState r1 = new androidx.drawerlayout.widget.DrawerLayout$SavedState
            r1.<init>(r0)
            int r0 = r9.getChildCount()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r0) goto L36
            android.view.View r4 = r9.getChildAt(r3)
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r5 = r4.openState
            r6 = 1
            if (r5 != r6) goto L22
            r5 = r6
            goto L23
        L22:
            r5 = r2
        L23:
            int r7 = r4.openState
            r8 = 2
            if (r7 != r8) goto L29
            goto L2a
        L29:
            r6 = r2
        L2a:
            if (r5 != 0) goto L32
            if (r6 == 0) goto L2f
            goto L32
        L2f:
            int r3 = r3 + 1
            goto Lf
        L32:
            int r0 = r4.gravity
            r1.openDrawerGravity = r0
        L36:
            int r0 = r9.mLockModeLeft
            r1.lockModeLeft = r0
            int r0 = r9.mLockModeRight
            r1.lockModeRight = r0
            int r0 = r9.mLockModeStart
            r1.lockModeStart = r0
            int r0 = r9.mLockModeEnd
            r1.lockModeEnd = r0
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r7) {
            r6 = this;
            androidx.customview.widget.ViewDragHelper r0 = r6.mLeftDragger
            r0.processTouchEvent(r7)
            androidx.customview.widget.ViewDragHelper r0 = r6.mRightDragger
            r0.processTouchEvent(r7)
            int r0 = r7.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L66
            if (r0 == r2) goto L22
            r7 = 3
            if (r0 == r7) goto L1a
            goto L76
        L1a:
            r6.closeDrawers(r2)
            r6.mDisallowInterceptRequested = r1
            r6.mChildrenCanceledTouch = r1
            goto L76
        L22:
            float r0 = r7.getX()
            float r7 = r7.getY()
            androidx.customview.widget.ViewDragHelper r3 = r6.mLeftDragger
            int r4 = (int) r0
            int r5 = (int) r7
            android.view.View r3 = r3.findTopChildUnder(r4, r5)
            if (r3 == 0) goto L5f
            boolean r3 = r6.isContentView(r3)
            if (r3 == 0) goto L5f
            float r3 = r6.mInitialMotionX
            float r0 = r0 - r3
            float r3 = r6.mInitialMotionY
            float r7 = r7 - r3
            androidx.customview.widget.ViewDragHelper r3 = r6.mLeftDragger
            int r3 = r3.getTouchSlop()
            float r0 = r0 * r0
            float r7 = r7 * r7
            float r0 = r0 + r7
            int r3 = r3 * r3
            float r7 = (float) r3
            int r7 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r7 >= 0) goto L5f
            android.view.View r7 = r6.findOpenDrawer()
            if (r7 == 0) goto L5f
            int r7 = r6.getDrawerLockMode(r7)
            r0 = 2
            if (r7 != r0) goto L5d
            goto L5f
        L5d:
            r7 = r1
            goto L60
        L5f:
            r7 = r2
        L60:
            r6.closeDrawers(r7)
            r6.mDisallowInterceptRequested = r1
            goto L76
        L66:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.mInitialMotionX = r0
            r6.mInitialMotionY = r7
            r6.mDisallowInterceptRequested = r1
            r6.mChildrenCanceledTouch = r1
        L76:
            return r2
    }

    public void openDrawer(int r2) {
            r1 = this;
            r0 = 1
            r1.openDrawer(r2, r0)
            return
    }

    public void openDrawer(int r3, boolean r4) {
            r2 = this;
            android.view.View r0 = r2.findDrawerWithGravity(r3)
            if (r0 == 0) goto La
            r2.openDrawer(r0, r4)
            return
        La:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "No drawer view found with gravity "
            r0.<init>(r1)
            java.lang.String r3 = gravityToString(r3)
            java.lang.StringBuilder r3 = r0.append(r3)
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public void openDrawer(android.view.View r2) {
            r1 = this;
            r0 = 1
            r1.openDrawer(r2, r0)
            return
    }

    public void openDrawer(android.view.View r4, boolean r5) {
            r3 = this;
            boolean r0 = r3.isDrawerView(r4)
            if (r0 == 0) goto L57
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            boolean r1 = r3.mFirstLayout
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == 0) goto L1b
            r0.onScreen = r2
            r5 = 1
            r0.openState = r5
            r3.updateChildrenImportantForAccessibility(r4, r5)
            goto L53
        L1b:
            r1 = 0
            if (r5 == 0) goto L48
            int r5 = r0.openState
            r5 = r5 | 2
            r0.openState = r5
            r5 = 3
            boolean r5 = r3.checkDrawerViewAbsoluteGravity(r4, r5)
            if (r5 == 0) goto L35
            androidx.customview.widget.ViewDragHelper r5 = r3.mLeftDragger
            int r0 = r4.getTop()
            r5.smoothSlideViewTo(r4, r1, r0)
            goto L53
        L35:
            androidx.customview.widget.ViewDragHelper r5 = r3.mRightDragger
            int r0 = r3.getWidth()
            int r1 = r4.getWidth()
            int r0 = r0 - r1
            int r1 = r4.getTop()
            r5.smoothSlideViewTo(r4, r0, r1)
            goto L53
        L48:
            r3.moveDrawerToOffset(r4, r2)
            int r5 = r0.gravity
            r3.updateDrawerState(r5, r1, r4)
            r4.setVisibility(r1)
        L53:
            r3.invalidate()
            return
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "View "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " is not a sliding drawer"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5.<init>(r4)
            throw r5
    }

    public void removeDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r0 = r1.mListeners
            if (r0 != 0) goto L8
            return
        L8:
            r0.remove(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean r1) {
            r0 = this;
            super.requestDisallowInterceptTouchEvent(r1)
            r0.mDisallowInterceptRequested = r1
            if (r1 == 0) goto Lb
            r1 = 1
            r0.closeDrawers(r1)
        Lb:
            return
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
            r1 = this;
            boolean r0 = r1.mInLayout
            if (r0 != 0) goto L7
            super.requestLayout()
        L7:
            return
    }

    public void setChildInsets(java.lang.Object r1, boolean r2) {
            r0 = this;
            r0.mLastInsets = r1
            r0.mDrawStatusBarBackground = r2
            if (r2 != 0) goto Le
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 != 0) goto Le
            r1 = 1
            goto Lf
        Le:
            r1 = 0
        Lf:
            r0.setWillNotDraw(r1)
            r0.requestLayout()
            return
    }

    public void setDrawerElevation(float r3) {
            r2 = this;
            r2.mDrawerElevation = r3
            r3 = 0
        L3:
            int r0 = r2.getChildCount()
            if (r3 >= r0) goto L1b
            android.view.View r0 = r2.getChildAt(r3)
            boolean r1 = r2.isDrawerView(r0)
            if (r1 == 0) goto L18
            float r1 = r2.mDrawerElevation
            androidx.core.view.ViewCompat.setElevation(r0, r1)
        L18:
            int r3 = r3 + 1
            goto L3
        L1b:
            return
    }

    @java.lang.Deprecated
    public void setDrawerListener(androidx.drawerlayout.widget.DrawerLayout.DrawerListener r2) {
            r1 = this;
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r0 = r1.mListener
            if (r0 == 0) goto L7
            r1.removeDrawerListener(r0)
        L7:
            if (r2 == 0) goto Lc
            r1.addDrawerListener(r2)
        Lc:
            r1.mListener = r2
            return
    }

    public void setDrawerLockMode(int r2) {
            r1 = this;
            r0 = 3
            r1.setDrawerLockMode(r2, r0)
            r0 = 5
            r1.setDrawerLockMode(r2, r0)
            return
    }

    public void setDrawerLockMode(int r4, int r5) {
            r3 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r3)
            int r0 = androidx.core.view.GravityCompat.getAbsoluteGravity(r5, r0)
            r1 = 3
            if (r5 == r1) goto L22
            r2 = 5
            if (r5 == r2) goto L1f
            r2 = 8388611(0x800003, float:1.1754948E-38)
            if (r5 == r2) goto L1c
            r2 = 8388613(0x800005, float:1.175495E-38)
            if (r5 == r2) goto L19
            goto L24
        L19:
            r3.mLockModeEnd = r4
            goto L24
        L1c:
            r3.mLockModeStart = r4
            goto L24
        L1f:
            r3.mLockModeRight = r4
            goto L24
        L22:
            r3.mLockModeLeft = r4
        L24:
            if (r4 == 0) goto L30
            if (r0 != r1) goto L2b
            androidx.customview.widget.ViewDragHelper r5 = r3.mLeftDragger
            goto L2d
        L2b:
            androidx.customview.widget.ViewDragHelper r5 = r3.mRightDragger
        L2d:
            r5.cancel()
        L30:
            r5 = 1
            if (r4 == r5) goto L41
            r5 = 2
            if (r4 == r5) goto L37
            goto L4a
        L37:
            android.view.View r4 = r3.findDrawerWithGravity(r0)
            if (r4 == 0) goto L4a
            r3.openDrawer(r4)
            goto L4a
        L41:
            android.view.View r4 = r3.findDrawerWithGravity(r0)
            if (r4 == 0) goto L4a
            r3.closeDrawer(r4)
        L4a:
            return
    }

    public void setDrawerLockMode(int r3, android.view.View r4) {
            r2 = this;
            boolean r0 = r2.isDrawerView(r4)
            if (r0 == 0) goto L12
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            int r4 = r4.gravity
            r2.setDrawerLockMode(r3, r4)
            return
        L12:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "View "
            r0.<init>(r1)
            java.lang.StringBuilder r4 = r0.append(r4)
            java.lang.String r0 = " is not a drawer with appropriate layout_gravity"
            java.lang.StringBuilder r4 = r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    public void setDrawerShadow(int r2, int r3) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setDrawerShadow(r2, r3)
            return
    }

    public void setDrawerShadow(android.graphics.drawable.Drawable r3, int r4) {
            r2 = this;
            boolean r0 = androidx.drawerlayout.widget.DrawerLayout.SET_DRAWER_SHADOW_FROM_ELEVATION
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            r1 = r4 & r0
            if (r1 != r0) goto Lf
            r2.mShadowStart = r3
            goto L27
        Lf:
            r0 = 8388613(0x800005, float:1.175495E-38)
            r1 = r4 & r0
            if (r1 != r0) goto L19
            r2.mShadowEnd = r3
            goto L27
        L19:
            r0 = r4 & 3
            r1 = 3
            if (r0 != r1) goto L21
            r2.mShadowLeft = r3
            goto L27
        L21:
            r0 = 5
            r4 = r4 & r0
            if (r4 != r0) goto L2d
            r2.mShadowRight = r3
        L27:
            r2.resolveShadowDrawables()
            r2.invalidate()
        L2d:
            return
    }

    public void setDrawerTitle(int r2, java.lang.CharSequence r3) {
            r1 = this;
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r1)
            int r2 = androidx.core.view.GravityCompat.getAbsoluteGravity(r2, r0)
            r0 = 3
            if (r2 != r0) goto Le
            r1.mTitleLeft = r3
            goto L13
        Le:
            r0 = 5
            if (r2 != r0) goto L13
            r1.mTitleRight = r3
        L13:
            return
    }

    void setDrawerViewOffset(android.view.View r3, float r4) {
            r2 = this;
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r0 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r0
            float r1 = r0.onScreen
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 != 0) goto Ld
            return
        Ld:
            r0.onScreen = r4
            r2.dispatchOnDrawerSlide(r3, r4)
            return
    }

    public void setScrimColor(int r1) {
            r0 = this;
            r0.mScrimColor = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackground(int r2) {
            r1 = this;
            if (r2 == 0) goto Lb
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r1.mStatusBarBackground = r2
            r1.invalidate()
            return
    }

    public void setStatusBarBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mStatusBarBackground = r1
            r0.invalidate()
            return
    }

    public void setStatusBarBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.mStatusBarBackground = r0
            r1.invalidate()
            return
    }

    void updateDrawerState(int r4, int r5, android.view.View r6) {
            r3 = this;
            androidx.customview.widget.ViewDragHelper r4 = r3.mLeftDragger
            int r4 = r4.getViewDragState()
            androidx.customview.widget.ViewDragHelper r0 = r3.mRightDragger
            int r0 = r0.getViewDragState()
            r1 = 1
            if (r4 == r1) goto L1a
            if (r0 != r1) goto L12
            goto L1a
        L12:
            r2 = 2
            if (r4 == r2) goto L1b
            if (r0 != r2) goto L18
            goto L1b
        L18:
            r2 = 0
            goto L1b
        L1a:
            r2 = r1
        L1b:
            if (r6 == 0) goto L3b
            if (r5 != 0) goto L3b
            android.view.ViewGroup$LayoutParams r4 = r6.getLayoutParams()
            androidx.drawerlayout.widget.DrawerLayout$LayoutParams r4 = (androidx.drawerlayout.widget.DrawerLayout.LayoutParams) r4
            float r5 = r4.onScreen
            r0 = 0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 != 0) goto L30
            r3.dispatchOnDrawerClosed(r6)
            goto L3b
        L30:
            float r4 = r4.onScreen
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L3b
            r3.dispatchOnDrawerOpened(r6)
        L3b:
            int r4 = r3.mDrawerState
            if (r2 == r4) goto L5a
            r3.mDrawerState = r2
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r4 = r3.mListeners
            if (r4 == 0) goto L5a
            int r4 = r4.size()
            int r4 = r4 - r1
        L4a:
            if (r4 < 0) goto L5a
            java.util.List<androidx.drawerlayout.widget.DrawerLayout$DrawerListener> r5 = r3.mListeners
            java.lang.Object r5 = r5.get(r4)
            androidx.drawerlayout.widget.DrawerLayout$DrawerListener r5 = (androidx.drawerlayout.widget.DrawerLayout.DrawerListener) r5
            r5.onDrawerStateChanged(r2)
            int r4 = r4 + (-1)
            goto L4a
        L5a:
            return
    }
}
