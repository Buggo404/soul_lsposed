package androidx.core.util;

/* loaded from: classes.dex */
public class ObjectsCompat {
    private ObjectsCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean equals(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = java.util.Objects.equals(r0, r1)
            return r0
    }

    public static int hash(java.lang.Object... r0) {
            int r0 = java.util.Objects.hash(r0)
            return r0
    }

    public static int hashCode(java.lang.Object r0) {
            if (r0 == 0) goto L7
            int r0 = r0.hashCode()
            goto L8
        L7:
            r0 = 0
        L8:
            return r0
    }

    public static java.lang.String toString(java.lang.Object r0, java.lang.String r1) {
            if (r0 == 0) goto L6
            java.lang.String r1 = r0.toString()
        L6:
            return r1
    }
}
