package lombok.core.configuration;

@lombok.core.configuration.ExampleValueString("[NullPointerException | IllegalArgumentException | Assertion | JDK | Guava]")
/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/NullCheckExceptionType.SCL.lombok */
public enum NullCheckExceptionType extends java.lang.Enum<lombok.core.configuration.NullCheckExceptionType> {
    public static final lombok.core.configuration.NullCheckExceptionType ILLEGAL_ARGUMENT_EXCEPTION = null;
    public static final lombok.core.configuration.NullCheckExceptionType NULL_POINTER_EXCEPTION = null;
    public static final lombok.core.configuration.NullCheckExceptionType ASSERTION = null;
    public static final lombok.core.configuration.NullCheckExceptionType JDK = null;
    public static final lombok.core.configuration.NullCheckExceptionType GUAVA = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> METHOD_JDK = null;
    private static final lombok.core.LombokImmutableList<java.lang.String> METHOD_GUAVA = null;
    private static final /* synthetic */ lombok.core.configuration.NullCheckExceptionType[] ENUM$VALUES = null;






    static {
            lombok.core.configuration.NullCheckExceptionType$1 r0 = new lombok.core.configuration.NullCheckExceptionType$1
            r1 = r0
            java.lang.String r2 = "ILLEGAL_ARGUMENT_EXCEPTION"
            r3 = 0
            r1.<init>(r2, r3)
            lombok.core.configuration.NullCheckExceptionType.ILLEGAL_ARGUMENT_EXCEPTION = r0
            lombok.core.configuration.NullCheckExceptionType$2 r0 = new lombok.core.configuration.NullCheckExceptionType$2
            r1 = r0
            java.lang.String r2 = "NULL_POINTER_EXCEPTION"
            r3 = 1
            r1.<init>(r2, r3)
            lombok.core.configuration.NullCheckExceptionType.NULL_POINTER_EXCEPTION = r0
            lombok.core.configuration.NullCheckExceptionType$3 r0 = new lombok.core.configuration.NullCheckExceptionType$3
            r1 = r0
            java.lang.String r2 = "ASSERTION"
            r3 = 2
            r1.<init>(r2, r3)
            lombok.core.configuration.NullCheckExceptionType.ASSERTION = r0
            lombok.core.configuration.NullCheckExceptionType$4 r0 = new lombok.core.configuration.NullCheckExceptionType$4
            r1 = r0
            java.lang.String r2 = "JDK"
            r3 = 3
            r1.<init>(r2, r3)
            lombok.core.configuration.NullCheckExceptionType.JDK = r0
            lombok.core.configuration.NullCheckExceptionType$5 r0 = new lombok.core.configuration.NullCheckExceptionType$5
            r1 = r0
            java.lang.String r2 = "GUAVA"
            r3 = 4
            r1.<init>(r2, r3)
            lombok.core.configuration.NullCheckExceptionType.GUAVA = r0
            r0 = 5
            lombok.core.configuration.NullCheckExceptionType[] r0 = new lombok.core.configuration.NullCheckExceptionType[r0]
            r1 = r0
            r2 = 0
            lombok.core.configuration.NullCheckExceptionType r3 = lombok.core.configuration.NullCheckExceptionType.ILLEGAL_ARGUMENT_EXCEPTION
            r1[r2] = r3
            r1 = r0
            r2 = 1
            lombok.core.configuration.NullCheckExceptionType r3 = lombok.core.configuration.NullCheckExceptionType.NULL_POINTER_EXCEPTION
            r1[r2] = r3
            r1 = r0
            r2 = 2
            lombok.core.configuration.NullCheckExceptionType r3 = lombok.core.configuration.NullCheckExceptionType.ASSERTION
            r1[r2] = r3
            r1 = r0
            r2 = 3
            lombok.core.configuration.NullCheckExceptionType r3 = lombok.core.configuration.NullCheckExceptionType.JDK
            r1[r2] = r3
            r1 = r0
            r2 = 4
            lombok.core.configuration.NullCheckExceptionType r3 = lombok.core.configuration.NullCheckExceptionType.GUAVA
            r1[r2] = r3
            lombok.core.configuration.NullCheckExceptionType.ENUM$VALUES = r0
            java.lang.String r0 = "java"
            java.lang.String r1 = "util"
            java.lang.String r2 = "Objects"
            java.lang.String r3 = "requireNonNull"
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m63of(r0, r1, r2, r3)
            lombok.core.configuration.NullCheckExceptionType.METHOD_JDK = r0
            java.lang.String r0 = "com"
            java.lang.String r1 = "google"
            java.lang.String r2 = "common"
            java.lang.String r3 = "base"
            java.lang.String r4 = "Preconditions"
            java.lang.String r5 = "checkNotNull"
            r6 = 0
            java.lang.String[] r6 = new java.lang.String[r6]
            lombok.core.LombokImmutableList r0 = lombok.core.LombokImmutableList.m65of(r0, r1, r2, r3, r4, r5, r6)
            lombok.core.configuration.NullCheckExceptionType.METHOD_GUAVA = r0
            return
    }

    NullCheckExceptionType(java.lang.String r5, int r6) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    public java.lang.String toExceptionMessage(java.lang.String r5, java.lang.String r6) {
            r4 = this;
            r0 = r6
            if (r0 != 0) goto L18
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = " is marked non-null but is null"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L18:
            r0 = r6
            java.lang.String r1 = "%s"
            r2 = r5
            java.lang.String r0 = r0.replace(r1, r2)
            return r0
    }

    public abstract java.lang.String getExceptionType();

    public abstract lombok.core.LombokImmutableList<java.lang.String> getMethod();

    public static lombok.core.configuration.NullCheckExceptionType[] values() {
            lombok.core.configuration.NullCheckExceptionType[] r0 = lombok.core.configuration.NullCheckExceptionType.ENUM$VALUES
            r1 = r0
            r6 = r1
            r1 = 0
            r2 = r6
            int r2 = r2.length
            r3 = r2
            r7 = r3
            lombok.core.configuration.NullCheckExceptionType[] r2 = new lombok.core.configuration.NullCheckExceptionType[r2]
            r3 = r2
            r8 = r3
            r3 = 0
            r4 = r7
            java.lang.System.arraycopy(r0, r1, r2, r3, r4)
            r0 = r8
            return r0
    }

    public static lombok.core.configuration.NullCheckExceptionType valueOf(java.lang.String r3) {
            java.lang.Class<lombok.core.configuration.NullCheckExceptionType> r0 = lombok.core.configuration.NullCheckExceptionType.class
            r1 = r3
            java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
            lombok.core.configuration.NullCheckExceptionType r0 = (lombok.core.configuration.NullCheckExceptionType) r0
            return r0
    }

    /* synthetic */ NullCheckExceptionType(java.lang.String r5, int r6, lombok.core.configuration.NullCheckExceptionType r7) {
            r4 = this;
            r0 = r4
            r1 = r5
            r2 = r6
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ lombok.core.LombokImmutableList access$3() {
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.core.configuration.NullCheckExceptionType.METHOD_JDK
            return r0
    }

    static /* synthetic */ lombok.core.LombokImmutableList access$4() {
            lombok.core.LombokImmutableList<java.lang.String> r0 = lombok.core.configuration.NullCheckExceptionType.METHOD_GUAVA
            return r0
    }
}
