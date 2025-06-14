package androidx.core.content;

/* loaded from: classes.dex */
public final class IntentCompat {
    public static final java.lang.String ACTION_CREATE_REMINDER = "android.intent.action.CREATE_REMINDER";
    public static final java.lang.String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
    public static final java.lang.String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
    public static final java.lang.String EXTRA_START_PLAYBACK = "android.intent.extra.START_PLAYBACK";
    public static final java.lang.String EXTRA_TIME = "android.intent.extra.TIME";

    private IntentCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Intent makeMainSelectorActivity(java.lang.String r0, java.lang.String r1) {
            android.content.Intent r0 = android.content.Intent.makeMainSelectorActivity(r0, r1)
            return r0
    }
}
