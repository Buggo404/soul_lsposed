package androidx.appcompat.view.menu;

/* loaded from: classes.dex */
public class MenuBuilder implements androidx.core.internal.view.SupportMenu {
    private static final java.lang.String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final java.lang.String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final java.lang.String PRESENTER_KEY = "android:menu:presenters";
    private static final java.lang.String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = null;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mActionItems;
    private androidx.appcompat.view.menu.MenuBuilder.Callback mCallback;
    private final android.content.Context mContext;
    private android.view.ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private int mDefaultShowAsAction;
    private androidx.appcompat.view.menu.MenuItemImpl mExpandedItem;
    private boolean mGroupDividerEnabled;
    android.graphics.drawable.Drawable mHeaderIcon;
    java.lang.CharSequence mHeaderTitle;
    android.view.View mHeaderView;
    private boolean mIsActionItemsStale;
    private boolean mIsClosing;
    private boolean mIsVisibleItemsStale;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mItems;
    private boolean mItemsChangedWhileDispatchPrevented;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mNonActionItems;
    private boolean mOptionalIconsVisible;
    private boolean mOverrideVisibleItems;
    private java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> mPresenters;
    private boolean mPreventDispatchingItemsChanged;
    private boolean mQwertyMode;
    private final android.content.res.Resources mResources;
    private boolean mShortcutsVisible;
    private boolean mStructureChangedWhileDispatchPrevented;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mTempShortcutItemList;
    private java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> mVisibleItems;

    public interface Callback {
        boolean onMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r1, android.view.MenuItem r2);

        void onMenuModeChange(androidx.appcompat.view.menu.MenuBuilder r1);
    }

    public interface ItemInvoker {
        boolean invokeItem(androidx.appcompat.view.menu.MenuItemImpl r1);
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA , data: [1, 4, 5, 3, 2, 0} // fill-array
            androidx.appcompat.view.menu.MenuBuilder.sCategoryToOrder = r0
            return
    }

    public MenuBuilder(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDefaultShowAsAction = r0
            r2.mPreventDispatchingItemsChanged = r0
            r2.mItemsChangedWhileDispatchPrevented = r0
            r2.mStructureChangedWhileDispatchPrevented = r0
            r2.mOptionalIconsVisible = r0
            r2.mIsClosing = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.mTempShortcutItemList = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r2.mPresenters = r1
            r2.mGroupDividerEnabled = r0
            r2.mContext = r3
            android.content.res.Resources r3 = r3.getResources()
            r2.mResources = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mItems = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.mVisibleItems = r3
            r3 = 1
            r2.mIsVisibleItemsStale = r3
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mActionItems = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.mNonActionItems = r0
            r2.mIsActionItemsStale = r3
            r2.setShortcutsVisibleInner(r3)
            return
    }

    private androidx.appcompat.view.menu.MenuItemImpl createNewMenuItem(int r10, int r11, int r12, int r13, java.lang.CharSequence r14, int r15) {
            r9 = this;
            androidx.appcompat.view.menu.MenuItemImpl r8 = new androidx.appcompat.view.menu.MenuItemImpl
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r8
    }

    private void dispatchPresenterUpdate(boolean r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            r3.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L2c
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r3.mPresenters
            r2.remove(r1)
            goto L12
        L2c:
            r2.updateMenuView(r4)
            goto L12
        L30:
            r3.startDispatchingItemsChanged()
            return
    }

    private void dispatchRestoreInstanceState(android.os.Bundle r4) {
            r3 = this;
            java.lang.String r0 = "android:menu:presenters"
            android.util.SparseArray r4 = r4.getSparseParcelableArray(r0)
            if (r4 == 0) goto L43
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            goto L43
        L11:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r3.mPresenters
            r2.remove(r1)
            goto L17
        L31:
            int r1 = r2.getId()
            if (r1 <= 0) goto L17
            java.lang.Object r1 = r4.get(r1)
            android.os.Parcelable r1 = (android.os.Parcelable) r1
            if (r1 == 0) goto L17
            r2.onRestoreInstanceState(r1)
            goto L17
        L43:
            return
    }

    private void dispatchSaveInstanceState(android.os.Bundle r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            return
        L9:
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r4.mPresenters
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L2e
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r2)
            goto L14
        L2e:
            int r2 = r3.getId()
            if (r2 <= 0) goto L14
            android.os.Parcelable r3 = r3.onSaveInstanceState()
            if (r3 == 0) goto L14
            r0.put(r2, r3)
            goto L14
        L3e:
            java.lang.String r1 = "android:menu:presenters"
            r5.putSparseParcelableArray(r1, r0)
            return
    }

    private boolean dispatchSubMenuSelected(androidx.appcompat.view.menu.SubMenuBuilder r4, androidx.appcompat.view.menu.MenuPresenter r5) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            if (r5 == 0) goto L10
            boolean r1 = r5.onSubMenuSelected(r4)
        L10:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r5 = r3.mPresenters
            java.util.Iterator r5 = r5.iterator()
        L16:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            java.lang.ref.WeakReference r0 = (java.lang.ref.WeakReference) r0
            java.lang.Object r2 = r0.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L30
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r3.mPresenters
            r2.remove(r0)
            goto L16
        L30:
            if (r1 != 0) goto L16
            boolean r0 = r2.onSubMenuSelected(r4)
            r1 = r0
            goto L16
        L38:
            return r1
    }

    private static int findInsertIndex(java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2, int r3) {
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L6:
            if (r0 < 0) goto L1a
            java.lang.Object r1 = r2.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            int r1 = r1.getOrdering()
            if (r1 > r3) goto L17
            int r0 = r0 + 1
            return r0
        L17:
            int r0 = r0 + (-1)
            goto L6
        L1a:
            r2 = 0
            return r2
    }

    private static int getOrdering(int r3) {
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r3
            int r0 = r0 >> 16
            if (r0 < 0) goto L16
            int[] r1 = androidx.appcompat.view.menu.MenuBuilder.sCategoryToOrder
            int r2 = r1.length
            if (r0 >= r2) goto L16
            r0 = r1[r0]
            int r0 = r0 << 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r3 = r3 & r1
            r3 = r3 | r0
            return r3
        L16:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "order does not contain a valid category."
            r3.<init>(r0)
            throw r3
    }

    private void removeItemAtInt(int r2, boolean r3) {
            r1 = this;
            if (r2 < 0) goto L16
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            int r0 = r0.size()
            if (r2 < r0) goto Lb
            goto L16
        Lb:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            r0.remove(r2)
            if (r3 == 0) goto L16
            r2 = 1
            r1.onItemsChanged(r2)
        L16:
            return
    }

    private void setHeaderInternal(int r3, java.lang.CharSequence r4, int r5, android.graphics.drawable.Drawable r6, android.view.View r7) {
            r2 = this;
            android.content.res.Resources r0 = r2.getResources()
            r1 = 0
            if (r7 == 0) goto Le
            r2.mHeaderView = r7
            r2.mHeaderTitle = r1
            r2.mHeaderIcon = r1
            goto L2e
        Le:
            if (r3 <= 0) goto L17
            java.lang.CharSequence r3 = r0.getText(r3)
            r2.mHeaderTitle = r3
            goto L1b
        L17:
            if (r4 == 0) goto L1b
            r2.mHeaderTitle = r4
        L1b:
            if (r5 <= 0) goto L28
            android.content.Context r3 = r2.getContext()
            android.graphics.drawable.Drawable r3 = androidx.core.content.ContextCompat.getDrawable(r3, r5)
            r2.mHeaderIcon = r3
            goto L2c
        L28:
            if (r6 == 0) goto L2c
            r2.mHeaderIcon = r6
        L2c:
            r2.mHeaderView = r1
        L2e:
            r3 = 0
            r2.onItemsChanged(r3)
            return
    }

    private void setShortcutsVisibleInner(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L1c
            android.content.res.Resources r3 = r2.mResources
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.keyboard
            r0 = 1
            if (r3 == r0) goto L1c
            android.content.Context r3 = r2.mContext
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            android.content.Context r1 = r2.mContext
            boolean r3 = androidx.core.view.ViewConfigurationCompat.shouldShowMenuShortcutsWhenKeyboardPresent(r3, r1)
            if (r3 == 0) goto L1c
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r2.mShortcutsVisible = r0
            return
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.MenuItem r2 = r1.addInternal(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r5 = r0.getString(r5)
            android.view.MenuItem r2 = r1.addInternal(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.addInternal(r1, r2, r3, r4)
            return r1
    }

    @Override // android.view.Menu
    public android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.MenuItem r2 = r1.addInternal(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.mContext
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L12
            int r2 = r11.size()
            goto L13
        L12:
            r2 = r1
        L13:
            r14 = r14 & 1
            if (r14 != 0) goto L1a
            r7.removeGroup(r8)
        L1a:
            if (r1 >= r2) goto L64
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L2a
            r4 = r13
            goto L2e
        L2a:
            int r4 = r14.specificIndex
            r4 = r12[r4]
        L2e:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            java.lang.String r5 = r5.packageName
            android.content.pm.ActivityInfo r6 = r14.activityInfo
            java.lang.String r6 = r6.name
            r4.<init>(r5, r6)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.add(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            android.view.MenuItem r4 = r4.setIcon(r5)
            android.view.MenuItem r3 = r4.setIntent(r3)
            if (r15 == 0) goto L61
            int r4 = r14.specificIndex
            if (r4 < 0) goto L61
            int r14 = r14.specificIndex
            r15[r14] = r3
        L61:
            int r1 = r1 + 1
            goto L1a
        L64:
            return r2
    }

    protected android.view.MenuItem addInternal(int r9, int r10, int r11, java.lang.CharSequence r12) {
            r8 = this;
            int r7 = getOrdering(r11)
            int r6 = r8.mDefaultShowAsAction
            r0 = r8
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r7
            r5 = r12
            androidx.appcompat.view.menu.MenuItemImpl r9 = r0.createNewMenuItem(r1, r2, r3, r4, r5, r6)
            android.view.ContextMenu$ContextMenuInfo r10 = r8.mCurrentMenuInfo
            if (r10 == 0) goto L17
            r9.setMenuInfo(r10)
        L17:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r10 = r8.mItems
            int r11 = findInsertIndex(r10, r7)
            r10.add(r11, r9)
            r10 = 1
            r8.onItemsChanged(r10)
            return r9
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            r1.addMenuPresenter(r2, r0)
            return
    }

    public void addMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r3, android.content.Context r4) {
            r2 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r2.mPresenters
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            r0.add(r1)
            r3.initForMenu(r4, r2)
            r3 = 1
            r2.mIsActionItemsStale = r3
            return
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r2 = r1.addSubMenu(r2, r3, r4, r5)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            android.view.MenuItem r1 = r0.addInternal(r1, r2, r3, r4)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            androidx.appcompat.view.menu.SubMenuBuilder r2 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r3 = r0.mContext
            r2.<init>(r3, r0, r1)
            r1.setSubMenu(r2)
            return r2
    }

    @Override // android.view.Menu
    public android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r2 = r1.addSubMenu(r0, r0, r0, r2)
            return r2
    }

    public void changeMenuMode() {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            if (r0 == 0) goto L7
            r0.onMenuModeChange(r1)
        L7:
            return
    }

    @Override // android.view.Menu
    public void clear() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mExpandedItem
            if (r0 == 0) goto L7
            r1.collapseItemActionView(r0)
        L7:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            r0.clear()
            r0 = 1
            r1.onItemsChanged(r0)
            return
    }

    public void clearAll() {
            r2 = this;
            r0 = 1
            r2.mPreventDispatchingItemsChanged = r0
            r2.clear()
            r2.clearHeader()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r2.mPresenters
            r1.clear()
            r1 = 0
            r2.mPreventDispatchingItemsChanged = r1
            r2.mItemsChangedWhileDispatchPrevented = r1
            r2.mStructureChangedWhileDispatchPrevented = r1
            r2.onItemsChanged(r0)
            return
    }

    public void clearHeader() {
            r1 = this;
            r0 = 0
            r1.mHeaderIcon = r0
            r1.mHeaderTitle = r0
            r1.mHeaderView = r0
            r0 = 0
            r1.onItemsChanged(r0)
            return
    }

    @Override // android.view.Menu
    public void close() {
            r1 = this;
            r0 = 1
            r1.close(r0)
            return
    }

    public final void close(boolean r4) {
            r3 = this;
            boolean r0 = r3.mIsClosing
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r3.mIsClosing = r0
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 != 0) goto L28
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r3.mPresenters
            r2.remove(r1)
            goto Le
        L28:
            r2.onCloseMenu(r3, r4)
            goto Le
        L2c:
            r4 = 0
            r3.mIsClosing = r4
            return
    }

    public boolean collapseItemActionView(androidx.appcompat.view.menu.MenuItemImpl r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 != 0) goto L3f
            androidx.appcompat.view.menu.MenuItemImpl r0 = r4.mExpandedItem
            if (r0 == r5) goto Le
            goto L3f
        Le:
            r4.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L31
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r2)
            goto L17
        L31:
            boolean r1 = r3.collapseItemActionView(r4, r5)
            if (r1 == 0) goto L17
        L37:
            r4.startDispatchingItemsChanged()
            if (r1 == 0) goto L3f
            r5 = 0
            r4.mExpandedItem = r5
        L3f:
            return r1
    }

    boolean dispatchMenuItemSelected(androidx.appcompat.view.menu.MenuBuilder r2, android.view.MenuItem r3) {
            r1 = this;
            androidx.appcompat.view.menu.MenuBuilder$Callback r0 = r1.mCallback
            if (r0 == 0) goto Lc
            boolean r2 = r0.onMenuItemSelected(r2, r3)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    public boolean expandItemActionView(androidx.appcompat.view.menu.MenuItemImpl r5) {
            r4 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            boolean r0 = r0.isEmpty()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            r4.stopDispatchingItemsChanged()
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r4.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r2 = r0.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            androidx.appcompat.view.menu.MenuPresenter r3 = (androidx.appcompat.view.menu.MenuPresenter) r3
            if (r3 != 0) goto L2d
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r3 = r4.mPresenters
            r3.remove(r2)
            goto L13
        L2d:
            boolean r1 = r3.expandItemActionView(r4, r5)
            if (r1 == 0) goto L13
        L33:
            r4.startDispatchingItemsChanged()
            if (r1 == 0) goto L3a
            r4.mExpandedItem = r5
        L3a:
            return r1
    }

    public int findGroupIndex(int r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.findGroupIndex(r2, r0)
            return r2
    }

    public int findGroupIndex(int r3, int r4) {
            r2 = this;
            int r0 = r2.size()
            if (r4 >= 0) goto L7
            r4 = 0
        L7:
            if (r4 >= r0) goto L1b
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r2.mItems
            java.lang.Object r1 = r1.get(r4)
            androidx.appcompat.view.menu.MenuItemImpl r1 = (androidx.appcompat.view.menu.MenuItemImpl) r1
            int r1 = r1.getGroupId()
            if (r1 != r3) goto L18
            return r4
        L18:
            int r4 = r4 + 1
            goto L7
        L1b:
            r3 = -1
            return r3
    }

    @Override // android.view.Menu
    public android.view.MenuItem findItem(int r5) {
            r4 = this;
            int r0 = r4.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2a
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getItemId()
            if (r3 != r5) goto L16
            return r2
        L16:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L27
            android.view.SubMenu r2 = r2.getSubMenu()
            android.view.MenuItem r2 = r2.findItem(r5)
            if (r2 == 0) goto L27
            return r2
        L27:
            int r1 = r1 + 1
            goto L5
        L2a:
            r5 = 0
            return r5
    }

    public int findItemIndex(int r4) {
            r3 = this;
            int r0 = r3.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L19
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r3.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r2 = r2.getItemId()
            if (r2 != r4) goto L16
            return r1
        L16:
            int r1 = r1 + 1
            goto L5
        L19:
            r4 = -1
            return r4
    }

    androidx.appcompat.view.menu.MenuItemImpl findItemWithShortcutForKey(int r12, android.view.KeyEvent r13) {
            r11 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r11.mTempShortcutItemList
            r0.clear()
            r11.findItemsWithShortcutForKey(r0, r12, r13)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r13.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r13.getKeyData(r3)
            int r13 = r0.size()
            r4 = 1
            r5 = 0
            if (r13 != r4) goto L2b
            java.lang.Object r12 = r0.get(r5)
            androidx.appcompat.view.menu.MenuItemImpl r12 = (androidx.appcompat.view.menu.MenuItemImpl) r12
            return r12
        L2b:
            boolean r4 = r11.isQwertyMode()
            r6 = r5
        L30:
            if (r6 >= r13) goto L66
            java.lang.Object r7 = r0.get(r6)
            androidx.appcompat.view.menu.MenuItemImpl r7 = (androidx.appcompat.view.menu.MenuItemImpl) r7
            if (r4 == 0) goto L3f
            char r8 = r7.getAlphabeticShortcut()
            goto L43
        L3f:
            char r8 = r7.getNumericShortcut()
        L43:
            char[] r9 = r3.meta
            char r9 = r9[r5]
            if (r8 != r9) goto L4d
            r9 = r1 & 2
            if (r9 == 0) goto L62
        L4d:
            char[] r9 = r3.meta
            r10 = 2
            char r9 = r9[r10]
            if (r8 != r9) goto L58
            r9 = r1 & 2
            if (r9 != 0) goto L62
        L58:
            if (r4 == 0) goto L63
            r9 = 8
            if (r8 != r9) goto L63
            r8 = 67
            if (r12 != r8) goto L63
        L62:
            return r7
        L63:
            int r6 = r6 + 1
            goto L30
        L66:
            return r2
    }

    void findItemsWithShortcutForKey(java.util.List<androidx.appcompat.view.menu.MenuItemImpl> r13, int r14, android.view.KeyEvent r15) {
            r12 = this;
            boolean r0 = r12.isQwertyMode()
            int r1 = r15.getModifiers()
            android.view.KeyCharacterMap$KeyData r2 = new android.view.KeyCharacterMap$KeyData
            r2.<init>()
            boolean r3 = r15.getKeyData(r2)
            r4 = 67
            if (r3 != 0) goto L18
            if (r14 == r4) goto L18
            return
        L18:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r12.mItems
            int r3 = r3.size()
            r5 = 0
            r6 = r5
        L20:
            if (r6 >= r3) goto L7f
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r7 = r12.mItems
            java.lang.Object r7 = r7.get(r6)
            androidx.appcompat.view.menu.MenuItemImpl r7 = (androidx.appcompat.view.menu.MenuItemImpl) r7
            boolean r8 = r7.hasSubMenu()
            if (r8 == 0) goto L39
            android.view.SubMenu r8 = r7.getSubMenu()
            androidx.appcompat.view.menu.MenuBuilder r8 = (androidx.appcompat.view.menu.MenuBuilder) r8
            r8.findItemsWithShortcutForKey(r13, r14, r15)
        L39:
            if (r0 == 0) goto L40
            char r8 = r7.getAlphabeticShortcut()
            goto L44
        L40:
            char r8 = r7.getNumericShortcut()
        L44:
            if (r0 == 0) goto L4b
            int r9 = r7.getAlphabeticModifiers()
            goto L4f
        L4b:
            int r9 = r7.getNumericModifiers()
        L4f:
            r10 = 69647(0x1100f, float:9.7596E-41)
            r11 = r1 & r10
            r9 = r9 & r10
            if (r11 != r9) goto L59
            r9 = 1
            goto L5a
        L59:
            r9 = r5
        L5a:
            if (r9 == 0) goto L7c
            if (r8 == 0) goto L7c
            char[] r9 = r2.meta
            char r9 = r9[r5]
            if (r8 == r9) goto L73
            char[] r9 = r2.meta
            r10 = 2
            char r9 = r9[r10]
            if (r8 == r9) goto L73
            if (r0 == 0) goto L7c
            r9 = 8
            if (r8 != r9) goto L7c
            if (r14 != r4) goto L7c
        L73:
            boolean r8 = r7.isEnabled()
            if (r8 == 0) goto L7c
            r13.add(r7)
        L7c:
            int r6 = r6 + 1
            goto L20
        L7f:
            return
    }

    public void flagActionItems() {
            r6 = this;
            java.util.ArrayList r0 = r6.getVisibleItems()
            boolean r1 = r6.mIsActionItemsStale
            if (r1 != 0) goto L9
            return
        L9:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r1 = r6.mPresenters
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L11:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L31
            java.lang.Object r4 = r1.next()
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            java.lang.Object r5 = r4.get()
            androidx.appcompat.view.menu.MenuPresenter r5 = (androidx.appcompat.view.menu.MenuPresenter) r5
            if (r5 != 0) goto L2b
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r5 = r6.mPresenters
            r5.remove(r4)
            goto L11
        L2b:
            boolean r4 = r5.flagActionItems()
            r3 = r3 | r4
            goto L11
        L31:
            if (r3 == 0) goto L5e
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r6.mActionItems
            r1.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r6.mNonActionItems
            r1.clear()
            int r1 = r0.size()
            r3 = r2
        L42:
            if (r3 >= r1) goto L71
            java.lang.Object r4 = r0.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            boolean r5 = r4.isActionButton()
            if (r5 == 0) goto L56
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r5 = r6.mActionItems
            r5.add(r4)
            goto L5b
        L56:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r5 = r6.mNonActionItems
            r5.add(r4)
        L5b:
            int r3 = r3 + 1
            goto L42
        L5e:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r6.mActionItems
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r6.mNonActionItems
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r6.mNonActionItems
            java.util.ArrayList r1 = r6.getVisibleItems()
            r0.addAll(r1)
        L71:
            r6.mIsActionItemsStale = r2
            return
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getActionItems() {
            r1 = this;
            r1.flagActionItems()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mActionItems
            return r0
    }

    protected java.lang.String getActionViewStatesKey() {
            r1 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.mContext
            return r0
    }

    public androidx.appcompat.view.menu.MenuItemImpl getExpandedItem() {
            r1 = this;
            androidx.appcompat.view.menu.MenuItemImpl r0 = r1.mExpandedItem
            return r0
    }

    public android.graphics.drawable.Drawable getHeaderIcon() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mHeaderIcon
            return r0
    }

    public java.lang.CharSequence getHeaderTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mHeaderTitle
            return r0
    }

    public android.view.View getHeaderView() {
            r1 = this;
            android.view.View r0 = r1.mHeaderView
            return r0
    }

    @Override // android.view.Menu
    public android.view.MenuItem getItem(int r2) {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            java.lang.Object r2 = r0.get(r2)
            android.view.MenuItem r2 = (android.view.MenuItem) r2
            return r2
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getNonActionItems() {
            r1 = this;
            r1.flagActionItems()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mNonActionItems
            return r0
    }

    boolean getOptionalIconsVisible() {
            r1 = this;
            boolean r0 = r1.mOptionalIconsVisible
            return r0
    }

    android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            return r0
    }

    public androidx.appcompat.view.menu.MenuBuilder getRootMenu() {
            r0 = this;
            return r0
    }

    public java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> getVisibleItems() {
            r5 = this;
            boolean r0 = r5.mIsVisibleItemsStale
            if (r0 != 0) goto L7
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r5.mVisibleItems
            return r0
        L7:
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r5.mVisibleItems
            r0.clear()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r5.mItems
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L14:
            if (r2 >= r0) goto L2c
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r5.mItems
            java.lang.Object r3 = r3.get(r2)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            boolean r4 = r3.isVisible()
            if (r4 == 0) goto L29
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r4 = r5.mVisibleItems
            r4.add(r3)
        L29:
            int r2 = r2 + 1
            goto L14
        L2c:
            r5.mIsVisibleItemsStale = r1
            r0 = 1
            r5.mIsActionItemsStale = r0
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r5.mVisibleItems
            return r0
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
            r5 = this;
            boolean r0 = r5.mOverrideVisibleItems
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            int r0 = r5.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r0) goto L20
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r4 = r5.mItems
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            boolean r4 = r4.isVisible()
            if (r4 == 0) goto L1d
            return r1
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            return r2
    }

    public boolean isGroupDividerEnabled() {
            r1 = this;
            boolean r0 = r1.mGroupDividerEnabled
            return r0
    }

    boolean isQwertyMode() {
            r1 = this;
            boolean r0 = r1.mQwertyMode
            return r0
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            androidx.appcompat.view.menu.MenuItemImpl r1 = r0.findItemWithShortcutForKey(r1, r2)
            if (r1 == 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    public boolean isShortcutsVisible() {
            r1 = this;
            boolean r0 = r1.mShortcutsVisible
            return r0
    }

    void onItemActionRequestChanged(androidx.appcompat.view.menu.MenuItemImpl r1) {
            r0 = this;
            r1 = 1
            r0.mIsActionItemsStale = r1
            r0.onItemsChanged(r1)
            return
    }

    void onItemVisibleChanged(androidx.appcompat.view.menu.MenuItemImpl r1) {
            r0 = this;
            r1 = 1
            r0.mIsVisibleItemsStale = r1
            r0.onItemsChanged(r1)
            return
    }

    public void onItemsChanged(boolean r3) {
            r2 = this;
            boolean r0 = r2.mPreventDispatchingItemsChanged
            r1 = 1
            if (r0 != 0) goto Lf
            if (r3 == 0) goto Lb
            r2.mIsVisibleItemsStale = r1
            r2.mIsActionItemsStale = r1
        Lb:
            r2.dispatchPresenterUpdate(r3)
            goto L15
        Lf:
            r2.mItemsChangedWhileDispatchPrevented = r1
            if (r3 == 0) goto L15
            r2.mStructureChangedWhileDispatchPrevented = r1
        L15:
            return
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int r1, int r2) {
            r0 = this;
            android.view.MenuItem r1 = r0.findItem(r1)
            boolean r1 = r0.performItemAction(r1, r2)
            return r1
    }

    public boolean performItemAction(android.view.MenuItem r2, int r3) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.performItemAction(r2, r0, r3)
            return r2
    }

    public boolean performItemAction(android.view.MenuItem r7, androidx.appcompat.view.menu.MenuPresenter r8, int r9) {
            r6 = this;
            androidx.appcompat.view.menu.MenuItemImpl r7 = (androidx.appcompat.view.menu.MenuItemImpl) r7
            r0 = 0
            if (r7 == 0) goto L71
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Lc
            goto L71
        Lc:
            boolean r1 = r7.invoke()
            androidx.core.view.ActionProvider r2 = r7.getSupportActionProvider()
            r3 = 1
            if (r2 == 0) goto L1f
            boolean r4 = r2.hasSubMenu()
            if (r4 == 0) goto L1f
            r4 = r3
            goto L20
        L1f:
            r4 = r0
        L20:
            boolean r5 = r7.hasCollapsibleActionView()
            if (r5 == 0) goto L31
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L70
            r6.close(r3)
            goto L70
        L31:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L42
            if (r4 == 0) goto L3a
            goto L42
        L3a:
            r7 = r9 & 1
            if (r7 != 0) goto L70
            r6.close(r3)
            goto L70
        L42:
            r9 = r9 & 4
            if (r9 != 0) goto L49
            r6.close(r0)
        L49:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L5b
            androidx.appcompat.view.menu.SubMenuBuilder r9 = new androidx.appcompat.view.menu.SubMenuBuilder
            android.content.Context r0 = r6.getContext()
            r9.<init>(r0, r6, r7)
            r7.setSubMenu(r9)
        L5b:
            android.view.SubMenu r7 = r7.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r7 = (androidx.appcompat.view.menu.SubMenuBuilder) r7
            if (r4 == 0) goto L66
            r2.onPrepareSubMenu(r7)
        L66:
            boolean r7 = r6.dispatchSubMenuSelected(r7, r8)
            r1 = r1 | r7
            if (r1 != 0) goto L70
            r6.close(r3)
        L70:
            return r1
        L71:
            return r0
    }

    @Override // android.view.Menu
    public boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            androidx.appcompat.view.menu.MenuItemImpl r1 = r0.findItemWithShortcutForKey(r1, r2)
            if (r1 == 0) goto Lb
            boolean r1 = r0.performItemAction(r1, r3)
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r2 = r3 & 2
            if (r2 == 0) goto L14
            r2 = 1
            r0.close(r2)
        L14:
            return r1
    }

    @Override // android.view.Menu
    public void removeGroup(int r6) {
            r5 = this;
            int r0 = r5.findGroupIndex(r6)
            if (r0 < 0) goto L2a
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r5.mItems
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = 0
            r3 = r2
        Lf:
            int r4 = r3 + 1
            if (r3 >= r1) goto L26
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r3 = r5.mItems
            java.lang.Object r3 = r3.get(r0)
            androidx.appcompat.view.menu.MenuItemImpl r3 = (androidx.appcompat.view.menu.MenuItemImpl) r3
            int r3 = r3.getGroupId()
            if (r3 != r6) goto L26
            r5.removeItemAtInt(r0, r2)
            r3 = r4
            goto Lf
        L26:
            r6 = 1
            r5.onItemsChanged(r6)
        L2a:
            return
    }

    @Override // android.view.Menu
    public void removeItem(int r2) {
            r1 = this;
            int r2 = r1.findItemIndex(r2)
            r0 = 1
            r1.removeItemAtInt(r2, r0)
            return
    }

    public void removeItemAt(int r2) {
            r1 = this;
            r0 = 1
            r1.removeItemAtInt(r2, r0)
            return
    }

    public void removeMenuPresenter(androidx.appcompat.view.menu.MenuPresenter r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r0 = r3.mPresenters
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            androidx.appcompat.view.menu.MenuPresenter r2 = (androidx.appcompat.view.menu.MenuPresenter) r2
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<androidx.appcompat.view.menu.MenuPresenter>> r2 = r3.mPresenters
            r2.remove(r1)
            goto L6
        L22:
            return
    }

    public void restoreActionViewStates(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            java.lang.String r0 = r7.getActionViewStatesKey()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            int r1 = r7.size()
            r2 = 0
        L10:
            if (r2 >= r1) goto L38
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L26
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L26
            r4.restoreHierarchyState(r0)
        L26:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L35
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r3 = (androidx.appcompat.view.menu.SubMenuBuilder) r3
            r3.restoreActionViewStates(r8)
        L35:
            int r2 = r2 + 1
            goto L10
        L38:
            java.lang.String r0 = "android:menu:expandedactionview"
            int r8 = r8.getInt(r0)
            if (r8 <= 0) goto L49
            android.view.MenuItem r8 = r7.findItem(r8)
            if (r8 == 0) goto L49
            r8.expandActionView()
        L49:
            return
    }

    public void restorePresenterStates(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchRestoreInstanceState(r1)
            return
    }

    public void saveActionViewStates(android.os.Bundle r8) {
            r7 = this;
            int r0 = r7.size()
            r1 = 0
            r2 = 0
        L6:
            if (r2 >= r0) goto L44
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L32
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L32
            if (r1 != 0) goto L20
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L20:
            r4.saveHierarchyState(r1)
            boolean r4 = r3.isActionViewExpanded()
            if (r4 == 0) goto L32
            java.lang.String r4 = "android:menu:expandedactionview"
            int r5 = r3.getItemId()
            r8.putInt(r4, r5)
        L32:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L41
            android.view.SubMenu r3 = r3.getSubMenu()
            androidx.appcompat.view.menu.SubMenuBuilder r3 = (androidx.appcompat.view.menu.SubMenuBuilder) r3
            r3.saveActionViewStates(r8)
        L41:
            int r2 = r2 + 1
            goto L6
        L44:
            if (r1 == 0) goto L4d
            java.lang.String r0 = r7.getActionViewStatesKey()
            r8.putSparseParcelableArray(r0, r1)
        L4d:
            return
    }

    public void savePresenterStates(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchSaveInstanceState(r1)
            return
    }

    public void setCallback(androidx.appcompat.view.menu.MenuBuilder.Callback r1) {
            r0 = this;
            r0.mCallback = r1
            return
    }

    public void setCurrentMenuInfo(android.view.ContextMenu.ContextMenuInfo r1) {
            r0 = this;
            r0.mCurrentMenuInfo = r1
            return
    }

    public androidx.appcompat.view.menu.MenuBuilder setDefaultShowAsAction(int r1) {
            r0 = this;
            r0.mDefaultShowAsAction = r1
            return r0
    }

    void setExclusiveItemChecked(android.view.MenuItem r7) {
            r6 = this;
            int r0 = r7.getGroupId()
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r1 = r6.mItems
            int r1 = r1.size()
            r6.stopDispatchingItemsChanged()
            r2 = 0
            r3 = r2
        Lf:
            if (r3 >= r1) goto L38
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r4 = r6.mItems
            java.lang.Object r4 = r4.get(r3)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            int r5 = r4.getGroupId()
            if (r5 != r0) goto L35
            boolean r5 = r4.isExclusiveCheckable()
            if (r5 != 0) goto L26
            goto L35
        L26:
            boolean r5 = r4.isCheckable()
            if (r5 != 0) goto L2d
            goto L35
        L2d:
            if (r4 != r7) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = r2
        L32:
            r4.setCheckedInt(r5)
        L35:
            int r3 = r3 + 1
            goto Lf
        L38:
            r6.startDispatchingItemsChanged()
            return
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int r5, boolean r6, boolean r7) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mItems
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L20
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1d
            r2.setExclusiveCheckable(r7)
            r2.setCheckable(r6)
        L1d:
            int r1 = r1 + 1
            goto L7
        L20:
            return
    }

    @Override // androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.mGroupDividerEnabled = r1
            return
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r4.mItems
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r2 = r4.mItems
            java.lang.Object r2 = r2.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r2 = (androidx.appcompat.view.menu.MenuItemImpl) r2
            int r3 = r2.getGroupId()
            if (r3 != r5) goto L1a
            r2.setEnabled(r6)
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            return
    }

    @Override // android.view.Menu
    public void setGroupVisible(int r7, boolean r8) {
            r6 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r6.mItems
            int r0 = r0.size()
            r1 = 0
            r2 = r1
        L8:
            r3 = 1
            if (r1 >= r0) goto L23
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r4 = r6.mItems
            java.lang.Object r4 = r4.get(r1)
            androidx.appcompat.view.menu.MenuItemImpl r4 = (androidx.appcompat.view.menu.MenuItemImpl) r4
            int r5 = r4.getGroupId()
            if (r5 != r7) goto L20
            boolean r4 = r4.setVisibleInt(r8)
            if (r4 == 0) goto L20
            r2 = r3
        L20:
            int r1 = r1 + 1
            goto L8
        L23:
            if (r2 == 0) goto L28
            r6.onItemsChanged(r3)
        L28:
            return
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(int r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r3 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r6
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderIconInt(android.graphics.drawable.Drawable r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r5 = 0
            r0 = r6
            r4 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r6
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(int r7) {
            r6 = this;
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r6
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderTitleInt(java.lang.CharSequence r7) {
            r6 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0 = r6
            r2 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r6
    }

    protected androidx.appcompat.view.menu.MenuBuilder setHeaderViewInt(android.view.View r7) {
            r6 = this;
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0 = r6
            r5 = r7
            r0.setHeaderInternal(r1, r2, r3, r4, r5)
            return r6
    }

    public void setOptionalIconsVisible(boolean r1) {
            r0 = this;
            r0.mOptionalIconsVisible = r1
            return
    }

    public void setOverrideVisibleItems(boolean r1) {
            r0 = this;
            r0.mOverrideVisibleItems = r1
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.mQwertyMode = r1
            r1 = 0
            r0.onItemsChanged(r1)
            return
    }

    public void setShortcutsVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShortcutsVisible
            if (r0 != r2) goto L5
            return
        L5:
            r1.setShortcutsVisibleInner(r2)
            r2 = 0
            r1.onItemsChanged(r2)
            return
    }

    @Override // android.view.Menu
    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.appcompat.view.menu.MenuItemImpl> r0 = r1.mItems
            int r0 = r0.size()
            return r0
    }

    public void startDispatchingItemsChanged() {
            r2 = this;
            r0 = 0
            r2.mPreventDispatchingItemsChanged = r0
            boolean r1 = r2.mItemsChangedWhileDispatchPrevented
            if (r1 == 0) goto Le
            r2.mItemsChangedWhileDispatchPrevented = r0
            boolean r0 = r2.mStructureChangedWhileDispatchPrevented
            r2.onItemsChanged(r0)
        Le:
            return
    }

    public void stopDispatchingItemsChanged() {
            r1 = this;
            boolean r0 = r1.mPreventDispatchingItemsChanged
            if (r0 != 0) goto Lc
            r0 = 1
            r1.mPreventDispatchingItemsChanged = r0
            r0 = 0
            r1.mItemsChangedWhileDispatchPrevented = r0
            r1.mStructureChangedWhileDispatchPrevented = r0
        Lc:
            return
    }
}
