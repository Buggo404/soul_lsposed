package androidx.appcompat.content.res;

/* loaded from: classes.dex */
public final class AppCompatResources {
    private static final java.lang.String LOG_TAG = "AppCompatResources";
    private static final java.lang.ThreadLocal<android.util.TypedValue> TL_TYPED_VALUE = null;
    private static final java.lang.Object sColorStateCacheLock = null;
    private static final java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry>> sColorStateCaches = null;

    private static class ColorStateListCacheEntry {
        final android.content.res.Configuration configuration;
        final android.content.res.ColorStateList value;

        ColorStateListCacheEntry(android.content.res.ColorStateList r1, android.content.res.Configuration r2) {
                r0 = this;
                r0.<init>()
                r0.value = r1
                r0.configuration = r2
                return
        }
    }

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            androidx.appcompat.content.res.AppCompatResources.TL_TYPED_VALUE = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            androidx.appcompat.content.res.AppCompatResources.sColorStateCaches = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.content.res.AppCompatResources.sColorStateCacheLock = r0
            return
    }

    private AppCompatResources() {
            r0 = this;
            r0.<init>()
            return
    }

    private static void addColorStateListToCache(android.content.Context r3, int r4, android.content.res.ColorStateList r5) {
            java.lang.Object r0 = androidx.appcompat.content.res.AppCompatResources.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry>> r1 = androidx.appcompat.content.res.AppCompatResources.sColorStateCaches     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r1.get(r3)     // Catch: java.lang.Throwable -> L27
            android.util.SparseArray r2 = (android.util.SparseArray) r2     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L15
            android.util.SparseArray r2 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L27
            r2.<init>()     // Catch: java.lang.Throwable -> L27
            r1.put(r3, r2)     // Catch: java.lang.Throwable -> L27
        L15:
            androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry r1 = new androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry     // Catch: java.lang.Throwable -> L27
            android.content.res.Resources r3 = r3.getResources()     // Catch: java.lang.Throwable -> L27
            android.content.res.Configuration r3 = r3.getConfiguration()     // Catch: java.lang.Throwable -> L27
            r1.<init>(r5, r3)     // Catch: java.lang.Throwable -> L27
            r2.append(r4, r1)     // Catch: java.lang.Throwable -> L27
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            return
        L27:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L27
            throw r3
    }

    private static android.content.res.ColorStateList getCachedColorStateList(android.content.Context r4, int r5) {
            java.lang.Object r0 = androidx.appcompat.content.res.AppCompatResources.sColorStateCacheLock
            monitor-enter(r0)
            java.util.WeakHashMap<android.content.Context, android.util.SparseArray<androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry>> r1 = androidx.appcompat.content.res.AppCompatResources.sColorStateCaches     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L35
            android.util.SparseArray r1 = (android.util.SparseArray) r1     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L32
            int r2 = r1.size()     // Catch: java.lang.Throwable -> L35
            if (r2 <= 0) goto L32
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L35
            androidx.appcompat.content.res.AppCompatResources$ColorStateListCacheEntry r2 = (androidx.appcompat.content.res.AppCompatResources.ColorStateListCacheEntry) r2     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto L32
            android.content.res.Configuration r3 = r2.configuration     // Catch: java.lang.Throwable -> L35
            android.content.res.Resources r4 = r4.getResources()     // Catch: java.lang.Throwable -> L35
            android.content.res.Configuration r4 = r4.getConfiguration()     // Catch: java.lang.Throwable -> L35
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 == 0) goto L2f
            android.content.res.ColorStateList r4 = r2.value     // Catch: java.lang.Throwable -> L35
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return r4
        L2f:
            r1.remove(r5)     // Catch: java.lang.Throwable -> L35
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            r4 = 0
            return r4
        L35:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            throw r4
    }

    public static android.content.res.ColorStateList getColorStateList(android.content.Context r0, int r1) {
            android.content.res.ColorStateList r0 = r0.getColorStateList(r1)
            return r0
    }

    public static android.graphics.drawable.Drawable getDrawable(android.content.Context r1, int r2) {
            androidx.appcompat.widget.ResourceManagerInternal r0 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r1, r2)
            return r1
    }

    private static android.util.TypedValue getTypedValue() {
            java.lang.ThreadLocal<android.util.TypedValue> r0 = androidx.appcompat.content.res.AppCompatResources.TL_TYPED_VALUE
            java.lang.Object r1 = r0.get()
            android.util.TypedValue r1 = (android.util.TypedValue) r1
            if (r1 != 0) goto L12
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            r0.set(r1)
        L12:
            return r1
    }

    private static android.content.res.ColorStateList inflateColorStateList(android.content.Context r2, int r3) {
            boolean r0 = isColorInt(r2, r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.XmlResourceParser r3 = r0.getXml(r3)
            android.content.res.Resources$Theme r2 = r2.getTheme()     // Catch: java.lang.Exception -> L19
            android.content.res.ColorStateList r2 = androidx.core.content.res.ColorStateListInflaterCompat.createFromXml(r0, r3, r2)     // Catch: java.lang.Exception -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.String r3 = "AppCompatResources"
            java.lang.String r0 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.e(r3, r0, r2)
            return r1
    }

    private static boolean isColorInt(android.content.Context r2, int r3) {
            android.content.res.Resources r2 = r2.getResources()
            android.util.TypedValue r0 = getTypedValue()
            r1 = 1
            r2.getValue(r3, r0, r1)
            int r2 = r0.type
            r3 = 28
            if (r2 < r3) goto L19
            int r2 = r0.type
            r3 = 31
            if (r2 > r3) goto L19
            goto L1a
        L19:
            r1 = 0
        L1a:
            return r1
    }
}
