package com.google.android.material.bottomnavigation;

/* loaded from: classes.dex */
public class BottomNavigationView extends android.widget.FrameLayout {
    private static final int DEF_STYLE_RES = 0;
    private static final int MENU_PRESENTER_ID = 1;
    private android.content.res.ColorStateList itemRippleColor;
    private final androidx.appcompat.view.menu.MenuBuilder menu;
    private android.view.MenuInflater menuInflater;
    final com.google.android.material.bottomnavigation.BottomNavigationMenuView menuView;
    private final com.google.android.material.bottomnavigation.BottomNavigationPresenter presenter;
    private com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener reselectedListener;
    private com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener selectedListener;



    public interface OnNavigationItemReselectedListener {
        void onNavigationItemReselected(android.view.MenuItem r1);
    }

    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem r1);
    }

    static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomnavigation.BottomNavigationView.SavedState> CREATOR = null;
        android.os.Bundle menuPresenterState;


        static {
                com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$1 r0 = new com.google.android.material.bottomnavigation.BottomNavigationView$SavedState$1
                r0.<init>()
                com.google.android.material.bottomnavigation.BottomNavigationView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                if (r2 != 0) goto Ld
                java.lang.Class r2 = r0.getClass()
                java.lang.ClassLoader r2 = r2.getClassLoader()
            Ld:
                r0.readFromParcel(r1, r2)
                return
        }

        public SavedState(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private void readFromParcel(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuPresenterState = r1
                return
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                android.os.Bundle r2 = r0.menuPresenterState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            int r0 = com.google.android.material.C0479R.style.Widget_Design_BottomNavigationView
            com.google.android.material.bottomnavigation.BottomNavigationView.DEF_STYLE_RES = r0
            return
    }

    public BottomNavigationView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public BottomNavigationView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.bottomNavigationStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public BottomNavigationView(android.content.Context r13, android.util.AttributeSet r14, int r15) {
            r12 = this;
            int r0 = com.google.android.material.bottomnavigation.BottomNavigationView.DEF_STYLE_RES
            android.content.Context r13 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r13, r14, r15, r0)
            r12.<init>(r13, r14, r15)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r13 = new com.google.android.material.bottomnavigation.BottomNavigationPresenter
            r13.<init>()
            r12.presenter = r13
            android.content.Context r6 = r12.getContext()
            com.google.android.material.bottomnavigation.BottomNavigationMenu r7 = new com.google.android.material.bottomnavigation.BottomNavigationMenu
            r7.<init>(r6)
            r12.menu = r7
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r8 = new com.google.android.material.bottomnavigation.BottomNavigationMenuView
            r8.<init>(r6)
            r12.menuView = r8
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            r0 = -2
            r9.<init>(r0, r0)
            r0 = 17
            r9.gravity = r0
            r8.setLayoutParams(r9)
            r13.setBottomNavigationMenuView(r8)
            r10 = 1
            r13.setId(r10)
            r8.setPresenter(r13)
            r7.addMenuPresenter(r13)
            android.content.Context r0 = r12.getContext()
            r13.initForMenu(r0, r7)
            int[] r2 = com.google.android.material.C0479R.styleable.BottomNavigationView
            int r4 = com.google.android.material.C0479R.style.Widget_Design_BottomNavigationView
            r13 = 2
            int[] r5 = new int[r13]
            int r13 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceInactive
            r11 = 0
            r5[r11] = r13
            int r13 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceActive
            r5[r10] = r13
            r0 = r6
            r1 = r14
            r3 = r15
            androidx.appcompat.widget.TintTypedArray r13 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemIconTint
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L6c
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemIconTint
            android.content.res.ColorStateList r14 = r13.getColorStateList(r14)
            r8.setIconTintList(r14)
            goto L76
        L6c:
            r14 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r14 = r8.createDefaultColorStateList(r14)
            r8.setIconTintList(r14)
        L76:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemIconSize
            android.content.res.Resources r15 = r12.getResources()
            int r0 = com.google.android.material.C0479R.dimen.design_bottom_navigation_icon_size
            int r15 = r15.getDimensionPixelSize(r0)
            int r14 = r13.getDimensionPixelSize(r14, r15)
            r12.setItemIconSize(r14)
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceInactive
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L9a
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceInactive
            int r14 = r13.getResourceId(r14, r11)
            r12.setItemTextAppearanceInactive(r14)
        L9a:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceActive
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Lab
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextAppearanceActive
            int r14 = r13.getResourceId(r14, r11)
            r12.setItemTextAppearanceActive(r14)
        Lab:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextColor
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Lbc
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemTextColor
            android.content.res.ColorStateList r14 = r13.getColorStateList(r14)
            r12.setItemTextColor(r14)
        Lbc:
            android.graphics.drawable.Drawable r14 = r12.getBackground()
            if (r14 == 0) goto Lca
            android.graphics.drawable.Drawable r14 = r12.getBackground()
            boolean r14 = r14 instanceof android.graphics.drawable.ColorDrawable
            if (r14 == 0) goto Ld1
        Lca:
            com.google.android.material.shape.MaterialShapeDrawable r14 = r12.createMaterialShapeDrawableBackground(r6)
            androidx.core.view.ViewCompat.setBackground(r12, r14)
        Ld1:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_elevation
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto Le3
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_elevation
            int r14 = r13.getDimensionPixelSize(r14, r11)
            float r14 = (float) r14
            r12.setElevation(r14)
        Le3:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_backgroundTint
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r13, r14)
            android.graphics.drawable.Drawable r15 = r12.getBackground()
            android.graphics.drawable.Drawable r15 = r15.mutate()
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r15, r14)
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_labelVisibilityMode
            r15 = -1
            int r14 = r13.getInteger(r14, r15)
            r12.setLabelVisibilityMode(r14)
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled
            boolean r14 = r13.getBoolean(r14, r10)
            r12.setItemHorizontalTranslationEnabled(r14)
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemBackground
            int r14 = r13.getResourceId(r14, r11)
            if (r14 == 0) goto L113
            r8.setItemBackgroundRes(r14)
            goto L11c
        L113:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_itemRippleColor
            android.content.res.ColorStateList r14 = com.google.android.material.resources.MaterialResources.getColorStateList(r6, r13, r14)
            r12.setItemRippleColor(r14)
        L11c:
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_menu
            boolean r14 = r13.hasValue(r14)
            if (r14 == 0) goto L12d
            int r14 = com.google.android.material.C0479R.styleable.BottomNavigationView_menu
            int r14 = r13.getResourceId(r14, r11)
            r12.inflateMenu(r14)
        L12d:
            r13.recycle()
            r12.addView(r8, r9)
            boolean r13 = r12.shouldDrawCompatibilityTopDivider()
            if (r13 == 0) goto L13c
            r12.addCompatibilityTopDivider(r6)
        L13c:
            com.google.android.material.bottomnavigation.BottomNavigationView$1 r13 = new com.google.android.material.bottomnavigation.BottomNavigationView$1
            r13.<init>(r12)
            r7.setCallback(r13)
            r12.applyWindowInsets()
            return
    }

    static /* synthetic */ com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener access$000(com.google.android.material.bottomnavigation.BottomNavigationView r0) {
            com.google.android.material.bottomnavigation.BottomNavigationView$OnNavigationItemReselectedListener r0 = r0.reselectedListener
            return r0
    }

    static /* synthetic */ com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener access$100(com.google.android.material.bottomnavigation.BottomNavigationView r0) {
            com.google.android.material.bottomnavigation.BottomNavigationView$OnNavigationItemSelectedListener r0 = r0.selectedListener
            return r0
    }

    private void addCompatibilityTopDivider(android.content.Context r4) {
            r3 = this;
            android.view.View r0 = new android.view.View
            r0.<init>(r4)
            int r1 = com.google.android.material.C0479R.color.design_bottom_navigation_shadow_color
            int r4 = androidx.core.content.ContextCompat.getColor(r4, r1)
            r0.setBackgroundColor(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            android.content.res.Resources r1 = r3.getResources()
            int r2 = com.google.android.material.C0479R.dimen.design_bottom_navigation_shadow_height
            int r1 = r1.getDimensionPixelSize(r2)
            r2 = -1
            r4.<init>(r2, r1)
            r0.setLayoutParams(r4)
            r3.addView(r0)
            return
    }

    private void applyWindowInsets() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationView$2 r0 = new com.google.android.material.bottomnavigation.BottomNavigationView$2
            r0.<init>(r1)
            com.google.android.material.internal.ViewUtils.doOnApplyWindowInsets(r1, r0)
            return
    }

    private com.google.android.material.shape.MaterialShapeDrawable createMaterialShapeDrawableBackground(android.content.Context r4) {
            r3 = this;
            com.google.android.material.shape.MaterialShapeDrawable r0 = new com.google.android.material.shape.MaterialShapeDrawable
            r0.<init>()
            android.graphics.drawable.Drawable r1 = r3.getBackground()
            boolean r2 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r2 == 0) goto L1a
            android.graphics.drawable.ColorDrawable r1 = (android.graphics.drawable.ColorDrawable) r1
            int r1 = r1.getColor()
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setFillColor(r1)
        L1a:
            r0.initializeElevationOverlay(r4)
            return r0
    }

    private android.view.MenuInflater getMenuInflater() {
            r2 = this;
            android.view.MenuInflater r0 = r2.menuInflater
            if (r0 != 0) goto Lf
            androidx.appcompat.view.SupportMenuInflater r0 = new androidx.appcompat.view.SupportMenuInflater
            android.content.Context r1 = r2.getContext()
            r0.<init>(r1)
            r2.menuInflater = r0
        Lf:
            android.view.MenuInflater r0 = r2.menuInflater
            return r0
    }

    private boolean shouldDrawCompatibilityTopDivider() {
            r1 = this;
            r0 = 0
            return r0
    }

    public com.google.android.material.badge.BadgeDrawable getBadge(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getBadge(r2)
            return r2
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    @java.lang.Deprecated
    public int getItemBackgroundResource() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getItemBackgroundRes()
            return r0
    }

    public int getItemIconSize() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getItemIconSize()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getIconTintList()
            return r0
    }

    public android.content.res.ColorStateList getItemRippleColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.itemRippleColor
            return r0
    }

    public int getItemTextAppearanceActive() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceActive()
            return r0
    }

    public int getItemTextAppearanceInactive() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getItemTextAppearanceInactive()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public int getLabelVisibilityMode() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            return r0
    }

    public int getMaxItemCount() {
            r1 = this;
            r0 = 5
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.menu
            return r0
    }

    public com.google.android.material.badge.BadgeDrawable getOrCreateBadge(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            com.google.android.material.badge.BadgeDrawable r2 = r0.getOrCreateBadge(r2)
            return r2
    }

    public int getSelectedItemId() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getSelectedItemId()
            return r0
    }

    public void inflateMenu(int r4) {
            r3 = this;
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r0 = r3.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r3.getMenuInflater()
            androidx.appcompat.view.menu.MenuBuilder r2 = r3.menu
            r0.inflate(r4, r2)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r4 = r3.presenter
            r0 = 0
            r4.setUpdateSuspended(r0)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r4 = r3.presenter
            r4.updateMenuView(r1)
            return
    }

    public boolean isItemHorizontalTranslationEnabled() {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            boolean r0 = r0.isItemHorizontalTranslationEnabled()
            return r0
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.bottomnavigation.BottomNavigationView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.bottomnavigation.BottomNavigationView$SavedState r2 = (com.google.android.material.bottomnavigation.BottomNavigationView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.menu
            android.os.Bundle r2 = r2.menuPresenterState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.bottomnavigation.BottomNavigationView$SavedState r1 = new com.google.android.material.bottomnavigation.BottomNavigationView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuPresenterState = r0
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            android.os.Bundle r2 = r1.menuPresenterState
            r0.savePresenterStates(r2)
            return r1
    }

    public void removeBadge(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.removeBadge(r2)
            return
    }

    @Override // android.view.View
    public void setElevation(float r1) {
            r0 = this;
            super.setElevation(r1)
            com.google.android.material.shape.MaterialShapeUtils.setElevation(r0, r1)
            return
    }

    public void setItemBackground(android.graphics.drawable.Drawable r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemBackground(r2)
            r2 = 0
            r1.itemRippleColor = r2
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemBackgroundRes(r2)
            r2 = 0
            r1.itemRippleColor = r2
            return
    }

    public void setItemHorizontalTranslationEnabled(boolean r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            boolean r0 = r0.isItemHorizontalTranslationEnabled()
            if (r0 == r2) goto L13
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemHorizontalTranslationEnabled(r2)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r2 = r1.presenter
            r0 = 0
            r2.updateMenuView(r0)
        L13:
            return
    }

    public void setItemIconSize(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconSizeRes(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            int r2 = r0.getDimensionPixelSize(r2)
            r1.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setIconTintList(r2)
            return
    }

    public void setItemOnTouchListener(int r2, android.view.View.OnTouchListener r3) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemOnTouchListener(r2, r3)
            return
    }

    public void setItemRippleColor(android.content.res.ColorStateList r4) {
            r3 = this;
            android.content.res.ColorStateList r0 = r3.itemRippleColor
            r1 = 0
            if (r0 != r4) goto L15
            if (r4 != 0) goto L14
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r4 = r3.menuView
            android.graphics.drawable.Drawable r4 = r4.getItemBackground()
            if (r4 == 0) goto L14
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r4 = r3.menuView
            r4.setItemBackground(r1)
        L14:
            return
        L15:
            r3.itemRippleColor = r4
            if (r4 != 0) goto L1f
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r4 = r3.menuView
            r4.setItemBackground(r1)
            goto L2d
        L1f:
            android.content.res.ColorStateList r4 = com.google.android.material.ripple.RippleUtils.convertToRippleDrawableColor(r4)
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r3.menuView
            android.graphics.drawable.RippleDrawable r2 = new android.graphics.drawable.RippleDrawable
            r2.<init>(r4, r1, r1)
            r0.setItemBackground(r2)
        L2d:
            return
    }

    public void setItemTextAppearanceActive(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemTextAppearanceActive(r2)
            return
    }

    public void setItemTextAppearanceInactive(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemTextAppearanceInactive(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setItemTextColor(r2)
            return
    }

    public void setLabelVisibilityMode(int r2) {
            r1 = this;
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            int r0 = r0.getLabelVisibilityMode()
            if (r0 == r2) goto L13
            com.google.android.material.bottomnavigation.BottomNavigationMenuView r0 = r1.menuView
            r0.setLabelVisibilityMode(r2)
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r2 = r1.presenter
            r0 = 0
            r2.updateMenuView(r0)
        L13:
            return
    }

    public void setOnNavigationItemReselectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemReselectedListener r1) {
            r0 = this;
            r0.reselectedListener = r1
            return
    }

    public void setOnNavigationItemSelectedListener(com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.selectedListener = r1
            return
    }

    public void setSelectedItemId(int r4) {
            r3 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            android.view.MenuItem r4 = r0.findItem(r4)
            if (r4 == 0) goto L17
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.menu
            com.google.android.material.bottomnavigation.BottomNavigationPresenter r1 = r3.presenter
            r2 = 0
            boolean r0 = r0.performItemAction(r4, r1, r2)
            if (r0 != 0) goto L17
            r0 = 1
            r4.setChecked(r0)
        L17:
            return
    }
}
