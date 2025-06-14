package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public class BottomNavigationItemView extends android.widget.FrameLayout implements androidx.appcompat.view.menu.MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = null;
    public static final int INVALID_ITEM_POSITION = -1;
    private com.google.android.material.badge.BadgeDrawable badgeDrawable;
    private final int defaultMargin;
    private android.widget.ImageView icon;
    private android.content.res.ColorStateList iconTint;
    private boolean isShifting;
    private androidx.appcompat.view.menu.MenuItemImpl itemData;
    private int itemPosition;
    private final android.view.ViewGroup labelGroup;
    private int labelVisibilityMode;
    private final android.widget.TextView largeLabel;
    private android.graphics.drawable.Drawable originalIconDrawable;
    private float scaleDownFactor;
    private float scaleUpFactor;
    private float shiftAmount;
    private final android.widget.TextView smallLabel;
    private android.graphics.drawable.Drawable wrappedIconDrawable;


    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.bottomnavigation.BottomNavigationItemView.CHECKED_STATE_SET = r0
            return
    }

    public BottomNavigationItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomNavigationItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomNavigationItemView(android.content.Context r4, android.util.AttributeSet r5, int r6) {
            r3 = this;
            r3.<init>(r4, r5, r6)
            r5 = -1
            r3.itemPosition = r5
            android.content.res.Resources r5 = r3.getResources()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            int r6 = com.google.android.material.C0479R.layout.design_bottom_navigation_item
            r0 = 1
            r4.inflate(r6, r3, r0)
            int r4 = com.google.android.material.C0479R.drawable.design_bottom_navigation_item_background
            r3.setBackgroundResource(r4)
            int r4 = com.google.android.material.C0479R.dimen.design_bottom_navigation_margin
            int r4 = r5.getDimensionPixelSize(r4)
            r3.defaultMargin = r4
            int r4 = com.google.android.material.C0479R.id.icon
            android.view.View r4 = r3.findViewById(r4)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.icon = r4
            int r4 = com.google.android.material.C0479R.id.labelGroup
            android.view.View r4 = r3.findViewById(r4)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r3.labelGroup = r4
            int r5 = com.google.android.material.C0479R.id.smallLabel
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r3.smallLabel = r5
            int r6 = com.google.android.material.C0479R.id.largeLabel
            android.view.View r6 = r3.findViewById(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r3.largeLabel = r6
            int r1 = com.google.android.material.C0479R.id.mtrl_view_tag_bottom_padding
            int r2 = r4.getPaddingBottom()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.setTag(r1, r2)
            r4 = 2
            androidx.core.view.ViewCompat.setImportantForAccessibility(r5, r4)
            androidx.core.view.ViewCompat.setImportantForAccessibility(r6, r4)
            r3.setFocusable(r0)
            float r4 = r5.getTextSize()
            float r5 = r6.getTextSize()
            r3.calculateTextScaleFactors(r4, r5)
            android.widget.ImageView r4 = r3.icon
            if (r4 == 0) goto L77
            com.google.android.material.bottomnavigation.BottomNavigationItemView$1 r5 = new com.google.android.material.bottomnavigation.BottomNavigationItemView$1
            r5.<init>(r3)
            r4.addOnLayoutChangeListener(r5)
        L77:
            return
    }

    static /* synthetic */ android.widget.ImageView access$000(com.google.android.material.bottomnavigation.BottomNavigationItemView r0) {
            android.widget.ImageView r0 = r0.icon
            return r0
    }

    static /* synthetic */ void access$100(com.google.android.material.bottomnavigation.BottomNavigationItemView r0, android.view.View r1) {
            r0.tryUpdateBadgeBounds(r1)
            return
    }

    private void calculateTextScaleFactors(float r3, float r4) {
            r2 = this;
            float r0 = r3 - r4
            r2.shiftAmount = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = r4 * r0
            float r1 = r1 / r3
            r2.scaleUpFactor = r1
            float r3 = r3 * r0
            float r3 = r3 / r4
            r2.scaleDownFactor = r3
            return
    }

    private android.widget.FrameLayout getCustomParentForBadge(android.view.View r3) {
            r2 = this;
            android.widget.ImageView r0 = r2.icon
            r1 = 0
            if (r3 != r0) goto L12
            boolean r3 = com.google.android.material.badge.BadgeUtils.USE_COMPAT_PARENT
            if (r3 == 0) goto L12
            android.widget.ImageView r3 = r2.icon
            android.view.ViewParent r3 = r3.getParent()
            r1 = r3
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
        L12:
            return r1
    }

    private int getItemVisiblePosition() {
            r6 = this;
            android.view.ViewParent r0 = r6.getParent()
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r0.indexOfChild(r6)
            r2 = 0
            r3 = r2
        Lc:
            if (r2 >= r1) goto L21
            android.view.View r4 = r0.getChildAt(r2)
            boolean r5 = r4 instanceof com.google.android.material.bottomnavigation.BottomNavigationItemView
            if (r5 == 0) goto L1e
            int r4 = r4.getVisibility()
            if (r4 != 0) goto L1e
            int r3 = r3 + 1
        L1e:
            int r2 = r2 + 1
            goto Lc
        L21:
            return r3
    }

    private boolean hasBadge() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    private static void setViewLayoutParams(android.view.View r1, int r2, int r3) {
            android.view.ViewGroup$LayoutParams r0 = r1.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r2
            r0.gravity = r3
            r1.setLayoutParams(r0)
            return
    }

    private static void setViewScaleValues(android.view.View r0, float r1, float r2, int r3) {
            r0.setScaleX(r1)
            r0.setScaleY(r2)
            r0.setVisibility(r3)
            return
    }

    private void tryAttachBadgeToAnchor(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            if (r3 == 0) goto L19
            r0 = 0
            r2.setClipChildren(r0)
            r2.setClipToPadding(r0)
            com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
            android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
            com.google.android.material.badge.BadgeUtils.attachBadgeDrawable(r0, r3, r1)
        L19:
            return
    }

    private void tryRemoveBadgeFromAnchor(android.view.View r2) {
            r1 = this;
            boolean r0 = r1.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            if (r2 == 0) goto L15
            r0 = 1
            r1.setClipChildren(r0)
            r1.setClipToPadding(r0)
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            com.google.android.material.badge.BadgeUtils.detachBadgeDrawable(r0, r2)
        L15:
            r2 = 0
            r1.badgeDrawable = r2
            return
    }

    private void tryUpdateBadgeBounds(android.view.View r3) {
            r2 = this;
            boolean r0 = r2.hasBadge()
            if (r0 != 0) goto L7
            return
        L7:
            com.google.android.material.badge.BadgeDrawable r0 = r2.badgeDrawable
            android.widget.FrameLayout r1 = r2.getCustomParentForBadge(r3)
            com.google.android.material.badge.BadgeUtils.setBadgeDrawableBounds(r0, r3, r1)
            return
    }

    private static void updateViewPaddingBottom(android.view.View r3, int r4) {
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingTop()
            int r2 = r3.getPaddingRight()
            r3.setPadding(r0, r1, r2, r4)
            return
    }

    com.google.android.material.badge.BadgeDrawable getBadge() {
            r1 = this;
            com.google.android.material.badge.BadgeDrawable r0 = r1.badgeDrawable
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            return r0
    }

    public int getItemPosition() {
            r1 = this;
            int r0 = r1.itemPosition
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r1, int r2) {
            r0 = this;
            r0.itemData = r1
            boolean r2 = r1.isCheckable()
            r0.setCheckable(r2)
            boolean r2 = r1.isChecked()
            r0.setChecked(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            java.lang.CharSequence r2 = r1.getTitle()
            r0.setTitle(r2)
            int r2 = r1.getItemId()
            r0.setId(r2)
            java.lang.CharSequence r2 = r1.getContentDescription()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L3d
            java.lang.CharSequence r2 = r1.getContentDescription()
            r0.setContentDescription(r2)
        L3d:
            java.lang.CharSequence r2 = r1.getTooltipText()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L4c
            java.lang.CharSequence r2 = r1.getTooltipText()
            goto L50
        L4c:
            java.lang.CharSequence r2 = r1.getTitle()
        L50:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r0, r2)
            boolean r1 = r1.isVisible()
            if (r1 == 0) goto L5b
            r1 = 0
            goto L5d
        L5b:
            r1 = 8
        L5d:
            r0.setVisibility(r1)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int[] r2 = super.onCreateDrawableState(r2)
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L1d
            boolean r0 = r0.isCheckable()
            if (r0 == 0) goto L1d
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            boolean r0 = r0.isChecked()
            if (r0 == 0) goto L1d
            int[] r0 = com.google.android.material.bottomnavigation.BottomNavigationItemView.CHECKED_STATE_SET
            mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r7) {
            r6 = this;
            super.onInitializeAccessibilityNodeInfo(r7)
            com.google.android.material.badge.BadgeDrawable r0 = r6.badgeDrawable
            if (r0 == 0) goto L45
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L45
            androidx.appcompat.view.menu.MenuItemImpl r0 = r6.itemData
            java.lang.CharSequence r0 = r0.getTitle()
            androidx.appcompat.view.menu.MenuItemImpl r1 = r6.itemData
            java.lang.CharSequence r1 = r1.getContentDescription()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L25
            androidx.appcompat.view.menu.MenuItemImpl r0 = r6.itemData
            java.lang.CharSequence r0 = r0.getContentDescription()
        L25:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r1 = ", "
            java.lang.StringBuilder r0 = r0.append(r1)
            com.google.android.material.badge.BadgeDrawable r1 = r6.badgeDrawable
            java.lang.CharSequence r1 = r1.getContentDescription()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.setContentDescription(r0)
        L45:
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r7 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r7)
            r0 = 0
            r1 = 1
            int r2 = r6.getItemVisiblePosition()
            r3 = 1
            r4 = 0
            boolean r5 = r6.isSelected()
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionItemInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(r0, r1, r2, r3, r4, r5)
            r7.setCollectionItemInfo(r0)
            boolean r0 = r6.isSelected()
            if (r0 == 0) goto L6b
            r0 = 0
            r7.setClickable(r0)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$AccessibilityActionCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_CLICK
            r7.removeAction(r0)
        L6b:
            android.content.res.Resources r0 = r6.getResources()
            int r1 = com.google.android.material.C0479R.string.item_view_role_description
            java.lang.String r0 = r0.getString(r1)
            r7.setRoleDescription(r0)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    void removeBadge() {
            r1 = this;
            android.widget.ImageView r0 = r1.icon
            r1.tryRemoveBadgeFromAnchor(r0)
            return
    }

    void setBadge(com.google.android.material.badge.BadgeDrawable r1) {
            r0 = this;
            r0.badgeDrawable = r1
            android.widget.ImageView r1 = r0.icon
            if (r1 == 0) goto L9
            r0.tryAttachBadgeToAnchor(r1)
        L9:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r1) {
            r0 = this;
            r0.refreshDrawableState()
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r9) {
            r8 = this;
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.largeLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r8.smallLabel
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r8.labelVisibilityMode
            r1 = -1
            r3 = 17
            r4 = 49
            r5 = 1065353216(0x3f800000, float:1.0)
            r6 = 4
            r7 = 0
            if (r0 == r1) goto Ld0
            if (r0 == 0) goto L98
            r1 = 1
            if (r0 == r1) goto L56
            if (r0 == r2) goto L41
            goto L14a
        L41:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r3)
            android.widget.TextView r0 = r8.largeLabel
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r1)
            goto L14a
        L56:
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C0479R.id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            if (r9 == 0) goto L83
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            float r1 = (float) r1
            float r2 = r8.shiftAmount
            float r1 = r1 + r2
            int r1 = (int) r1
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            setViewScaleValues(r0, r5, r5, r7)
            android.widget.TextView r0 = r8.smallLabel
            float r1 = r8.scaleUpFactor
            setViewScaleValues(r0, r1, r1, r6)
            goto L14a
        L83:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            float r1 = r8.scaleDownFactor
            setViewScaleValues(r0, r1, r1, r6)
            android.widget.TextView r0 = r8.smallLabel
            setViewScaleValues(r0, r5, r5, r7)
            goto L14a
        L98:
            if (r9 == 0) goto Lb8
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r4)
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C0479R.id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r7)
            goto Lc9
        Lb8:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r3)
            android.view.ViewGroup r0 = r8.labelGroup
            updateViewPaddingBottom(r0, r7)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r6)
        Lc9:
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r6)
            goto L14a
        Ld0:
            boolean r0 = r8.isShifting
            if (r0 == 0) goto L10b
            if (r9 == 0) goto Lf4
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r4)
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C0479R.id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r7)
            goto L105
        Lf4:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r3)
            android.view.ViewGroup r0 = r8.labelGroup
            updateViewPaddingBottom(r0, r7)
            android.widget.TextView r0 = r8.largeLabel
            r0.setVisibility(r6)
        L105:
            android.widget.TextView r0 = r8.smallLabel
            r0.setVisibility(r6)
            goto L14a
        L10b:
            android.view.ViewGroup r0 = r8.labelGroup
            int r1 = com.google.android.material.C0479R.id.mtrl_view_tag_bottom_padding
            java.lang.Object r1 = r0.getTag(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            updateViewPaddingBottom(r0, r1)
            if (r9 == 0) goto L137
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            float r1 = (float) r1
            float r2 = r8.shiftAmount
            float r1 = r1 + r2
            int r1 = (int) r1
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            setViewScaleValues(r0, r5, r5, r7)
            android.widget.TextView r0 = r8.smallLabel
            float r1 = r8.scaleUpFactor
            setViewScaleValues(r0, r1, r1, r6)
            goto L14a
        L137:
            android.widget.ImageView r0 = r8.icon
            int r1 = r8.defaultMargin
            setViewLayoutParams(r0, r1, r4)
            android.widget.TextView r0 = r8.largeLabel
            float r1 = r8.scaleDownFactor
            setViewScaleValues(r0, r1, r1, r6)
            android.widget.TextView r0 = r8.smallLabel
            setViewScaleValues(r0, r5, r5, r7)
        L14a:
            r8.refreshDrawableState()
            r8.setSelected(r9)
            return
    }

    @Override // android.view.View, androidx.appcompat.view.menu.MenuView.ItemView
    public void setEnabled(boolean r2) {
            r1 = this;
            super.setEnabled(r2)
            android.widget.TextView r0 = r1.smallLabel
            r0.setEnabled(r2)
            android.widget.TextView r0 = r1.largeLabel
            r0.setEnabled(r2)
            android.widget.ImageView r0 = r1.icon
            r0.setEnabled(r2)
            if (r2 == 0) goto L22
            android.content.Context r2 = r1.getContext()
            r0 = 1002(0x3ea, float:1.404E-42)
            androidx.core.view.PointerIconCompat r2 = androidx.core.view.PointerIconCompat.getSystemIcon(r2, r0)
            androidx.core.view.ViewCompat.setPointerIcon(r1, r2)
            goto L26
        L22:
            r2 = 0
            androidx.core.view.ViewCompat.setPointerIcon(r1, r2)
        L26:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.originalIconDrawable
            if (r2 != r0) goto L5
            return
        L5:
            r1.originalIconDrawable = r2
            if (r2 == 0) goto L25
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 != 0) goto L10
            goto L14
        L10:
            android.graphics.drawable.Drawable r2 = r0.newDrawable()
        L14:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            r1.wrappedIconDrawable = r2
            android.content.res.ColorStateList r0 = r1.iconTint
            if (r0 == 0) goto L25
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
        L25:
            android.widget.ImageView r0 = r1.icon
            r0.setImageDrawable(r2)
            return
    }

    public void setIconSize(int r2) {
            r1 = this;
            android.widget.ImageView r0 = r1.icon
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.width = r2
            r0.height = r2
            android.widget.ImageView r2 = r1.icon
            r2.setLayoutParams(r0)
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.iconTint = r2
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L12
            android.graphics.drawable.Drawable r0 = r1.wrappedIconDrawable
            if (r0 == 0) goto L12
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r2)
            android.graphics.drawable.Drawable r2 = r1.wrappedIconDrawable
            r2.invalidateSelf()
        L12:
            return
    }

    public void setItemBackground(int r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            goto Lc
        L4:
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
        Lc:
            r1.setItemBackground(r2)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r0 = r2.getConstantState()
            if (r0 == 0) goto L14
            android.graphics.drawable.Drawable$ConstantState r2 = r2.getConstantState()
            android.graphics.drawable.Drawable r2 = r2.newDrawable()
            android.graphics.drawable.Drawable r2 = r2.mutate()
        L14:
            androidx.core.view.ViewCompat.setBackground(r1, r2)
            return
    }

    public void setItemPosition(int r1) {
            r0 = this;
            r0.itemPosition = r1
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            int r0 = r1.labelVisibilityMode
            if (r0 == r2) goto L16
            r1.labelVisibilityMode = r2
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.itemData
            if (r2 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L16
            boolean r2 = r2.isChecked()
            r1.setChecked(r2)
        L16:
            return
    }

    public void setShifting(boolean r2) {
            r1 = this;
            boolean r0 = r1.isShifting
            if (r0 == r2) goto L16
            r1.isShifting = r2
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.itemData
            if (r2 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            if (r0 == 0) goto L16
            boolean r2 = r2.isChecked()
            r1.setChecked(r2)
        L16:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    public void setTextAppearanceActive(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.largeLabel
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            android.widget.TextView r2 = r1.smallLabel
            float r2 = r2.getTextSize()
            android.widget.TextView r0 = r1.largeLabel
            float r0 = r0.getTextSize()
            r1.calculateTextScaleFactors(r2, r0)
            return
    }

    public void setTextAppearanceInactive(int r2) {
            r1 = this;
            android.widget.TextView r0 = r1.smallLabel
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            android.widget.TextView r2 = r1.smallLabel
            float r2 = r2.getTextSize()
            android.widget.TextView r0 = r1.largeLabel
            float r0 = r0.getTextSize()
            r1.calculateTextScaleFactors(r2, r0)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            android.widget.TextView r0 = r1.smallLabel
            r0.setTextColor(r2)
            android.widget.TextView r0 = r1.largeLabel
            r0.setTextColor(r2)
        Lc:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.TextView r0 = r1.smallLabel
            r0.setText(r2)
            android.widget.TextView r0 = r1.largeLabel
            r0.setText(r2)
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L18
            java.lang.CharSequence r0 = r0.getContentDescription()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
        L18:
            r1.setContentDescription(r2)
        L1b:
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            if (r0 == 0) goto L30
            java.lang.CharSequence r0 = r0.getTooltipText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L2a
            goto L30
        L2a:
            androidx.appcompat.view.menu.MenuItemImpl r2 = r1.itemData
            java.lang.CharSequence r2 = r2.getTooltipText()
        L30:
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r1, r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }
}
