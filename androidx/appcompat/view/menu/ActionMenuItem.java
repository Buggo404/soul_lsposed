package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class ActionMenuItem implements androidx.core.internal.view.SupportMenuItem {
    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private java.lang.CharSequence mContentDescription;
    private android.content.Context mContext;
    private int mFlags;
    private final int mGroup;
    private boolean mHasIconTint;
    private boolean mHasIconTintMode;
    private android.graphics.drawable.Drawable mIconDrawable;
    private android.content.res.ColorStateList mIconTintList;
    private android.graphics.PorterDuff.Mode mIconTintMode;
    private final int mId;
    private android.content.Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private int mShortcutAlphabeticModifiers;
    private char mShortcutNumericChar;
    private int mShortcutNumericModifiers;
    private java.lang.CharSequence mTitle;
    private java.lang.CharSequence mTitleCondensed;
    private java.lang.CharSequence mTooltipText;

    public ActionMenuItem(android.content.Context r1, int r2, int r3, int r4, int r5, java.lang.CharSequence r6) {
            r0 = this;
            r0.<init>()
            r4 = 4096(0x1000, float:5.74E-42)
            r0.mShortcutNumericModifiers = r4
            r0.mShortcutAlphabeticModifiers = r4
            r4 = 0
            r0.mIconTintList = r4
            r0.mIconTintMode = r4
            r4 = 0
            r0.mHasIconTint = r4
            r0.mHasIconTintMode = r4
            r4 = 16
            r0.mFlags = r4
            r0.mContext = r1
            r0.mId = r3
            r0.mGroup = r2
            r0.mOrdering = r5
            r0.mTitle = r6
            return
    }

    private void applyIconTint() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mIconDrawable
            if (r0 == 0) goto L2c
            boolean r1 = r2.mHasIconTint
            if (r1 != 0) goto Lc
            boolean r1 = r2.mHasIconTintMode
            if (r1 == 0) goto L2c
        Lc:
            android.graphics.drawable.Drawable r0 = androidx.core.graphics.drawable.DrawableCompat.wrap(r0)
            r2.mIconDrawable = r0
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.mIconDrawable = r0
            boolean r1 = r2.mHasIconTint
            if (r1 == 0) goto L21
            android.content.res.ColorStateList r1 = r2.mIconTintList
            androidx.core.graphics.drawable.DrawableCompat.setTintList(r0, r1)
        L21:
            boolean r0 = r2.mHasIconTintMode
            if (r0 == 0) goto L2c
            android.graphics.drawable.Drawable r0 = r2.mIconDrawable
            android.graphics.PorterDuff$Mode r1 = r2.mIconTintMode
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(r0, r1)
        L2c:
            return
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean collapseActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean expandActionView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ActionProvider getActionProvider() {
            r1 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.View getActionView() {
            r1 = this;
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
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIconDrawable
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
    public int getItemId() {
            r1 = this;
            int r0 = r1.mId
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.ContextMenu.ContextMenuInfo getMenuInfo() {
            r1 = this;
            r0 = 0
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
            int r0 = r1.mOrdering
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.SubMenu getSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.view.ActionProvider getSupportActionProvider() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
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

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public java.lang.CharSequence getTooltipText() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTooltipText
            return r0
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean invoke() {
            r3 = this;
            android.view.MenuItem$OnMenuItemClickListener r0 = r3.mClickListener
            r1 = 1
            if (r0 == 0) goto Lc
            boolean r0 = r0.onMenuItemClick(r3)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            android.content.Intent r0 = r3.mIntent
            if (r0 == 0) goto L16
            android.content.Context r2 = r3.mContext
            r2.startActivity(r0)
            return r1
        L16:
            r0 = 0
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public boolean isActionViewExpanded() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 1
            r0 = r0 & r1
            if (r0 == 0) goto L7
            goto L8
        L7:
            r1 = 0
        L8:
            return r1
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 2
            if (r0 == 0) goto L8
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

    @Override // android.view.MenuItem
    public boolean isVisible() {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & 8
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresActionButton() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem
    public boolean requiresOverflow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setActionProvider(android.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
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
    public androidx.core.internal.view.SupportMenuItem setActionView(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setActionView(android.view.View r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.mShortcutAlphabeticChar = r1
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setAlphabeticShortcut(char r1, int r2) {
            r0 = this;
            char r1 = java.lang.Character.toLowerCase(r1)
            r0.mShortcutAlphabeticChar = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.mShortcutAlphabeticModifiers = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setCheckable(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & (-2)
            r2 = r2 | r0
            r1.mFlags = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setChecked(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & (-3)
            if (r2 == 0) goto L8
            r2 = 2
            goto L9
        L8:
            r2 = 0
        L9:
            r2 = r2 | r0
            r1.mFlags = r2
            return r1
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setContentDescription(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setContentDescription(java.lang.CharSequence r1) {
            r0 = this;
            r0.mContentDescription = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setEnabled(boolean r2) {
            r1 = this;
            int r0 = r1.mFlags
            r0 = r0 & (-17)
            if (r2 == 0) goto L9
            r2 = 16
            goto La
        L9:
            r2 = 0
        La:
            r2 = r2 | r0
            r1.mFlags = r2
            return r1
    }

    public androidx.appcompat.view.menu.ActionMenuItem setExclusiveCheckable(boolean r2) {
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
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.graphics.drawable.Drawable r2 = androidx.core.content.ContextCompat.getDrawable(r0, r2)
            r1.mIconDrawable = r2
            r1.applyIconTint()
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIcon(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mIconDrawable = r1
            r0.applyIconTint()
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintList(android.content.res.ColorStateList r1) {
            r0 = this;
            r0.mIconTintList = r1
            r1 = 1
            r0.mHasIconTint = r1
            r0.applyIconTint()
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setIconTintMode(android.graphics.PorterDuff.Mode r1) {
            r0 = this;
            r0.mIconTintMode = r1
            r1 = 1
            r0.mHasIconTintMode = r1
            r0.applyIconTint()
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setIntent(android.content.Intent r1) {
            r0 = this;
            r0.mIntent = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1) {
            r0 = this;
            r0.mShortcutNumericChar = r1
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public android.view.MenuItem setNumericShortcut(char r1, int r2) {
            r0 = this;
            r0.mShortcutNumericChar = r1
            int r1 = android.view.KeyEvent.normalizeMetaState(r2)
            r0.mShortcutNumericModifiers = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
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
            return r0
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public void setShowAsAction(int r1) {
            r0 = this;
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

    @Override // androidx.core.internal.view.SupportMenuItem
    public androidx.core.internal.view.SupportMenuItem setSupportActionProvider(androidx.core.view.ActionProvider r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.content.res.Resources r0 = r0.getResources()
            java.lang.String r2 = r0.getString(r2)
            r1.mTitle = r2
            return r1
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitle(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitle = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setTitleCondensed(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTitleCondensed = r1
            return r0
    }

    @Override // android.view.MenuItem
    public /* bridge */ /* synthetic */ android.view.MenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            androidx.core.internal.view.SupportMenuItem r1 = r0.setTooltipText(r1)
            return r1
    }

    @Override // androidx.core.internal.view.SupportMenuItem, android.view.MenuItem
    public androidx.core.internal.view.SupportMenuItem setTooltipText(java.lang.CharSequence r1) {
            r0 = this;
            r0.mTooltipText = r1
            return r0
    }

    @Override // android.view.MenuItem
    public android.view.MenuItem setVisible(boolean r3) {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 8
            r0 = r0 & r1
            if (r3 == 0) goto L8
            r1 = 0
        L8:
            r3 = r0 | r1
            r2.mFlags = r3
            return r2
    }
}
