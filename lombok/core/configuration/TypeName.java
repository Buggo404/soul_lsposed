package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/TypeName.SCL.lombok */
public final class TypeName implements lombok.core.configuration.ConfigurationValueType {
    private final java.lang.String name;

    private TypeName(java.lang.String r4) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.name = r1
            return
    }

    public static lombok.core.configuration.TypeName valueOf(java.lang.String r6) {
            r0 = r6
            if (r0 == 0) goto Le
            r0 = r6
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L10
        Le:
            r0 = 0
            return r0
        L10:
            r0 = r6
            java.lang.String r0 = r0.trim()
            r7 = r0
            r0 = r7
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L5b
        L26:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r8
            boolean r0 = lombok.core.JavaIdentifiers.isValidJavaIdentifier(r0)
            if (r0 != 0) goto L58
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Invalid type name "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " (part "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = ")"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L58:
            int r9 = r9 + 1
        L5b:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L26
            lombok.core.configuration.TypeName r0 = new lombok.core.configuration.TypeName
            r1 = r0
            r2 = r7
            r1.<init>(r2)
            return r0
    }

    public static java.lang.String description() {
            java.lang.String r0 = "type-name"
            return r0
    }

    public static java.lang.String exampleValue() {
            java.lang.String r0 = "<fully.qualified.Type>"
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.core.configuration.TypeName
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            java.lang.String r0 = r0.name
            r1 = r4
            lombok.core.configuration.TypeName r1 = (lombok.core.configuration.TypeName) r1
            java.lang.String r1 = r1.name
            boolean r0 = r0.equals(r1)
            return r0
    }

    public int hashCode() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public java.lang.String getName() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            return r0
    }

    public char[] getCharArray() {
            r2 = this;
            r0 = r2
            java.lang.String r0 = r0.name
            char[] r0 = r0.toCharArray()
            return r0
    }
}
