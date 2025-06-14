package com.google.android.material.card;

/* loaded from: classes.dex */
public class MaterialCardView extends androidx.cardview.widget.CardView implements android.widget.Checkable, com.google.android.material.shape.Shapeable {
    private static final java.lang.String ACCESSIBILITY_CLASS_NAME = "androidx.cardview.widget.CardView";
    private static final int[] CHECKABLE_STATE_SET = null;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DRAGGED_STATE_SET = null;
    private static final java.lang.String LOG_TAG = "MaterialCardView";
    private final com.google.android.material.card.MaterialCardViewHelper cardViewHelper;
    private boolean checked;
    private boolean dragged;
    private boolean isParentCardViewDoneInitializing;
    private com.google.android.material.card.MaterialCardView.OnCheckedChangeListener onCheckedChangeListener;

    public interface OnCheckedChangeListener {
        void onCheckedChanged(com.google.android.material.card.MaterialCardView r1, boolean r2);
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842911(0x101009f, float:2.3694004E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.card.MaterialCardView.CHECKABLE_STATE_SET = r1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r1[r3] = r2
            com.google.android.material.card.MaterialCardView.CHECKED_STATE_SET = r1
            int[] r0 = new int[r0]
            int r1 = com.google.android.material.C0479R.attr.state_dragged
            r0[r3] = r1
            com.google.android.material.card.MaterialCardView.DRAGGED_STATE_SET = r0
            int r0 = com.google.android.material.C0479R.style.Widget_MaterialComponents_CardView
            com.google.android.material.card.MaterialCardView.DEF_STYLE_RES = r0
            return
    }

    public MaterialCardView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public MaterialCardView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.materialCardViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public MaterialCardView(android.content.Context r8, android.util.AttributeSet r9, int r10) {
            r7 = this;
            int r6 = com.google.android.material.card.MaterialCardView.DEF_STYLE_RES
            android.content.Context r8 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r8, r9, r10, r6)
            r7.<init>(r8, r9, r10)
            r8 = 0
            r7.checked = r8
            r7.dragged = r8
            r0 = 1
            r7.isParentCardViewDoneInitializing = r0
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.C0479R.styleable.MaterialCardView
            int[] r5 = new int[r8]
            r1 = r9
            r3 = r10
            r4 = r6
            android.content.res.TypedArray r8 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            com.google.android.material.card.MaterialCardViewHelper r0 = new com.google.android.material.card.MaterialCardViewHelper
            r0.<init>(r7, r9, r10, r6)
            r7.cardViewHelper = r0
            android.content.res.ColorStateList r9 = super.getCardBackgroundColor()
            r0.setCardBackgroundColor(r9)
            int r9 = super.getContentPaddingLeft()
            int r10 = super.getContentPaddingTop()
            int r1 = super.getContentPaddingRight()
            int r2 = super.getContentPaddingBottom()
            r0.setUserContentPadding(r9, r10, r1, r2)
            r0.loadFromAttributes(r8)
            r8.recycle()
            return
    }

    static /* synthetic */ float access$001(com.google.android.material.card.MaterialCardView r0) {
            float r0 = super.getRadius()
            return r0
    }

    private void forceRippleRedrawIfNeeded() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 <= r1) goto Lb
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            r0.forceRippleRedraw()
        Lb:
            return
    }

    private android.graphics.RectF getBoundsAsRectF() {
            r2 = this;
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            com.google.android.material.card.MaterialCardViewHelper r1 = r2.cardViewHelper
            com.google.android.material.shape.MaterialShapeDrawable r1 = r1.getBackground()
            android.graphics.Rect r1 = r1.getBounds()
            r0.set(r1)
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public android.content.res.ColorStateList getCardBackgroundColor() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r0 = r0.getCardBackgroundColor()
            return r0
    }

    public android.content.res.ColorStateList getCardForegroundColor() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r0 = r0.getCardForegroundColor()
            return r0
    }

    float getCardViewRadius() {
            r1 = this;
            float r0 = access$001(r1)
            return r0
    }

    public android.graphics.drawable.Drawable getCheckedIcon() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.graphics.drawable.Drawable r0 = r0.getCheckedIcon()
            return r0
    }

    public int getCheckedIconMargin() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            int r0 = r0.getCheckedIconMargin()
            return r0
    }

    public int getCheckedIconSize() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            int r0 = r0.getCheckedIconSize()
            return r0
    }

    public android.content.res.ColorStateList getCheckedIconTint() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r0 = r0.getCheckedIconTint()
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.graphics.Rect r0 = r0.getUserContentPadding()
            int r0 = r0.bottom
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.graphics.Rect r0 = r0.getUserContentPadding()
            int r0 = r0.left
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.graphics.Rect r0 = r0.getUserContentPadding()
            int r0 = r0.right
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.graphics.Rect r0 = r0.getUserContentPadding()
            int r0 = r0.top
            return r0
    }

    public float getProgress() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            float r0 = r0.getProgress()
            return r0
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            float r0 = r0.getCornerRadius()
            return r0
    }

    public android.content.res.ColorStateList getRippleColor() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r0 = r0.getRippleColor()
            return r0
    }

    @Override // com.google.android.material.shape.Shapeable
    public com.google.android.material.shape.ShapeAppearanceModel getShapeAppearanceModel() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.getShapeAppearanceModel()
            return r0
    }

    @java.lang.Deprecated
    public int getStrokeColor() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            int r0 = r0.getStrokeColor()
            return r0
    }

    public android.content.res.ColorStateList getStrokeColorStateList() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r0 = r0.getStrokeColorStateList()
            return r0
    }

    public int getStrokeWidth() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            int r0 = r0.getStrokeWidth()
            return r0
    }

    public boolean isCheckable() {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            if (r0 == 0) goto Lc
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
            r1 = this;
            boolean r0 = r1.checked
            return r0
    }

    public boolean isDragged() {
            r1 = this;
            boolean r0 = r1.dragged
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            com.google.android.material.shape.MaterialShapeDrawable r0 = r0.getBackground()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r1, r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 3
            int[] r2 = super.onCreateDrawableState(r2)
            boolean r0 = r1.isCheckable()
            if (r0 == 0) goto L11
            int[] r0 = com.google.android.material.card.MaterialCardView.CHECKABLE_STATE_SET
            mergeDrawableStates(r2, r0)
        L11:
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L1c
            int[] r0 = com.google.android.material.card.MaterialCardView.CHECKED_STATE_SET
            mergeDrawableStates(r2, r0)
        L1c:
            boolean r0 = r1.isDragged()
            if (r0 == 0) goto L27
            int[] r0 = com.google.android.material.card.MaterialCardView.DRAGGED_STATE_SET
            mergeDrawableStates(r2, r0)
        L27:
            return r2
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(android.view.accessibility.AccessibilityEvent r2) {
            r1 = this;
            super.onInitializeAccessibilityEvent(r2)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r2.setClassName(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r2) {
            r1 = this;
            super.onInitializeAccessibilityNodeInfo(r2)
            java.lang.String r0 = "androidx.cardview.widget.CardView"
            r2.setClassName(r0)
            boolean r0 = r1.isCheckable()
            r2.setCheckable(r0)
            boolean r0 = r1.isClickable()
            r2.setClickable(r0)
            boolean r0 = r1.isChecked()
            r2.setChecked(r0)
            return
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            super.onMeasure(r2, r3)
            com.google.android.material.card.MaterialCardViewHelper r2 = r1.cardViewHelper
            int r3 = r1.getMeasuredWidth()
            int r0 = r1.getMeasuredHeight()
            r2.onMeasure(r3, r0)
            return
    }

    void setAncestorContentPadding(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.setContentPadding(r1, r2, r3, r4)
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r3) {
            r2 = this;
            boolean r0 = r2.isParentCardViewDoneInitializing
            if (r0 == 0) goto L1c
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            boolean r0 = r0.isBackgroundOverwritten()
            if (r0 != 0) goto L19
            java.lang.String r0 = "MaterialCardView"
            java.lang.String r1 = "Setting a custom background is not supported."
            android.util.Log.i(r0, r1)
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            r1 = 1
            r0.setBackgroundOverwritten(r1)
        L19:
            super.setBackgroundDrawable(r3)
        L1c:
            return
    }

    void setBackgroundInternal(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setBackgroundDrawable(r1)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setCardBackgroundColor(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCardBackgroundColor(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float r1) {
            r0 = this;
            super.setCardElevation(r1)
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateElevation()
            return
    }

    public void setCardForegroundColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCardForegroundColor(r2)
            return
    }

    public void setCheckable(boolean r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCheckable(r2)
            return
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean r2) {
            r1 = this;
            boolean r0 = r1.checked
            if (r0 == r2) goto L7
            r1.toggle()
        L7:
            return
    }

    public void setCheckedIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCheckedIcon(r2)
            return
    }

    public void setCheckedIconMargin(int r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCheckedIconMargin(r2)
            return
    }

    public void setCheckedIconMarginResource(int r3) {
            r2 = this;
            r0 = -1
            if (r3 == r0) goto L10
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setCheckedIconMargin(r3)
        L10:
            return
    }

    public void setCheckedIconResource(int r3) {
            r2 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            android.content.Context r1 = r2.getContext()
            android.graphics.drawable.Drawable r3 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r1, r3)
            r0.setCheckedIcon(r3)
            return
    }

    public void setCheckedIconSize(int r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCheckedIconSize(r2)
            return
    }

    public void setCheckedIconSizeResource(int r3) {
            r2 = this;
            if (r3 == 0) goto Lf
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setCheckedIconSize(r3)
        Lf:
            return
    }

    public void setCheckedIconTint(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCheckedIconTint(r2)
            return
    }

    @Override // android.view.View
    public void setClickable(boolean r1) {
            r0 = this;
            super.setClickable(r1)
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            if (r1 == 0) goto La
            r1.updateClickable()
        La:
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int r2, int r3, int r4, int r5) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setUserContentPadding(r2, r3, r4, r5)
            return
    }

    public void setDragged(boolean r2) {
            r1 = this;
            boolean r0 = r1.dragged
            if (r0 == r2) goto Lf
            r1.dragged = r2
            r1.refreshDrawableState()
            r1.forceRippleRedrawIfNeeded()
            r1.invalidate()
        Lf:
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float r1) {
            r0 = this;
            super.setMaxCardElevation(r1)
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateInsets()
            return
    }

    public void setOnCheckedChangeListener(com.google.android.material.card.MaterialCardView.OnCheckedChangeListener r1) {
            r0 = this;
            r0.onCheckedChangeListener = r1
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean r1) {
            r0 = this;
            super.setPreventCornerOverlap(r1)
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateInsets()
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateContentPadding()
            return
    }

    public void setProgress(float r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setProgress(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float r2) {
            r1 = this;
            super.setRadius(r2)
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setCornerRadius(r2)
            return
    }

    public void setRippleColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setRippleColor(r2)
            return
    }

    public void setRippleColorResource(int r3) {
            r2 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r2.cardViewHelper
            android.content.Context r1 = r2.getContext()
            android.content.res.ColorStateList r3 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r1, r3)
            r0.setRippleColor(r3)
            return
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(com.google.android.material.shape.ShapeAppearanceModel r2) {
            r1 = this;
            android.graphics.RectF r0 = r1.getBoundsAsRectF()
            boolean r0 = r2.isRoundRect(r0)
            r1.setClipToOutline(r0)
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setShapeAppearanceModel(r2)
            return
    }

    public void setStrokeColor(int r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r0.setStrokeColor(r2)
            return
    }

    public void setStrokeColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setStrokeColor(r2)
            return
    }

    public void setStrokeWidth(int r2) {
            r1 = this;
            com.google.android.material.card.MaterialCardViewHelper r0 = r1.cardViewHelper
            r0.setStrokeWidth(r2)
            return
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean r1) {
            r0 = this;
            super.setUseCompatPadding(r1)
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateInsets()
            com.google.android.material.card.MaterialCardViewHelper r1 = r0.cardViewHelper
            r1.updateContentPadding()
            return
    }

    @Override // android.widget.Checkable
    public void toggle() {
            r2 = this;
            boolean r0 = r2.isCheckable()
            if (r0 == 0) goto L21
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto L21
            boolean r0 = r2.checked
            r0 = r0 ^ 1
            r2.checked = r0
            r2.refreshDrawableState()
            r2.forceRippleRedrawIfNeeded()
            com.google.android.material.card.MaterialCardView$OnCheckedChangeListener r0 = r2.onCheckedChangeListener
            if (r0 == 0) goto L21
            boolean r1 = r2.checked
            r0.onCheckedChanged(r2, r1)
        L21:
            return
    }
}
