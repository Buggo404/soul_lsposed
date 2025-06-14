package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
public class ExtendedFloatingActionButton extends com.google.android.material.button.MaterialButton implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int ANIM_STATE_HIDING = 1;
    private static final int ANIM_STATE_NONE = 0;
    private static final int ANIM_STATE_SHOWING = 2;
    private static final int DEF_STYLE_RES = 0;
    static final android.util.Property<android.view.View, java.lang.Float> HEIGHT = null;
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_END = null;
    static final android.util.Property<android.view.View, java.lang.Float> PADDING_START = null;
    static final android.util.Property<android.view.View, java.lang.Float> WIDTH = null;
    private int animState;
    private boolean animateShowBeforeLayout;
    private final androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> behavior;
    private final com.google.android.material.floatingactionbutton.AnimatorTracker changeVisibilityTracker;
    private final int collapsedSize;
    private final com.google.android.material.floatingactionbutton.MotionStrategy extendStrategy;
    private int extendedPaddingEnd;
    private int extendedPaddingStart;
    private final com.google.android.material.floatingactionbutton.MotionStrategy hideStrategy;
    private boolean isExtended;
    private boolean isTransforming;
    protected android.content.res.ColorStateList originalTextCsl;
    private final com.google.android.material.floatingactionbutton.MotionStrategy showStrategy;
    private final com.google.android.material.floatingactionbutton.MotionStrategy shrinkStrategy;








    class ChangeSizeStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private final boolean extending;
        private final com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size size;
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        ChangeSizeStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.Size r3, boolean r4) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                r0.size = r3
                r0.extending = r4
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public android.animation.AnimatorSet createAnimator() {
                r10 = this;
                com.google.android.material.animation.MotionSpec r0 = r10.getCurrentMotionSpec()
                java.lang.String r1 = "width"
                boolean r2 = r0.hasPropertyValues(r1)
                r3 = 1
                r4 = 2
                r5 = 0
                if (r2 == 0) goto L2f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = r8.getWidth()
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getWidth()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L2f:
                java.lang.String r1 = "height"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L57
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = r8.getHeight()
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getHeight()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L57:
                java.lang.String r1 = "paddingStart"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto L7f
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = androidx.core.view.ViewCompat.getPaddingStart(r8)
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingStart()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            L7f:
                java.lang.String r1 = "paddingEnd"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto La7
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                r6 = r2[r5]
                float[] r7 = new float[r4]
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r8 = r10.this$0
                int r8 = androidx.core.view.ViewCompat.getPaddingEnd(r8)
                float r8 = (float) r8
                r7[r5] = r8
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r8 = r10.size
                int r8 = r8.getPaddingEnd()
                float r8 = (float) r8
                r7[r3] = r8
                r6.setFloatValues(r7)
                r0.setPropertyValues(r1, r2)
            La7:
                java.lang.String r1 = "labelOpacity"
                boolean r2 = r0.hasPropertyValues(r1)
                if (r2 == 0) goto Lce
                android.animation.PropertyValuesHolder[] r2 = r0.getPropertyValues(r1)
                boolean r6 = r10.extending
                r7 = 0
                r8 = 1065353216(0x3f800000, float:1.0)
                if (r6 == 0) goto Lbc
                r9 = r7
                goto Lbd
            Lbc:
                r9 = r8
            Lbd:
                if (r6 == 0) goto Lc0
                r7 = r8
            Lc0:
                r6 = r2[r5]
                float[] r4 = new float[r4]
                r4[r5] = r9
                r4[r3] = r7
                r6.setFloatValues(r4)
                r0.setPropertyValues(r1, r2)
            Lce:
                android.animation.AnimatorSet r0 = super.createAnimator(r0)
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                boolean r0 = r1.extending
                if (r0 == 0) goto L7
                int r0 = com.google.android.material.C0479R.animator.mtrl_extended_fab_change_size_expand_motion_spec
                goto L9
            L7:
                int r0 = com.google.android.material.C0479R.animator.mtrl_extended_fab_change_size_collapse_motion_spec
            L9:
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$802(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setHorizontallyScrolling(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L17
                return
            L17:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r2.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                boolean r0 = r1.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$802(r2, r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r2.setHorizontallyScrolling(r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 != 0) goto L3
                return
            L3:
                boolean r0 = r1.extending
                if (r0 == 0) goto Ld
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onExtended(r0)
                goto L12
            Ld:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShrunken(r0)
            L12:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r5 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                boolean r1 = r5.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$702(r0, r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
                if (r0 != 0) goto L10
                return
            L10:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.width
                r0.width = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                int r1 = r1.height
                r0.height = r1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r1 = r5.size
                int r1 = r1.getPaddingStart()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r5.this$0
                int r2 = r2.getPaddingTop()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size r3 = r5.size
                int r3 = r3.getPaddingEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4 = r5.this$0
                int r4 = r4.getPaddingBottom()
                androidx.core.view.ViewCompat.setPaddingRelative(r0, r1, r2, r3, r4)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r5.this$0
                r0.requestLayout()
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r2 = this;
                boolean r0 = r2.extending
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1 = r2.this$0
                boolean r1 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$700(r1)
                if (r0 == r1) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                android.graphics.drawable.Drawable r0 = r0.getIcon()
                if (r0 == 0) goto L21
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                java.lang.CharSequence r0 = r0.getText()
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L1f
                goto L21
            L1f:
                r0 = 0
                goto L22
            L21:
                r0 = 1
            L22:
                return r0
        }
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = false;
        private static final boolean AUTO_SHRINK_DEFAULT = true;
        private boolean autoHideEnabled;
        private boolean autoShrinkEnabled;
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoHideCallback;
        private com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback internalAutoShrinkCallback;
        private android.graphics.Rect tmpRect;

        public ExtendedFloatingActionButtonBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.autoHideEnabled = r0
                r0 = 1
                r1.autoShrinkEnabled = r0
                return
        }

        public ExtendedFloatingActionButtonBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 0
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoHideEnabled = r3
                int r3 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoShrinkEnabled = r3
                r2.recycle()
                return
        }

        private static boolean isBottomSheet(android.view.View r1) {
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                boolean r0 = r1 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
                if (r0 == 0) goto L11
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r1 = r1.getBehavior()
                boolean r1 = r1 instanceof com.google.android.material.bottomsheet.BottomSheetBehavior
                return r1
            L11:
                r1 = 0
                return r1
        }

        private boolean shouldUpdateVisibility(android.view.View r3, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r4 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r4
                boolean r0 = r2.autoHideEnabled
                r1 = 0
                if (r0 != 0) goto L10
                boolean r0 = r2.autoShrinkEnabled
                if (r0 != 0) goto L10
                return r1
            L10:
                int r4 = r4.getAnchorId()
                int r3 = r3.getId()
                if (r4 == r3) goto L1b
                return r1
            L1b:
                r3 = 1
                return r3
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.appbar.AppBarLayout r3, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r1 = this;
                boolean r0 = r1.shouldUpdateVisibility(r3, r4)
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                android.graphics.Rect r0 = r1.tmpRect
                if (r0 != 0) goto L13
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.tmpRect = r0
            L13:
                android.graphics.Rect r0 = r1.tmpRect
                com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r2, r3, r0)
                int r2 = r0.bottom
                int r3 = r3.getMinimumHeightForVisibleOverlappingContent()
                if (r2 > r3) goto L24
                r1.shrinkOrHide(r4)
                goto L27
            L24:
                r1.extendOrShow(r4)
            L27:
                r2 = 1
                return r2
        }

        private boolean updateFabVisibilityForBottomSheet(android.view.View r3, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r4) {
                r2 = this;
                boolean r0 = r2.shouldUpdateVisibility(r3, r4)
                if (r0 != 0) goto L8
                r3 = 0
                return r3
            L8:
                android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r3 = r3.getTop()
                int r1 = r4.getHeight()
                int r1 = r1 / 2
                int r0 = r0.topMargin
                int r1 = r1 + r0
                if (r3 >= r1) goto L21
                r2.shrinkOrHide(r4)
                goto L24
            L21:
                r2.extendOrShow(r4)
            L24:
                r3 = 1
                return r3
        }

        protected void extendOrShow(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r2 = this;
                boolean r0 = r2.autoShrinkEnabled
                if (r0 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoShrinkCallback
                goto L9
            L7:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoHideCallback
            L9:
                if (r0 == 0) goto L10
                com.google.android.material.floatingactionbutton.MotionStrategy r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$500(r3)
                goto L14
            L10:
                com.google.android.material.floatingactionbutton.MotionStrategy r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$600(r3)
            L14:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r3, r0, r1)
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2, android.graphics.Rect r3) {
                r0 = this;
                boolean r1 = super.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean isAutoHideEnabled() {
                r1 = this;
                boolean r0 = r1.autoHideEnabled
                return r0
        }

        public boolean isAutoShrinkEnabled() {
                r1 = this;
                boolean r0 = r1.autoShrinkEnabled
                return r0
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r2) {
                r1 = this;
                int r0 = r2.dodgeInsetEdges
                if (r0 != 0) goto L8
                r0 = 80
                r2.dodgeInsetEdges = r0
            L8:
                return
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3, android.view.View r4) {
                r1 = this;
                boolean r0 = r4 instanceof com.google.android.material.appbar.AppBarLayout
                if (r0 == 0) goto La
                com.google.android.material.appbar.AppBarLayout r4 = (com.google.android.material.appbar.AppBarLayout) r4
                r1.updateFabVisibilityForAppBarLayout(r2, r4, r3)
                goto L13
            La:
                boolean r2 = isBottomSheet(r4)
                if (r2 == 0) goto L13
                r1.updateFabVisibilityForBottomSheet(r4, r3)
            L13:
                r2 = 0
                return r2
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = (com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r7, int r8) {
                r5 = this;
                java.util.List r0 = r6.getDependencies(r7)
                int r1 = r0.size()
                r2 = 0
            L9:
                if (r2 >= r1) goto L2e
                java.lang.Object r3 = r0.get(r2)
                android.view.View r3 = (android.view.View) r3
                boolean r4 = r3 instanceof com.google.android.material.appbar.AppBarLayout
                if (r4 == 0) goto L1e
                com.google.android.material.appbar.AppBarLayout r3 = (com.google.android.material.appbar.AppBarLayout) r3
                boolean r3 = r5.updateFabVisibilityForAppBarLayout(r6, r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L1e:
                boolean r4 = isBottomSheet(r3)
                if (r4 == 0) goto L2b
                boolean r3 = r5.updateFabVisibilityForBottomSheet(r3, r7)
                if (r3 == 0) goto L2b
                goto L2e
            L2b:
                int r2 = r2 + 1
                goto L9
            L2e:
                r6.onLayoutChild(r7, r8)
                r6 = 1
                return r6
        }

        public void setAutoHideEnabled(boolean r1) {
                r0 = this;
                r0.autoHideEnabled = r1
                return
        }

        public void setAutoShrinkEnabled(boolean r1) {
                r0 = this;
                r0.autoShrinkEnabled = r1
                return
        }

        void setInternalAutoHideCallback(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1) {
                r0 = this;
                r0.internalAutoHideCallback = r1
                return
        }

        void setInternalAutoShrinkCallback(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r1) {
                r0 = this;
                r0.internalAutoShrinkCallback = r1
                return
        }

        protected void shrinkOrHide(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r3) {
                r2 = this;
                boolean r0 = r2.autoShrinkEnabled
                if (r0 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoShrinkCallback
                goto L9
            L7:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback r1 = r2.internalAutoHideCallback
            L9:
                if (r0 == 0) goto L10
                com.google.android.material.floatingactionbutton.MotionStrategy r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$200(r3)
                goto L14
            L10:
                com.google.android.material.floatingactionbutton.MotionStrategy r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$300(r3)
            L14:
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$400(r3, r0, r1)
                return
        }
    }

    class HideStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        private boolean isCancelled;
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public HideStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.C0479R.animator.mtrl_extended_fab_hide_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationCancel() {
                r1 = this;
                super.onAnimationCancel()
                r0 = 1
                r1.isCancelled = r0
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$902(r0, r1)
                boolean r0 = r2.isCancelled
                if (r0 != 0) goto L14
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
            L14:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                r2 = 0
                r1.isCancelled = r2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r0.setVisibility(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 1
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$902(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onHidden(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 8
                r0.setVisibility(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$1100(r0)
                return r0
        }
    }

    public static abstract class OnChangedCallback {
        public OnChangedCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onExtended(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onHidden(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShown(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShrunken(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1) {
                r0 = this;
                return
        }
    }

    class ShowStrategy extends com.google.android.material.floatingactionbutton.BaseMotionStrategy {
        final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton this$0;

        public ShowStrategy(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r1, com.google.android.material.floatingactionbutton.AnimatorTracker r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r1, r2)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public int getDefaultMotionSpecResource() {
                r1 = this;
                int r0 = com.google.android.material.C0479R.animator.mtrl_extended_fab_show_motion_spec
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationEnd() {
                r2 = this;
                super.onAnimationEnd()
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$902(r0, r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.BaseMotionStrategy, com.google.android.material.floatingactionbutton.MotionStrategy
        public void onAnimationStart(android.animation.Animator r2) {
                r1 = this;
                super.onAnimationStart(r2)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 0
                r2.setVisibility(r0)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r2 = r1.this$0
                r0 = 2
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$902(r2, r0)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void onChange(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                r2.onShown(r0)
            L7:
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public void performNow() {
                r2 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 0
                r0.setVisibility(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.setAlpha(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleY(r1)
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r2.this$0
                r0.setScaleX(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.MotionStrategy
        public boolean shouldCancel() {
                r1 = this;
                com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0 = r1.this$0
                boolean r0 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.access$1000(r0)
                return r0
        }
    }

    interface Size {
        int getHeight();

        android.view.ViewGroup.LayoutParams getLayoutParams();

        int getPaddingEnd();

        int getPaddingStart();

        int getWidth();
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$4
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "width"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.WIDTH = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$5
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "height"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.HEIGHT = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$6
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "paddingStart"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_START = r0
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7 r0 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$7
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            java.lang.String r2 = "paddingEnd"
            r0.<init>(r1, r2)
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.PADDING_END = r0
            return
    }

    public ExtendedFloatingActionButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ExtendedFloatingActionButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.extendedFloatingActionButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.DEF_STYLE_RES
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.animState = r10
            com.google.android.material.floatingactionbutton.AnimatorTracker r1 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r1.<init>()
            r0.changeVisibilityTracker = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ShowStrategy
            r11.<init>(r0, r1)
            r0.showStrategy = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$HideStrategy
            r12.<init>(r0, r1)
            r0.hideStrategy = r12
            r13 = 1
            r0.isExtended = r13
            r0.isTransforming = r10
            r0.animateShowBeforeLayout = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.behavior = r1
            int[] r3 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r1, r2, r3, r4, r5, r6)
            int r2 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r2)
            int r3 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r3 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r3)
            int r4 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_extendMotionSpec
            com.google.android.material.animation.MotionSpec r4 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r4)
            int r5 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_shrinkMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.createFromAttribute(r14, r1, r5)
            int r6 = com.google.android.material.C0479R.styleable.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.collapsedSize = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingStart(r16)
            r0.extendedPaddingStart = r6
            int r6 = androidx.core.view.ViewCompat.getPaddingEnd(r16)
            r0.extendedPaddingEnd = r6
            com.google.android.material.floatingactionbutton.AnimatorTracker r6 = new com.google.android.material.floatingactionbutton.AnimatorTracker
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1 r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$1
            r10.<init>(r0)
            r15.<init>(r0, r6, r10, r13)
            r0.extendStrategy = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ChangeSizeStrategy
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2 r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$2
            r13.<init>(r0)
            r7 = 0
            r10.<init>(r0, r6, r13, r7)
            r0.shrinkStrategy = r10
            r11.setMotionSpec(r2)
            r12.setMotionSpec(r3)
            r15.setMotionSpec(r4)
            r10.setMotionSpec(r5)
            r1.recycle()
            com.google.android.material.shape.CornerSize r1 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            r2 = r18
            com.google.android.material.shape.ShapeAppearanceModel$Builder r1 = com.google.android.material.shape.ShapeAppearanceModel.builder(r14, r2, r8, r9, r1)
            com.google.android.material.shape.ShapeAppearanceModel r1 = r1.build()
            r0.setShapeAppearanceModel(r1)
            r16.saveOriginalTextCsl()
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingStart
            return r0
    }

    static /* synthetic */ int access$100(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            int r0 = r0.extendedPaddingEnd
            return r0
    }

    static /* synthetic */ boolean access$1000(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeShown()
            return r0
    }

    static /* synthetic */ boolean access$1100(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isOrWillBeHidden()
            return r0
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.MotionStrategy access$200(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r0.shrinkStrategy
            return r0
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.MotionStrategy access$300(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r0.hideStrategy
            return r0
    }

    static /* synthetic */ void access$400(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, com.google.android.material.floatingactionbutton.MotionStrategy r1, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r0.performMotion(r1, r2)
            return
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.MotionStrategy access$500(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r0.extendStrategy
            return r0
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.MotionStrategy access$600(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r0.showStrategy
            return r0
    }

    static /* synthetic */ boolean access$700(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0) {
            boolean r0 = r0.isExtended
            return r0
    }

    static /* synthetic */ boolean access$702(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isExtended = r1
            return r1
    }

    static /* synthetic */ boolean access$802(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, boolean r1) {
            r0.isTransforming = r1
            return r1
    }

    static /* synthetic */ int access$902(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton r0, int r1) {
            r0.animState = r1
            return r1
    }

    private boolean isOrWillBeHidden() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto Le
            int r0 = r4.animState
            if (r0 != r2) goto Ld
            r1 = r2
        Ld:
            return r1
        Le:
            int r0 = r4.animState
            r3 = 2
            if (r0 == r3) goto L14
            r1 = r2
        L14:
            return r1
    }

    private boolean isOrWillBeShown() {
            r4 = this;
            int r0 = r4.getVisibility()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            int r0 = r4.animState
            r3 = 2
            if (r0 != r3) goto Le
            r1 = r2
        Le:
            return r1
        Lf:
            int r0 = r4.animState
            if (r0 == r2) goto L14
            r1 = r2
        L14:
            return r1
    }

    private void performMotion(com.google.android.material.floatingactionbutton.MotionStrategy r3, com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r4) {
            r2 = this;
            boolean r0 = r3.shouldCancel()
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r2.shouldAnimateVisibilityChange()
            if (r0 != 0) goto L14
            r3.performNow()
            r3.onChange(r4)
            return
        L14:
            r0 = 0
            r2.measure(r0, r0)
            android.animation.AnimatorSet r0 = r3.createAnimator()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3 r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$3
            r1.<init>(r2, r3, r4)
            r0.addListener(r1)
            java.util.List r3 = r3.getListeners()
            java.util.Iterator r3 = r3.iterator()
        L2c:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3c
            java.lang.Object r4 = r3.next()
            android.animation.Animator$AnimatorListener r4 = (android.animation.Animator.AnimatorListener) r4
            r0.addListener(r4)
            goto L2c
        L3c:
            r0.start()
            return
    }

    private void saveOriginalTextCsl() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getTextColors()
            r1.originalTextCsl = r0
            return
    }

    private boolean shouldAnimateVisibilityChange() {
            r1 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r1)
            if (r0 != 0) goto L10
            boolean r0 = r1.isOrWillBeShown()
            if (r0 != 0) goto L18
            boolean r0 = r1.animateShowBeforeLayout
            if (r0 == 0) goto L18
        L10:
            boolean r0 = r1.isInEditMode()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            return r0
    }

    public void addOnExtendAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void addOnShrinkAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.addAnimationListener(r2)
            return
    }

    public void extend() {
            r2 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r2.extendStrategy
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void extend(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r1.performMotion(r0, r2)
            return
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> getBehavior() {
            r1 = this;
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior<com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton> r0 = r1.behavior
            return r0
    }

    int getCollapsedPadding() {
            r2 = this;
            int r0 = r2.getCollapsedSize()
            int r1 = r2.getIconSize()
            int r0 = r0 - r1
            int r0 = r0 / 2
            return r0
    }

    int getCollapsedSize() {
            r2 = this;
            int r0 = r2.collapsedSize
            if (r0 >= 0) goto L17
            int r0 = androidx.core.view.ViewCompat.getPaddingStart(r2)
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r2)
            int r0 = java.lang.Math.min(r0, r1)
            int r0 = r0 * 2
            int r1 = r2.getIconSize()
            int r0 = r0 + r1
        L17:
            return r0
    }

    public com.google.android.material.animation.MotionSpec getExtendMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public com.google.android.material.animation.MotionSpec getShrinkMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            com.google.android.material.animation.MotionSpec r0 = r0.getMotionSpec()
            return r0
    }

    public void hide() {
            r2 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r2.hideStrategy
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void hide(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r1.performMotion(r0, r2)
            return
    }

    public final boolean isExtended() {
            r1 = this;
            boolean r0 = r1.isExtended
            return r0
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            boolean r0 = r1.isExtended
            if (r0 == 0) goto L1f
            java.lang.CharSequence r0 = r1.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1f
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L1f
            r0 = 0
            r1.isExtended = r0
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.performNow()
        L1f:
            return
    }

    public void removeOnExtendAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void removeOnShrinkAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.removeAnimationListener(r2)
            return
    }

    public void setAnimateShowBeforeLayout(boolean r1) {
            r0 = this;
            r0.animateShowBeforeLayout = r1
            return
    }

    public void setExtendMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.extendStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setExtendMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setExtendMotionSpec(r2)
            return
    }

    public void setExtended(boolean r2) {
            r1 = this;
            boolean r0 = r1.isExtended
            if (r0 != r2) goto L5
            return
        L5:
            if (r2 == 0) goto La
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.extendStrategy
            goto Lc
        La:
            com.google.android.material.floatingactionbutton.MotionStrategy r2 = r1.shrinkStrategy
        Lc:
            boolean r0 = r2.shouldCancel()
            if (r0 == 0) goto L13
            return
        L13:
            r2.performNow()
            return
    }

    public void setHideMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.hideStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPadding(r1, r2, r3, r4)
            boolean r1 = r0.isExtended
            if (r1 == 0) goto L17
            boolean r1 = r0.isTransforming
            if (r1 != 0) goto L17
            int r1 = androidx.core.view.ViewCompat.getPaddingStart(r0)
            r0.extendedPaddingStart = r1
            int r1 = androidx.core.view.ViewCompat.getPaddingEnd(r0)
            r0.extendedPaddingEnd = r1
        L17:
            return
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setPaddingRelative(r1, r2, r3, r4)
            boolean r2 = r0.isExtended
            if (r2 == 0) goto Lf
            boolean r2 = r0.isTransforming
            if (r2 != 0) goto Lf
            r0.extendedPaddingStart = r1
            r0.extendedPaddingEnd = r3
        Lf:
            return
    }

    public void setShowMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r0.setMotionSpec(r2)
            return
    }

    public void setShrinkMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShrinkMotionSpec(r2)
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(int r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    @Override // android.widget.TextView
    public void setTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            r0.saveOriginalTextCsl()
            return
    }

    public void show() {
            r2 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r2.showStrategy
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void show(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.showStrategy
            r1.performMotion(r0, r2)
            return
    }

    public void shrink() {
            r2 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r2.shrinkStrategy
            r1 = 0
            r2.performMotion(r0, r1)
            return
    }

    public void shrink(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.OnChangedCallback r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.MotionStrategy r0 = r1.shrinkStrategy
            r1.performMotion(r0, r2)
            return
    }

    protected void silentlyUpdateTextColor(android.content.res.ColorStateList r1) {
            r0 = this;
            super.setTextColor(r1)
            return
    }
}
