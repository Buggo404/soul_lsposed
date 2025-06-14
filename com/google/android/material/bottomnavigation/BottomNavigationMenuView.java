package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public class BottomNavigationMenuView extends android.view.ViewGroup implements androidx.appcompat.view.menu.MenuView {
    private static final long ACTIVE_ANIMATION_DURATION_MS = 115;
    private static final int[] CHECKED_STATE_SET = null;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int ITEM_POOL_SIZE = 5;
    private final int activeItemMaxWidth;
    private final int activeItemMinWidth;
    private android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> badgeDrawables;
    private com.google.android.material.bottomnavigation.BottomNavigationItemView[] buttons;
    private final int inactiveItemMaxWidth;
    private final int inactiveItemMinWidth;
    private android.graphics.drawable.Drawable itemBackground;
    private int itemBackgroundRes;
    private final int itemHeight;
    private boolean itemHorizontalTranslationEnabled;
    private int itemIconSize;
    private android.content.res.ColorStateList itemIconTint;
    private final androidx.core.util.Pools.Pool<com.google.android.material.bottomnavigation.BottomNavigationItemView> itemPool;
    private int itemTextAppearanceActive;
    private int itemTextAppearanceInactive;
    private final android.content.res.ColorStateList itemTextColorDefault;
    private android.content.res.ColorStateList itemTextColorFromUser;
    private int labelVisibilityMode;
    private androidx.appcompat.view.menu.MenuBuilder menu;
    private final android.view.View.OnClickListener onClickListener;
    private final android.util.SparseArray<android.view.View.OnTouchListener> onTouchListeners;
    private com.google.android.material.bottomnavigation.BottomNavigationPresenter presenter;
    private int selectedItemId;
    private int selectedItemPosition;
    private final androidx.transition.TransitionSet set;
    private int[] tempChildWidths;


    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.bottomnavigation.BottomNavigationMenuView.CHECKED_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r3] = r1
            com.google.android.material.bottomnavigation.BottomNavigationMenuView.DISABLED_STATE_SET = r0
            return
    }

    public BottomNavigationMenuView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomNavigationMenuView(android.content.Context r4, android.util.AttributeSet r5) {
            r3 = this;
            r3.<init>(r4, r5)
            androidx.core.util.Pools$SynchronizedPool r4 = new androidx.core.util.Pools$SynchronizedPool
            r5 = 5
            r4.<init>(r5)
            r3.itemPool = r4
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>(r5)
            r3.onTouchListeners = r4
            r4 = 0
            r3.selectedItemId = r4
            r3.selectedItemPosition = r4
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>(r5)
            r3.badgeDrawables = r0
            android.content.res.Resources r0 = r3.getResources()
            int r1 = com.google.android.material.C0479R.dimen.design_bottom_navigation_item_max_width
            int r1 = r0.getDimensionPixelSize(r1)
            r3.inactiveItemMaxWidth = r1
            int r1 = com.google.android.material.C0479R.dimen.design_bottom_navigation_item_min_width
            int r1 = r0.getDimensionPixelSize(r1)
            r3.inactiveItemMinWidth = r1
            int r1 = com.google.android.material.C0479R.dimen.design_bottom_navigation_active_item_max_width
            int r1 = r0.getDimensionPixelSize(r1)
            r3.activeItemMaxWidth = r1
            int r1 = com.google.android.material.C0479R.dimen.design_bottom_navigation_active_item_min_width
            int r1 = r0.getDimensionPixelSize(r1)
            r3.activeItemMinWidth = r1
            int r1 = com.google.android.material.C0479R.dimen.design_bottom_navigation_height
            int r0 = r0.getDimensionPixelSize(r1)
            r3.itemHeight = r0
            r0 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r0 = r3.createDefaultColorStateList(r0)
            r3.itemTextColorDefault = r0
            androidx.transition.AutoTransition r0 = new androidx.transition.AutoTransition
            r0.<init>()
            r3.set = r0
            r0.setOrdering(r4)
            r1 = 115(0x73, double:5.7E-322)
            r0.setDuration(r1)
            androidx.interpolator.view.animation.FastOutSlowInInterpolator r4 = new androidx.interpolator.view.animation.FastOutSlowInInterpolator
            r4.<init>()
            r0.setInterpolator(r4)
            com.google.android.material.internal.TextScale r4 = new com.google.android.material.internal.TextScale
            r4.<init>()
            r0.addTransition(r4)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView$1 r4 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView$1
            r4.<init>(r3)
            r3.onClickListener = r4
            int[] r4 = new int[r5]
            r3.tempChildWidths = r4
            r4 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r3, r4)
            return
    }

    static /* synthetic */ com.google.android.material.bottomnavigation.BottomNavigationPresenter access$000(com.google.android.material.bottomnavigation.BottomNavigationMenuView r0) {
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r0 = r0.presenter
            return r0
    }

    static /* synthetic */ androidx.appcompat.view.menu.MenuBuilder access$100(com.google.android.material.bottomnavigation.BottomNavigationMenuView r0) {
            androidx.appcompat.view.menu.MenuBuilder r0 = r0.menu
            return r0
    }

    private com.google.android.material.bottomnavigation.BottomNavigationItemView getNewItem() {
            r2 = this;
            androidx.core.util.Pools$Pool<com.google.android.material.bottomnavigation.BottomNavigationItemView> r0 = r2.itemPool
            java.lang.Object r0 = r0.acquire()
            com.google.android.material.bottomnavigation.BottomNavigationItemView r0 = (com.google.android.material.bottomnavigation.BottomNavigationItemView) r0
            if (r0 != 0) goto L13
            com.google.android.material.bottomnavigation.BottomNavigationItemView r0 = new com.google.android.material.bottomnavigation.BottomNavigationItemView
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
        L13:
            return r0
    }

    private boolean isShifting(int r4, int r5) {
            r3 = this;
            r0 = -1
            r1 = 1
            r2 = 0
            if (r4 != r0) goto L9
            r4 = 3
            if (r5 <= r4) goto Lc
            goto Ld
        L9:
            if (r4 != 0) goto Lc
            goto Ld
        Lc:
            r1 = r2
        Ld:
            return r1
    }

    private boolean isValidId(int r2) {
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L5
            r2 = 1
            goto L6
        L5:
            r2 = 0
        L6:
            return r2
    }

    private void removeUnusedBadges() {
            r4 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r1 = 0
            r2 = r1
        L7:
            androidx.appcompat.view.menu.MenuBuilder r3 = r4.menu
            int r3 = r3.size()
            if (r2 >= r3) goto L23
            androidx.appcompat.view.menu.MenuBuilder r3 = r4.menu
            android.view.MenuItem r3 = r3.getItem(r2)
            int r3 = r3.getItemId()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.add(r3)
            int r2 = r2 + 1
            goto L7
        L23:
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r2 = r4.badgeDrawables
            int r2 = r2.size()
            if (r1 >= r2) goto L43
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r2 = r4.badgeDrawables
            int r2 = r2.keyAt(r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L40
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r3 = r4.badgeDrawables
            r3.delete(r2)
        L40:
            int r1 = r1 + 1
            goto L23
        L43:
            return
    }

    private void setBadgeIfNeeded(com.google.android.material.bottomnavigation.BottomNavigationItemView r3) {
            r2 = this;
            int r0 = r3.getId()
            boolean r1 = r2.isValidId(r0)
            if (r1 != 0) goto Lb
            return
        Lb:
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r1 = r2.badgeDrawables
            java.lang.Object r0 = r1.get(r0)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            if (r0 == 0) goto L18
            r3.setBadge(r0)
        L18:
            return
    }

    private void validateMenuItemId(int r3) {
            r2 = this;
            boolean r0 = r2.isValidId(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r3 = r1.append(r3)
            java.lang.String r1 = " is not a valid view id"
            java.lang.StringBuilder r3 = r3.append(r1)
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public void buildMenuView() {
            r6 = this;
            r6.removeAllViews()
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r6.buttons
            r1 = 0
            if (r0 == 0) goto L1b
            int r2 = r0.length
            r3 = r1
        La:
            if (r3 >= r2) goto L1b
            r4 = r0[r3]
            if (r4 == 0) goto L18
            androidx.core.util.Pools$Pool<com.google.android.material.bottomnavigation.BottomNavigationItemView> r5 = r6.itemPool
            r5.release(r4)
            r4.removeBadge()
        L18:
            int r3 = r3 + 1
            goto La
        L1b:
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            if (r0 != 0) goto L2b
            r6.selectedItemId = r1
            r6.selectedItemPosition = r1
            r0 = 0
            r6.buttons = r0
            return
        L2b:
            r6.removeUnusedBadges()
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = new com.google.android.material.bottomnavigation.BottomNavigationItemView[r0]
            r6.buttons = r0
            int r0 = r6.labelVisibilityMode
            androidx.appcompat.view.menu.MenuBuilder r2 = r6.menu
            java.util.ArrayList r2 = r2.getVisibleItems()
            int r2 = r2.size()
            boolean r0 = r6.isShifting(r0, r2)
            r2 = r1
        L49:
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            int r3 = r3.size()
            r4 = 1
            if (r2 >= r3) goto Ld4
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r3 = r6.presenter
            r3.setUpdateSuspended(r4)
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            android.view.MenuItem r3 = r3.getItem(r2)
            r3.setCheckable(r4)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r3 = r6.presenter
            r3.setUpdateSuspended(r1)
            com.google.android.material.bottomnavigation.BottomNavigationItemView r3 = r6.getNewItem()
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r4 = r6.buttons
            r4[r2] = r3
            android.content.res.ColorStateList r4 = r6.itemIconTint
            r3.setIconTintList(r4)
            int r4 = r6.itemIconSize
            r3.setIconSize(r4)
            android.content.res.ColorStateList r4 = r6.itemTextColorDefault
            r3.setTextColor(r4)
            int r4 = r6.itemTextAppearanceInactive
            r3.setTextAppearanceInactive(r4)
            int r4 = r6.itemTextAppearanceActive
            r3.setTextAppearanceActive(r4)
            android.content.res.ColorStateList r4 = r6.itemTextColorFromUser
            r3.setTextColor(r4)
            android.graphics.drawable.Drawable r4 = r6.itemBackground
            if (r4 == 0) goto L93
            r3.setItemBackground(r4)
            goto L98
        L93:
            int r4 = r6.itemBackgroundRes
            r3.setItemBackground(r4)
        L98:
            r3.setShifting(r0)
            int r4 = r6.labelVisibilityMode
            r3.setLabelVisibilityMode(r4)
            androidx.appcompat.view.menu.MenuBuilder r4 = r6.menu
            android.view.MenuItem r4 = r4.getItem(r2)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            r3.initialize(r4, r1)
            r3.setItemPosition(r2)
            int r4 = r4.getItemId()
            android.util.SparseArray<android.view.View$OnTouchListener> r5 = r6.onTouchListeners
            java.lang.Object r5 = r5.get(r4)
            android.view.View$OnTouchListener r5 = (android.view.View.OnTouchListener) r5
            r3.setOnTouchListener(r5)
            android.view.View$OnClickListener r5 = r6.onClickListener
            r3.setOnClickListener(r5)
            int r5 = r6.selectedItemId
            if (r5 == 0) goto Lca
            if (r4 != r5) goto Lca
            r6.selectedItemPosition = r2
        Lca:
            r6.setBadgeIfNeeded(r3)
            r6.addView(r3)
            int r2 = r2 + 1
            goto L49
        Ld4:
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            int r0 = r0.size()
            int r0 = r0 - r4
            int r1 = r6.selectedItemPosition
            int r0 = java.lang.Math.min(r0, r1)
            r6.selectedItemPosition = r0
            androidx.appcompat.view.menu.MenuBuilder r1 = r6.menu
            android.view.MenuItem r0 = r1.getItem(r0)
            r0.setChecked(r4)
            return
    }

    public android.content.res.ColorStateList createDefaultColorStateList(int r11) {
            r10 = this;
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r10.getContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 1
            boolean r11 = r1.resolveAttribute(r11, r0, r2)
            r1 = 0
            if (r11 != 0) goto L16
            return r1
        L16:
            android.content.Context r11 = r10.getContext()
            int r3 = r0.resourceId
            android.content.res.ColorStateList r11 = androidx.appcompat.content.res.AppCompatResources.getColorStateList(r11, r3)
            android.content.Context r3 = r10.getContext()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            int r4 = androidx.appcompat.C0015R.attr.colorPrimary
            boolean r3 = r3.resolveAttribute(r4, r0, r2)
            if (r3 != 0) goto L31
            return r1
        L31:
            int r0 = r0.data
            int r1 = r11.getDefaultColor()
            android.content.res.ColorStateList r3 = new android.content.res.ColorStateList
            r4 = 3
            int[][] r5 = new int[r4][]
            int[] r6 = com.google.android.material.bottomnavigation.BottomNavigationMenuView.DISABLED_STATE_SET
            r7 = 0
            r5[r7] = r6
            int[] r8 = com.google.android.material.bottomnavigation.BottomNavigationMenuView.CHECKED_STATE_SET
            r5[r2] = r8
            int[] r8 = com.google.android.material.bottomnavigation.BottomNavigationMenuView.EMPTY_STATE_SET
            r9 = 2
            r5[r9] = r8
            int[] r4 = new int[r4]
            int r11 = r11.getColorForState(r6, r1)
            r4[r7] = r11
            r4[r2] = r0
            r4[r9] = r1
            r3.<init>(r5, r4)
            return r3
    }

    com.google.android.material.bottomnavigation.BottomNavigationItemView findItemView(int r6) {
            r5 = this;
            r5.validateMenuItemId(r6)
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r5.buttons
            if (r0 == 0) goto L17
            int r1 = r0.length
            r2 = 0
        L9:
            if (r2 >= r1) goto L17
            r3 = r0[r2]
            int r4 = r3.getId()
            if (r4 != r6) goto L14
            return r3
        L14:
            int r2 = r2 + 1
            goto L9
        L17:
            r6 = 0
            return r6
    }

    com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r1.badgeDrawables
            java.lang.Object r2 = r0.get(r2)
            com.google.android.material.badge.BadgeDrawable r2 = (com.google.android.material.badge.BadgeDrawable) r2
            return r2
    }

    android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> getBadgeDrawables() {
            r1 = this;
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r1.badgeDrawables
            return r0
    }

    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemIconTint
            return r0
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r2 = this;
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r2.buttons
            if (r0 == 0) goto Lf
            int r1 = r0.length
            if (r1 <= 0) goto Lf
            r1 = 0
            r0 = r0[r1]
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            return r0
        Lf:
            android.graphics.drawable.Drawable r0 = r2.itemBackground
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundRes() {
            r1 = this;
            int r0 = r1.itemBackgroundRes
            return r0
    }

    public int getItemIconSize() {
            r1 = this;
            int r0 = r1.itemIconSize
            return r0
    }

    public int getItemTextAppearanceActive() {
            r1 = this;
            int r0 = r1.itemTextAppearanceActive
            return r0
    }

    public int getItemTextAppearanceInactive() {
            r1 = this;
            int r0 = r1.itemTextAppearanceInactive
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemTextColorFromUser
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            int r0 = r1.labelVisibilityMode
            return r0
    }

    com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r3) {
            r2 = this;
            r2.validateMenuItemId(r3)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            if (r0 != 0) goto L1a
            android.content.Context r0 = r2.getContext()
            com.google.android.material.badge.BadgeDrawable r0 = com.google.android.material.badge.BadgeDrawable.create(r0)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r1 = r2.badgeDrawables
            r1.put(r3, r0)
        L1a:
            com.google.android.material.bottomnavigation.BottomNavigationItemView r3 = r2.findItemView(r3)
            if (r3 == 0) goto L23
            r3.setBadge(r0)
        L23:
            return r0
    }

    public int getSelectedItemId() {
            r1 = this;
            int r0 = r1.selectedItemId
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public int getWindowAnimations() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void initialize(androidx.appcompat.view.menu.MenuBuilder r1) {
            r0 = this;
            r0.menu = r1
            return
    }

    public boolean isItemHorizontalTranslationEnabled() {
            r1 = this;
            boolean r0 = r1.itemHorizontalTranslationEnabled
            return r0
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r4) {
            r3 = this;
            super.onInitializeAccessibilityNodeInfo(r4)
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat r4 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.wrap(r4)
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            java.util.ArrayList r0 = r0.getVisibleItems()
            int r0 = r0.size()
            r1 = 0
            r2 = 1
            androidx.core.view.accessibility.AccessibilityNodeInfoCompat$CollectionInfoCompat r0 = androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(r2, r0, r1, r2)
            r4.setCollectionInfo(r0)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
            r4 = this;
            int r5 = r4.getChildCount()
            int r8 = r8 - r6
            int r9 = r9 - r7
            r6 = 0
            r7 = r6
            r0 = r7
        L9:
            if (r7 >= r5) goto L3b
            android.view.View r1 = r4.getChildAt(r7)
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 != r3) goto L18
            goto L38
        L18:
            int r2 = androidx.core.view.ViewCompat.getLayoutDirection(r4)
            r3 = 1
            if (r2 != r3) goto L2b
            int r2 = r8 - r0
            int r3 = r1.getMeasuredWidth()
            int r3 = r2 - r3
            r1.layout(r3, r6, r2, r9)
            goto L33
        L2b:
            int r2 = r1.getMeasuredWidth()
            int r2 = r2 + r0
            r1.layout(r0, r6, r2, r9)
        L33:
            int r1 = r1.getMeasuredWidth()
            int r0 = r0 + r1
        L38:
            int r7 = r7 + 1
            goto L9
        L3b:
            return
    }

    @Override // android.view.View
    protected void onMeasure(int r11, int r12) {
            r10 = this;
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            androidx.appcompat.view.menu.MenuBuilder r12 = r10.menu
            java.util.ArrayList r12 = r12.getVisibleItems()
            int r12 = r12.size()
            int r0 = r10.getChildCount()
            int r1 = r10.itemHeight
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r2)
            int r3 = r10.labelVisibilityMode
            boolean r3 = r10.isShifting(r3, r12)
            r4 = 8
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L9b
            boolean r3 = r10.itemHorizontalTranslationEnabled
            if (r3 == 0) goto L9b
            int r3 = r10.selectedItemPosition
            android.view.View r3 = r10.getChildAt(r3)
            int r7 = r10.activeItemMinWidth
            int r8 = r3.getVisibility()
            if (r8 == r4) goto L4b
            int r8 = r10.activeItemMaxWidth
            r9 = -2147483648(0xffffffff80000000, float:-0.0)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r8, r9)
            r3.measure(r8, r1)
            int r8 = r3.getMeasuredWidth()
            int r7 = java.lang.Math.max(r7, r8)
        L4b:
            int r3 = r3.getVisibility()
            if (r3 == r4) goto L53
            r3 = r5
            goto L54
        L53:
            r3 = r6
        L54:
            int r12 = r12 - r3
            int r3 = r10.inactiveItemMinWidth
            int r3 = r3 * r12
            int r3 = r11 - r3
            int r8 = r10.activeItemMaxWidth
            int r7 = java.lang.Math.min(r7, r8)
            int r3 = java.lang.Math.min(r3, r7)
            int r11 = r11 - r3
            if (r12 != 0) goto L68
            goto L69
        L68:
            r5 = r12
        L69:
            int r5 = r11 / r5
            int r7 = r10.inactiveItemMaxWidth
            int r5 = java.lang.Math.min(r5, r7)
            int r12 = r12 * r5
            int r11 = r11 - r12
            r12 = r6
        L74:
            if (r12 >= r0) goto Lca
            android.view.View r7 = r10.getChildAt(r12)
            int r7 = r7.getVisibility()
            if (r7 == r4) goto L94
            int[] r7 = r10.tempChildWidths
            int r8 = r10.selectedItemPosition
            if (r12 != r8) goto L88
            r8 = r3
            goto L89
        L88:
            r8 = r5
        L89:
            r7[r12] = r8
            if (r11 <= 0) goto L98
            int r8 = r8 + 1
            r7[r12] = r8
            int r11 = r11 + (-1)
            goto L98
        L94:
            int[] r7 = r10.tempChildWidths
            r7[r12] = r6
        L98:
            int r12 = r12 + 1
            goto L74
        L9b:
            if (r12 != 0) goto L9e
            goto L9f
        L9e:
            r5 = r12
        L9f:
            int r3 = r11 / r5
            int r5 = r10.activeItemMaxWidth
            int r3 = java.lang.Math.min(r3, r5)
            int r12 = r12 * r3
            int r11 = r11 - r12
            r12 = r6
        Laa:
            if (r12 >= r0) goto Lca
            android.view.View r5 = r10.getChildAt(r12)
            int r5 = r5.getVisibility()
            if (r5 == r4) goto Lc3
            int[] r5 = r10.tempChildWidths
            r5[r12] = r3
            if (r11 <= 0) goto Lc7
            int r7 = r3 + 1
            r5[r12] = r7
            int r11 = r11 + (-1)
            goto Lc7
        Lc3:
            int[] r5 = r10.tempChildWidths
            r5[r12] = r6
        Lc7:
            int r12 = r12 + 1
            goto Laa
        Lca:
            r11 = r6
            r12 = r11
        Lcc:
            if (r11 >= r0) goto Lf6
            android.view.View r3 = r10.getChildAt(r11)
            int r5 = r3.getVisibility()
            if (r5 != r4) goto Ld9
            goto Lf3
        Ld9:
            int[] r5 = r10.tempChildWidths
            r5 = r5[r11]
            int r5 = android.view.View.MeasureSpec.makeMeasureSpec(r5, r2)
            r3.measure(r5, r1)
            android.view.ViewGroup$LayoutParams r5 = r3.getLayoutParams()
            int r7 = r3.getMeasuredWidth()
            r5.width = r7
            int r3 = r3.getMeasuredWidth()
            int r12 = r12 + r3
        Lf3:
            int r11 = r11 + 1
            goto Lcc
        Lf6:
            int r11 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r2)
            int r11 = android.view.View.resolveSizeAndState(r12, r11, r6)
            int r12 = r10.itemHeight
            int r12 = android.view.View.resolveSizeAndState(r12, r1, r6)
            r10.setMeasuredDimension(r11, r12)
            return
    }

    void removeBadge(int r3) {
            r2 = this;
            r2.validateMenuItemId(r3)
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            java.lang.Object r0 = r0.get(r3)
            com.google.android.material.badge.BadgeDrawable r0 = (com.google.android.material.badge.BadgeDrawable) r0
            com.google.android.material.bottomnavigation.BottomNavigationItemView r1 = r2.findItemView(r3)
            if (r1 == 0) goto L14
            r1.removeBadge()
        L14:
            if (r0 == 0) goto L1b
            android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r0 = r2.badgeDrawables
            r0.remove(r3)
        L1b:
            return
    }

    void setBadgeDrawables(android.util.SparseArray<com.google.android.material.badge.BadgeDrawable> r6) {
            r5 = this;
            r5.badgeDrawables = r6
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r5.buttons
            if (r0 == 0) goto L1c
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            int r4 = r3.getId()
            java.lang.Object r4 = r6.get(r4)
            com.google.android.material.badge.BadgeDrawable r4 = (com.google.android.material.badge.BadgeDrawable) r4
            r3.setBadge(r4)
            int r2 = r2 + 1
            goto L8
        L1c:
            return
    }

    public void setIconTintList(android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemIconTint = r5
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconTintList(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r5) {
            r4 = this;
            r4.itemBackground = r5
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemBackgroundRes(int r5) {
            r4 = this;
            r4.itemBackgroundRes = r5
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setItemBackground(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemHorizontalTranslationEnabled(boolean r1) {
            r0 = this;
            r0.itemHorizontalTranslationEnabled = r1
            return
    }

    public void setItemIconSize(int r5) {
            r4 = this;
            r4.itemIconSize = r5
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setIconSize(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setItemOnTouchListener(int r6, android.view.View.OnTouchListener r7) {
            r5 = this;
            if (r7 != 0) goto L8
            android.util.SparseArray<android.view.View$OnTouchListener> r0 = r5.onTouchListeners
            r0.remove(r6)
            goto Ld
        L8:
            android.util.SparseArray<android.view.View$OnTouchListener> r0 = r5.onTouchListeners
            r0.put(r6, r7)
        Ld:
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r5.buttons
            if (r0 == 0) goto L27
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L27
            r3 = r0[r2]
            androidx.appcompat.view.menu.MenuItemImpl r4 = r3.getItemData()
            int r4 = r4.getItemId()
            if (r4 != r6) goto L24
            r3.setOnTouchListener(r7)
        L24:
            int r2 = r2 + 1
            goto L13
        L27:
            return
    }

    public void setItemTextAppearanceActive(int r6) {
            r5 = this;
            r5.itemTextAppearanceActive = r6
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r5.buttons
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceActive(r6)
            android.content.res.ColorStateList r4 = r5.itemTextColorFromUser
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextAppearanceInactive(int r6) {
            r5 = this;
            r5.itemTextAppearanceInactive = r6
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r5.buttons
            if (r0 == 0) goto L19
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L19
            r3 = r0[r2]
            r3.setTextAppearanceInactive(r6)
            android.content.res.ColorStateList r4 = r5.itemTextColorFromUser
            if (r4 == 0) goto L16
            r3.setTextColor(r4)
        L16:
            int r2 = r2 + 1
            goto L8
        L19:
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r5) {
            r4 = this;
            r4.itemTextColorFromUser = r5
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r0 = r4.buttons
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r3.setTextColor(r5)
            int r2 = r2 + 1
            goto L8
        L12:
            return
    }

    public void setLabelVisibilityMode(int r1) {
            r0 = this;
            r0.labelVisibilityMode = r1
            return
    }

    public void setPresenter(com.google.android.material.bottomnavigation.BottomNavigationPresenter r1) {
            r0 = this;
            r0.presenter = r1
            return
    }

    void tryRestoreSelectedItemId(int r5) {
            r4 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.menu
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L21
            androidx.appcompat.view.menu.MenuBuilder r2 = r4.menu
            android.view.MenuItem r2 = r2.getItem(r1)
            int r3 = r2.getItemId()
            if (r5 != r3) goto L1e
            r4.selectedItemId = r5
            r4.selectedItemPosition = r1
            r5 = 1
            r2.setChecked(r5)
            goto L21
        L1e:
            int r1 = r1 + 1
            goto L7
        L21:
            return
    }

    public void updateMenuView() {
            r6 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r6.menu
            if (r0 == 0) goto L7d
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r1 = r6.buttons
            if (r1 != 0) goto La
            goto L7d
        La:
            int r0 = r0.size()
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r1 = r6.buttons
            int r1 = r1.length
            if (r0 == r1) goto L17
            r6.buildMenuView()
            return
        L17:
            int r1 = r6.selectedItemId
            r2 = 0
            r3 = r2
        L1b:
            if (r3 >= r0) goto L34
            androidx.appcompat.view.menu.MenuBuilder r4 = r6.menu
            android.view.MenuItem r4 = r4.getItem(r3)
            boolean r5 = r4.isChecked()
            if (r5 == 0) goto L31
            int r4 = r4.getItemId()
            r6.selectedItemId = r4
            r6.selectedItemPosition = r3
        L31:
            int r3 = r3 + 1
            goto L1b
        L34:
            int r3 = r6.selectedItemId
            if (r1 == r3) goto L3d
            androidx.transition.TransitionSet r1 = r6.set
            androidx.transition.TransitionManager.beginDelayedTransition(r6, r1)
        L3d:
            int r1 = r6.labelVisibilityMode
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.menu
            java.util.ArrayList r3 = r3.getVisibleItems()
            int r3 = r3.size()
            boolean r1 = r6.isShifting(r1, r3)
            r3 = r2
        L4e:
            if (r3 >= r0) goto L7d
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r4 = r6.presenter
            r5 = 1
            r4.setUpdateSuspended(r5)
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r4 = r6.buttons
            r4 = r4[r3]
            int r5 = r6.labelVisibilityMode
            r4.setLabelVisibilityMode(r5)
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r4 = r6.buttons
            r4 = r4[r3]
            r4.setShifting(r1)
            com.google.android.material.bottomnavigation.BottomNavigationItemView[] r4 = r6.buttons
            r4 = r4[r3]
            androidx.appcompat.view.menu.MenuBuilder r5 = r6.menu
            android.view.MenuItem r5 = r5.getItem(r3)
            androidx.appcompat.view.menu.MenuItemImpl r5 = (androidx.appcompat.view.menu.MenuItemImpl) r5
            r4.initialize(r5, r2)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r4 = r6.presenter
            r4.setUpdateSuspended(r2)
            int r3 = r3 + 1
            goto L4e
        L7d:
            return
    }
}
