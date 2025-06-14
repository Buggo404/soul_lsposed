package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/LogDeclaration.SCL.lombok */
public final class LogDeclaration implements lombok.core.configuration.ConfigurationValueType {
    private static final java.util.regex.Pattern PARAMETERS_PATTERN = null;
    private static final java.util.regex.Pattern DECLARATION_PATTERN = null;
    private final lombok.core.configuration.TypeName loggerType;
    private final lombok.core.configuration.TypeName loggerFactoryType;
    private final lombok.core.configuration.IdentifierName loggerFactoryMethod;
    private final java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> parametersWithoutTopic;
    private final java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> parametersWithTopic;

    /* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/LogDeclaration$LogFactoryParameter.SCL.lombok */
    public enum LogFactoryParameter extends java.lang.Enum<lombok.core.configuration.LogDeclaration.LogFactoryParameter> {
        public static final lombok.core.configuration.LogDeclaration.LogFactoryParameter TYPE = null;
        public static final lombok.core.configuration.LogDeclaration.LogFactoryParameter NAME = null;
        public static final lombok.core.configuration.LogDeclaration.LogFactoryParameter TOPIC = null;
        public static final lombok.core.configuration.LogDeclaration.LogFactoryParameter NULL = null;
        private static final /* synthetic */ lombok.core.configuration.LogDeclaration.LogFactoryParameter[] ENUM$VALUES = null;

        static {
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = new lombok.core.configuration.LogDeclaration$LogFactoryParameter
                r1 = r0
                java.lang.String r2 = "TYPE"
                r3 = 0
                r1.<init>(r2, r3)
                lombok.core.configuration.LogDeclaration.LogFactoryParameter.TYPE = r0
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = new lombok.core.configuration.LogDeclaration$LogFactoryParameter
                r1 = r0
                java.lang.String r2 = "NAME"
                r3 = 1
                r1.<init>(r2, r3)
                lombok.core.configuration.LogDeclaration.LogFactoryParameter.NAME = r0
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = new lombok.core.configuration.LogDeclaration$LogFactoryParameter
                r1 = r0
                java.lang.String r2 = "TOPIC"
                r3 = 2
                r1.<init>(r2, r3)
                lombok.core.configuration.LogDeclaration.LogFactoryParameter.TOPIC = r0
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = new lombok.core.configuration.LogDeclaration$LogFactoryParameter
                r1 = r0
                java.lang.String r2 = "NULL"
                r3 = 3
                r1.<init>(r2, r3)
                lombok.core.configuration.LogDeclaration.LogFactoryParameter.NULL = r0
                r0 = 4
                lombok.core.configuration.LogDeclaration$LogFactoryParameter[] r0 = new lombok.core.configuration.LogDeclaration.LogFactoryParameter[r0]
                r1 = r0
                r2 = 0
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r3 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.TYPE
                r1[r2] = r3
                r1 = r0
                r2 = 1
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r3 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.NAME
                r1[r2] = r3
                r1 = r0
                r2 = 2
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r3 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.TOPIC
                r1[r2] = r3
                r1 = r0
                r2 = 3
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r3 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.NULL
                r1[r2] = r3
                lombok.core.configuration.LogDeclaration.LogFactoryParameter.ENUM$VALUES = r0
                return
        }

        LogFactoryParameter(java.lang.String r5, int r6) {
                r4 = this;
                r0 = r4
                r1 = r5
                r2 = r6
                r0.<init>(r1, r2)
                return
        }

        public static lombok.core.configuration.LogDeclaration.LogFactoryParameter[] values() {
                lombok.core.configuration.LogDeclaration$LogFactoryParameter[] r0 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.ENUM$VALUES
                r1 = r0
                r6 = r1
                r1 = 0
                r2 = r6
                int r2 = r2.length
                r3 = r2
                r7 = r3
                lombok.core.configuration.LogDeclaration$LogFactoryParameter[] r2 = new lombok.core.configuration.LogDeclaration.LogFactoryParameter[r2]
                r3 = r2
                r8 = r3
                r3 = 0
                r4 = r7
                java.lang.System.arraycopy(r0, r1, r2, r3, r4)
                r0 = r8
                return r0
        }

        public static lombok.core.configuration.LogDeclaration.LogFactoryParameter valueOf(java.lang.String r3) {
                java.lang.Class<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.class
                r1 = r3
                java.lang.Enum r0 = java.lang.Enum.valueOf(r0, r1)
                lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = (lombok.core.configuration.LogDeclaration.LogFactoryParameter) r0
                return r0
        }
    }

    static {
            java.lang.String r0 = "(?:\\(([A-Z,]*)\\))"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.LogDeclaration.PARAMETERS_PATTERN = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "^(?:([^ ]+) )?([^(]+)\\.([^(]+)("
            r1.<init>(r2)
            java.util.regex.Pattern r1 = lombok.core.configuration.LogDeclaration.PARAMETERS_PATTERN
            java.lang.String r1 = r1.pattern()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "+)$"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            lombok.core.configuration.LogDeclaration.DECLARATION_PATTERN = r0
            return
    }

    private LogDeclaration(lombok.core.configuration.TypeName r4, lombok.core.configuration.TypeName r5, lombok.core.configuration.IdentifierName r6, java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> r7, java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> r8) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.loggerType = r1
            r0 = r3
            r1 = r5
            r0.loggerFactoryType = r1
            r0 = r3
            r1 = r6
            r0.loggerFactoryMethod = r1
            r0 = r3
            r1 = r7
            r0.parametersWithoutTopic = r1
            r0 = r3
            r1 = r8
            r0.parametersWithTopic = r1
            return
    }

    public static lombok.core.configuration.LogDeclaration valueOf(java.lang.String r8) {
            r0 = r8
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.regex.Pattern r0 = lombok.core.configuration.LogDeclaration.DECLARATION_PATTERN
            r1 = r8
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r9 = r0
            r0 = r9
            boolean r0 = r0.matches()
            if (r0 != 0) goto L1f
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "The declaration must follow the pattern: [LoggerType ]LoggerFactoryType.loggerFactoryMethod(loggerFactoryMethodParams)[(loggerFactoryMethodParams)]"
            r1.<init>(r2)
            throw r0
        L1f:
            r0 = r9
            r1 = 2
            java.lang.String r0 = r0.group(r1)
            lombok.core.configuration.TypeName r0 = lombok.core.configuration.TypeName.valueOf(r0)
            r10 = r0
            r0 = r9
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            lombok.core.configuration.TypeName r0 = lombok.core.configuration.TypeName.valueOf(r0)
            r11 = r0
            r0 = r11
            if (r0 != 0) goto L37
            r0 = r10
            r11 = r0
        L37:
            r0 = r9
            r1 = 3
            java.lang.String r0 = r0.group(r1)
            lombok.core.configuration.IdentifierName r0 = lombok.core.configuration.IdentifierName.valueOf(r0)
            r12 = r0
            r0 = r9
            r1 = 4
            java.lang.String r0 = r0.group(r1)
            java.util.List r0 = parseParameters(r0)
            r13 = r0
            r0 = 0
            r14 = r0
            r0 = 0
            r15 = r0
            r0 = r13
            java.util.Iterator r0 = r0.iterator()
            r17 = r0
            goto Ld1
        L5d:
            r0 = r17
            java.lang.Object r0 = r0.next()
            java.util.List r0 = (java.util.List) r0
            r16 = r0
            r0 = r16
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.TOPIC
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto La5
            r0 = r15
            if (r0 == 0) goto L9e
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "There is more than one parameter definition that includes TOPIC: "
            r3.<init>(r4)
            r3 = r15
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r16
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L9e:
            r0 = r16
            r15 = r0
            goto Ld1
        La5:
            r0 = r14
            if (r0 == 0) goto Lcd
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "There is more than one parmaeter definition that does not include TOPIC: "
            r3.<init>(r4)
            r3 = r14
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " and "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r16
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        Lcd:
            r0 = r16
            r14 = r0
        Ld1:
            r0 = r17
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L5d
            r0 = r14
            if (r0 != 0) goto Lef
            r0 = r15
            if (r0 != 0) goto Lef
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.String r2 = "No logger factory method parameters specified."
            r1.<init>(r2)
            throw r0
        Lef:
            lombok.core.configuration.LogDeclaration r0 = new lombok.core.configuration.LogDeclaration
            r1 = r0
            r2 = r11
            r3 = r10
            r4 = r12
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6)
            return r0
    }

    private static java.util.List<java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter>> parseParameters(java.lang.String r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r4 = r0
            java.util.regex.Pattern r0 = lombok.core.configuration.LogDeclaration.PARAMETERS_PATTERN
            r1 = r3
            java.util.regex.Matcher r0 = r0.matcher(r1)
            r5 = r0
            goto L62
        L13:
            r0 = r5
            r1 = 1
            java.lang.String r0 = r0.group(r1)
            r6 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = r0
            r1.<init>()
            r7 = r0
            r0 = r6
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L59
            r0 = r6
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            r1 = r0
            r11 = r1
            int r0 = r0.length
            r10 = r0
            r0 = 0
            r9 = r0
            goto L52
        L3b:
            r0 = r11
            r1 = r9
            r0 = r0[r1]
            r8 = r0
            r0 = r7
            r1 = r8
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r1 = lombok.core.configuration.LogDeclaration.LogFactoryParameter.valueOf(r1)
            boolean r0 = r0.add(r1)
            int r9 = r9 + 1
        L52:
            r0 = r9
            r1 = r10
            if (r0 < r1) goto L3b
        L59:
            r0 = r4
            r1 = r7
            boolean r0 = r0.add(r1)
        L62:
            r0 = r5
            boolean r0 = r0.find()
            if (r0 != 0) goto L13
            r0 = r4
            return r0
    }

    public static java.lang.String description() {
            java.lang.String r0 = "custom-log-declaration"
            return r0
    }

    public static java.lang.String exampleValue() {
            java.lang.String r0 = "my.cool.Logger my.cool.LoggerFactory.createLogger()(TOPIC,TYPE)"
            return r0
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = r4
            boolean r0 = r0 instanceof lombok.core.configuration.LogDeclaration
            if (r0 != 0) goto L9
            r0 = 0
            return r0
        L9:
            r0 = r3
            lombok.core.configuration.TypeName r0 = r0.loggerType
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            lombok.core.configuration.TypeName r1 = r1.loggerType
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            r0 = r3
            lombok.core.configuration.TypeName r0 = r0.loggerFactoryType
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            lombok.core.configuration.TypeName r1 = r1.loggerFactoryType
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            r0 = r3
            lombok.core.configuration.IdentifierName r0 = r0.loggerFactoryMethod
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            lombok.core.configuration.IdentifierName r1 = r1.loggerFactoryMethod
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4a
            r0 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithoutTopic
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithoutTopic
            if (r0 == r1) goto L80
        L4a:
            r0 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithoutTopic
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithoutTopic
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L6b
            r0 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithTopic
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithTopic
            if (r0 == r1) goto L80
        L6b:
            r0 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithTopic
            r1 = r4
            lombok.core.configuration.LogDeclaration r1 = (lombok.core.configuration.LogDeclaration) r1
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithTopic
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L80
            r0 = 0
            return r0
        L80:
            r0 = 1
            return r0
    }

    public int hashCode() {
            r3 = this;
            r0 = 1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            lombok.core.configuration.TypeName r1 = r1.loggerType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            lombok.core.configuration.TypeName r1 = r1.loggerFactoryType
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            lombok.core.configuration.IdentifierName r1 = r1.loggerFactoryMethod
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithTopic
            if (r1 != 0) goto L38
            r1 = 0
            goto L41
        L38:
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithTopic
            int r1 = r1.hashCode()
        L41:
            int r0 = r0 + r1
            r4 = r0
            r0 = 31
            r1 = r4
            int r0 = r0 * r1
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithoutTopic
            if (r1 != 0) goto L52
            r1 = 0
            goto L5b
        L52:
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithoutTopic
            int r1 = r1.hashCode()
        L5b:
            int r0 = r0 + r1
            r4 = r0
            r0 = r4
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            r1.<init>()
            r4 = r0
            r0 = r4
            r1 = r3
            lombok.core.configuration.TypeName r1 = r1.loggerType
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r1 = " "
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            lombok.core.configuration.TypeName r1 = r1.loggerFactoryType
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            java.lang.String r1 = "."
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            lombok.core.configuration.IdentifierName r1 = r1.loggerFactoryMethod
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = r4
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithoutTopic
            appendParams(r0, r1)
            r0 = r4
            r1 = r3
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r1 = r1.parametersWithTopic
            appendParams(r0, r1)
            r0 = r4
            java.lang.String r0 = r0.toString()
            return r0
    }

    private static void appendParams(java.lang.StringBuilder r3, java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> r4) {
            r0 = r4
            if (r0 == 0) goto L47
            r0 = r3
            java.lang.String r1 = "("
            java.lang.StringBuilder r0 = r0.append(r1)
            r0 = 1
            r5 = r0
            r0 = r4
            java.util.Iterator r0 = r0.iterator()
            r7 = r0
            goto L36
        L18:
            r0 = r7
            java.lang.Object r0 = r0.next()
            lombok.core.configuration.LogDeclaration$LogFactoryParameter r0 = (lombok.core.configuration.LogDeclaration.LogFactoryParameter) r0
            r6 = r0
            r0 = r5
            if (r0 != 0) goto L2e
            r0 = r3
            java.lang.String r1 = ","
            java.lang.StringBuilder r0 = r0.append(r1)
        L2e:
            r0 = 0
            r5 = r0
            r0 = r3
            r1 = r6
            java.lang.StringBuilder r0 = r0.append(r1)
        L36:
            r0 = r7
            boolean r0 = r0.hasNext()
            if (r0 != 0) goto L18
            r0 = r3
            java.lang.String r1 = ")"
            java.lang.StringBuilder r0 = r0.append(r1)
        L47:
            return
    }

    public lombok.core.configuration.TypeName getLoggerType() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.TypeName r0 = r0.loggerType
            return r0
    }

    public lombok.core.configuration.TypeName getLoggerFactoryType() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.TypeName r0 = r0.loggerFactoryType
            return r0
    }

    public lombok.core.configuration.IdentifierName getLoggerFactoryMethod() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.IdentifierName r0 = r0.loggerFactoryMethod
            return r0
    }

    public java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> getParametersWithoutTopic() {
            r2 = this;
            r0 = r2
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithoutTopic
            return r0
    }

    public java.util.List<lombok.core.configuration.LogDeclaration.LogFactoryParameter> getParametersWithTopic() {
            r2 = this;
            r0 = r2
            java.util.List<lombok.core.configuration.LogDeclaration$LogFactoryParameter> r0 = r0.parametersWithTopic
            return r0
    }
}
