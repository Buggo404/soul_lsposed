package androidx.core.graphics.drawable;

/* loaded from: classes.dex */
public final class DrawableCompat {
    private static final java.lang.String TAG = "DrawableCompat";
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    private DrawableCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void applyTheme(android.graphics.drawable.Drawable r0, android.content.res.Resources.Theme r1) {
            r0.applyTheme(r1)
            return
    }

    public static boolean canApplyTheme(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0.canApplyTheme()
            return r0
    }

    public static void clearColorFilter(android.graphics.drawable.Drawable r0) {
            r0.clearColorFilter()
            return
    }

    public static int getAlpha(android.graphics.drawable.Drawable r0) {
            int r0 = r0.getAlpha()
            return r0
    }

    public static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable r0) {
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    public static int getLayoutDirection(android.graphics.drawable.Drawable r0) {
            int r0 = r0.getLayoutDirection()
            return r0
    }

    public static void inflate(android.graphics.drawable.Drawable r0, android.content.res.Resources r1, org.xmlpull.v1.XmlPullParser r2, android.util.AttributeSet r3, android.content.res.Resources.Theme r4) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            r0.inflate(r1, r2, r3, r4)
            return
    }

    public static boolean isAutoMirrored(android.graphics.drawable.Drawable r0) {
            boolean r0 = r0.isAutoMirrored()
            return r0
    }

    @java.lang.Deprecated
    public static void jumpToCurrentState(android.graphics.drawable.Drawable r0) {
            r0.jumpToCurrentState()
            return
    }

    public static void setAutoMirrored(android.graphics.drawable.Drawable r0, boolean r1) {
            r0.setAutoMirrored(r1)
            return
    }

    public static void setHotspot(android.graphics.drawable.Drawable r0, float r1, float r2) {
            r0.setHotspot(r1, r2)
            return
    }

    public static void setHotspotBounds(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4) {
            r0.setHotspotBounds(r1, r2, r3, r4)
            return
    }

    public static boolean setLayoutDirection(android.graphics.drawable.Drawable r0, int r1) {
            boolean r0 = r0.setLayoutDirection(r1)
            return r0
    }

    public static void setTint(android.graphics.drawable.Drawable r0, int r1) {
            r0.setTint(r1)
            return
    }

    public static void setTintList(android.graphics.drawable.Drawable r0, android.content.res.ColorStateList r1) {
            r0.setTintList(r1)
            return
    }

    public static void setTintMode(android.graphics.drawable.Drawable r0, android.graphics.PorterDuff.Mode r1) {
            r0.setTintMode(r1)
            return
    }

    public static <T extends android.graphics.drawable.Drawable> T unwrap(android.graphics.drawable.Drawable r1) {
            boolean r0 = r1 instanceof androidx.core.graphics.drawable.WrappedDrawable
            if (r0 == 0) goto La
            androidx.core.graphics.drawable.WrappedDrawable r1 = (androidx.core.graphics.drawable.WrappedDrawable) r1
            android.graphics.drawable.Drawable r1 = r1.getWrappedDrawable()
        La:
            return r1
    }

    public static android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable r0) {
            return r0
    }
}
