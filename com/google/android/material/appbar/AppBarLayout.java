package com.google.android.material.appbar;

/* loaded from: classes.dex */
public class AppBarLayout extends android.widget.LinearLayout implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int DEF_STYLE_RES = 0;
    private static final int INVALID_SCROLL_RANGE = -1;
    static final int PENDING_ACTION_ANIMATE_ENABLED = 4;
    static final int PENDING_ACTION_COLLAPSED = 2;
    static final int PENDING_ACTION_EXPANDED = 1;
    static final int PENDING_ACTION_FORCE = 8;
    static final int PENDING_ACTION_NONE = 0;
    private int currentOffset;
    private int downPreScrollRange;
    private int downScrollRange;
    private android.animation.ValueAnimator elevationOverlayAnimator;
    private boolean haveChildWithInterpolator;
    private androidx.core.view.WindowInsetsCompat lastInsets;
    private boolean liftOnScroll;
    private java.lang.ref.WeakReference<android.view.View> liftOnScrollTargetView;
    private int liftOnScrollTargetViewId;
    private boolean liftable;
    private boolean liftableOverride;
    private boolean lifted;
    private java.util.List<com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener> listeners;
    private int pendingAction;
    private android.graphics.drawable.Drawable statusBarForeground;
    private int[] tmpStatesArray;
    private int totalScrollRange;



    protected static class BaseBehavior<T extends com.google.android.material.appbar.AppBarLayout> extends com.google.android.material.appbar.HeaderBehavior<T> {
        private static final int INVALID_POSITION = -1;
        private static final int MAX_OFFSET_ANIMATION_DURATION = 600;
        private java.lang.ref.WeakReference<android.view.View> lastNestedScrollingChildRef;
        private int lastStartedType;
        private android.animation.ValueAnimator offsetAnimator;
        private int offsetDelta;
        private int offsetToChildIndexOnLayout;
        private boolean offsetToChildIndexOnLayoutIsMinHeight;
        private float offsetToChildIndexOnLayoutPerc;
        private com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback onDragCallback;




        public static abstract class BaseDragCallback<T extends com.google.android.material.appbar.AppBarLayout> {
            public BaseDragCallback() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public abstract boolean canDrag(T r1);
        }

        protected static class SavedState extends androidx.customview.view.AbsSavedState {
            public static final android.os.Parcelable.Creator<com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState> CREATOR = null;
            boolean firstVisibleChildAtMinimumHeight;
            int firstVisibleChildIndex;
            float firstVisibleChildPercentageShown;


            static {
                    com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState$1
                    r0.<init>()
                    com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.CREATOR = r0
                    return
            }

            public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                    r0 = this;
                    r0.<init>(r1, r2)
                    int r2 = r1.readInt()
                    r0.firstVisibleChildIndex = r2
                    float r2 = r1.readFloat()
                    r0.firstVisibleChildPercentageShown = r2
                    byte r1 = r1.readByte()
                    if (r1 == 0) goto L17
                    r1 = 1
                    goto L18
                L17:
                    r1 = 0
                L18:
                    r0.firstVisibleChildAtMinimumHeight = r1
                    return
            }

            public SavedState(android.os.Parcelable r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(android.os.Parcel r1, int r2) {
                    r0 = this;
                    super.writeToParcel(r1, r2)
                    int r2 = r0.firstVisibleChildIndex
                    r1.writeInt(r2)
                    float r2 = r0.firstVisibleChildPercentageShown
                    r1.writeFloat(r2)
                    boolean r2 = r0.firstVisibleChildAtMinimumHeight
                    byte r2 = (byte) r2
                    r1.writeByte(r2)
                    return
            }
        }

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.offsetToChildIndexOnLayout = r0
                return
        }

        public BaseBehavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = -1
                r0.offsetToChildIndexOnLayout = r1
                return
        }

        static /* synthetic */ int access$000(com.google.android.material.appbar.AppBarLayout.BaseBehavior r0) {
                int r0 = r0.offsetDelta
                return r0
        }

        private void addAccessibilityScrollActions(androidx.coordinatorlayout.widget.CoordinatorLayout r9, T r10, android.view.View r11) {
                r8 = this;
                int r0 = r8.getTopBottomOffsetForScrollingSibling()
                int r1 = r10.getTotalScrollRange()
                int r1 = -r1
                r2 = 1
                if (r0 == r1) goto L18
                boolean r0 = r11.canScrollVertically(r2)
                if (r0 == 0) goto L18
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                r1 = 0
                r8.addActionToExpand(r9, r10, r0, r1)
            L18:
                int r0 = r8.getTopBottomOffsetForScrollingSibling()
                if (r0 == 0) goto L42
                r0 = -1
                boolean r0 = r11.canScrollVertically(r0)
                if (r0 == 0) goto L3d
                int r0 = r10.getDownNestedPreScrollRange()
                int r6 = -r0
                if (r6 == 0) goto L42
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$2 r7 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$2
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r1.<init>(r2, r3, r4, r5, r6)
                r10 = 0
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r9, r0, r10, r7)
                goto L42
            L3d:
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r11 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                r8.addActionToExpand(r9, r10, r11, r2)
            L42:
                return
        }

        private void addActionToExpand(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r4, boolean r5) {
                r1 = this;
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$3 r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$3
                r0.<init>(r1, r3, r5)
                r3 = 0
                androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r4, r3, r0)
                return
        }

        private void animateOffsetTo(androidx.coordinatorlayout.widget.CoordinatorLayout r3, T r4, int r5, float r6) {
                r2 = this;
                int r0 = r2.getTopBottomOffsetForScrollingSibling()
                int r0 = r0 - r5
                int r0 = java.lang.Math.abs(r0)
                float r6 = java.lang.Math.abs(r6)
                r1 = 0
                int r1 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                if (r1 <= 0) goto L1e
                float r0 = (float) r0
                float r0 = r0 / r6
                r6 = 1148846080(0x447a0000, float:1000.0)
                float r0 = r0 * r6
                int r6 = java.lang.Math.round(r0)
                int r6 = r6 * 3
                goto L2c
            L1e:
                float r6 = (float) r0
                int r0 = r4.getHeight()
                float r0 = (float) r0
                float r6 = r6 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r6 = r6 + r0
                r0 = 1125515264(0x43160000, float:150.0)
                float r6 = r6 * r0
                int r6 = (int) r6
            L2c:
                r2.animateOffsetWithDuration(r3, r4, r5, r6)
                return
        }

        private void animateOffsetWithDuration(androidx.coordinatorlayout.widget.CoordinatorLayout r4, T r5, int r6, int r7) {
                r3 = this;
                int r0 = r3.getTopBottomOffsetForScrollingSibling()
                if (r0 != r6) goto L16
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                if (r4 == 0) goto L15
                boolean r4 = r4.isRunning()
                if (r4 == 0) goto L15
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r4.cancel()
            L15:
                return
            L16:
                android.animation.ValueAnimator r1 = r3.offsetAnimator
                if (r1 != 0) goto L31
                android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
                r1.<init>()
                r3.offsetAnimator = r1
                android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.DECELERATE_INTERPOLATOR
                r1.setInterpolator(r2)
                android.animation.ValueAnimator r1 = r3.offsetAnimator
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$1 r2 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$1
                r2.<init>(r3, r4, r5)
                r1.addUpdateListener(r2)
                goto L34
            L31:
                r1.cancel()
            L34:
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r5 = 600(0x258, float:8.41E-43)
                int r5 = java.lang.Math.min(r7, r5)
                long r1 = (long) r5
                r4.setDuration(r1)
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r5 = 2
                int[] r5 = new int[r5]
                r7 = 0
                r5[r7] = r0
                r7 = 1
                r5[r7] = r6
                r4.setIntValues(r5)
                android.animation.ValueAnimator r4 = r3.offsetAnimator
                r4.start()
                return
        }

        private boolean canScrollChildren(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r3.hasScrollableChildren()
                if (r0 == 0) goto L17
                int r2 = r2.getHeight()
                int r4 = r4.getHeight()
                int r2 = r2 - r4
                int r3 = r3.getHeight()
                if (r2 > r3) goto L17
                r2 = 1
                goto L18
            L17:
                r2 = 0
            L18:
                return r2
        }

        private static boolean checkFlag(int r0, int r1) {
                r0 = r0 & r1
                if (r0 != r1) goto L5
                r0 = 1
                goto L6
            L5:
                r0 = 0
            L6:
                return r0
        }

        private android.view.View findFirstScrollingChild(androidx.coordinatorlayout.widget.CoordinatorLayout r5) {
                r4 = this;
                int r0 = r5.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L1c
                android.view.View r2 = r5.getChildAt(r1)
                boolean r3 = r2 instanceof androidx.core.view.NestedScrollingChild
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ListView
                if (r3 != 0) goto L1b
                boolean r3 = r2 instanceof android.widget.ScrollView
                if (r3 == 0) goto L18
                goto L1b
            L18:
                int r1 = r1 + 1
                goto L5
            L1b:
                return r2
            L1c:
                r5 = 0
                return r5
        }

        private static android.view.View getAppBarChildOnOffset(com.google.android.material.appbar.AppBarLayout r4, int r5) {
                int r5 = java.lang.Math.abs(r5)
                int r0 = r4.getChildCount()
                r1 = 0
            L9:
                if (r1 >= r0) goto L1f
                android.view.View r2 = r4.getChildAt(r1)
                int r3 = r2.getTop()
                if (r5 < r3) goto L1c
                int r3 = r2.getBottom()
                if (r5 > r3) goto L1c
                return r2
            L1c:
                int r1 = r1 + 1
                goto L9
            L1f:
                r4 = 0
                return r4
        }

        private int getChildIndexOnOffset(T r8, int r9) {
                r7 = this;
                int r0 = r8.getChildCount()
                r1 = 0
            L5:
                if (r1 >= r0) goto L34
                android.view.View r2 = r8.getChildAt(r1)
                int r3 = r2.getTop()
                int r4 = r2.getBottom()
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r2 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r2
                int r5 = r2.getScrollFlags()
                r6 = 32
                boolean r5 = checkFlag(r5, r6)
                if (r5 == 0) goto L2b
                int r5 = r2.topMargin
                int r3 = r3 - r5
                int r2 = r2.bottomMargin
                int r4 = r4 + r2
            L2b:
                int r2 = -r9
                if (r3 > r2) goto L31
                if (r4 < r2) goto L31
                return r1
            L31:
                int r1 = r1 + 1
                goto L5
            L34:
                r8 = -1
                return r8
        }

        private int interpolateOffset(T r9, int r10) {
                r8 = this;
                int r0 = java.lang.Math.abs(r10)
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = r2
            La:
                if (r3 >= r1) goto L70
                android.view.View r4 = r9.getChildAt(r3)
                android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
                android.view.animation.Interpolator r6 = r5.getScrollInterpolator()
                int r7 = r4.getTop()
                if (r0 < r7) goto L6d
                int r7 = r4.getBottom()
                if (r0 > r7) goto L6d
                if (r6 == 0) goto L70
                int r1 = r5.getScrollFlags()
                r3 = r1 & 1
                if (r3 == 0) goto L44
                int r3 = r4.getHeight()
                int r7 = r5.topMargin
                int r3 = r3 + r7
                int r5 = r5.bottomMargin
                int r3 = r3 + r5
                int r2 = r2 + r3
                r1 = r1 & 2
                if (r1 == 0) goto L44
                int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                int r2 = r2 - r1
            L44:
                boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r4)
                if (r1 == 0) goto L4f
                int r9 = r9.getTopInset()
                int r2 = r2 - r9
            L4f:
                if (r2 <= 0) goto L70
                int r9 = r4.getTop()
                int r0 = r0 - r9
                float r9 = (float) r2
                float r0 = (float) r0
                float r0 = r0 / r9
                float r0 = r6.getInterpolation(r0)
                float r9 = r9 * r0
                int r9 = java.lang.Math.round(r9)
                int r10 = java.lang.Integer.signum(r10)
                int r0 = r4.getTop()
                int r0 = r0 + r9
                int r10 = r10 * r0
                return r10
            L6d:
                int r3 = r3 + 1
                goto La
            L70:
                return r10
        }

        private boolean shouldJumpElevationState(androidx.coordinatorlayout.widget.CoordinatorLayout r5, T r6) {
                r4 = this;
                java.util.List r5 = r5.getDependents(r6)
                int r6 = r5.size()
                r0 = 0
                r1 = r0
            La:
                if (r1 >= r6) goto L2d
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                android.view.ViewGroup$LayoutParams r2 = r2.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r2 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r2
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r2 = r2.getBehavior()
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r3 == 0) goto L2a
                com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior r2 = (com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior) r2
                int r5 = r2.getOverlayTop()
                if (r5 == 0) goto L29
                r0 = 1
            L29:
                return r0
            L2a:
                int r1 = r1 + 1
                goto La
            L2d:
                return r0
        }

        private void snapToChildIfNeeded(androidx.coordinatorlayout.widget.CoordinatorLayout r9, T r10) {
                r8 = this;
                int r0 = r8.getTopBottomOffsetForScrollingSibling()
                int r1 = r8.getChildIndexOnOffset(r10, r0)
                if (r1 < 0) goto L75
                android.view.View r2 = r10.getChildAt(r1)
                android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r3 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r3
                int r4 = r3.getScrollFlags()
                r5 = r4 & 17
                r6 = 17
                if (r5 != r6) goto L75
                int r5 = r2.getTop()
                int r5 = -r5
                int r6 = r2.getBottom()
                int r6 = -r6
                int r7 = r10.getChildCount()
                int r7 = r7 + (-1)
                if (r1 != r7) goto L35
                int r1 = r10.getTopInset()
                int r6 = r6 + r1
            L35:
                r1 = 2
                boolean r7 = checkFlag(r4, r1)
                if (r7 == 0) goto L42
                int r2 = androidx.core.view.ViewCompat.getMinimumHeight(r2)
                int r6 = r6 + r2
                goto L53
            L42:
                r7 = 5
                boolean r7 = checkFlag(r4, r7)
                if (r7 == 0) goto L53
                int r2 = androidx.core.view.ViewCompat.getMinimumHeight(r2)
                int r2 = r2 + r6
                if (r0 >= r2) goto L52
                r5 = r2
                goto L53
            L52:
                r6 = r2
            L53:
                r2 = 32
                boolean r2 = checkFlag(r4, r2)
                if (r2 == 0) goto L61
                int r2 = r3.topMargin
                int r5 = r5 + r2
                int r2 = r3.bottomMargin
                int r6 = r6 - r2
            L61:
                int r2 = r6 + r5
                int r2 = r2 / r1
                if (r0 >= r2) goto L67
                r5 = r6
            L67:
                int r0 = r10.getTotalScrollRange()
                int r0 = -r0
                r1 = 0
                int r0 = androidx.core.math.MathUtils.clamp(r5, r0, r1)
                r1 = 0
                r8.animateOffsetTo(r9, r10, r0, r1)
            L75:
                return
        }

        private void updateAccessibilityActions(androidx.coordinatorlayout.widget.CoordinatorLayout r3, T r4) {
                r2 = this;
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                int r0 = r0.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r3, r0)
                android.view.View r0 = r2.findFirstScrollingChild(r3)
                if (r0 == 0) goto L31
                int r1 = r4.getTotalScrollRange()
                if (r1 != 0) goto L1f
                goto L31
            L1f:
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior
                if (r1 != 0) goto L2e
                return
            L2e:
                r2.addAccessibilityScrollActions(r3, r4, r0)
            L31:
                return
        }

        private void updateAppBarLayoutDrawableState(androidx.coordinatorlayout.widget.CoordinatorLayout r6, T r7, int r8, int r9, boolean r10) {
                r5 = this;
                android.view.View r0 = getAppBarChildOnOffset(r7, r8)
                if (r0 == 0) goto L60
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r1
                int r1 = r1.getScrollFlags()
                r2 = r1 & 1
                r3 = 0
                if (r2 == 0) goto L41
                int r2 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                r4 = 1
                if (r9 <= 0) goto L2f
                r9 = r1 & 12
                if (r9 == 0) goto L2f
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
            L2d:
                r3 = r4
                goto L41
            L2f:
                r9 = r1 & 2
                if (r9 == 0) goto L41
                int r8 = -r8
                int r9 = r0.getBottom()
                int r9 = r9 - r2
                int r0 = r7.getTopInset()
                int r9 = r9 - r0
                if (r8 < r9) goto L41
                goto L2d
            L41:
                boolean r8 = r7.isLiftOnScroll()
                if (r8 == 0) goto L4f
                android.view.View r8 = r5.findFirstScrollingChild(r6)
                boolean r3 = r7.shouldLift(r8)
            L4f:
                boolean r8 = r7.setLiftedState(r3)
                if (r10 != 0) goto L5d
                if (r8 == 0) goto L60
                boolean r6 = r5.shouldJumpElevationState(r6, r7)
                if (r6 == 0) goto L60
            L5d:
                r7.jumpDrawablesToCurrentState()
            L60:
                return
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ boolean canDragView(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                boolean r1 = r0.canDragView(r1)
                return r1
        }

        boolean canDragView(T r3) {
                r2 = this;
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$BaseDragCallback r0 = r2.onDragCallback
                if (r0 == 0) goto L9
                boolean r3 = r0.canDrag(r3)
                return r3
            L9:
                java.lang.ref.WeakReference<android.view.View> r3 = r2.lastNestedScrollingChildRef
                r0 = 1
                if (r3 == 0) goto L25
                java.lang.Object r3 = r3.get()
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L24
                boolean r1 = r3.isShown()
                if (r1 == 0) goto L24
                r1 = -1
                boolean r3 = r3.canScrollVertically(r1)
                if (r3 != 0) goto L24
                goto L25
            L24:
                r0 = 0
            L25:
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int getMaxDragOffset(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r0.getMaxDragOffset(r1)
                return r1
        }

        int getMaxDragOffset(T r1) {
                r0 = this;
                int r1 = r1.getDownNestedScrollRange()
                int r1 = -r1
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int getScrollRangeForDragFling(android.view.View r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = (com.google.android.material.appbar.AppBarLayout) r1
                int r1 = r0.getScrollRangeForDragFling(r1)
                return r1
        }

        int getScrollRangeForDragFling(T r1) {
                r0 = this;
                int r1 = r1.getTotalScrollRange()
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        int getTopBottomOffsetForScrollingSibling() {
                r2 = this;
                int r0 = r2.getTopAndBottomOffset()
                int r1 = r2.offsetDelta
                int r0 = r0 + r1
                return r0
        }

        boolean isOffsetAnimatorRunning() {
                r1 = this;
                android.animation.ValueAnimator r0 = r1.offsetAnimator
                if (r0 == 0) goto Lc
                boolean r0 = r0.isRunning()
                if (r0 == 0) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onFlingFinished(r1, r2)
                return
        }

        void onFlingFinished(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3) {
                r1 = this;
                r1.snapToChildIfNeeded(r2, r3)
                boolean r0 = r3.isLiftOnScroll()
                if (r0 == 0) goto L14
                android.view.View r2 = r1.findFirstScrollingChild(r2)
                boolean r2 = r3.shouldLift(r2)
                r3.setLiftedState(r2)
            L14:
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9, int r10) {
                r7 = this;
                boolean r10 = super.onLayoutChild(r8, r9, r10)
                int r0 = r9.getPendingAction()
                int r1 = r7.offsetToChildIndexOnLayout
                r2 = 0
                if (r1 < 0) goto L39
                r3 = r0 & 8
                if (r3 != 0) goto L39
                android.view.View r0 = r9.getChildAt(r1)
                int r1 = r0.getBottom()
                int r1 = -r1
                boolean r3 = r7.offsetToChildIndexOnLayoutIsMinHeight
                if (r3 == 0) goto L28
                int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r0)
                int r3 = r9.getTopInset()
                int r0 = r0 + r3
                goto L34
            L28:
                int r0 = r0.getHeight()
                float r0 = (float) r0
                float r3 = r7.offsetToChildIndexOnLayoutPerc
                float r0 = r0 * r3
                int r0 = java.lang.Math.round(r0)
            L34:
                int r1 = r1 + r0
                r7.setHeaderTopBottomOffset(r8, r9, r1)
                goto L63
            L39:
                if (r0 == 0) goto L63
                r1 = r0 & 4
                r3 = 1
                if (r1 == 0) goto L42
                r1 = r3
                goto L43
            L42:
                r1 = r2
            L43:
                r4 = r0 & 2
                r5 = 0
                if (r4 == 0) goto L57
                int r0 = r9.getUpNestedPreScrollRange()
                int r0 = -r0
                if (r1 == 0) goto L53
                r7.animateOffsetTo(r8, r9, r0, r5)
                goto L63
            L53:
                r7.setHeaderTopBottomOffset(r8, r9, r0)
                goto L63
            L57:
                r0 = r0 & r3
                if (r0 == 0) goto L63
                if (r1 == 0) goto L60
                r7.animateOffsetTo(r8, r9, r2, r5)
                goto L63
            L60:
                r7.setHeaderTopBottomOffset(r8, r9, r2)
            L63:
                r9.resetPendingAction()
                r0 = -1
                r7.offsetToChildIndexOnLayout = r0
                int r0 = r7.getTopAndBottomOffset()
                int r1 = r9.getTotalScrollRange()
                int r1 = -r1
                int r0 = androidx.core.math.MathUtils.clamp(r0, r1, r2)
                r7.setTopAndBottomOffset(r0)
                int r4 = r7.getTopAndBottomOffset()
                r5 = 0
                r6 = 1
                r1 = r7
                r2 = r8
                r3 = r9
                r1.updateAppBarLayoutDrawableState(r2, r3, r4, r5, r6)
                int r0 = r7.getTopAndBottomOffset()
                r9.onOffsetChanged(r0)
                r7.updateAccessibilityActions(r8, r9)
                return r10
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, int r9, int r10, int r11, int r12) {
                r6 = this;
                android.view.ViewGroup$LayoutParams r0 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r0 = r0.height
                r1 = -2
                if (r0 != r1) goto L1a
                r11 = 0
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r11)
                r0 = r7
                r1 = r8
                r2 = r9
                r3 = r10
                r5 = r12
                r0.onMeasureChild(r1, r2, r3, r4, r5)
                r7 = 1
                return r7
            L1a:
                boolean r7 = super.onMeasureChild(r7, r8, r9, r10, r11, r12)
                return r7
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, android.view.View r9, int r10, int r11, int[] r12, int r13) {
                r6 = this;
                if (r11 == 0) goto L24
                if (r11 >= 0) goto Lf
                int r10 = r8.getTotalScrollRange()
                int r10 = -r10
                int r13 = r8.getDownNestedPreScrollRange()
                int r13 = r13 + r10
                goto L15
            Lf:
                int r10 = r8.getUpNestedPreScrollRange()
                int r10 = -r10
                r13 = 0
            L15:
                r4 = r10
                r5 = r13
                if (r4 == r5) goto L24
                r10 = 1
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r11
                int r7 = r0.scroll(r1, r2, r3, r4, r5)
                r12[r10] = r7
            L24:
                boolean r7 = r8.isLiftOnScroll()
                if (r7 == 0) goto L31
                boolean r7 = r8.shouldLift(r9)
                r8.setLiftedState(r7)
            L31:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r7, T r8, android.view.View r9, int r10, int r11, int r12, int r13, int r14, int[] r15) {
                r6 = this;
                if (r13 >= 0) goto L13
                int r9 = r8.getDownNestedScrollRange()
                int r4 = -r9
                r5 = 0
                r0 = r6
                r1 = r7
                r2 = r8
                r3 = r13
                int r9 = r0.scroll(r1, r2, r3, r4, r5)
                r10 = 1
                r15[r10] = r9
            L13:
                if (r13 != 0) goto L18
                r6.updateAccessibilityActions(r7, r8)
            L18:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.os.Parcelable r3) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onRestoreInstanceState(r1, r2, r3)
                return
        }

        public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.os.Parcelable r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState
                if (r0 == 0) goto L1a
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r4 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState) r4
                android.os.Parcelable r0 = r4.getSuperState()
                super.onRestoreInstanceState(r2, r3, r0)
                int r2 = r4.firstVisibleChildIndex
                r1.offsetToChildIndexOnLayout = r2
                float r2 = r4.firstVisibleChildPercentageShown
                r1.offsetToChildIndexOnLayoutPerc = r2
                boolean r2 = r4.firstVisibleChildAtMinimumHeight
                r1.offsetToChildIndexOnLayoutIsMinHeight = r2
                goto L20
            L1a:
                super.onRestoreInstanceState(r2, r3, r4)
                r2 = -1
                r1.offsetToChildIndexOnLayout = r2
            L20:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                android.os.Parcelable r1 = r0.onSaveInstanceState(r1, r2)
                return r1
        }

        public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r8, T r9) {
                r7 = this;
                android.os.Parcelable r8 = super.onSaveInstanceState(r8, r9)
                int r0 = r7.getTopAndBottomOffset()
                int r1 = r9.getChildCount()
                r2 = 0
                r3 = r2
            Le:
                if (r3 >= r1) goto L44
                android.view.View r4 = r9.getChildAt(r3)
                int r5 = r4.getBottom()
                int r5 = r5 + r0
                int r6 = r4.getTop()
                int r6 = r6 + r0
                if (r6 > 0) goto L41
                if (r5 < 0) goto L41
                com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState r0 = new com.google.android.material.appbar.AppBarLayout$BaseBehavior$SavedState
                r0.<init>(r8)
                r0.firstVisibleChildIndex = r3
                int r8 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
                int r9 = r9.getTopInset()
                int r8 = r8 + r9
                if (r5 != r8) goto L35
                r2 = 1
            L35:
                r0.firstVisibleChildAtMinimumHeight = r2
                float r8 = (float) r5
                int r9 = r4.getHeight()
                float r9 = (float) r9
                float r8 = r8 / r9
                r0.firstVisibleChildPercentageShown = r8
                return r0
            L41:
                int r3 = r3 + 1
                goto Le
            L44:
                return r8
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, T r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                r4 = r5 & 2
                if (r4 == 0) goto L12
                boolean r4 = r2.isLiftOnScroll()
                if (r4 != 0) goto L10
                boolean r1 = r0.canScrollChildren(r1, r2, r3)
                if (r1 == 0) goto L12
            L10:
                r1 = 1
                goto L13
            L12:
                r1 = 0
            L13:
                if (r1 == 0) goto L1c
                android.animation.ValueAnimator r2 = r0.offsetAnimator
                if (r2 == 0) goto L1c
                r2.cancel()
            L1c:
                r2 = 0
                r0.lastNestedScrollingChildRef = r2
                r0.lastStartedType = r6
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, int r4) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                r0.onStopNestedScroll(r1, r2, r3, r4)
                return
        }

        public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, T r3, android.view.View r4, int r5) {
                r1 = this;
                int r0 = r1.lastStartedType
                if (r0 == 0) goto L7
                r0 = 1
                if (r5 != r0) goto L17
            L7:
                r1.snapToChildIfNeeded(r2, r3)
                boolean r2 = r3.isLiftOnScroll()
                if (r2 == 0) goto L17
                boolean r2 = r3.shouldLift(r4)
                r3.setLiftedState(r2)
            L17:
                java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
                r2.<init>(r4)
                r1.lastNestedScrollingChildRef = r2
                return
        }

        public void setDragCallback(com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback r1) {
                r0 = this;
                r0.onDragCallback = r1
                return
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        /* bridge */ /* synthetic */ int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r1 = r0.setHeaderTopBottomOffset(r1, r2, r3, r4, r5)
                return r1
        }

        int setHeaderTopBottomOffset(androidx.coordinatorlayout.widget.CoordinatorLayout r9, T r10, int r11, int r12, int r13) {
                r8 = this;
                int r0 = r8.getTopBottomOffsetForScrollingSibling()
                r1 = 0
                if (r12 == 0) goto L47
                if (r0 < r12) goto L47
                if (r0 > r13) goto L47
                int r5 = androidx.core.math.MathUtils.clamp(r11, r12, r13)
                if (r0 == r5) goto L49
                boolean r11 = r10.hasChildWithInterpolator()
                if (r11 == 0) goto L1c
                int r11 = r8.interpolateOffset(r10, r5)
                goto L1d
            L1c:
                r11 = r5
            L1d:
                boolean r12 = r8.setTopAndBottomOffset(r11)
                int r1 = r0 - r5
                int r11 = r5 - r11
                r8.offsetDelta = r11
                if (r12 != 0) goto L32
                boolean r11 = r10.hasChildWithInterpolator()
                if (r11 == 0) goto L32
                r9.dispatchDependentViewsChanged(r10)
            L32:
                int r11 = r8.getTopAndBottomOffset()
                r10.onOffsetChanged(r11)
                if (r5 >= r0) goto L3d
                r11 = -1
                goto L3e
            L3d:
                r11 = 1
            L3e:
                r6 = r11
                r7 = 0
                r2 = r8
                r3 = r9
                r4 = r10
                r2.updateAppBarLayoutDrawableState(r3, r4, r5, r6, r7)
                goto L49
            L47:
                r8.offsetDelta = r1
            L49:
                r8.updateAccessibilityActions(r9, r10)
                return r1
        }
    }

    public interface BaseOnOffsetChangedListener<T extends com.google.android.material.appbar.AppBarLayout> {
        void onOffsetChanged(T r1, int r2);
    }

    public static class Behavior extends com.google.android.material.appbar.AppBarLayout.BaseBehavior<com.google.android.material.appbar.AppBarLayout> {

        public static abstract class DragCallback extends com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback<com.google.android.material.appbar.AppBarLayout> {
            public DragCallback() {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        public Behavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
                r1 = this;
                int r0 = super.getLeftAndRightOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
                r1 = this;
                int r0 = super.getTopAndBottomOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isHorizontalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isVerticalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, int r3) {
                r0 = this;
                boolean r1 = super.onLayoutChild(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, int r5, int[] r6, int r7) {
                r0 = this;
                super.onNestedPreScroll(r1, r2, r3, r4, r5, r6, r7)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
                r0 = this;
                super.onNestedScroll(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, android.os.Parcelable r3) {
                r0 = this;
                super.onRestoreInstanceState(r1, r2, r3)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2) {
                r0 = this;
                android.os.Parcelable r1 = super.onSaveInstanceState(r1, r2)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.appbar.AppBarLayout r2, android.view.View r3, int r4) {
                r0 = this;
                super.onStopNestedScroll(r1, r2, r3, r4)
                return
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void setDragCallback(com.google.android.material.appbar.AppBarLayout.BaseBehavior.BaseDragCallback r1) {
                r0 = this;
                super.setDragCallback(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setHorizontalOffsetEnabled(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int r1) {
                r0 = this;
                boolean r1 = super.setLeftAndRightOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int r1) {
                r0 = this;
                boolean r1 = super.setTopAndBottomOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setVerticalOffsetEnabled(r1)
                return
        }
    }

    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams {
        static final int COLLAPSIBLE_FLAGS = 10;
        static final int FLAG_QUICK_RETURN = 5;
        static final int FLAG_SNAP = 17;
        public static final int SCROLL_FLAG_ENTER_ALWAYS = 4;
        public static final int SCROLL_FLAG_ENTER_ALWAYS_COLLAPSED = 8;
        public static final int SCROLL_FLAG_EXIT_UNTIL_COLLAPSED = 2;
        public static final int SCROLL_FLAG_NO_SCROLL = 0;
        public static final int SCROLL_FLAG_SCROLL = 1;
        public static final int SCROLL_FLAG_SNAP = 16;
        public static final int SCROLL_FLAG_SNAP_MARGINS = 32;
        int scrollFlags;
        android.view.animation.Interpolator scrollInterpolator;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface ScrollFlags {
        }

        public LayoutParams(int r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(int r1, int r2, float r3) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r2.<init>(r3, r4)
                r0 = 1
                r2.scrollFlags = r0
                int[] r0 = com.google.android.material.C0479R.styleable.AppBarLayout_Layout
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r0)
                int r0 = com.google.android.material.C0479R.styleable.AppBarLayout_Layout_layout_scrollFlags
                r1 = 0
                int r0 = r4.getInt(r0, r1)
                r2.scrollFlags = r0
                int r0 = com.google.android.material.C0479R.styleable.AppBarLayout_Layout_layout_scrollInterpolator
                boolean r0 = r4.hasValue(r0)
                if (r0 == 0) goto L29
                int r0 = com.google.android.material.C0479R.styleable.AppBarLayout_Layout_layout_scrollInterpolator
                int r0 = r4.getResourceId(r0, r1)
                android.view.animation.Interpolator r3 = android.view.animation.AnimationUtils.loadInterpolator(r3, r0)
                r2.scrollInterpolator = r3
            L29:
                r4.recycle()
                return
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(android.widget.LinearLayout.LayoutParams r1) {
                r0 = this;
                r0.<init>(r1)
                r1 = 1
                r0.scrollFlags = r1
                return
        }

        public LayoutParams(com.google.android.material.appbar.AppBarLayout.LayoutParams r2) {
                r1 = this;
                r1.<init>(r2)
                r0 = 1
                r1.scrollFlags = r0
                int r0 = r2.scrollFlags
                r1.scrollFlags = r0
                android.view.animation.Interpolator r2 = r2.scrollInterpolator
                r1.scrollInterpolator = r2
                return
        }

        public int getScrollFlags() {
                r1 = this;
                int r0 = r1.scrollFlags
                return r0
        }

        public android.view.animation.Interpolator getScrollInterpolator() {
                r1 = this;
                android.view.animation.Interpolator r0 = r1.scrollInterpolator
                return r0
        }

        boolean isCollapsible() {
                r3 = this;
                int r0 = r3.scrollFlags
                r1 = r0 & 1
                r2 = 1
                if (r1 != r2) goto Lc
                r0 = r0 & 10
                if (r0 == 0) goto Lc
                goto Ld
            Lc:
                r2 = 0
            Ld:
                return r2
        }

        public void setScrollFlags(int r1) {
                r0 = this;
                r0.scrollFlags = r1
                return
        }

        public void setScrollInterpolator(android.view.animation.Interpolator r1) {
                r0 = this;
                r0.scrollInterpolator = r1
                return
        }
    }

    public interface OnOffsetChangedListener extends com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener<com.google.android.material.appbar.AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
        void onOffsetChanged(com.google.android.material.appbar.AppBarLayout r1, int r2);
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.HeaderScrollingViewBehavior {
        public ScrollingViewBehavior() {
                r0 = this;
                r0.<init>()
                return
        }

        public ScrollingViewBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.C0479R.styleable.ScrollingViewBehavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.C0479R.styleable.ScrollingViewBehavior_Layout_behavior_overlapTop
                r0 = 0
                int r3 = r2.getDimensionPixelSize(r3, r0)
                r1.setOverlayTop(r3)
                r2.recycle()
                return
        }

        private static int getAppBarLayoutOffset(com.google.android.material.appbar.AppBarLayout r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r0 = r1 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r0 == 0) goto L15
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r1 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r1
                int r1 = r1.getTopBottomOffsetForScrollingSibling()
                return r1
            L15:
                r1 = 0
                return r1
        }

        private void offsetChildAsNeeded(android.view.View r4, android.view.View r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
                boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout.BaseBehavior
                if (r1 == 0) goto L2b
                com.google.android.material.appbar.AppBarLayout$BaseBehavior r0 = (com.google.android.material.appbar.AppBarLayout.BaseBehavior) r0
                int r1 = r5.getBottom()
                int r2 = r4.getTop()
                int r1 = r1 - r2
                int r0 = com.google.android.material.appbar.AppBarLayout.BaseBehavior.access$000(r0)
                int r1 = r1 + r0
                int r0 = r3.getVerticalLayoutGap()
                int r1 = r1 + r0
                int r5 = r3.getOverlapPixelsForOffset(r5)
                int r1 = r1 - r5
                androidx.core.view.ViewCompat.offsetTopAndBottom(r4, r1)
            L2b:
                return
        }

        private void updateLiftedStateIfNeeded(android.view.View r2, android.view.View r3) {
                r1 = this;
                boolean r0 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto L13
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r0 = r3.isLiftOnScroll()
                if (r0 == 0) goto L13
                boolean r2 = r3.shouldLift(r2)
                r3.setLiftedState(r2)
            L13:
                return
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        /* bridge */ /* synthetic */ android.view.View findFirstDependency(java.util.List r1) {
                r0 = this;
                com.google.android.material.appbar.AppBarLayout r1 = r0.findFirstDependency(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        com.google.android.material.appbar.AppBarLayout findFirstDependency(java.util.List<android.view.View> r5) {
                r4 = this;
                int r0 = r5.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L17
                java.lang.Object r2 = r5.get(r1)
                android.view.View r2 = (android.view.View) r2
                boolean r3 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r3 == 0) goto L14
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                return r2
            L14:
                int r1 = r1 + 1
                goto L5
            L17:
                r5 = 0
                return r5
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getLeftAndRightOffset() {
                r1 = this;
                int r0 = super.getLeftAndRightOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        float getOverlapRatioForOffset(android.view.View r5) {
                r4 = this;
                boolean r0 = r5 instanceof com.google.android.material.appbar.AppBarLayout
                r1 = 0
                if (r0 == 0) goto L24
                com.google.android.material.appbar.AppBarLayout r5 = (com.google.android.material.appbar.AppBarLayout) r5
                int r0 = r5.getTotalScrollRange()
                int r2 = r5.getDownNestedPreScrollRange()
                int r5 = getAppBarLayoutOffset(r5)
                if (r2 == 0) goto L1a
                int r3 = r0 + r5
                if (r3 > r2) goto L1a
                return r1
            L1a:
                int r0 = r0 - r2
                if (r0 == 0) goto L24
                float r5 = (float) r5
                float r0 = (float) r0
                float r5 = r5 / r0
                r0 = 1065353216(0x3f800000, float:1.0)
                float r5 = r5 + r0
                return r5
            L24:
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        int getScrollRange(android.view.View r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto Lb
                com.google.android.material.appbar.AppBarLayout r2 = (com.google.android.material.appbar.AppBarLayout) r2
                int r2 = r2.getTotalScrollRange()
                return r2
            Lb:
                int r2 = super.getScrollRange(r2)
                return r2
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ int getTopAndBottomOffset() {
                r1 = this;
                int r0 = super.getTopAndBottomOffset()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isHorizontalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isHorizontalOffsetEnabled()
                return r0
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean isVerticalOffsetEnabled() {
                r1 = this;
                boolean r0 = super.isVerticalOffsetEnabled()
                return r0
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r1 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                r0.offsetChildAsNeeded(r2, r3)
                r0.updateLiftedStateIfNeeded(r2, r3)
                r1 = 0
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onDependentViewRemoved(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                boolean r2 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r2 == 0) goto L16
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD
                int r2 = r2.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r1, r2)
                androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r2 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD
                int r2 = r2.getId()
                androidx.core.view.ViewCompat.removeAccessibilityAction(r1, r2)
            L16:
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                boolean r1 = super.onLayoutChild(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onMeasureChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3, int r4, int r5, int r6) {
                r0 = this;
                boolean r1 = super.onMeasureChild(r1, r2, r3, r4, r5, r6)
                return r1
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onRequestChildRectangleOnScreen(androidx.coordinatorlayout.widget.CoordinatorLayout r4, android.view.View r5, android.graphics.Rect r6, boolean r7) {
                r3 = this;
                java.util.List r0 = r4.getDependencies(r5)
                com.google.android.material.appbar.AppBarLayout r0 = r3.findFirstDependency(r0)
                r1 = 0
                if (r0 == 0) goto L30
                int r2 = r5.getLeft()
                int r5 = r5.getTop()
                r6.offset(r2, r5)
                android.graphics.Rect r5 = r3.tempRect1
                int r2 = r4.getWidth()
                int r4 = r4.getHeight()
                r5.set(r1, r1, r2, r4)
                boolean r4 = r5.contains(r6)
                if (r4 != 0) goto L30
                r4 = 1
                r5 = r7 ^ 1
                r0.setExpanded(r1, r5)
                return r4
            L30:
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setHorizontalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setHorizontalOffsetEnabled(r1)
                return
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setLeftAndRightOffset(int r1) {
                r0 = this;
                boolean r1 = super.setLeftAndRightOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ boolean setTopAndBottomOffset(int r1) {
                r0 = this;
                boolean r1 = super.setTopAndBottomOffset(r1)
                return r1
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public /* bridge */ /* synthetic */ void setVerticalOffsetEnabled(boolean r1) {
                r0 = this;
                super.setVerticalOffsetEnabled(r1)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_AppBarLayout
            com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES = r0
            return
    }

    public AppBarLayout(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AppBarLayout(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.appBarLayoutStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public AppBarLayout(android.content.Context r9, android.util.AttributeSet r10, int r11) {
            r8 = this;
            int r4 = com.google.android.material.appbar.AppBarLayout.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            r9 = -1
            r8.totalScrollRange = r9
            r8.downPreScrollRange = r9
            r8.downScrollRange = r9
            r6 = 0
            r8.pendingAction = r6
            android.content.Context r7 = r8.getContext()
            r0 = 1
            r8.setOrientation(r0)
            com.google.android.material.appbar.ViewUtilsLollipop.setBoundsViewOutlineProvider(r8)
            com.google.android.material.appbar.ViewUtilsLollipop.setStateListAnimatorFromAttrs(r8, r10, r11, r4)
            int[] r2 = com.google.android.material.C0479R.styleable.AppBarLayout
            int[] r5 = new int[r6]
            r0 = r7
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_android_background
            android.graphics.drawable.Drawable r11 = r10.getDrawable(r11)
            androidx.core.view.ViewCompat.setBackground(r8, r11)
            android.graphics.drawable.Drawable r11 = r8.getBackground()
            boolean r11 = r11 instanceof android.graphics.drawable.ColorDrawable
            if (r11 == 0) goto L59
            android.graphics.drawable.Drawable r11 = r8.getBackground()
            android.graphics.drawable.ColorDrawable r11 = (android.graphics.drawable.ColorDrawable) r11
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            int r11 = r11.getColor()
            android.content.res.ColorStateList r11 = android.content.res.ColorStateList.valueOf(r11)
            r0.setFillColor(r11)
            r0.initializeElevationOverlay(r7)
            androidx.core.view.ViewCompat.setBackground(r8, r0)
        L59:
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_expanded
            boolean r11 = r10.hasValue(r11)
            if (r11 == 0) goto L6a
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_expanded
            boolean r11 = r10.getBoolean(r11, r6)
            r8.setExpanded(r11, r6, r6)
        L6a:
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_elevation
            boolean r11 = r10.hasValue(r11)
            if (r11 == 0) goto L7c
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_elevation
            int r11 = r10.getDimensionPixelSize(r11, r6)
            float r11 = (float) r11
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r8, r11)
        L7c:
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r11 < r0) goto La4
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r11 = r10.hasValue(r11)
            if (r11 == 0) goto L93
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_android_keyboardNavigationCluster
            boolean r11 = r10.getBoolean(r11, r6)
            r8.setKeyboardNavigationCluster(r11)
        L93:
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r11 = r10.hasValue(r11)
            if (r11 == 0) goto La4
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_android_touchscreenBlocksFocus
            boolean r11 = r10.getBoolean(r11, r6)
            r8.setTouchscreenBlocksFocus(r11)
        La4:
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_liftOnScroll
            boolean r11 = r10.getBoolean(r11, r6)
            r8.liftOnScroll = r11
            int r11 = com.google.android.material.C0479R.styleable.AppBarLayout_liftOnScrollTargetViewId
            int r9 = r10.getResourceId(r11, r9)
            r8.liftOnScrollTargetViewId = r9
            int r9 = com.google.android.material.C0479R.styleable.AppBarLayout_statusBarForeground
            android.graphics.drawable.Drawable r9 = r10.getDrawable(r9)
            r8.setStatusBarForeground(r9)
            r10.recycle()
            com.google.android.material.appbar.AppBarLayout$1 r9 = new com.google.android.material.appbar.AppBarLayout$1
            r9.<init>(r8)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r8, r9)
            return
    }

    private void clearLiftOnScrollTargetView() {
            r1 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r1.liftOnScrollTargetView
            if (r0 == 0) goto L7
            r0.clear()
        L7:
            r0 = 0
            r1.liftOnScrollTargetView = r0
            return
    }

    private android.view.View findLiftOnScrollTargetView(android.view.View r4) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.liftOnScrollTargetView
            r1 = 0
            if (r0 != 0) goto L31
            int r0 = r3.liftOnScrollTargetViewId
            r2 = -1
            if (r0 == r2) goto L31
            if (r4 == 0) goto L11
            android.view.View r4 = r4.findViewById(r0)
            goto L12
        L11:
            r4 = r1
        L12:
            if (r4 != 0) goto L28
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L28
            android.view.ViewParent r4 = r3.getParent()
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r3.liftOnScrollTargetViewId
            android.view.View r4 = r4.findViewById(r0)
        L28:
            if (r4 == 0) goto L31
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r3.liftOnScrollTargetView = r0
        L31:
            java.lang.ref.WeakReference<android.view.View> r4 = r3.liftOnScrollTargetView
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r4.get()
            r1 = r4
            android.view.View r1 = (android.view.View) r1
        L3c:
            return r1
    }

    private boolean hasCollapsibleChild() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L1d
            android.view.View r3 = r4.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r3 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r3
            boolean r3 = r3.isCollapsible()
            if (r3 == 0) goto L1a
            r0 = 1
            return r0
        L1a:
            int r2 = r2 + 1
            goto L6
        L1d:
            return r1
    }

    private void invalidateScrollRanges() {
            r1 = this;
            r0 = -1
            r1.totalScrollRange = r0
            r1.downPreScrollRange = r0
            r1.downScrollRange = r0
            return
    }

    private void setExpanded(boolean r2, boolean r3, boolean r4) {
            r1 = this;
            if (r2 == 0) goto L4
            r2 = 1
            goto L5
        L4:
            r2 = 2
        L5:
            r0 = 0
            if (r3 == 0) goto La
            r3 = 4
            goto Lb
        La:
            r3 = r0
        Lb:
            r2 = r2 | r3
            if (r4 == 0) goto L10
            r0 = 8
        L10:
            r2 = r2 | r0
            r1.pendingAction = r2
            r1.requestLayout()
            return
    }

    private boolean setLiftableState(boolean r2) {
            r1 = this;
            boolean r0 = r1.liftable
            if (r0 == r2) goto Lb
            r1.liftable = r2
            r1.refreshDrawableState()
            r2 = 1
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private boolean shouldDrawStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
            if (r0 == 0) goto Lc
            int r0 = r1.getTopInset()
            if (r0 <= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    private boolean shouldOffsetFirstChild() {
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 0
            if (r0 <= 0) goto L1a
            android.view.View r0 = r4.getChildAt(r1)
            int r2 = r0.getVisibility()
            r3 = 8
            if (r2 == r3) goto L1a
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            if (r0 != 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    private void startLiftOnScrollElevationOverlayAnimation(com.google.android.material.shape.MaterialShapeDrawable r4, boolean r5) {
            r3 = this;
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.material.C0479R.dimen.design_appbar_elevation
            float r0 = r0.getDimension(r1)
            r1 = 0
            if (r5 == 0) goto Lf
            r2 = r1
            goto L10
        Lf:
            r2 = r0
        L10:
            if (r5 == 0) goto L13
            goto L14
        L13:
            r0 = r1
        L14:
            android.animation.ValueAnimator r5 = r3.elevationOverlayAnimator
            if (r5 == 0) goto L1b
            r5.cancel()
        L1b:
            r5 = 2
            float[] r5 = new float[r5]
            r1 = 0
            r5[r1] = r2
            r1 = 1
            r5[r1] = r0
            android.animation.ValueAnimator r5 = android.animation.ValueAnimator.ofFloat(r5)
            r3.elevationOverlayAnimator = r5
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.material.C0479R.integer.app_bar_elevation_anim_duration
            int r0 = r0.getInteger(r1)
            long r0 = (long) r0
            r5.setDuration(r0)
            android.animation.ValueAnimator r5 = r3.elevationOverlayAnimator
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r5.setInterpolator(r0)
            android.animation.ValueAnimator r5 = r3.elevationOverlayAnimator
            com.google.android.material.appbar.AppBarLayout$2 r0 = new com.google.android.material.appbar.AppBarLayout$2
            r0.<init>(r3, r4)
            r5.addUpdateListener(r0)
            android.animation.ValueAnimator r4 = r3.elevationOverlayAnimator
            r4.start()
            return
    }

    private void updateWillNotDraw() {
            r1 = this;
            boolean r0 = r1.shouldDrawStatusBarForeground()
            r0 = r0 ^ 1
            r1.setWillNotDraw(r0)
            return
    }

    public void addOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.listeners = r0
        Lb:
            if (r2 == 0) goto L1a
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L1a
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            r0.add(r2)
        L1a:
            return
    }

    public void addOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener r1) {
            r0 = this;
            r0.addOnOffsetChangedListener(r1)
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            boolean r1 = r1 instanceof com.google.android.material.appbar.AppBarLayout.LayoutParams
            return r1
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas r4) {
            r3 = this;
            super.draw(r4)
            boolean r0 = r3.shouldDrawStatusBarForeground()
            if (r0 == 0) goto L1d
            int r0 = r4.save()
            int r1 = r3.currentOffset
            int r1 = -r1
            float r1 = (float) r1
            r2 = 0
            r4.translate(r2, r1)
            android.graphics.drawable.Drawable r1 = r3.statusBarForeground
            r1.draw(r4)
            r4.restoreToCount(r0)
        L1d:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
            r3 = this;
            super.drawableStateChanged()
            int[] r0 = r3.getDrawableState()
            android.graphics.drawable.Drawable r1 = r3.statusBarForeground
            if (r1 == 0) goto L1a
            boolean r2 = r1.isStateful()
            if (r2 == 0) goto L1a
            boolean r0 = r1.setState(r0)
            if (r0 == 0) goto L1a
            r3.invalidateDrawable(r1)
        L1a:
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = r1.generateDefaultLayoutParams()
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected com.google.android.material.appbar.AppBarLayout.LayoutParams generateDefaultLayoutParams() {
            r3 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* bridge */ /* synthetic */ android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r1) {
            r0 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r1 = r0.generateLayoutParams(r1)
            return r1
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.util.AttributeSet r3) {
            r2 = this;
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1, r3)
            return r0
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected com.google.android.material.appbar.AppBarLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            boolean r0 = r2 instanceof android.widget.LinearLayout.LayoutParams
            if (r0 == 0) goto Lc
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r0.<init>(r2)
            return r0
        Lc:
            boolean r0 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L18
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r0.<init>(r2)
            return r0
        L18:
            com.google.android.material.appbar.AppBarLayout$LayoutParams r0 = new com.google.android.material.appbar.AppBarLayout$LayoutParams
            r0.<init>(r2)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.appbar.AppBarLayout> getBehavior() {
            r1 = this;
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = new com.google.android.material.appbar.AppBarLayout$Behavior
            r0.<init>()
            return r0
    }

    int getDownNestedPreScrollRange() {
            r9 = this;
            int r0 = r9.downPreScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        Le:
            if (r0 < 0) goto L59
            android.view.View r3 = r9.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r4 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r4
            int r5 = r3.getMeasuredHeight()
            int r6 = r4.scrollFlags
            r7 = r6 & 5
            r8 = 5
            if (r7 != r8) goto L53
            int r7 = r4.topMargin
            int r4 = r4.bottomMargin
            int r7 = r7 + r4
            r4 = r6 & 8
            if (r4 == 0) goto L34
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
        L32:
            int r7 = r7 + r4
            goto L40
        L34:
            r4 = r6 & 2
            if (r4 == 0) goto L3f
            int r4 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            int r4 = r5 - r4
            goto L32
        L3f:
            int r7 = r7 + r5
        L40:
            if (r0 != 0) goto L51
            boolean r3 = androidx.core.view.ViewCompat.getFitsSystemWindows(r3)
            if (r3 == 0) goto L51
            int r3 = r9.getTopInset()
            int r5 = r5 - r3
            int r7 = java.lang.Math.min(r7, r5)
        L51:
            int r2 = r2 + r7
            goto L56
        L53:
            if (r2 <= 0) goto L56
            goto L59
        L56:
            int r0 = r0 + (-1)
            goto Le
        L59:
            int r0 = java.lang.Math.max(r1, r2)
            r9.downPreScrollRange = r0
            return r0
    }

    int getDownNestedScrollRange() {
            r9 = this;
            int r0 = r9.downScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        Ld:
            if (r2 >= r0) goto L37
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.topMargin
            int r8 = r5.bottomMargin
            int r7 = r7 + r8
            int r6 = r6 + r7
            int r5 = r5.scrollFlags
            r7 = r5 & 1
            if (r7 == 0) goto L37
            int r3 = r3 + r6
            r5 = r5 & 2
            if (r5 == 0) goto L34
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
            int r3 = r3 - r0
            goto L37
        L34:
            int r2 = r2 + 1
            goto Ld
        L37:
            int r0 = java.lang.Math.max(r1, r3)
            r9.downScrollRange = r0
            return r0
    }

    public int getLiftOnScrollTargetViewId() {
            r1 = this;
            int r0 = r1.liftOnScrollTargetViewId
            return r0
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
            r3 = this;
            int r0 = r3.getTopInset()
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r3)
            if (r1 == 0) goto Le
        La:
            int r1 = r1 * 2
            int r1 = r1 + r0
            return r1
        Le:
            int r1 = r3.getChildCount()
            r2 = 1
            if (r1 < r2) goto L1f
            int r1 = r1 - r2
            android.view.View r1 = r3.getChildAt(r1)
            int r1 = androidx.core.view.ViewCompat.getMinimumHeight(r1)
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L23
            goto La
        L23:
            int r0 = r3.getHeight()
            int r0 = r0 / 3
            return r0
    }

    int getPendingAction() {
            r1 = this;
            int r0 = r1.pendingAction
            return r0
    }

    public android.graphics.drawable.Drawable getStatusBarForeground() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
            return r0
    }

    @java.lang.Deprecated
    public float getTargetElevation() {
            r1 = this;
            r0 = 0
            return r0
    }

    final int getTopInset() {
            r1 = this;
            androidx.core.view.WindowInsetsCompat r0 = r1.lastInsets
            if (r0 == 0) goto L9
            int r0 = r0.getSystemWindowInsetTop()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public final int getTotalScrollRange() {
            r9 = this;
            int r0 = r9.totalScrollRange
            r1 = -1
            if (r0 == r1) goto L6
            return r0
        L6:
            int r0 = r9.getChildCount()
            r1 = 0
            r2 = r1
            r3 = r2
        Ld:
            if (r2 >= r0) goto L44
            android.view.View r4 = r9.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r5 = r4.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            int r6 = r4.getMeasuredHeight()
            int r7 = r5.scrollFlags
            r8 = r7 & 1
            if (r8 == 0) goto L44
            int r8 = r5.topMargin
            int r6 = r6 + r8
            int r5 = r5.bottomMargin
            int r6 = r6 + r5
            int r3 = r3 + r6
            if (r2 != 0) goto L37
            boolean r5 = androidx.core.view.ViewCompat.getFitsSystemWindows(r4)
            if (r5 == 0) goto L37
            int r5 = r9.getTopInset()
            int r3 = r3 - r5
        L37:
            r5 = r7 & 2
            if (r5 == 0) goto L41
            int r0 = androidx.core.view.ViewCompat.getMinimumHeight(r4)
            int r3 = r3 - r0
            goto L44
        L41:
            int r2 = r2 + 1
            goto Ld
        L44:
            int r0 = java.lang.Math.max(r1, r3)
            r9.totalScrollRange = r0
            return r0
    }

    int getUpNestedPreScrollRange() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            return r0
    }

    boolean hasChildWithInterpolator() {
            r1 = this;
            boolean r0 = r1.haveChildWithInterpolator
            return r0
    }

    boolean hasScrollableChildren() {
            r1 = this;
            int r0 = r1.getTotalScrollRange()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isLiftOnScroll() {
            r1 = this;
            boolean r0 = r1.liftOnScroll
            return r0
    }

    public boolean isLifted() {
            r1 = this;
            boolean r0 = r1.lifted
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r4) {
            r3 = this;
            int[] r0 = r3.tmpStatesArray
            if (r0 != 0) goto L9
            r0 = 4
            int[] r0 = new int[r0]
            r3.tmpStatesArray = r0
        L9:
            int[] r0 = r3.tmpStatesArray
            int r1 = r0.length
            int r4 = r4 + r1
            int[] r4 = super.onCreateDrawableState(r4)
            boolean r1 = r3.liftable
            if (r1 == 0) goto L18
            int r1 = com.google.android.material.C0479R.attr.state_liftable
            goto L1b
        L18:
            int r1 = com.google.android.material.C0479R.attr.state_liftable
            int r1 = -r1
        L1b:
            r2 = 0
            r0[r2] = r1
            boolean r1 = r3.liftable
            if (r1 == 0) goto L29
            boolean r1 = r3.lifted
            if (r1 == 0) goto L29
            int r1 = com.google.android.material.C0479R.attr.state_lifted
            goto L2c
        L29:
            int r1 = com.google.android.material.C0479R.attr.state_lifted
            int r1 = -r1
        L2c:
            r2 = 1
            r0[r2] = r1
            boolean r1 = r3.liftable
            if (r1 == 0) goto L36
            int r1 = com.google.android.material.C0479R.attr.state_collapsible
            goto L39
        L36:
            int r1 = com.google.android.material.C0479R.attr.state_collapsible
            int r1 = -r1
        L39:
            r2 = 2
            r0[r2] = r1
            boolean r1 = r3.liftable
            if (r1 == 0) goto L47
            boolean r1 = r3.lifted
            if (r1 == 0) goto L47
            int r1 = com.google.android.material.C0479R.attr.state_collapsed
            goto L4a
        L47:
            int r1 = com.google.android.material.C0479R.attr.state_collapsed
            int r1 = -r1
        L4a:
            r2 = 3
            r0[r2] = r1
            int[] r4 = mergeDrawableStates(r4, r0)
            return r4
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r0 = this;
            super.onDetachedFromWindow()
            r0.clearLiftOnScrollTargetView()
            return
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            boolean r1 = androidx.core.view.ViewCompat.getFitsSystemWindows(r0)
            r2 = 1
            if (r1 == 0) goto L25
            boolean r1 = r0.shouldOffsetFirstChild()
            if (r1 == 0) goto L25
            int r1 = r0.getTopInset()
            int r3 = r0.getChildCount()
            int r3 = r3 - r2
        L19:
            if (r3 < 0) goto L25
            android.view.View r4 = r0.getChildAt(r3)
            androidx.core.view.ViewCompat.offsetTopAndBottom(r4, r1)
            int r3 = r3 + (-1)
            goto L19
        L25:
            r0.invalidateScrollRanges()
            r1 = 0
            r0.haveChildWithInterpolator = r1
            int r3 = r0.getChildCount()
            r4 = r1
        L30:
            if (r4 >= r3) goto L48
            android.view.View r5 = r0.getChildAt(r4)
            android.view.ViewGroup$LayoutParams r5 = r5.getLayoutParams()
            com.google.android.material.appbar.AppBarLayout$LayoutParams r5 = (com.google.android.material.appbar.AppBarLayout.LayoutParams) r5
            android.view.animation.Interpolator r5 = r5.getScrollInterpolator()
            if (r5 == 0) goto L45
            r0.haveChildWithInterpolator = r2
            goto L48
        L45:
            int r4 = r4 + 1
            goto L30
        L48:
            android.graphics.drawable.Drawable r3 = r0.statusBarForeground
            if (r3 == 0) goto L57
            int r4 = r0.getWidth()
            int r5 = r0.getTopInset()
            r3.setBounds(r1, r1, r4, r5)
        L57:
            boolean r3 = r0.liftableOverride
            if (r3 != 0) goto L6a
            boolean r3 = r0.liftOnScroll
            if (r3 != 0) goto L67
            boolean r3 = r0.hasCollapsibleChild()
            if (r3 == 0) goto L66
            goto L67
        L66:
            r2 = r1
        L67:
            r0.setLiftableState(r2)
        L6a:
            return
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            super.onMeasure(r3, r4)
            int r3 = android.view.View.MeasureSpec.getMode(r4)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r3 == r0) goto L41
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L41
            boolean r0 = r2.shouldOffsetFirstChild()
            if (r0 == 0) goto L41
            int r0 = r2.getMeasuredHeight()
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 == r1) goto L28
            if (r3 == 0) goto L22
            goto L3a
        L22:
            int r3 = r2.getTopInset()
            int r0 = r0 + r3
            goto L3a
        L28:
            int r3 = r2.getMeasuredHeight()
            int r0 = r2.getTopInset()
            int r3 = r3 + r0
            r0 = 0
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = androidx.core.math.MathUtils.clamp(r3, r0, r4)
        L3a:
            int r3 = r2.getMeasuredWidth()
            r2.setMeasuredDimension(r3, r0)
        L41:
            r2.invalidateScrollRanges()
            return
    }

    void onOffsetChanged(int r4) {
            r3 = this;
            r3.currentOffset = r4
            boolean r0 = r3.willNotDraw()
            if (r0 != 0) goto Lb
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r3)
        Lb:
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r3.listeners
            if (r0 == 0) goto L26
            int r0 = r0.size()
            r1 = 0
        L14:
            if (r1 >= r0) goto L26
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r2 = r3.listeners
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener r2 = (com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener) r2
            if (r2 == 0) goto L23
            r2.onOffsetChanged(r3, r4)
        L23:
            int r1 = r1 + 1
            goto L14
        L26:
            return
    }

    androidx.core.view.WindowInsetsCompat onWindowInsetChanged(androidx.core.view.WindowInsetsCompat r3) {
            r2 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r2)
            if (r0 == 0) goto L8
            r0 = r3
            goto L9
        L8:
            r0 = 0
        L9:
            androidx.core.view.WindowInsetsCompat r1 = r2.lastInsets
            boolean r1 = androidx.core.util.ObjectsCompat.equals(r1, r0)
            if (r1 != 0) goto L19
            r2.lastInsets = r0
            r2.updateWillNotDraw()
            r2.requestLayout()
        L19:
            return r3
    }

    public void removeOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener r2) {
            r1 = this;
            java.util.List<com.google.android.material.appbar.AppBarLayout$BaseOnOffsetChangedListener> r0 = r1.listeners
            if (r0 == 0) goto L9
            if (r2 == 0) goto L9
            r0.remove(r2)
        L9:
            return
    }

    public void removeOnOffsetChangedListener(com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener r1) {
            r0 = this;
            r0.removeOnOffsetChangedListener(r1)
            return
    }

    void resetPendingAction() {
            r1 = this;
            r0 = 0
            r1.pendingAction = r0
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setExpanded(boolean r2) {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            r1.setExpanded(r2, r0)
            return
    }

    public void setExpanded(boolean r2, boolean r3) {
            r1 = this;
            r0 = 1
            r1.setExpanded(r2, r3, r0)
            return
    }

    public void setLiftOnScroll(boolean r1) {
            r0 = this;
            r0.liftOnScroll = r1
            return
    }

    public void setLiftOnScrollTargetViewId(int r1) {
            r0 = this;
            r0.liftOnScrollTargetViewId = r1
            r0.clearLiftOnScrollTargetView()
            return
    }

    public boolean setLiftable(boolean r2) {
            r1 = this;
            r0 = 1
            r1.liftableOverride = r0
            boolean r2 = r1.setLiftableState(r2)
            return r2
    }

    public boolean setLifted(boolean r1) {
            r0 = this;
            boolean r1 = r0.setLiftedState(r1)
            return r1
    }

    boolean setLiftedState(boolean r2) {
            r1 = this;
            boolean r0 = r1.lifted
            if (r0 == r2) goto L20
            r1.lifted = r2
            r1.refreshDrawableState()
            boolean r0 = r1.liftOnScroll
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            boolean r0 = r0 instanceof com.google.android.material.shape.MaterialShapeDrawable
            if (r0 == 0) goto L1e
            android.graphics.drawable.Drawable r0 = r1.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r0 = (com.google.android.material.shape.MaterialShapeDrawable) r0
            r1.startLiftOnScrollElevationOverlayAnimation(r0, r2)
        L1e:
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L7
            super.setOrientation(r2)
            return
        L7:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "AppBarLayout is always vertical and does not support horizontal orientation"
            r2.<init>(r0)
            throw r2
    }

    public void setStatusBarForeground(android.graphics.drawable.Drawable r3) {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.statusBarForeground
            if (r0 == r3) goto L46
            r1 = 0
            if (r0 == 0) goto La
            r0.setCallback(r1)
        La:
            if (r3 == 0) goto L10
            android.graphics.drawable.Drawable r1 = r3.mutate()
        L10:
            r2.statusBarForeground = r1
            if (r1 == 0) goto L40
            boolean r3 = r1.isStateful()
            if (r3 == 0) goto L23
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int[] r0 = r2.getDrawableState()
            r3.setState(r0)
        L23:
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int r0 = androidx.core.view.ViewCompat.getLayoutDirection(r2)
            androidx.core.graphics.drawable.DrawableCompat.setLayoutDirection(r3, r0)
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            int r0 = r2.getVisibility()
            r1 = 0
            if (r0 != 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = r1
        L38:
            r3.setVisible(r0, r1)
            android.graphics.drawable.Drawable r3 = r2.statusBarForeground
            r3.setCallback(r2)
        L40:
            r2.updateWillNotDraw()
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r2)
        L46:
            return
    }

    public void setStatusBarForegroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.setStatusBarForeground(r0)
            return
    }

    public void setStatusBarForegroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r2)
            r1.setStatusBarForeground(r2)
            return
    }

    @java.lang.Deprecated
    public void setTargetElevation(float r1) {
            r0 = this;
            com.google.android.material.appbar.ViewUtilsLollipop.setDefaultAppBarLayoutStateListAnimator(r0, r1)
            return
    }

    @Override // android.view.View
    public void setVisibility(int r3) {
            r2 = this;
            super.setVisibility(r3)
            r0 = 0
            if (r3 != 0) goto L8
            r3 = 1
            goto L9
        L8:
            r3 = r0
        L9:
            android.graphics.drawable.Drawable r1 = r2.statusBarForeground
            if (r1 == 0) goto L10
            r1.setVisible(r3, r0)
        L10:
            return
    }

    boolean shouldLift(android.view.View r2) {
            r1 = this;
            android.view.View r0 = r1.findLiftOnScrollTargetView(r2)
            if (r0 != 0) goto L7
            goto L8
        L7:
            r2 = r0
        L8:
            if (r2 == 0) goto L19
            r0 = -1
            boolean r0 = r2.canScrollVertically(r0)
            if (r0 != 0) goto L17
            int r2 = r2.getScrollY()
            if (r2 <= 0) goto L19
        L17:
            r2 = 1
            goto L1a
        L19:
            r2 = 0
        L1a:
            return r2
    }

    @Override // android.view.View
    protected boolean verifyDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            boolean r0 = super.verifyDrawable(r2)
            if (r0 != 0) goto Ld
            android.graphics.drawable.Drawable r0 = r1.statusBarForeground
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
