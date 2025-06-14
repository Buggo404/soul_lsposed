package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/CallSuperType.SCL.lombok */
public enum CallSuperType extends java.lang.Enum<lombok.core.configuration.CallSuperType> {
    public static final lombok.core.configuration.CallSuperType CALL = null;
    public static final lombok.core.configuration.CallSuperType SKIP = null;
    public static final lombok.core.configuration.CallSuperType WARN = null;
    private static final /* synthetic */ lombok.core.configuration.CallSuperType[] ENUM$VALUES = null;

    static {
            lombok.core.configuration.CallSuperType r0 = new lombok.core.configuration.CallSuperType
            r1 = r0
            java.lang.String r2 = "CALL"
            r3 = 0
            r1.<init>(r2, r3)
            lombok.core.configuration.CallSuperType.CALL = r0
            lombok.core.configuration.CallSuperType r0 = new lombok.core.configuration.CallSuperType
            r1 = r0
            java.lang.String r2 = "SKIP"
            r3 = 1
            r1.<init>(r2, r3)
            lombok.core.configuration.CallSuperType.SKIP = r0
            lombok.core.configuration.CallSuperType r0 = new lombok.core.configuration.CallSuperType
            r1 = r0
            java.lang.String r2 = "WARN"
            r3 = 2
            r1.<init>(r2, r3)
            lombok.core.configuration.CallSuperType.WARN = r0
            r0 = 3
            lombok.core.configuration.CallSuperType[] r0 = new lombok.core.configuration.CallSuperType[r0]
            r1 = r0
            r2 = 0
            lombok.core.configuration.CallSuperType r3 = lombok.core.configuration.CallSuperType.CALL
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.core.configuration.CallSuperType r3 = lombok.core.configuration.CallSuperType.SKIP
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.core.configuration.CallSuperType r3 = lombok.core.configuration.CallSuperType.WARN
            r1[r2] = r3
            lombok.core.configuration.CallSuperType.ENUM$VALUES = r0
            return
    }

    CallSuperType(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public static lombok.core.configuration.CallSuperType[] values() {
            lombok.core.configuration.CallSuperType[] r0 = lombok.core.configuration.CallSuperType.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.core.configuration.CallSuperType[] r2 = new lombok.core.configuration.CallSuperType[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.core.configuration.CallSuperType valueOf(java.lang.String r3) {
            java.lang.Class<lombok.core.configuration.CallSuperType> r0 = lombok.core.configuration.CallSuperType.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.core.configuration.CallSuperType r0 = (lombok.core.configuration.CallSuperType) r0
            return r0
    }
}
