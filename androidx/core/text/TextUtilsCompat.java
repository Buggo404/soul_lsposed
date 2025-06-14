package androidx.core.text;

/* loaded from: classes.dex */
public final class TextUtilsCompat {
    private static final java.lang.String ARAB_SCRIPT_SUBTAG = "Arab";
    private static final java.lang.String HEBR_SCRIPT_SUBTAG = "Hebr";
    private static final java.util.Locale ROOT = null;

    static {
            java.util.Locale r0 = new java.util.Locale
            java.lang.String r1 = ""
            r0.<init>(r1, r1)
            androidx.core.text.TextUtilsCompat.ROOT = r0
            return
    }

    private TextUtilsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int getLayoutDirectionFromFirstChar(java.util.Locale r3) {
            java.lang.String r3 = r3.getDisplayName(r3)
            r0 = 0
            char r3 = r3.charAt(r0)
            byte r3 = java.lang.Character.getDirectionality(r3)
            r1 = 1
            if (r3 == r1) goto L14
            r2 = 2
            if (r3 == r2) goto L14
            return r0
        L14:
            return r1
    }

    public static int getLayoutDirectionFromLocale(java.util.Locale r0) {
            int r0 = android.text.TextUtils.getLayoutDirectionFromLocale(r0)
            return r0
    }

    public static java.lang.String htmlEncode(java.lang.String r0) {
            java.lang.String r0 = android.text.TextUtils.htmlEncode(r0)
            return r0
    }
}
