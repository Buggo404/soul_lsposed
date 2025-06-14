package androidx.appcompat.widget;

/* loaded from: classes.dex */
public class TooltipCompat {
    private TooltipCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void setTooltipText(android.view.View r2, java.lang.CharSequence r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            r2.setTooltipText(r3)
            goto Ld
        La:
            androidx.appcompat.widget.TooltipCompatHandler.setTooltipText(r2, r3)
        Ld:
            return
    }
}
