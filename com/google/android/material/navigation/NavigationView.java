package com.google.android.material.navigation;

/* loaded from: classes.dex */
public class NavigationView extends com.google.android.material.internal.ScrimInsetsFrameLayout {
    private static final int[] CHECKED_STATE_SET = null;
    private static final int DEF_STYLE_RES = 0;
    private static final int[] DISABLED_STATE_SET = null;
    private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
    com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener listener;
    private final int maxWidth;
    private final com.google.android.material.internal.NavigationMenu menu;
    private android.view.MenuInflater menuInflater;
    private android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener;
    private final com.google.android.material.internal.NavigationMenuPresenter presenter;
    private final int[] tmpLocation;



    public interface OnNavigationItemSelectedListener {
        boolean onNavigationItemSelected(android.view.MenuItem r1);
    }

    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.navigation.NavigationView.SavedState> CREATOR = null;
        public android.os.Bundle menuState;


        static {
                com.google.android.material.navigation.NavigationView$SavedState$1 r0 = new com.google.android.material.navigation.NavigationView$SavedState$1
                r0.<init>()
                com.google.android.material.navigation.NavigationView.SavedState.CREATOR = r0
                return
        }

        public SavedState(android.os.Parcel r1, java.lang.ClassLoader r2) {
                r0 = this;
                r0.<init>(r1, r2)
                android.os.Bundle r1 = r1.readBundle(r2)
                r0.menuState = r1
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
                android.os.Bundle r2 = r0.menuState
                r1.writeBundle(r2)
                return
        }
    }

    static {
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16842912(0x10100a0, float:2.3694006E-38)
            r3 = 0
            r1[r3] = r2
            com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET = r1
            int[] r0 = new int[r0]
            r1 = -16842910(0xfffffffffefeff62, float:-1.6947497E38)
            r0[r3] = r1
            com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET = r0
            int r0 = com.google.android.material.C0479R.style.Widget_Design_NavigationView
            com.google.android.material.navigation.NavigationView.DEF_STYLE_RES = r0
            return
    }

    public NavigationView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public NavigationView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.attr.navigationViewStyle
            r1.<init>(r2, r3, r0)
            return
    }

    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
            r10 = this;
            int r6 = com.google.android.material.navigation.NavigationView.DEF_STYLE_RES
            android.content.Context r11 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            com.google.android.material.internal.NavigationMenuPresenter r11 = new com.google.android.material.internal.NavigationMenuPresenter
            r11.<init>()
            r10.presenter = r11
            r0 = 2
            int[] r0 = new int[r0]
            r10.tmpLocation = r0
            android.content.Context r7 = r10.getContext()
            com.google.android.material.internal.NavigationMenu r8 = new com.google.android.material.internal.NavigationMenu
            r8.<init>(r7)
            r10.menu = r8
            int[] r2 = com.google.android.material.C0479R.styleable.NavigationView
            r9 = 0
            int[] r5 = new int[r9]
            r0 = r7
            r1 = r12
            r3 = r13
            r4 = r6
            androidx.appcompat.widget.TintTypedArray r0 = com.google.android.material.internal.ThemeEnforcement.obtainTintedStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r1 = com.google.android.material.C0479R.styleable.NavigationView_android_background
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L3e
            int r1 = com.google.android.material.C0479R.styleable.NavigationView_android_background
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1)
            androidx.core.view.ViewCompat.setBackground(r10, r1)
        L3e:
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            if (r1 == 0) goto L4c
            android.graphics.drawable.Drawable r1 = r10.getBackground()
            boolean r1 = r1 instanceof android.graphics.drawable.ColorDrawable
            if (r1 == 0) goto L74
        L4c:
            com.google.android.material.shape.ShapeAppearanceModel$Builder r12 = com.google.android.material.shape.ShapeAppearanceModel.builder(r7, r12, r13, r6)
            com.google.android.material.shape.ShapeAppearanceModel r12 = r12.build()
            android.graphics.drawable.Drawable r13 = r10.getBackground()
            com.google.android.material.shape.MaterialShapeDrawable r1 = new com.google.android.material.shape.MaterialShapeDrawable
            r1.<init>(r12)
            boolean r12 = r13 instanceof android.graphics.drawable.ColorDrawable
            if (r12 == 0) goto L6e
            android.graphics.drawable.ColorDrawable r13 = (android.graphics.drawable.ColorDrawable) r13
            int r12 = r13.getColor()
            android.content.res.ColorStateList r12 = android.content.res.ColorStateList.valueOf(r12)
            r1.setFillColor(r12)
        L6e:
            r1.initializeElevationOverlay(r7)
            androidx.core.view.ViewCompat.setBackground(r10, r1)
        L74:
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_elevation
            boolean r12 = r0.hasValue(r12)
            if (r12 == 0) goto L86
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_elevation
            int r12 = r0.getDimensionPixelSize(r12, r9)
            float r12 = (float) r12
            r10.setElevation(r12)
        L86:
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_android_fitsSystemWindows
            boolean r12 = r0.getBoolean(r12, r9)
            r10.setFitsSystemWindows(r12)
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_android_maxWidth
            int r12 = r0.getDimensionPixelSize(r12, r9)
            r10.maxWidth = r12
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_itemIconTint
            boolean r12 = r0.hasValue(r12)
            if (r12 == 0) goto La6
            int r12 = com.google.android.material.C0479R.styleable.NavigationView_itemIconTint
            android.content.res.ColorStateList r12 = r0.getColorStateList(r12)
            goto Lad
        La6:
            r12 = 16842808(0x1010038, float:2.3693715E-38)
            android.content.res.ColorStateList r12 = r10.createDefaultColorStateList(r12)
        Lad:
            int r13 = com.google.android.material.C0479R.styleable.NavigationView_itemTextAppearance
            boolean r13 = r0.hasValue(r13)
            r1 = 1
            if (r13 == 0) goto Lbe
            int r13 = com.google.android.material.C0479R.styleable.NavigationView_itemTextAppearance
            int r13 = r0.getResourceId(r13, r9)
            r2 = r1
            goto Lc0
        Lbe:
            r13 = r9
            r2 = r13
        Lc0:
            int r3 = com.google.android.material.C0479R.styleable.NavigationView_itemIconSize
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto Ld1
            int r3 = com.google.android.material.C0479R.styleable.NavigationView_itemIconSize
            int r3 = r0.getDimensionPixelSize(r3, r9)
            r10.setItemIconSize(r3)
        Ld1:
            int r3 = com.google.android.material.C0479R.styleable.NavigationView_itemTextColor
            boolean r3 = r0.hasValue(r3)
            if (r3 == 0) goto Le0
            int r3 = com.google.android.material.C0479R.styleable.NavigationView_itemTextColor
            android.content.res.ColorStateList r3 = r0.getColorStateList(r3)
            goto Le1
        Le0:
            r3 = 0
        Le1:
            if (r2 != 0) goto Lec
            if (r3 != 0) goto Lec
            r3 = 16842806(0x1010036, float:2.369371E-38)
            android.content.res.ColorStateList r3 = r10.createDefaultColorStateList(r3)
        Lec:
            int r4 = com.google.android.material.C0479R.styleable.NavigationView_itemBackground
            android.graphics.drawable.Drawable r4 = r0.getDrawable(r4)
            if (r4 != 0) goto Lfe
            boolean r5 = r10.hasShapeAppearance(r0)
            if (r5 == 0) goto Lfe
            android.graphics.drawable.Drawable r4 = r10.createDefaultItemBackground(r0)
        Lfe:
            int r5 = com.google.android.material.C0479R.styleable.NavigationView_itemHorizontalPadding
            boolean r5 = r0.hasValue(r5)
            if (r5 == 0) goto L10f
            int r5 = com.google.android.material.C0479R.styleable.NavigationView_itemHorizontalPadding
            int r5 = r0.getDimensionPixelSize(r5, r9)
            r11.setItemHorizontalPadding(r5)
        L10f:
            int r5 = com.google.android.material.C0479R.styleable.NavigationView_itemIconPadding
            int r5 = r0.getDimensionPixelSize(r5, r9)
            int r6 = com.google.android.material.C0479R.styleable.NavigationView_itemMaxLines
            int r6 = r0.getInt(r6, r1)
            r10.setItemMaxLines(r6)
            com.google.android.material.navigation.NavigationView$1 r6 = new com.google.android.material.navigation.NavigationView$1
            r6.<init>(r10)
            r8.setCallback(r6)
            r11.setId(r1)
            r11.initForMenu(r7, r8)
            r11.setItemIconTintList(r12)
            int r12 = r10.getOverScrollMode()
            r11.setOverScrollMode(r12)
            if (r2 == 0) goto L13b
            r11.setItemTextAppearance(r13)
        L13b:
            r11.setItemTextColor(r3)
            r11.setItemBackground(r4)
            r11.setItemIconPadding(r5)
            r8.addMenuPresenter(r11)
            androidx.appcompat.view.menu.MenuView r11 = r11.getMenuView(r10)
            android.view.View r11 = (android.view.View) r11
            r10.addView(r11)
            int r11 = com.google.android.material.C0479R.styleable.NavigationView_menu
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L161
            int r11 = com.google.android.material.C0479R.styleable.NavigationView_menu
            int r11 = r0.getResourceId(r11, r9)
            r10.inflateMenu(r11)
        L161:
            int r11 = com.google.android.material.C0479R.styleable.NavigationView_headerLayout
            boolean r11 = r0.hasValue(r11)
            if (r11 == 0) goto L172
            int r11 = com.google.android.material.C0479R.styleable.NavigationView_headerLayout
            int r11 = r0.getResourceId(r11, r9)
            r10.inflateHeaderView(r11)
        L172:
            r0.recycle()
            r10.setupInsetScrimsListener()
            return
    }

    static /* synthetic */ int[] access$000(com.google.android.material.navigation.NavigationView r0) {
            int[] r0 = r0.tmpLocation
            return r0
    }

    static /* synthetic */ com.google.android.material.internal.NavigationMenuPresenter access$100(com.google.android.material.navigation.NavigationView r0) {
            com.google.android.material.internal.NavigationMenuPresenter r0 = r0.presenter
            return r0
    }

    private android.content.res.ColorStateList createDefaultColorStateList(int r11) {
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
            int[] r6 = com.google.android.material.navigation.NavigationView.DISABLED_STATE_SET
            r7 = 0
            r5[r7] = r6
            int[] r8 = com.google.android.material.navigation.NavigationView.CHECKED_STATE_SET
            r5[r2] = r8
            int[] r8 = com.google.android.material.navigation.NavigationView.EMPTY_STATE_SET
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

    private final android.graphics.drawable.Drawable createDefaultItemBackground(androidx.appcompat.widget.TintTypedArray r10) {
            r9 = this;
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeAppearance
            r1 = 0
            int r0 = r10.getResourceId(r0, r1)
            int r2 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeAppearanceOverlay
            int r2 = r10.getResourceId(r2, r1)
            com.google.android.material.shape.MaterialShapeDrawable r4 = new com.google.android.material.shape.MaterialShapeDrawable
            android.content.Context r3 = r9.getContext()
            com.google.android.material.shape.ShapeAppearanceModel$Builder r0 = com.google.android.material.shape.ShapeAppearanceModel.builder(r3, r0, r2)
            com.google.android.material.shape.ShapeAppearanceModel r0 = r0.build()
            r4.<init>(r0)
            android.content.Context r0 = r9.getContext()
            int r2 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeFillColor
            android.content.res.ColorStateList r0 = com.google.android.material.resources.MaterialResources.getColorStateList(r0, r10, r2)
            r4.setFillColor(r0)
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeInsetStart
            int r5 = r10.getDimensionPixelSize(r0, r1)
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeInsetTop
            int r6 = r10.getDimensionPixelSize(r0, r1)
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeInsetEnd
            int r7 = r10.getDimensionPixelSize(r0, r1)
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeInsetBottom
            int r8 = r10.getDimensionPixelSize(r0, r1)
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
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

    private boolean hasShapeAppearance(androidx.appcompat.widget.TintTypedArray r2) {
            r1 = this;
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeAppearance
            boolean r0 = r2.hasValue(r0)
            if (r0 != 0) goto L13
            int r0 = com.google.android.material.C0479R.styleable.NavigationView_itemShapeAppearanceOverlay
            boolean r2 = r2.hasValue(r0)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            goto L14
        L13:
            r2 = 1
        L14:
            return r2
    }

    private void setupInsetScrimsListener() {
            r2 = this;
            com.google.android.material.navigation.NavigationView$2 r0 = new com.google.android.material.navigation.NavigationView$2
            r0.<init>(r2)
            r2.onGlobalLayoutListener = r0
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.addOnGlobalLayoutListener(r1)
            return
    }

    public void addHeaderView(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.addHeaderView(r2)
            return
    }

    public android.view.MenuItem getCheckedItem() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r0 = r0.getCheckedItem()
            return r0
    }

    public int getHeaderCount() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getHeaderCount()
            return r0
    }

    public android.view.View getHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.getHeaderView(r2)
            return r2
    }

    public android.graphics.drawable.Drawable getItemBackground() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.graphics.drawable.Drawable r0 = r0.getItemBackground()
            return r0
    }

    public int getItemHorizontalPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemHorizontalPadding()
            return r0
    }

    public int getItemIconPadding() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemIconPadding()
            return r0
    }

    public android.content.res.ColorStateList getItemIconTintList() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTintList()
            return r0
    }

    public int getItemMaxLines() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            int r0 = r0.getItemMaxLines()
            return r0
    }

    public android.content.res.ColorStateList getItemTextColor() {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.content.res.ColorStateList r0 = r0.getItemTextColor()
            return r0
    }

    public android.view.Menu getMenu() {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            return r0
    }

    public android.view.View inflateHeaderView(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            android.view.View r2 = r0.inflateHeaderView(r2)
            return r2
    }

    public void inflateMenu(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            r1 = 1
            r0.setUpdateSuspended(r1)
            android.view.MenuInflater r0 = r2.getMenuInflater()
            com.google.android.material.internal.NavigationMenu r1 = r2.menu
            r0.inflate(r3, r1)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r0 = 0
            r3.setUpdateSuspended(r0)
            com.google.android.material.internal.NavigationMenuPresenter r3 = r2.presenter
            r3.updateMenuView(r0)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            com.google.android.material.shape.MaterialShapeUtils.setParentAbsoluteElevation(r0)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
            r2 = this;
            super.onDetachedFromWindow()
            android.view.ViewTreeObserver r0 = r2.getViewTreeObserver()
            android.view.ViewTreeObserver$OnGlobalLayoutListener r1 = r2.onGlobalLayoutListener
            r0.removeOnGlobalLayoutListener(r1)
            return
    }

    @Override // com.google.android.material.internal.ScrimInsetsFrameLayout
    protected void onInsetsChanged(androidx.core.view.WindowInsetsCompat r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.dispatchApplyWindowInsets(r2)
            return
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int r4, int r5) {
            r3 = this;
            int r0 = android.view.View.MeasureSpec.getMode(r4)
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 == r1) goto L14
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            int r4 = r3.maxWidth
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
            goto L22
        L14:
            int r4 = android.view.View.MeasureSpec.getSize(r4)
            int r0 = r3.maxWidth
            int r4 = java.lang.Math.min(r4, r0)
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r4, r2)
        L22:
            super.onMeasure(r4, r5)
            return
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.google.android.material.navigation.NavigationView.SavedState
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            com.google.android.material.navigation.NavigationView$SavedState r2 = (com.google.android.material.navigation.NavigationView.SavedState) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.os.Bundle r2 = r2.menuState
            r0.restorePresenterStates(r2)
            return
    }

    @Override // android.view.View
    protected android.os.Parcelable onSaveInstanceState() {
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            com.google.android.material.navigation.NavigationView$SavedState r1 = new com.google.android.material.navigation.NavigationView$SavedState
            r1.<init>(r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.menuState = r0
            com.google.android.material.internal.NavigationMenu r0 = r3.menu
            android.os.Bundle r2 = r1.menuState
            r0.savePresenterStates(r2)
            return r1
    }

    public void removeHeaderView(android.view.View r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.removeHeaderView(r2)
            return
    }

    public void setCheckedItem(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto Lf
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
        Lf:
            return
    }

    public void setCheckedItem(android.view.MenuItem r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenu r0 = r1.menu
            int r2 = r2.getItemId()
            android.view.MenuItem r2 = r0.findItem(r2)
            if (r2 == 0) goto L14
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            r0.setCheckedItem(r2)
            return
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Called setCheckedItem(MenuItem) with an item that is not in the current menu."
            r2.<init>(r0)
            throw r2
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
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemBackground(r2)
            return
    }

    public void setItemBackgroundResource(int r2) {
            r1 = this;
            android.content.Context r0 = r1.getContext()
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.setItemBackground(r2)
            return
    }

    public void setItemHorizontalPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemHorizontalPadding(r2)
            return
    }

    public void setItemHorizontalPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemHorizontalPadding(r3)
            return
    }

    public void setItemIconPadding(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconPadding(r2)
            return
    }

    public void setItemIconPaddingResource(int r3) {
            r2 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r2.presenter
            android.content.res.Resources r1 = r2.getResources()
            int r3 = r1.getDimensionPixelSize(r3)
            r0.setItemIconPadding(r3)
            return
    }

    public void setItemIconSize(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconSize(r2)
            return
    }

    public void setItemIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemIconTintList(r2)
            return
    }

    public void setItemMaxLines(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemMaxLines(r2)
            return
    }

    public void setItemTextAppearance(int r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextAppearance(r2)
            return
    }

    public void setItemTextColor(android.content.res.ColorStateList r2) {
            r1 = this;
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            r0.setItemTextColor(r2)
            return
    }

    public void setNavigationItemSelectedListener(com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener r1) {
            r0 = this;
            r0.listener = r1
            return
    }

    @Override // android.view.View
    public void setOverScrollMode(int r2) {
            r1 = this;
            super.setOverScrollMode(r2)
            com.google.android.material.internal.NavigationMenuPresenter r0 = r1.presenter
            if (r0 == 0) goto La
            r0.setOverScrollMode(r2)
        La:
            return
    }
}
