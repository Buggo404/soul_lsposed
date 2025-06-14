package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/CapitalizationStrategy.SCL.lombok */
public enum CapitalizationStrategy extends java.lang.Enum<lombok.core.configuration.CapitalizationStrategy> {
    public static final lombok.core.configuration.CapitalizationStrategy BASIC = null;
    public static final lombok.core.configuration.CapitalizationStrategy BEANSPEC = null;
    private static final /* synthetic */ lombok.core.configuration.CapitalizationStrategy[] ENUM$VALUES = null;



    static {
            lombok.core.configuration.CapitalizationStrategy$1 r0 = new lombok.core.configuration.CapitalizationStrategy$1
            r1 = r0
            java.lang.String r2 = "BASIC"
            r3 = 0
            r1.<init>(r2, r3)
            lombok.core.configuration.CapitalizationStrategy.BASIC = r0
            lombok.core.configuration.CapitalizationStrategy$2 r0 = new lombok.core.configuration.CapitalizationStrategy$2
            r1 = r0
            java.lang.String r2 = "BEANSPEC"
            r3 = 1
            r1.<init>(r2, r3)
            lombok.core.configuration.CapitalizationStrategy.BEANSPEC = r0
            r0 = 2
            lombok.core.configuration.CapitalizationStrategy[] r0 = new lombok.core.configuration.CapitalizationStrategy[r0]
            r1 = r0
            r2 = 0
            lombok.core.configuration.CapitalizationStrategy r3 = lombok.core.configuration.CapitalizationStrategy.BASIC
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.core.configuration.CapitalizationStrategy r3 = lombok.core.configuration.CapitalizationStrategy.BEANSPEC
            r1[r2] = r3
            lombok.core.configuration.CapitalizationStrategy.ENUM$VALUES = r0
            return
    }

    CapitalizationStrategy(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public static lombok.core.configuration.CapitalizationStrategy defaultValue() {
            lombok.core.configuration.CapitalizationStrategy r0 = lombok.core.configuration.CapitalizationStrategy.BASIC
            return r0
    }

    public abstract java.lang.String capitalize(java.lang.String r1);

    public static lombok.core.configuration.CapitalizationStrategy[] values() {
            lombok.core.configuration.CapitalizationStrategy[] r0 = lombok.core.configuration.CapitalizationStrategy.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.core.configuration.CapitalizationStrategy[] r2 = new lombok.core.configuration.CapitalizationStrategy[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.core.configuration.CapitalizationStrategy valueOf(java.lang.String r3) {
            java.lang.Class<lombok.core.configuration.CapitalizationStrategy> r0 = lombok.core.configuration.CapitalizationStrategy.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.core.configuration.CapitalizationStrategy r0 = (lombok.core.configuration.CapitalizationStrategy) r0
            return r0
    }

    /* synthetic */ CapitalizationStrategy(java.lang.String r5, int r6, lombok.core.configuration.CapitalizationStrategy r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }
}
