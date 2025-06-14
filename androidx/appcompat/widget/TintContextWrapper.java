package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class TintContextWrapper extends android.content.ContextWrapper {
    private static final java.lang.Object CACHE_LOCK = null;
    private static java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> sCache;
    private final android.content.res.Resources mResources;
    private final android.content.res.Resources.Theme mTheme;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK = r0
            return
    }

    private TintContextWrapper(android.content.Context r3) {
            r2 = this;
            r2.<init>(r3)
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r0 == 0) goto L22
            androidx.appcompat.widget.VectorEnabledTintResources r0 = new androidx.appcompat.widget.VectorEnabledTintResources
            android.content.res.Resources r1 = r3.getResources()
            r0.<init>(r2, r1)
            r2.mResources = r0
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.mTheme = r0
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r0.setTo(r3)
            goto L30
        L22:
            androidx.appcompat.widget.TintResources r0 = new androidx.appcompat.widget.TintResources
            android.content.res.Resources r3 = r3.getResources()
            r0.<init>(r2, r3)
            r2.mResources = r0
            r3 = 0
            r2.mTheme = r3
        L30:
            return
    }

    private static boolean shouldWrap(android.content.Context r2) {
            boolean r0 = r2 instanceof androidx.appcompat.widget.TintContextWrapper
            r1 = 0
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            boolean r0 = r0 instanceof androidx.appcompat.widget.TintResources
            if (r0 != 0) goto L1d
            android.content.res.Resources r2 = r2.getResources()
            boolean r2 = r2 instanceof androidx.appcompat.widget.VectorEnabledTintResources
            if (r2 == 0) goto L16
            goto L1d
        L16:
            boolean r2 = androidx.appcompat.widget.VectorEnabledTintResources.shouldBeUsed()
            if (r2 == 0) goto L1d
            r1 = 1
        L1d:
            return r1
    }

    public static android.content.Context wrap(android.content.Context r4) {
            boolean r0 = shouldWrap(r4)
            if (r0 == 0) goto L72
            java.lang.Object r0 = androidx.appcompat.widget.TintContextWrapper.CACHE_LOCK
            monitor-enter(r0)
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            if (r1 != 0) goto L15
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6f
            r1.<init>()     // Catch: java.lang.Throwable -> L6f
            androidx.appcompat.widget.TintContextWrapper.sCache = r1     // Catch: java.lang.Throwable -> L6f
            goto L5e
        L15:
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 + (-1)
        L1b:
            if (r1 < 0) goto L35
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L6f
            if (r2 != 0) goto L32
        L2d:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            r2.remove(r1)     // Catch: java.lang.Throwable -> L6f
        L32:
            int r1 = r1 + (-1)
            goto L1b
        L35:
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r1 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L6f
            int r1 = r1 + (-1)
        L3d:
            if (r1 < 0) goto L5e
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r2 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r2 = r2.get(r1)     // Catch: java.lang.Throwable -> L6f
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2     // Catch: java.lang.Throwable -> L6f
            if (r2 == 0) goto L50
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L6f
            androidx.appcompat.widget.TintContextWrapper r2 = (androidx.appcompat.widget.TintContextWrapper) r2     // Catch: java.lang.Throwable -> L6f
            goto L51
        L50:
            r2 = 0
        L51:
            if (r2 == 0) goto L5b
            android.content.Context r3 = r2.getBaseContext()     // Catch: java.lang.Throwable -> L6f
            if (r3 != r4) goto L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return r2
        L5b:
            int r1 = r1 + (-1)
            goto L3d
        L5e:
            androidx.appcompat.widget.TintContextWrapper r1 = new androidx.appcompat.widget.TintContextWrapper     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L6f
            java.util.ArrayList<java.lang.ref.WeakReference<androidx.appcompat.widget.TintContextWrapper>> r4 = androidx.appcompat.widget.TintContextWrapper.sCache     // Catch: java.lang.Throwable -> L6f
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L6f
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r4.add(r2)     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            return r1
        L6f:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6f
            throw r4
        L72:
            return r4
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
            r1 = this;
            android.content.res.Resources r0 = r1.mResources
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.mTheme
            if (r0 != 0) goto L8
            android.content.res.Resources$Theme r0 = super.getTheme()
        L8:
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int r3) {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.mTheme
            if (r0 != 0) goto L8
            super.setTheme(r3)
            goto Lc
        L8:
            r1 = 1
            r0.applyStyle(r3, r1)
        Lc:
            return
    }
}
