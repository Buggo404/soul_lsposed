package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public final class MenuItemImpl implements androidx.core.internal.view.SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private static final int IS_ACTION = 32;
    static final int NO_ICON = 0;
    private static final int SHOW_AS_ACTION_MASK = 3;
    private static final java.lang.String TAG = "MenuItemImpl";
    private androidx.core.view.ActionProvider mActionProvider;
    private android.view.View mActionView;
    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private java.lang.CharSequence mContentDescription;
    private int mFlags;
    private final int mGroup;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private android.graphics.drawable.Drawable mIconDrawable;
    private int mIconResId;
    private android.content.res.ColorStateList mIconTintList;
    private android.graphics.PorterDuff.Mode mIconTintMode;
    private final int mId;
    private android.content.Intent mIntent;
    private boolean mIsActionViewExpanded;
    private java.lang.Runnable mItemCallback;
    androidx.appcompat.view.menu.MenuBuilder mMenu;
    private android.view.ContextMenu.ContextMenuInfo mMenuInfo;
    private boolean mNeedToApplyIconTint;
    private android.view.MenuItem.OnActionExpandListener mOnActionExpandListener;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private int mShowAsAction;
    private androidx.appcompat.view.menu.SubMenuBuilder mSubMenu;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mTitleCondensed;
    private java.lang.CharSequence mTooltipText;


    MenuItemImpl(androidx.appcompat.view.menu.MenuBuilder r3, int r4, int r5, int r6, int r7, java.lang.CharSequence r8, int r9) {
            r2 = this;
            r2.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            r2.mShortcutNumericModifiers = r0
            r2.mShortcutAlphabeticModifiers = r0
            r0 = 0
            r2.mIconResId = r0
            r1 = 0
            r2.mIconTintList = r1
            r2.mIconTintMode = r1
            r2.mHasIconTint = r0
            r2.mHasIconTintMode = r0
            r2.mNeedToApplyIconTint = r0
            r1 = 16
            r2.mFlags = r1
            r2.mIsActionViewExpanded = r0
            r2.mMenu = r3
            r2.mId = r5
            r2.mGroup = r4
            r2.mCategoryOrder = r6
            r2.mOrdering = r7
            r2.mTitle = r8
            r2.mShowAsAction = r9
            return
    }

    private static void appendModifier(java.lang.StringBuilder r0, int r1, int r2, java.lang.String r3) {
            r1 = r1 & r2
            if (r1 != r2) goto L6
            r0.append(r3)
        L6:
            return
    }

    private android.graphics.drawable.Drawable applyIconTintIfNecessary(android.graphics.drawable.Drawable r2) {
            r1 = this;
            if (r2 == 0) goto L2b
            boolean r0 = r1.mNeedToApplyIconTint
            if (r0 == 0) goto L2b
            boolean r0 = r1.mHasIconTint
            if (r0 != 0) goto Le
            boolean r0 = r1.mHasIconTintMode
            if (r0 == 0) goto L2b
        Le:
            android.graphics.drawable.Drawable r2 = androidx.core.graphics.drawable.DrawableCompat.wrap(r2)
            android.graphics.drawable.Drawable r2 = r2.mutate()
            boolean r0 = r1.mHasIconTint
            if (r0 == 0) goto L1f
            android.content.res.ColorStateList r0 = r1.mIconTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r2, r0)
        L1f:
            boolean r0 = r1.mHasIconTintMode
            if (r0 == 0) goto L28
            android.graphics.PorterDuff$Mode r0 = r1.mIconTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r2, r0)
        L28:
            r0 = 0
            r1.mNeedToApplyIconTint = r0
        L2b:
            return r2
    }

    public void actionFormatChanged() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            r0.onItemActionRequestChanged(r1)
            return
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
            r2 = this;
            int r0 = r2.mShowAsAction
            r0 = r0 & 8
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.View r0 = r2.mActionView
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            android.view.MenuItem$OnActionExpandListener r0 = r2.mOnActionExpandListener
            if (r0 == 0) goto L1a
            boolean r0 = r0.onMenuItemActionCollapse(r2)
            if (r0 == 0) goto L19
            goto L1a
        L19:
            return r1
        L1a:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            boolean r0 = r0.collapseItemActionView(r2)
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
            r2 = this;
            boolean r0 = r2.hasCollapsibleActionView()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.view.MenuItem$OnActionExpandListener r0 = r2.mOnActionExpandListener
            if (r0 == 0) goto L14
            boolean r0 = r0.onMenuItemActionExpand(r2)
            if (r0 == 0) goto L13
            goto L14
        L13:
            return r1
        L14:
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            boolean r0 = r0.expandItemActionView(r2)
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "This is not supported, use MenuItemCompat.getActionProvider()"
            r0.<init>(r1)
            throw r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
            android.view.View r0 = r1.mActionView
            if (r0 == 0) goto L5
            return r0
        L5:
            androidx.core.view.ActionProvider r0 = r1.mActionProvider
            if (r0 == 0) goto L10
            android.view.View r0 = r0.onCreateActionView(r1)
            r1.mActionView = r0
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getAlphabeticModifiers() {
            r1 = this;
            int r0 = r1.mShortcutAlphabeticModifiers
            return r0
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
            r1 = this;
            char r0 = r1.mShortcutAlphabeticChar
            return r0
    }

    java.lang.Runnable getCallback() {
            r1 = this;
            java.lang.Runnable r0 = r1.mItemCallback
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mContentDescription
            return r0
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
            r1 = this;
            int r0 = r1.mGroup
            return r0
    }

    @Override // android.view.MenuItem
    public android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mIconDrawable
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r2.applyIconTintIfNecessary(r0)
            return r0
        L9:
            int r0 = r2.mIconResId
            if (r0 == 0) goto L23
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            android.content.Context r0 = r0.getContext()
            int r1 = r2.mIconResId
            android.graphics.drawable.Drawable r0 = androidx.appcompat.content.res.AppCompatResources.getDrawable(r0, r1)
            r1 = 0
            r2.mIconResId = r1
            r2.mIconDrawable = r0
            android.graphics.drawable.Drawable r0 = r2.applyIconTintIfNecessary(r0)
            return r0
        L23:
            r0 = 0
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.content.res.ColorStateList getIconTintList() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.mIconTintList
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.graphics.PorterDuff.Mode getIconTintMode() {
            r1 = this;
            android.graphics.PorterDuff$Mode r0 = r1.mIconTintMode
            return r0
    }

    @Override // android.view.MenuItem
    public android.content.Intent getIntent() {
            r1 = this;
            android.content.Intent r0 = r1.mIntent
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public int getItemId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            android.view.ContextMenu$ContextMenuInfo r0 = r1.mMenuInfo
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public int getNumericModifiers() {
            r1 = this;
            int r0 = r1.mShortcutNumericModifiers
            return r0
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
            r1 = this;
            char r0 = r1.mShortcutNumericChar
            return r0
    }

    @Override // android.view.MenuItem
    public int getOrder() {
            r1 = this;
            int r0 = r1.mCategoryOrder
            return r0
    }

    public int getOrdering() {
            r1 = this;
            int r0 = r1.mOrdering
            return r0
    }

    char getShortcut() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            boolean r0 = r0.isQwertyMode()
            if (r0 == 0) goto Lb
            char r0 = r1.mShortcutAlphabeticChar
            goto Ld
        Lb:
            char r0 = r1.mShortcutNumericChar
        Ld:
            return r0
    }

    java.lang.String getShortcutLabel() {
            r6 = this;
            char r0 = r6.getShortcut()
            if (r0 != 0) goto L9
            java.lang.String r0 = ""
            return r0
        L9:
            androidx.appcompat.view.menu.MenuBuilder r1 = r6.mMenu
            android.content.Context r1 = r1.getContext()
            android.content.res.Resources r1 = r1.getResources()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.mMenu
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            boolean r3 = r3.hasPermanentMenuKey()
            if (r3 == 0) goto L31
            int r3 = androidx.appcompat.C0015R.string.abc_prepend_shortcut_label
            java.lang.String r3 = r1.getString(r3)
            r2.append(r3)
        L31:
            androidx.appcompat.view.menu.MenuBuilder r3 = r6.mMenu
            boolean r3 = r3.isQwertyMode()
            if (r3 == 0) goto L3c
            int r3 = r6.mShortcutAlphabeticModifiers
            goto L3e
        L3c:
            int r3 = r6.mShortcutNumericModifiers
        L3e:
            int r4 = androidx.appcompat.C0015R.string.abc_menu_meta_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 65536(0x10000, float:9.18355E-41)
            appendModifier(r2, r3, r5, r4)
            int r4 = androidx.appcompat.C0015R.string.abc_menu_ctrl_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 4096(0x1000, float:5.74E-42)
            appendModifier(r2, r3, r5, r4)
            int r4 = androidx.appcompat.C0015R.string.abc_menu_alt_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 2
            appendModifier(r2, r3, r5, r4)
            int r4 = androidx.appcompat.C0015R.string.abc_menu_shift_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 1
            appendModifier(r2, r3, r5, r4)
            int r4 = androidx.appcompat.C0015R.string.abc_menu_sym_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 4
            appendModifier(r2, r3, r5, r4)
            int r4 = androidx.appcompat.C0015R.string.abc_menu_function_shortcut_label
            java.lang.String r4 = r1.getString(r4)
            r5 = 8
            appendModifier(r2, r3, r5, r4)
            if (r0 == r5) goto L9f
            r3 = 10
            if (r0 == r3) goto L95
            r3 = 32
            if (r0 == r3) goto L8b
            r2.append(r0)
            goto La8
        L8b:
            int r0 = androidx.appcompat.C0015R.string.abc_menu_space_shortcut_label
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            goto La8
        L95:
            int r0 = androidx.appcompat.C0015R.string.abc_menu_enter_shortcut_label
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
            goto La8
        L9f:
            int r0 = androidx.appcompat.C0015R.string.abc_menu_delete_shortcut_label
            java.lang.String r0 = r1.getString(r0)
            r2.append(r0)
        La8:
            java.lang.String r0 = r2.toString()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.SubMenuBuilder r0 = r1.mSubMenu
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
            r1 = this;
            androidx.core.view.ActionProvider r0 = r1.mActionProvider
            return r0
    }

    @Override // android.view.MenuItem
    @android.view.ViewDebug.CapturedViewProperty
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    @Override // android.view.MenuItem
    public java.lang.CharSequence getTitleCondensed() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitleCondensed
            if (r0 == 0) goto L5
            goto L7
        L5:
            java.lang.CharSequence r0 = r1.mTitle
        L7:
            return r0
    }

    java.lang.CharSequence getTitleForItemView(androidx.appcompat.view.menu.MenuView.ItemView r1) {
            r0 = this;
            if (r1 == 0) goto Ld
            boolean r1 = r1.prefersCondensedTitle()
            if (r1 == 0) goto Ld
            java.lang.CharSequence r1 = r0.getTitleCondensed()
            goto L11
        Ld:
            java.lang.CharSequence r1 = r0.getTitle()
        L11:
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTooltipText
            return r0
    }

    public boolean hasCollapsibleActionView() {
            r2 = this;
            int r0 = r2.mShowAsAction
            r0 = r0 & 8
            r1 = 0
            if (r0 == 0) goto L1a
            android.view.View r0 = r2.mActionView
            if (r0 != 0) goto L15
            androidx.core.view.ActionProvider r0 = r2.mActionProvider
            if (r0 == 0) goto L15
            android.view.View r0 = r0.onCreateActionView(r2)
            r2.mActionView = r0
        L15:
            android.view.View r0 = r2.mActionView
            if (r0 == 0) goto L1a
            r1 = 1
        L1a:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            androidx.appcompat.view.menu.SubMenuBuilder r0 = r1.mSubMenu
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public boolean invoke() {
            r4 = this;
            android.view.MenuItem$OnMenuItemClickListener r0 = r4.mClickListener
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onMenuItemClick(r4)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.mMenu
            boolean r0 = r0.dispatchMenuItemSelected(r0, r4)
            if (r0 == 0) goto L15
            return r1
        L15:
            java.lang.Runnable r0 = r4.mItemCallback
            if (r0 == 0) goto L1d
            r0.run()
            return r1
        L1d:
            android.content.Intent r0 = r4.mIntent
            if (r0 == 0) goto L35
            androidx.appcompat.view.menu.MenuBuilder r0 = r4.mMenu     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Context r0 = r0.getContext()     // Catch: android.content.ActivityNotFoundException -> L2d
            android.content.Intent r2 = r4.mIntent     // Catch: android.content.ActivityNotFoundException -> L2d
            r0.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            return r1
        L2d:
            r0 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r3 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r3, r0)
        L35:
            androidx.core.view.ActionProvider r0 = r4.mActionProvider
            if (r0 == 0) goto L40
            boolean r0 = r0.onPerformDefaultAction()
            if (r0 == 0) goto L40
            return r1
        L40:
            r0 = 0
            return r0
    }

    public boolean isActionButton() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 32
            r0 = r0 & r1
            if (r0 != r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            boolean r0 = r1.mIsActionViewExpanded
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 16
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public boolean isExclusiveCheckable() {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 4
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r3 = this;
            androidx.core.view.ActionProvider r0 = r3.mActionProvider
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r0 = r0.overridesItemVisibility()
            if (r0 == 0) goto L1d
            int r0 = r3.mFlags
            r0 = r0 & 8
            if (r0 != 0) goto L1b
            androidx.core.view.ActionProvider r0 = r3.mActionProvider
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            int r0 = r3.mFlags
            r0 = r0 & 8
            if (r0 != 0) goto L24
            goto L25
        L24:
            r1 = r2
        L25:
            return r1
    }

    public boolean requestsActionButton() {
            r2 = this;
            int r0 = r2.mShowAsAction
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
            r2 = this;
            int r0 = r2.mShowAsAction
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
            r1 = this;
            boolean r0 = r1.requiresActionButton()
            if (r0 != 0) goto Le
            boolean r0 = r1.requestsActionButton()
            if (r0 != 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "This is not supported, use MenuItemCompat.setActionProvider()"
            r2.<init>(r0)
            throw r2
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(int r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setActionView(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setActionView(android.view.View r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setActionView(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(int r4) {
            r3 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r3.mMenu
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            r2.<init>(r0)
            r0 = 0
            android.view.View r4 = r1.inflate(r4, r2, r0)
            r3.setActionView(r4)
            return r3
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(android.view.View r3) {
            r2 = this;
            r2.mActionView = r3
            r0 = 0
            r2.mActionProvider = r0
            if (r3 == 0) goto L15
            int r0 = r3.getId()
            r1 = -1
            if (r0 != r1) goto L15
            int r0 = r2.mId
            if (r0 <= 0) goto L15
            r3.setId(r0)
        L15:
            androidx.appcompat.view.menu.MenuBuilder r3 = r2.mMenu
            r3.onItemActionRequestChanged(r2)
            return r2
    }

    public void setActionViewExpanded(boolean r2) {
            r1 = this;
            r1.mIsActionViewExpanded = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2) {
            r1 = this;
            char r0 = r1.mShortcutAlphabeticChar
            if (r0 != r2) goto L5
            return r1
        L5:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.mShortcutAlphabeticChar = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.mShortcutAlphabeticChar
            if (r0 != r2) goto L9
            int r0 = r1.mShortcutAlphabeticModifiers
            if (r0 != r3) goto L9
            return r1
        L9:
            char r2 = java.lang.Character.toLowerCase(r2)
            r1.mShortcutAlphabeticChar = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.mShortcutAlphabeticModifiers = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r3 = 0
            r2.onItemsChanged(r3)
            return r1
    }

    public android.view.MenuItem setCallback(java.lang.Runnable r1) {
            r0 = this;
            r0.mItemCallback = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r3) {
            r2 = this;
            int r0 = r2.mFlags
            r1 = r0 & (-2)
            r3 = r3 | r1
            r2.mFlags = r3
            if (r0 == r3) goto Lf
            androidx.appcompat.view.menu.MenuBuilder r3 = r2.mMenu
            r0 = 0
            r3.onItemsChanged(r0)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 4
            if (r0 == 0) goto Lc
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r2.setExclusiveItemChecked(r1)
            goto Lf
        Lc:
            r1.setCheckedInt(r2)
        Lf:
            return r1
    }

    void setCheckedInt(boolean r4) {
            r3 = this;
            int r0 = r3.mFlags
            r1 = r0 & (-3)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = 2
            goto La
        L9:
            r4 = r2
        La:
            r4 = r4 | r1
            r3.mFlags = r4
            if (r0 == r4) goto L14
            androidx.appcompat.view.menu.MenuBuilder r4 = r3.mMenu
            r4.onItemsChanged(r2)
        L14:
            return
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setContentDescription(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence r2) {
            r1 = this;
            r1.mContentDescription = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            if (r2 == 0) goto L9
            int r2 = r1.mFlags
            r2 = r2 | 16
            r1.mFlags = r2
            goto Lf
        L9:
            int r2 = r1.mFlags
            r2 = r2 & (-17)
            r1.mFlags = r2
        Lf:
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    public void setExclusiveCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & (-5)
            if (r2 == 0) goto L8
            r2 = 4
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.mFlags = r2
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            r0 = 0
            r1.mIconDrawable = r0
            r1.mIconResId = r2
            r2 = 1
            r1.mNeedToApplyIconTint = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.mIconResId = r0
            r1.mIconDrawable = r2
            r2 = 1
            r1.mNeedToApplyIconTint = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mIconTintList = r2
            r2 = 1
            r1.mHasIconTint = r2
            r1.mNeedToApplyIconTint = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mIconTintMode = r2
            r2 = 1
            r1.mHasIconTintMode = r2
            r1.mNeedToApplyIconTint = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.mIntent = r1
            return r0
    }

    public void setIsActionButton(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L9
            int r1 = r0.mFlags
            r1 = r1 | 32
            r0.mFlags = r1
            goto Lf
        L9:
            int r1 = r0.mFlags
            r1 = r1 & (-33)
            r0.mFlags = r1
        Lf:
            return
    }

    void setMenuInfo(android.view.ContextMenu.ContextMenuInfo r1) {
            r0 = this;
            r0.mMenuInfo = r1
            return
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2) {
            r1 = this;
            char r0 = r1.mShortcutNumericChar
            if (r0 != r2) goto L5
            return r1
        L5:
            r1.mShortcutNumericChar = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r2, int r3) {
            r1 = this;
            char r0 = r1.mShortcutNumericChar
            if (r0 != r2) goto L9
            int r0 = r1.mShortcutNumericModifiers
            if (r0 != r3) goto L9
            return r1
        L9:
            r1.mShortcutNumericChar = r2
            int r2 = android.view.KeyEvent.normalizeMetaState(r3)
            r1.mShortcutNumericModifiers = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r3 = 0
            r2.onItemsChanged(r3)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            r0.mOnActionExpandListener = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener r1) {
            r0 = this;
            r0.mClickListener = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2) {
            r0 = this;
            r0.mShortcutNumericChar = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.mShortcutAlphabeticChar = r1
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            r2 = 0
            r1.onItemsChanged(r2)
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setShortcut(char r1, char r2, int r3, int r4) {
            r0 = this;
            r0.mShortcutNumericChar = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r3)
            r0.mShortcutNumericModifiers = r1
            char r1 = java.lang.Character.toLowerCase(r2)
            r0.mShortcutAlphabeticChar = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r4)
            r0.mShortcutAlphabeticModifiers = r1
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            r2 = 0
            r1.onItemsChanged(r2)
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int r3) {
            r2 = this;
            r0 = r3 & 3
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto L13
            r1 = 2
            if (r0 != r1) goto Lb
            goto L13
        Lb:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
            r3.<init>(r0)
            throw r3
        L13:
            r2.mShowAsAction = r3
            androidx.appcompat.view.menu.MenuBuilder r3 = r2.mMenu
            r3.onItemActionRequestChanged(r2)
            return
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setShowAsActionFlags(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setShowAsActionFlags(int r1) {
            r0 = this;
            r0.setShowAsAction(r1)
            return r0
    }

    public void setSubMenu(androidx.appcompat.view.menu.SubMenuBuilder r2) {
            r1 = this;
            r1.mSubMenu = r2
            java.lang.CharSequence r0 = r1.getTitle()
            r2.setHeaderTitle(r0)
            return
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider r2) {
            r1 = this;
            androidx.core.view.ActionProvider r0 = r1.mActionProvider
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            r0 = 0
            r1.mActionView = r0
            r1.mActionProvider = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 1
            r2.onItemsChanged(r0)
            androidx.core.view.ActionProvider r2 = r1.mActionProvider
            if (r2 == 0) goto L1e
            androidx.appcompat.view.menu.MenuItemImpl$1 r0 = new androidx.appcompat.view.menu.MenuItemImpl$1
            r0.<init>(r1)
            r2.setVisibilityListener(r0)
        L1e:
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            android.content.Context r0 = r0.getContext()
            java.lang.String r2 = r0.getString(r2)
            android.view.MenuItem r2 = r1.setTitle(r2)
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r3) {
            r2 = this;
            r2.mTitle = r3
            androidx.appcompat.view.menu.MenuBuilder r0 = r2.mMenu
            r1 = 0
            r0.onItemsChanged(r1)
            androidx.appcompat.view.menu.SubMenuBuilder r0 = r2.mSubMenu
            if (r0 == 0) goto Lf
            r0.setHeaderTitle(r3)
        Lf:
            return r2
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTitleCondensed = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setTooltipText(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence r2) {
            r1 = this;
            r1.mTooltipText = r2
            androidx.appcompat.view.menu.MenuBuilder r2 = r1.mMenu
            r0 = 0
            r2.onItemsChanged(r0)
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r1) {
            r0 = this;
            boolean r1 = r0.setVisibleInt(r1)
            if (r1 == 0) goto Lb
            androidx.appcompat.view.menu.MenuBuilder r1 = r0.mMenu
            r1.onItemVisibleChanged(r0)
        Lb:
            return r0
    }

    boolean setVisibleInt(boolean r4) {
            r3 = this;
            int r0 = r3.mFlags
            r1 = r0 & (-9)
            r2 = 0
            if (r4 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = 8
        Lb:
            r4 = r4 | r1
            r3.mFlags = r4
            if (r0 == r4) goto L11
            r2 = 1
        L11:
            return r2
    }

    public boolean shouldShowIcon() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            boolean r0 = r0.getOptionalIconsVisible()
            return r0
    }

    boolean shouldShowShortcut() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder r0 = r1.mMenu
            boolean r0 = r0.isShortcutsVisible()
            if (r0 == 0) goto L10
            char r0 = r1.getShortcut()
            if (r0 == 0) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            return r0
    }

    public boolean showsTextAsAction() {
            r2 = this;
            int r0 = r2.mShowAsAction
            r1 = 4
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.toString()
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }
}
