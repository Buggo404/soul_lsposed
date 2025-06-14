package lombok.patcher;

/* loaded from: com.usidqw.qwerklj.apk:lombok/patcher/Filter.SCL.lombok */
public interface Filter {
    public static final lombok.patcher.Filter ALWAYS = null;


    static {
            lombok.patcher.Filter$1 r0 = new lombok.patcher.Filter$1
            r1 = r0
            r1.<init>()
            lombok.patcher.Filter.ALWAYS = r0
            return
    }

    boolean shouldTransform(java.lang.ClassLoader r1, java.lang.String r2, java.lang.Class<?> r3, java.security.ProtectionDomain r4, byte[] r5);
}
