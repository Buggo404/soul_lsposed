package androidx.core.os;

/* loaded from: classes.dex */
public class UserManagerCompat {
    private UserManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isUserUnlocked(android.content.Context r1) {
            java.lang.Class<android.os.UserManager> r0 = android.os.UserManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.os.UserManager r1 = (android.os.UserManager) r1
            boolean r1 = r1.isUserUnlocked()
            return r1
    }
}
