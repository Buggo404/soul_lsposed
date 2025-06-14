package com.google.android.material.bottomsheet;

import android.view.View;

/* loaded from: classes.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    private static final int CORNER_ANIMATION_DURATION = 500;
    private static final int DEF_STYLE_RES = 0;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int PEEK_HEIGHT_AUTO = -1;
    public static final int SAVE_ALL = -1;
    public static final int SAVE_FIT_TO_CONTENTS = 2;
    public static final int SAVE_HIDEABLE = 4;
    public static final int SAVE_NONE = 0;
    public static final int SAVE_PEEK_HEIGHT = 1;
    public static final int SAVE_SKIP_COLLAPSED = 8;
    private static final int SIGNIFICANT_VEL_THRESHOLD = 500;
    public static final int STATE_COLLAPSED = 4;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 3;
    public static final int STATE_HALF_EXPANDED = 6;
    public static final int STATE_HIDDEN = 5;
    public static final int STATE_SETTLING = 2;
    private static final java.lang.String TAG = "BottomSheetBehavior";
    int activePointerId;
    private final java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback> callbacks;
    private int childHeight;
    int collapsedOffset;
    private final androidx.customview.widget.ViewDragHelper.Callback dragCallback;
    private boolean draggable;
    float elevation;
    private int expandHalfwayActionId;
    int expandedOffset;
    private boolean fitToContents;
    int fitToContentsOffset;
    private int gestureInsetBottom;
    private boolean gestureInsetBottomIgnored;
    int halfExpandedOffset;
    float halfExpandedRatio;
    boolean hideable;
    private boolean ignoreEvents;
    private java.util.Map<android.view.View, java.lang.Integer> importantForAccessibilityMap;
    private int initialY;
    private android.animation.ValueAnimator interpolatorAnimator;
    private boolean isShapeExpanded;
    private int lastNestedScrollDy;
    private com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private float maximumVelocity;
    private boolean nestedScrolled;
    java.lang.ref.WeakReference<android.view.View> nestedScrollingChildRef;
    int parentHeight;
    int parentWidth;
    private int peekHeight;
    private boolean peekHeightAuto;
    private int peekHeightGestureInsetBuffer;
    private int peekHeightMin;
    private int saveFlags;
    private com.google.android.material.bottomsheet.BottomSheetBehavior<V>.SettleRunnable settleRunnable;
    private com.google.android.material.shape.ShapeAppearanceModel shapeAppearanceModelDefault;
    private boolean shapeThemingEnabled;
    private boolean skipCollapsed;
    int state;
    boolean touchingScrollingChild;
    private boolean updateImportantForAccessibilityOnSiblings;
    private android.view.VelocityTracker velocityTracker;
    androidx.customview.widget.ViewDragHelper viewDragHelper;
    java.lang.ref.WeakReference<V> viewRef;






    public static abstract class BottomSheetCallback {
        public BottomSheetCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract void onSlide(android.view.View r1, float r2);

        public abstract void onStateChanged(android.view.View r1, int r2);
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SaveFlags {
    }

    protected static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState> CREATOR = null;
        boolean fitToContents;
        boolean hideable;
        int peekHeight;
        boolean skipCollapsed;
        final int state;


        static {
                com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState$1
                r0.<init>()
                com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        public SavedState(android.os.Parcel r3, java.lang.ClassLoader r4) {
                r2 = this;
                r2.<init>(r3, r4)
                int r4 = r3.readInt()
                r2.state = r4
                int r4 = r3.readInt()
                r2.peekHeight = r4
                int r4 = r3.readInt()
                r0 = 0
                r1 = 1
                if (r4 != r1) goto L19
                r4 = r1
                goto L1a
            L19:
                r4 = r0
            L1a:
                r2.fitToContents = r4
                int r4 = r3.readInt()
                if (r4 != r1) goto L24
                r4 = r1
                goto L25
            L24:
                r4 = r0
            L25:
                r2.hideable = r4
                int r3 = r3.readInt()
                if (r3 != r1) goto L2e
                r0 = r1
            L2e:
                r2.skipCollapsed = r0
                return
        }

        @java.lang.Deprecated
        public SavedState(android.os.Parcelable r1, int r2) {
                r0 = this;
                r0.<init>(r1)
                r0.state = r2
                return
        }

        public SavedState(android.os.Parcelable r1, com.google.android.material.bottomsheet.BottomSheetBehavior<?> r2) {
                r0 = this;
                r0.<init>(r1)
                int r1 = r2.state
                r0.state = r1
                int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$600(r2)
                r0.peekHeight = r1
                boolean r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$500(r2)
                r0.fitToContents = r1
                boolean r1 = r2.hideable
                r0.hideable = r1
                boolean r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.access$700(r2)
                r0.skipCollapsed = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                int r2 = r0.state
                r1.writeInt(r2)
                int r2 = r0.peekHeight
                r1.writeInt(r2)
                boolean r2 = r0.fitToContents
                r1.writeInt(r2)
                boolean r2 = r0.hideable
                r1.writeInt(r2)
                boolean r2 = r0.skipCollapsed
                r1.writeInt(r2)
                return
        }
    }

    private class SettleRunnable implements java.lang.Runnable {
        private boolean isPosted;
        int targetState;
        final /* synthetic */ com.google.android.material.bottomsheet.BottomSheetBehavior this$0;
        private final android.view.View view;

        SettleRunnable(com.google.android.material.bottomsheet.BottomSheetBehavior r1, android.view.View r2, int r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.view = r2
                r0.targetState = r3
                return
        }

        static /* synthetic */ boolean access$300(com.google.android.material.bottomsheet.BottomSheetBehavior.SettleRunnable r0) {
                boolean r0 = r0.isPosted
                return r0
        }

        static /* synthetic */ boolean access$302(com.google.android.material.bottomsheet.BottomSheetBehavior.SettleRunnable r0, boolean r1) {
                r0.isPosted = r1
                return r1
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
                if (r0 == 0) goto L17
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.this$0
                androidx.customview.widget.ViewDragHelper r0 = r0.viewDragHelper
                r1 = 1
                boolean r0 = r0.continueSettling(r1)
                if (r0 == 0) goto L17
                android.view.View r0 = r2.view
                androidx.core.view.ViewCompat.postOnAnimation(r0, r2)
                goto L1e
            L17:
                com.google.android.material.bottomsheet.BottomSheetBehavior r0 = r2.this$0
                int r1 = r2.targetState
                r0.setStateInternal(r1)
            L1e:
                r0 = 0
                r2.isPosted = r0
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_BottomSheet_Modal
            com.google.android.material.bottomsheet.BottomSheetBehavior.DEF_STYLE_RES = r0
            return
    }

    public BottomSheetBehavior() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.saveFlags = r0
            r1 = 1
            r2.fitToContents = r1
            r2.updateImportantForAccessibilityOnSiblings = r0
            r0 = 0
            r2.settleRunnable = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.halfExpandedRatio = r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.elevation = r0
            r2.draggable = r1
            r0 = 4
            r2.state = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.callbacks = r0
            r0 = -1
            r2.expandHalfwayActionId = r0
            com.google.android.material.bottomsheet.BottomSheetBehavior$4 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$4
            r0.<init>(r2)
            r2.dragCallback = r0
            return
    }

    public BottomSheetBehavior(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = 0
            r8.saveFlags = r0
            r1 = 1
            r8.fitToContents = r1
            r8.updateImportantForAccessibilityOnSiblings = r0
            r2 = 0
            r8.settleRunnable = r2
            r2 = 1056964608(0x3f000000, float:0.5)
            r8.halfExpandedRatio = r2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.elevation = r3
            r8.draggable = r1
            r4 = 4
            r8.state = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r8.callbacks = r4
            r4 = -1
            r8.expandHalfwayActionId = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior$4 r5 = new com.google.android.material.bottomsheet.BottomSheetBehavior$4
            r5.<init>(r8)
            r8.dragCallback = r5
            android.content.res.Resources r5 = r9.getResources()
            int r6 = com.google.android.material.C0479R.dimen.mtrl_min_touch_target_size
            int r5 = r5.getDimensionPixelSize(r6)
            r8.peekHeightGestureInsetBuffer = r5
            int[] r5 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5)
            int r6 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_shapeAppearance
            boolean r6 = r5.hasValue(r6)
            r8.shapeThemingEnabled = r6
            int r6 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_backgroundTint
            boolean r6 = r5.hasValue(r6)
            if (r6 == 0) goto L58
            int r7 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_backgroundTint
            android.content.res.ColorStateList r7 = com.google.android.material.resources.MaterialResources.getColorStateList(r9, r5, r7)
            r8.createMaterialShapeDrawable(r9, r10, r6, r7)
            goto L5b
        L58:
            r8.createMaterialShapeDrawable(r9, r10, r6)
        L5b:
            r8.createShapeValueAnimator()
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_android_elevation
            float r10 = r5.getDimension(r10, r3)
            r8.elevation = r10
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            android.util.TypedValue r10 = r5.peekValue(r10)
            if (r10 == 0) goto L78
            int r3 = r10.data
            if (r3 != r4) goto L78
            int r10 = r10.data
            r8.setPeekHeight(r10)
            goto L81
        L78:
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_peekHeight
            int r10 = r5.getDimensionPixelSize(r10, r4)
            r8.setPeekHeight(r10)
        L81:
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_hideable
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setHideable(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_gestureInsetBottomIgnored
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setGestureInsetBottomIgnored(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_fitToContents
            boolean r10 = r5.getBoolean(r10, r1)
            r8.setFitToContents(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_skipCollapsed
            boolean r10 = r5.getBoolean(r10, r0)
            r8.setSkipCollapsed(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_draggable
            boolean r10 = r5.getBoolean(r10, r1)
            r8.setDraggable(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_saveFlags
            int r10 = r5.getInt(r10, r0)
            r8.setSaveFlags(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_halfExpandedRatio
            float r10 = r5.getFloat(r10, r2)
            r8.setHalfExpandedRatio(r10)
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            android.util.TypedValue r10 = r5.peekValue(r10)
            if (r10 == 0) goto Ld4
            int r1 = r10.type
            r2 = 16
            if (r1 != r2) goto Ld4
            int r10 = r10.data
            r8.setExpandedOffset(r10)
            goto Ldd
        Ld4:
            int r10 = com.google.android.material.C0479R.styleable.BottomSheetBehavior_Layout_behavior_expandedOffset
            int r10 = r5.getDimensionPixelOffset(r10, r0)
            r8.setExpandedOffset(r10)
        Ldd:
            r5.recycle()
            android.view.ViewConfiguration r9 = android.view.ViewConfiguration.get(r9)
            int r9 = r9.getScaledMaximumFlingVelocity()
            float r9 = (float) r9
            r8.maximumVelocity = r9
            return
    }

    static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$000(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.materialShapeDrawable
            return r0
    }

    static /* synthetic */ int access$102(com.google.android.material.bottomsheet.BottomSheetBehavior r0, int r1) {
            r0.gestureInsetBottom = r1
            return r1
    }

    static /* synthetic */ void access$200(com.google.android.material.bottomsheet.BottomSheetBehavior r0, boolean r1) {
            r0.updatePeekHeight(r1)
            return
    }

    static /* synthetic */ boolean access$400(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.draggable
            return r0
    }

    static /* synthetic */ boolean access$500(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.fitToContents
            return r0
    }

    static /* synthetic */ int access$600(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            int r0 = r0.peekHeight
            return r0
    }

    static /* synthetic */ boolean access$700(com.google.android.material.bottomsheet.BottomSheetBehavior r0) {
            boolean r0 = r0.skipCollapsed
            return r0
    }

    private int addAccessibilityActionForState(V r2, int r3, int r4) {
            r1 = this;
            android.content.res.Resources r0 = r2.getResources()
            java.lang.String r3 = r0.getString(r3)
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            int r2 = androidx.core.view.ViewCompat.addAccessibilityAction(r2, r3, r4)
            return r2
    }

    private void calculateCollapsedOffset() {
            r2 = this;
            int r0 = r2.calculatePeekHeight()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L14
            int r1 = r2.parentHeight
            int r1 = r1 - r0
            int r0 = r2.fitToContentsOffset
            int r0 = java.lang.Math.max(r1, r0)
            r2.collapsedOffset = r0
            goto L19
        L14:
            int r1 = r2.parentHeight
            int r1 = r1 - r0
            r2.collapsedOffset = r1
        L19:
            return
    }

    private void calculateHalfExpandedOffset() {
            r3 = this;
            int r0 = r3.parentHeight
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            float r2 = r3.halfExpandedRatio
            float r1 = r1 - r2
            float r0 = r0 * r1
            int r0 = (int) r0
            r3.halfExpandedOffset = r0
            return
    }

    private int calculatePeekHeight() {
            r3 = this;
            boolean r0 = r3.peekHeightAuto
            if (r0 == 0) goto L1a
            int r0 = r3.peekHeightMin
            int r1 = r3.parentHeight
            int r2 = r3.parentWidth
            int r2 = r2 * 9
            int r2 = r2 / 16
            int r1 = r1 - r2
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r3.childHeight
            int r0 = java.lang.Math.min(r0, r1)
            return r0
        L1a:
            boolean r0 = r3.gestureInsetBottomIgnored
            if (r0 != 0) goto L2c
            int r0 = r3.gestureInsetBottom
            if (r0 <= 0) goto L2c
            int r1 = r3.peekHeight
            int r2 = r3.peekHeightGestureInsetBuffer
            int r0 = r0 + r2
            int r0 = java.lang.Math.max(r1, r0)
            return r0
        L2c:
            int r0 = r3.peekHeight
            return r0
    }

    private androidx.core.view.accessibility.AccessibilityViewCommand createAccessibilityViewCommandForState(int r2) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$5 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$5
            r0.<init>(r1, r2)
            return r0
    }

    private void createMaterialShapeDrawable(android.content.Context r2, android.util.AttributeSet r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.createMaterialShapeDrawable(r2, r3, r4, r0)
            return
    }

    private void createMaterialShapeDrawable(android.content.Context r3, android.util.AttributeSet r4, boolean r5, android.content.res.ColorStateList r6) {
            r2 = this;
            boolean r0 = r2.shapeThemingEnabled
            if (r0 == 0) goto L3f
            int r0 = com.google.android.material.C0479R.attr.bottomSheetStyle
            int r1 = com.google.android.material.bottomsheet.BottomSheetBehavior.DEF_STYLE_RES
            com.google.android.material.shape.ShapeAppearanceModel$Builder r4 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r4, r0, r1)
            com.google.android.material.shape.ShapeAppearanceModel r4 = r4.build()
            r2.shapeAppearanceModelDefault = r4
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r2.shapeAppearanceModelDefault
            r4.<init>(r0)
            r2.materialShapeDrawable = r4
            r4.initializeElevationOverlay(r3)
            if (r5 == 0) goto L28
            if (r6 == 0) goto L28
            com.google.android.material.shape.MaterialShapeDrawable r3 = r2.materialShapeDrawable
            r3.setFillColor(r6)
            goto L3f
        L28:
            android.util.TypedValue r4 = new android.util.TypedValue
            r4.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = 1
            r3.resolveAttribute(r5, r4, r6)
            com.google.android.material.shape.MaterialShapeDrawable r3 = r2.materialShapeDrawable
            int r4 = r4.data
            r3.setTint(r4)
        L3f:
            return
    }

    private void createShapeValueAnimator() {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofFloat(r0)
            r3.interpolatorAnimator = r0
            r1 = 500(0x1f4, double:2.47E-321)
            r0.setDuration(r1)
            android.animation.ValueAnimator r0 = r3.interpolatorAnimator
            com.google.android.material.bottomsheet.BottomSheetBehavior$2 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$2
            r1.<init>(r3)
            r0.addUpdateListener(r1)
            return
    }

    public static <V extends android.view.View> com.google.android.material.bottomsheet.BottomSheetBehavior<V> from(V r1) {
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r0 == 0) goto L1d
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
            boolean r0 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
            if (r0 == 0) goto L15
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            return r1
        L15:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not associated with BottomSheetBehavior"
            r1.<init>(r0)
            throw r1
        L1d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The view is not a child of CoordinatorLayout"
            r1.<init>(r0)
            throw r1
    }

    private float getYVelocity() {
            r3 = this;
            android.view.VelocityTracker r0 = r3.velocityTracker
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 1000(0x3e8, float:1.401E-42)
            float r2 = r3.maximumVelocity
            r0.computeCurrentVelocity(r1, r2)
            android.view.VelocityTracker r0 = r3.velocityTracker
            int r1 = r3.activePointerId
            float r0 = r0.getYVelocity(r1)
            return r0
    }

    private void replaceAccessibilityActionForState(V r2, androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat r3, int r4) {
            r1 = this;
            r0 = 0
            androidx.core.view.accessibility.AccessibilityViewCommand r4 = r1.createAccessibilityViewCommandForState(r4)
            androidx.core.view.ViewCompat.replaceAccessibilityAction(r2, r3, r0, r4)
            return
    }

    private void reset() {
            r1 = this;
            r0 = -1
            r1.activePointerId = r0
            android.view.VelocityTracker r0 = r1.velocityTracker
            if (r0 == 0) goto Ld
            r0.recycle()
            r0 = 0
            r1.velocityTracker = r0
        Ld:
            return
    }

    private void restoreOptionalState(com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState r4) {
            r3 = this;
            int r0 = r3.saveFlags
            if (r0 != 0) goto L5
            return
        L5:
            r1 = -1
            if (r0 == r1) goto Lc
            r2 = 1
            r0 = r0 & r2
            if (r0 != r2) goto L10
        Lc:
            int r0 = r4.peekHeight
            r3.peekHeight = r0
        L10:
            int r0 = r3.saveFlags
            if (r0 == r1) goto L18
            r2 = 2
            r0 = r0 & r2
            if (r0 != r2) goto L1c
        L18:
            boolean r0 = r4.fitToContents
            r3.fitToContents = r0
        L1c:
            int r0 = r3.saveFlags
            if (r0 == r1) goto L24
            r2 = 4
            r0 = r0 & r2
            if (r0 != r2) goto L28
        L24:
            boolean r0 = r4.hideable
            r3.hideable = r0
        L28:
            int r0 = r3.saveFlags
            if (r0 == r1) goto L31
            r1 = 8
            r0 = r0 & r1
            if (r0 != r1) goto L35
        L31:
            boolean r4 = r4.skipCollapsed
            r3.skipCollapsed = r4
        L35:
            return
    }

    private void setSystemGestureInsets(android.view.View r3) {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L18
            boolean r0 = r2.isGestureInsetBottomIgnored()
            if (r0 != 0) goto L18
            boolean r0 = r2.peekHeightAuto
            if (r0 != 0) goto L18
            com.google.android.material.bottomsheet.BottomSheetBehavior$3 r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$3
            r0.<init>(r2)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r3, r0)
        L18:
            return
    }

    private void settleToStatePendingLayout(int r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Lb
            return
        Lb:
            android.view.ViewParent r1 = r0.getParent()
            if (r1 == 0) goto L26
            boolean r1 = r1.isLayoutRequested()
            if (r1 == 0) goto L26
            boolean r1 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r1 == 0) goto L26
            com.google.android.material.bottomsheet.BottomSheetBehavior$1 r1 = new com.google.android.material.bottomsheet.BottomSheetBehavior$1
            r1.<init>(r2, r0, r3)
            r0.post(r1)
            goto L29
        L26:
            r2.settleToState(r0, r3)
        L29:
            return
    }

    private void updateAccessibilityActions() {
            r5 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r5.viewRef
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto Le
            return
        Le:
            r1 = 524288(0x80000, float:7.34684E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            r1 = 262144(0x40000, float:3.67342E-40)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            r1 = 1048576(0x100000, float:1.469368E-39)
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
            int r1 = r5.expandHalfwayActionId
            r2 = -1
            if (r1 == r2) goto L25
            androidx.core.view.ViewCompat.removeAccessibilityAction(r0, r1)
        L25:
            int r1 = r5.state
            r2 = 6
            if (r1 == r2) goto L32
            int r1 = com.google.android.material.C0479R.string.bottomsheet_action_expand_halfway
            int r1 = r5.addAccessibilityActionForState(r0, r1, r2)
            r5.expandHalfwayActionId = r1
        L32:
            boolean r1 = r5.hideable
            if (r1 == 0) goto L40
            int r1 = r5.state
            r3 = 5
            if (r1 == r3) goto L40
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_DISMISS
            r5.replaceAccessibilityActionForState(r0, r1, r3)
        L40:
            int r1 = r5.state
            r3 = 4
            r4 = 3
            if (r1 == r4) goto L61
            if (r1 == r3) goto L56
            if (r1 == r2) goto L4b
            goto L6b
        L4b:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE
            r5.replaceAccessibilityActionForState(r0, r1, r3)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r5.replaceAccessibilityActionForState(r0, r1, r4)
            goto L6b
        L56:
            boolean r1 = r5.fitToContents
            if (r1 == 0) goto L5b
            r2 = r4
        L5b:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_EXPAND
            r5.replaceAccessibilityActionForState(r0, r1, r2)
            goto L6b
        L61:
            boolean r1 = r5.fitToContents
            if (r1 == 0) goto L66
            r2 = r3
        L66:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r1 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_COLLAPSE
            r5.replaceAccessibilityActionForState(r0, r1, r2)
        L6b:
            return
    }

    private void updateDrawableForTargetState(int r6) {
            r5 = this;
            r0 = 2
            if (r6 != r0) goto L4
            return
        L4:
            r1 = 3
            r2 = 1
            r3 = 0
            if (r6 != r1) goto Lb
            r6 = r2
            goto Lc
        Lb:
            r6 = r3
        Lc:
            boolean r1 = r5.isShapeExpanded
            if (r1 == r6) goto L3e
            r5.isShapeExpanded = r6
            com.google.android.material.shape.MaterialShapeDrawable r1 = r5.materialShapeDrawable
            if (r1 == 0) goto L3e
            android.animation.ValueAnimator r1 = r5.interpolatorAnimator
            if (r1 == 0) goto L3e
            boolean r1 = r1.isRunning()
            if (r1 == 0) goto L26
            android.animation.ValueAnimator r6 = r5.interpolatorAnimator
            r6.reverse()
            goto L3e
        L26:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r6 == 0) goto L2c
            r6 = 0
            goto L2d
        L2c:
            r6 = r1
        L2d:
            float r1 = r1 - r6
            android.animation.ValueAnimator r4 = r5.interpolatorAnimator
            float[] r0 = new float[r0]
            r0[r3] = r1
            r0[r2] = r6
            r4.setFloatValues(r0)
            android.animation.ValueAnimator r6 = r5.interpolatorAnimator
            r6.start()
        L3e:
            return
    }

    private void updateImportantForAccessibility(boolean r7) {
            r6 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.viewRef
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            android.view.ViewParent r0 = r0.getParent()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            if (r1 != 0) goto L14
            return
        L14:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            int r1 = r0.getChildCount()
            if (r7 == 0) goto L29
            java.util.Map<android.view.View, java.lang.Integer> r2 = r6.importantForAccessibilityMap
            if (r2 != 0) goto L28
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>(r1)
            r6.importantForAccessibilityMap = r2
            goto L29
        L28:
            return
        L29:
            r2 = 0
        L2a:
            if (r2 >= r1) goto L71
            android.view.View r3 = r0.getChildAt(r2)
            java.lang.ref.WeakReference<V extends android.view.View> r4 = r6.viewRef
            java.lang.Object r4 = r4.get()
            if (r3 != r4) goto L39
            goto L6e
        L39:
            if (r7 == 0) goto L51
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            int r5 = r3.getImportantForAccessibility()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4.put(r3, r5)
            boolean r4 = r6.updateImportantForAccessibilityOnSiblings
            if (r4 == 0) goto L6e
            r4 = 4
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
            goto L6e
        L51:
            boolean r4 = r6.updateImportantForAccessibilityOnSiblings
            if (r4 == 0) goto L6e
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            if (r4 == 0) goto L6e
            boolean r4 = r4.containsKey(r3)
            if (r4 == 0) goto L6e
            java.util.Map<android.view.View, java.lang.Integer> r4 = r6.importantForAccessibilityMap
            java.lang.Object r4 = r4.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
        L6e:
            int r2 = r2 + 1
            goto L2a
        L71:
            if (r7 != 0) goto L77
            r7 = 0
            r6.importantForAccessibilityMap = r7
            goto L88
        L77:
            boolean r7 = r6.updateImportantForAccessibilityOnSiblings
            if (r7 == 0) goto L88
            java.lang.ref.WeakReference<V extends android.view.View> r7 = r6.viewRef
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            r0 = 8
            r7.sendAccessibilityEvent(r0)
        L88:
            return
    }

    private void updatePeekHeight(boolean r3) {
            r2 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            if (r0 == 0) goto L21
            r2.calculateCollapsedOffset()
            int r0 = r2.state
            r1 = 4
            if (r0 != r1) goto L21
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r2.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L21
            if (r3 == 0) goto L1e
            int r3 = r2.state
            r2.settleToStatePendingLayout(r3)
            goto L21
        L1e:
            r0.requestLayout()
        L21:
            return
    }

    public void addBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto Ld
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            r0.add(r2)
        Ld:
            return
    }

    public void disableShapeAnimations() {
            r1 = this;
            r0 = 0
            r1.interpolatorAnimator = r0
            return
    }

    void dispatchOnSlide(int r4) {
            r3 = this;
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L4a
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r1 = r3.callbacks
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L4a
            int r1 = r3.collapsedOffset
            if (r4 > r1) goto L29
            int r2 = r3.getExpandedOffset()
            if (r1 != r2) goto L1d
            goto L29
        L1d:
            int r1 = r3.collapsedOffset
            int r4 = r1 - r4
            float r4 = (float) r4
            int r2 = r3.getExpandedOffset()
            int r1 = r1 - r2
            float r1 = (float) r1
            goto L32
        L29:
            int r1 = r3.collapsedOffset
            int r4 = r1 - r4
            float r4 = (float) r4
            int r2 = r3.parentHeight
            int r2 = r2 - r1
            float r1 = (float) r2
        L32:
            float r4 = r4 / r1
            r1 = 0
        L34:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r2 = r3.callbacks
            int r2 = r2.size()
            if (r1 >= r2) goto L4a
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r2 = r3.callbacks
            java.lang.Object r2 = r2.get(r1)
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback) r2
            r2.onSlide(r0, r4)
            int r1 = r1 + 1
            goto L34
        L4a:
            return
    }

    android.view.View findScrollingChild(android.view.View r4) {
            r3 = this;
            boolean r0 = androidx.core.view.ViewCompat.isNestedScrollingEnabled(r4)
            if (r0 == 0) goto L7
            return r4
        L7:
            boolean r0 = r4 instanceof android.view.ViewGroup
            if (r0 == 0) goto L22
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            int r0 = r4.getChildCount()
            r1 = 0
        L12:
            if (r1 >= r0) goto L22
            android.view.View r2 = r4.getChildAt(r1)
            android.view.View r2 = r3.findScrollingChild(r2)
            if (r2 == 0) goto L1f
            return r2
        L1f:
            int r1 = r1 + 1
            goto L12
        L22:
            r4 = 0
            return r4
    }

    public int getExpandedOffset() {
            r1 = this;
            boolean r0 = r1.fitToContents
            if (r0 == 0) goto L7
            int r0 = r1.fitToContentsOffset
            goto L9
        L7:
            int r0 = r1.expandedOffset
        L9:
            return r0
    }

    public float getHalfExpandedRatio() {
            r1 = this;
            float r0 = r1.halfExpandedRatio
            return r0
    }

    public int getPeekHeight() {
            r1 = this;
            boolean r0 = r1.peekHeightAuto
            if (r0 == 0) goto L6
            r0 = -1
            goto L8
        L6:
            int r0 = r1.peekHeight
        L8:
            return r0
    }

    int getPeekHeightMin() {
            r1 = this;
            int r0 = r1.peekHeightMin
            return r0
    }

    public int getSaveFlags() {
            r1 = this;
            int r0 = r1.saveFlags
            return r0
    }

    public boolean getSkipCollapsed() {
            r1 = this;
            boolean r0 = r1.skipCollapsed
            return r0
    }

    public int getState() {
            r1 = this;
            int r0 = r1.state
            return r0
    }

    public boolean isDraggable() {
            r1 = this;
            boolean r0 = r1.draggable
            return r0
    }

    public boolean isFitToContents() {
            r1 = this;
            boolean r0 = r1.fitToContents
            return r0
    }

    public boolean isGestureInsetBottomIgnored() {
            r1 = this;
            boolean r0 = r1.gestureInsetBottomIgnored
            return r0
    }

    public boolean isHideable() {
            r1 = this;
            boolean r0 = r1.hideable
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
            r0 = this;
            super.onAttachedToLayoutParams(r1)
            r1 = 0
            r0.viewRef = r1
            r0.viewDragHelper = r1
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onDetachedFromLayoutParams() {
            r1 = this;
            super.onDetachedFromLayoutParams()
            r0 = 0
            r1.viewRef = r0
            r1.viewDragHelper = r0
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r10, V r11, android.view.MotionEvent r12) {
            r9 = this;
            boolean r0 = r11.isShown()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld2
            boolean r0 = r9.draggable
            if (r0 != 0) goto Le
            goto Ld2
        Le:
            int r0 = r12.getActionMasked()
            if (r0 != 0) goto L17
            r9.reset()
        L17:
            android.view.VelocityTracker r3 = r9.velocityTracker
            if (r3 != 0) goto L21
            android.view.VelocityTracker r3 = android.view.VelocityTracker.obtain()
            r9.velocityTracker = r3
        L21:
            android.view.VelocityTracker r3 = r9.velocityTracker
            r3.addMovement(r12)
            r3 = 0
            r4 = -1
            r5 = 2
            if (r0 == 0) goto L3c
            if (r0 == r2) goto L31
            r11 = 3
            if (r0 == r11) goto L31
            goto L7f
        L31:
            r9.touchingScrollingChild = r1
            r9.activePointerId = r4
            boolean r11 = r9.ignoreEvents
            if (r11 == 0) goto L7f
            r9.ignoreEvents = r1
            return r1
        L3c:
            float r6 = r12.getX()
            int r6 = (int) r6
            float r7 = r12.getY()
            int r7 = (int) r7
            r9.initialY = r7
            int r7 = r9.state
            if (r7 == r5) goto L6e
            java.lang.ref.WeakReference<android.view.View> r7 = r9.nestedScrollingChildRef
            if (r7 == 0) goto L57
            java.lang.Object r7 = r7.get()
            android.view.View r7 = (android.view.View) r7
            goto L58
        L57:
            r7 = r3
        L58:
            if (r7 == 0) goto L6e
            int r8 = r9.initialY
            boolean r7 = r10.isPointInChildBounds(r7, r6, r8)
            if (r7 == 0) goto L6e
            int r7 = r12.getActionIndex()
            int r7 = r12.getPointerId(r7)
            r9.activePointerId = r7
            r9.touchingScrollingChild = r2
        L6e:
            int r7 = r9.activePointerId
            if (r7 != r4) goto L7c
            int r4 = r9.initialY
            boolean r11 = r10.isPointInChildBounds(r11, r6, r4)
            if (r11 != 0) goto L7c
            r11 = r2
            goto L7d
        L7c:
            r11 = r1
        L7d:
            r9.ignoreEvents = r11
        L7f:
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto L8e
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            if (r11 == 0) goto L8e
            boolean r11 = r11.shouldInterceptTouchEvent(r12)
            if (r11 == 0) goto L8e
            return r2
        L8e:
            java.lang.ref.WeakReference<android.view.View> r11 = r9.nestedScrollingChildRef
            if (r11 == 0) goto L99
            java.lang.Object r11 = r11.get()
            r3 = r11
            android.view.View r3 = (android.view.View) r3
        L99:
            if (r0 != r5) goto Ld1
            if (r3 == 0) goto Ld1
            boolean r11 = r9.ignoreEvents
            if (r11 != 0) goto Ld1
            int r11 = r9.state
            if (r11 == r2) goto Ld1
            float r11 = r12.getX()
            int r11 = (int) r11
            float r0 = r12.getY()
            int r0 = (int) r0
            boolean r10 = r10.isPointInChildBounds(r3, r11, r0)
            if (r10 != 0) goto Ld1
            androidx.customview.widget.ViewDragHelper r10 = r9.viewDragHelper
            if (r10 == 0) goto Ld1
            int r10 = r9.initialY
            float r10 = (float) r10
            float r11 = r12.getY()
            float r10 = r10 - r11
            float r10 = java.lang.Math.abs(r10)
            androidx.customview.widget.ViewDragHelper r11 = r9.viewDragHelper
            int r11 = r11.getTouchSlop()
            float r11 = (float) r11
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 <= 0) goto Ld1
            r1 = r2
        Ld1:
            return r1
        Ld2:
            r9.ignoreEvents = r2
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r7, V r8, int r9) {
            r6 = this;
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r7)
            r1 = 1
            if (r0 == 0) goto L10
            boolean r0 = androidx.core.view.ViewCompat.getFitsSystemWindows(r8)
            if (r0 != 0) goto L10
            r8.setFitsSystemWindows(r1)
        L10:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r6.viewRef
            r2 = 3
            r3 = 0
            if (r0 != 0) goto L6a
            android.content.res.Resources r0 = r7.getResources()
            int r4 = com.google.android.material.C0479R.dimen.design_bottom_sheet_peek_height_min
            int r0 = r0.getDimensionPixelSize(r4)
            r6.peekHeightMin = r0
            r6.setSystemGestureInsets(r8)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r8)
            r6.viewRef = r0
            boolean r0 = r6.shapeThemingEnabled
            if (r0 == 0) goto L37
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.materialShapeDrawable
            if (r0 == 0) goto L37
            androidx.core.view.ViewCompat.setBackground(r8, r0)
        L37:
            com.google.android.material.shape.MaterialShapeDrawable r0 = r6.materialShapeDrawable
            if (r0 == 0) goto L5e
            float r4 = r6.elevation
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 != 0) goto L47
            float r4 = androidx.core.view.ViewCompat.getElevation(r8)
        L47:
            r0.setElevation(r4)
            int r0 = r6.state
            if (r0 != r2) goto L50
            r0 = r1
            goto L51
        L50:
            r0 = r3
        L51:
            r6.isShapeExpanded = r0
            com.google.android.material.shape.MaterialShapeDrawable r4 = r6.materialShapeDrawable
            if (r0 == 0) goto L59
            r0 = 0
            goto L5b
        L59:
            r0 = 1065353216(0x3f800000, float:1.0)
        L5b:
            r4.setInterpolation(r0)
        L5e:
            r6.updateAccessibilityActions()
            int r0 = androidx.core.view.ViewCompat.getImportantForAccessibility(r8)
            if (r0 != 0) goto L6a
            androidx.core.view.ViewCompat.setImportantForAccessibility(r8, r1)
        L6a:
            androidx.customview.widget.ViewDragHelper r0 = r6.viewDragHelper
            if (r0 != 0) goto L76
            androidx.customview.widget.ViewDragHelper$Callback r0 = r6.dragCallback
            androidx.customview.widget.ViewDragHelper r0 = androidx.customview.widget.ViewDragHelper.create(r7, r0)
            r6.viewDragHelper = r0
        L76:
            int r0 = r8.getTop()
            r7.onLayoutChild(r8, r9)
            int r9 = r7.getWidth()
            r6.parentWidth = r9
            int r7 = r7.getHeight()
            r6.parentHeight = r7
            int r7 = r8.getHeight()
            r6.childHeight = r7
            int r9 = r6.parentHeight
            int r9 = r9 - r7
            int r7 = java.lang.Math.max(r3, r9)
            r6.fitToContentsOffset = r7
            r6.calculateHalfExpandedOffset()
            r6.calculateCollapsedOffset()
            int r7 = r6.state
            if (r7 != r2) goto Laa
            int r7 = r6.getExpandedOffset()
            androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r7)
            goto Ld6
        Laa:
            r9 = 6
            if (r7 != r9) goto Lb3
            int r7 = r6.halfExpandedOffset
            androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r7)
            goto Ld6
        Lb3:
            boolean r9 = r6.hideable
            if (r9 == 0) goto Lc0
            r9 = 5
            if (r7 != r9) goto Lc0
            int r7 = r6.parentHeight
            androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r7)
            goto Ld6
        Lc0:
            r9 = 4
            if (r7 != r9) goto Lc9
            int r7 = r6.collapsedOffset
            androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r7)
            goto Ld6
        Lc9:
            if (r7 == r1) goto Lce
            r9 = 2
            if (r7 != r9) goto Ld6
        Lce:
            int r7 = r8.getTop()
            int r0 = r0 - r7
            androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r0)
        Ld6:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference
            android.view.View r8 = r6.findScrollingChild(r8)
            r7.<init>(r8)
            r6.nestedScrollingChildRef = r7
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(androidx.coordinatorlayout.widget.CoordinatorLayout r4, V r5, android.view.View r6, float r7, float r8) {
            r3 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r3.nestedScrollingChildRef
            r1 = 0
            if (r0 == 0) goto L17
            java.lang.Object r0 = r0.get()
            if (r6 != r0) goto L17
            int r0 = r3.state
            r2 = 3
            if (r0 != r2) goto L16
            boolean r4 = super.onNestedPreFling(r4, r5, r6, r7, r8)
            if (r4 == 0) goto L17
        L16:
            r1 = 1
        L17:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.view.View r4, int r5, int r6, int[] r7, int r8) {
            r1 = this;
            r2 = 1
            if (r8 != r2) goto L4
            return
        L4:
            java.lang.ref.WeakReference<android.view.View> r5 = r1.nestedScrollingChildRef
            if (r5 == 0) goto Lf
            java.lang.Object r5 = r5.get()
            android.view.View r5 = (android.view.View) r5
            goto L10
        Lf:
            r5 = 0
        L10:
            if (r4 == r5) goto L13
            return
        L13:
            int r5 = r3.getTop()
            int r8 = r5 - r6
            if (r6 <= 0) goto L40
            int r4 = r1.getExpandedOffset()
            if (r8 >= r4) goto L31
            int r4 = r1.getExpandedOffset()
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = -r5
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 3
            r1.setStateInternal(r4)
            goto L6c
        L31:
            boolean r4 = r1.draggable
            if (r4 != 0) goto L36
            return
        L36:
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.setStateInternal(r2)
            goto L6c
        L40:
            if (r6 >= 0) goto L6c
            r0 = -1
            boolean r4 = r4.canScrollVertically(r0)
            if (r4 != 0) goto L6c
            int r4 = r1.collapsedOffset
            if (r8 <= r4) goto L5e
            boolean r8 = r1.hideable
            if (r8 == 0) goto L52
            goto L5e
        L52:
            int r5 = r5 - r4
            r7[r2] = r5
            int r4 = -r5
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r4 = 4
            r1.setStateInternal(r4)
            goto L6c
        L5e:
            boolean r4 = r1.draggable
            if (r4 != 0) goto L63
            return
        L63:
            r7[r2] = r6
            int r4 = -r6
            androidx.core.view.ViewCompat.offsetTopAndBottom(r3, r4)
            r1.setStateInternal(r2)
        L6c:
            int r3 = r3.getTop()
            r1.dispatchOnSlide(r3)
            r1.lastNestedScrollDy = r6
            r1.nestedScrolled = r2
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, int r4, int r5, int r6, int r7, int r8, int[] r9) {
            r0 = this;
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3, android.os.Parcelable r4) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) r4
            android.os.Parcelable r0 = r4.getSuperState()
            super.onRestoreInstanceState(r2, r3, r0)
            r1.restoreOptionalState(r4)
            int r2 = r4.state
            r3 = 1
            if (r2 == r3) goto L1c
            int r2 = r4.state
            r3 = 2
            if (r2 != r3) goto L17
            goto L1c
        L17:
            int r2 = r4.state
            r1.state = r2
            goto L1f
        L1c:
            r2 = 4
            r1.state = r2
        L1f:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable onSaveInstanceState(androidx.coordinatorlayout.widget.CoordinatorLayout r2, V r3) {
            r1 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState r0 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState
            android.os.Parcelable r2 = super.onSaveInstanceState(r2, r3)
            r0.<init>(r2, r1)
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, V r2, android.view.View r3, android.view.View r4, int r5, int r6) {
            r0 = this;
            r1 = 0
            r0.lastNestedScrollDy = r1
            r0.nestedScrolled = r1
            r2 = r5 & 2
            if (r2 == 0) goto La
            r1 = 1
        La:
            return r1
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.View r5, int r6) {
            r2 = this;
            int r3 = r4.getTop()
            int r6 = r2.getExpandedOffset()
            r0 = 3
            if (r3 != r6) goto Lf
            r2.setStateInternal(r0)
            return
        Lf:
            java.lang.ref.WeakReference<android.view.View> r3 = r2.nestedScrollingChildRef
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r3.get()
            if (r5 != r3) goto Lc6
            boolean r3 = r2.nestedScrolled
            if (r3 != 0) goto L1f
            goto Lc6
        L1f:
            int r3 = r2.lastNestedScrollDy
            r5 = 6
            if (r3 <= 0) goto L3c
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto L2c
            int r3 = r2.fitToContentsOffset
            goto Lc0
        L2c:
            int r3 = r4.getTop()
            int r6 = r2.halfExpandedOffset
            if (r3 <= r6) goto L38
            r0 = r5
            r3 = r6
            goto Lc0
        L38:
            int r3 = r2.expandedOffset
            goto Lc0
        L3c:
            boolean r3 = r2.hideable
            if (r3 == 0) goto L4f
            float r3 = r2.getYVelocity()
            boolean r3 = r2.shouldHide(r4, r3)
            if (r3 == 0) goto L4f
            int r3 = r2.parentHeight
            r0 = 5
            goto Lc0
        L4f:
            int r3 = r2.lastNestedScrollDy
            r6 = 4
            if (r3 != 0) goto L9c
            int r3 = r4.getTop()
            boolean r1 = r2.fitToContents
            if (r1 == 0) goto L73
            int r5 = r2.fitToContentsOffset
            int r5 = r3 - r5
            int r5 = java.lang.Math.abs(r5)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r5 >= r3) goto L70
            int r3 = r2.fitToContentsOffset
            goto Lc0
        L70:
            int r3 = r2.collapsedOffset
            goto La2
        L73:
            int r1 = r2.halfExpandedOffset
            if (r3 >= r1) goto L87
            int r6 = r2.collapsedOffset
            int r6 = r3 - r6
            int r6 = java.lang.Math.abs(r6)
            if (r3 >= r6) goto L84
            int r3 = r2.expandedOffset
            goto Lc0
        L84:
            int r3 = r2.halfExpandedOffset
            goto Lbb
        L87:
            int r0 = r3 - r1
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto L99
            int r3 = r2.halfExpandedOffset
            goto Lbb
        L99:
            int r3 = r2.collapsedOffset
            goto La2
        L9c:
            boolean r3 = r2.fitToContents
            if (r3 == 0) goto La4
            int r3 = r2.collapsedOffset
        La2:
            r0 = r6
            goto Lc0
        La4:
            int r3 = r4.getTop()
            int r0 = r2.halfExpandedOffset
            int r0 = r3 - r0
            int r0 = java.lang.Math.abs(r0)
            int r1 = r2.collapsedOffset
            int r3 = r3 - r1
            int r3 = java.lang.Math.abs(r3)
            if (r0 >= r3) goto Lbd
            int r3 = r2.halfExpandedOffset
        Lbb:
            r0 = r5
            goto Lc0
        Lbd:
            int r3 = r2.collapsedOffset
            goto La2
        Lc0:
            r5 = 0
            r2.startSettlingAnimation(r4, r0, r3, r5)
            r2.nestedScrolled = r5
        Lc6:
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r3, V r4, android.view.MotionEvent r5) {
            r2 = this;
            boolean r3 = r4.isShown()
            if (r3 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r3 = r5.getActionMasked()
            int r0 = r2.state
            r1 = 1
            if (r0 != r1) goto L14
            if (r3 != 0) goto L14
            return r1
        L14:
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            if (r0 == 0) goto L1b
            r0.processTouchEvent(r5)
        L1b:
            if (r3 != 0) goto L20
            r2.reset()
        L20:
            android.view.VelocityTracker r0 = r2.velocityTracker
            if (r0 != 0) goto L2a
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r2.velocityTracker = r0
        L2a:
            android.view.VelocityTracker r0 = r2.velocityTracker
            r0.addMovement(r5)
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            if (r0 == 0) goto L5e
            r0 = 2
            if (r3 != r0) goto L5e
            boolean r3 = r2.ignoreEvents
            if (r3 != 0) goto L5e
            int r3 = r2.initialY
            float r3 = (float) r3
            float r0 = r5.getY()
            float r3 = r3 - r0
            float r3 = java.lang.Math.abs(r3)
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            int r0 = r0.getTouchSlop()
            float r0 = (float) r0
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L5e
            androidx.customview.widget.ViewDragHelper r3 = r2.viewDragHelper
            int r0 = r5.getActionIndex()
            int r5 = r5.getPointerId(r0)
            r3.captureChildView(r4, r5)
        L5e:
            boolean r3 = r2.ignoreEvents
            r3 = r3 ^ r1
            return r3
    }

    public void removeBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r1.callbacks
            r0.remove(r2)
            return
    }

    @java.lang.Deprecated
    public void setBottomSheetCallback(com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback r3) {
            r2 = this;
            java.lang.String r0 = "BottomSheetBehavior"
            java.lang.String r1 = "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks."
            android.util.Log.w(r0, r1)
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r2.callbacks
            r0.clear()
            if (r3 == 0) goto L13
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r0 = r2.callbacks
            r0.add(r3)
        L13:
            return
    }

    public void setDraggable(boolean r1) {
            r0 = this;
            r0.draggable = r1
            return
    }

    public void setExpandedOffset(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.expandedOffset = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "offset must be greater than or equal to 0"
            r2.<init>(r0)
            throw r2
    }

    public void setFitToContents(boolean r2) {
            r1 = this;
            boolean r0 = r1.fitToContents
            if (r0 != r2) goto L5
            return
        L5:
            r1.fitToContents = r2
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto Le
            r1.calculateCollapsedOffset()
        Le:
            boolean r2 = r1.fitToContents
            if (r2 == 0) goto L19
            int r2 = r1.state
            r0 = 6
            if (r2 != r0) goto L19
            r2 = 3
            goto L1b
        L19:
            int r2 = r1.state
        L1b:
            r1.setStateInternal(r2)
            r1.updateAccessibilityActions()
            return
    }

    public void setGestureInsetBottomIgnored(boolean r1) {
            r0 = this;
            r0.gestureInsetBottomIgnored = r1
            return
    }

    public void setHalfExpandedRatio(float r2) {
            r1 = this;
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L15
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L15
            r1.halfExpandedRatio = r2
            java.lang.ref.WeakReference<V extends android.view.View> r2 = r1.viewRef
            if (r2 == 0) goto L14
            r1.calculateHalfExpandedOffset()
        L14:
            return
        L15:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "ratio must be a float value between 0 and 1"
            r2.<init>(r0)
            throw r2
    }

    public void setHideable(boolean r2) {
            r1 = this;
            boolean r0 = r1.hideable
            if (r0 == r2) goto L14
            r1.hideable = r2
            if (r2 != 0) goto L11
            int r2 = r1.state
            r0 = 5
            if (r2 != r0) goto L11
            r2 = 4
            r1.setState(r2)
        L11:
            r1.updateAccessibilityActions()
        L14:
            return
    }

    public void setPeekHeight(int r2) {
            r1 = this;
            r0 = 0
            r1.setPeekHeight(r2, r0)
            return
    }

    public final void setPeekHeight(int r4, boolean r5) {
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto Lc
            boolean r4 = r3.peekHeightAuto
            if (r4 != 0) goto L15
            r3.peekHeightAuto = r1
            goto L1f
        Lc:
            boolean r0 = r3.peekHeightAuto
            if (r0 != 0) goto L17
            int r0 = r3.peekHeight
            if (r0 == r4) goto L15
            goto L17
        L15:
            r1 = r2
            goto L1f
        L17:
            r3.peekHeightAuto = r2
            int r4 = java.lang.Math.max(r2, r4)
            r3.peekHeight = r4
        L1f:
            if (r1 == 0) goto L24
            r3.updatePeekHeight(r5)
        L24:
            return
    }

    public void setSaveFlags(int r1) {
            r0 = this;
            r0.saveFlags = r1
            return
    }

    public void setSkipCollapsed(boolean r1) {
            r0 = this;
            r0.skipCollapsed = r1
            return
    }

    public void setState(int r2) {
            r1 = this;
            int r0 = r1.state
            if (r2 != r0) goto L5
            return
        L5:
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r1.viewRef
            if (r0 != 0) goto L1c
            r0 = 4
            if (r2 == r0) goto L19
            r0 = 3
            if (r2 == r0) goto L19
            r0 = 6
            if (r2 == r0) goto L19
            boolean r0 = r1.hideable
            if (r0 == 0) goto L1b
            r0 = 5
            if (r2 != r0) goto L1b
        L19:
            r1.state = r2
        L1b:
            return
        L1c:
            r1.settleToStatePendingLayout(r2)
            return
    }

    void setStateInternal(int r4) {
            r3 = this;
            int r0 = r3.state
            if (r0 != r4) goto L5
            return
        L5:
            r3.state = r4
            java.lang.ref.WeakReference<V extends android.view.View> r0 = r3.viewRef
            if (r0 != 0) goto Lc
            return
        Lc:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 != 0) goto L15
            return
        L15:
            r1 = 3
            r2 = 0
            if (r4 != r1) goto L1e
            r1 = 1
            r3.updateImportantForAccessibility(r1)
            goto L2a
        L1e:
            r1 = 6
            if (r4 == r1) goto L27
            r1 = 5
            if (r4 == r1) goto L27
            r1 = 4
            if (r4 != r1) goto L2a
        L27:
            r3.updateImportantForAccessibility(r2)
        L2a:
            r3.updateDrawableForTargetState(r4)
        L2d:
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r1 = r3.callbacks
            int r1 = r1.size()
            if (r2 >= r1) goto L43
            java.util.ArrayList<com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback> r1 = r3.callbacks
            java.lang.Object r1 = r1.get(r2)
            com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback) r1
            r1.onStateChanged(r0, r4)
            int r2 = r2 + 1
            goto L2d
        L43:
            r3.updateAccessibilityActions()
            return
    }

    public void setUpdateImportantForAccessibilityOnSiblings(boolean r1) {
            r0 = this;
            r0.updateImportantForAccessibilityOnSiblings = r1
            return
    }

    void settleToState(android.view.View r4, int r5) {
            r3 = this;
            r0 = 4
            if (r5 != r0) goto L6
            int r0 = r3.collapsedOffset
            goto L27
        L6:
            r0 = 6
            r1 = 3
            if (r5 != r0) goto L17
            int r0 = r3.halfExpandedOffset
            boolean r2 = r3.fitToContents
            if (r2 == 0) goto L27
            int r2 = r3.fitToContentsOffset
            if (r0 > r2) goto L27
            r5 = r1
            r0 = r2
            goto L27
        L17:
            if (r5 != r1) goto L1e
            int r0 = r3.getExpandedOffset()
            goto L27
        L1e:
            boolean r0 = r3.hideable
            if (r0 == 0) goto L2c
            r0 = 5
            if (r5 != r0) goto L2c
            int r0 = r3.parentHeight
        L27:
            r1 = 0
            r3.startSettlingAnimation(r4, r5, r0, r1)
            return
        L2c:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal state argument: "
            r0.<init>(r1)
            java.lang.StringBuilder r5 = r0.append(r5)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
    }

    boolean shouldHide(android.view.View r5, float r6) {
            r4 = this;
            boolean r0 = r4.skipCollapsed
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.getTop()
            int r2 = r4.collapsedOffset
            r3 = 0
            if (r0 >= r2) goto L10
            return r3
        L10:
            int r0 = r4.calculatePeekHeight()
            int r5 = r5.getTop()
            float r5 = (float) r5
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r6 = r6 * r2
            float r5 = r5 + r6
            int r6 = r4.collapsedOffset
            float r6 = (float) r6
            float r5 = r5 - r6
            float r5 = java.lang.Math.abs(r5)
            float r6 = (float) r0
            float r5 = r5 / r6
            r6 = 1056964608(0x3f000000, float:0.5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L2f
            goto L30
        L2f:
            r1 = r3
        L30:
            return r1
    }

    void startSettlingAnimation(android.view.View r3, int r4, int r5, boolean r6) {
            r2 = this;
            androidx.customview.widget.ViewDragHelper r0 = r2.viewDragHelper
            r1 = 1
            if (r0 == 0) goto L1e
            if (r6 == 0) goto L12
            int r6 = r3.getLeft()
            boolean r5 = r0.settleCapturedViewAt(r6, r5)
            if (r5 == 0) goto L1e
            goto L1c
        L12:
            int r6 = r3.getLeft()
            boolean r5 = r0.smoothSlideViewTo(r3, r6, r5)
            if (r5 == 0) goto L1e
        L1c:
            r5 = r1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            if (r5 == 0) goto L4f
            r5 = 2
            r2.setStateInternal(r5)
            r2.updateDrawableForTargetState(r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r5 = r2.settleRunnable
            if (r5 != 0) goto L33
            com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable r5 = new com.google.android.material.bottomsheet.BottomSheetBehavior$SettleRunnable
            r5.<init>(r2, r3, r4)
            r2.settleRunnable = r5
        L33:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r5 = r2.settleRunnable
            boolean r5 = com.google.android.material.bottomsheet.BottomSheetBehavior.SettleRunnable.access$300(r5)
            if (r5 != 0) goto L4a
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r5 = r2.settleRunnable
            r5.targetState = r4
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r4 = r2.settleRunnable
            androidx.core.view.ViewCompat.postOnAnimation(r3, r4)
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r3 = r2.settleRunnable
            com.google.android.material.bottomsheet.BottomSheetBehavior.SettleRunnable.access$302(r3, r1)
            goto L52
        L4a:
            com.google.android.material.bottomsheet.BottomSheetBehavior<V>$SettleRunnable r3 = r2.settleRunnable
            r3.targetState = r4
            goto L52
        L4f:
            r2.setStateInternal(r4)
        L52:
            return
    }
}
