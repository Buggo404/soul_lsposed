package androidx.appcompat.app;

/* loaded from: classes.dex */
class ResourcesFlusher {
    private static final java.lang.String TAG = "ResourcesFlusher";
    private static java.lang.reflect.Field sDrawableCacheField;
    private static boolean sDrawableCacheFieldFetched;
    private static java.lang.reflect.Field sResourcesImplField;
    private static boolean sResourcesImplFieldFetched;
    private static java.lang.Class<?> sThemedResourceCacheClazz;
    private static boolean sThemedResourceCacheClazzFetched;
    private static java.lang.reflect.Field sThemedResourceCache_mUnthemedEntriesField;
    private static boolean sThemedResourceCache_mUnthemedEntriesFieldFetched;

    private ResourcesFlusher() {
            r0 = this;
            r0.<init>()
            return
    }

    static void flush(android.content.res.Resources r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L7
            return
        L7:
            flushNougats(r2)
            return
    }

    private static void flushLollipops(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L34
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L28
            java.util.Map r4 = (java.util.Map) r4     // Catch: java.lang.IllegalAccessException -> L28
            goto L2f
        L28:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
            r4 = 0
        L2f:
            if (r4 == 0) goto L34
            r4.clear()
        L34:
            return
    }

    private static void flushMarshmallows(android.content.res.Resources r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            java.lang.String r1 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            r0 = 1
            java.lang.Class<android.content.res.Resources> r2 = android.content.res.Resources.class
            java.lang.String r3 = "mDrawableCache"
            java.lang.reflect.Field r2 = r2.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r2     // Catch: java.lang.NoSuchFieldException -> L15
            r2.setAccessible(r0)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r2 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mDrawableCache field"
            android.util.Log.e(r1, r3, r2)
        L1b:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r0
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L2c
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L26
            goto L2d
        L26:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mDrawableCache"
            android.util.Log.e(r1, r0, r4)
        L2c:
            r4 = 0
        L2d:
            if (r4 != 0) goto L30
            return
        L30:
            flushThemedResourcesCache(r4)
            return
    }

    private static void flushNougats(android.content.res.Resources r5) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L1d
            java.lang.Class<android.content.res.Resources> r0 = android.content.res.Resources.class
            java.lang.String r3 = "mResourcesImpl"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L15
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplField = r0     // Catch: java.lang.NoSuchFieldException -> L15
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L15
            goto L1b
        L15:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve Resources#mResourcesImpl field"
            android.util.Log.e(r2, r3, r0)
        L1b:
            androidx.appcompat.app.ResourcesFlusher.sResourcesImplFieldFetched = r1
        L1d:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sResourcesImplField
            if (r0 != 0) goto L22
            return
        L22:
            r3 = 0
            java.lang.Object r5 = r0.get(r5)     // Catch: java.lang.IllegalAccessException -> L28
            goto L2f
        L28:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from Resources#mResourcesImpl"
            android.util.Log.e(r2, r0, r5)
            r5 = r3
        L2f:
            if (r5 != 0) goto L32
            return
        L32:
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched
            if (r0 != 0) goto L4e
            java.lang.Class r0 = r5.getClass()     // Catch: java.lang.NoSuchFieldException -> L46
            java.lang.String r4 = "mDrawableCache"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> L46
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField = r0     // Catch: java.lang.NoSuchFieldException -> L46
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L46
            goto L4c
        L46:
            r0 = move-exception
            java.lang.String r4 = "Could not retrieve ResourcesImpl#mDrawableCache field"
            android.util.Log.e(r2, r4, r0)
        L4c:
            androidx.appcompat.app.ResourcesFlusher.sDrawableCacheFieldFetched = r1
        L4e:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sDrawableCacheField
            if (r0 == 0) goto L5d
            java.lang.Object r3 = r0.get(r5)     // Catch: java.lang.IllegalAccessException -> L57
            goto L5d
        L57:
            r5 = move-exception
            java.lang.String r0 = "Could not retrieve value from ResourcesImpl#mDrawableCache"
            android.util.Log.e(r2, r0, r5)
        L5d:
            if (r3 == 0) goto L62
            flushThemedResourcesCache(r3)
        L62:
            return
    }

    private static void flushThemedResourcesCache(java.lang.Object r4) {
            boolean r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched
            r1 = 1
            java.lang.String r2 = "ResourcesFlusher"
            if (r0 != 0) goto L18
            java.lang.String r0 = "android.content.res.ThemedResourceCache"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.ClassNotFoundException -> L10
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz = r0     // Catch: java.lang.ClassNotFoundException -> L10
            goto L16
        L10:
            r0 = move-exception
            java.lang.String r3 = "Could not find ThemedResourceCache class"
            android.util.Log.e(r2, r3, r0)
        L16:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazzFetched = r1
        L18:
            java.lang.Class<?> r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCacheClazz
            if (r0 != 0) goto L1d
            return
        L1d:
            boolean r3 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched
            if (r3 != 0) goto L35
            java.lang.String r3 = "mUnthemedEntries"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.NoSuchFieldException -> L2d
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField = r0     // Catch: java.lang.NoSuchFieldException -> L2d
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L2d
            goto L33
        L2d:
            r0 = move-exception
            java.lang.String r3 = "Could not retrieve ThemedResourceCache#mUnthemedEntries field"
            android.util.Log.e(r2, r3, r0)
        L33:
            androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesFieldFetched = r1
        L35:
            java.lang.reflect.Field r0 = androidx.appcompat.app.ResourcesFlusher.sThemedResourceCache_mUnthemedEntriesField
            if (r0 != 0) goto L3a
            return
        L3a:
            java.lang.Object r4 = r0.get(r4)     // Catch: java.lang.IllegalAccessException -> L41
            android.util.LongSparseArray r4 = (android.util.LongSparseArray) r4     // Catch: java.lang.IllegalAccessException -> L41
            goto L48
        L41:
            r4 = move-exception
            java.lang.String r0 = "Could not retrieve value from ThemedResourceCache#mUnthemedEntries"
            android.util.Log.e(r2, r0, r4)
            r4 = 0
        L48:
            if (r4 == 0) goto L4d
            r4.clear()
        L4d:
            return
    }
}
