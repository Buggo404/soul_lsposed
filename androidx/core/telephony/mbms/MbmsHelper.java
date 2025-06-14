package androidx.core.telephony.mbms;

/* loaded from: classes.dex */
public final class MbmsHelper {
    private MbmsHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.CharSequence getBestNameForService(android.content.Context r5, android.telephony.mbms.ServiceInfo r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            r2 = 0
            if (r0 >= r1) goto L8
            return r2
        L8:
            android.content.res.Resources r5 = r5.getResources()
            android.content.res.Configuration r5 = r5.getConfiguration()
            android.os.LocaleList r5 = r5.getLocales()
            java.util.Set r0 = r6.getNamedContentLocales()
            int r0 = r0.size()
            if (r0 != 0) goto L1f
            return r2
        L1f:
            java.lang.String[] r0 = new java.lang.String[r0]
            java.util.Set r1 = r6.getNamedContentLocales()
            java.util.Iterator r1 = r1.iterator()
            r3 = 0
        L2a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r1.next()
            java.util.Locale r4 = (java.util.Locale) r4
            java.lang.String r4 = r4.toLanguageTag()
            r0[r3] = r4
            int r3 = r3 + 1
            goto L2a
        L3f:
            java.util.Locale r5 = r5.getFirstMatch(r0)
            if (r5 != 0) goto L46
            goto L4a
        L46:
            java.lang.CharSequence r2 = r6.getNameForLocale(r5)
        L4a:
            return r2
    }
}
