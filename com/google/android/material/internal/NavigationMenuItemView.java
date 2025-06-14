package com.google.android.material.internal;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends com.google.android.material.internal.ForegroundLinearLayout implements androidx.appcompat.view.menu.MenuView.ItemView {
    private static final int[] CHECKED_STATE_SET = null;
    private final androidx.core.view.AccessibilityDelegateCompat accessibilityDelegate;
    private android.widget.FrameLayout actionArea;
    boolean checkable;
    private android.graphics.drawable.Drawable emptyDrawable;
    private boolean hasIconTintList;
    private int iconSize;
    private android.content.res.ColorStateList iconTintList;
    private androidx.appcompat.view.menu.MenuItemImpl itemData;
    private boolean needsEmptyIcon;
    private final android.widget.CheckedTextView textView;


    static {
            r0 = 1
            int[] r0 = new int[r0]
            r1 = 0
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r0[r1] = r2
            com.google.android.material.internal.NavigationMenuItemView.CHECKED_STATE_SET = r0
            return
    }

    public NavigationMenuItemView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationMenuItemView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationMenuItemView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
            r2 = this;
            r2.<init>(r3, r4, r5)
            com.google.android.material.internal.NavigationMenuItemView$1 r4 = new com.google.android.material.internal.NavigationMenuItemView$1
            r4.<init>(r2)
            r2.accessibilityDelegate = r4
            r5 = 0
            r2.setOrientation(r5)
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r3)
            int r0 = com.google.android.material.C0479R.layout.design_navigation_menu_item
            r1 = 1
            r5.inflate(r0, r2, r1)
            android.content.res.Resources r3 = r3.getResources()
            int r5 = com.google.android.material.C0479R.dimen.design_navigation_icon_size
            int r3 = r3.getDimensionPixelSize(r5)
            r2.setIconSize(r3)
            int r3 = com.google.android.material.C0479R.id.design_menu_item_text
            android.view.View r3 = r2.findViewById(r3)
            android.widget.CheckedTextView r3 = (android.widget.CheckedTextView) r3
            r2.textView = r3
            r3.setDuplicateParentStateEnabled(r1)
            androidx.core.view.ViewCompat.setAccessibilityDelegate(r3, r4)
            return
    }

    private void adjustAppearance() {
            r2 = this;
            boolean r0 = r2.shouldExpandActionArea()
            if (r0 == 0) goto L20
            android.widget.CheckedTextView r0 = r2.textView
            r1 = 8
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r2.actionArea
            if (r0 == 0) goto L38
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            r1 = -1
            r0.width = r1
            android.widget.FrameLayout r1 = r2.actionArea
            r1.setLayoutParams(r0)
            goto L38
        L20:
            android.widget.CheckedTextView r0 = r2.textView
            r1 = 0
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r2.actionArea
            if (r0 == 0) goto L38
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r0 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r0
            r1 = -2
            r0.width = r1
            android.widget.FrameLayout r1 = r2.actionArea
            r1.setLayoutParams(r0)
        L38:
            return
    }

    private android.graphics.drawable.StateListDrawable createDefaultBackground() {
            r4 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            int r2 = androidx.appcompat.C0015R.attr.colorControlHighlight
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L33
            android.graphics.drawable.StateListDrawable r1 = new android.graphics.drawable.StateListDrawable
            r1.<init>()
            int[] r2 = com.google.android.material.internal.NavigationMenuItemView.CHECKED_STATE_SET
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            int r0 = r0.data
            r3.<init>(r0)
            r1.addState(r2, r3)
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.EMPTY_STATE_SET
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r3 = 0
            r2.<init>(r3)
            r1.addState(r0, r2)
            return r1
        L33:
            r0 = 0
            return r0
    }

    private void setActionView(android.view.View r2) {
            r1 = this;
            if (r2 == 0) goto L20
            android.widget.FrameLayout r0 = r1.actionArea
            if (r0 != 0) goto L16
            int r0 = com.google.android.material.C0479R.id.design_menu_item_action_area_stub
            android.view.View r0 = r1.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r0 = r0.inflate()
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r1.actionArea = r0
        L16:
            android.widget.FrameLayout r0 = r1.actionArea
            r0.removeAllViews()
            android.widget.FrameLayout r0 = r1.actionArea
            r0.addView(r2)
        L20:
            return
    }

    private boolean shouldExpandActionArea() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            java.lang.CharSequence r0 = r0.getTitle()
            if (r0 != 0) goto L1a
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            android.graphics.drawable.Drawable r0 = r0.getIcon()
            if (r0 != 0) goto L1a
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            android.view.View r0 = r0.getActionView()
            if (r0 == 0) goto L1a
            r0 = 1
            goto L1b
        L1a:
            r0 = 0
        L1b:
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public androidx.appcompat.view.menu.MenuItemImpl getItemData() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.itemData
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(androidx.appcompat.view.menu.MenuItemImpl r1, int r2) {
            r0 = this;
            r0.itemData = r1
            int r2 = r1.getItemId()
            if (r2 <= 0) goto Lf
            int r2 = r1.getItemId()
            r0.setId(r2)
        Lf:
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L17
            r2 = 0
            goto L19
        L17:
            r2 = 8
        L19:
            r0.setVisibility(r2)
            android.graphics.drawable.Drawable r2 = r0.getBackground()
            if (r2 != 0) goto L29
            android.graphics.drawable.StateListDrawable r2 = r0.createDefaultBackground()
            androidx.core.view.ViewCompat.setBackground(r0, r2)
        L29:
            boolean r2 = r1.isCheckable()
            r0.setCheckable(r2)
            boolean r2 = r1.isChecked()
            r0.setChecked(r2)
            boolean r2 = r1.isEnabled()
            r0.setEnabled(r2)
            java.lang.CharSequence r2 = r1.getTitle()
            r0.setTitle(r2)
            android.graphics.drawable.Drawable r2 = r1.getIcon()
            r0.setIcon(r2)
            android.view.View r2 = r1.getActionView()
            r0.setActionView(r2)
            java.lang.CharSequence r2 = r1.getContentDescription()
            r0.setContentDescription(r2)
            java.lang.CharSequence r1 = r1.getTooltipText()
            androidx.appcompat.widget.TooltipCompat.setTooltipText(r0, r1)
            r0.adjustAppearance()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int r2) {
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
            int[] r0 = com.google.android.material.internal.NavigationMenuItemView.CHECKED_STATE_SET
            mergeDrawableStates(r2, r0)
        L1d:
            return r2
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void recycle() {
            r2 = this;
            android.widget.FrameLayout r0 = r2.actionArea
            if (r0 == 0) goto L7
            r0.removeAllViews()
        L7:
            android.widget.CheckedTextView r0 = r2.textView
            r1 = 0
            r0.setCompoundDrawables(r1, r1, r1, r1)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean r3) {
            r2 = this;
            r2.refreshDrawableState()
            boolean r0 = r2.checkable
            if (r0 == r3) goto L12
            r2.checkable = r3
            androidx.core.view.AccessibilityDelegateCompat r3 = r2.accessibilityDelegate
            android.widget.CheckedTextView r0 = r2.textView
            r1 = 2048(0x800, float:2.87E-42)
            r3.sendAccessibilityEvent(r0, r1)
        L12:
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean r2) {
            r1 = this;
            r1.refreshDrawableState()
            android.widget.CheckedTextView r0 = r1.textView
            r0.setChecked(r2)
            return
    }

    public void setHorizontalPadding(int r2) {
            r1 = this;
            r0 = 0
            r1.setPadding(r2, r0, r2, r0)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(android.graphics.drawable.Drawable r4) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L25
            boolean r1 = r3.hasIconTintList
            if (r1 == 0) goto L1f
            android.graphics.drawable.Drawable$ConstantState r1 = r4.getConstantState()
            if (r1 != 0) goto Le
            goto L12
        Le:
            android.graphics.drawable.Drawable r4 = r1.newDrawable()
        L12:
            android.graphics.drawable.Drawable r4 = androidx.core.graphics.drawable.DrawableCompat.wrap(r4)
            android.graphics.drawable.Drawable r4 = r4.mutate()
            android.content.res.ColorStateList r1 = r3.iconTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r4, r1)
        L1f:
            int r1 = r3.iconSize
            r4.setBounds(r0, r0, r1, r1)
            goto L4a
        L25:
            boolean r1 = r3.needsEmptyIcon
            if (r1 == 0) goto L4a
            android.graphics.drawable.Drawable r4 = r3.emptyDrawable
            if (r4 != 0) goto L48
            android.content.res.Resources r4 = r3.getResources()
            int r1 = com.google.android.material.C0479R.drawable.navigation_empty_icon
            android.content.Context r2 = r3.getContext()
            android.content.res.Resources$Theme r2 = r2.getTheme()
            android.graphics.drawable.Drawable r4 = androidx.core.content.res.ResourcesCompat.getDrawable(r4, r1, r2)
            r3.emptyDrawable = r4
            if (r4 == 0) goto L48
            int r1 = r3.iconSize
            r4.setBounds(r0, r0, r1, r1)
        L48:
            android.graphics.drawable.Drawable r4 = r3.emptyDrawable
        L4a:
            android.widget.CheckedTextView r0 = r3.textView
            r1 = 0
            androidx.core.widget.TextViewCompat.setCompoundDrawablesRelative(r0, r4, r1, r1, r1)
            return
    }

    public void setIconPadding(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.textView
            r0.setCompoundDrawablePadding(r2)
            return
    }

    public void setIconSize(int r1) {
            r0 = this;
            r0.iconSize = r1
            return
    }

    void setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.iconTintList = r1
            if (r1 == 0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            r0.hasIconTintList = r1
            androidx.appcompat.view.menu.MenuItemImpl r1 = r0.itemData
            if (r1 == 0) goto L14
            android.graphics.drawable.Drawable r1 = r1.getIcon()
            r0.setIcon(r1)
        L14:
            return
    }

    public void setMaxLines(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.textView
            r0.setMaxLines(r2)
            return
    }

    public void setNeedsEmptyIcon(boolean r1) {
            r0 = this;
            r0.needsEmptyIcon = r1
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean r1, char r2) {
            r0 = this;
            return
    }

    public void setTextAppearance(int r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.textView
            androidx.core.widget.TextViewCompat.setTextAppearance(r0, r2)
            return
    }

    public void setTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.textView
            r0.setTextColor(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.textView
            r0.setText(r2)
            return
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
            r1 = this;
            r0 = 1
            return r0
    }
}
