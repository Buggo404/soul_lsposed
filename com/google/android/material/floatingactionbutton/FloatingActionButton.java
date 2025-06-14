package com.google.android.material.floatingactionbutton;

/* loaded from: classes.dex */
public class FloatingActionButton extends com.google.android.material.internal.VisibilityAwareImageButton implements androidx.core.view.TintableBackgroundView, androidx.core.widget.TintableImageSourceView, com.google.android.material.expandable.ExpandableTransformationWidget, com.google.android.material.shape.Shapeable, androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior {
    private static final int AUTO_MINI_LARGEST_SCREEN_WIDTH = 470;
    private static final int DEF_STYLE_RES = 0;
    private static final java.lang.String EXPANDABLE_WIDGET_HELPER_KEY = "expandableWidgetHelper";
    private static final java.lang.String LOG_TAG = "FloatingActionButton";
    public static final int NO_CUSTOM_SIZE = 0;
    public static final int SIZE_AUTO = -1;
    public static final int SIZE_MINI = 1;
    public static final int SIZE_NORMAL = 0;
    private android.content.res.ColorStateList backgroundTint;
    private android.graphics.PorterDuff.Mode backgroundTintMode;
    private int borderWidth;
    boolean compatPadding;
    private int customSize;
    private final com.google.android.material.expandable.ExpandableWidgetHelper expandableWidgetHelper;
    private final androidx.appcompat.widget.AppCompatImageHelper imageHelper;
    private android.graphics.PorterDuff.Mode imageMode;
    private int imagePadding;
    private android.content.res.ColorStateList imageTint;
    private com.google.android.material.floatingactionbutton.FloatingActionButtonImpl impl;
    private int maxImageSize;
    private android.content.res.ColorStateList rippleColor;
    final android.graphics.Rect shadowPadding;
    private int size;
    private final android.graphics.Rect touchArea;


    protected static class BaseBehavior<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<T> {
        private static final boolean AUTO_HIDE_DEFAULT = true;
        private boolean autoHideEnabled;
        private com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener internalAutoHideListener;
        private android.graphics.Rect tmpRect;

        public BaseBehavior() {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.autoHideEnabled = r0
                return
        }

        public BaseBehavior(android.content.Context r2, android.util.AttributeSet r3) {
                r1 = this;
                r1.<init>(r2, r3)
                int[] r0 = com.google.android.material.C0479R.styleable.FloatingActionButton_Behavior_Layout
                android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r0)
                int r3 = com.google.android.material.C0479R.styleable.FloatingActionButton_Behavior_Layout_behavior_autoHide
                r0 = 1
                boolean r3 = r2.getBoolean(r3, r0)
                r1.autoHideEnabled = r3
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

        private void offsetIfNeeded(androidx.coordinatorlayout.widget.CoordinatorLayout r7, com.google.android.material.floatingactionbutton.FloatingActionButton r8) {
                r6 = this;
                android.graphics.Rect r0 = r8.shadowPadding
                if (r0 == 0) goto L59
                int r1 = r0.centerX()
                if (r1 <= 0) goto L59
                int r1 = r0.centerY()
                if (r1 <= 0) goto L59
                android.view.ViewGroup$LayoutParams r1 = r8.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r1 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r1
                int r2 = r8.getRight()
                int r3 = r7.getWidth()
                int r4 = r1.rightMargin
                int r3 = r3 - r4
                r4 = 0
                if (r2 < r3) goto L27
                int r2 = r0.right
                goto L34
            L27:
                int r2 = r8.getLeft()
                int r3 = r1.leftMargin
                if (r2 > r3) goto L33
                int r2 = r0.left
                int r2 = -r2
                goto L34
            L33:
                r2 = r4
            L34:
                int r3 = r8.getBottom()
                int r7 = r7.getHeight()
                int r5 = r1.bottomMargin
                int r7 = r7 - r5
                if (r3 < r7) goto L44
                int r4 = r0.bottom
                goto L4f
            L44:
                int r7 = r8.getTop()
                int r1 = r1.topMargin
                if (r7 > r1) goto L4f
                int r7 = r0.top
                int r4 = -r7
            L4f:
                if (r4 == 0) goto L54
                androidx.core.view.ViewCompat.offsetTopAndBottom(r8, r4)
            L54:
                if (r2 == 0) goto L59
                androidx.core.view.ViewCompat.offsetLeftAndRight(r8, r2)
            L59:
                return
        }

        private boolean shouldUpdateVisibility(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                boolean r1 = r3.autoHideEnabled
                r2 = 0
                if (r1 != 0) goto Lc
                return r2
            Lc:
                int r0 = r0.getAnchorId()
                int r4 = r4.getId()
                if (r0 == r4) goto L17
                return r2
            L17:
                int r4 = r5.getUserSetVisibility()
                if (r4 == 0) goto L1e
                return r2
            L1e:
                r4 = 1
                return r4
        }

        private boolean updateFabVisibilityForAppBarLayout(androidx.coordinatorlayout.widget.CoordinatorLayout r3, com.google.android.material.appbar.AppBarLayout r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r2 = this;
                boolean r0 = r2.shouldUpdateVisibility(r4, r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.graphics.Rect r0 = r2.tmpRect
                if (r0 != 0) goto L13
                android.graphics.Rect r0 = new android.graphics.Rect
                r0.<init>()
                r2.tmpRect = r0
            L13:
                android.graphics.Rect r0 = r2.tmpRect
                com.google.android.material.internal.DescendantOffsetUtils.getDescendantRect(r3, r4, r0)
                int r3 = r0.bottom
                int r4 = r4.getMinimumHeightForVisibleOverlappingContent()
                if (r3 > r4) goto L26
                com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener r3 = r2.internalAutoHideListener
                r5.hide(r3, r1)
                goto L2b
            L26:
                com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener r3 = r2.internalAutoHideListener
                r5.show(r3, r1)
            L2b:
                r3 = 1
                return r3
        }

        private boolean updateFabVisibilityForBottomSheet(android.view.View r4, com.google.android.material.floatingactionbutton.FloatingActionButton r5) {
                r3 = this;
                boolean r0 = r3.shouldUpdateVisibility(r4, r5)
                r1 = 0
                if (r0 != 0) goto L8
                return r1
            L8:
                android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
                androidx.coordinatorlayout.widget.CoordinatorLayout$LayoutParams r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams) r0
                int r4 = r4.getTop()
                int r2 = r5.getHeight()
                int r2 = r2 / 2
                int r0 = r0.topMargin
                int r2 = r2 + r0
                if (r4 >= r2) goto L23
                com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener r4 = r3.internalAutoHideListener
                r5.hide(r4, r1)
                goto L28
            L23:
                com.google.android.material.floatingactionbutton.FloatingActionButton$OnVisibilityChangedListener r4 = r3.internalAutoHideListener
                r5.show(r4, r1)
            L28:
                r4 = 1
                return r4
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r1, android.view.View r2, android.graphics.Rect r3) {
                r0 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        public boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r5, com.google.android.material.floatingactionbutton.FloatingActionButton r6, android.graphics.Rect r7) {
                r4 = this;
                android.graphics.Rect r5 = r6.shadowPadding
                int r0 = r6.getLeft()
                int r1 = r5.left
                int r0 = r0 + r1
                int r1 = r6.getTop()
                int r2 = r5.top
                int r1 = r1 + r2
                int r2 = r6.getRight()
                int r3 = r5.right
                int r2 = r2 - r3
                int r6 = r6.getBottom()
                int r5 = r5.bottom
                int r6 = r6 - r5
                r7.set(r0, r1, r2, r6)
                r5 = 1
                return r5
        }

        public boolean isAutoHideEnabled() {
                r1 = this;
                boolean r0 = r1.autoHideEnabled
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
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        public boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r2, com.google.android.material.floatingactionbutton.FloatingActionButton r3, android.view.View r4) {
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
                com.google.android.material.floatingactionbutton.FloatingActionButton r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton) r2
                boolean r1 = r0.onLayoutChild(r1, r2, r3)
                return r1
        }

        public boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r6, com.google.android.material.floatingactionbutton.FloatingActionButton r7, int r8) {
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
                r5.offsetIfNeeded(r6, r7)
                r6 = 1
                return r6
        }

        public void setAutoHideEnabled(boolean r1) {
                r0 = this;
                r0.autoHideEnabled = r1
                return
        }

        public void setInternalAutoHideListener(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r1) {
                r0 = this;
                r0.internalAutoHideListener = r1
                return
        }
    }

    public static class Behavior extends com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior<com.google.android.material.floatingactionbutton.FloatingActionButton> {
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

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean getInsetDodgeRect(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.floatingactionbutton.FloatingActionButton r2, android.graphics.Rect r3) {
                r0 = this;
                boolean r1 = super.getInsetDodgeRect(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean isAutoHideEnabled() {
                r1 = this;
                boolean r0 = super.isAutoHideEnabled()
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public /* bridge */ /* synthetic */ void onAttachedToLayoutParams(androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams r1) {
                r0 = this;
                super.onAttachedToLayoutParams(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onDependentViewChanged(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.floatingactionbutton.FloatingActionButton r2, android.view.View r3) {
                r0 = this;
                boolean r1 = super.onDependentViewChanged(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean onLayoutChild(androidx.coordinatorlayout.widget.CoordinatorLayout r1, com.google.android.material.floatingactionbutton.FloatingActionButton r2, int r3) {
                r0 = this;
                boolean r1 = super.onLayoutChild(r1, r2, r3)
                return r1
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setAutoHideEnabled(boolean r1) {
                r0 = this;
                super.setAutoHideEnabled(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void setInternalAutoHideListener(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r1) {
                r0 = this;
                super.setInternalAutoHideListener(r1)
                return
        }
    }

    public static abstract class OnVisibilityChangedListener {
        public OnVisibilityChangedListener() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onHidden(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                return
        }

        public void onShown(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                return
        }
    }

    private class ShadowDelegateImpl implements com.google.android.material.shadow.ShadowViewDelegate {
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton this$0;

        ShadowDelegateImpl(com.google.android.material.floatingactionbutton.FloatingActionButton r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public float getRadius() {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.this$0
                int r0 = r0.getSizeDimension()
                float r0 = (float) r0
                r1 = 1073741824(0x40000000, float:2.0)
                float r0 = r0 / r1
                return r0
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public boolean isCompatPaddingEnabled() {
                r1 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.this$0
                boolean r0 = r0.compatPadding
                return r0
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
                r1 = this;
                if (r2 == 0) goto L7
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r1.this$0
                com.google.android.material.floatingactionbutton.FloatingActionButton.access$101(r0, r2)
            L7:
                return
        }

        @Override // com.google.android.material.shadow.ShadowViewDelegate
        public void setShadowPadding(int r3, int r4, int r5, int r6) {
                r2 = this;
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.this$0
                android.graphics.Rect r0 = r0.shadowPadding
                r0.set(r3, r4, r5, r6)
                com.google.android.material.floatingactionbutton.FloatingActionButton r0 = r2.this$0
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.access$000(r0)
                int r3 = r3 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.this$0
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.access$000(r1)
                int r4 = r4 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.this$0
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.access$000(r1)
                int r5 = r5 + r1
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.this$0
                int r1 = com.google.android.material.floatingactionbutton.FloatingActionButton.access$000(r1)
                int r6 = r6 + r1
                r0.setPadding(r3, r4, r5, r6)
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Size {
    }

    class TransformationCallbackWrapper<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> implements com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback {
        private final com.google.android.material.animation.TransformationCallback<T> listener;
        final /* synthetic */ com.google.android.material.floatingactionbutton.FloatingActionButton this$0;

        TransformationCallbackWrapper(com.google.android.material.floatingactionbutton.FloatingActionButton r1, com.google.android.material.animation.TransformationCallback<T> r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.listener = r2
                return
        }

        public boolean equals(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton.TransformationCallbackWrapper
                if (r0 == 0) goto L12
                com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper r2 = (com.google.android.material.floatingactionbutton.FloatingActionButton.TransformationCallbackWrapper) r2
                com.google.android.material.animation.TransformationCallback<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r2 = r2.listener
                com.google.android.material.animation.TransformationCallback<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.listener
                boolean r2 = r2.equals(r0)
                if (r2 == 0) goto L12
                r2 = 1
                goto L13
            L12:
                r2 = 0
            L13:
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.android.material.animation.TransformationCallback<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r1.listener
                int r0 = r0.hashCode()
                return r0
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onScaleChanged() {
                r2 = this;
                com.google.android.material.animation.TransformationCallback<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r2.listener
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.this$0
                r0.onScaleChanged(r1)
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalTransformationCallback
        public void onTranslationChanged() {
                r2 = this;
                com.google.android.material.animation.TransformationCallback<T extends com.google.android.material.floatingactionbutton.FloatingActionButton> r0 = r2.listener
                com.google.android.material.floatingactionbutton.FloatingActionButton r1 = r2.this$0
                r0.onTranslationChanged(r1)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_FloatingActionButton
            com.google.android.material.floatingactionbutton.FloatingActionButton.DEF_STYLE_RES = r0
            return
    }

    public FloatingActionButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FloatingActionButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.floatingActionButtonStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public FloatingActionButton(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r6 = com.google.android.material.floatingactionbutton.FloatingActionButton.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.shadowPadding = r11
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            r10.touchArea = r11
            android.content.Context r11 = r10.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.FloatingActionButton
            r7 = 0
            int[] r5 = new int[r7]
            r0 = r11
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_backgroundTint
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r11, r0, r1)
            r10.backgroundTint = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_backgroundTintMode
            r2 = -1
            int r1 = r0.getInt(r1, r2)
            r3 = 0
            android.graphics.PorterDuff$Mode r1 = com.google.android.material.internal.ViewUtils.parseTintMode(r1, r3)
            r10.backgroundTintMode = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_rippleColor
            android.content.res.ColorStateList r1 = com.google.android.material.resources.MaterialResources.getColorStateList(r11, r0, r1)
            r10.rippleColor = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_fabSize
            int r1 = r0.getInt(r1, r2)
            r10.size = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_fabCustomSize
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.customSize = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_borderWidth
            int r1 = r0.getDimensionPixelSize(r1, r7)
            r10.borderWidth = r1
            int r1 = com.google.android.material.C0479R.styleable.FloatingActionButton_elevation
            r2 = 0
            float r1 = r0.getDimension(r1, r2)
            int r3 = com.google.android.material.C0479R.styleable.FloatingActionButton_hoveredFocusedTranslationZ
            float r3 = r0.getDimension(r3, r2)
            int r4 = com.google.android.material.C0479R.styleable.FloatingActionButton_pressedTranslationZ
            float r2 = r0.getDimension(r4, r2)
            int r4 = com.google.android.material.C0479R.styleable.FloatingActionButton_useCompatPadding
            boolean r4 = r0.getBoolean(r4, r7)
            r10.compatPadding = r4
            android.content.res.Resources r4 = r10.getResources()
            int r5 = com.google.android.material.C0479R.dimen.mtrl_fab_min_touch_target
            int r4 = r4.getDimensionPixelSize(r5)
            int r5 = com.google.android.material.C0479R.styleable.FloatingActionButton_maxImageSize
            int r5 = r0.getDimensionPixelSize(r5, r7)
            r10.maxImageSize = r5
            int r5 = com.google.android.material.C0479R.styleable.FloatingActionButton_showMotionSpec
            com.google.android.material.animation.MotionSpec r5 = com.google.android.material.animation.MotionSpec.createFromAttribute(r11, r0, r5)
            int r8 = com.google.android.material.C0479R.styleable.FloatingActionButton_hideMotionSpec
            com.google.android.material.animation.MotionSpec r8 = com.google.android.material.animation.MotionSpec.createFromAttribute(r11, r0, r8)
            com.google.android.material.shape.CornerSize r9 = com.google.android.material.shape.ShapeAppearanceModel.PILL
            com.google.android.material.shape.ShapeAppearanceModel$Builder r11 = com.google.android.material.shape.ShapeAppearanceModel.builder(r11, r12, r13, r6, r9)
            com.google.android.material.shape.ShapeAppearanceModel r11 = r11.build()
            int r6 = com.google.android.material.C0479R.styleable.FloatingActionButton_ensureMinTouchTargetSize
            boolean r6 = r0.getBoolean(r6, r7)
            int r7 = com.google.android.material.C0479R.styleable.FloatingActionButton_android_enabled
            r9 = 1
            boolean r7 = r0.getBoolean(r7, r9)
            r10.setEnabled(r7)
            r0.recycle()
            androidx.appcompat.widget.AppCompatImageHelper r0 = new androidx.appcompat.widget.AppCompatImageHelper
            r0.<init>(r10)
            r10.imageHelper = r0
            r0.loadFromAttributes(r12, r13)
            com.google.android.material.expandable.ExpandableWidgetHelper r12 = new com.google.android.material.expandable.ExpandableWidgetHelper
            r12.<init>(r10)
            r10.expandableWidgetHelper = r12
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r12 = r10.getImpl()
            r12.setShapeAppearance(r11)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            android.content.res.ColorStateList r12 = r10.backgroundTint
            android.graphics.PorterDuff$Mode r13 = r10.backgroundTintMode
            android.content.res.ColorStateList r0 = r10.rippleColor
            int r7 = r10.borderWidth
            r11.initializeBackgroundDrawable(r12, r13, r0, r7)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setMinTouchTargetSize(r4)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setElevation(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setHoveredFocusedTranslationZ(r3)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setPressedTranslationZ(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            int r12 = r10.maxImageSize
            r11.setMaxImageSize(r12)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setShowMotionSpec(r5)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setHideMotionSpec(r8)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r11 = r10.getImpl()
            r11.setEnsureMinTouchTargetSize(r6)
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.MATRIX
            r10.setScaleType(r11)
            return
    }

    static /* synthetic */ int access$000(com.google.android.material.floatingactionbutton.FloatingActionButton r0) {
            int r0 = r0.imagePadding
            return r0
    }

    static /* synthetic */ void access$101(com.google.android.material.floatingactionbutton.FloatingActionButton r0, android.graphics.drawable.Drawable r1) {
            super.setBackgroundDrawable(r1)
            return
    }

    private com.google.android.material.floatingactionbutton.FloatingActionButtonImpl createImpl() {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop r0 = new com.google.android.material.floatingactionbutton.FloatingActionButtonImplLollipop
            com.google.android.material.floatingactionbutton.FloatingActionButton$ShadowDelegateImpl r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$ShadowDelegateImpl
            r1.<init>(r2)
            r0.<init>(r2, r1)
            return r0
    }

    private com.google.android.material.floatingactionbutton.FloatingActionButtonImpl getImpl() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.impl
            if (r0 != 0) goto La
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.createImpl()
            r1.impl = r0
        La:
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.impl
            return r0
    }

    private int getSizeDimension(int r4) {
            r3 = this;
            int r0 = r3.customSize
            if (r0 == 0) goto L5
            return r0
        L5:
            android.content.res.Resources r0 = r3.getResources()
            r1 = -1
            r2 = 1
            if (r4 == r1) goto L1d
            if (r4 == r2) goto L16
            int r4 = com.google.android.material.C0479R.dimen.design_fab_size_normal
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L16:
            int r4 = com.google.android.material.C0479R.dimen.design_fab_size_mini
            int r4 = r0.getDimensionPixelSize(r4)
            return r4
        L1d:
            android.content.res.Configuration r4 = r0.getConfiguration()
            int r4 = r4.screenWidthDp
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.screenHeightDp
            int r4 = java.lang.Math.max(r4, r0)
            r0 = 470(0x1d6, float:6.59E-43)
            if (r4 >= r0) goto L36
            int r4 = r3.getSizeDimension(r2)
            goto L3b
        L36:
            r4 = 0
            int r4 = r3.getSizeDimension(r4)
        L3b:
            return r4
    }

    private void offsetRectWithShadow(android.graphics.Rect r3) {
            r2 = this;
            int r0 = r3.left
            android.graphics.Rect r1 = r2.shadowPadding
            int r1 = r1.left
            int r0 = r0 + r1
            r3.left = r0
            int r0 = r3.top
            android.graphics.Rect r1 = r2.shadowPadding
            int r1 = r1.top
            int r0 = r0 + r1
            r3.top = r0
            int r0 = r3.right
            android.graphics.Rect r1 = r2.shadowPadding
            int r1 = r1.right
            int r0 = r0 - r1
            r3.right = r0
            int r0 = r3.bottom
            android.graphics.Rect r1 = r2.shadowPadding
            int r1 = r1.bottom
            int r0 = r0 - r1
            r3.bottom = r0
            return
    }

    private void onApplySupportImageTint() {
            r4 = this;
            android.graphics.drawable.Drawable r0 = r4.getDrawable()
            if (r0 != 0) goto L7
            return
        L7:
            android.content.res.ColorStateList r1 = r4.imageTint
            if (r1 != 0) goto Lf
            androidx.core.graphics.drawable.DrawableCompat.clearColorFilter(r0)
            return
        Lf:
            int[] r2 = r4.getDrawableState()
            r3 = 0
            int r1 = r1.getColorForState(r2, r3)
            android.graphics.PorterDuff$Mode r2 = r4.imageMode
            if (r2 != 0) goto L1e
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
        L1e:
            android.graphics.drawable.Drawable r0 = r0.mutate()
            android.graphics.PorterDuffColorFilter r1 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r1, r2)
            r0.setColorFilter(r1)
            return
    }

    private static int resolveAdjustedSize(int r2, int r3) {
            int r0 = android.view.View.MeasureSpec.getMode(r3)
            int r3 = android.view.View.MeasureSpec.getSize(r3)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L1a
            if (r0 == 0) goto L1e
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L14
            r2 = r3
            goto L1e
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L1a:
            int r2 = java.lang.Math.min(r2, r3)
        L1e:
            return r2
    }

    private com.google.android.material.floatingactionbutton.FloatingActionButtonImpl.InternalVisibilityChangedListener wrapOnVisibilityChangedListener(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            com.google.android.material.floatingactionbutton.FloatingActionButton$1 r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$1
            r0.<init>(r1, r2)
            return r0
    }

    public void addOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.addOnHideAnimationListener(r2)
            return
    }

    public void addOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.addOnShowAnimationListener(r2)
            return
    }

    public void addTransformationCallback(com.google.android.material.animation.TransformationCallback<? extends com.google.android.material.floatingactionbutton.FloatingActionButton> r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r2.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper
            r1.<init>(r2, r3)
            r0.addTransformationCallback(r1)
            return
    }

    public void clearCustomSize() {
            r1 = this;
            r0 = 0
            r1.setCustomSize(r0)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r2 = this;
            super.drawableStateChanged()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r2.getImpl()
            int[] r1 = r2.getDrawableState()
            r0.onDrawableStateChanged(r1)
            return
    }

    @Override // android.view.View
    public android.content.res.ColorStateList getBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.backgroundTint
            return r0
    }

    @Override // android.view.View
    public android.graphics.PorterDuff.Mode getBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
            return r0
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
    public androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<com.google.android.material.floatingactionbutton.FloatingActionButton> getBehavior() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior r0 = new com.google.android.material.floatingactionbutton.FloatingActionButton$Behavior
            r0.<init>()
            return r0
    }

    public float getCompatElevation() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            float r0 = r0.getElevation()
            return r0
    }

    public float getCompatHoveredFocusedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            float r0 = r0.getHoveredFocusedTranslationZ()
            return r0
    }

    public float getCompatPressedTranslationZ() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            float r0 = r0.getPressedTranslationZ()
            return r0
    }

    public android.graphics.drawable.Drawable getContentBackground() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            android.graphics.drawable.Drawable r0 = r0.getContentBackground()
            return r0
    }

    @java.lang.Deprecated
    public boolean getContentRect(android.graphics.Rect r4) {
            r3 = this;
            boolean r0 = androidx.core.view.ViewCompat.isLaidOut(r3)
            r1 = 0
            if (r0 == 0) goto L17
            int r0 = r3.getWidth()
            int r2 = r3.getHeight()
            r4.set(r1, r1, r0, r2)
            r3.offsetRectWithShadow(r4)
            r4 = 1
            return r4
        L17:
            return r1
    }

    public int getCustomSize() {
            r1 = this;
            int r0 = r1.customSize
            return r0
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public int getExpandedComponentIdHint() {
            r1 = this;
            com.google.android.material.expandable.ExpandableWidgetHelper r0 = r1.expandableWidgetHelper
            int r0 = r0.getExpandedComponentIdHint()
            return r0
    }

    public com.google.android.material.animation.MotionSpec getHideMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            com.google.android.material.animation.MotionSpec r0 = r0.getHideMotionSpec()
            return r0
    }

    public void getMeasuredContentRect(android.graphics.Rect r4) {
            r3 = this;
            int r0 = r3.getMeasuredWidth()
            int r1 = r3.getMeasuredHeight()
            r2 = 0
            r4.set(r2, r2, r0, r1)
            r3.offsetRectWithShadow(r4)
            return
    }

    @java.lang.Deprecated
    public int getRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            if (r0 == 0) goto L9
            int r0 = r0.getDefaultColor()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    public android.content.res.ColorStateList getRippleColorStateList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearance()
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            com.google.android.material.shape.ShapeAppearanceModel r0 = (com.google.android.material.shape.ShapeAppearanceModel) r0
            return r0
    }

    public com.google.android.material.animation.MotionSpec getShowMotionSpec() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            com.google.android.material.animation.MotionSpec r0 = r0.getShowMotionSpec()
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    int getSizeDimension() {
            r1 = this;
            int r0 = r1.size
            int r0 = r1.getSizeDimension(r0)
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.content.res.ColorStateList getSupportBackgroundTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.getBackgroundTintList()
            return r0
    }

    @Override // androidx.core.view.TintableBackgroundView
    public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.getBackgroundTintMode()
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.content.res.ColorStateList getSupportImageTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.imageTint
            return r0
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public android.graphics.PorterDuff.Mode getSupportImageTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.imageMode
            return r0
    }

    public boolean getUseCompatPadding() {
            r1 = this;
            boolean r0 = r1.compatPadding
            return r0
    }

    public void hide() {
            r1 = this;
            r0 = 0
            r1.hide(r0)
            return
    }

    public void hide(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r2) {
            r1 = this;
            r0 = 1
            r1.hide(r2, r0)
            return
    }

    void hide(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener r2 = r1.wrapOnVisibilityChangedListener(r2)
            r0.hide(r2, r3)
            return
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean isExpanded() {
            r1 = this;
            com.google.android.material.expandable.ExpandableWidgetHelper r0 = r1.expandableWidgetHelper
            boolean r0 = r0.isExpanded()
            return r0
    }

    public boolean isOrWillBeHidden() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            boolean r0 = r0.isOrWillBeHidden()
            return r0
    }

    public boolean isOrWillBeShown() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            boolean r0 = r0.isOrWillBeShown()
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
            r1 = this;
            super.jumpDrawablesToCurrentState()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.jumpDrawableToCurrentState()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.onAttachedToWindow()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.onDetachedFromWindow()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r3, int r4) {
            r2 = this;
            int r0 = r2.getSizeDimension()
            int r1 = r2.maxImageSize
            int r1 = r0 - r1
            int r1 = r1 / 2
            r2.imagePadding = r1
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r2.getImpl()
            r1.updatePadding()
            int r3 = resolveAdjustedSize(r0, r3)
            int r4 = resolveAdjustedSize(r0, r4)
            int r3 = java.lang.Math.min(r3, r4)
            android.graphics.Rect r4 = r2.shadowPadding
            int r4 = r4.left
            int r4 = r4 + r3
            android.graphics.Rect r0 = r2.shadowPadding
            int r0 = r0.right
            int r4 = r4 + r0
            android.graphics.Rect r0 = r2.shadowPadding
            int r0 = r0.top
            int r3 = r3 + r0
            android.graphics.Rect r0 = r2.shadowPadding
            int r0 = r0.bottom
            int r3 = r3 + r0
            r2.setMeasuredDimension(r4, r3)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r3) {
            r2 = this;
            boolean r0 = r3 instanceof com.google.android.material.stateful.ExtendableSavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r3)
            return
        L8:
            com.google.android.material.stateful.ExtendableSavedState r3 = (com.google.android.material.stateful.ExtendableSavedState) r3
            android.os.Parcelable r0 = r3.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.expandable.ExpandableWidgetHelper r0 = r2.expandableWidgetHelper
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r3 = r3.extendableStates
            java.lang.String r1 = "expandableWidgetHelper"
            java.lang.Object r3 = r3.get(r1)
            java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
            android.os.Bundle r3 = (android.os.Bundle) r3
            r0.onRestoreInstanceState(r3)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r4 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
        Lb:
            com.google.android.material.stateful.ExtendableSavedState r1 = new com.google.android.material.stateful.ExtendableSavedState
            r1.<init>(r0)
            androidx.collection.SimpleArrayMap<java.lang.String, android.os.Bundle> r0 = r1.extendableStates
            com.google.android.material.expandable.ExpandableWidgetHelper r2 = r4.expandableWidgetHelper
            android.os.Bundle r2 = r2.onSaveInstanceState()
            java.lang.String r3 = "expandableWidgetHelper"
            r0.put(r3, r2)
            return r1
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent r4) {
            r3 = this;
            int r0 = r4.getAction()
            if (r0 != 0) goto L22
            android.graphics.Rect r0 = r3.touchArea
            boolean r0 = r3.getContentRect(r0)
            if (r0 == 0) goto L22
            android.graphics.Rect r0 = r3.touchArea
            float r1 = r4.getX()
            int r1 = (int) r1
            float r2 = r4.getY()
            int r2 = (int) r2
            boolean r0 = r0.contains(r1, r2)
            if (r0 != 0) goto L22
            r4 = 0
            return r4
        L22:
            boolean r4 = super.onTouchEvent(r4)
            return r4
    }

    public void removeOnHideAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.removeOnHideAnimationListener(r2)
            return
    }

    public void removeOnShowAnimationListener(android.animation.Animator.AnimatorListener r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.removeOnShowAnimationListener(r2)
            return
    }

    public void removeTransformationCallback(com.google.android.material.animation.TransformationCallback<? extends com.google.android.material.floatingactionbutton.FloatingActionButton> r3) {
            r2 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r2.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper r1 = new com.google.android.material.floatingactionbutton.FloatingActionButton$TransformationCallbackWrapper
            r1.<init>(r2, r3)
            r0.removeTransformationCallback(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            java.lang.String r2 = "FloatingActionButton"
            java.lang.String r0 = "Setting a custom background is not supported."
            android.util.Log.i(r2, r0)
            return
    }

    @Override // android.view.View
    public void setBackgroundTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.backgroundTint
            if (r0 == r2) goto Ld
            r1.backgroundTint = r2
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setBackgroundTintList(r2)
        Ld:
            return
    }

    @Override // android.view.View
    public void setBackgroundTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.backgroundTintMode
            if (r0 == r2) goto Ld
            r1.backgroundTintMode = r2
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setBackgroundTintMode(r2)
        Ld:
            return
    }

    public void setCompatElevation(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setElevation(r2)
            return
    }

    public void setCompatElevationResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatElevation(r2)
            return
    }

    public void setCompatHoveredFocusedTranslationZ(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setHoveredFocusedTranslationZ(r2)
            return
    }

    public void setCompatHoveredFocusedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatHoveredFocusedTranslationZ(r2)
            return
    }

    public void setCompatPressedTranslationZ(float r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setPressedTranslationZ(r2)
            return
    }

    public void setCompatPressedTranslationZResource(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setCompatPressedTranslationZ(r2)
            return
    }

    public void setCustomSize(int r2) {
            r1 = this;
            if (r2 < 0) goto Lc
            int r0 = r1.customSize
            if (r2 == r0) goto Lb
            r1.customSize = r2
            r1.requestLayout()
        Lb:
            return
        Lc:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Custom size must be non-negative"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.updateShapeElevation(r2)
            return
    }

    public void setEnsureMinTouchTargetSize(boolean r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            boolean r0 = r0.getEnsureMinTouchTargetSize()
            if (r2 == r0) goto L14
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setEnsureMinTouchTargetSize(r2)
            r1.requestLayout()
        L14:
            return
    }

    @Override // com.google.android.material.expandable.ExpandableWidget
    public boolean setExpanded(boolean r2) {
            r1 = this;
            com.google.android.material.expandable.ExpandableWidgetHelper r0 = r1.expandableWidgetHelper
            boolean r2 = r0.setExpanded(r2)
            return r2
    }

    @Override // com.google.android.material.expandable.ExpandableTransformationWidget
    public void setExpandedComponentIdHint(int r2) {
            r1 = this;
            com.google.android.material.expandable.ExpandableWidgetHelper r0 = r1.expandableWidgetHelper
            r0.setExpandedComponentIdHint(r2)
            return
    }

    public void setHideMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setHideMotionSpec(r2)
            return
    }

    public void setHideMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setHideMotionSpec(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.getDrawable()
            if (r0 == r2) goto L17
            super.setImageDrawable(r2)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2 = r1.getImpl()
            r2.updateImageMatrixScale()
            android.content.res.ColorStateList r2 = r1.imageTint
            if (r2 == 0) goto L17
            r1.onApplySupportImageTint()
        L17:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            androidx.appcompat.widget.AppCompatImageHelper r0 = r1.imageHelper
            r0.setImageResource(r2)
            r1.onApplySupportImageTint()
            return
    }

    public void setRippleColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setRippleColor(r1)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.rippleColor
            if (r0 == r2) goto Lf
            r1.rippleColor = r2
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2 = r1.getImpl()
            android.content.res.ColorStateList r0 = r1.rippleColor
            r2.setRippleColor(r0)
        Lf:
            return
    }

    @Override // android.view.View
    public void setScaleX(float r1) {
            r0 = this;
            super.setScaleX(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r0.getImpl()
            r1.onScaleChanged()
            return
    }

    @Override // android.view.View
    public void setScaleY(float r1) {
            r0 = this;
            super.setScaleY(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r0.getImpl()
            r1.onScaleChanged()
            return
    }

    public void setShadowPaddingEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setShadowPaddingEnabled(r2)
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setShapeAppearance(r2)
            return
    }

    public void setShowMotionSpec(com.google.android.material.animation.MotionSpec r2) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            r0.setShowMotionSpec(r2)
            return
    }

    public void setShowMotionSpecResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            com.google.android.material.animation.MotionSpec r2 = com.google.android.material.animation.MotionSpec.createFromResource(r0, r2)
            r1.setShowMotionSpec(r2)
            return
    }

    public void setSize(int r2) {
            r1 = this;
            r0 = 0
            r1.customSize = r0
            int r0 = r1.size
            if (r2 == r0) goto Lc
            r1.size = r2
            r1.requestLayout()
        Lc:
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.setBackgroundTintList(r1)
            return
    }

    @Override // androidx.core.view.TintableBackgroundView
    public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.setBackgroundTintMode(r1)
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.imageTint
            if (r0 == r2) goto L9
            r1.imageTint = r2
            r1.onApplySupportImageTint()
        L9:
            return
    }

    @Override // androidx.core.widget.TintableImageSourceView
    public void setSupportImageTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.imageMode
            if (r0 == r2) goto L9
            r1.imageMode = r2
            r1.onApplySupportImageTint()
        L9:
            return
    }

    @Override // android.view.View
    public void setTranslationX(float r1) {
            r0 = this;
            super.setTranslationX(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r0.getImpl()
            r1.onTranslationChanged()
            return
    }

    @Override // android.view.View
    public void setTranslationY(float r1) {
            r0 = this;
            super.setTranslationY(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r0.getImpl()
            r1.onTranslationChanged()
            return
    }

    @Override // android.view.View
    public void setTranslationZ(float r1) {
            r0 = this;
            super.setTranslationZ(r1)
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r1 = r0.getImpl()
            r1.onTranslationChanged()
            return
    }

    public void setUseCompatPadding(boolean r2) {
            r1 = this;
            boolean r0 = r1.compatPadding
            if (r0 == r2) goto Ld
            r1.compatPadding = r2
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r2 = r1.getImpl()
            r2.onCompatShadowChanged()
        Ld:
            return
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int r1) {
            r0 = this;
            super.setVisibility(r1)
            return
    }

    public boolean shouldEnsureMinTouchTargetSize() {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            boolean r0 = r0.getEnsureMinTouchTargetSize()
            return r0
    }

    public void show() {
            r1 = this;
            r0 = 0
            r1.show(r0)
            return
    }

    public void show(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r2) {
            r1 = this;
            r0 = 1
            r1.show(r2, r0)
            return
    }

    void show(com.google.android.material.floatingactionbutton.FloatingActionButton.OnVisibilityChangedListener r2, boolean r3) {
            r1 = this;
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl r0 = r1.getImpl()
            com.google.android.material.floatingactionbutton.FloatingActionButtonImpl$InternalVisibilityChangedListener r2 = r1.wrapOnVisibilityChangedListener(r2)
            r0.show(r2, r3)
            return
    }
}
