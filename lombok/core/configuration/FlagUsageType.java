package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/FlagUsageType.SCL.lombok */
public enum FlagUsageType extends java.lang.Enum<lombok.core.configuration.FlagUsageType> {
    public static final lombok.core.configuration.FlagUsageType WARNING = null;
    public static final lombok.core.configuration.FlagUsageType ERROR = null;
    public static final lombok.core.configuration.FlagUsageType ALLOW = null;
    private static final /* synthetic */ lombok.core.configuration.FlagUsageType[] ENUM$VALUES = null;

    static {
            lombok.core.configuration.FlagUsageType r0 = new lombok.core.configuration.FlagUsageType
            r1 = r0
            java.lang.String r2 = "WARNING"
            r3 = 0
            r1.<init>(r2, r3)
            lombok.core.configuration.FlagUsageType.WARNING = r0
            lombok.core.configuration.FlagUsageType r0 = new lombok.core.configuration.FlagUsageType
            r1 = r0
            java.lang.String r2 = "ERROR"
            r3 = 1
            r1.<init>(r2, r3)
            lombok.core.configuration.FlagUsageType.ERROR = r0
            lombok.core.configuration.FlagUsageType r0 = new lombok.core.configuration.FlagUsageType
            r1 = r0
            java.lang.String r2 = "ALLOW"
            r3 = 2
            r1.<init>(r2, r3)
            lombok.core.configuration.FlagUsageType.ALLOW = r0
            r0 = 3
            lombok.core.configuration.FlagUsageType[] r0 = new lombok.core.configuration.FlagUsageType[r0]
            r1 = r0
            r2 = 0
            lombok.core.configuration.FlagUsageType r3 = lombok.core.configuration.FlagUsageType.WARNING
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.core.configuration.FlagUsageType r3 = lombok.core.configuration.FlagUsageType.ERROR
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.core.configuration.FlagUsageType r3 = lombok.core.configuration.FlagUsageType.ALLOW
            r1[r2] = r3
            lombok.core.configuration.FlagUsageType.ENUM$VALUES = r0
            return
    }

    FlagUsageType(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public static lombok.core.configuration.FlagUsageType[] values() {
            lombok.core.configuration.FlagUsageType[] r0 = lombok.core.configuration.FlagUsageType.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.core.configuration.FlagUsageType[] r2 = new lombok.core.configuration.FlagUsageType[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.core.configuration.FlagUsageType valueOf(java.lang.String r3) {
            java.lang.Class<lombok.core.configuration.FlagUsageType> r0 = lombok.core.configuration.FlagUsageType.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.core.configuration.FlagUsageType r0 = (lombok.core.configuration.FlagUsageType) r0
            return r0
    }
}
