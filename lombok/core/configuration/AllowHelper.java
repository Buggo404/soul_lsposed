package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/AllowHelper.SCL.lombok */
public final class AllowHelper {
    private static final java.util.Collection<? extends lombok.core.configuration.ConfigurationKey<?>> ALLOWABLE = null;

    static {
            java.util.Set r0 = java.util.Collections.emptySet()
            lombok.core.configuration.AllowHelper.ALLOWABLE = r0
            return
    }

    private AllowHelper() {
            r2 = this;
            r0 = r2
            r0.<init>()
            return
    }

    public static boolean isAllowable(lombok.core.configuration.ConfigurationKey<?> r3) {
            java.util.Collection<? extends lombok.core.configuration.ConfigurationKey<?>> r0 = lombok.core.configuration.AllowHelper.ALLOWABLE
            r1 = r3
            boolean r0 = r0.contains(r1)
            return r0
    }
}
