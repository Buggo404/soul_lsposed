package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class VectorEnabledTintResources extends android.content.res.Resources {
    public static final int MAX_SDK_WHERE_REQUIRED = 20;
    private static boolean sCompatVectorFromResourcesEnabled = false;
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    static {
            return
    }

    public VectorEnabledTintResources(android.content.Context r3, android.content.res.Resources r4) {
            r2 = this;
            android.content.res.AssetManager r0 = r4.getAssets()
            android.util.DisplayMetrics r1 = r4.getDisplayMetrics()
            android.content.res.Configuration r4 = r4.getConfiguration()
            r2.<init>(r0, r1, r4)
            java.lang.ref.WeakReference r4 = new java.lang.ref.WeakReference
            r4.<init>(r3)
            r2.mContextRef = r4
            return
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
            boolean r0 = androidx.appcompat.widget.VectorEnabledTintResources.sCompatVectorFromResourcesEnabled
            return r0
    }

    public static void setCompatVectorFromResourcesEnabled(boolean r0) {
            androidx.appcompat.widget.VectorEnabledTintResources.sCompatVectorFromResourcesEnabled = r0
            return
    }

    public static boolean shouldBeUsed() {
            isCompatVectorFromResourcesEnabled()
            r0 = 0
            return r0
    }

    @Override // android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int r3) throws android.content.res.Resources.NotFoundException {
            r2 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r2.mContextRef
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 == 0) goto L13
            androidx.appcompat.widget.ResourceManagerInternal r1 = androidx.appcompat.widget.ResourceManagerInternal.get()
            android.graphics.drawable.Drawable r3 = r1.onDrawableLoadedFromResources(r0, r2, r3)
            return r3
        L13:
            android.graphics.drawable.Drawable r3 = super.getDrawable(r3)
            return r3
    }

    final android.graphics.drawable.Drawable superGetDrawable(int r1) {
            r0 = this;
            android.graphics.drawable.Drawable r1 = super.getDrawable(r1)
            return r1
    }
}
