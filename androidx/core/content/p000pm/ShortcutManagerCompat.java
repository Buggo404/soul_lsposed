package androidx.core.content.p000pm;

/* loaded from: classes.dex */
public class ShortcutManagerCompat {
    static final java.lang.String ACTION_INSTALL_SHORTCUT = "com.android.launcher.action.INSTALL_SHORTCUT";
    private static final int DEFAULT_MAX_ICON_DIMENSION_DP = 96;
    private static final int DEFAULT_MAX_ICON_DIMENSION_LOWRAM_DP = 48;
    public static final java.lang.String EXTRA_SHORTCUT_ID = "android.intent.extra.shortcut.ID";
    public static final int FLAG_MATCH_CACHED = 8;
    public static final int FLAG_MATCH_DYNAMIC = 2;
    public static final int FLAG_MATCH_MANIFEST = 1;
    public static final int FLAG_MATCH_PINNED = 4;
    static final java.lang.String INSTALL_SHORTCUT_PERMISSION = "com.android.launcher.permission.INSTALL_SHORTCUT";
    private static volatile androidx.core.content.p000pm.ShortcutInfoCompatSaver<?> sShortcutInfoCompatSaver;


    private static class Api25Impl {
        private Api25Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static java.lang.String getShortcutInfoWithLowestRank(java.util.List<android.content.pm.ShortcutInfo> r5) {
                java.util.Iterator r5 = r5.iterator()
                r0 = -1
                r1 = 0
            L6:
                boolean r2 = r5.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r5.next()
                android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
                int r3 = r2.getRank()
                if (r3 <= r0) goto L6
                java.lang.String r0 = r2.getId()
                int r1 = r2.getRank()
                r4 = r1
                r1 = r0
                r0 = r4
                goto L6
            L24:
                return r1
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShortcutMatchFlags {
    }

    static {
            return
    }

    private ShortcutManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean addDynamicShortcuts(android.content.Context r3, java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 > r1) goto L9
            convertUriIconsToBitmapIcons(r3, r4)
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L3c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.p000pm.ShortcutInfoCompat) r2
            android.content.pm.ShortcutInfo r2 = r2.toShortcutInfo()
            r0.add(r2)
            goto L18
        L2c:
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r0 = r1.addDynamicShortcuts(r0)
            if (r0 != 0) goto L3c
            r3 = 0
            return r3
        L3c:
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)
            r3.addShortcuts(r4)
            r3 = 1
            return r3
    }

    static boolean convertUriIconToBitmapIcon(android.content.Context r5, androidx.core.content.p000pm.ShortcutInfoCompat r6) {
            androidx.core.graphics.drawable.IconCompat r0 = r6.mIcon
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.core.graphics.drawable.IconCompat r0 = r6.mIcon
            int r0 = r0.mType
            r2 = 1
            r3 = 6
            if (r0 == r3) goto L12
            r4 = 4
            if (r0 == r4) goto L12
            return r2
        L12:
            androidx.core.graphics.drawable.IconCompat r4 = r6.mIcon
            java.io.InputStream r5 = r4.getUriInputStream(r5)
            if (r5 != 0) goto L1b
            return r1
        L1b:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r5)
            if (r5 != 0) goto L22
            return r1
        L22:
            if (r0 != r3) goto L29
            androidx.core.graphics.drawable.IconCompat r5 = androidx.core.graphics.drawable.IconCompat.createWithAdaptiveBitmap(r5)
            goto L2d
        L29:
            androidx.core.graphics.drawable.IconCompat r5 = androidx.core.graphics.drawable.IconCompat.createWithBitmap(r5)
        L2d:
            r6.mIcon = r5
            return r2
    }

    static void convertUriIconsToBitmapIcons(android.content.Context r3, java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r4)
            java.util.Iterator r0 = r0.iterator()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()
            androidx.core.content.pm.ShortcutInfoCompat r1 = (androidx.core.content.p000pm.ShortcutInfoCompat) r1
            boolean r2 = convertUriIconToBitmapIcon(r3, r1)
            if (r2 != 0) goto L9
            r4.remove(r1)
            goto L9
        L1f:
            return
    }

    public static android.content.Intent createShortcutResultIntent(android.content.Context r2, androidx.core.content.p000pm.ShortcutInfoCompat r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r0 = r3.toShortcutInfo()
            android.content.Intent r2 = r2.createShortcutResultIntent(r0)
            goto L18
        L17:
            r2 = 0
        L18:
            if (r2 != 0) goto L1f
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
        L1f:
            android.content.Intent r2 = r3.addToIntent(r2)
            return r2
    }

    public static void disableShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3, java.lang.CharSequence r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.disableShortcuts(r3, r4)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r2)
            r2.removeShortcuts(r3)
            return
    }

    public static void enableShortcuts(android.content.Context r3, java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L30
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L13:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.p000pm.ShortcutInfoCompat) r2
            java.lang.String r2 = r2.mId
            r0.add(r2)
            goto L13
        L25:
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            r1.enableShortcuts(r0)
        L30:
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)
            r3.addShortcuts(r4)
            return
    }

    public static java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> getDynamicShortcuts(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L39
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r0 = r0.getDynamicShortcuts()
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            android.content.pm.ShortcutInfo r2 = (android.content.pm.ShortcutInfo) r2
            androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r3.<init>(r4, r2)
            androidx.core.content.pm.ShortcutInfoCompat r2 = r3.build()
            r1.add(r2)
            goto L1f
        L38:
            return r1
        L39:
            androidx.core.content.pm.ShortcutInfoCompatSaver r4 = getShortcutInfoSaverInstance(r4)     // Catch: java.lang.Exception -> L42
            java.util.List r4 = r4.getShortcuts()     // Catch: java.lang.Exception -> L42
            return r4
        L42:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            return r4
    }

    private static int getIconDimensionInternal(android.content.Context r2, boolean r3) {
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r2.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r1 = 1
            if (r0 == 0) goto L14
            boolean r0 = r0.isLowRamDevice()
            if (r0 == 0) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L1a
            r0 = 48
            goto L1c
        L1a:
            r0 = 96
        L1c:
            int r0 = java.lang.Math.max(r1, r0)
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            if (r3 == 0) goto L2d
            float r2 = r2.xdpi
            goto L2f
        L2d:
            float r2 = r2.ydpi
        L2f:
            r3 = 1126170624(0x43200000, float:160.0)
            float r2 = r2 / r3
            float r3 = (float) r0
            float r3 = r3 * r2
            int r2 = (int) r3
            return r2
    }

    public static int getIconMaxHeight(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getIconMaxHeight()
            return r2
        L16:
            r0 = 0
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getIconMaxWidth(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getIconMaxWidth()
            return r2
        L16:
            r0 = 1
            int r2 = getIconDimensionInternal(r2, r0)
            return r2
    }

    public static int getMaxShortcutCountPerActivity(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            int r2 = r2.getMaxShortcutCountPerActivity()
            return r2
        L16:
            r2 = 5
            return r2
    }

    private static java.lang.String getShortcutInfoCompatWithLowestRank(java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r5) {
            java.util.Iterator r5 = r5.iterator()
            r0 = -1
            r1 = 0
        L6:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r5.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.p000pm.ShortcutInfoCompat) r2
            int r3 = r2.getRank()
            if (r3 <= r0) goto L6
            java.lang.String r0 = r2.getId()
            int r1 = r2.getRank()
            r4 = r1
            r1 = r0
            r0 = r4
            goto L6
        L24:
            return r1
    }

    private static androidx.core.content.p000pm.ShortcutInfoCompatSaver<?> getShortcutInfoSaverInstance(android.content.Context r6) {
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r0 = androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r0 != 0) goto L36
            java.lang.Class<androidx.core.content.pm.ShortcutManagerCompat> r0 = androidx.core.content.p000pm.ShortcutManagerCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "androidx.sharetarget.ShortcutInfoCompatSaverImpl"
            r2 = 0
            java.lang.Class r0 = java.lang.Class.forName(r1, r2, r0)     // Catch: java.lang.Exception -> L2b
            java.lang.String r1 = "getInstance"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2b
            java.lang.Class<android.content.Context> r5 = android.content.Context.class
            r4[r2] = r5     // Catch: java.lang.Exception -> L2b
            java.lang.reflect.Method r0 = r0.getMethod(r1, r4)     // Catch: java.lang.Exception -> L2b
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2b
            r1[r2] = r6     // Catch: java.lang.Exception -> L2b
            r6 = 0
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Exception -> L2b
            androidx.core.content.pm.ShortcutInfoCompatSaver r6 = (androidx.core.content.p000pm.ShortcutInfoCompatSaver) r6     // Catch: java.lang.Exception -> L2b
            androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6     // Catch: java.lang.Exception -> L2b
        L2b:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            if (r6 != 0) goto L36
            androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl r6 = new androidx.core.content.pm.ShortcutInfoCompatSaver$NoopImpl
            r6.<init>()
            androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r6
        L36:
            androidx.core.content.pm.ShortcutInfoCompatSaver<?> r6 = androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver
            return r6
    }

    public static java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> getShortcuts(android.content.Context r3, int r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.List r4 = r0.getShortcuts(r4)
            java.util.List r3 = androidx.core.content.p000pm.ShortcutInfoCompat.fromShortcuts(r3, r4)
            return r3
        L17:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L50
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r3.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = r4 & 1
            if (r2 == 0) goto L35
            java.util.List r2 = r0.getManifestShortcuts()
            r1.addAll(r2)
        L35:
            r2 = r4 & 2
            if (r2 == 0) goto L40
            java.util.List r2 = r0.getDynamicShortcuts()
            r1.addAll(r2)
        L40:
            r4 = r4 & 4
            if (r4 == 0) goto L4b
            java.util.List r4 = r0.getPinnedShortcuts()
            r1.addAll(r4)
        L4b:
            java.util.List r3 = androidx.core.content.p000pm.ShortcutInfoCompat.fromShortcuts(r3, r1)
            return r3
        L50:
            r4 = r4 & 2
            if (r4 == 0) goto L5d
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)     // Catch: java.lang.Exception -> L5d
            java.util.List r3 = r3.getShortcuts()     // Catch: java.lang.Exception -> L5d
            return r3
        L5d:
            java.util.List r3 = java.util.Collections.emptyList()
            return r3
    }

    public static boolean isRateLimitingActive(android.content.Context r2) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L16
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            boolean r2 = r2.isRateLimitingActive()
            return r2
        L16:
            r0 = 3
            java.util.List r0 = getShortcuts(r2, r0)
            int r0 = r0.size()
            int r2 = getMaxShortcutCountPerActivity(r2)
            if (r0 != r2) goto L27
            r2 = 1
            goto L28
        L27:
            r2 = 0
        L28:
            return r2
    }

    public static boolean isRequestPinShortcutSupported(android.content.Context r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L13
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r4 = r4.getSystemService(r0)
            android.content.pm.ShortcutManager r4 = (android.content.pm.ShortcutManager) r4
            boolean r4 = r4.isRequestPinShortcutSupported()
            return r4
        L13:
            java.lang.String r0 = "com.android.launcher.permission.INSTALL_SHORTCUT"
            int r1 = androidx.core.content.ContextCompat.checkSelfPermission(r4, r0)
            r2 = 0
            if (r1 == 0) goto L1d
            return r2
        L1d:
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            android.content.Intent r1 = new android.content.Intent
            java.lang.String r3 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r1.<init>(r3)
            java.util.List r4 = r4.queryBroadcastReceivers(r1, r2)
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4e
            java.lang.Object r1 = r4.next()
            android.content.pm.ResolveInfo r1 = (android.content.pm.ResolveInfo) r1
            android.content.pm.ActivityInfo r1 = r1.activityInfo
            java.lang.String r1 = r1.permission
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L4c
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L30
        L4c:
            r4 = 1
            return r4
        L4e:
            return r2
    }

    public static boolean pushDynamicShortcut(android.content.Context r6, androidx.core.content.p000pm.ShortcutInfoCompat r7) {
            androidx.core.util.Preconditions.checkNotNull(r6)
            androidx.core.util.Preconditions.checkNotNull(r7)
            int r0 = getMaxShortcutCountPerActivity(r6)
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 > r3) goto L17
            convertUriIconToBitmapIcon(r6, r7)
        L17:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 30
            r4 = 1
            if (r2 < r3) goto L2e
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            android.content.pm.ShortcutInfo r3 = r7.toShortcutInfo()
            r2.pushDynamicShortcut(r3)
            goto L6b
        L2e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 25
            if (r2 < r3) goto L6b
            java.lang.Class<android.content.pm.ShortcutManager> r2 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r6.getSystemService(r2)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            boolean r3 = r2.isRateLimitingActive()
            if (r3 == 0) goto L43
            return r1
        L43:
            java.util.List r3 = r2.getDynamicShortcuts()
            int r5 = r3.size()
            if (r5 < r0) goto L5c
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r3 = androidx.core.content.pm.ShortcutManagerCompat.Api25Impl.getShortcutInfoWithLowestRank(r3)
            r5[r1] = r3
            java.util.List r3 = java.util.Arrays.asList(r5)
            r2.removeDynamicShortcuts(r3)
        L5c:
            android.content.pm.ShortcutInfo[] r3 = new android.content.pm.ShortcutInfo[r4]
            android.content.pm.ShortcutInfo r5 = r7.toShortcutInfo()
            r3[r1] = r5
            java.util.List r3 = java.util.Arrays.asList(r3)
            r2.addDynamicShortcuts(r3)
        L6b:
            androidx.core.content.pm.ShortcutInfoCompatSaver r6 = getShortcutInfoSaverInstance(r6)
            java.util.List r2 = r6.getShortcuts()     // Catch: java.lang.Exception -> L94
            int r3 = r2.size()     // Catch: java.lang.Exception -> L94
            if (r3 < r0) goto L88
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch: java.lang.Exception -> L94
            java.lang.String r2 = getShortcutInfoCompatWithLowestRank(r2)     // Catch: java.lang.Exception -> L94
            r0[r1] = r2     // Catch: java.lang.Exception -> L94
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> L94
            r6.removeShortcuts(r0)     // Catch: java.lang.Exception -> L94
        L88:
            androidx.core.content.pm.ShortcutInfoCompat[] r0 = new androidx.core.content.p000pm.ShortcutInfoCompat[r4]     // Catch: java.lang.Exception -> L94
            r0[r1] = r7     // Catch: java.lang.Exception -> L94
            java.util.List r7 = java.util.Arrays.asList(r0)     // Catch: java.lang.Exception -> L94
            r6.addShortcuts(r7)     // Catch: java.lang.Exception -> L94
            return r4
        L94:
            return r1
    }

    public static void removeAllDynamicShortcuts(android.content.Context r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeAllDynamicShortcuts()
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r2)
            r2.removeAllShortcuts()
            return
    }

    public static void removeDynamicShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L11
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeDynamicShortcuts(r3)
        L11:
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r2)
            r2.removeShortcuts(r3)
            return
    }

    public static void removeLongLivedShortcuts(android.content.Context r2, java.util.List<java.lang.String> r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 >= r1) goto La
            removeDynamicShortcuts(r2, r3)
            return
        La:
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r0 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r0 = (android.content.pm.ShortcutManager) r0
            r0.removeLongLivedShortcuts(r3)
            androidx.core.content.pm.ShortcutInfoCompatSaver r2 = getShortcutInfoSaverInstance(r2)
            r2.removeShortcuts(r3)
            return
    }

    public static void reportShortcutUsed(android.content.Context r2, java.lang.String r3) {
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.util.Preconditions.checkNotNull(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r2 = r2.getSystemService(r0)
            android.content.pm.ShortcutManager r2 = (android.content.pm.ShortcutManager) r2
            r2.reportShortcutUsed(r3)
        L17:
            return
    }

    public static boolean requestPinShortcut(android.content.Context r10, androidx.core.content.p000pm.ShortcutInfoCompat r11, android.content.IntentSender r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto L17
            java.lang.Class<android.content.pm.ShortcutManager> r0 = android.content.pm.ShortcutManager.class
            java.lang.Object r10 = r10.getSystemService(r0)
            android.content.pm.ShortcutManager r10 = (android.content.pm.ShortcutManager) r10
            android.content.pm.ShortcutInfo r11 = r11.toShortcutInfo()
            boolean r10 = r10.requestPinShortcut(r11, r12)
            return r10
        L17:
            boolean r0 = isRequestPinShortcutSupported(r10)
            if (r0 != 0) goto L1f
            r10 = 0
            return r10
        L1f:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.android.launcher.action.INSTALL_SHORTCUT"
            r0.<init>(r1)
            android.content.Intent r3 = r11.addToIntent(r0)
            r11 = 1
            if (r12 != 0) goto L31
            r10.sendBroadcast(r3)
            return r11
        L31:
            r4 = 0
            androidx.core.content.pm.ShortcutManagerCompat$1 r5 = new androidx.core.content.pm.ShortcutManagerCompat$1
            r5.<init>(r12)
            r6 = 0
            r7 = -1
            r8 = 0
            r9 = 0
            r2 = r10
            r2.sendOrderedBroadcast(r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public static boolean setDynamicShortcuts(android.content.Context r3, java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r4) {
            androidx.core.util.Preconditions.checkNotNull(r3)
            androidx.core.util.Preconditions.checkNotNull(r4)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L3d
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r1 = r4.iterator()
        L19:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.p000pm.ShortcutInfoCompat) r2
            android.content.pm.ShortcutInfo r2 = r2.toShortcutInfo()
            r0.add(r2)
            goto L19
        L2d:
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r0 = r1.setDynamicShortcuts(r0)
            if (r0 != 0) goto L3d
            r3 = 0
            return r3
        L3d:
            androidx.core.content.pm.ShortcutInfoCompatSaver r0 = getShortcutInfoSaverInstance(r3)
            r0.removeAllShortcuts()
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)
            r3.addShortcuts(r4)
            r3 = 1
            return r3
    }

    static void setShortcutInfoCompatSaver(androidx.core.content.p000pm.ShortcutInfoCompatSaver<java.lang.Void> r0) {
            androidx.core.content.p000pm.ShortcutManagerCompat.sShortcutInfoCompatSaver = r0
            return
    }

    public static boolean updateShortcuts(android.content.Context r3, java.util.List<androidx.core.content.p000pm.ShortcutInfoCompat> r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 > r1) goto L9
            convertUriIconsToBitmapIcons(r3, r4)
        L9:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 25
            if (r0 < r1) goto L3c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r4.iterator()
        L18:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()
            androidx.core.content.pm.ShortcutInfoCompat r2 = (androidx.core.content.p000pm.ShortcutInfoCompat) r2
            android.content.pm.ShortcutInfo r2 = r2.toShortcutInfo()
            r0.add(r2)
            goto L18
        L2c:
            java.lang.Class<android.content.pm.ShortcutManager> r1 = android.content.pm.ShortcutManager.class
            java.lang.Object r1 = r3.getSystemService(r1)
            android.content.pm.ShortcutManager r1 = (android.content.pm.ShortcutManager) r1
            boolean r0 = r1.updateShortcuts(r0)
            if (r0 != 0) goto L3c
            r3 = 0
            return r3
        L3c:
            androidx.core.content.pm.ShortcutInfoCompatSaver r3 = getShortcutInfoSaverInstance(r3)
            r3.addShortcuts(r4)
            r3 = 1
            return r3
    }
}
