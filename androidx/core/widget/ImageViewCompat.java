package androidx.core.widget;

/* loaded from: classes.dex */
public class ImageViewCompat {
    private ImageViewCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView r0) {
            android.content.res.ColorStateList r0 = r0.getImageTintList()
            return r0
    }

    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView r0) {
            android.graphics.PorterDuff$Mode r0 = r0.getImageTintMode()
            return r0
    }

    public static void setImageTintList(android.widget.ImageView r0, android.content.res.ColorStateList r1) {
            r0.setImageTintList(r1)
            return
    }

    public static void setImageTintMode(android.widget.ImageView r0, android.graphics.PorterDuff.Mode r1) {
            r0.setImageTintMode(r1)
            return
    }
}
