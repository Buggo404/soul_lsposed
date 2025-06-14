package androidx.core.widget;

/* loaded from: classes.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    private CompoundButtonCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton r0) {
            android.graphics.drawable.Drawable r0 = r0.getButtonDrawable()
            return r0
    }

    public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton r0) {
            android.content.res.ColorStateList r0 = r0.getButtonTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getButtonTintMode()
            return r0
    }

    public static void setButtonTintList(android.widget.CompoundButton r0, android.content.res.ColorStateList r1) {
            r0.setButtonTintList(r1)
            return
    }

    public static void setButtonTintMode(android.widget.CompoundButton r0, android.graphics.PorterDuff.Mode r1) {
            r0.setButtonTintMode(r1)
            return
    }
}
