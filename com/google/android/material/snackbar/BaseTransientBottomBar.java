package com.google.android.material.snackbar;

import com.google.android.material.snackbar.BaseTransientBottomBar;

/* loaded from: classes.dex */
public abstract class BaseTransientBottomBar<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>> {
    static final int ANIMATION_DURATION = 250;
    static final int ANIMATION_FADE_DURATION = 180;
    private static final int ANIMATION_FADE_IN_DURATION = 150;
    private static final int ANIMATION_FADE_OUT_DURATION = 75;
    public static final int ANIMATION_MODE_FADE = 1;
    public static final int ANIMATION_MODE_SLIDE = 0;
    private static final float ANIMATION_SCALE_FROM_VALUE = 0.8f;
    public static final int LENGTH_INDEFINITE = -2;
    public static final int LENGTH_LONG = 0;
    public static final int LENGTH_SHORT = -1;
    static final int MSG_DISMISS = 1;
    static final int MSG_SHOW = 0;
    private static final int[] SNACKBAR_STYLE_ATTR = null;
    private static final java.lang.String TAG = null;
    private static final boolean USE_OFFSET_API = false;
    static final android.os.Handler handler = null;
    private final android.view.accessibility.AccessibilityManager accessibilityManager;
    private android.view.View anchorView;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener anchorViewLayoutListener;
    private boolean anchorViewLayoutListenerEnabled;
    private com.google.android.material.snackbar.BaseTransientBottomBar.Behavior behavior;
    private final java.lang.Runnable bottomMarginGestureInsetRunnable;
    private java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B>> callbacks;
    private final com.google.android.material.snackbar.ContentViewCallback contentViewCallback;
    private final android.content.Context context;
    private int duration;
    private int extraBottomMarginAnchorView;
    private int extraBottomMarginGestureInset;
    private int extraBottomMarginWindowInset;
    private int extraLeftMarginWindowInset;
    private int extraRightMarginWindowInset;
    private boolean gestureInsetBottomIgnored;
    com.google.android.material.snackbar.SnackbarManager.Callback managerCallback;
    private android.graphics.Rect originalMargins;
    private final android.view.ViewGroup targetParent;
    protected final com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout view;



















    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface AnimationMode {
    }

    public static abstract class BaseCallback<B> {
        public static final int DISMISS_EVENT_ACTION = 1;
        public static final int DISMISS_EVENT_CONSECUTIVE = 4;
        public static final int DISMISS_EVENT_MANUAL = 3;
        public static final int DISMISS_EVENT_SWIPE = 0;
        public static final int DISMISS_EVENT_TIMEOUT = 2;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface DismissEvent {
        }

        public BaseCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onDismissed(B r1, int r2) {
                r0 = this;
                return
        }

        public void onShown(B r1) {
                r0 = this;
                return
        }
    }

    public static class Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
        private final com.google.android.material.snackbar.BaseTransientBottomBar.BehaviorDelegate delegate;

        public Behavior() {
                r1 = this;
                r1.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate
                r0.<init>(r1)
                r1.delegate = r0
                return
        }

        static /* synthetic */ void access$1300(com.google.android.material.snackbar.BaseTransientBottomBar.Behavior r0, com.google.android.material.snackbar.BaseTransientBottomBar r1) {
                r0.setBaseTransientBottomBar(r1)
                return
        }

        private void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> r2) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                r0.setBaseTransientBottomBar(r2)
                return
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean canSwipeDismissView(android.view.View r2) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                boolean r2 = r0.canSwipeDismissView(r2)
                return r2
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.MotionEvent r4) {
                r1 = this;
                com.google.android.material.snackbar.BaseTransientBottomBar$BehaviorDelegate r0 = r1.delegate
                r0.onInterceptTouchEvent(r2, r3, r4)
                boolean r2 = super.onInterceptTouchEvent(r2, r3, r4)
                return r2
        }
    }

    public static class BehaviorDelegate {
        private com.google.android.material.snackbar.SnackbarManager.Callback managerCallback;

        public BehaviorDelegate(com.google.android.material.behavior.SwipeDismissBehavior<?> r2) {
                r1 = this;
                r1.<init>()
                r0 = 1036831949(0x3dcccccd, float:0.1)
                r2.setStartAlphaSwipeDistance(r0)
                r0 = 1058642330(0x3f19999a, float:0.6)
                r2.setEndAlphaSwipeDistance(r0)
                r0 = 0
                r2.setSwipeDirection(r0)
                return
        }

        public boolean canSwipeDismissView(android.view.View r1) {
                r0 = this;
                boolean r1 = r1 instanceof com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout
                return r1
        }

        public void onInterceptTouchEvent(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.MotionEvent r4) {
                r1 = this;
                int r0 = r4.getActionMasked()
                if (r0 == 0) goto L17
                r2 = 1
                if (r0 == r2) goto Ld
                r2 = 3
                if (r0 == r2) goto Ld
                goto L30
            Ld:
                com.google.android.material.snackbar.SnackbarManager r2 = com.google.android.material.snackbar.SnackbarManager.getInstance()
                com.google.android.material.snackbar.SnackbarManager$Callback r3 = r1.managerCallback
                r2.restoreTimeoutIfPaused(r3)
                goto L30
            L17:
                float r0 = r4.getX()
                int r0 = (int) r0
                float r4 = r4.getY()
                int r4 = (int) r4
                boolean r2 = r2.isPointInChildBounds(r3, r0, r4)
                if (r2 == 0) goto L30
                com.google.android.material.snackbar.SnackbarManager r2 = com.google.android.material.snackbar.SnackbarManager.getInstance()
                com.google.android.material.snackbar.SnackbarManager$Callback r3 = r1.managerCallback
                r2.pauseTimeout(r3)
            L30:
                return
        }

        public void setBaseTransientBottomBar(com.google.android.material.snackbar.BaseTransientBottomBar<?> r1) {
                r0 = this;
                com.google.android.material.snackbar.SnackbarManager$Callback r1 = r1.managerCallback
                r0.managerCallback = r1
                return
        }
    }

    @java.lang.Deprecated
    public interface ContentViewCallback extends com.google.android.material.snackbar.ContentViewCallback {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Duration {
    }

    protected interface OnAttachStateChangeListener {
        void onViewAttachedToWindow(android.view.View r1);

        void onViewDetachedFromWindow(android.view.View r1);
    }

    protected interface OnLayoutChangeListener {
        void onLayoutChange(android.view.View r1, int r2, int r3, int r4, int r5);
    }

    protected static class SnackbarBaseLayout extends android.widget.FrameLayout {
        private static final android.view.View.OnTouchListener consumeAllTouchListener = null;
        private final float actionTextColorAlpha;
        private int animationMode;
        private final float backgroundOverlayColorAlpha;
        private android.content.res.ColorStateList backgroundTint;
        private android.graphics.PorterDuff.Mode backgroundTintMode;
        private com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener onAttachStateChangeListener;
        private com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener onLayoutChangeListener;


        static {
                com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout$1
                r0.<init>()
                com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener = r0
                return
        }

        protected SnackbarBaseLayout(android.content.Context r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        protected SnackbarBaseLayout(android.content.Context r3, android.util.AttributeSet r4) {
                r2 = this;
                r0 = 0
                android.content.Context r3 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r3, r4, r0, r0)
                r2.<init>(r3, r4)
                android.content.Context r3 = r2.getContext()
                int[] r1 = com.google.android.material.C0479R.styleable.SnackbarLayout
                android.content.res.TypedArray r4 = r3.obtainStyledAttributes(r4, r1)
                int r1 = com.google.android.material.C0479R.styleable.SnackbarLayout_elevation
                boolean r1 = r4.hasValue(r1)
                if (r1 == 0) goto L24
                int r1 = com.google.android.material.C0479R.styleable.SnackbarLayout_elevation
                int r1 = r4.getDimensionPixelSize(r1, r0)
                float r1 = (float) r1
                androidx.core.view.ViewCompat.setElevation(r2, r1)
            L24:
                int r1 = com.google.android.material.C0479R.styleable.SnackbarLayout_animationMode
                int r0 = r4.getInt(r1, r0)
                r2.animationMode = r0
                int r0 = com.google.android.material.C0479R.styleable.SnackbarLayout_backgroundOverlayColorAlpha
                r1 = 1065353216(0x3f800000, float:1.0)
                float r0 = r4.getFloat(r0, r1)
                r2.backgroundOverlayColorAlpha = r0
                int r0 = com.google.android.material.C0479R.styleable.SnackbarLayout_backgroundTint
                android.content.res.ColorStateList r3 = com.google.android.material.resources.MaterialResources.getColorStateList(r3, r4, r0)
                r2.setBackgroundTintList(r3)
                int r3 = com.google.android.material.C0479R.styleable.SnackbarLayout_backgroundTintMode
                r0 = -1
                int r3 = r4.getInt(r3, r0)
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
                android.graphics.PorterDuff$Mode r3 = com.google.android.material.internal.ViewUtils.parseTintMode(r3, r0)
                r2.setBackgroundTintMode(r3)
                int r3 = com.google.android.material.C0479R.styleable.SnackbarLayout_actionTextColorAlpha
                float r3 = r4.getFloat(r3, r1)
                r2.actionTextColorAlpha = r3
                r4.recycle()
                android.view.View$OnTouchListener r3 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener
                r2.setOnTouchListener(r3)
                r3 = 1
                r2.setFocusable(r3)
                android.graphics.drawable.Drawable r3 = r2.getBackground()
                if (r3 != 0) goto L70
                android.graphics.drawable.Drawable r3 = r2.createThemedBackground()
                androidx.core.view.ViewCompat.setBackground(r2, r3)
            L70:
                return
        }

        private android.graphics.drawable.Drawable createThemedBackground() {
                r4 = this;
                android.content.res.Resources r0 = r4.getResources()
                int r1 = com.google.android.material.C0479R.dimen.mtrl_snackbar_background_corner_radius
                float r0 = r0.getDimension(r1)
                android.graphics.drawable.GradientDrawable r1 = new android.graphics.drawable.GradientDrawable
                r1.<init>()
                r2 = 0
                r1.setShape(r2)
                r1.setCornerRadius(r0)
                int r0 = com.google.android.material.C0479R.attr.colorSurface
                int r2 = com.google.android.material.C0479R.attr.colorOnSurface
                float r3 = r4.getBackgroundOverlayColorAlpha()
                int r0 = com.google.android.material.color.MaterialColors.layer(r4, r0, r2, r3)
                r1.setColor(r0)
                android.content.res.ColorStateList r0 = r4.backgroundTint
                if (r0 == 0) goto L33
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r1)
                android.content.res.ColorStateList r1 = r4.backgroundTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
                return r0
            L33:
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r1)
                return r0
        }

        float getActionTextColorAlpha() {
                r1 = this;
                float r0 = r1.actionTextColorAlpha
                return r0
        }

        int getAnimationMode() {
                r1 = this;
                int r0 = r1.animationMode
                return r0
        }

        float getBackgroundOverlayColorAlpha() {
                r1 = this;
                float r0 = r1.backgroundOverlayColorAlpha
                return r0
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
                r1 = this;
                super.onAttachedToWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar$OnAttachStateChangeListener r0 = r1.onAttachStateChangeListener
                if (r0 == 0) goto La
                r0.onViewAttachedToWindow(r1)
            La:
                androidx.core.view.ViewCompat.requestApplyInsets(r1)
                return
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
                r1 = this;
                super.onDetachedFromWindow()
                com.google.android.material.snackbar.BaseTransientBottomBar$OnAttachStateChangeListener r0 = r1.onAttachStateChangeListener
                if (r0 == 0) goto La
                r0.onViewDetachedFromWindow(r1)
            La:
                return
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean r7, int r8, int r9, int r10, int r11) {
                r6 = this;
                super.onLayout(r7, r8, r9, r10, r11)
                com.google.android.material.snackbar.BaseTransientBottomBar$OnLayoutChangeListener r0 = r6.onLayoutChangeListener
                if (r0 == 0) goto Lf
                r1 = r6
                r2 = r8
                r3 = r9
                r4 = r10
                r5 = r11
                r0.onLayoutChange(r1, r2, r3, r4, r5)
            Lf:
                return
        }

        void setAnimationMode(int r1) {
                r0 = this;
                r0.animationMode = r1
                return
        }

        @Override // android.view.View
        public void setBackground(android.graphics.drawable.Drawable r1) {
                r0 = this;
                r0.setBackgroundDrawable(r1)
                return
        }

        @Override // android.view.View
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                if (r2 == 0) goto L18
                android.content.res.ColorStateList r0 = r1.backgroundTint
                if (r0 == 0) goto L18
                android.graphics.drawable.Drawable r2 = r2.mutate()
                android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
                android.content.res.ColorStateList r0 = r1.backgroundTint
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
                android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r0)
            L18:
                super.setBackgroundDrawable(r2)
                return
        }

        @Override // android.view.View
        public void setBackgroundTintList(android.content.res.ColorStateList r2) {
                r1 = this;
                r1.backgroundTint = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L25
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
                android.graphics.PorterDuff$Mode r2 = r1.backgroundTintMode
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L25
                super.setBackgroundDrawable(r0)
            L25:
                return
        }

        @Override // android.view.View
        public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
                r1 = this;
                r1.backgroundTintMode = r2
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                if (r0 == 0) goto L20
                android.graphics.drawable.Drawable r0 = r1.getBackground()
                android.graphics.drawable.Drawable r0 = r0.mutate()
                android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
                androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r2)
                android.graphics.drawable.Drawable r2 = r1.getBackground()
                if (r0 == r2) goto L20
                super.setBackgroundDrawable(r0)
            L20:
                return
        }

        void setOnAttachStateChangeListener(com.google.android.material.snackbar.BaseTransientBottomBar.OnAttachStateChangeListener r1) {
                r0 = this;
                r0.onAttachStateChangeListener = r1
                return
        }

        @Override // android.view.View
        public void setOnClickListener(android.view.View.OnClickListener r2) {
                r1 = this;
                if (r2 == 0) goto L4
                r0 = 0
                goto L6
            L4:
                android.view.View$OnTouchListener r0 = com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout.consumeAllTouchListener
            L6:
                r1.setOnTouchListener(r0)
                super.setOnClickListener(r2)
                return
        }

        void setOnLayoutChangeListener(com.google.android.material.snackbar.BaseTransientBottomBar.OnLayoutChangeListener r1) {
                r0 = this;
                r0.onLayoutChangeListener = r1
                return
        }
    }

    static {
            r0 = 0
            com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API = r0
            r1 = 1
            int[] r1 = new int[r1]
            int r2 = com.google.android.material.C0479R.attr.snackbarStyle
            r1[r0] = r2
            com.google.android.material.snackbar.BaseTransientBottomBar.SNACKBAR_STYLE_ATTR = r1
            java.lang.String r0 = "BaseTransientBottomBar"
            com.google.android.material.snackbar.BaseTransientBottomBar.TAG = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            com.google.android.material.snackbar.BaseTransientBottomBar$1 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$1
            r2.<init>()
            r0.<init>(r1, r2)
            com.google.android.material.snackbar.BaseTransientBottomBar.handler = r0
            return
    }

    protected BaseTransientBottomBar(android.content.Context r4, android.view.ViewGroup r5, android.view.View r6, com.google.android.material.snackbar.ContentViewCallback r7) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.anchorViewLayoutListenerEnabled = r0
            com.google.android.material.snackbar.BaseTransientBottomBar$2 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$2
            r1.<init>(r3)
            r3.anchorViewLayoutListener = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$3 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$3
            r1.<init>(r3)
            r3.bottomMarginGestureInsetRunnable = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$6 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$6
            r1.<init>(r3)
            r3.managerCallback = r1
            if (r5 == 0) goto L99
            if (r6 == 0) goto L91
            if (r7 == 0) goto L89
            r3.targetParent = r5
            r3.contentViewCallback = r7
            r3.context = r4
            com.google.android.material.internal.ThemeEnforcement.checkAppCompatTheme(r4)
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r4)
            int r1 = r3.getSnackbarBaseLayoutResId()
            android.view.View r5 = r7.inflate(r1, r5, r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r5 = (com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout) r5
            r3.view = r5
            boolean r7 = r6 instanceof com.google.android.material.snackbar.SnackbarContentLayout
            if (r7 == 0) goto L48
            r7 = r6
            com.google.android.material.snackbar.SnackbarContentLayout r7 = (com.google.android.material.snackbar.SnackbarContentLayout) r7
            float r0 = r5.getActionTextColorAlpha()
            r7.updateActionTextColorAlphaIfNeeded(r0)
        L48:
            r5.addView(r6)
            android.view.ViewGroup$LayoutParams r6 = r5.getLayoutParams()
            boolean r7 = r6 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r7 == 0) goto L64
            android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            android.graphics.Rect r7 = new android.graphics.Rect
            int r0 = r6.leftMargin
            int r1 = r6.topMargin
            int r2 = r6.rightMargin
            int r6 = r6.bottomMargin
            r7.<init>(r0, r1, r2, r6)
            r3.originalMargins = r7
        L64:
            r6 = 1
            androidx.core.view.ViewCompat.setAccessibilityLiveRegion(r5, r6)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r5, r6)
            androidx.core.view.ViewCompat.setFitsSystemWindows(r5, r6)
            com.google.android.material.snackbar.BaseTransientBottomBar$4 r6 = new com.google.android.material.snackbar.BaseTransientBottomBar$4
            r6.<init>(r3)
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r6)
            com.google.android.material.snackbar.BaseTransientBottomBar$5 r6 = new com.google.android.material.snackbar.BaseTransientBottomBar$5
            r6.<init>(r3)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r5, r6)
            java.lang.String r5 = "accessibility"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            r3.accessibilityManager = r4
            return
        L89:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Transient bottom bar must have non-null callback"
            r4.<init>(r5)
            throw r4
        L91:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Transient bottom bar must have non-null content"
            r4.<init>(r5)
            throw r4
        L99:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Transient bottom bar must have non-null parent"
            r4.<init>(r5)
            throw r4
    }

    protected BaseTransientBottomBar(android.view.ViewGroup r2, android.view.View r3, com.google.android.material.snackbar.ContentViewCallback r4) {
            r1 = this;
            android.content.Context r0 = r2.getContext()
            r1.<init>(r0, r2, r3, r4)
            return
    }

    static /* synthetic */ boolean access$000(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            boolean r0 = r0.anchorViewLayoutListenerEnabled
            return r0
    }

    static /* synthetic */ int access$1002(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraLeftMarginWindowInset = r1
            return r1
    }

    static /* synthetic */ int access$102(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraBottomMarginAnchorView = r1
            return r1
    }

    static /* synthetic */ int access$1102(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraRightMarginWindowInset = r1
            return r1
    }

    static /* synthetic */ void access$1200(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.showViewImpl()
            return
    }

    static /* synthetic */ void access$1400(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.startFadeInAnimation()
            return
    }

    static /* synthetic */ void access$1500(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.startSlideInAnimation()
            return
    }

    static /* synthetic */ com.google.android.material.snackbar.ContentViewCallback access$1600(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            com.google.android.material.snackbar.ContentViewCallback r0 = r0.contentViewCallback
            return r0
    }

    static /* synthetic */ boolean access$1700() {
            boolean r0 = com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API
            return r0
    }

    static /* synthetic */ int access$200(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.calculateBottomMarginForAnchorView()
            return r0
    }

    static /* synthetic */ void access$300(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            r0.updateMargins()
            return
    }

    static /* synthetic */ android.content.Context access$400(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            android.content.Context r0 = r0.context
            return r0
    }

    static /* synthetic */ int access$500(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.getScreenHeight()
            return r0
    }

    static /* synthetic */ int access$600(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.getViewAbsoluteBottom()
            return r0
    }

    static /* synthetic */ int access$700(com.google.android.material.snackbar.BaseTransientBottomBar r0) {
            int r0 = r0.extraBottomMarginGestureInset
            return r0
    }

    static /* synthetic */ int access$702(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraBottomMarginGestureInset = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$800() {
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.TAG
            return r0
    }

    static /* synthetic */ int access$902(com.google.android.material.snackbar.BaseTransientBottomBar r0, int r1) {
            r0.extraBottomMarginWindowInset = r1
            return r1
    }

    private void animateViewOut(int r3) {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            int r0 = r0.getAnimationMode()
            r1 = 1
            if (r0 != r1) goto Ld
            r2.startFadeOutAnimation(r3)
            goto L10
        Ld:
            r2.startSlideOutAnimation(r3)
        L10:
            return
    }

    private int calculateBottomMarginForAnchorView() {
            r4 = this;
            android.view.View r0 = r4.anchorView
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            r1 = 2
            int[] r2 = new int[r1]
            r0.getLocationOnScreen(r2)
            r0 = 1
            r2 = r2[r0]
            int[] r1 = new int[r1]
            android.view.ViewGroup r3 = r4.targetParent
            r3.getLocationOnScreen(r1)
            r0 = r1[r0]
            android.view.ViewGroup r1 = r4.targetParent
            int r1 = r1.getHeight()
            int r0 = r0 + r1
            int r0 = r0 - r2
            return r0
    }

    private android.animation.ValueAnimator getAlphaAnimator(float... r2) {
            r1 = this;
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_INTERPOLATOR
            r2.setInterpolator(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$13 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$13
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            return r2
    }

    private android.animation.ValueAnimator getScaleAnimator(float... r2) {
            r1 = this;
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r2)
            android.animation.TimeInterpolator r0 = com.google.android.material.animation.AnimationUtils.LINEAR_OUT_SLOW_IN_INTERPOLATOR
            r2.setInterpolator(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$14 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$14
            r0.<init>(r1)
            r2.addUpdateListener(r0)
            return r2
    }

    private int getScreenHeight() {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getRealMetrics(r1)
            int r0 = r1.heightPixels
            return r0
    }

    private int getTranslationYBottom() {
            r3 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            int r0 = r0.getHeight()
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r3.view
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            boolean r2 = r1 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r2 == 0) goto L15
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r1 = r1.bottomMargin
            int r0 = r0 + r1
        L15:
            return r0
    }

    private int getViewAbsoluteBottom() {
            r2 = this;
            r0 = 2
            int[] r0 = new int[r0]
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r2.view
            r1.getLocationOnScreen(r0)
            r1 = 1
            r0 = r0[r1]
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r2.view
            int r1 = r1.getHeight()
            int r0 = r0 + r1
            return r0
    }

    private boolean isSwipeDismissable() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L16
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.getBehavior()
            boolean r0 = r0 instanceof com.google.android.material.behavior.SwipeDismissBehavior
            if (r0 == 0) goto L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            return r0
    }

    private void setUpBehavior(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r3) {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = r2.behavior
            if (r0 != 0) goto L8
            com.google.android.material.behavior.SwipeDismissBehavior r0 = r2.getNewBehavior()
        L8:
            boolean r1 = r0 instanceof com.google.android.material.snackbar.BaseTransientBottomBar.Behavior
            if (r1 == 0) goto L12
            r1 = r0
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.Behavior) r1
            com.google.android.material.snackbar.BaseTransientBottomBar.Behavior.access$1300(r1, r2)
        L12:
            com.google.android.material.snackbar.BaseTransientBottomBar$9 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$9
            r1.<init>(r2)
            r0.setListener(r1)
            r3.setBehavior(r0)
            android.view.View r0 = r2.anchorView
            if (r0 != 0) goto L25
            r0 = 80
            r3.insetEdge = r0
        L25:
            return
    }

    private boolean shouldUpdateGestureInset() {
            r1 = this;
            int r0 = r1.extraBottomMarginGestureInset
            if (r0 <= 0) goto L10
            boolean r0 = r1.gestureInsetBottomIgnored
            if (r0 != 0) goto L10
            boolean r0 = r1.isSwipeDismissable()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    private void showViewImpl() {
            r2 = this;
            boolean r0 = r2.shouldAnimate()
            if (r0 == 0) goto La
            r2.animateViewIn()
            goto L1b
        La:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L18
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r1 = 0
            r0.setVisibility(r1)
        L18:
            r2.onViewShown()
        L1b:
            return
    }

    private void startFadeInAnimation() {
            r5 = this;
            r0 = 2
            float[] r1 = new float[r0]
            r1 = {x0034: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r1 = r5.getAlphaAnimator(r1)
            float[] r2 = new float[r0]
            r2 = {x003c: FILL_ARRAY_DATA , data: [1061997773, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = r5.getScaleAnimator(r2)
            android.animation.AnimatorSet r3 = new android.animation.AnimatorSet
            r3.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r4 = 0
            r0[r4] = r1
            r1 = 1
            r0[r1] = r2
            r3.playTogether(r0)
            r0 = 150(0x96, double:7.4E-322)
            r3.setDuration(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$11 r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$11
            r0.<init>(r5)
            r3.addListener(r0)
            r3.start()
            return
    }

    private void startFadeOutAnimation(int r4) {
            r3 = this;
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [1065353216, 0} // fill-array
            android.animation.ValueAnimator r0 = r3.getAlphaAnimator(r0)
            r1 = 75
            r0.setDuration(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$12 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$12
            r1.<init>(r3, r4)
            r0.addListener(r1)
            r0.start()
            return
    }

    private void startSlideInAnimation() {
            r5 = this;
            int r0 = r5.getTranslationYBottom()
            boolean r1 = com.google.android.material.snackbar.BaseTransientBottomBar.USE_OFFSET_API
            if (r1 == 0) goto Le
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r5.view
            androidx.core.view.ViewCompat.offsetTopAndBottom(r1, r0)
            goto L14
        Le:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r5.view
            float r2 = (float) r0
            r1.setTranslationY(r2)
        L14:
            android.animation.ValueAnimator r1 = new android.animation.ValueAnimator
            r1.<init>()
            r2 = 2
            int[] r2 = new int[r2]
            r3 = 0
            r2[r3] = r0
            r4 = 1
            r2[r4] = r3
            r1.setIntValues(r2)
            android.animation.TimeInterpolator r2 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r1.setInterpolator(r2)
            r2 = 250(0xfa, double:1.235E-321)
            r1.setDuration(r2)
            com.google.android.material.snackbar.BaseTransientBottomBar$15 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$15
            r2.<init>(r5)
            r1.addListener(r2)
            com.google.android.material.snackbar.BaseTransientBottomBar$16 r2 = new com.google.android.material.snackbar.BaseTransientBottomBar$16
            r2.<init>(r5, r0)
            r1.addUpdateListener(r2)
            r1.start()
            return
    }

    private void startSlideOutAnimation(int r5) {
            r4 = this;
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            r1 = 2
            int[] r1 = new int[r1]
            r2 = 0
            r1[r2] = r2
            r2 = 1
            int r3 = r4.getTranslationYBottom()
            r1[r2] = r3
            r0.setIntValues(r1)
            android.animation.TimeInterpolator r1 = com.google.android.material.animation.AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR
            r0.setInterpolator(r1)
            r1 = 250(0xfa, double:1.235E-321)
            r0.setDuration(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$17 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$17
            r1.<init>(r4, r5)
            r0.addListener(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$18 r5 = new com.google.android.material.snackbar.BaseTransientBottomBar$18
            r5.<init>(r4)
            r0.addUpdateListener(r5)
            r0.start()
            return
    }

    private void updateMargins() {
            r3 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r1 == 0) goto L51
            android.graphics.Rect r1 = r3.originalMargins
            if (r1 != 0) goto Lf
            goto L51
        Lf:
            android.view.View r2 = r3.anchorView
            if (r2 == 0) goto L16
            int r2 = r3.extraBottomMarginAnchorView
            goto L18
        L16:
            int r2 = r3.extraBottomMarginWindowInset
        L18:
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r1.bottom
            int r1 = r1 + r2
            r0.bottomMargin = r1
            android.graphics.Rect r1 = r3.originalMargins
            int r1 = r1.left
            int r2 = r3.extraLeftMarginWindowInset
            int r1 = r1 + r2
            r0.leftMargin = r1
            android.graphics.Rect r1 = r3.originalMargins
            int r1 = r1.right
            int r2 = r3.extraRightMarginWindowInset
            int r1 = r1 + r2
            r0.rightMargin = r1
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            r0.requestLayout()
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L50
            boolean r0 = r3.shouldUpdateGestureInset()
            if (r0 == 0) goto L50
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            java.lang.Runnable r1 = r3.bottomMarginGestureInsetRunnable
            r0.removeCallbacks(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r3.view
            java.lang.Runnable r1 = r3.bottomMarginGestureInsetRunnable
            r0.post(r1)
        L50:
            return
        L51:
            java.lang.String r0 = com.google.android.material.snackbar.BaseTransientBottomBar.TAG
            java.lang.String r1 = "Unable to update margins because layout params are not MarginLayoutParams"
            android.util.Log.w(r0, r1)
            return
    }

    public B addCallback(com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            if (r0 != 0) goto Le
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.callbacks = r0
        Le:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            r0.add(r2)
            return r1
    }

    void animateViewIn() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            com.google.android.material.snackbar.BaseTransientBottomBar$10 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$10
            r1.<init>(r2)
            r0.post(r1)
            return
    }

    public void dismiss() {
            r1 = this;
            r0 = 3
            r1.dispatchDismiss(r0)
            return
    }

    protected void dispatchDismiss(int r3) {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.dismiss(r1, r3)
            return
    }

    public android.view.View getAnchorView() {
            r1 = this;
            android.view.View r0 = r1.anchorView
            return r0
    }

    public int getAnimationMode() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            int r0 = r0.getAnimationMode()
            return r0
    }

    public com.google.android.material.snackbar.BaseTransientBottomBar.Behavior getBehavior() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = r1.behavior
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.context
            return r0
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.duration
            return r0
    }

    protected com.google.android.material.behavior.SwipeDismissBehavior<? extends android.view.View> getNewBehavior() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$Behavior r0 = new com.google.android.material.snackbar.BaseTransientBottomBar$Behavior
            r0.<init>()
            return r0
    }

    protected int getSnackbarBaseLayoutResId() {
            r1 = this;
            boolean r0 = r1.hasSnackbarStyleAttr()
            if (r0 == 0) goto L9
            int r0 = com.google.android.material.C0479R.layout.mtrl_layout_snackbar
            goto Lb
        L9:
            int r0 = com.google.android.material.C0479R.layout.design_layout_snackbar
        Lb:
            return r0
    }

    public android.view.View getView() {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            return r0
    }

    protected boolean hasSnackbarStyleAttr() {
            r4 = this;
            android.content.Context r0 = r4.context
            int[] r1 = com.google.android.material.snackbar.BaseTransientBottomBar.SNACKBAR_STYLE_ATTR
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 0
            r2 = -1
            int r3 = r0.getResourceId(r1, r2)
            r0.recycle()
            if (r3 == r2) goto L14
            r1 = 1
        L14:
            return r1
    }

    final void hideView(int r2) {
            r1 = this;
            boolean r0 = r1.shouldAnimate()
            if (r0 == 0) goto L12
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L12
            r1.animateViewOut(r2)
            goto L15
        L12:
            r1.onViewHidden(r2)
        L15:
            return
    }

    public boolean isAnchorViewLayoutListenerEnabled() {
            r1 = this;
            boolean r0 = r1.anchorViewLayoutListenerEnabled
            return r0
    }

    public boolean isGestureInsetBottomIgnored() {
            r1 = this;
            boolean r0 = r1.gestureInsetBottomIgnored
            return r0
    }

    public boolean isShown() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            boolean r0 = r0.isCurrent(r1)
            return r0
    }

    public boolean isShownOrQueued() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            boolean r0 = r0.isCurrentOrNext(r1)
            return r0
    }

    void onViewHidden(int r3) {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.onDismissed(r1)
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r2.callbacks
            if (r0 == 0) goto L23
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L23
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r1 = r2.callbacks
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback) r1
            r1.onDismissed(r2, r3)
            int r0 = r0 + (-1)
            goto L13
        L23:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r3 = r2.view
            android.view.ViewParent r3 = r3.getParent()
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L34
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r3.removeView(r0)
        L34:
            return
    }

    void onViewShown() {
            r2 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            com.google.android.material.snackbar.SnackbarManager$Callback r1 = r2.managerCallback
            r0.onShown(r1)
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r2.callbacks
            if (r0 == 0) goto L23
            int r0 = r0.size()
            int r0 = r0 + (-1)
        L13:
            if (r0 < 0) goto L23
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r1 = r2.callbacks
            java.lang.Object r1 = r1.get(r0)
            com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback r1 = (com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback) r1
            r1.onShown(r2)
            int r0 = r0 + (-1)
            goto L13
        L23:
            return
    }

    public B removeCallback(com.google.android.material.snackbar.BaseTransientBottomBar.BaseCallback<B> r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            java.util.List<com.google.android.material.snackbar.BaseTransientBottomBar$BaseCallback<B extends com.google.android.material.snackbar.BaseTransientBottomBar<B>>> r0 = r1.callbacks
            if (r0 != 0) goto L8
            return r1
        L8:
            r0.remove(r2)
            return r1
    }

    public B setAnchorView(int r4) {
            r3 = this;
            android.view.ViewGroup r0 = r3.targetParent
            android.view.View r0 = r0.findViewById(r4)
            if (r0 == 0) goto Ld
            com.google.android.material.snackbar.BaseTransientBottomBar r4 = r3.setAnchorView(r0)
            return r4
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to find anchor view with id: "
            r1.<init>(r2)
            java.lang.StringBuilder r4 = r1.append(r4)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    public B setAnchorView(android.view.View r3) {
            r2 = this;
            android.view.View r0 = r2.anchorView
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.anchorViewLayoutListener
            com.google.android.material.internal.ViewUtils.removeOnGlobalLayoutListener(r0, r1)
            r2.anchorView = r3
            android.view.ViewTreeObserver$OnGlobalLayoutListener r0 = r2.anchorViewLayoutListener
            com.google.android.material.internal.ViewUtils.addOnGlobalLayoutListener(r3, r0)
            return r2
    }

    public void setAnchorViewLayoutListenerEnabled(boolean r1) {
            r0 = this;
            r0.anchorViewLayoutListenerEnabled = r1
            return
    }

    public B setAnimationMode(int r2) {
            r1 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r1.view
            r0.setAnimationMode(r2)
            return r1
    }

    public B setBehavior(com.google.android.material.snackbar.BaseTransientBottomBar.Behavior r1) {
            r0 = this;
            r0.behavior = r1
            return r0
    }

    public B setDuration(int r1) {
            r0 = this;
            r0.duration = r1
            return r0
    }

    public B setGestureInsetBottomIgnored(boolean r1) {
            r0 = this;
            r0.gestureInsetBottomIgnored = r1
            return r0
    }

    boolean shouldAnimate() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.accessibilityManager
            r1 = 1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.util.List r0 = r0.getEnabledAccessibilityServiceList(r1)
            if (r0 == 0) goto L13
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    public void show() {
            r3 = this;
            com.google.android.material.snackbar.SnackbarManager r0 = com.google.android.material.snackbar.SnackbarManager.getInstance()
            int r1 = r3.getDuration()
            com.google.android.material.snackbar.SnackbarManager$Callback r2 = r3.managerCallback
            r0.show(r1, r2)
            return
    }

    final void showView() {
            r2 = this;
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            com.google.android.material.snackbar.BaseTransientBottomBar$7 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$7
            r1.<init>(r2)
            r0.setOnAttachStateChangeListener(r1)
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L37
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            boolean r1 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams
            if (r1 == 0) goto L21
            androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
            r2.setUpBehavior(r0)
        L21:
            int r0 = r2.calculateBottomMarginForAnchorView()
            r2.extraBottomMarginAnchorView = r0
            r2.updateMargins()
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            r1 = 4
            r0.setVisibility(r1)
            android.view.ViewGroup r0 = r2.targetParent
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r1 = r2.view
            r0.addView(r1)
        L37:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r0)
            if (r0 == 0) goto L43
            r2.showViewImpl()
            return
        L43:
            com.google.android.material.snackbar.BaseTransientBottomBar$SnackbarBaseLayout r0 = r2.view
            com.google.android.material.snackbar.BaseTransientBottomBar$8 r1 = new com.google.android.material.snackbar.BaseTransientBottomBar$8
            r1.<init>(r2)
            r0.setOnLayoutChangeListener(r1)
            return
    }
}
