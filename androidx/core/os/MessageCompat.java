package androidx.core.os;

/* loaded from: classes.dex */
public final class MessageCompat {
    private static boolean sTryIsAsynchronous = true;
    private static boolean sTrySetAsynchronous = true;

    static {
            return
    }

    private MessageCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isAsynchronous(android.os.Message r0) {
            boolean r0 = r0.isAsynchronous()
            return r0
    }

    public static void setAsynchronous(android.os.Message r0, boolean r1) {
            r0.setAsynchronous(r1)
            return
    }
}
