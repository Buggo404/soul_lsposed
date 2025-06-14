package androidx.core.content;

/* loaded from: classes.dex */
public final class ContentProviderCompat {
    private ContentProviderCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static android.content.Context requireContext(android.content.ContentProvider r1) {
            android.content.Context r1 = r1.getContext()
            if (r1 == 0) goto L7
            return r1
        L7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot find context from the provider."
            r1.<init>(r0)
            throw r1
    }
}
