package androidx.core.view;

/* loaded from: classes.dex */
public final class DisplayCompat {
    private static final int DISPLAY_SIZE_4K_HEIGHT = 2160;
    private static final int DISPLAY_SIZE_4K_WIDTH = 3840;

    static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static void getRealSize(android.view.Display r0, android.graphics.Point r1) {
                r0.getRealSize(r1)
                return
        }
    }

    static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context r1, android.view.Display r2) {
                android.view.Display$Mode r0 = r2.getMode()
                android.graphics.Point r1 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r1, r2)
                if (r1 == 0) goto L17
                boolean r2 = physicalSizeEquals(r0, r1)
                if (r2 == 0) goto L11
                goto L17
            L11:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r2.<init>(r0, r1)
                goto L1d
            L17:
                androidx.core.view.DisplayCompat$ModeCompat r2 = new androidx.core.view.DisplayCompat$ModeCompat
                r1 = 1
                r2.<init>(r0, r1)
            L1d:
                return r2
        }

        public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context r6, android.view.Display r7) {
                android.view.Display$Mode[] r0 = r7.getSupportedModes()
                int r1 = r0.length
                androidx.core.view.DisplayCompat$ModeCompat[] r1 = new androidx.core.view.DisplayCompat.ModeCompat[r1]
                android.view.Display$Mode r2 = r7.getMode()
                android.graphics.Point r6 = androidx.core.view.DisplayCompat.getCurrentDisplaySizeFromWorkarounds(r6, r7)
                r7 = 0
                if (r6 == 0) goto L39
                boolean r3 = physicalSizeEquals(r2, r6)
                if (r3 == 0) goto L19
                goto L39
            L19:
                r3 = r7
            L1a:
                int r4 = r0.length
                if (r3 >= r4) goto L4e
                r4 = r0[r3]
                boolean r4 = physicalSizeEquals(r4, r2)
                if (r4 == 0) goto L2d
                androidx.core.view.DisplayCompat$ModeCompat r4 = new androidx.core.view.DisplayCompat$ModeCompat
                r5 = r0[r3]
                r4.<init>(r5, r6)
                goto L34
            L2d:
                androidx.core.view.DisplayCompat$ModeCompat r4 = new androidx.core.view.DisplayCompat$ModeCompat
                r5 = r0[r3]
                r4.<init>(r5, r7)
            L34:
                r1[r3] = r4
                int r3 = r3 + 1
                goto L1a
            L39:
                int r6 = r0.length
                if (r7 >= r6) goto L4e
                r6 = r0[r7]
                boolean r6 = physicalSizeEquals(r6, r2)
                androidx.core.view.DisplayCompat$ModeCompat r3 = new androidx.core.view.DisplayCompat$ModeCompat
                r4 = r0[r7]
                r3.<init>(r4, r6)
                r1[r7] = r3
                int r7 = r7 + 1
                goto L39
            L4e:
                return r1
        }

        static boolean isCurrentModeTheLargestMode(android.view.Display r5) {
                android.view.Display$Mode r0 = r5.getMode()
                android.view.Display$Mode[] r5 = r5.getSupportedModes()
                r1 = 0
                r2 = r1
            La:
                int r3 = r5.length
                if (r2 >= r3) goto L2a
                int r3 = r0.getPhysicalHeight()
                r4 = r5[r2]
                int r4 = r4.getPhysicalHeight()
                if (r3 < r4) goto L29
                int r3 = r0.getPhysicalWidth()
                r4 = r5[r2]
                int r4 = r4.getPhysicalWidth()
                if (r3 >= r4) goto L26
                goto L29
            L26:
                int r2 = r2 + 1
                goto La
            L29:
                return r1
            L2a:
                r5 = 1
                return r5
        }

        static boolean physicalSizeEquals(android.view.Display.Mode r2, android.graphics.Point r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.x
                if (r0 != r1) goto L10
                int r0 = r2.getPhysicalHeight()
                int r1 = r3.y
                if (r0 == r1) goto L20
            L10:
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.y
                if (r0 != r1) goto L22
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.x
                if (r2 != r3) goto L22
            L20:
                r2 = 1
                goto L23
            L22:
                r2 = 0
            L23:
                return r2
        }

        static boolean physicalSizeEquals(android.view.Display.Mode r2, android.view.Display.Mode r3) {
                int r0 = r2.getPhysicalWidth()
                int r1 = r3.getPhysicalWidth()
                if (r0 != r1) goto L16
                int r2 = r2.getPhysicalHeight()
                int r3 = r3.getPhysicalHeight()
                if (r2 != r3) goto L16
                r2 = 1
                goto L17
            L16:
                r2 = 0
            L17:
                return r2
        }
    }

    public static final class ModeCompat {
        private final boolean mIsNative;
        private final android.view.Display.Mode mMode;
        private final android.graphics.Point mPhysicalSize;

        ModeCompat(android.graphics.Point r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                r1.mPhysicalSize = r2
                r2 = 0
                r1.mMode = r2
                r2 = 1
                r1.mIsNative = r2
                return
        }

        ModeCompat(android.view.Display.Mode r2, android.graphics.Point r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "physicalSize == null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                r1.mPhysicalSize = r3
                r1.mMode = r2
                r2 = 1
                r1.mIsNative = r2
                return
        }

        ModeCompat(android.view.Display.Mode r4, boolean r5) {
                r3 = this;
                r3.<init>()
                java.lang.String r0 = "mode == null, can't wrap a null reference"
                androidx.core.util.Preconditions.checkNotNull(r4, r0)
                android.graphics.Point r0 = new android.graphics.Point
                int r1 = r4.getPhysicalWidth()
                int r2 = r4.getPhysicalHeight()
                r0.<init>(r1, r2)
                r3.mPhysicalSize = r0
                r3.mMode = r4
                r3.mIsNative = r5
                return
        }

        public int getPhysicalHeight() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.y
                return r0
        }

        public int getPhysicalWidth() {
                r1 = this;
                android.graphics.Point r0 = r1.mPhysicalSize
                int r0 = r0.x
                return r0
        }

        public boolean isNative() {
                r1 = this;
                boolean r0 = r1.mIsNative
                return r0
        }

        public android.view.Display.Mode toMode() {
                r1 = this;
                android.view.Display$Mode r0 = r1.mMode
                return r0
        }
    }

    private DisplayCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    static android.graphics.Point getCurrentDisplaySizeFromWorkarounds(android.content.Context r2, android.view.Display r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 >= r1) goto Ld
            java.lang.String r0 = "sys.display-size"
            android.graphics.Point r0 = parsePhysicalDisplaySizeFromSystemProperties(r0, r3)
            goto L13
        Ld:
            java.lang.String r0 = "vendor.display-size"
            android.graphics.Point r0 = parsePhysicalDisplaySizeFromSystemProperties(r0, r3)
        L13:
            if (r0 == 0) goto L16
            return r0
        L16:
            boolean r2 = isSonyBravia4kTv(r2)
            r0 = 0
            if (r2 == 0) goto L2c
            boolean r2 = isCurrentModeTheLargestMode(r3)
            if (r2 == 0) goto L2c
            android.graphics.Point r0 = new android.graphics.Point
            r2 = 3840(0xf00, float:5.381E-42)
            r3 = 2160(0x870, float:3.027E-42)
            r0.<init>(r2, r3)
        L2c:
            return r0
    }

    private static android.graphics.Point getDisplaySize(android.content.Context r0, android.view.Display r1) {
            android.graphics.Point r0 = getCurrentDisplaySizeFromWorkarounds(r0, r1)
            if (r0 == 0) goto L7
            return r0
        L7:
            android.graphics.Point r0 = new android.graphics.Point
            r0.<init>()
            androidx.core.view.DisplayCompat.Api17Impl.getRealSize(r1, r0)
            return r0
    }

    static androidx.core.view.DisplayCompat.ModeCompat getMode(android.content.Context r0, android.view.Display r1) {
            androidx.core.view.DisplayCompat$ModeCompat r0 = androidx.core.view.DisplayCompat.Api23Impl.getMode(r0, r1)
            return r0
    }

    public static androidx.core.view.DisplayCompat.ModeCompat[] getSupportedModes(android.content.Context r0, android.view.Display r1) {
            androidx.core.view.DisplayCompat$ModeCompat[] r0 = androidx.core.view.DisplayCompat.Api23Impl.getSupportedModes(r0, r1)
            return r0
    }

    private static java.lang.String getSystemProperty(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L1f
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L1f
            r2[r5] = r6     // Catch: java.lang.Exception -> L1f
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L1f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Exception -> L1f
            return r6
        L1f:
            r6 = 0
            return r6
    }

    static boolean isCurrentModeTheLargestMode(android.view.Display r0) {
            boolean r0 = androidx.core.view.DisplayCompat.Api23Impl.isCurrentModeTheLargestMode(r0)
            return r0
    }

    private static boolean isSonyBravia4kTv(android.content.Context r2) {
            boolean r0 = isTv(r2)
            if (r0 == 0) goto L28
            java.lang.String r0 = "Sony"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = "BRAVIA"
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L28
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            java.lang.String r0 = "com.sony.dtv.hardware.panel.qfhd"
            boolean r2 = r2.hasSystemFeature(r0)
            if (r2 == 0) goto L28
            r2 = 1
            goto L29
        L28:
            r2 = 0
        L29:
            return r2
    }

    private static boolean isTv(android.content.Context r1) {
            java.lang.String r0 = "uimode"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.app.UiModeManager r1 = (android.app.UiModeManager) r1
            if (r1 == 0) goto L13
            int r1 = r1.getCurrentModeType()
            r0 = 4
            if (r1 != r0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    private static android.graphics.Point parseDisplaySize(java.lang.String r2) throws java.lang.NumberFormatException {
            java.lang.String r2 = r2.trim()
            java.lang.String r0 = "x"
            r1 = -1
            java.lang.String[] r2 = r2.split(r0, r1)
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L27
            r0 = 0
            r0 = r2[r0]
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 1
            r2 = r2[r1]
            int r2 = java.lang.Integer.parseInt(r2)
            if (r0 <= 0) goto L27
            if (r2 <= 0) goto L27
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>(r0, r2)
            return r1
        L27:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            r2.<init>()
            throw r2
    }

    private static android.graphics.Point parsePhysicalDisplaySizeFromSystemProperties(java.lang.String r1, android.view.Display r2) {
            int r2 = r2.getDisplayId()
            r0 = 0
            if (r2 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = getSystemProperty(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L13
            return r0
        L13:
            android.graphics.Point r1 = parseDisplaySize(r1)     // Catch: java.lang.NumberFormatException -> L18
            return r1
        L18:
            return r0
    }
}
