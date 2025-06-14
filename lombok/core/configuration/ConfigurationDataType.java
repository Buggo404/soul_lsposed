package lombok.core.configuration;

/* loaded from: com.usidqw.qwerklj.apk:lombok/core/configuration/ConfigurationDataType.SCL.lombok */
public final class ConfigurationDataType {
    private static final java.util.Map<java.lang.Class<?>, lombok.core.configuration.ConfigurationValueParser> SIMPLE_TYPES = null;
    private final boolean isList;
    private final lombok.core.configuration.ConfigurationValueParser parser;








    static {
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r0
            r1.<init>()
            r5 = r0
            r0 = r5
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            lombok.core.configuration.ConfigurationDataType$1 r2 = new lombok.core.configuration.ConfigurationDataType$1
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            lombok.core.configuration.ConfigurationDataType$2 r2 = new lombok.core.configuration.ConfigurationDataType$2
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            lombok.core.configuration.ConfigurationDataType$3 r2 = new lombok.core.configuration.ConfigurationDataType$3
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            lombok.core.configuration.ConfigurationDataType$4 r2 = new lombok.core.configuration.ConfigurationDataType$4
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            lombok.core.configuration.ConfigurationDataType$5 r2 = new lombok.core.configuration.ConfigurationDataType$5
            r3 = r2
            r3.<init>()
            java.lang.Object r0 = r0.put(r1, r2)
            r0 = r5
            lombok.core.configuration.ConfigurationDataType.SIMPLE_TYPES = r0
            return
    }

    private static lombok.core.configuration.ConfigurationValueParser enumParser(java.lang.reflect.Type r5) {
            r0 = r5
            java.lang.Class r0 = (java.lang.Class) r0
            r6 = r0
            r0 = r6
            r7 = r0
            lombok.core.configuration.ConfigurationDataType$6 r0 = new lombok.core.configuration.ConfigurationDataType$6
            r1 = r0
            r2 = r7
            r3 = r6
            r1.<init>(r2, r3)
            return r0
    }

    private static lombok.core.configuration.ConfigurationValueParser valueTypeParser(java.lang.reflect.Type r7) {
            r0 = r7
            java.lang.Class r0 = (java.lang.Class) r0
            r8 = r0
            r0 = r8
            java.lang.String r1 = "valueOf"
            r2 = 1
            java.lang.Class[] r2 = new java.lang.Class[r2]
            r3 = r2
            r4 = 0
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r3[r4] = r5
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            r9 = r0
            r0 = r8
            java.lang.String r1 = "description"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            r10 = r0
            r0 = r8
            java.lang.String r1 = "exampleValue"
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.reflect.Method r0 = getMethod(r0, r1, r2)
            r11 = r0
            lombok.core.configuration.ConfigurationDataType$7 r0 = new lombok.core.configuration.ConfigurationDataType$7
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r11
            r1.<init>(r2, r3, r4)
            return r0
    }

    public static lombok.core.configuration.ConfigurationDataType toDataType(java.lang.Class<? extends lombok.core.configuration.ConfigurationKey<?>> r6) {
            r0 = r6
            java.lang.Class r0 = r0.getSuperclass()
            java.lang.Class<lombok.core.configuration.ConfigurationKey> r1 = lombok.core.configuration.ConfigurationKey.class
            if (r0 == r1) goto L24
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "No direct subclass of ConfigurationKey: "
            r3.<init>(r4)
            r3 = r6
            java.lang.String r3 = r3.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r6
            java.lang.reflect.Type r0 = r0.getGenericSuperclass()
            r7 = r0
            r0 = r7
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 != 0) goto L48
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Missing type parameter in "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
        L48:
            r0 = r7
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r8 = r0
            r0 = r8
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r9 = r0
            r0 = 0
            r10 = r0
            r0 = r9
            boolean r0 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L7f
            r0 = r9
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            r11 = r0
            r0 = r11
            java.lang.reflect.Type r0 = r0.getRawType()
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 != r1) goto L7f
            r0 = 1
            r10 = r0
            r0 = r11
            java.lang.reflect.Type[] r0 = r0.getActualTypeArguments()
            r1 = 0
            r0 = r0[r1]
            r9 = r0
        L7f:
            java.util.Map<java.lang.Class<?>, lombok.core.configuration.ConfigurationValueParser> r0 = lombok.core.configuration.ConfigurationDataType.SIMPLE_TYPES
            r1 = r9
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto La1
            lombok.core.configuration.ConfigurationDataType r0 = new lombok.core.configuration.ConfigurationDataType
            r1 = r0
            r2 = r10
            java.util.Map<java.lang.Class<?>, lombok.core.configuration.ConfigurationValueParser> r3 = lombok.core.configuration.ConfigurationDataType.SIMPLE_TYPES
            r4 = r9
            java.lang.Object r3 = r3.get(r4)
            lombok.core.configuration.ConfigurationValueParser r3 = (lombok.core.configuration.ConfigurationValueParser) r3
            r1.<init>(r2, r3)
            return r0
        La1:
            r0 = r9
            boolean r0 = isEnum(r0)
            if (r0 == 0) goto Lb6
            lombok.core.configuration.ConfigurationDataType r0 = new lombok.core.configuration.ConfigurationDataType
            r1 = r0
            r2 = r10
            r3 = r9
            lombok.core.configuration.ConfigurationValueParser r3 = enumParser(r3)
            r1.<init>(r2, r3)
            return r0
        Lb6:
            r0 = r9
            boolean r0 = isConfigurationValueType(r0)
            if (r0 == 0) goto Lcb
            lombok.core.configuration.ConfigurationDataType r0 = new lombok.core.configuration.ConfigurationDataType
            r1 = r0
            r2 = r10
            r3 = r9
            lombok.core.configuration.ConfigurationValueParser r3 = valueTypeParser(r3)
            r1.<init>(r2, r3)
            return r0
        Lcb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Unsupported type parameter in "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r0
    }

    private ConfigurationDataType(boolean r4, lombok.core.configuration.ConfigurationValueParser r5) {
            r3 = this;
            r0 = r3
            r0.<init>()
            r0 = r3
            r1 = r4
            r0.isList = r1
            r0 = r3
            r1 = r5
            r0.parser = r1
            return
    }

    public boolean isList() {
            r2 = this;
            r0 = r2
            boolean r0 = r0.isList
            return r0
    }

    lombok.core.configuration.ConfigurationValueParser getParser() {
            r2 = this;
            r0 = r2
            lombok.core.configuration.ConfigurationValueParser r0 = r0.parser
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            r0 = r4
            boolean r0 = r0.isList
            if (r0 == 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = r0
            java.lang.String r2 = "list of "
            r1.<init>(r2)
            r1 = r4
            lombok.core.configuration.ConfigurationValueParser r1 = r1.parser
            java.lang.String r1 = r1.description()
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L20:
            r0 = r4
            lombok.core.configuration.ConfigurationValueParser r0 = r0.parser
            java.lang.String r0 = r0.description()
            return r0
    }

    private static boolean isEnum(java.lang.reflect.Type r2) {
            r0 = r2
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L13
            r0 = r2
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r0.isEnum()
            if (r0 == 0) goto L13
            r0 = 1
            return r0
        L13:
            r0 = 0
            return r0
    }

    private static boolean isConfigurationValueType(java.lang.reflect.Type r3) {
            r0 = r3
            boolean r0 = r0 instanceof java.lang.Class
            if (r0 == 0) goto L15
            java.lang.Class<lombok.core.configuration.ConfigurationValueType> r0 = lombok.core.configuration.ConfigurationValueType.class
            r1 = r3
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    private static java.lang.reflect.Method getMethod(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) {
            r0 = r6
            r1 = r7
            r2 = r8
            java.lang.reflect.Method r0 = r0.getMethod(r1, r2)     // Catch: java.lang.NoSuchMethodException -> L7 java.lang.SecurityException -> L32
            return r0
        L7:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Method "
            r3.<init>(r4)
            r3 = r7
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " with parameters "
            java.lang.StringBuilder r2 = r2.append(r3)
            r3 = r8
            java.lang.String r3 = java.util.Arrays.toString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = " was not found."
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
        L32:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = r2
            java.lang.String r4 = "Cannot inspect methods of type "
            r3.<init>(r4)
            r3 = r6
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r3 = r9
            r1.<init>(r2, r3)
            throw r0
    }
}
