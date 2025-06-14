package androidx.appcompat.app;

/* loaded from: classes.dex */
public abstract class AppCompatDelegate {
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;

    @java.lang.Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final java.lang.String TAG = "AppCompatDelegate";
    private static final androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> sActivityDelegates = null;
    private static final java.lang.Object sActivityDelegatesLock = null;
    private static int sDefaultNightMode = -100;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    static {
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegates = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock = r0
            return
    }

    AppCompatDelegate() {
            r0 = this;
            r0.<init>()
            return
    }

    static void addActiveDelegate(androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r3)     // Catch: java.lang.Throwable -> L12
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L12
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L12
            r1.add(r2)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    private static void applyDayNightToActiveDelegates() {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L21
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L23
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L9
            r2.applyDayNight()     // Catch: java.lang.Throwable -> L23
            goto L9
        L21:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L23:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Activity r1, androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.app.Dialog r1, androidx.appcompat.app.AppCompatCallback r2) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context r1, android.app.Activity r2, androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static androidx.appcompat.app.AppCompatDelegate create(android.content.Context r1, android.view.Window r2, androidx.appcompat.app.AppCompatCallback r3) {
            androidx.appcompat.app.AppCompatDelegateImpl r0 = new androidx.appcompat.app.AppCompatDelegateImpl
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static int getDefaultNightMode() {
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            return r0
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.isCompatVectorFromResourcesEnabled()
            return r0
    }

    static void removeActivityDelegate(androidx.appcompat.app.AppCompatDelegate r1) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            removeDelegateFromActives(r1)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            return
        L8:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8
            throw r1
    }

    private static void removeDelegateFromActives(androidx.appcompat.app.AppCompatDelegate r3) {
            java.lang.Object r0 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegatesLock
            monitor-enter(r0)
            androidx.collection.ArraySet<java.lang.ref.WeakReference<androidx.appcompat.app.AppCompatDelegate>> r1 = androidx.appcompat.app.AppCompatDelegate.sActivityDelegates     // Catch: java.lang.Throwable -> L25
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L25
            androidx.appcompat.app.AppCompatDelegate r2 = (androidx.appcompat.app.AppCompatDelegate) r2     // Catch: java.lang.Throwable -> L25
            if (r2 == r3) goto L1f
            if (r2 != 0) goto L9
        L1f:
            r1.remove()     // Catch: java.lang.Throwable -> L25
            goto L9
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L25:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public static void setCompatVectorFromResourcesEnabled(boolean r0) {
            androidx.appcompat.widget.VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(r0)
            return
    }

    public static void setDefaultNightMode(int r1) {
            r0 = -1
            if (r1 == r0) goto L16
            if (r1 == 0) goto L16
            r0 = 1
            if (r1 == r0) goto L16
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L16
            java.lang.String r1 = "AppCompatDelegate"
            java.lang.String r0 = "setDefaultNightMode() called with an unknown mode"
            android.util.Log.d(r1, r0)
            goto L1f
        L16:
            int r0 = androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode
            if (r0 == r1) goto L1f
            androidx.appcompat.app.AppCompatDelegate.sDefaultNightMode = r1
            applyDayNightToActiveDelegates()
        L1f:
            return
    }

    public abstract void addContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract boolean applyDayNight();

    @java.lang.Deprecated
    public void attachBaseContext(android.content.Context r1) {
            r0 = this;
            return
    }

    public android.content.Context attachBaseContext2(android.content.Context r1) {
            r0 = this;
            r0.attachBaseContext(r1)
            return r1
    }

    public abstract android.view.View createView(android.view.View r1, java.lang.String r2, android.content.Context r3, android.util.AttributeSet r4);

    public abstract <T extends android.view.View> T findViewById(int r1);

    public abstract androidx.appcompat.app.ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public int getLocalNightMode() {
            r1 = this;
            r0 = -100
            return r0
    }

    public abstract android.view.MenuInflater getMenuInflater();

    public abstract androidx.appcompat.app.ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int r1);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(android.content.res.Configuration r1);

    public abstract void onCreate(android.os.Bundle r1);

    public abstract void onDestroy();

    public abstract void onPostCreate(android.os.Bundle r1);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(android.os.Bundle r1);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int r1);

    public abstract void setContentView(int r1);

    public abstract void setContentView(android.view.View r1);

    public abstract void setContentView(android.view.View r1, android.view.ViewGroup.LayoutParams r2);

    public abstract void setHandleNativeActionModesEnabled(boolean r1);

    public abstract void setLocalNightMode(int r1);

    public abstract void setSupportActionBar(androidx.appcompat.widget.Toolbar r1);

    public void setTheme(int r1) {
            r0 = this;
            return
    }

    public abstract void setTitle(java.lang.CharSequence r1);

    public abstract androidx.appcompat.view.ActionMode startSupportActionMode(androidx.appcompat.view.ActionMode.Callback r1);
}
