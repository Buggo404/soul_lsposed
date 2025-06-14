package com.google.android.material.bottomappbar;

/* loaded from: classes.dex */
public class BottomAppBar extends androidx.appcompat.widget.Toolbar implements androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final long ANIMATION_DURATION = 300;
    private static final int DEF_STYLE_RES = 0;
    public static final int FAB_ALIGNMENT_MODE_CENTER = 0;
    public static final int FAB_ALIGNMENT_MODE_END = 1;
    public static final int FAB_ANIMATION_MODE_SCALE = 0;
    public static final int FAB_ANIMATION_MODE_SLIDE = 1;
    private static final int NO_MENU_RES_ID = 0;
    private int animatingModeChangeCounter;
    private java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar.AnimationListener> animationListeners;
    private com.google.android.material.bottomappbar.BottomAppBar.Behavior behavior;
    private int bottomInset;
    private int fabAlignmentMode;
    android.animation.AnimatorListenerAdapter fabAnimationListener;
    private int fabAnimationMode;
    private boolean fabAttached;
    private final int fabOffsetEndMode;
    com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton> fabTransformationCallback;
    private boolean hideOnScroll;
    private int leftInset;
    private final com.google.android.material.shape.MaterialShapeDrawable materialShapeDrawable;
    private boolean menuAnimatingWithFabAlignmentMode;
    private android.animation.Animator menuAnimator;
    private android.animation.Animator modeAnimator;
    private final boolean paddingBottomSystemWindowInsets;
    private final boolean paddingLeftSystemWindowInsets;
    private final boolean paddingRightSystemWindowInsets;
    private int pendingMenuResId;
    private int rightInset;










    interface AnimationListener {
        void onAnimationEnd(com.google.android.material.bottomappbar.BottomAppBar r1);

        void onAnimationStart(com.google.android.material.bottomappbar.BottomAppBar r1);
    }

    public static class Behavior extends com.google.android.material.behavior.HideBottomViewOnScrollBehavior<com.google.android.material.bottomappbar.BottomAppBar> {
        private final android.graphics.Rect fabContentRect;
        private final android.view.View.OnLayoutChangeListener fabLayoutListener;
        private int originalBottomMargin;
        private java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> viewRef;


        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$1
                r0.<init>(r1)
                r1.fabLayoutListener = r0
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r1.fabContentRect = r0
                return
        }

        public Behavior(android.content.Context r1, android.util.AttributeSet r2) {
                r0 = this;
                r0.<init>(r1, r2)
                com.google.android.material.bottomappbar.BottomAppBar$Behavior$1 r1 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior$1
                r1.<init>(r0)
                r0.fabLayoutListener = r1
                android.graphics.Rect r1 = new android.graphics.Rect
                r1.<init>()
                r0.fabContentRect = r1
                return
        }

        static /* synthetic */ java.lang.ref.WeakReference access$2400(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                java.lang.ref.WeakReference<com.google.android.material.bottomappbar.BottomAppBar> r0 = r0.viewRef
                return r0
        }

        static /* synthetic */ android.graphics.Rect access$2500(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                android.graphics.Rect r0 = r0.fabContentRect
                return r0
        }

        static /* synthetic */ int access$2600(com.google.android.material.bottomappbar.BottomAppBar.Behavior r0) {
                int r0 = r0.originalBottomMargin
                return r0
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, int r3) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r4, com.google.android.material.bottomappbar.BottomAppBar r5, int r6) {
                r3 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r5)
                r3.viewRef = r0
                android.view.View r0 = com.google.android.material.bottomappbar.BottomAppBar.access$3100(r5)
                if (r0 == 0) goto L32
                boolean r1 = androidx.core.view.ViewCompat.isLaidOut(r0)
                if (r1 != 0) goto L32
                android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                r2 = 49
                r1.anchorGravity = r2
                int r1 = r1.bottomMargin
                r3.originalBottomMargin = r1
                boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
                if (r1 == 0) goto L2f
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
                android.view.View$OnLayoutChangeListener r1 = r3.fabLayoutListener
                r0.addOnLayoutChangeListener(r1)
                com.google.android.material.bottomappbar.BottomAppBar.access$3200(r5, r0)
            L2f:
                com.google.android.material.bottomappbar.BottomAppBar.access$1300(r5)
            L32:
                r4.onLayoutChild(r5, r6)
                boolean r4 = super.onLayoutChild(r4, r5, r6)
                return r4
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.view.View r3, android.view.View r4, int r5, int r6) {
                r0 = this;
                com.google.android.material.bottomappbar.BottomAppBar r2 = (com.google.android.material.bottomappbar.BottomAppBar) r2
                boolean r1 = r0.onStartNestedScroll(r1, r2, r3, r4, r5, r6)
                return r1
        }

        public boolean onStartNestedScroll(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.bottomappbar.BottomAppBar r3, android.view.View r4, android.view.View r5, int r6, int r7) {
                r1 = this;
                boolean r0 = r3.getHideOnScroll()
                if (r0 == 0) goto Le
                boolean r2 = super.onStartNestedScroll(r2, r3, r4, r5, r6, r7)
                if (r2 == 0) goto Le
                r2 = 1
                goto Lf
            Le:
                r2 = 0
            Lf:
                return r2
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAlignmentMode {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FabAnimationMode {
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomappbar.BottomAppBar.SavedState> CREATOR = null;
        int fabAlignmentMode;
        boolean fabAttached;


        static {
                com.google.android.material.bottomappbar.BottomAppBar$SavedState$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$SavedState$1
                r0.<init>()
                com.google.android.material.bottomappbar.BottomAppBar.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                int r2 = r1.readInt()
                r0.fabAlignmentMode = r2
                int r1 = r1.readInt()
                if (r1 == 0) goto L11
                r1 = 1
                goto L12
            L11:
                r1 = 0
            L12:
                r0.fabAttached = r1
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
                int r2 = r0.fabAlignmentMode
                r1.writeInt(r2)
                boolean r2 = r0.fabAttached
                r1.writeInt(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_BottomAppBar
            com.google.android.material.bottomappbar.BottomAppBar.DEF_STYLE_RES = r0
            return
    }

    public BottomAppBar(android.content.Context r3) {
            r2 = this;
            r0 = 0
            r1 = 0
            r2.<init>(r3, r0, r1)
            return
    }

    public BottomAppBar(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.bottomAppBarStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r6 = com.google.android.material.bottomappbar.BottomAppBar.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.shape.MaterialShapeDrawable r11 = new com.google.android.material.shape.MaterialShapeDrawable
            r11.<init>()
            r10.materialShapeDrawable = r11
            r7 = 0
            r10.animatingModeChangeCounter = r7
            r10.pendingMenuResId = r7
            r10.menuAnimatingWithFabAlignmentMode = r7
            r0 = 1
            r10.fabAttached = r0
            com.google.android.material.bottomappbar.BottomAppBar$1 r0 = new com.google.android.material.bottomappbar.BottomAppBar$1
            r0.<init>(r10)
            r10.fabAnimationListener = r0
            com.google.android.material.bottomappbar.BottomAppBar$2 r0 = new com.google.android.material.bottomappbar.BottomAppBar$2
            r0.<init>(r10)
            r10.fabTransformationCallback = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C0479R.styleable.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r8, r0, r1)
            int r2 = com.google.android.material.C0479R.styleable.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = com.google.android.material.C0479R.styleable.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = com.google.android.material.C0479R.styleable.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = com.google.android.material.C0479R.styleable.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.fabAlignmentMode = r9
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.fabAnimationMode = r9
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.hideOnScroll = r9
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.paddingBottomSystemWindowInsets = r9
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.paddingLeftSystemWindowInsets = r9
            int r9 = com.google.android.material.C0479R.styleable.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.paddingRightSystemWindowInsets = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = com.google.android.material.C0479R.dimen.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.fabOffsetEndMode = r0
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = new com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment
            r0.<init>(r3, r4, r5)
            com.google.android.material.shape.ShapeAppearanceModel$Builder r3 = com.google.android.material.shape.ShapeAppearanceModel.builder()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = r3.setTopEdge(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.setShadowCompatibilityMode(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.setPaintStyle(r0)
            r11.initializeElevationOverlay(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r11, r1)
            androidx.core.view.ViewCompat.setBackground(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$3 r11 = new com.google.android.material.bottomappbar.BottomAppBar$3
            r11.<init>(r10)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r10, r12, r13, r6, r11)
            return
    }

    static /* synthetic */ boolean access$000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.menuAnimatingWithFabAlignmentMode
            return r0
    }

    static /* synthetic */ boolean access$002(com.google.android.material.bottomappbar.BottomAppBar r0, boolean r1) {
            r0.menuAnimatingWithFabAlignmentMode = r1
            return r1
    }

    static /* synthetic */ int access$100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.fabAlignmentMode
            return r0
    }

    static /* synthetic */ boolean access$1000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingRightSystemWindowInsets
            return r0
    }

    static /* synthetic */ int access$1100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.rightInset
            return r0
    }

    static /* synthetic */ int access$1102(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.rightInset = r1
            return r1
    }

    static /* synthetic */ void access$1200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.cancelAnimations()
            return
    }

    static /* synthetic */ void access$1300(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.setCutoutState()
            return
    }

    static /* synthetic */ void access$1400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.setActionMenuViewPosition()
            return
    }

    static /* synthetic */ void access$1500(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.dispatchAnimationStart()
            return
    }

    static /* synthetic */ void access$1600(com.google.android.material.bottomappbar.BottomAppBar r0) {
            r0.dispatchAnimationEnd()
            return
    }

    static /* synthetic */ android.animation.Animator access$1702(com.google.android.material.bottomappbar.BottomAppBar r0, android.animation.Animator r1) {
            r0.modeAnimator = r1
            return r1
    }

    static /* synthetic */ float access$1800(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            float r0 = r0.getFabTranslationX(r1)
            return r0
    }

    static /* synthetic */ android.animation.Animator access$1902(com.google.android.material.bottomappbar.BottomAppBar r0, android.animation.Animator r1) {
            r0.menuAnimator = r1
            return r1
    }

    static /* synthetic */ boolean access$200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.fabAttached
            return r0
    }

    static /* synthetic */ int access$2000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.pendingMenuResId
            return r0
    }

    static /* synthetic */ void access$2100(com.google.android.material.bottomappbar.BottomAppBar r0, androidx.appcompat.widget.ActionMenuView r1, int r2, boolean r3, boolean r4) {
            r0.translateActionMenuView(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton access$2200(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r0.findDependentFab()
            return r0
    }

    static /* synthetic */ float access$2300(com.google.android.material.bottomappbar.BottomAppBar r0) {
            float r0 = r0.getFabTranslationX()
            return r0
    }

    static /* synthetic */ int access$2700(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getBottomInset()
            return r0
    }

    static /* synthetic */ int access$2800(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getLeftInset()
            return r0
    }

    static /* synthetic */ int access$2900(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.getRightInset()
            return r0
    }

    static /* synthetic */ void access$300(com.google.android.material.bottomappbar.BottomAppBar r0, int r1, boolean r2) {
            r0.maybeAnimateMenuView(r1, r2)
            return
    }

    static /* synthetic */ int access$3000(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.fabOffsetEndMode
            return r0
    }

    static /* synthetic */ android.view.View access$3100(com.google.android.material.bottomappbar.BottomAppBar r0) {
            android.view.View r0 = r0.findDependentView()
            return r0
    }

    static /* synthetic */ void access$3200(com.google.android.material.bottomappbar.BottomAppBar r0, com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
            r0.addFabAnimationListeners(r1)
            return
    }

    static /* synthetic */ com.google.android.material.shape.MaterialShapeDrawable access$400(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.materialShapeDrawable
            return r0
    }

    static /* synthetic */ com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment access$500(com.google.android.material.bottomappbar.BottomAppBar r0) {
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r0.getTopEdgeTreatment()
            return r0
    }

    static /* synthetic */ boolean access$600(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingBottomSystemWindowInsets
            return r0
    }

    static /* synthetic */ int access$702(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.bottomInset = r1
            return r1
    }

    static /* synthetic */ boolean access$800(com.google.android.material.bottomappbar.BottomAppBar r0) {
            boolean r0 = r0.paddingLeftSystemWindowInsets
            return r0
    }

    static /* synthetic */ int access$900(com.google.android.material.bottomappbar.BottomAppBar r0) {
            int r0 = r0.leftInset
            return r0
    }

    static /* synthetic */ int access$902(com.google.android.material.bottomappbar.BottomAppBar r0, int r1) {
            r0.leftInset = r1
            return r1
    }

    private void addFabAnimationListeners(com.google.android.material.floatingactionbutton.FloatingActionButton r2) {
            r1 = this;
            android.animation.AnimatorListenerAdapter r0 = r1.fabAnimationListener
            r2.addOnHideAnimationListener(r0)
            com.google.android.material.bottomappbar.BottomAppBar$9 r0 = new com.google.android.material.bottomappbar.BottomAppBar$9
            r0.<init>(r1)
            r2.addOnShowAnimationListener(r0)
            com.google.android.material.animation.TransformationCallback<com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.fabTransformationCallback
            r2.addTransformationCallback(r0)
            return
    }

    private void cancelAnimations() {
            r1 = this;
            android.animation.Animator r0 = r1.menuAnimator
            if (r0 == 0) goto L7
            r0.cancel()
        L7:
            android.animation.Animator r0 = r1.modeAnimator
            if (r0 == 0) goto Le
            r0.cancel()
        Le:
            return
    }

    private void createFabTranslationXAnimation(int r4, java.util.List<android.animation.Animator> r5) {
            r3 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r3.findDependentFab()
            r1 = 1
            float[] r1 = new float[r1]
            r2 = 0
            float r4 = r3.getFabTranslationX(r4)
            r1[r2] = r4
            java.lang.String r4 = "translationX"
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r4, r1)
            r0 = 300(0x12c, double:1.48E-321)
            r4.setDuration(r0)
            r5.add(r4)
            return
    }

    private void createMenuViewTranslationAnimation(int r9, boolean r10, java.util.List<android.animation.Animator> r11) {
            r8 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r8.getActionMenuView()
            if (r0 != 0) goto L7
            return
        L7:
            r1 = 1
            float[] r2 = new float[r1]
            r3 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            r2[r3] = r4
            java.lang.String r5 = "alpha"
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r0, r5, r2)
            float r6 = r0.getTranslationX()
            int r7 = r8.getActionMenuViewTranslationX(r0, r9, r10)
            float r7 = (float) r7
            float r6 = r6 - r7
            float r6 = java.lang.Math.abs(r6)
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 <= 0) goto L50
            float[] r4 = new float[r1]
            r6 = 0
            r4[r3] = r6
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r0, r5, r4)
            com.google.android.material.bottomappbar.BottomAppBar$7 r5 = new com.google.android.material.bottomappbar.BottomAppBar$7
            r5.<init>(r8, r0, r9, r10)
            r4.addListener(r5)
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r5 = 150(0x96, double:7.4E-322)
            r9.setDuration(r5)
            r10 = 2
            android.animation.Animator[] r10 = new android.animation.Animator[r10]
            r10[r3] = r4
            r10[r1] = r2
            r9.playSequentially(r10)
            r11.add(r9)
            goto L5b
        L50:
            float r9 = r0.getAlpha()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto L5b
            r11.add(r2)
        L5b:
            return
    }

    private void dispatchAnimationEnd() {
            r2 = this;
            int r0 = r2.animatingModeChangeCounter
            int r0 = r0 + (-1)
            r2.animatingModeChangeCounter = r0
            if (r0 != 0) goto L20
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r2.animationListeners
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.bottomappbar.BottomAppBar$AnimationListener r1 = (com.google.android.material.bottomappbar.BottomAppBar.AnimationListener) r1
            r1.onAnimationEnd(r2)
            goto L10
        L20:
            return
    }

    private void dispatchAnimationStart() {
            r2 = this;
            int r0 = r2.animatingModeChangeCounter
            int r1 = r0 + 1
            r2.animatingModeChangeCounter = r1
            if (r0 != 0) goto L20
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r2.animationListeners
            if (r0 == 0) goto L20
            java.util.Iterator r0 = r0.iterator()
        L10:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            com.google.android.material.bottomappbar.BottomAppBar$AnimationListener r1 = (com.google.android.material.bottomappbar.BottomAppBar.AnimationListener) r1
            r1.onAnimationStart(r2)
            goto L10
        L20:
            return
    }

    private com.google.android.material.floatingactionbutton.FloatingActionButton findDependentFab() {
            r2 = this;
            android.view.View r0 = r2.findDependentView()
            boolean r1 = r0 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r1 == 0) goto Lb
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r0
            goto Lc
        Lb:
            r0 = 0
        Lc:
            return r0
    }

    private android.view.View findDependentView() {
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.getDependents(r4)
            java.util.Iterator r0 = r0.iterator()
        L18:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L2c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L18
        L2c:
            return r2
        L2d:
            return r1
    }

    private androidx.appcompat.widget.ActionMenuView getActionMenuView() {
            r3 = this;
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L15
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof androidx.appcompat.widget.ActionMenuView
            if (r2 == 0) goto L12
            androidx.appcompat.widget.ActionMenuView r1 = (androidx.appcompat.widget.ActionMenuView) r1
            return r1
        L12:
            int r0 = r0 + 1
            goto L1
        L15:
            r0 = 0
            return r0
    }

    private int getBottomInset() {
            r1 = this;
            int r0 = r1.bottomInset
            return r0
    }

    private float getFabTranslationX() {
            r1 = this;
            int r0 = r1.fabAlignmentMode
            float r0 = r1.getFabTranslationX(r0)
            return r0
    }

    private float getFabTranslationX(int r4) {
            r3 = this;
            boolean r0 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r3)
            r1 = 1
            if (r4 != r1) goto L1e
            if (r0 == 0) goto Lc
            int r4 = r3.leftInset
            goto Le
        Lc:
            int r4 = r3.rightInset
        Le:
            int r2 = r3.fabOffsetEndMode
            int r2 = r2 + r4
            int r4 = r3.getMeasuredWidth()
            int r4 = r4 / 2
            int r4 = r4 - r2
            if (r0 == 0) goto L1b
            r1 = -1
        L1b:
            int r4 = r4 * r1
            float r4 = (float) r4
            return r4
        L1e:
            r4 = 0
            return r4
    }

    private float getFabTranslationY() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getCradleVerticalOffset()
            float r0 = -r0
            return r0
    }

    private int getLeftInset() {
            r1 = this;
            int r0 = r1.leftInset
            return r0
    }

    private int getRightInset() {
            r1 = this;
            int r0 = r1.rightInset
            return r0
    }

    private com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment getTopEdgeTreatment() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            com.google.android.material.shape.EdgeTreatment r0 = r0.getTopEdge()
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = (com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment) r0
            return r0
    }

    private boolean isFabVisibleOrWillBeShown() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.findDependentFab()
            if (r0 == 0) goto Le
            boolean r0 = r0.isOrWillBeShown()
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    private void maybeAnimateMenuView(int r4, boolean r5) {
            r3 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            r1 = 0
            if (r0 != 0) goto Lf
            r3.menuAnimatingWithFabAlignmentMode = r1
            int r4 = r3.pendingMenuResId
            r3.replaceMenu(r4)
            return
        Lf:
            android.animation.Animator r0 = r3.menuAnimator
            if (r0 == 0) goto L16
            r0.cancel()
        L16:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r2 = r3.isFabVisibleOrWillBeShown()
            if (r2 != 0) goto L23
            r4 = r1
            r5 = r4
        L23:
            r3.createMenuViewTranslationAnimation(r4, r5, r0)
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playTogether(r0)
            r3.menuAnimator = r4
            com.google.android.material.bottomappbar.BottomAppBar$6 r5 = new com.google.android.material.bottomappbar.BottomAppBar$6
            r5.<init>(r3)
            r4.addListener(r5)
            android.animation.Animator r4 = r3.menuAnimator
            r4.start()
            return
    }

    private void maybeAnimateModeChange(int r4) {
            r3 = this;
            int r0 = r3.fabAlignmentMode
            if (r0 == r4) goto L3a
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            if (r0 != 0) goto Lb
            goto L3a
        Lb:
            android.animation.Animator r0 = r3.modeAnimator
            if (r0 == 0) goto L12
            r0.cancel()
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r3.fabAnimationMode
            r2 = 1
            if (r1 != r2) goto L20
            r3.createFabTranslationXAnimation(r4, r0)
            goto L23
        L20:
            r3.createFabDefaultXAnimation(r4, r0)
        L23:
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.playTogether(r0)
            r3.modeAnimator = r4
            com.google.android.material.bottomappbar.BottomAppBar$4 r0 = new com.google.android.material.bottomappbar.BottomAppBar$4
            r0.<init>(r3)
            r4.addListener(r0)
            android.animation.Animator r4 = r3.modeAnimator
            r4.start()
        L3a:
            return
    }

    private void setActionMenuViewPosition() {
            r3 = this;
            androidx.appcompat.widget.ActionMenuView r0 = r3.getActionMenuView()
            if (r0 == 0) goto L21
            android.animation.Animator r1 = r3.menuAnimator
            if (r1 != 0) goto L21
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.setAlpha(r1)
            boolean r1 = r3.isFabVisibleOrWillBeShown()
            if (r1 != 0) goto L1a
            r1 = 0
            r3.translateActionMenuView(r0, r1, r1)
            goto L21
        L1a:
            int r1 = r3.fabAlignmentMode
            boolean r2 = r3.fabAttached
            r3.translateActionMenuView(r0, r1, r2)
        L21:
            return
    }

    private void setCutoutState() {
            r3 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r3.getTopEdgeTreatment()
            float r1 = r3.getFabTranslationX()
            r0.setHorizontalOffset(r1)
            android.view.View r0 = r3.findDependentView()
            com.google.android.material.shape.MaterialShapeDrawable r1 = r3.materialShapeDrawable
            boolean r2 = r3.fabAttached
            if (r2 == 0) goto L1e
            boolean r2 = r3.isFabVisibleOrWillBeShown()
            if (r2 == 0) goto L1e
            r2 = 1065353216(0x3f800000, float:1.0)
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r1.setInterpolation(r2)
            if (r0 == 0) goto L32
            float r1 = r3.getFabTranslationY()
            r0.setTranslationY(r1)
            float r1 = r3.getFabTranslationX()
            r0.setTranslationX(r1)
        L32:
            return
    }

    private void translateActionMenuView(androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.translateActionMenuView(r2, r3, r4, r0)
            return
    }

    private void translateActionMenuView(androidx.appcompat.widget.ActionMenuView r2, int r3, boolean r4, boolean r5) {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$8 r0 = new com.google.android.material.bottomappbar.BottomAppBar$8
            r0.<init>(r1, r2, r3, r4)
            if (r5 == 0) goto Lb
            r2.post(r0)
            goto Le
        Lb:
            r0.run()
        Le:
            return
    }

    void addAnimationListener(com.google.android.material.bottomappbar.BottomAppBar.AnimationListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r1.animationListeners
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.animationListeners = r0
        Lb:
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r1.animationListeners
            r0.add(r2)
            return
    }

    protected void createFabDefaultXAnimation(int r2, java.util.List<android.animation.Animator> r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton r3 = r1.findDependentFab()
            if (r3 == 0) goto L18
            boolean r0 = r3.isOrWillBeHidden()
            if (r0 == 0) goto Ld
            goto L18
        Ld:
            r1.dispatchAnimationStart()
            com.google.android.material.bottomappbar.BottomAppBar$5 r0 = new com.google.android.material.bottomappbar.BottomAppBar$5
            r0.<init>(r1, r2)
            r3.hide(r0)
        L18:
            return
    }

    protected int getActionMenuViewTranslationX(androidx.appcompat.widget.ActionMenuView r7, int r8, boolean r9) {
            r6 = this;
            r0 = 0
            r1 = 1
            if (r8 != r1) goto L69
            if (r9 != 0) goto L8
            goto L69
        L8:
            boolean r8 = com.google.android.material.internal.ViewUtils.isLayoutRtl(r6)
            if (r8 == 0) goto L13
            int r9 = r6.getMeasuredWidth()
            goto L14
        L13:
            r9 = r0
        L14:
            r2 = r0
        L15:
            int r3 = r6.getChildCount()
            if (r2 >= r3) goto L53
            android.view.View r3 = r6.getChildAt(r2)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            boolean r4 = r4 instanceof androidx.appcompat.widget.Toolbar.LayoutParams
            if (r4 == 0) goto L3a
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            androidx.appcompat.widget.Toolbar$LayoutParams r4 = (androidx.appcompat.widget.Toolbar.LayoutParams) r4
            int r4 = r4.gravity
            r5 = 8388615(0x800007, float:1.1754953E-38)
            r4 = r4 & r5
            r5 = 8388611(0x800003, float:1.1754948E-38)
            if (r4 != r5) goto L3a
            r4 = r1
            goto L3b
        L3a:
            r4 = r0
        L3b:
            if (r4 == 0) goto L50
            if (r8 == 0) goto L48
            int r3 = r3.getLeft()
            int r9 = java.lang.Math.min(r9, r3)
            goto L50
        L48:
            int r3 = r3.getRight()
            int r9 = java.lang.Math.max(r9, r3)
        L50:
            int r2 = r2 + 1
            goto L15
        L53:
            if (r8 == 0) goto L5a
            int r7 = r7.getRight()
            goto L5e
        L5a:
            int r7 = r7.getLeft()
        L5e:
            if (r8 == 0) goto L63
            int r8 = r6.rightInset
            goto L66
        L63:
            int r8 = r6.leftInset
            int r8 = -r8
        L66:
            int r7 = r7 + r8
            int r9 = r9 - r7
            return r9
        L69:
            return r0
    }

    public android.content.res.ColorStateList getBackgroundTint() {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            android.content.res.ColorStateList r0 = r0.getTintList()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public /* bridge */ /* synthetic */ androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public com.google.android.material.bottomappbar.BottomAppBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.behavior
            if (r0 != 0) goto Lb
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = new com.google.android.material.bottomappbar.BottomAppBar$Behavior
            r0.<init>()
            r1.behavior = r0
        Lb:
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.behavior
            return r0
    }

    public float getCradleVerticalOffset() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getCradleVerticalOffset()
            return r0
    }

    public int getFabAlignmentMode() {
            r1 = this;
            int r0 = r1.fabAlignmentMode
            return r0
    }

    public int getFabAnimationMode() {
            r1 = this;
            int r0 = r1.fabAnimationMode
            return r0
    }

    public float getFabCradleMargin() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabCradleMargin()
            return r0
    }

    public float getFabCradleRoundedCornerRadius() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabCradleRoundedCornerRadius()
            return r0
    }

    public boolean getHideOnScroll() {
            r1 = this;
            boolean r0 = r1.hideOnScroll
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r2 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r2.materialShapeDrawable
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r2, r0)
            android.view.ViewParent r0 = r2.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1a
            android.view.ViewParent r0 = r2.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r1 = 0
            r0.setClipChildren(r1)
        L1a:
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            if (r1 == 0) goto Lb
            r0.cancelAnimations()
            r0.setCutoutState()
        Lb:
            r0.setActionMenuViewPosition()
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomappbar.BottomAppBar.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.bottomappbar.BottomAppBar$SavedState r2 = (com.google.android.material.bottomappbar.BottomAppBar.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            int r0 = r2.fabAlignmentMode
            r1.fabAlignmentMode = r0
            boolean r2 = r2.fabAttached
            r1.fabAttached = r2
            return
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomappbar.BottomAppBar$SavedState r1 = new com.google.android.material.bottomappbar.BottomAppBar$SavedState
            r1.<init>(r0)
            int r0 = r2.fabAlignmentMode
            r1.fabAlignmentMode = r0
            boolean r0 = r2.fabAttached
            r1.fabAttached = r0
            return r1
    }

    public void performHide() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.slideDown(r1)
            return
    }

    public void performShow() {
            r1 = this;
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.slideUp(r1)
            return
    }

    void removeAnimationListener(com.google.android.material.bottomappbar.BottomAppBar.AnimationListener r2) {
            r1 = this;
            java.util.ArrayList<com.google.android.material.bottomappbar.BottomAppBar$AnimationListener> r0 = r1.animationListeners
            if (r0 != 0) goto L5
            return
        L5:
            r0.remove(r2)
            return
    }

    public void replaceMenu(int r2) {
            r1 = this;
            if (r2 == 0) goto Lf
            r0 = 0
            r1.pendingMenuResId = r0
            android.view.Menu r0 = r1.getMenu()
            r0.clear()
            r1.inflateMenu(r2)
        Lf:
            return
    }

    public void setBackgroundTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            return
    }

    public void setCradleVerticalOffset(float r2) {
            r1 = this;
            float r0 = r1.getCradleVerticalOffset()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L17
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setCradleVerticalOffset(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
            r1.setCutoutState()
        L17:
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            r0.setElevation(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            int r2 = r2.getShadowRadius()
            com.google.android.material.shape.MaterialShapeDrawable r0 = r1.materialShapeDrawable
            int r0 = r0.getShadowOffsetY()
            int r2 = r2 - r0
            com.google.android.material.bottomappbar.BottomAppBar$Behavior r0 = r1.getBehavior()
            r0.setAdditionalHiddenOffsetY(r1, r2)
            return
    }

    public void setFabAlignmentMode(int r2) {
            r1 = this;
            r0 = 0
            r1.setFabAlignmentModeAndReplaceMenu(r2, r0)
            return
    }

    public void setFabAlignmentModeAndReplaceMenu(int r1, int r2) {
            r0 = this;
            r0.pendingMenuResId = r2
            r2 = 1
            r0.menuAnimatingWithFabAlignmentMode = r2
            boolean r2 = r0.fabAttached
            r0.maybeAnimateMenuView(r1, r2)
            r0.maybeAnimateModeChange(r1)
            r0.fabAlignmentMode = r1
            return
    }

    public void setFabAnimationMode(int r1) {
            r0 = this;
            r0.fabAnimationMode = r1
            return
    }

    public void setFabCradleMargin(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleMargin()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabCradleMargin(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
        L14:
            return
    }

    public void setFabCradleRoundedCornerRadius(float r2) {
            r1 = this;
            float r0 = r1.getFabCradleRoundedCornerRadius()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L14
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabCradleRoundedCornerRadius(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
        L14:
            return
    }

    boolean setFabDiameter(int r2) {
            r1 = this;
            float r2 = (float) r2
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            float r0 = r0.getFabDiameter()
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L1b
            com.google.android.material.bottomappbar.BottomAppBarTopEdgeTreatment r0 = r1.getTopEdgeTreatment()
            r0.setFabDiameter(r2)
            com.google.android.material.shape.MaterialShapeDrawable r2 = r1.materialShapeDrawable
            r2.invalidateSelf()
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public void setHideOnScroll(boolean r1) {
            r0 = this;
            r0.hideOnScroll = r1
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(java.lang.CharSequence r1) {
            r0 = this;
            return
    }
}
