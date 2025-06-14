package androidx.core.hardware.display;

/* loaded from: classes.dex */
public final class DisplayManagerCompat {
    public static final java.lang.String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private static final java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> sInstances = null;
    private final android.content.Context mContext;

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.hardware.display.DisplayManagerCompat.sInstances = r0
            return
    }

    private DisplayManagerCompat(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.mContext = r1
            return
    }

    public static androidx.core.hardware.display.DisplayManagerCompat getInstance(android.content.Context r2) {
            java.util.WeakHashMap<android.content.Context, androidx.core.hardware.display.DisplayManagerCompat> r0 = androidx.core.hardware.display.DisplayManagerCompat.sInstances
            monitor-enter(r0)
            java.lang.Object r1 = r0.get(r2)     // Catch: java.lang.Throwable -> L15
            androidx.core.hardware.display.DisplayManagerCompat r1 = (androidx.core.hardware.display.DisplayManagerCompat) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L13
            androidx.core.hardware.display.DisplayManagerCompat r1 = new androidx.core.hardware.display.DisplayManagerCompat     // Catch: java.lang.Throwable -> L15
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L15
            r0.put(r2, r1)     // Catch: java.lang.Throwable -> L15
        L13:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r1
        L15:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
    }

    public android.view.Display getDisplay(int r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display r3 = r0.getDisplay(r3)
            return r3
    }

    public android.view.Display[] getDisplays() {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r0 = r0.getDisplays()
            return r0
    }

    public android.view.Display[] getDisplays(java.lang.String r3) {
            r2 = this;
            android.content.Context r0 = r2.mContext
            java.lang.String r1 = "display"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.display.DisplayManager r0 = (android.hardware.display.DisplayManager) r0
            android.view.Display[] r3 = r0.getDisplays(r3)
            return r3
    }
}
