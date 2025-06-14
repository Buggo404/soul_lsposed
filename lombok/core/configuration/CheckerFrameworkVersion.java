package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/CheckerFrameworkVersion.SCL.lombok */
public final class CheckerFrameworkVersion implements lombok.core.configuration.ConfigurationValueType {
    private final int version;
    private static final int DEFAULT = 3200;
    private static final int MAX_SUPPORTED = 4000;
    public static final java.lang.String NAME__SIDE_EFFECT_FREE = "org.checkerframework.dataflow.qual.SideEffectFree";
    public static final java.lang.String NAME__PURE = "org.checkerframework.dataflow.qual.Pure";
    public static final java.lang.String NAME__UNIQUE = "org.checkerframework.common.aliasing.qual.Unique";
    public static final java.lang.String NAME__RETURNS_RECEIVER = "org.checkerframework.common.returnsreceiver.qual.This";
    public static final java.lang.String NAME__CALLED = "org.checkerframework.checker.calledmethods.qual.CalledMethods";
    public static final lombok.core.configuration.CheckerFrameworkVersion NONE = null;
    private static final java.util.regex.Pattern VERSION = null;

    static {
            lombok.core.configuration.CheckerFrameworkVersion r0 = new lombok.core.configuration.CheckerFrameworkVersion
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            lombok.core.configuration.CheckerFrameworkVersion.NONE = r0
            java.lang.String r0 = "^(\\d+)(?:\\.(\\d+))?(?:\\.\\d+)*$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.CheckerFrameworkVersion.VERSION = r0
            return
    }

    private CheckerFrameworkVersion(int r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.version = r1
            return
    }

    public boolean generateSideEffectFree() {
            r2 = this;
            r0 = r2
            int r0 = r0.version
            if (r0 <= 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean generateUnique() {
            r3 = this;
            r0 = r3
            int r0 = r0.version
            r1 = 2899(0xb53, float:4.062E-42)
            if (r0 <= r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean generatePure() {
            r2 = this;
            r0 = r2
            int r0 = r0.version
            if (r0 <= 0) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public boolean generateReturnsReceiver() {
            r3 = this;
            r0 = r3
            int r0 = r0.version
            r1 = 3100(0xc1c, float:4.344E-42)
            if (r0 < r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean generateCalledMethods() {
            r3 = this;
            r0 = r3
            int r0 = r0.version
            r1 = 3100(0xc1c, float:4.344E-42)
            if (r0 < r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static lombok.core.configuration.CheckerFrameworkVersion valueOf(java.lang.String r6) {
            r0 = r6
            if (r0 == 0) goto L9
            r0 = r6
            java.lang.String r0 = r0.trim()
            r6 = r0
        L9:
            r0 = r6
            if (r0 == 0) goto L1f
            r0 = r6
            java.lang.String r1 = "false"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1f
            r0 = r6
            java.lang.String r1 = "0"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L28
        L1f:
            lombok.core.configuration.CheckerFrameworkVersion r0 = new lombok.core.configuration.CheckerFrameworkVersion
            r1 = r0
            r2 = 0
            r1.<init>(r2)
            return r0
        L28:
            r0 = r6
            java.lang.String r1 = "true"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L3c
            lombok.core.configuration.CheckerFrameworkVersion r0 = new lombok.core.configuration.CheckerFrameworkVersion
            r1 = r0
            r2 = 3200(0xc80, float:4.484E-42)
            r1.<init>(r2)
            return r0
        L3c:
            java.util.regex.Pattern r0 = lombok.core.configuration.CheckerFrameworkVersion.VERSION
            r1 = r6
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r7 = r0
            r0 = r7
            boolean r0 = r0.matches()
            if (r0 != 0) goto L55
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Expected 'true' or 'false' or a major/minor version, such as '2.9'"
            r1.<init>(r2)
            throw r0
        L55:
            r0 = r7
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            r8 = r0
            r0 = r7
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            if (r0 == 0) goto L7c
            r0 = r7
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L7c
            r0 = r7
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            int r0 = java.lang.Integer.parseInt(r0)
            goto L7d
        L7c:
            r0 = 0
        L7d:
            r9 = r0
            r0 = r9
            r1 = 999(0x3e7, float:1.4E-42)
            if (r0 <= r1) goto L8f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "Minor version must be between 0 and 999"
            r1.<init>(r2)
            throw r0
        L8f:
            r0 = r8
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0 * r1
            r1 = r9
            int r0 = r0 + r1
            r10 = r0
            r0 = r10
            r1 = 4000(0xfa0, float:5.605E-42)
            if (r0 <= r1) goto Le6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r2 = r10
            r3 = 1000(0x3e8, float:1.401E-42)
            int r2 = r2 / r3
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r1.<init>(r2)
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = r10
            r2 = 1000(0x3e8, float:1.401E-42)
            int r1 = r1 % r2
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            r11 = r0
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Lombok supports at most v"
            r3.<init>(r4)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = "; reduce the value of key 'checkerframework' to "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r11
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Le6:
            lombok.core.configuration.CheckerFrameworkVersion r0 = new lombok.core.configuration.CheckerFrameworkVersion
            r1 = r0
            r2 = r10
            r1.<init>(r2)
            return r0
    }

    public static java.lang.String description() {
            java.lang.String r0 = "checkerframework-version"
            return r0
    }

    public static java.lang.String exampleValue() {
            java.lang.String r0 = "4.0"
            r4 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "major.minor (example: 3.2 - and no higher than "
            r1.<init>(r2)
            r1 = r4
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ") or true or false"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.core.configuration.CheckerFrameworkVersion
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            int r0 = r0.version
            r1 = r4
            lombok.core.configuration.CheckerFrameworkVersion r1 = (lombok.core.configuration.CheckerFrameworkVersion) r1
            int r1 = r1.version
            if (r0 != r1) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            int r0 = r0.version
            return r0
    }
}
