package androidx.core.os;

/* loaded from: classes.dex */
public final class ConfigurationCompat {
    private ConfigurationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static androidx.core.os.LocaleListCompat getLocales(android.content.res.Configuration r0) {
            android.os.LocaleList r0 = r0.getLocales()
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.wrap(r0)
            return r0
    }
}
