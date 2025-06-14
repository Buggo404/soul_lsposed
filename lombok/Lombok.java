package lombok;

/* loaded from: classes.dex */
public class Lombok {
    public Lombok() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> T checkNotNull(T r0, java.lang.String r1) {
            if (r0 == 0) goto L3
            return r0
        L3:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
    }

    public static <T> T preventNullAnalysis(T r0) {
            return r0
    }

    public static java.lang.RuntimeException sneakyThrow(java.lang.Throwable r1) {
            if (r1 == 0) goto L9
            java.lang.Throwable r1 = sneakyThrow0(r1)
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            return r1
        L9:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "t"
            r1.<init>(r0)
            throw r1
    }

    private static <T extends java.lang.Throwable> T sneakyThrow0(java.lang.Throwable r0) throws java.lang.Throwable {
            throw r0
    }
}
